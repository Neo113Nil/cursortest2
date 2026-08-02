package com.squareup.cash.payments.views;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.DimensionDescription;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$1$1$1$4$1 implements Function1 {
    public final /* synthetic */ ConstrainedLayoutReference $buttonRef;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$4$1(ConstrainedLayoutReference constrainedLayoutReference, int i) {
        this.$r8$classId = i;
        this.$buttonRef = constrainedLayoutReference;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ConstrainedLayoutReference constrainedLayoutReference = this.$buttonRef;
        switch (i) {
            case 0:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                constrainScope.getClass();
                ConstrainedLayoutReference constrainedLayoutReference2 = constrainScope.parent;
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope, constrainedLayoutReference2.start, constrainedLayoutReference2.end, 24.0f, 24.0f, 112);
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference.top, 16.0f, 4);
                constrainScope.setHeight(new DimensionDescription("wrap"));
                constrainScope.setWidth(new DimensionDescription("spread"));
                break;
            case 1:
                ConstrainScope constrainScope2 = (ConstrainScope) obj;
                constrainScope2.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope2.top, constrainedLayoutReference.bottom, -40.0f, 4);
                constrainScope2.start.m110linkToVpY3zN4(constrainScope2.parent.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 2:
                ConstrainScope constrainScope3 = (ConstrainScope) obj;
                constrainScope3.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope3.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.centerHorizontallyTo$default(constrainScope3, constrainScope3.parent);
                break;
            case 3:
                ConstrainScope constrainScope4 = (ConstrainScope) obj;
                constrainScope4.getClass();
                ConstrainedLayoutReference constrainedLayoutReference3 = constrainScope4.parent;
                ConstrainScope.m1078linkToR7zmacU$default(constrainScope4, constrainedLayoutReference3.start, constrainedLayoutReference3.top, constrainedLayoutReference3.end, constrainedLayoutReference.top);
                constrainScope4.setHeight(new DimensionDescription("spread"));
                break;
            case 4:
                ConstrainScope constrainScope5 = (ConstrainScope) obj;
                constrainScope5.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope5.bottom, constrainedLayoutReference.top, 14.0f, 4);
                break;
            case 5:
                ConstrainScope constrainScope6 = (ConstrainScope) obj;
                constrainScope6.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope6.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                constrainScope6.start.m110linkToVpY3zN4(constrainScope6.parent.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 6:
                ConstrainScope constrainScope7 = (ConstrainScope) obj;
                constrainScope7.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope7.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                constrainScope7.start.m110linkToVpY3zN4(constrainedLayoutReference.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 7:
                ConstrainScope constrainScope8 = (ConstrainScope) obj;
                constrainScope8.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope8.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                Recorder.AnonymousClass1 anonymousClass1 = constrainScope8.start;
                ConstrainedLayoutReference constrainedLayoutReference4 = constrainScope8.parent;
                anonymousClass1.m110linkToVpY3zN4(constrainedLayoutReference4.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                constrainScope8.end.m110linkToVpY3zN4(constrainedLayoutReference4.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 8:
                ConstrainScope constrainScope9 = (ConstrainScope) obj;
                constrainScope9.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope9.bottom, constrainedLayoutReference.top, 42.0f, 4);
                constrainScope9.end.m110linkToVpY3zN4(constrainScope9.parent.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 9:
                ConstrainScope constrainScope10 = (ConstrainScope) obj;
                constrainScope10.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope10.bottom, constrainedLayoutReference.top, 24.0f, 4);
                ConstrainedLayoutReference constrainedLayoutReference5 = constrainScope10.parent;
                ConstrainScope.m1077linkTo8ZKsbrE$default(constrainScope10, constrainedLayoutReference5.start, constrainedLayoutReference5.end, 84.0f, 84.0f, 48);
                constrainScope10.setWidth(new DimensionDescription("preferWrap"));
                break;
            case 10:
                ConstrainScope constrainScope11 = (ConstrainScope) obj;
                constrainScope11.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope11.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                constrainScope11.start.m110linkToVpY3zN4(constrainScope11.parent.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 11:
                ConstrainScope constrainScope12 = (ConstrainScope) obj;
                constrainScope12.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope12.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                constrainScope12.start.m110linkToVpY3zN4(constrainedLayoutReference.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 12:
                ConstrainScope constrainScope13 = (ConstrainScope) obj;
                constrainScope13.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope13.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                Recorder.AnonymousClass1 anonymousClass12 = constrainScope13.start;
                ConstrainedLayoutReference constrainedLayoutReference6 = constrainScope13.parent;
                anonymousClass12.m110linkToVpY3zN4(constrainedLayoutReference6.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                constrainScope13.end.m110linkToVpY3zN4(constrainedLayoutReference6.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                break;
            case 13:
                ConstrainScope constrainScope14 = (ConstrainScope) obj;
                constrainScope14.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope14.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.centerHorizontallyTo$default(constrainScope14, constrainScope14.parent);
                break;
            case 14:
                ConstrainScope constrainScope15 = (ConstrainScope) obj;
                constrainScope15.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope15.bottom, constrainedLayoutReference.top, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.centerHorizontallyTo$default(constrainScope15, constrainScope15.parent);
                break;
            default:
                ConstrainScope constrainScope16 = (ConstrainScope) obj;
                constrainScope16.getClass();
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope16.top, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.centerHorizontallyTo$default(constrainScope16, constrainScope16.parent);
                break;
        }
        return Unit.INSTANCE;
    }
}
