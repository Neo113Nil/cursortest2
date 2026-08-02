package com.squareup.cash.paymentpad.views;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1 INSTANCE$1 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1(1);
    public static final MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1 INSTANCE$2 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1(2);
    public static final MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1 INSTANCE = new MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1(0);
    public static final MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1 INSTANCE$3 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1(3);
    public static final MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1 INSTANCE$4 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1(4);

    public /* synthetic */ MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1(int i) {
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
                break;
            case 1:
                ConstrainScope constrainScope2 = (ConstrainScope) obj;
                constrainScope2.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope2.bottom, constrainScope2.parent.bottom, RecyclerView.DECELERATION_RATE, 6);
                break;
            case 2:
                ConstrainScope constrainScope3 = (ConstrainScope) obj;
                constrainScope3.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope3.bottom, constrainScope3.parent.bottom, RecyclerView.DECELERATION_RATE, 6);
                break;
            case 3:
                ConstrainScope constrainScope4 = (ConstrainScope) obj;
                constrainScope4.getClass();
                Recorder.AnonymousClass4 anonymousClass42 = constrainScope4.top;
                ConstrainedLayoutReference constrainedLayoutReference2 = constrainScope4.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass42, constrainedLayoutReference2.top, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope4, constrainedLayoutReference2.start, constrainedLayoutReference2.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                break;
            default:
                ConstrainScope constrainScope5 = (ConstrainScope) obj;
                constrainScope5.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope5.bottom, constrainScope5.parent.bottom, RecyclerView.DECELERATION_RATE, 6);
                break;
        }
        return Unit.INSTANCE;
    }
}
