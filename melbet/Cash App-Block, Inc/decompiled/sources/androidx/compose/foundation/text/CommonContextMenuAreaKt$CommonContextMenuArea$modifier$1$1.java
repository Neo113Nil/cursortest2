package androidx.compose.foundation.text;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState $selectionState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$selectionState = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(this.$selectionState, continuation, 0);
                long j = ((Offset) obj).packedValue;
                return commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
            case 1:
                return new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(this.$selectionState, continuation, 1);
            default:
                return new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(this.$selectionState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                long j = ((Offset) obj).packedValue;
                break;
        }
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r7 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r2.updateClipboardEntry() == r0) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final TextFieldSelectionState textFieldSelectionState = this.$selectionState;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = textFieldSelectionState.platformSelectionBehaviors;
                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
                if (platformSelectionBehaviorsImpl != null) {
                    CharSequence charSequence = transformedTextFieldState.getVisualText().text;
                    long j = transformedTextFieldState.getVisualText().selection;
                    this.label = 2;
                    Object m438onShowContextMenuOrSelectionToolbarSbBc2M = platformSelectionBehaviorsImpl.m438onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j, this);
                    if (m438onShowContextMenuOrSelectionToolbarSbBc2M != coroutineSingletons) {
                        m438onShowContextMenuOrSelectionToolbarSbBc2M = Unit.INSTANCE;
                        break;
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    textFieldSelectionState.getClass();
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new BasicTextFieldKt$$ExternalSyntheticLambda15(textFieldSelectionState, 5));
                    TextFieldSelectionState$observeTextChanges$3 textFieldSelectionState$observeTextChanges$3 = TextFieldSelectionState$observeTextChanges$3.INSTANCE;
                    SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = FlowKt.defaultKeySelector;
                    TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, textFieldSelectionState$observeTextChanges$3);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(snapshotFlow, saversKt$$ExternalSyntheticLambda2, textFieldSelectionState$observeTextChanges$3), 1);
                    final int i5 = 0;
                    Object collect = drop.collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            StandaloneCoroutine standaloneCoroutine;
                            int i6 = i5;
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            switch (i6) {
                                case 0:
                                    textFieldSelectionState2.setShowCursorHandle(false);
                                    textFieldSelectionState2.setTextToolbarState(TextToolbarState.None);
                                    break;
                                default:
                                    if (((Rect) obj2) == null) {
                                        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = textFieldSelectionState2.toolbarRequester.toolbarHandlerNode;
                                        if (textContextMenuToolbarHandlerNode != null && (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) != null) {
                                            standaloneCoroutine.cancel(null);
                                            textContextMenuToolbarHandlerNode.textToolbarJob = null;
                                        }
                                        break;
                                    } else {
                                        textFieldSelectionState2.toolbarRequester.show();
                                        Unit unit = Unit.INSTANCE;
                                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    textFieldSelectionState.getClass();
                    Object collect2 = FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(Updater.snapshotFlow(new BasicTextFieldKt$$ExternalSyntheticLambda15(textFieldSelectionState, 4)), new SaversKt$$ExternalSyntheticLambda2(6), FlowKt.defaultAreEquivalent).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            StandaloneCoroutine standaloneCoroutine;
                            int i62 = i2;
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            switch (i62) {
                                case 0:
                                    textFieldSelectionState2.setShowCursorHandle(false);
                                    textFieldSelectionState2.setTextToolbarState(TextToolbarState.None);
                                    break;
                                default:
                                    if (((Rect) obj2) == null) {
                                        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = textFieldSelectionState2.toolbarRequester.toolbarHandlerNode;
                                        if (textContextMenuToolbarHandlerNode != null && (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) != null) {
                                            standaloneCoroutine.cancel(null);
                                            textContextMenuToolbarHandlerNode.textToolbarJob = null;
                                        }
                                        break;
                                    } else {
                                        textFieldSelectionState2.toolbarRequester.show();
                                        Unit unit = Unit.INSTANCE;
                                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, this);
                    if (collect2 != coroutineSingletons3) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons3) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
