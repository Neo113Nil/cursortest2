package androidx.compose.animation;

import androidx.compose.animation.SkipToLookaheadSizeNode$measure$2;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.glance.session.InteractiveFrameClock;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.glance.session.SessionWorkerKt$runSession$6$1;
import androidx.glance.session.TimeoutOptions;
import androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.trace.internal.data.CoreTraceWriter;
import com.datadog.android.trace.model.SpanEvent;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.core.DDSpan;
import com.datadog.trace.core.DDSpanLink;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlin.time.Duration;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class BoundsAnimation$animate$2 extends Lambda implements Function1 {
    public final /* synthetic */ Object $currentBounds;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $targetBounds;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoundsAnimation$animate$2(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$targetBounds = obj2;
        this.$currentBounds = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024f A[LOOP:3: B:68:0x0249->B:70:0x024f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0402 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x043f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.datadog.android.trace.model.SpanEvent$View] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.datadog.android.trace.model.SpanEvent$Session] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.datadog.android.trace.model.SpanEvent$Application] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        TransformOrigin transformOrigin;
        DrawModifierNode drawModifierNode;
        int i;
        int i2;
        NetworkInfo networkInfo;
        Long l;
        String str;
        Throwable th;
        SpanEvent.SimCarrier simCarrier;
        String str2;
        Object obj2;
        SpanEvent.Metrics metrics;
        ?? r14;
        SpanEvent.Dd dd;
        SpanEvent.Os os;
        Iterator it;
        Throwable th2;
        SpanEvent spanEvent;
        switch (this.$r8$classId) {
            case 0:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((BoundsAnimation) this.this$0).transition.targetState$delegate.getValue()).booleanValue() ? (Rect) this.$targetBounds : (Rect) this.$currentBounds;
            case 1:
                EnterTransitionImpl enterTransitionImpl = (EnterTransitionImpl) this.$targetBounds;
                ExitTransitionImpl exitTransitionImpl = (ExitTransitionImpl) this.$currentBounds;
                int ordinal = ((EnterExitState) obj).ordinal();
                if (ordinal == 0) {
                    Scale scale = enterTransitionImpl.data.scale;
                    if (scale != null) {
                        transformOrigin = new TransformOrigin(scale.transformOrigin);
                    } else {
                        Scale scale2 = exitTransitionImpl.data.scale;
                        if (scale2 != null) {
                            transformOrigin = new TransformOrigin(scale2.transformOrigin);
                        }
                        transformOrigin = null;
                    }
                } else if (ordinal == 1) {
                    transformOrigin = (TransformOrigin) this.this$0;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Scale scale3 = exitTransitionImpl.data.scale;
                    if (scale3 != null) {
                        transformOrigin = new TransformOrigin(scale3.transformOrigin);
                    } else {
                        Scale scale4 = enterTransitionImpl.data.scale;
                        if (scale4 != null) {
                            transformOrigin = new TransformOrigin(scale4.transformOrigin);
                        }
                        transformOrigin = null;
                    }
                }
                return new TransformOrigin(transformOrigin != null ? transformOrigin.packedValue : TransformOrigin.Center);
            case 2:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = (RenderInTransitionOverlayNode) this.$targetBounds;
                if (!((MeasureScope) this.this$0).isLookingAhead()) {
                    if (((Boolean) renderInTransitionOverlayNode.renderInOverlay.invoke()).booleanValue()) {
                        if (placementScope.getCoordinates() != null) {
                            if (true != renderInTransitionOverlayNode.enabled) {
                                SharedTransitionScopeRootModifierNode$onAttach$1 sharedTransitionScopeRootModifierNode$onAttach$1 = renderInTransitionOverlayNode.sharedScope.invalidateOverlay;
                                if (sharedTransitionScopeRootModifierNode$onAttach$1 != null) {
                                    sharedTransitionScopeRootModifierNode$onAttach$1.invoke();
                                }
                                DepthSortedSetKt.invalidateDraw(renderInTransitionOverlayNode);
                                renderInTransitionOverlayNode.enabled = true;
                            }
                            LayoutCoordinates layoutCoordinates = renderInTransitionOverlayNode.sharedScope.nullableRoot;
                            if (layoutCoordinates == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                                return null;
                            }
                            long mo839localPositionOfR5De75A = layoutCoordinates.mo839localPositionOfR5De75A(DepthSortedSetKt.requireLayoutCoordinates(renderInTransitionOverlayNode), 0L);
                            if (!Offset.m622equalsimpl0(mo839localPositionOfR5De75A, renderInTransitionOverlayNode.positionInOverlay)) {
                                SharedTransitionScopeRootModifierNode$onAttach$1 sharedTransitionScopeRootModifierNode$onAttach$12 = renderInTransitionOverlayNode.sharedScope.invalidateOverlay;
                                if (sharedTransitionScopeRootModifierNode$onAttach$12 != null) {
                                    sharedTransitionScopeRootModifierNode$onAttach$12.invoke();
                                }
                                DepthSortedSetKt.invalidateDraw(renderInTransitionOverlayNode);
                                renderInTransitionOverlayNode.positionInOverlay = mo839localPositionOfR5De75A;
                            }
                        }
                    } else if (renderInTransitionOverlayNode.enabled) {
                        SharedTransitionScopeRootModifierNode$onAttach$1 sharedTransitionScopeRootModifierNode$onAttach$13 = renderInTransitionOverlayNode.sharedScope.invalidateOverlay;
                        if (sharedTransitionScopeRootModifierNode$onAttach$13 != null) {
                            sharedTransitionScopeRootModifierNode$onAttach$13.invoke();
                        }
                        DepthSortedSetKt.invalidateDraw(renderInTransitionOverlayNode);
                        renderInTransitionOverlayNode.enabled = false;
                    }
                }
                placementScope.place((Placeable) this.$currentBounds, 0, 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 3:
                DragAndDropNode dragAndDropNode = (DragAndDropNode) obj;
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                if (dragAndDropNode.thisDragAndDropTarget != null) {
                    InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                Function1 function1 = dragAndDropNode.onDropTargetValidate;
                DragAndDropTarget dragAndDropTarget = function1 != null ? (DragAndDropTarget) function1.invoke((DragAndDropEvent) this.this$0) : null;
                dragAndDropNode.thisDragAndDropTarget = dragAndDropTarget;
                boolean z = dragAndDropTarget != null;
                if (z) {
                    ((AndroidComposeView) DepthSortedSetKt.requireOwner((DragAndDropNode) this.$targetBounds)).dragAndDropManager.interestedTargets.add(dragAndDropNode);
                }
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.$currentBounds;
                ref$BooleanRef.element = ref$BooleanRef.element || z;
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            case 4:
                TraversableNode traversableNode = (TraversableNode) obj;
                DragAndDropNode dragAndDropNode2 = (DragAndDropNode) traversableNode;
                if (!((AndroidComposeView) DepthSortedSetKt.requireOwner((DragAndDropNode) this.$targetBounds)).dragAndDropManager.interestedTargets.contains(dragAndDropNode2) || !Room.m1166access$containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot((DragAndDropEvent) this.$currentBounds))) {
                    return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                }
                ((Ref$ObjectRef) this.this$0).element = traversableNode;
                return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
            case 5:
                DrawScope drawScope = (DrawScope) obj;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) this.this$0;
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                DrawModifierNode drawModifierNode2 = layoutNodeDrawScope.drawNode;
                layoutNodeDrawScope.drawNode = (DrawModifierNode) this.$targetBounds;
                try {
                    Density density = drawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    Canvas canvas = drawScope.getDrawContext().getCanvas();
                    long m3999getSizeNHjbRc = drawScope.getDrawContext().m3999getSizeNHjbRc();
                    GraphicsLayer graphicsLayer = (GraphicsLayer) drawScope.getDrawContext().requestAdapter;
                    Function1 function12 = (Function1) this.$currentBounds;
                    Density density2 = canvasDrawScope.drawContext.getDensity();
                    LayoutDirection layoutDirection2 = canvasDrawScope.drawContext.getLayoutDirection();
                    Canvas canvas2 = canvasDrawScope.drawContext.getCanvas();
                    long m3999getSizeNHjbRc2 = canvasDrawScope.drawContext.m3999getSizeNHjbRc();
                    GrpcMethod grpcMethod = canvasDrawScope.drawContext;
                    try {
                        GraphicsLayer graphicsLayer2 = (GraphicsLayer) grpcMethod.requestAdapter;
                        grpcMethod.setDensity(density);
                        grpcMethod.setLayoutDirection(layoutDirection);
                        grpcMethod.setCanvas(canvas);
                        grpcMethod.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                        grpcMethod.requestAdapter = graphicsLayer;
                        canvas.save();
                        try {
                            function12.invoke(layoutNodeDrawScope);
                            canvas.restore();
                            GrpcMethod grpcMethod2 = canvasDrawScope.drawContext;
                            grpcMethod2.setDensity(density2);
                            grpcMethod2.setLayoutDirection(layoutDirection2);
                            grpcMethod2.setCanvas(canvas2);
                            grpcMethod2.m4000setSizeuvyYCjk(m3999getSizeNHjbRc2);
                            grpcMethod2.requestAdapter = graphicsLayer2;
                            layoutNodeDrawScope.drawNode = drawModifierNode2;
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            drawModifierNode = drawModifierNode2;
                            try {
                                canvas.restore();
                                GrpcMethod grpcMethod3 = canvasDrawScope.drawContext;
                                grpcMethod3.setDensity(density2);
                                grpcMethod3.setLayoutDirection(layoutDirection2);
                                grpcMethod3.setCanvas(canvas2);
                                grpcMethod3.m4000setSizeuvyYCjk(m3999getSizeNHjbRc2);
                                grpcMethod3.requestAdapter = graphicsLayer2;
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                layoutNodeDrawScope.drawNode = drawModifierNode;
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        drawModifierNode = drawModifierNode2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    drawModifierNode = drawModifierNode2;
                }
            case 6:
                Continuation continuation = null;
                TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = (TimerScopeKt$withTimer$2$1$blockScope$1) this.this$0;
                long m1128getTimeLeftUwyO8pc = timerScopeKt$withTimer$2$1$blockScope$1.m1128getTimeLeftUwyO8pc();
                TimeoutOptions timeoutOptions = (TimeoutOptions) this.$targetBounds;
                if (Duration.m4164compareToLRDsOJo(m1128getTimeLeftUwyO8pc, timeoutOptions.additionalTime) < 0) {
                    long j = timeoutOptions.additionalTime;
                    AtomicReference atomicReference = timerScopeKt$withTimer$2$1$blockScope$1.deadline;
                    SkipToLookaheadSizeNode$measure$2.AnonymousClass1 anonymousClass1 = new SkipToLookaheadSizeNode$measure$2.AnonymousClass1(j, 1);
                    while (true) {
                        Object obj3 = atomicReference.get();
                        Object invoke = anonymousClass1.invoke(obj3);
                        while (!atomicReference.compareAndSet(obj3, invoke)) {
                            if (atomicReference.get() != obj3) {
                                break;
                            }
                        }
                    }
                }
                JobKt.launch$default(timerScopeKt$withTimer$2$1$blockScope$1, null, null, new SessionWorkerKt$runSession$6$1((InteractiveFrameClock) this.$currentBounds, continuation, false ? 1 : 0), 3);
                return Unit.INSTANCE;
            default:
                EventBatchWriter eventBatchWriter = (EventBatchWriter) obj;
                eventBatchWriter.getClass();
                ArrayList arrayList = (ArrayList) this.this$0;
                CoreTraceWriter coreTraceWriter = (CoreTraceWriter) this.$targetBounds;
                DatadogContext datadogContext = (DatadogContext) this.$currentBounds;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    DDSpan dDSpan = (DDSpan) it2.next();
                    coreTraceWriter.ddSpanToSpanEventMapper.getClass();
                    datadogContext.getClass();
                    dDSpan.getClass();
                    long j2 = datadogContext.time.serverTimeOffsetNs;
                    Map tags = dDSpan.context.getTags();
                    tags.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : tags.entrySet()) {
                        if (entry.getValue() instanceof Number) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Object key = entry2.getKey();
                        Object value = entry2.getValue();
                        value.getClass();
                        linkedHashMap2.put(key, (Number) value);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                    int i3 = dDSpan.context.samplingPriority;
                    if (i3 != -128) {
                        linkedHashMap3.put("_sampling_priority_v1", Integer.valueOf(i3));
                    }
                    SpanEvent.Metrics metrics2 = new SpanEvent.Metrics(dDSpan.context.parentId == 0 ? 1L : null, linkedHashMap3);
                    DeviceInfo deviceInfo = datadogContext.deviceInfo;
                    switch (deviceInfo.deviceType.ordinal()) {
                        case 0:
                            i = 1;
                            SpanEvent.Device device = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo2 = datadogContext.deviceInfo;
                            SpanEvent.Os os2 = new SpanEvent.Os(deviceInfo2.osName, deviceInfo2.osVersion, deviceInfo2.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null || str != null) {
                                th = null;
                                simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            } else {
                                simCarrier = null;
                                th = null;
                            }
                            Long l2 = networkInfo.strength;
                            ?? l3 = l2 != null ? l2.toString() : th;
                            Long l4 = networkInfo.downKbps;
                            ?? l5 = l4 != null ? l4.toString() : th;
                            Long l6 = networkInfo.upKbps;
                            ?? l7 = l6 != null ? l6.toString() : th;
                            switch (networkInfo.connectivity) {
                                case 1:
                                    str2 = "NETWORK_NOT_CONNECTED";
                                    break;
                                case 2:
                                    str2 = "NETWORK_ETHERNET";
                                    break;
                                case 3:
                                    str2 = "NETWORK_WIFI";
                                    break;
                                case 4:
                                    str2 = "NETWORK_WIMAX";
                                    break;
                                case 5:
                                    str2 = "NETWORK_BLUETOOTH";
                                    break;
                                case 6:
                                    str2 = "NETWORK_2G";
                                    break;
                                case 7:
                                    str2 = "NETWORK_3G";
                                    break;
                                case 8:
                                    str2 = "NETWORK_4G";
                                    break;
                                case 9:
                                    str2 = "NETWORK_5G";
                                    break;
                                case 10:
                                    str2 = "NETWORK_MOBILE_OTHER";
                                    break;
                                case 11:
                                    str2 = "NETWORK_CELLULAR";
                                    break;
                                case 12:
                                    str2 = "NETWORK_OTHER";
                                    break;
                                default:
                                    throw th;
                            }
                            SpanEvent.Network network = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo = datadogContext.userInfo;
                            SpanEvent.Usr usr = new SpanEvent.Usr(userInfo.id, userInfo.name, userInfo.email, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties));
                            String str3 = datadogContext.source;
                            Object obj4 = dDSpan.context.getTags().get("application_id");
                            ?? application = obj4 != null ? new SpanEvent.Application(obj4 instanceof String ? (String) obj4 : th) : th;
                            Object obj5 = dDSpan.context.getTags().get("session_id");
                            ?? session = obj5 != null ? new SpanEvent.Session(obj5 instanceof String ? (String) obj5 : th) : th;
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                                metrics = metrics2;
                                r14 = new SpanEvent.View(obj2 instanceof String ? (String) obj2 : th);
                            } else {
                                metrics = metrics2;
                                r14 = th;
                            }
                            SpanEvent.Dd dd2 = new SpanEvent.Dd(str3, application, session, r14);
                            String hexStringPadded = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags2 = dDSpan.context.getTags();
                            tags2.getClass();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags2.size()));
                            for (Map.Entry entry3 : tags2.entrySet()) {
                                linkedHashMap4.put(entry3.getKey(), entry3.getValue().toString());
                            }
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            Map unmodifiableMap = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap.getClass();
                            linkedHashMap5.putAll(unmodifiableMap);
                            linkedHashMap5.putAll(linkedHashMap4);
                            linkedHashMap5.put("_dd.p.id", hexStringPadded);
                            linkedHashMap5.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                                dd = dd2;
                                os = os2;
                                it = it2;
                                th2 = th;
                            } else {
                                CopyOnWriteArrayList copyOnWriteArrayList = dDSpan.links;
                                copyOnWriteArrayList.getClass();
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(copyOnWriteArrayList, 10));
                                Iterator it3 = copyOnWriteArrayList.iterator();
                                while (it3.hasNext()) {
                                    DDSpanLink dDSpanLink = (DDSpanLink) it3.next();
                                    dDSpanLink.getClass();
                                    String hexString = dDSpanLink.traceId.toHexString();
                                    SpanEvent.Dd dd3 = dd2;
                                    SpanEvent.Os os3 = os2;
                                    Iterator it4 = it2;
                                    String hexStringPadded2 = LongStringUtils.toHexStringPadded(16, dDSpanLink.spanId);
                                    dDSpanLink.attributes.getClass();
                                    Map map = Collections.EMPTY_MAP;
                                    map.getClass();
                                    JsonObject jsonObject = new JsonObject();
                                    for (Iterator it5 = map.entrySet().iterator(); it5.hasNext(); it5 = it5) {
                                        Map.Entry entry4 = (Map.Entry) it5.next();
                                        jsonObject.addProperty((String) entry4.getKey(), (String) entry4.getValue());
                                        it3 = it3;
                                    }
                                    Iterator it6 = it3;
                                    byte b = dDSpanLink.traceFlags;
                                    String str4 = dDSpanLink.traceState;
                                    JsonObject jsonObject2 = new JsonObject();
                                    jsonObject2.addProperty("trace_id", hexString);
                                    jsonObject2.addProperty("span_id", hexStringPadded2);
                                    jsonObject2.add("attributes", jsonObject);
                                    if (b != 0) {
                                        jsonObject2.addProperty("flags", Byte.valueOf(b));
                                    }
                                    str4.getClass();
                                    if (str4.length() > 0) {
                                        jsonObject2.addProperty("tracestate", str4);
                                    }
                                    arrayList2.add(jsonObject2);
                                    dd2 = dd3;
                                    it3 = it6;
                                    os2 = os3;
                                    it2 = it4;
                                }
                                dd = dd2;
                                os = os2;
                                it = it2;
                                JsonArray jsonArray = new JsonArray();
                                Iterator it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    jsonArray.add((JsonObject) it7.next());
                                }
                                th2 = jsonArray.toString();
                            }
                            if (th2 != null) {
                                linkedHashMap5.put("_dd.span_links", th2);
                            }
                            SpanEvent.Meta meta = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr, null, network, device, os, linkedHashMap5);
                            String hexStringPadded3 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded4 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded5 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj6 = dDSpan.context.getResourceName().toString();
                            String obj7 = dDSpan.context.operationName.toString();
                            String str5 = dDSpan.context.serviceName;
                            long j3 = dDSpan.durationNano;
                            long j4 = dDSpan.startTimeNano + j2;
                            long j5 = dDSpan.context.errorFlag ? 1L : 0L;
                            str5.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded3, hexStringPadded4, hexStringPadded5, obj6, obj7, str5, j3, j4, j5, metrics, meta));
                            if (spanEvent != null) {
                                try {
                                    byte[] bytes = coreTraceWriter.serializer.serialize(datadogContext, spanEvent).getBytes(Charsets.UTF_8);
                                    bytes.getClass();
                                    synchronized (coreTraceWriter) {
                                        eventBatchWriter.write(new RawBatchEvent(bytes, RawBatchEvent.EMPTY_BYTE_ARRAY), 1);
                                    }
                                } catch (Throwable th7) {
                                    DBUtil.log$default(coreTraceWriter.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new SessionWorker$doWork$2$2.AnonymousClass1(spanEvent, 2), th7, 48);
                                }
                            }
                            it2 = it;
                        case 1:
                            i = 3;
                            SpanEvent.Device device2 = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo22 = datadogContext.deviceInfo;
                            SpanEvent.Os os22 = new SpanEvent.Os(deviceInfo22.osName, deviceInfo22.osVersion, deviceInfo22.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null) {
                            }
                            th = null;
                            simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            Long l22 = networkInfo.strength;
                            if (l22 != null) {
                            }
                            Long l42 = networkInfo.downKbps;
                            if (l42 != null) {
                            }
                            Long l62 = networkInfo.upKbps;
                            if (l62 != null) {
                            }
                            switch (networkInfo.connectivity) {
                            }
                            SpanEvent.Network network2 = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo2 = datadogContext.userInfo;
                            SpanEvent.Usr usr2 = new SpanEvent.Usr(userInfo2.id, userInfo2.name, userInfo2.email, MapsKt__MapsKt.toMutableMap(userInfo2.additionalProperties));
                            String str32 = datadogContext.source;
                            Object obj42 = dDSpan.context.getTags().get("application_id");
                            if (obj42 != null) {
                            }
                            Object obj52 = dDSpan.context.getTags().get("session_id");
                            if (obj52 != null) {
                            }
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                            }
                            SpanEvent.Dd dd22 = new SpanEvent.Dd(str32, application, session, r14);
                            String hexStringPadded6 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags22 = dDSpan.context.getTags();
                            tags22.getClass();
                            LinkedHashMap linkedHashMap42 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags22.size()));
                            while (r7.hasNext()) {
                            }
                            LinkedHashMap linkedHashMap52 = new LinkedHashMap();
                            Map unmodifiableMap2 = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap2.getClass();
                            linkedHashMap52.putAll(unmodifiableMap2);
                            linkedHashMap52.putAll(linkedHashMap42);
                            linkedHashMap52.put("_dd.p.id", hexStringPadded6);
                            linkedHashMap52.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                            }
                            if (th2 != null) {
                            }
                            SpanEvent.Meta meta2 = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr2, null, network2, device2, os, linkedHashMap52);
                            String hexStringPadded32 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded42 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded52 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj62 = dDSpan.context.getResourceName().toString();
                            String obj72 = dDSpan.context.operationName.toString();
                            String str52 = dDSpan.context.serviceName;
                            long j32 = dDSpan.durationNano;
                            long j42 = dDSpan.startTimeNano + j2;
                            long j52 = dDSpan.context.errorFlag ? 1L : 0L;
                            str52.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded32, hexStringPadded42, hexStringPadded52, obj62, obj72, str52, j32, j42, j52, metrics, meta2));
                            if (spanEvent != null) {
                            }
                            it2 = it;
                            break;
                        case 2:
                            i = 4;
                            SpanEvent.Device device22 = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo222 = datadogContext.deviceInfo;
                            SpanEvent.Os os222 = new SpanEvent.Os(deviceInfo222.osName, deviceInfo222.osVersion, deviceInfo222.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null) {
                            }
                            th = null;
                            simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            Long l222 = networkInfo.strength;
                            if (l222 != null) {
                            }
                            Long l422 = networkInfo.downKbps;
                            if (l422 != null) {
                            }
                            Long l622 = networkInfo.upKbps;
                            if (l622 != null) {
                            }
                            switch (networkInfo.connectivity) {
                            }
                            SpanEvent.Network network22 = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo22 = datadogContext.userInfo;
                            SpanEvent.Usr usr22 = new SpanEvent.Usr(userInfo22.id, userInfo22.name, userInfo22.email, MapsKt__MapsKt.toMutableMap(userInfo22.additionalProperties));
                            String str322 = datadogContext.source;
                            Object obj422 = dDSpan.context.getTags().get("application_id");
                            if (obj422 != null) {
                            }
                            Object obj522 = dDSpan.context.getTags().get("session_id");
                            if (obj522 != null) {
                            }
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                            }
                            SpanEvent.Dd dd222 = new SpanEvent.Dd(str322, application, session, r14);
                            String hexStringPadded62 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags222 = dDSpan.context.getTags();
                            tags222.getClass();
                            LinkedHashMap linkedHashMap422 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags222.size()));
                            while (r7.hasNext()) {
                            }
                            LinkedHashMap linkedHashMap522 = new LinkedHashMap();
                            Map unmodifiableMap22 = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap22.getClass();
                            linkedHashMap522.putAll(unmodifiableMap22);
                            linkedHashMap522.putAll(linkedHashMap422);
                            linkedHashMap522.put("_dd.p.id", hexStringPadded62);
                            linkedHashMap522.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                            }
                            if (th2 != null) {
                            }
                            SpanEvent.Meta meta22 = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr22, null, network22, device22, os, linkedHashMap522);
                            String hexStringPadded322 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded422 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded522 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj622 = dDSpan.context.getResourceName().toString();
                            String obj722 = dDSpan.context.operationName.toString();
                            String str522 = dDSpan.context.serviceName;
                            long j322 = dDSpan.durationNano;
                            long j422 = dDSpan.startTimeNano + j2;
                            long j522 = dDSpan.context.errorFlag ? 1L : 0L;
                            str522.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded322, hexStringPadded422, hexStringPadded522, obj622, obj722, str522, j322, j422, j522, metrics, meta22));
                            if (spanEvent != null) {
                            }
                            it2 = it;
                            break;
                        case 3:
                            i = 2;
                            SpanEvent.Device device222 = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo2222 = datadogContext.deviceInfo;
                            SpanEvent.Os os2222 = new SpanEvent.Os(deviceInfo2222.osName, deviceInfo2222.osVersion, deviceInfo2222.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null) {
                            }
                            th = null;
                            simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            Long l2222 = networkInfo.strength;
                            if (l2222 != null) {
                            }
                            Long l4222 = networkInfo.downKbps;
                            if (l4222 != null) {
                            }
                            Long l6222 = networkInfo.upKbps;
                            if (l6222 != null) {
                            }
                            switch (networkInfo.connectivity) {
                            }
                            SpanEvent.Network network222 = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo222 = datadogContext.userInfo;
                            SpanEvent.Usr usr222 = new SpanEvent.Usr(userInfo222.id, userInfo222.name, userInfo222.email, MapsKt__MapsKt.toMutableMap(userInfo222.additionalProperties));
                            String str3222 = datadogContext.source;
                            Object obj4222 = dDSpan.context.getTags().get("application_id");
                            if (obj4222 != null) {
                            }
                            Object obj5222 = dDSpan.context.getTags().get("session_id");
                            if (obj5222 != null) {
                            }
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                            }
                            SpanEvent.Dd dd2222 = new SpanEvent.Dd(str3222, application, session, r14);
                            String hexStringPadded622 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags2222 = dDSpan.context.getTags();
                            tags2222.getClass();
                            LinkedHashMap linkedHashMap4222 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags2222.size()));
                            while (r7.hasNext()) {
                            }
                            LinkedHashMap linkedHashMap5222 = new LinkedHashMap();
                            Map unmodifiableMap222 = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap222.getClass();
                            linkedHashMap5222.putAll(unmodifiableMap222);
                            linkedHashMap5222.putAll(linkedHashMap4222);
                            linkedHashMap5222.put("_dd.p.id", hexStringPadded622);
                            linkedHashMap5222.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                            }
                            if (th2 != null) {
                            }
                            SpanEvent.Meta meta222 = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr222, null, network222, device222, os, linkedHashMap5222);
                            String hexStringPadded3222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded4222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded5222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj6222 = dDSpan.context.getResourceName().toString();
                            String obj7222 = dDSpan.context.operationName.toString();
                            String str5222 = dDSpan.context.serviceName;
                            long j3222 = dDSpan.durationNano;
                            long j4222 = dDSpan.startTimeNano + j2;
                            long j5222 = dDSpan.context.errorFlag ? 1L : 0L;
                            str5222.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded3222, hexStringPadded4222, hexStringPadded5222, obj6222, obj7222, str5222, j3222, j4222, j5222, metrics, meta222));
                            if (spanEvent != null) {
                            }
                            it2 = it;
                            break;
                        case 4:
                            i2 = 5;
                            i = i2;
                            SpanEvent.Device device2222 = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo22222 = datadogContext.deviceInfo;
                            SpanEvent.Os os22222 = new SpanEvent.Os(deviceInfo22222.osName, deviceInfo22222.osVersion, deviceInfo22222.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null) {
                            }
                            th = null;
                            simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            Long l22222 = networkInfo.strength;
                            if (l22222 != null) {
                            }
                            Long l42222 = networkInfo.downKbps;
                            if (l42222 != null) {
                            }
                            Long l62222 = networkInfo.upKbps;
                            if (l62222 != null) {
                            }
                            switch (networkInfo.connectivity) {
                            }
                            SpanEvent.Network network2222 = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo2222 = datadogContext.userInfo;
                            SpanEvent.Usr usr2222 = new SpanEvent.Usr(userInfo2222.id, userInfo2222.name, userInfo2222.email, MapsKt__MapsKt.toMutableMap(userInfo2222.additionalProperties));
                            String str32222 = datadogContext.source;
                            Object obj42222 = dDSpan.context.getTags().get("application_id");
                            if (obj42222 != null) {
                            }
                            Object obj52222 = dDSpan.context.getTags().get("session_id");
                            if (obj52222 != null) {
                            }
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                            }
                            SpanEvent.Dd dd22222 = new SpanEvent.Dd(str32222, application, session, r14);
                            String hexStringPadded6222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags22222 = dDSpan.context.getTags();
                            tags22222.getClass();
                            LinkedHashMap linkedHashMap42222 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags22222.size()));
                            while (r7.hasNext()) {
                            }
                            LinkedHashMap linkedHashMap52222 = new LinkedHashMap();
                            Map unmodifiableMap2222 = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap2222.getClass();
                            linkedHashMap52222.putAll(unmodifiableMap2222);
                            linkedHashMap52222.putAll(linkedHashMap42222);
                            linkedHashMap52222.put("_dd.p.id", hexStringPadded6222);
                            linkedHashMap52222.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                            }
                            if (th2 != null) {
                            }
                            SpanEvent.Meta meta2222 = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr2222, null, network2222, device2222, os, linkedHashMap52222);
                            String hexStringPadded32222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded42222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded52222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj62222 = dDSpan.context.getResourceName().toString();
                            String obj72222 = dDSpan.context.operationName.toString();
                            String str52222 = dDSpan.context.serviceName;
                            long j32222 = dDSpan.durationNano;
                            long j42222 = dDSpan.startTimeNano + j2;
                            long j52222 = dDSpan.context.errorFlag ? 1L : 0L;
                            str52222.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded32222, hexStringPadded42222, hexStringPadded52222, obj62222, obj72222, str52222, j32222, j42222, j52222, metrics, meta2222));
                            if (spanEvent != null) {
                            }
                            it2 = it;
                            break;
                        case 5:
                            i2 = 6;
                            i = i2;
                            SpanEvent.Device device22222 = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo222222 = datadogContext.deviceInfo;
                            SpanEvent.Os os222222 = new SpanEvent.Os(deviceInfo222222.osName, deviceInfo222222.osVersion, deviceInfo222222.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null) {
                            }
                            th = null;
                            simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            Long l222222 = networkInfo.strength;
                            if (l222222 != null) {
                            }
                            Long l422222 = networkInfo.downKbps;
                            if (l422222 != null) {
                            }
                            Long l622222 = networkInfo.upKbps;
                            if (l622222 != null) {
                            }
                            switch (networkInfo.connectivity) {
                            }
                            SpanEvent.Network network22222 = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo22222 = datadogContext.userInfo;
                            SpanEvent.Usr usr22222 = new SpanEvent.Usr(userInfo22222.id, userInfo22222.name, userInfo22222.email, MapsKt__MapsKt.toMutableMap(userInfo22222.additionalProperties));
                            String str322222 = datadogContext.source;
                            Object obj422222 = dDSpan.context.getTags().get("application_id");
                            if (obj422222 != null) {
                            }
                            Object obj522222 = dDSpan.context.getTags().get("session_id");
                            if (obj522222 != null) {
                            }
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                            }
                            SpanEvent.Dd dd222222 = new SpanEvent.Dd(str322222, application, session, r14);
                            String hexStringPadded62222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags222222 = dDSpan.context.getTags();
                            tags222222.getClass();
                            LinkedHashMap linkedHashMap422222 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags222222.size()));
                            while (r7.hasNext()) {
                            }
                            LinkedHashMap linkedHashMap522222 = new LinkedHashMap();
                            Map unmodifiableMap22222 = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap22222.getClass();
                            linkedHashMap522222.putAll(unmodifiableMap22222);
                            linkedHashMap522222.putAll(linkedHashMap422222);
                            linkedHashMap522222.put("_dd.p.id", hexStringPadded62222);
                            linkedHashMap522222.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                            }
                            if (th2 != null) {
                            }
                            SpanEvent.Meta meta22222 = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr22222, null, network22222, device22222, os, linkedHashMap522222);
                            String hexStringPadded322222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded422222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded522222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj622222 = dDSpan.context.getResourceName().toString();
                            String obj722222 = dDSpan.context.operationName.toString();
                            String str522222 = dDSpan.context.serviceName;
                            long j322222 = dDSpan.durationNano;
                            long j422222 = dDSpan.startTimeNano + j2;
                            long j522222 = dDSpan.context.errorFlag ? 1L : 0L;
                            str522222.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded322222, hexStringPadded422222, hexStringPadded522222, obj622222, obj722222, str522222, j322222, j422222, j522222, metrics, meta22222));
                            if (spanEvent != null) {
                            }
                            it2 = it;
                            break;
                        case 6:
                            i2 = 7;
                            i = i2;
                            SpanEvent.Device device222222 = new SpanEvent.Device(deviceInfo.deviceName, i, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture);
                            DeviceInfo deviceInfo2222222 = datadogContext.deviceInfo;
                            SpanEvent.Os os2222222 = new SpanEvent.Os(deviceInfo2222222.osName, deviceInfo2222222.osVersion, deviceInfo2222222.osMajorVersion);
                            networkInfo = datadogContext.networkInfo;
                            networkInfo.getClass();
                            l = networkInfo.carrierId;
                            str = networkInfo.carrierName;
                            if (l == null) {
                            }
                            th = null;
                            simCarrier = new SpanEvent.SimCarrier(l != null ? l.toString() : null, str);
                            Long l2222222 = networkInfo.strength;
                            if (l2222222 != null) {
                            }
                            Long l4222222 = networkInfo.downKbps;
                            if (l4222222 != null) {
                            }
                            Long l6222222 = networkInfo.upKbps;
                            if (l6222222 != null) {
                            }
                            switch (networkInfo.connectivity) {
                            }
                            SpanEvent.Network network222222 = new SpanEvent.Network(new SpanEvent.Client(simCarrier, l3, l5, l7, str2));
                            UserInfo userInfo222222 = datadogContext.userInfo;
                            SpanEvent.Usr usr222222 = new SpanEvent.Usr(userInfo222222.id, userInfo222222.name, userInfo222222.email, MapsKt__MapsKt.toMutableMap(userInfo222222.additionalProperties));
                            String str3222222 = datadogContext.source;
                            Object obj4222222 = dDSpan.context.getTags().get("application_id");
                            if (obj4222222 != null) {
                            }
                            Object obj5222222 = dDSpan.context.getTags().get("session_id");
                            if (obj5222222 != null) {
                            }
                            obj2 = dDSpan.context.getTags().get("view.id");
                            if (obj2 != null) {
                            }
                            SpanEvent.Dd dd2222222 = new SpanEvent.Dd(str3222222, application, session, r14);
                            String hexStringPadded622222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toHighOrderLong());
                            Map tags2222222 = dDSpan.context.getTags();
                            tags2222222.getClass();
                            LinkedHashMap linkedHashMap4222222 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(tags2222222.size()));
                            while (r7.hasNext()) {
                            }
                            LinkedHashMap linkedHashMap5222222 = new LinkedHashMap();
                            Map unmodifiableMap222222 = Collections.unmodifiableMap(dDSpan.context.baggageItems);
                            unmodifiableMap222222.getClass();
                            linkedHashMap5222222.putAll(unmodifiableMap222222);
                            linkedHashMap5222222.putAll(linkedHashMap4222222);
                            linkedHashMap5222222.put("_dd.p.id", hexStringPadded622222);
                            linkedHashMap5222222.put("variant", datadogContext.variant);
                            if (dDSpan.links.isEmpty()) {
                            }
                            if (th2 != null) {
                            }
                            SpanEvent.Meta meta222222 = new SpanEvent.Meta(datadogContext.version, dd, new zzd(4), new SpanEvent.Tracer(datadogContext.sdkVersion), usr222222, null, network222222, device222222, os, linkedHashMap5222222);
                            String hexStringPadded3222222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.traceId.toLong());
                            String hexStringPadded4222222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.spanId);
                            String hexStringPadded5222222 = LongStringUtils.toHexStringPadded(16, dDSpan.context.parentId);
                            String obj6222222 = dDSpan.context.getResourceName().toString();
                            String obj7222222 = dDSpan.context.operationName.toString();
                            String str5222222 = dDSpan.context.serviceName;
                            long j3222222 = dDSpan.durationNano;
                            long j4222222 = dDSpan.startTimeNano + j2;
                            long j5222222 = dDSpan.context.errorFlag ? 1L : 0L;
                            str5222222.getClass();
                            spanEvent = (SpanEvent) coreTraceWriter.eventMapper.map(new SpanEvent(hexStringPadded3222222, hexStringPadded4222222, hexStringPadded5222222, obj6222222, obj7222222, str5222222, j3222222, j4222222, j5222222, metrics, meta222222));
                            if (spanEvent != null) {
                            }
                            it2 = it;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
