package ru.yandex.taxi.linked_order.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.cpy;
import defpackage.g20;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzr;
import defpackage.t201;
import defpackage.vwn;
import defpackage.w511;
import defpackage.yoy;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\u00062\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/mapkit/geometry/Point;", "positionInfo", "Lt201;", "carPosition", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lkotlin/Pair;Lt201;)Ljava/util/ArrayList;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1", f = "LinkedOrderMapOverlayDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1(Continuation continuation, f0 f0Var) {
        super(3, continuation);
        this.this$0 = f0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1 linkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1 = new LinkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1((Continuation) obj3, this.this$0);
        linkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1.L$0 = (Pair) obj;
        linkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1.L$1 = (t201) obj2;
        return linkedOrderMapOverlayDataInteractor$listenFocusAllPoints$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        t201 t201Var = (t201) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        nzr nzrVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList t = g8e.t(obj);
        f0 f0Var = this.this$0;
        Object c = pair.c();
        if (c != null) {
            t.add(c);
        }
        Object f = pair.f();
        if (f != null) {
            t.add(f);
        }
        zzs zzsVar = t201Var.a;
        Point point = zzsVar != null ? new Point(zzsVar.a, zzsVar.b) : null;
        if (point != null) {
            t.add(point);
        }
        yoy yoyVar = ((cpy) f0Var.g.get()).j;
        if (yoyVar instanceof g20) {
            nzrVar = ((g20) yoyVar).a.a();
        } else if (!jl40.l(yoyVar, vwn.a)) {
            w511.b();
            return null;
        }
        if (nzrVar != null) {
            List list = nzrVar.b;
            int size = list.size();
            for (int i = nzrVar.a; i < size; i++) {
                t.add(list.get(i));
            }
        }
        return t;
    }
}
