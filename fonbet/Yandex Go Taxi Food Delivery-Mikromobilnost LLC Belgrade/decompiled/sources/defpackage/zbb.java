package defpackage;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.b;
import com.yandex.messaging.domain.d;
import com.yandex.messaging.domain.miniapp.c;
import com.yandex.messaging.internal.e;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.timeline.ChatItemHighlighter;
import com.yandex.messaging.internal.view.timeline.common.a;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.internal.view.timeline.m;
import com.yandex.messaging.internal.view.timeline.o;
import com.yandex.messaging.ui.timeline.f;

/* loaded from: classes15.dex */
public final class zbb implements v7p {
    public final xvf0 A;
    public final xvf0 B;
    public final xvf0 C;
    public final xvf0 D;
    public final xvf0 E;
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

    public /* synthetic */ zbb(v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, v7p v7pVar3, v7p v7pVar4, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, v7p v7pVar5, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, xvf0 xvf0Var20, xvf0 xvf0Var21, xvf0 xvf0Var22, xvf0 xvf0Var23, xvf0 xvf0Var24, xvf0 xvf0Var25, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = v7pVar2;
        this.d = xvf0Var;
        this.e = v7pVar3;
        this.f = v7pVar4;
        this.g = xvf0Var2;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = v7pVar5;
        this.o = xvf0Var9;
        this.p = xvf0Var10;
        this.q = xvf0Var11;
        this.r = xvf0Var12;
        this.s = xvf0Var13;
        this.t = xvf0Var14;
        this.u = xvf0Var15;
        this.v = xvf0Var16;
        this.w = xvf0Var17;
        this.x = xvf0Var18;
        this.y = xvf0Var19;
        this.z = xvf0Var20;
        this.A = xvf0Var21;
        this.B = xvf0Var22;
        this.C = xvf0Var23;
        this.D = xvf0Var24;
        this.E = xvf0Var25;
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
                ps10 ps10Var = (ps10) xvf0Var22.get();
                ChatRequest chatRequest = (ChatRequest) xvf0Var21.get();
                pbb pbbVar = (pbb) xvf0Var20.get();
                k6b k6bVar = (k6b) xvf0Var19.get();
                p4t p4tVar = (p4t) xvf0Var18.get();
                d dVar = (d) xvf0Var17.get();
                g0 g0Var = (g0) xvf0Var16.get();
                hab habVar = (hab) xvf0Var15.get();
                tdz0 tdz0Var = (tdz0) xvf0Var14.get();
                qaz0 qaz0Var = (qaz0) xvf0Var13.get();
                ChatInputHeightState chatInputHeightState = (ChatInputHeightState) xvf0Var12.get();
                h3y a = i5m.a(xvf0Var11);
                q6b q6bVar = (q6b) xvf0Var10.get();
                hkk hkkVar = (hkk) xvf0Var9.get();
                return new i(ps10Var, chatRequest, pbbVar, k6bVar, p4tVar, dVar, g0Var, habVar, tdz0Var, qaz0Var, chatInputHeightState, a, q6bVar, hkkVar, (ChatItemHighlighter) xvf0Var7.get(), (w3c) xvf0Var6.get(), (sbi0) xvf0Var5.get(), (pu31) xvf0Var4.get(), (m) xvf0Var3.get(), (wcz0) xvf0Var2.get(), (dbb) xvf0Var.get(), (mdb) this.x.get(), (a) this.y.get(), (pcb) this.z.get(), (qbz0) this.A.get(), (x4t) this.B.get(), (ulg0) this.C.get(), (wk31) this.D.get(), (vse) this.E.get());
            default:
                return new f((Activity) xvf0Var22.get(), (hbz0) xvf0Var21.get(), (jbz0) xvf0Var20.get(), (ChatRequest) xvf0Var19.get(), (izg) xvf0Var18.get(), (xqi0) xvf0Var17.get(), (q6b) xvf0Var16.get(), (b00) xvf0Var15.get(), (odz0) xvf0Var14.get(), (q3f0) xvf0Var13.get(), (h4g0) xvf0Var12.get(), (e) xvf0Var11.get(), (b) xvf0Var10.get(), (u4t) xvf0Var9.get(), (w270) xvf0Var8.get(), (key0) xvf0Var7.get(), (com.yandex.messaging.ui.timeline.b) xvf0Var6.get(), (hcz0) xvf0Var5.get(), (com.yandex.messaging.ui.timeline.d) xvf0Var4.get(), (q0r) xvf0Var3.get(), (ps10) xvf0Var2.get(), (ryv) xvf0Var.get(), (apq0) this.x.get(), (nh20) this.y.get(), (nh20) this.z.get(), (lqo) this.A.get(), (c) this.B.get(), (e9t) this.C.get(), (x22) this.D.get(), (o) this.E.get());
        }
    }
}
