package com.squareup.cash.payments.views;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.DimensionDescription;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$1$1$1$3$1 implements Function1 {
    public final /* synthetic */ ConstrainedLayoutReference $keyboardRef;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConstrainedLayoutReference $topRef;

    public /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$3$1(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2, int i) {
        this.$r8$classId = i;
        this.$topRef = constrainedLayoutReference;
        this.$keyboardRef = constrainedLayoutReference2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ConstrainedLayoutReference constrainedLayoutReference = this.$keyboardRef;
        ConstrainedLayoutReference constrainedLayoutReference2 = this.$topRef;
        switch (i) {
            case 0:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                constrainScope.getClass();
                ConstrainedLayoutReference constrainedLayoutReference3 = constrainScope.parent;
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope, constrainedLayoutReference3.start, constrainedLayoutReference3.end, 24.0f, 24.0f, 112);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference2.bottom, RecyclerView.DECELERATION_RATE, 6);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference.top, RecyclerView.DECELERATION_RATE, 6);
                constrainScope.setHeight(new DimensionDescription("20.0%"));
                constrainScope.setWidth(new DimensionDescription("spread"));
                break;
            default:
                ConstrainScope constrainScope2 = (ConstrainScope) obj;
                constrainScope2.getClass();
                constrainScope2.start.m110linkToVpY3zN4(constrainedLayoutReference2.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                constrainScope2.end.m110linkToVpY3zN4(constrainScope2.parent.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope2.top, constrainedLayoutReference.bottom, 4.0f, 4);
                constrainScope2.setWidth(new DimensionDescription("spread"));
                break;
        }
        return Unit.INSTANCE;
    }
}
