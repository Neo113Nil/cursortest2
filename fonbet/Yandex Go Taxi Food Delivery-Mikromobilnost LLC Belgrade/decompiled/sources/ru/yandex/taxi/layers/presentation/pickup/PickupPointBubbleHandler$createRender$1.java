package ru.yandex.taxi.layers.presentation.pickup;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.mapkit.map.IconStyle;
import defpackage.bms;
import defpackage.f4c0;
import defpackage.ha2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1", f = "PickupPointBubbleHandler.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PickupPointBubbleHandler$createRender$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "", "render", "isAvailable", "isMuted"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$1", f = "PickupPointBubbleHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
            anonymousClass1.L$0 = (Bitmap) obj;
            anonymousClass1.Z$0 = booleanValue;
            anonymousClass1.Z$1 = booleanValue2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap = (Bitmap) this.L$0;
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair(bitmap, Boolean.valueOf(z && !z2));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$2", f = "PickupPointBubbleHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Pair) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Bitmap bitmap = (Bitmap) pair.getFirst();
            boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
            b bVar = this.this$0;
            f4c0 f4c0Var = bVar.e;
            if (bitmap != null) {
                f4c0Var.x(bitmap);
                f4c0Var.D(new IconStyle().setAnchor(((Boolean) bVar.m.getValue()).booleanValue() ? new PointF(0.5f, 1.15f) : new PointF(0.5f, -0.15f)));
                f4c0Var.i(booleanValue);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupPointBubbleHandler$createRender$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickupPointBubbleHandler$createRender$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointBubbleHandler$createRender$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            g I = e.I(bVar.l, new PickupPointBubbleHandler$createRender$1$loaderFlow$1(bVar, null));
            b bVar2 = this.this$0;
            g I2 = e.I(e.m(bVar2.k, I, bVar2.m, bVar2.n, new PickupPointBubbleHandler$createRender$1$renderFlow$1(5, null)), new PickupPointBubbleHandler$createRender$1$renderFlow$2(this.this$0, null));
            b bVar3 = this.this$0;
            ha2 n = e.n(I2, bVar3.o, bVar3.p, new AnonymousClass1(4, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.k(n, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
