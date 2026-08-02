package com.squareup.cash.payments.views;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.DimensionDescription;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$1$1$1$1$1 implements Function1 {
    public static final QuickPayViewKt$QuickPay$1$1$1$1$1 INSTANCE = new QuickPayViewKt$QuickPay$1$1$1$1$1(0);
    public static final QuickPayViewKt$QuickPay$1$1$1$1$1 INSTANCE$1 = new QuickPayViewKt$QuickPay$1$1$1$1$1(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$1$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                constrainScope.getClass();
                Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
                ConstrainedLayoutReference constrainedLayoutReference = constrainScope.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference.top, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope, constrainedLayoutReference.start, constrainedLayoutReference.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                constrainScope.setHeight(new DimensionDescription("wrap"));
                constrainScope.setWidth(new DimensionDescription("spread"));
                break;
            default:
                ConstrainScope constrainScope2 = (ConstrainScope) obj;
                constrainScope2.getClass();
                ConstrainedLayoutReference constrainedLayoutReference2 = constrainScope2.parent;
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope2, constrainedLayoutReference2.start, constrainedLayoutReference2.end, 24.0f, 24.0f, 112);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope2.bottom, constrainedLayoutReference2.bottom, 16.0f, 4);
                constrainScope2.setHeight(new DimensionDescription("wrap"));
                constrainScope2.setWidth(new DimensionDescription("spread"));
                break;
        }
        return Unit.INSTANCE;
    }
}
