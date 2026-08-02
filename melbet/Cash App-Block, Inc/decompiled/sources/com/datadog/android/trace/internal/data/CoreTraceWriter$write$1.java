package com.datadog.android.trace.internal.data;

import androidx.compose.animation.BoundsAnimation$animate$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.semantics.SemanticsNode;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.internal.thread.NamedCallable;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$1$1;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0;
import com.datadog.trace.core.DDSpan;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public final class CoreTraceWriter$write$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $trace;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreTraceWriter$write$1(int i, Object obj, Object obj2) {
        super(2);
        this.$r8$classId = i;
        this.$trace = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.this$0;
        Object obj4 = this.$trace;
        switch (i) {
            case 0:
                DatadogContext datadogContext = (DatadogContext) obj;
                Function1 function1 = (Function1) obj2;
                CoreTraceWriter coreTraceWriter = (CoreTraceWriter) obj3;
                datadogContext.getClass();
                function1.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (ArrayList) obj4) {
                    if (!CollectionsKt.contains(CoreTraceWriter.DROP_SAMPLING_PRIORITIES, ((DDSpan) obj5).getTraceSamplingPriority())) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DDSpan dDSpan = (DDSpan) it.next();
                    n.b bVar = coreTraceWriter.rumContextPropagator;
                    dDSpan.getClass();
                    bVar.getClass();
                    n.b.access$extractRumContextInternal(bVar, dDSpan, false);
                    arrayList2.add(dDSpan);
                }
                function1.invoke(new BoundsAnimation$animate$2(7, arrayList2, coreTraceWriter, datadogContext));
                return Unit.INSTANCE;
            case 1:
                int intValue = ((Number) obj).intValue();
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                AndroidContentCaptureManager androidContentCaptureManager = (AndroidContentCaptureManager) obj3;
                if (!((SemanticsNodeCopy) obj4).children.contains(semanticsNode.id)) {
                    androidContentCaptureManager.updateBuffersOnAppeared(intValue, semanticsNode);
                    androidContentCaptureManager.boundsUpdateChannel.mo1159trySendJP2dKIU(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) ((LayoutNodeSubcompositionsState.NodeState) obj4).activeState.getValue();
                    boolean booleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) obj3;
                    gapComposer.startReusableGroup(bool);
                    boolean changed = gapComposer.changed(booleanValue);
                    if (booleanValue) {
                        function2.invoke(gapComposer, 0);
                    } else {
                        if (gapComposer.groupNodeCount != 0) {
                            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!gapComposer.inserting) {
                            if (changed) {
                                SlotReader slotReader = gapComposer.reader;
                                int i2 = slotReader.currentGroup;
                                int i3 = slotReader.currentEnd;
                                ComposerChangeListWriter composerChangeListWriter = gapComposer.changeListWriter;
                                composerChangeListWriter.getClass();
                                composerChangeListWriter.realizeOperationLocation(false);
                                composerChangeListWriter.changeList.f854operations.pushOp(Operation.DeactivateCurrentGroup.INSTANCE);
                                Updater.access$removeRange(i2, i3, gapComposer.invalidations);
                                gapComposer.reader.skipToGroupEnd();
                            } else {
                                gapComposer.skipReaderToGroupEnd();
                            }
                        }
                    }
                    if (gapComposer.reusing && gapComposer.reader.parent == gapComposer.reusingGroup) {
                        gapComposer.reusingGroup = -1;
                        gapComposer.reusing = false;
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                DatadogContext datadogContext2 = (DatadogContext) obj;
                Function1 function12 = (Function1) obj2;
                RumRawEvent rumRawEvent = (RumRawEvent) obj3;
                datadogContext2.getClass();
                function12.getClass();
                DatadogRumMonitor datadogRumMonitor = (DatadogRumMonitor) obj4;
                ExecutorService executorService = datadogRumMonitor.executorService;
                InternalSdkCore internalSdkCore = datadogRumMonitor.sdkCore;
                if (!executorService.isShutdown()) {
                    RumContext rumContext = (RumContext) zzho.getSafe(zzho.submitSafe(executorService, "Rum event handling", internalSdkCore.getInternalLogger(), new NamedCallable(String.valueOf(Reflection.factory.getOrCreateKotlinClass(rumRawEvent.getClass()).getSimpleName()), new DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0(datadogRumMonitor, rumRawEvent, datadogContext2, function12))), "Rum get context", internalSdkCore.getInternalLogger());
                    if (rumContext != null) {
                        internalSdkCore.updateFeatureContext("rum", new DatadogRumMonitor$handleEvent$1$1(rumContext, 1), false);
                    }
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.getSkipping()) {
                        gapComposer2.skipToGroupEnd();
                        return Unit.INSTANCE;
                    }
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                gapComposer3.startReplaceGroup(-1771214741);
                for (UiGroupElementViewModel uiGroupElementViewModel : ((UiGroupViewModel) obj4).elements) {
                    if (uiGroupElementViewModel instanceof UiGroupElementViewModel.DrawableViewModel) {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        zzrl.ImageOrVisual(uiGroupElementViewModel, RulerKt.layoutId(companion, "imageVisual"), gapComposer3, 0);
                        zzrl.TextAndSpaceElements(0, gapComposer3, RulerKt.layoutId(companion, "text"), (List) obj3);
                        gapComposer3.end(false);
                        return Unit.INSTANCE;
                    }
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return null;
        }
    }
}
