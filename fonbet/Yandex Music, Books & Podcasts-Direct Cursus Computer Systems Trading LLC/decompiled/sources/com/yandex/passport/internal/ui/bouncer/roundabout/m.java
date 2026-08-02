package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.passport.data.network.s7;
import defpackage.c5b;
import defpackage.k8g;
import defpackage.l8f;
import defpackage.opn;
import defpackage.q0v;
import defpackage.r13;
import defpackage.szm;
import defpackage.t13;
import defpackage.u75;
import defpackage.yk4;
import defpackage.yra;
import defpackage.zra;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class m extends k8g implements r13 {
    public final List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(final szm szmVar, final szm szmVar2, s7 s7Var, s7 s7Var2, d dVar) {
        super(new l8f(1));
        szmVar.getClass();
        szmVar2.getClass();
        final int i = 0;
        zra zraVar = new zra(new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context context = (Context) obj;
                switch (i) {
                    case 0:
                        context.getClass();
                        Object obj2 = szmVar.get();
                        obj2.getClass();
                        return (t13) obj2;
                    default:
                        context.getClass();
                        Object obj3 = szmVar.get();
                        obj3.getClass();
                        return (t13) obj3;
                }
            }
        }, l.b);
        final int i2 = 1;
        List h = u75.h(zraVar, new zra(new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context context = (Context) obj;
                switch (i2) {
                    case 0:
                        context.getClass();
                        Object obj2 = szmVar2.get();
                        obj2.getClass();
                        return (t13) obj2;
                    default:
                        context.getClass();
                        Object obj3 = szmVar2.get();
                        obj3.getClass();
                        return (t13) obj3;
                }
            }
        }, l.c), new zra(new q0v(29, s7Var), l.d), new zra(new k(0, s7Var2), l.e), new zra(new k(1, dVar), l.f));
        c5b c5bVar = c5b.a;
        h.getClass();
        c5bVar.getClass();
        this.e = h;
    }

    @Override // defpackage.r13
    public final void e(Object obj) {
        List list = (List) obj;
        list.getClass();
        super.v(new ArrayList(list));
    }

    @Override // defpackage.qon
    public final int f(int i) {
        Object u = u(i);
        int i2 = 0;
        for (Object obj : this.e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            u.getClass();
            if (((Boolean) ((zra) obj).b.invoke(u)).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        throw new IllegalStateException(("No matching chunk for item " + u + " at position " + i).toString());
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        Object u = u(i);
        u.getClass();
        ((yk4) opnVar).e(u);
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        zra zraVar = (zra) this.e.get(i);
        Context context = viewGroup.getContext();
        context.getClass();
        zraVar.getClass();
        t13 t13Var = (t13) zraVar.a.invoke(context);
        return new yk4(t13Var, new yra(t13Var));
    }

    @Override // defpackage.k8g
    public final void v(List list) {
        throw null;
    }
}
