package ru.yandex.taxi.routeselector.presentation;

import com.yandex.go.pin.api.widget.PinTypeRepository$PinType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u8l0;
import defpackage.vpr;
import defpackage.w0c0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "Landroid/graphics/Rect;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorBubbleInteractor$bubbleRectChangeFlow$1", f = "RouteSelectorBubbleInteractor.kt", l = {43, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorBubbleInteractor$bubbleRectChangeFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ u8l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorBubbleInteractor$bubbleRectChangeFlow$1(u8l0 u8l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u8l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteSelectorBubbleInteractor$bubbleRectChangeFlow$1 routeSelectorBubbleInteractor$bubbleRectChangeFlow$1 = new RouteSelectorBubbleInteractor$bubbleRectChangeFlow$1(this.this$0, continuation);
        routeSelectorBubbleInteractor$bubbleRectChangeFlow$1.L$0 = obj;
        return routeSelectorBubbleInteractor$bubbleRectChangeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorBubbleInteractor$bubbleRectChangeFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r7, r0, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r7 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w0c0 w0c0Var = this.this$0.e;
            this.L$0 = vprVar;
            this.label = 1;
            obj = w0c0Var.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (((PinTypeRepository$PinType) obj) == PinTypeRepository$PinType.V1) {
            u8l0 u8l0Var = this.this$0;
            if (u8l0Var.a.m) {
                tpr Pd = u8l0Var.f.Pd();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
        }
        return zy11.a;
    }
}
