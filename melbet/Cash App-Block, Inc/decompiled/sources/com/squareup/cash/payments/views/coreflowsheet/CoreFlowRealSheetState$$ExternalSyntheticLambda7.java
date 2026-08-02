package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState$CreateDragAnchorsEffect$lambda$0$0$$inlined$onDispose$1;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes7.dex */
public final /* synthetic */ class CoreFlowRealSheetState$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreFlowRealSheetState f$0;

    public /* synthetic */ CoreFlowRealSheetState$$ExternalSyntheticLambda7(CoreFlowRealSheetState coreFlowRealSheetState, int i) {
        this.$r8$classId = i;
        this.f$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CoreFlowRealSheetState coreFlowRealSheetState = this.f$0;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                Function1 function1 = coreFlowRealSheetState.settleWithVelocity;
                if (function1 != null) {
                    function1.invoke(f);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("settleWithVelocity");
                throw null;
            case 1:
                ((DisposableEffectScope) obj).getClass();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = coreFlowRealSheetState.updateDragAnchors();
                PdfPreviewViewKt$$ExternalSyntheticLambda0 pdfPreviewViewKt$$ExternalSyntheticLambda0 = new PdfPreviewViewKt$$ExternalSyntheticLambda0(5, ref$ObjectRef, coreFlowRealSheetState);
                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                synchronized (SnapshotKt.lock) {
                    SnapshotKt.applyObservers = CollectionsKt.plus((Collection) SnapshotKt.applyObservers, (Object) pdfPreviewViewKt$$ExternalSyntheticLambda0);
                }
                return new RealSheetState$CreateDragAnchorsEffect$lambda$0$0$$inlined$onDispose$1(new Snapshot$Companion$$ExternalSyntheticLambda0(pdfPreviewViewKt$$ExternalSyntheticLambda0, 1), 1);
            default:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(coreFlowRealSheetState, 26);
        }
    }
}
