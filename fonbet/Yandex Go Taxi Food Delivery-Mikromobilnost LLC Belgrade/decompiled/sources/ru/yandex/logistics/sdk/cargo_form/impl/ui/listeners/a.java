package ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners;

import defpackage.a470;
import defpackage.a570;
import defpackage.ao6;
import defpackage.b151;
import defpackage.bc;
import defpackage.bfq0;
import defpackage.bi20;
import defpackage.bm50;
import defpackage.c0k0;
import defpackage.c51;
import defpackage.d8q0;
import defpackage.d9u;
import defpackage.dib;
import defpackage.dv8;
import defpackage.e770;
import defpackage.eib;
import defpackage.h0w;
import defpackage.haq0;
import defpackage.hf5;
import defpackage.htg;
import defpackage.hu0;
import defpackage.io6;
import defpackage.j0;
import defpackage.j6s;
import defpackage.j73;
import defpackage.jbq0;
import defpackage.jgz;
import defpackage.jhd;
import defpackage.nao0;
import defpackage.p370;
import defpackage.p6s;
import defpackage.r9x0;
import defpackage.ryh;
import defpackage.s810;
import defpackage.scc;
import defpackage.sk7;
import defpackage.tje;
import defpackage.tv0;
import defpackage.u1n;
import defpackage.u61;
import defpackage.v4r0;
import defpackage.v570;
import defpackage.v8q0;
import defpackage.vng;
import defpackage.vv0;
import defpackage.wzw0;
import defpackage.x9x0;
import defpackage.xh20;
import defpackage.xw90;
import defpackage.yzj0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;
import ru.yandex.taxi.logistics.sdk.photocomments.api.PhotocommentsSource;

/* loaded from: classes5.dex */
public final class a {
    public final d8q0 a;
    public final sk7 b;
    public final u1n c;
    public final d8q0 d;
    public final ao6 e;
    public final u61 f;
    public final u61 g;
    public final bc h;
    public final d8q0 i;
    public final p370 j;
    public final ryh k;
    public final h0w l;
    public final u61 m;
    public final xh20 n;

    public a(d8q0 d8q0Var, sk7 sk7Var, u1n u1nVar, d8q0 d8q0Var2, ao6 ao6Var, u61 u61Var, u61 u61Var2, bc bcVar, d8q0 d8q0Var3, p370 p370Var, ryh ryhVar, h0w h0wVar, u61 u61Var3, xh20 xh20Var) {
        this.a = d8q0Var;
        this.b = sk7Var;
        this.c = u1nVar;
        this.d = d8q0Var2;
        this.e = ao6Var;
        this.f = u61Var;
        this.g = u61Var2;
        this.h = bcVar;
        this.i = d8q0Var3;
        this.j = p370Var;
        this.k = ryhVar;
        this.l = h0wVar;
        this.m = u61Var3;
        this.n = xh20Var;
    }

    public final void a(b151 b151Var) {
        Object value;
        Map map;
        if (b151Var instanceof v8q0) {
            v8q0 v8q0Var = (v8q0) b151Var;
            d8q0 d8q0Var = this.a;
            u1n.m(d8q0Var.b, v8q0Var.e);
            htg htgVar = d8q0Var.a;
            htgVar.getClass();
            if (vng.I() - htgVar.a >= 300) {
                ((hf5) d8q0Var.c.get()).b(v8q0Var.d, v8q0Var.c, j73.A(new r9x0[]{v8q0Var.b, v8q0Var.a}));
            }
            htgVar.a = vng.I();
            return;
        }
        if (b151Var instanceof jbq0) {
            sk7 sk7Var = this.b;
            htg.a((htg) sk7Var.b, new jhd(8, sk7Var, (jbq0) b151Var));
            return;
        }
        if (b151Var instanceof d9u) {
            d9u d9uVar = (d9u) b151Var;
            u1n u1nVar = this.c;
            htg htgVar2 = (htg) u1nVar.c;
            htgVar2.getClass();
            if (vng.I() - htgVar2.a >= 300) {
                dv8.c((dv8) u1nVar.b, c51.a, new hu0(0), d9uVar.a, null, 24);
            }
            htgVar2.a = vng.I();
            return;
        }
        if (b151Var instanceof bfq0) {
            d8q0 d8q0Var2 = this.d;
            htg.a(d8q0Var2.a, new nao0(22, (bfq0) b151Var, d8q0Var2));
            return;
        }
        if (b151Var instanceof io6) {
            io6 io6Var = (io6) b151Var;
            ao6 ao6Var = this.e;
            p6s p6sVar = ao6Var.a;
            String str = io6Var.a;
            boolean z = io6Var.c;
            String str2 = io6Var.b;
            u1n.m(ao6Var.b, io6Var.e);
            if (!io6Var.d) {
                if (z) {
                    p6sVar.c(null, str2);
                    return;
                } else {
                    p6sVar.c(str, str2);
                    return;
                }
            }
            j6s b = p6sVar.b();
            Object obj = (b == null || (map = b.a) == null) ? null : map.get(str2);
            Collection collection = obj instanceof Collection ? (Collection) obj : null;
            Set M0 = collection != null ? kotlin.collections.a.M0(collection) : new LinkedHashSet();
            if (z) {
                M0.remove(str);
            } else {
                M0.add(str);
            }
            p6sVar.c(M0.isEmpty() ? null : M0, str2);
            return;
        }
        if (b151Var instanceof haq0) {
            u61 u61Var = this.f;
            htg.a(u61Var.b, new j0(17, (haq0) b151Var, u61Var));
            return;
        }
        if (b151Var instanceof x9x0) {
            x9x0 x9x0Var = (x9x0) b151Var;
            u61 u61Var2 = this.g;
            u1n.m(u61Var2.a, x9x0Var.d);
            htg htgVar3 = u61Var2.b;
            htgVar3.getClass();
            if (vng.I() - htgVar3.a >= 300) {
                String str3 = x9x0Var.b;
                r9x0 r9x0Var = x9x0Var.a;
                if (str3 != null) {
                    ((hf5) u61Var2.d.get()).b(x9x0Var.c, str3, scc.h(r9x0Var));
                } else if (r9x0Var != null) {
                    ((c) u61Var2.c.get()).b(r9x0Var);
                }
            }
            htgVar3.a = vng.I();
            return;
        }
        if (b151Var instanceof dib) {
            dib dibVar = (dib) b151Var;
            bc bcVar = this.h;
            u1n.m((u1n) bcVar.a, dibVar.c);
            htg.a((htg) bcVar.b, new eib(dibVar, bcVar));
            return;
        }
        if (b151Var instanceof wzw0) {
            wzw0 wzw0Var = (wzw0) b151Var;
            d8q0 d8q0Var3 = this.i;
            u1n.m(d8q0Var3.b, wzw0Var.f);
            htg htgVar4 = d8q0Var3.a;
            htgVar4.getClass();
            if (vng.I() - htgVar4.a >= 300) {
                hf5 hf5Var = (hf5) d8q0Var3.c.get();
                String str4 = wzw0Var.d;
                boolean z2 = wzw0Var.a;
                hf5Var.b(z2 ? null : wzw0Var.e, str4, scc.h(!z2 ? wzw0Var.b : wzw0Var.c));
            }
            htgVar4.a = vng.I();
            return;
        }
        int i = 4;
        if (b151Var instanceof e770) {
            p370 p370Var = this.j;
            htg.a((htg) p370Var.b, new xw90(i, p370Var, (e770) b151Var));
            return;
        }
        boolean z3 = b151Var instanceof v570;
        ryh ryhVar = this.k;
        if (z3) {
            v570 v570Var = (v570) b151Var;
            ((h0w) ryhVar.b).h(v570Var.d, v570Var.b, v570Var.a, v570Var.c, PhotocommentsSource.GALLERY);
            return;
        }
        if (b151Var instanceof a470) {
            a470 a470Var = (a470) b151Var;
            ((h0w) ryhVar.b).h(a470Var.d, a470Var.b, a470Var.a, a470Var.c, PhotocommentsSource.CAMERA);
            return;
        }
        if (b151Var instanceof a570) {
            u61 u61Var3 = this.m;
            htg.a(u61Var3.b, new bm50(i, u61Var3, (a570) b151Var));
            return;
        }
        if (b151Var instanceof s810) {
            ((ru.yandex.taxi.logistics.sdk.photocomments.domain.a) ((h0w) ryhVar.b).b).i();
            return;
        }
        if (b151Var instanceof tv0) {
            vv0 vv0Var = (vv0) this.l.b;
            String str5 = ((tv0) b151Var).a;
            r0 r0Var = vv0Var.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, v4r0.i((Set) value, str5)));
            return;
        }
        if (!(b151Var instanceof bi20)) {
            if (b151Var != null) {
                jgz jgzVar = jgz.a;
                jgz.c(new Throwable("You forgot to add action handler in OnClickWidgetListener"));
                return;
            }
            return;
        }
        bi20 bi20Var = (bi20) b151Var;
        xh20 xh20Var = this.n;
        u1n.m(xh20Var.c, bi20Var.c);
        c0k0 c0k0Var = bi20Var.a;
        yzj0 yzj0Var = c0k0Var instanceof yzj0 ? (yzj0) c0k0Var : null;
        if (yzj0Var == null) {
            return;
        }
        tje.N(xh20Var.d, null, null, new MiniMapClickListener$onClick$1(xh20Var, bi20Var, yzj0Var, null), 3);
    }
}
