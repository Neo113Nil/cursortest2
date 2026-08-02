package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetRepeatModeCommand;
import com.yandex.music.shared.ynison.api.deps.bridge.YnisonNetworkStateProvider$UnsupportedException;
import com.yandex.plus.acquisition.adapter.api.e;
import com.yandex.plus.acquisition.adapter.api.f;
import com.yandex.plus.acquisition.adapter.api.g;
import com.yandex.plus.acquisition.adapter.api.h;
import com.yandex.plus.acquisition.adapter.api.i;
import com.yandex.plus.acquisition.adapter.api.j;
import com.yandex.plus.acquisition.adapter.api.l;
import com.yandex.plus.acquisition.adapter.api.n;
import com.yandex.plus.acquisition.sdk.pay.common.api.a;
import com.yandex.plus.acquisition.sdk.pay.common.api.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.m;
import com.yandex.plus.acquisition.sdk.pay.common.api.o;
import com.yandex.plus.acquisition.sdk.pay.common.api.p;
import com.yandex.plus.acquisition.sdk.pay.common.api.q;
import com.yandex.plus.acquisition.sdk.pay.common.api.r;
import com.yandex.plus.acquisition.sdk.pay.common.api.s;
import com.yandex.plus.acquisition.sdk.pay.common.api.t;
import com.yandex.plus.acquisition.sdk.pay.impl.b;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vx4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(es6 es6Var, Collection collection, String str, cvl cvlVar, oq oqVar, Continuation continuation) {
        super(1, continuation);
        this.j = 1;
        this.m = es6Var;
        this.n = collection;
        this.l = str;
        this.o = cvlVar;
        this.p = oqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vx4((yx4) this.m, (String) this.l, (String) this.n, (Boolean) this.o, (Integer) this.p, continuation, 0);
            case 1:
                return new vx4((es6) this.m, (Collection) this.n, (String) this.l, (cvl) this.o, (oq) this.p, continuation);
            case 2:
                return new vx4((btl) this.m, (String) this.l, (String) this.n, (Integer) this.p, (List) this.o, continuation);
            case 3:
                return new vx4((wkp) this.l, continuation, (i8l) this.n, (n7q) this.o, (wkp) this.p);
            case 4:
                return new vx4((u9n) this.l, (akw) this.n, (z4q) this.o, (Map) this.p, continuation);
            default:
                return new vx4((b) this.m, (k) this.l, (a) this.n, (Map) this.o, (com.yandex.plus.acquisition.adapter.internal.controller.a) this.p, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((vx4) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0104, code lost:
    
        if (r1 == r0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        xab xabVar;
        Object f2;
        xab xabVar2;
        Object Q;
        taq taqVar;
        baq baqVar;
        Object a;
        int i = this.j;
        int i2 = 0;
        int i3 = 2;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.l;
        int i4 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable z = ((yx4) this.m).z((String) obj5, (String) obj4, (Boolean) obj3, (Integer) obj2, this);
                    return z == nm6Var ? nm6Var : z;
                }
                if (i5 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((es6) this.m).J((Collection) obj4, (String) obj5, (cvl) obj3, (oq) obj2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable b = btl.b((btl) this.m, (String) obj5, (String) obj4, (Integer) obj2, (List) obj3, this);
                    return b == nm6Var3 ? nm6Var3 : b;
                }
                if (i7 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                wkp wkpVar = (wkp) obj2;
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ump umpVar = (ump) this.m;
                    qgg.h0(obj);
                    return umpVar;
                }
                qgg.h0(obj);
                NoopCallbackCommand noopCallbackCommand = new NoopCallbackCommand();
                int g = ((i8l) obj4).g();
                nyn G = bzf.G(g != 0 ? g != 1 ? g != 2 ? nyn.a : nyn.c : nyn.b : nyn.a, (n7q) obj3);
                wkpVar.d.b(new eyk(u75.h(new SetRepeatModeCommand(G), noopCallbackCommand)), new b3t("queue_repeat"));
                wkpVar.e.j(G, true);
                ump umpVar2 = wkpVar.f;
                this.m = umpVar2;
                this.k = 1;
                return wkp.a((wkp) obj5, noopCallbackCommand, this) == nm6Var4 ? nm6Var4 : umpVar2;
            case 4:
                akw akwVar = (akw) obj4;
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                int i10 = 3;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        Q = obj;
                        return new djw((bbq) Q);
                    }
                    if (i9 == 2) {
                        xabVar2 = (xab) this.m;
                        qgg.h0(obj);
                        f2 = obj;
                        taqVar = (taq) f2;
                        if (taqVar == null) {
                            return new cjw(taqVar);
                        }
                        throw new YnisonNetworkStateProvider$UnsupportedException("Video wave fetch error: " + xabVar2);
                    }
                    if (i9 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xabVar = (xab) this.m;
                    qgg.h0(obj);
                    f = obj;
                    baqVar = (baq) f;
                    if (baqVar == null) {
                        return new ajw(baqVar);
                    }
                    throw new YnisonNetworkStateProvider$UnsupportedException("Generative fetch error: " + xabVar);
                }
                qgg.h0(obj);
                u9n u9nVar = (u9n) obj5;
                xab xabVar3 = u9nVar.a;
                if (xabVar3 instanceof wab) {
                    List list = u9nVar.b;
                    this.m = null;
                    this.k = 1;
                    String str = akw.j;
                    Q = gld.Q(new qjw(akwVar, list, (wab) xabVar3, (z4q) obj3, (Map) obj2, null), this);
                    break;
                } else if (xabVar3 instanceof vab) {
                    ujw ujwVar = new ujw(xabVar3, continuation, i2);
                    ujw ujwVar2 = new ujw(xabVar3, continuation, i4);
                    this.m = xabVar3;
                    this.k = 2;
                    f2 = akwVar.f(false, ujwVar, ujwVar2, this);
                    if (f2 != nm6Var5) {
                        xabVar2 = xabVar3;
                        taqVar = (taq) f2;
                        if (taqVar == null) {
                        }
                    }
                } else {
                    if (xabVar3 instanceof sab) {
                        throw new YnisonNetworkStateProvider$UnsupportedException("FM not included into host configuration");
                    }
                    if (!(xabVar3 instanceof tab)) {
                        if (xabVar3.equals(uab.a)) {
                            throw new YnisonNetworkStateProvider$UnsupportedException(String.valueOf(xabVar3));
                        }
                        b6e.s();
                        return null;
                    }
                    ujw ujwVar3 = new ujw(xabVar3, continuation, i3);
                    ujw ujwVar4 = new ujw(xabVar3, continuation, i10);
                    this.m = xabVar3;
                    this.k = 3;
                    f = akwVar.f(false, ujwVar3, ujwVar4, this);
                    if (f != nm6Var5) {
                        xabVar = xabVar3;
                        baqVar = (baq) f;
                        if (baqVar == null) {
                        }
                    }
                }
                return nm6Var5;
            default:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    c cVar = (c) ((b) this.m).g.getValue();
                    this.k = 1;
                    a = ((com.yandex.plus.acquisition.sdk.pay.impl.purchase.b) cVar).a((k) obj5, (a) obj4, (Map) obj3, this);
                    if (a == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                t tVar = (t) a;
                if (tVar instanceof s) {
                    return n.a;
                }
                if (tVar instanceof m) {
                    return new f(((m) tVar).a);
                }
                if (Intrinsics.d(tVar, com.yandex.plus.acquisition.sdk.pay.common.api.n.a)) {
                    return g.a;
                }
                if (tVar instanceof o) {
                    return new h(((o) tVar).a);
                }
                if (tVar instanceof p) {
                    return new i(((p) tVar).a);
                }
                if (Intrinsics.d(tVar, q.a)) {
                    return j.a;
                }
                if (Intrinsics.d(tVar, r.a)) {
                    return l.a;
                }
                if (Intrinsics.d(tVar, com.yandex.plus.acquisition.sdk.pay.common.api.l.a)) {
                    return e.a;
                }
                b6e.s();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(btl btlVar, String str, String str2, Integer num, List list, Continuation continuation) {
        super(1, continuation);
        this.j = 2;
        this.m = btlVar;
        this.l = str;
        this.n = str2;
        this.p = num;
        this.o = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(u9n u9nVar, akw akwVar, z4q z4qVar, Map map, Continuation continuation) {
        super(1, continuation);
        this.j = 4;
        this.l = u9nVar;
        this.n = akwVar;
        this.o = z4qVar;
        this.p = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(wkp wkpVar, Continuation continuation, i8l i8lVar, n7q n7qVar, wkp wkpVar2) {
        super(1, continuation);
        this.j = 3;
        this.l = wkpVar;
        this.n = i8lVar;
        this.o = n7qVar;
        this.p = wkpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.m = obj;
        this.l = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
    }
}
