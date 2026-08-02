package defpackage;

import android.app.Activity;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.chat.h;
import com.yandex.messaging.input.d;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.internal.view.chat.e;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.ui.statuses.a;

/* loaded from: classes15.dex */
public final class qs10 implements v7p {
    public final xvf0 A;
    public final xvf0 B;
    public final xvf0 C;
    public final xvf0 D;
    public final xvf0 E;
    public final xvf0 F;
    public final xvf0 G;
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

    public /* synthetic */ qs10(n3w n3wVar, v8c0 v8c0Var, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, xvf0 xvf0Var20, v7p v7pVar3, xvf0 xvf0Var21, xvf0 xvf0Var22, xvf0 xvf0Var23, xvf0 xvf0Var24, xvf0 xvf0Var25, xvf0 xvf0Var26, xvf0 xvf0Var27, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = v8c0Var;
        this.d = v7pVar;
        this.e = v7pVar2;
        this.f = xvf0Var;
        this.g = xvf0Var2;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = xvf0Var9;
        this.o = xvf0Var10;
        this.p = xvf0Var11;
        this.q = xvf0Var12;
        this.r = xvf0Var13;
        this.s = xvf0Var14;
        this.t = xvf0Var15;
        this.u = xvf0Var16;
        this.v = xvf0Var17;
        this.w = xvf0Var18;
        this.x = xvf0Var19;
        this.y = xvf0Var20;
        this.z = v7pVar3;
        this.A = xvf0Var21;
        this.B = xvf0Var22;
        this.C = xvf0Var23;
        this.D = xvf0Var24;
        this.E = xvf0Var25;
        this.F = xvf0Var26;
        this.G = xvf0Var27;
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
                Activity activity = (Activity) xvf0Var22.get();
                ChatRequest chatRequest = (ChatRequest) xvf0Var21.get();
                mu10 mu10Var = (mu10) xvf0Var20.get();
                xs10 xs10Var = (xs10) xvf0Var19.get();
                g0 g0Var = (g0) xvf0Var18.get();
                h3y a = i5m.a(xvf0Var17);
                odz0 odz0Var = (odz0) xvf0Var16.get();
                h3y a2 = i5m.a(xvf0Var15);
                j0x j0xVar = (j0x) xvf0Var14.get();
                k0b k0bVar = (k0b) xvf0Var13.get();
                zbu0 zbu0Var = (zbu0) xvf0Var12.get();
                b bVar = (b) xvf0Var11.get();
                ryv ryvVar = (ryv) xvf0Var10.get();
                InputTextController inputTextController = (InputTextController) xvf0Var9.get();
                m0w m0wVar = (m0w) xvf0Var8.get();
                q0r q0rVar = (q0r) xvf0Var7.get();
                b00 b00Var = (b00) xvf0Var6.get();
                h3y a3 = i5m.a(xvf0Var5);
                return new ps10(activity, chatRequest, mu10Var, xs10Var, g0Var, a, odz0Var, a2, j0xVar, k0bVar, zbu0Var, bVar, ryvVar, inputTextController, m0wVar, q0rVar, b00Var, a3, (qu10) xvf0Var3.get(), (mdb) xvf0Var2.get(), (sfl0) xvf0Var.get(), (e2k0) this.x.get(), (b40) this.y.get(), (dbb) this.z.get(), (zm31) this.A.get(), (com.yandex.messaging.ui.timeline.b) this.B.get(), (g) this.C.get(), (ezq) this.D.get(), i5m.a(this.E), (ulg0) this.F.get(), (tlg0) this.G.get());
            default:
                return new jbz0((Activity) xvf0Var22.get(), (ChatRequest) xvf0Var21.get(), (hbz0) xvf0Var20.get(), (pu31) xvf0Var19.get(), (sfl0) xvf0Var18.get(), (ucz0) xvf0Var17.get(), (i) xvf0Var16.get(), (dbz0) xvf0Var15.get(), (blt0) xvf0Var14.get(), (ChatSearchToolbarBrick) xvf0Var13.get(), (c) xvf0Var12.get(), (e) xvf0Var11.get(), (ig3) xvf0Var10.get(), (com.yandex.messaging.internal.view.chat.b) xvf0Var9.get(), (mrh) xvf0Var8.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var6), (o9x) xvf0Var5.get(), (d) xvf0Var4.get(), (a) xvf0Var3.get(), (com.yandex.messaging.internal.view.chat.input.a) xvf0Var2.get(), (odz0) xvf0Var.get(), (m0w) this.x.get(), (com.yandex.messaging.domain.chat.e) this.y.get(), (com.yandex.messaging.ui.settings.a) this.z.get(), (h) this.A.get(), (jey0) this.B.get(), (com.yandex.messaging.internal.view.chat.input.textsuggest.c) this.C.get(), (n720) this.D.get(), (vse) this.E.get(), (oey0) this.F.get(), (rcy0) this.G.get());
        }
    }
}
