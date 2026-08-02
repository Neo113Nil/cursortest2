package com.squareup.cash.payments.views.personalization;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.DimensionDescription;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$1 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(1);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$2 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(2);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$3 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(3);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$4 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(4);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(0);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$5 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(5);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$6 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(6);
    public static final PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1 INSTANCE$7 = new PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(7);

    public /* synthetic */ PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                constrainScope.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainScope.parent.top, RecyclerView.DECELERATION_RATE, 6);
                break;
            case 1:
                ConstrainScope constrainScope2 = (ConstrainScope) obj;
                constrainScope2.getClass();
                constrainScope2.setWidth(new DimensionDescription("parent"));
                constrainScope2.setHeight(new DimensionDescription("parent"));
                break;
            case 2:
                ConstrainScope constrainScope3 = (ConstrainScope) obj;
                constrainScope3.getClass();
                Recorder.AnonymousClass4 anonymousClass4 = constrainScope3.top;
                ConstrainedLayoutReference constrainedLayoutReference = constrainScope3.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference.top, RecyclerView.DECELERATION_RATE, 6);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope3.bottom, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope3, constrainedLayoutReference.start, constrainedLayoutReference.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                constrainScope3.setWidth(new DimensionDescription("spread"));
                constrainScope3.setHeight(new DimensionDescription("spread"));
                break;
            case 3:
                ConstrainScope constrainScope4 = (ConstrainScope) obj;
                constrainScope4.getClass();
                Recorder.AnonymousClass4 anonymousClass42 = constrainScope4.top;
                ConstrainedLayoutReference constrainedLayoutReference2 = constrainScope4.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass42, constrainedLayoutReference2.top, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope4, constrainedLayoutReference2.start, constrainedLayoutReference2.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                break;
            case 4:
                ConstrainScope constrainScope5 = (ConstrainScope) obj;
                constrainScope5.getClass();
                ConstrainedLayoutReference constrainedLayoutReference3 = constrainScope5.parent;
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope5, constrainedLayoutReference3.start, constrainedLayoutReference3.end, 16.0f, 16.0f, 112);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope5.bottom, constrainedLayoutReference3.bottom, 24.0f, 4);
                constrainScope5.setWidth(new DimensionDescription("spread"));
                break;
            case 5:
                ConstrainScope constrainScope6 = (ConstrainScope) obj;
                constrainScope6.getClass();
                Recorder.AnonymousClass4 anonymousClass43 = constrainScope6.bottom;
                ConstrainedLayoutReference constrainedLayoutReference4 = constrainScope6.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass43, constrainedLayoutReference4.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope6, constrainedLayoutReference4.start, constrainedLayoutReference4.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                break;
            case 6:
                ConstrainScope constrainScope7 = (ConstrainScope) obj;
                constrainScope7.getClass();
                Recorder.AnonymousClass4 anonymousClass44 = constrainScope7.top;
                ConstrainedLayoutReference constrainedLayoutReference5 = constrainScope7.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass44, constrainedLayoutReference5.top, RecyclerView.DECELERATION_RATE, 6);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope7.bottom, constrainedLayoutReference5.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope7, constrainedLayoutReference5.start, constrainedLayoutReference5.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                constrainScope7.setWidth(new DimensionDescription("spread"));
                constrainScope7.setHeight(new DimensionDescription("spread"));
                break;
            default:
                ConstrainScope constrainScope8 = (ConstrainScope) obj;
                constrainScope8.getClass();
                ConstrainedLayoutReference constrainedLayoutReference6 = constrainScope8.parent;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = constrainedLayoutReference6.top;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2 = constrainedLayoutReference6.bottom;
                constrainScope8.top.m113linkToVpY3zN4(horizontalAnchor, RecyclerView.DECELERATION_RATE);
                constrainScope8.bottom.m113linkToVpY3zN4(horizontalAnchor2, RecyclerView.DECELERATION_RATE);
                constrainScope8.containerObject.put("vBias", new CLNumber(0.5f));
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope8, constrainedLayoutReference6.start, constrainedLayoutReference6.end, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                constrainScope8.setWidth(new DimensionDescription("spread"));
                constrainScope8.setHeight(new DimensionDescription("spread"));
                break;
        }
        return Unit.INSTANCE;
    }
}
