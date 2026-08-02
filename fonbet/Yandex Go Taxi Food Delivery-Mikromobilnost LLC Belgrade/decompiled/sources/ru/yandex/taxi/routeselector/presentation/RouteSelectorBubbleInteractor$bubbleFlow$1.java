package ru.yandex.taxi.routeselector.presentation;

import com.yandex.go.pin.api.widget.PinTypeRepository$PinType;
import defpackage.dok0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u8l0;
import defpackage.vpr;
import defpackage.w0c0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorBubbleInteractor$bubbleFlow$1", f = "RouteSelectorBubbleInteractor.kt", l = {52, 54, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorBubbleInteractor$bubbleFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $invalidAddressFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ u8l0 this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invalid", "bubbleInfo"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorBubbleInteractor$bubbleFlow$1$1", f = "RouteSelectorBubbleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.routeselector.presentation.RouteSelectorBubbleInteractor$bubbleFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ u8l0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u8l0 u8l0Var, Continuation continuation) {
            super(3, continuation);
            this.this$0 = u8l0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.Z$0 = booleanValue;
            anonymousClass1.L$0 = (Pair) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return z ? this.this$0.g : pair;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorBubbleInteractor$bubbleFlow$1(u8l0 u8l0Var, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u8l0Var;
        this.$invalidAddressFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteSelectorBubbleInteractor$bubbleFlow$1 routeSelectorBubbleInteractor$bubbleFlow$1 = new RouteSelectorBubbleInteractor$bubbleFlow$1(this.this$0, this.$invalidAddressFlow, continuation);
        routeSelectorBubbleInteractor$bubbleFlow$1.L$0 = obj;
        return routeSelectorBubbleInteractor$bubbleFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorBubbleInteractor$bubbleFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r3, r0, r9) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r10 == r1) goto L24;
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
                if (i != 2 && i != 3) {
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
                m0 m0Var = new m0(this.$invalidAddressFlow, new b(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) u8l0Var.b).e(), new dok0((byte) 0, 24)), u8l0Var), new AnonymousClass1(this.this$0, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
        }
        Pair pair = this.this$0.g;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
    }
}
