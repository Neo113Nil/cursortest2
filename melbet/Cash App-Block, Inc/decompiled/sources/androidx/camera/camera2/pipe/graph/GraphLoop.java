package androidx.camera.camera2.pipe.graph;

import android.util.Log;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$onAttach$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class GraphLoop implements Closeable {
    public final AtomicBoolean _captureProcessingEnabled;
    public final Map _graphParameters;
    public Request _repeatingRequest;
    public TraceParser _requestProcessor;
    public final CameraGraphId cameraGraphId;
    public volatile boolean closed;
    public Map currentGraph3AParameters;
    public Map currentGraphParameters;
    public Request currentRepeatingRequest;
    public final List currentRequestListeners;
    public TraceParser currentRequestProcessor;
    public Map currentRequiredParameters;
    public final Map defaultParameters;
    public final ContextScope graphLoopScope;
    public final List listeners;
    public final Object lock;
    public final JWECryptoParts processingQueue;
    public final Map requiredParameters;
    public final CoroutineScope shutdownScope;

    public interface Listener {
        void onGraphShutdown();

        void onGraphStopped();

        void onStopRepeating();
    }

    public GraphLoop(CameraGraphId cameraGraphId, Map map, Map map2, ArrayList arrayList, List list, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher) {
        map.getClass();
        map2.getClass();
        coroutineScope.getClass();
        this.cameraGraphId = cameraGraphId;
        this.defaultParameters = map;
        this.requiredParameters = map2;
        this.listeners = list;
        this.shutdownScope = coroutineScope;
        ContextScope CoroutineScope = JobKt.CoroutineScope(coroutineDispatcher.plus(new CoroutineName("CXCP-GraphLoop")));
        this.graphLoopScope = CoroutineScope;
        int i = 0;
        GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = new GraphLoop$processingQueue$1(1, this, GraphLoop.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i, 0);
        WorkApplet$applet$1 workApplet$applet$1 = new WorkApplet$applet$1(2, this, GraphLoop.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, 1);
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = graphLoop$processingQueue$1;
        jWECryptoParts.encryptedKey = workApplet$applet$1;
        jWECryptoParts.iv = AtomicFU.atomic(false);
        Continuation continuation = null;
        jWECryptoParts.cipherText = PapaEvent.Channel$default(Integer.MAX_VALUE, null, new ObjectList$$ExternalSyntheticLambda0(jWECryptoParts, 6), 2);
        jWECryptoParts.authenticationTag = new ArrayDeque();
        if (!((AtomicBoolean) jWECryptoParts.iv).compareAndSet()) {
            a$$ExternalSyntheticBUOutline0.m$1("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (JobKt.launch$default(CoroutineScope, null, null, new ThumbNode$onAttach$1(jWECryptoParts, continuation, 9), 3).isCancelled()) {
            jWECryptoParts.releaseUnprocessedElements(null);
        }
        this.processingQueue = jWECryptoParts;
        this.lock = new Object();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this._graphParameters = emptyMap;
        this._captureProcessingEnabled = AtomicFU.atomic(true);
        this.currentGraphParameters = emptyMap;
        this.currentGraph3AParameters = emptyMap;
        this.currentRequiredParameters = map2;
        this.currentRequestListeners = arrayList;
    }

    public final void abortRequests(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Request request = (Request) arrayList.get(i);
            List list = this.currentRequestListeners;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Request.Listener) list.get(i2)).onAborted(request);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Request request2 = (Request) arrayList.get(i3);
            int size4 = request2.listeners.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((Request.Listener) request2.listeners.get(i4)).onAborted(request2);
            }
        }
    }

    public final boolean buildAndSubmit(Map map, boolean z, List list) {
        Map build;
        TraceParser traceParser = this.currentRequestProcessor;
        if (traceParser == null) {
            return false;
        }
        Map map2 = this.currentGraphParameters;
        if (map.isEmpty()) {
            build = this.currentRequiredParameters;
        } else {
            MapBuilder mapBuilder = new MapBuilder();
            Map map3 = this.currentGraph3AParameters;
            map3.getClass();
            mapBuilder.putAll(map3);
            mapBuilder.putAll(map);
            Map map4 = this.requiredParameters;
            map4.getClass();
            mapBuilder.putAll(map4);
            build = mapBuilder.build();
        }
        boolean submit$camera_camera2_pipe = traceParser.submit$camera_camera2_pipe(z, list, this.defaultParameters, map2, build, this.currentRequestListeners);
        if (!submit$camera_camera2_pipe) {
            if (z) {
                Log.w("CXCP", "Failed to repeat with " + CollectionsKt.single(list));
                return submit$camera_camera2_pipe;
            }
            if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return submit$camera_camera2_pipe;
            }
            Log.w("CXCP", "Failed to trigger with " + CollectionsKt.single(list) + " and " + map);
        }
        return submit$camera_camera2_pipe;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                TraceParser traceParser = this._requestProcessor;
                int i = 0;
                Continuation continuation = null;
                if (traceParser != null) {
                    JobKt.launch$default(this.shutdownScope, null, null, new GraphLoop$close$1$1$1(traceParser, continuation, i), 3);
                }
                this._requestProcessor = null;
                this.processingQueue.tryEmit(GraphCommand.Stop.INSTANCE$3);
                int size = this.listeners.size();
                while (i < size) {
                    ((Listener) this.listeners.get(i)).onGraphShutdown();
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Request getRepeatingRequest() {
        Request request;
        synchronized (this.lock) {
            request = this._repeatingRequest;
        }
        return request;
    }

    public final void processCapture(List list, int i, GraphCommand.Capture capture, boolean z) {
        if (this._captureProcessingEnabled.getValue()) {
            ArrayList arrayList = capture.requests;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            if (buildAndSubmit(emptyMap, false, arrayList)) {
                list.remove(i);
                return;
            }
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((GraphCommand) list.get(i2)) instanceof GraphCommand.Repeat) {
            processRepeat(i2, list, false);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        }
    }

    public final void processRepeat(int i, List list, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                GraphCommand graphCommand = (GraphCommand) list.get(i2);
                if (graphCommand instanceof GraphCommand.Capture) {
                    processCapture(list, i2, (GraphCommand.Capture) graphCommand, false);
                    return;
                } else {
                    if (graphCommand instanceof GraphCommand.Trigger) {
                        processTrigger(list, i2, (GraphCommand.Trigger) graphCommand);
                        return;
                    }
                    return;
                }
            }
            GraphCommand graphCommand2 = (GraphCommand) list.get(i3);
            if (graphCommand2 instanceof GraphCommand.Repeat) {
                Request request = ((GraphCommand.Repeat) graphCommand2).request;
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(request);
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                if (buildAndSubmit(emptyMap, true, listOf)) {
                    this.currentRepeatingRequest = request;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((GraphCommand) list.get(i4)) instanceof GraphCommand.Repeat) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cd -> B:28:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ec -> B:27:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00fb -> B:29:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processRequestProcessor(List list, int i, GraphCommand.RequestProcessor requestProcessor, Continuation continuation) {
        GraphLoop$processRequestProcessor$1 graphLoop$processRequestProcessor$1;
        int i2;
        int i3;
        GraphCommand.RequestProcessor requestProcessor2;
        Ref$IntRef ref$IntRef;
        GraphLoop$processRequestProcessor$1 graphLoop$processRequestProcessor$12;
        int i4;
        List list2;
        List list3;
        List list4;
        GraphCommand graphCommand;
        GraphCommand.RequestProcessor requestProcessor3;
        List list5;
        int i5;
        TraceParser traceParser;
        GraphCommand.RequestProcessor requestProcessor4;
        Ref$IntRef ref$IntRef2;
        List list6;
        GraphCommand graphCommand2;
        GraphCommand.RequestProcessor requestProcessor5;
        Ref$IntRef ref$IntRef3;
        boolean z;
        if (continuation instanceof GraphLoop$processRequestProcessor$1) {
            graphLoop$processRequestProcessor$1 = (GraphLoop$processRequestProcessor$1) continuation;
            int i6 = graphLoop$processRequestProcessor$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                graphLoop$processRequestProcessor$1.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj = graphLoop$processRequestProcessor$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = graphLoop$processRequestProcessor$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                    ref$IntRef4.element = 1;
                    list.remove(i);
                    i3 = i;
                    requestProcessor2 = requestProcessor;
                    ref$IntRef = ref$IntRef4;
                    graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                    i4 = 0;
                    list2 = list;
                    list3 = list2;
                    if (i4 >= i3) {
                    }
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    i3 = graphLoop$processRequestProcessor$1.I$1;
                    i5 = graphLoop$processRequestProcessor$1.I$0;
                    graphCommand2 = graphLoop$processRequestProcessor$1.L$4;
                    list6 = graphLoop$processRequestProcessor$1.L$3;
                    ref$IntRef2 = graphLoop$processRequestProcessor$1.L$2;
                    requestProcessor4 = graphLoop$processRequestProcessor$1.L$1;
                    list4 = graphLoop$processRequestProcessor$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    GraphCommand.RequestProcessor requestProcessor6 = requestProcessor4;
                    graphCommand = graphCommand2;
                    list5 = list6;
                    ref$IntRef = ref$IntRef2;
                    requestProcessor3 = requestProcessor6;
                    traceParser = ((GraphCommand.RequestProcessor) graphCommand).f0new;
                    if (traceParser != null) {
                    }
                    GraphCommand.RequestProcessor requestProcessor7 = requestProcessor3;
                    i4 = i5;
                    ref$IntRef.element++;
                    requestProcessor2 = requestProcessor7;
                    z = true;
                    list2 = list5;
                    graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                    list3 = list4;
                    if (z) {
                    }
                    if (i4 >= i3) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$IntRef3 = graphLoop$processRequestProcessor$1.L$2;
                    requestProcessor5 = graphLoop$processRequestProcessor$1.L$1;
                    list3 = graphLoop$processRequestProcessor$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$IntRef = ref$IntRef3;
                    requestProcessor2 = requestProcessor5;
                    this.currentRequestProcessor = requestProcessor2.f0new;
                    if (!reissueRepeatingRequest()) {
                        Request request = this.currentRepeatingRequest;
                        if (request != null) {
                            list3.add(0, new GraphCommand.Repeat(request));
                            if (ref$IntRef.element == 1) {
                                list3.add(GraphCommand.Stop.INSTANCE$2);
                            }
                        }
                        this.currentRepeatingRequest = null;
                    }
                    return Unit.INSTANCE;
                }
                i3 = graphLoop$processRequestProcessor$1.I$1;
                i5 = graphLoop$processRequestProcessor$1.I$0;
                list5 = graphLoop$processRequestProcessor$1.L$3;
                ref$IntRef = graphLoop$processRequestProcessor$1.L$2;
                requestProcessor3 = graphLoop$processRequestProcessor$1.L$1;
                List list7 = graphLoop$processRequestProcessor$1.L$0;
                SafeTrace.throwOnFailure(obj);
                list4 = list7;
                GraphCommand.RequestProcessor requestProcessor72 = requestProcessor3;
                i4 = i5;
                ref$IntRef.element++;
                requestProcessor2 = requestProcessor72;
                z = true;
                list2 = list5;
                graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                list3 = list4;
                if (z) {
                    list2.remove(i4);
                    i3--;
                } else {
                    i4++;
                }
                if (i4 >= i3) {
                    graphCommand = (GraphCommand) list2.get(i4);
                    if (graphCommand instanceof GraphCommand.RequestProcessor) {
                        GraphCommand.RequestProcessor requestProcessor8 = (GraphCommand.RequestProcessor) graphCommand;
                        TraceParser traceParser2 = requestProcessor8.old;
                        if (traceParser2 != null) {
                            graphLoop$processRequestProcessor$12.L$0 = list3;
                            graphLoop$processRequestProcessor$12.L$1 = requestProcessor2;
                            graphLoop$processRequestProcessor$12.L$2 = ref$IntRef;
                            graphLoop$processRequestProcessor$12.L$3 = list2;
                            graphLoop$processRequestProcessor$12.L$4 = requestProcessor8;
                            graphLoop$processRequestProcessor$12.I$0 = i4;
                            graphLoop$processRequestProcessor$12.I$1 = i3;
                            graphLoop$processRequestProcessor$12.label = 1;
                            if (traceParser2.shutdown$camera_camera2_pipe() != coroutineSingletons) {
                                list4 = list3;
                                graphLoop$processRequestProcessor$1 = graphLoop$processRequestProcessor$12;
                                graphCommand2 = graphCommand;
                                requestProcessor4 = requestProcessor2;
                                i5 = i4;
                                ref$IntRef2 = ref$IntRef;
                                list6 = list2;
                                GraphCommand.RequestProcessor requestProcessor62 = requestProcessor4;
                                graphCommand = graphCommand2;
                                list5 = list6;
                                ref$IntRef = ref$IntRef2;
                                requestProcessor3 = requestProcessor62;
                                traceParser = ((GraphCommand.RequestProcessor) graphCommand).f0new;
                                if (traceParser != null) {
                                    graphLoop$processRequestProcessor$1.L$0 = list4;
                                    graphLoop$processRequestProcessor$1.L$1 = requestProcessor3;
                                    graphLoop$processRequestProcessor$1.L$2 = ref$IntRef;
                                    graphLoop$processRequestProcessor$1.L$3 = list5;
                                    graphLoop$processRequestProcessor$1.L$4 = null;
                                    graphLoop$processRequestProcessor$1.I$0 = i5;
                                    graphLoop$processRequestProcessor$1.I$1 = i3;
                                    graphLoop$processRequestProcessor$1.label = 2;
                                    if (traceParser.shutdown$camera_camera2_pipe() != coroutineSingletons) {
                                        list7 = list4;
                                        list4 = list7;
                                    }
                                }
                                GraphCommand.RequestProcessor requestProcessor722 = requestProcessor3;
                                i4 = i5;
                                ref$IntRef.element++;
                                requestProcessor2 = requestProcessor722;
                                z = true;
                                list2 = list5;
                                graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                                list3 = list4;
                                if (z) {
                                }
                                if (i4 >= i3) {
                                }
                            }
                        } else {
                            int i7 = i4;
                            requestProcessor3 = requestProcessor2;
                            i5 = i7;
                            list4 = list3;
                            graphLoop$processRequestProcessor$1 = graphLoop$processRequestProcessor$12;
                            list5 = list2;
                            traceParser = ((GraphCommand.RequestProcessor) graphCommand).f0new;
                            if (traceParser != null) {
                            }
                            GraphCommand.RequestProcessor requestProcessor7222 = requestProcessor3;
                            i4 = i5;
                            ref$IntRef.element++;
                            requestProcessor2 = requestProcessor7222;
                            z = true;
                            list2 = list5;
                            graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                            list3 = list4;
                            if (z) {
                            }
                            if (i4 >= i3) {
                            }
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                        if (i4 >= i3) {
                            TraceParser traceParser3 = requestProcessor2.old;
                            if (traceParser3 != null) {
                                graphLoop$processRequestProcessor$12.L$0 = list3;
                                graphLoop$processRequestProcessor$12.L$1 = requestProcessor2;
                                graphLoop$processRequestProcessor$12.L$2 = ref$IntRef;
                                graphLoop$processRequestProcessor$12.L$3 = null;
                                graphLoop$processRequestProcessor$12.L$4 = null;
                                graphLoop$processRequestProcessor$12.label = 3;
                                if (traceParser3.shutdown$camera_camera2_pipe() != coroutineSingletons) {
                                    requestProcessor5 = requestProcessor2;
                                    ref$IntRef3 = ref$IntRef;
                                    ref$IntRef = ref$IntRef3;
                                    requestProcessor2 = requestProcessor5;
                                }
                            }
                            this.currentRequestProcessor = requestProcessor2.f0new;
                            if (!reissueRepeatingRequest()) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        graphLoop$processRequestProcessor$1 = new GraphLoop$processRequestProcessor$1(this, continuation);
        Object obj2 = graphLoop$processRequestProcessor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = graphLoop$processRequestProcessor$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        if (r13.shutdown$camera_camera2_pipe() == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0090, code lost:
    
        if (r13.shutdown$camera_camera2_pipe() == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a8 -> B:13:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d0 -> B:12:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e3 -> B:12:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processShutdown(List list, Continuation continuation) {
        GraphLoop$processShutdown$1 graphLoop$processShutdown$1;
        int i;
        int i2;
        List list2;
        int size;
        GraphCommand graphCommand;
        int i3;
        List list3;
        TraceParser traceParser;
        GraphCommand graphCommand2;
        if (continuation instanceof GraphLoop$processShutdown$1) {
            graphLoop$processShutdown$1 = (GraphLoop$processShutdown$1) continuation;
            int i4 = graphLoop$processShutdown$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                graphLoop$processShutdown$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = graphLoop$processShutdown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphLoop$processShutdown$1.label;
                i2 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.currentRepeatingRequest = null;
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    this.currentGraphParameters = emptyMap;
                    this.currentGraph3AParameters = emptyMap;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        GraphCommand graphCommand3 = (GraphCommand) list.get(i5);
                        if (graphCommand3 instanceof GraphCommand.Capture) {
                            abortRequests(((GraphCommand.Capture) graphCommand3).requests);
                        }
                    }
                    TraceParser traceParser2 = this.currentRequestProcessor;
                    if (traceParser2 != null) {
                        graphLoop$processShutdown$1.L$0 = list;
                        graphLoop$processShutdown$1.label = 1;
                    }
                } else if (i == 1) {
                    list = graphLoop$processShutdown$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    size = graphLoop$processShutdown$1.I$1;
                    i3 = graphLoop$processShutdown$1.I$0;
                    graphCommand2 = graphLoop$processShutdown$1.L$1;
                    list2 = graphLoop$processShutdown$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    graphCommand = graphCommand2;
                    list3 = list2;
                    traceParser = ((GraphCommand.RequestProcessor) graphCommand).f0new;
                    if (traceParser != null) {
                    }
                    list2 = list3;
                    i2 = i3;
                    i2++;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    size = graphLoop$processShutdown$1.I$1;
                    i3 = graphLoop$processShutdown$1.I$0;
                    list3 = graphLoop$processShutdown$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list2 = list3;
                    i2 = i3;
                    i2++;
                    if (i2 < size) {
                        graphCommand = (GraphCommand) list2.get(i2);
                        if (graphCommand instanceof GraphCommand.RequestProcessor) {
                            GraphCommand.RequestProcessor requestProcessor = (GraphCommand.RequestProcessor) graphCommand;
                            TraceParser traceParser3 = requestProcessor.old;
                            if (traceParser3 != null) {
                                graphLoop$processShutdown$1.L$0 = list2;
                                graphLoop$processShutdown$1.L$1 = requestProcessor;
                                graphLoop$processShutdown$1.I$0 = i2;
                                graphLoop$processShutdown$1.I$1 = size;
                                graphLoop$processShutdown$1.label = 2;
                                if (traceParser3.shutdown$camera_camera2_pipe() != coroutineSingletons) {
                                    i3 = i2;
                                    graphCommand2 = graphCommand;
                                    graphCommand = graphCommand2;
                                    list3 = list2;
                                    traceParser = ((GraphCommand.RequestProcessor) graphCommand).f0new;
                                    if (traceParser != null) {
                                        graphLoop$processShutdown$1.L$0 = list3;
                                        graphLoop$processShutdown$1.L$1 = null;
                                        graphLoop$processShutdown$1.I$0 = i3;
                                        graphLoop$processShutdown$1.I$1 = size;
                                        graphLoop$processShutdown$1.label = 3;
                                    }
                                    list2 = list3;
                                    i2 = i3;
                                }
                                return coroutineSingletons;
                            }
                            i3 = i2;
                            list3 = list2;
                            traceParser = ((GraphCommand.RequestProcessor) graphCommand).f0new;
                            if (traceParser != null) {
                            }
                            list2 = list3;
                            i2 = i3;
                        }
                        i2++;
                        if (i2 < size) {
                            list2.clear();
                            JobKt.cancel(this.graphLoopScope, (CancellationException) null);
                            return Unit.INSTANCE;
                        }
                    }
                }
                this.currentRequestProcessor = null;
                list2 = list;
                size = list.size();
                if (i2 < size) {
                }
            }
        }
        graphLoop$processShutdown$1 = new GraphLoop$processShutdown$1(this, continuation);
        Object obj2 = graphLoop$processShutdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphLoop$processShutdown$1.label;
        i2 = 0;
        if (i != 0) {
        }
        this.currentRequestProcessor = null;
        list2 = list;
        size = list.size();
        if (i2 < size) {
        }
    }

    public final void processTrigger(List list, int i, GraphCommand.Trigger trigger) {
        Request request = this.currentRepeatingRequest;
        if (request == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this._captureProcessingEnabled.getValue() && request != null) {
            if (buildAndSubmit(trigger.triggerParameters, false, CollectionsKt__CollectionsJVMKt.listOf(request))) {
                list.remove(i);
                return;
            }
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((GraphCommand) list.get(i2)) instanceof GraphCommand.Repeat) {
                processRepeat(i2, list, false);
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            }
        }
    }

    public final boolean reissueRepeatingRequest() {
        Boolean bool;
        TraceParser traceParser = this.currentRequestProcessor;
        if (traceParser == null) {
            return false;
        }
        Request request = this.currentRepeatingRequest;
        if (request != null) {
            bool = Boolean.valueOf(traceParser.submit$camera_camera2_pipe(true, CollectionsKt__CollectionsJVMKt.listOf(request), this.defaultParameters, this.currentGraphParameters, this.currentRequiredParameters, this.currentRequestListeners));
        } else {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public final void setCaptureProcessingEnabled(boolean z) {
        this._captureProcessingEnabled._value = z ? 1 : 0;
        if (z) {
            this.processingQueue.tryEmit(GraphCommand.Stop.INSTANCE$2);
        }
    }

    public final void setRequestProcessor(TraceParser traceParser) {
        synchronized (this.lock) {
            TraceParser traceParser2 = this._requestProcessor;
            this._requestProcessor = traceParser;
            if (this.closed) {
                Continuation continuation = null;
                this._requestProcessor = null;
                if (traceParser != null) {
                    JobKt.launch$default(this.shutdownScope, null, null, new GraphLoop$close$1$1$1(traceParser, continuation, 1), 3);
                }
                return;
            }
            if (traceParser2 != traceParser) {
                this.processingQueue.tryEmit(new GraphCommand.RequestProcessor(traceParser2, traceParser));
            }
            if (traceParser == null) {
                int size = this.listeners.size();
                for (int i = 0; i < size; i++) {
                    ((Listener) this.listeners.get(i)).onGraphStopped();
                }
            }
        }
    }

    public final String toString() {
        return "GraphLoop(" + this.cameraGraphId + ')';
    }
}
