package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import yads.wh3;

/* loaded from: classes7.dex */
public final class uk61 implements ps81 {
    public final k781 a;
    public final sl81 b;
    public final q191 c;
    public final ff81 d;
    public boolean e;

    public uk61(k781 k781Var, sl81 sl81Var, q191 q191Var) {
        new pa81();
        ff81 ff81Var = new ff81();
        this.a = k781Var;
        this.b = sl81Var;
        this.c = q191Var;
        this.d = ff81Var;
    }

    @Override // defpackage.ps81
    public final void a(String str) {
        Object obj;
        u881 u881Var;
        au2 au2Var;
        boolean z = this.e;
        k781 k781Var = this.a;
        if (!z) {
            this.e = true;
            this.b.i(k781Var, "start");
        }
        this.d.getClass();
        hn71 hn71Var = k781Var.x;
        List list = (hn71Var == null || (au2Var = (au2) hn71Var.c) == null) ? null : au2Var.a;
        List list2 = EmptyList.a;
        if (list == null) {
            list = list2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((uy71) obj).a.equals(str)) {
                    break;
                }
            }
        }
        uy71 uy71Var = (uy71) obj;
        fj71 fj71Var = uy71Var != null ? uy71Var.d : null;
        if (fj71Var != null) {
            u881Var = new u881(fj71Var.d, fj71Var.c);
        } else {
            String str2 = k781Var.y;
            List list3 = (List) ((LinkedHashMap) k781Var.a()).get("clickTracking");
            if (list3 != null) {
                list2 = a.M(list3);
            }
            u881Var = new u881(str2, list2);
        }
        this.c.a(u881Var.a, b.f());
    }

    @Override // defpackage.ps81
    public final void b() {
        this.b.i(this.a, "complete");
    }

    @Override // defpackage.ps81
    public final void c(wh3 wh3Var) {
        String str;
        int ordinal = wh3Var.ordinal();
        if (ordinal == 0) {
            str = "firstQuartile";
        } else if (ordinal == 1) {
            str = "midpoint";
        } else {
            if (ordinal != 2) {
                w511.b();
                return;
            }
            str = "thirdQuartile";
        }
        this.b.i(this.a, str);
    }

    @Override // defpackage.ps81
    public final void d(float f, long j) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.i(this.a, "start");
    }

    @Override // defpackage.ps81
    public final /* bridge */ void f() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void g() {
    }

    @Override // defpackage.ps81
    public final void h() {
        this.b.i(this.a, "creativeView");
    }

    @Override // defpackage.ps81
    public final void j() {
        this.b.i(new i971(14, this.a), "creativeRenderingStart");
    }

    @Override // defpackage.ps81
    public final /* bridge */ void k() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void l(float f) {
    }

    @Override // defpackage.ps81
    public final void n() {
        this.e = false;
    }

    @Override // defpackage.ps81
    public final void o() {
        this.b.i(this.a, "mute");
    }

    @Override // defpackage.ps81
    public final void p() {
        boolean z = this.e;
        k781 k781Var = this.a;
        sl81 sl81Var = this.b;
        if (!z) {
            this.e = true;
            sl81Var.i(k781Var, "start");
        }
        sl81Var.i(k781Var, "clickTracking");
    }

    @Override // defpackage.ps81
    public final /* bridge */ void q() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void b(cf71 cf71Var) {
    }

    @Override // defpackage.ps81
    public final void d() {
        this.b.i(this.a, "pause");
    }

    @Override // defpackage.ps81
    public final void c() {
        this.b.i(this.a, "resume");
    }

    @Override // defpackage.ps81
    public final void a() {
        this.b.i(this.a, "unmute");
    }

    @Override // defpackage.ps81
    public final /* bridge */ void a(View view) {
    }
}
