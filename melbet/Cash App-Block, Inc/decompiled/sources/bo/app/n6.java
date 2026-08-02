package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class n6 extends SuspendLambda implements Function2 {
    public Ref$ObjectRef a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o6 e;
    public final /* synthetic */ f6 f;
    public final /* synthetic */ e6 g;
    public final /* synthetic */ d6 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, f6 f6Var, e6 e6Var, d6 d6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.e = o6Var;
        this.f = f6Var;
        this.g = e6Var;
        this.h = d6Var;
        this.i = str;
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((HttpURLConnection) ref$ObjectRef.element).getResponseCode(), "DUST stream response code ");
    }

    public static final String b(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((HttpURLConnection) ref$ObjectRef.element).getResponseCode(), "DUST stream connection failed with response code ");
    }

    public static final String c() {
        return "Stream connection job cancelled";
    }

    public static final String d() {
        return "Closing stream connection data";
    }

    public static final String e() {
        return "Stream job finished";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n6 n6Var = new n6(this.e, this.f, this.g, this.h, this.i, continuation);
        n6Var.d = obj;
        return n6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0154, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01a9, code lost:
    
        r19.e.a(false);
        com.braze.support.BrazeLogger.brazelog$default(com.braze.support.BrazeLogger.INSTANCE, bo.app.o6.d, (com.braze.support.BrazeLogger.Priority) null, (java.lang.Throwable) null, false, (kotlin.jvm.functions.Function0) new bo.app.l$$ExternalSyntheticLambda0(28), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01c4, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01a6, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:7:0x001d, B:8:0x00ef, B:37:0x0157, B:39:0x015d, B:40:0x0188, B:43:0x0173, B:59:0x0063), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173 A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:7:0x001d, B:8:0x00ef, B:37:0x0157, B:39:0x015d, B:40:0x0188, B:43:0x0173, B:59:0x0063), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        HttpURLConnection httpURLConnection;
        Exception exc;
        Ref$ObjectRef ref$ObjectRef2;
        HttpURLConnection httpURLConnection2;
        Ref$ObjectRef ref$ObjectRef3;
        Object withContext;
        Ref$ObjectRef ref$ObjectRef4;
        CoroutineScope coroutineScope = (CoroutineScope) this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.c;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                ref$ObjectRef = r3;
            }
            try {
                try {
                    if (r3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(this.i, 25), 14, (Object) null);
                        this.e.a(false);
                        ref$ObjectRef3 = new Ref$ObjectRef();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        m6 m6Var = new m6(this.i, null);
                        this.d = coroutineScope;
                        this.a = ref$ObjectRef3;
                        this.b = ref$ObjectRef3;
                        this.c = 1;
                        withContext = JobKt.withContext(defaultIoScheduler, m6Var, this);
                        if (withContext != coroutineSingletons) {
                            ref$ObjectRef4 = ref$ObjectRef3;
                        }
                        return coroutineSingletons;
                    }
                    if (r3 == 1) {
                        ref$ObjectRef3 = (Ref$ObjectRef) this.b;
                        ref$ObjectRef = this.a;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            ref$ObjectRef4 = ref$ObjectRef;
                            withContext = obj;
                        } catch (Exception e) {
                            exc = e;
                            ref$ObjectRef2 = ref$ObjectRef;
                            if (JobKt.isActive(coroutineScope)) {
                            }
                            this.f.invoke(null);
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) ref$ObjectRef2.element;
                        } catch (Throwable th2) {
                            th = th2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                            httpURLConnection = (HttpURLConnection) ref$ObjectRef.element;
                            if (httpURLConnection != null) {
                            }
                            throw th;
                        }
                    } else {
                        if (r3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Ref$ObjectRef ref$ObjectRef5 = this.a;
                        SafeTrace.throwOnFailure(obj);
                        r3 = ref$ObjectRef5;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(24), 14, (Object) null);
                        ref$ObjectRef4 = r3;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef4.element;
                    }
                    withContext.getClass();
                    ref$ObjectRef3.element = (HttpURLConnection) withContext;
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = o6.d;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(1, ref$ObjectRef4), 14, (Object) null);
                    IntRange intRange = o6.e;
                    int i = intRange.first;
                    int i2 = intRange.last;
                    int responseCode = ((HttpURLConnection) ref$ObjectRef4.element).getResponseCode();
                    if (i > responseCode || responseCode > i2) {
                        BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(2, ref$ObjectRef4), 12, (Object) null);
                        this.f.invoke(new Integer(((HttpURLConnection) ref$ObjectRef4.element).getResponseCode()));
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef4.element;
                    } else {
                        this.e.a(true);
                        this.g.invoke();
                        InputStream inputStream = ((HttpURLConnection) ref$ObjectRef4.element).getInputStream();
                        inputStream.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked);
                        try {
                            coroutineScope.getClass();
                            ProducerCoroutine produce$default = TuplesKt.produce$default(coroutineScope, new k6(bufferedReader, null));
                            o6 o6Var = this.e;
                            d6 d6Var = this.h;
                            this.d = coroutineScope;
                            this.a = ref$ObjectRef4;
                            this.b = null;
                            this.c = 2;
                            if (o6Var.a(coroutineScope, produce$default, d6Var, this) != coroutineSingletons) {
                                r3 = ref$ObjectRef4;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(24), 14, (Object) null);
                                ref$ObjectRef4 = r3;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                                httpURLConnection2 = (HttpURLConnection) ref$ObjectRef4.element;
                            }
                            return coroutineSingletons;
                        } catch (Exception e2) {
                            exc = e2;
                            ref$ObjectRef2 = ref$ObjectRef4;
                            if (JobKt.isActive(coroutineScope)) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new l$$ExternalSyntheticLambda0(26), 8, (Object) null);
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(27), 14, (Object) null);
                            }
                            this.f.invoke(null);
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) ref$ObjectRef2.element;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    r3 = ref$ObjectRef4;
                    exc = e;
                    ref$ObjectRef2 = r3;
                    if (JobKt.isActive(coroutineScope)) {
                    }
                    this.f.invoke(null);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                    httpURLConnection2 = (HttpURLConnection) ref$ObjectRef2.element;
                }
            } catch (Throwable th3) {
                th = th3;
                ref$ObjectRef = ref$ObjectRef4;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(25), 14, (Object) null);
                httpURLConnection = (HttpURLConnection) ref$ObjectRef.element;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Starting DUST stream to ", str);
    }

    public static final String b() {
        return "Caught unexpected exception listening to DUST stream";
    }

    public static final String a() {
        return "Stream job coroutine no longer active";
    }
}
