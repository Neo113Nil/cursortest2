package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.c;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.preorder.source.pickup.a;

/* loaded from: classes6.dex */
public final class rdt0 implements v7p {
    public final xvf0 A;
    public final xvf0 B;
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;
    public final xvf0 w;
    public final xvf0 x;
    public final xvf0 y;
    public final xvf0 z;

    public /* synthetic */ rdt0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, v7p v7pVar, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var17, v7p v7pVar4, xvf0 xvf0Var18, v7p v7pVar5, xvf0 xvf0Var19, xvf0 xvf0Var20, xvf0 xvf0Var21, xvf0 xvf0Var22, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = v7pVar;
        this.p = xvf0Var14;
        this.q = xvf0Var15;
        this.r = xvf0Var16;
        this.s = v7pVar2;
        this.t = v7pVar3;
        this.u = xvf0Var17;
        this.v = v7pVar4;
        this.w = xvf0Var18;
        this.x = v7pVar5;
        this.y = xvf0Var19;
        this.z = xvf0Var20;
        this.A = xvf0Var21;
        this.B = xvf0Var22;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.w;
        xvf0 xvf0Var2 = this.v;
        xvf0 xvf0Var3 = this.u;
        xvf0 xvf0Var4 = this.t;
        xvf0 xvf0Var5 = this.s;
        xvf0 xvf0Var6 = this.r;
        xvf0 xvf0Var7 = this.q;
        xvf0 xvf0Var8 = this.p;
        xvf0 xvf0Var9 = this.o;
        xvf0 xvf0Var10 = this.n;
        xvf0 xvf0Var11 = this.m;
        xvf0 xvf0Var12 = this.l;
        xvf0 xvf0Var13 = this.k;
        xvf0 xvf0Var14 = this.j;
        xvf0 xvf0Var15 = this.i;
        xvf0 xvf0Var16 = this.h;
        xvf0 xvf0Var17 = this.g;
        xvf0 xvf0Var18 = this.f;
        xvf0 xvf0Var19 = this.e;
        xvf0 xvf0Var20 = this.d;
        xvf0 xvf0Var21 = this.c;
        xvf0 xvf0Var22 = this.b;
        switch (i) {
            case 0:
                return new r((Lifecycle) xvf0Var22.get(), (git0) xvf0Var21.get(), (Context) xvf0Var20.get(), (a) xvf0Var19.get(), (d) xvf0Var18.get(), (ypb0) xvf0Var17.get(), (drb0) xvf0Var16.get(), (com.yandex.go.pin.api.a) xvf0Var15.get(), (ah00) xvf0Var14.get(), (dqe0) xvf0Var13.get(), (i130) xvf0Var12.get(), (tit0) xvf0Var11.get(), (c) xvf0Var10.get(), (e) xvf0Var9.get(), (agt0) xvf0Var8.get(), (AddressResolveRepository) xvf0Var7.get(), (ng9) xvf0Var6.get(), (y8s0) xvf0Var5.get(), (p9s0) xvf0Var4.get(), (qy41) xvf0Var3.get(), (nh9) xvf0Var2.get(), (rft0) xvf0Var.get(), (c8s0) this.x.get(), (tb1) this.y.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) this.z.get(), (sit) this.A.get(), (djt0) this.B.get());
            default:
                tse tseVar = (tse) xvf0Var22.get();
                zuj0 zuj0Var = (zuj0) xvf0Var21.get();
                ss21 ss21Var = (ss21) xvf0Var19.get();
                tt2 tt2Var = (tt2) xvf0Var18.get();
                a980 a980Var = (a980) xvf0Var17.get();
                Activity activity = (Activity) xvf0Var16.get();
                ney neyVar = (ney) xvf0Var15.get();
                tj60 tj60Var = (tj60) xvf0Var12.get();
                Context context = (Context) xvf0Var11.get();
                pg7 pg7Var = (pg7) xvf0Var10.get();
                rs2 rs2Var = (rs2) xvf0Var9.get();
                ysg ysgVar = (ysg) xvf0Var8.get();
                hg7 hg7Var = (hg7) xvf0Var7.get();
                s7h s7hVar = (s7h) xvf0Var6.get();
                return new kv1(tseVar, zuj0Var, ss21Var, tt2Var, a980Var, activity, neyVar, tj60Var, context, pg7Var, rs2Var, ysgVar, hg7Var, s7hVar, (pho) xvf0Var2.get(), (w030) xvf0Var.get(), (fzx0) this.x.get(), (com.yandex.go.taxi.order.chat.domain.a) this.y.get(), (p2y0) this.z.get(), (oep0) this.A.get(), (pav) this.B.get());
        }
    }
}
