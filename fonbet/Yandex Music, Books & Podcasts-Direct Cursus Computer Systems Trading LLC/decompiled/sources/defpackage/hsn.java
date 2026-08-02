package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hsn extends yqh implements esn {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public dsn l;
    public final /* synthetic */ jsn n;
    public int j = -1;
    public int m = -1;

    public hsn(jsn jsnVar, String str) {
        this.n = jsnVar;
        this.f = str;
    }

    @Override // defpackage.esn
    public final void a(dsn dsnVar) {
        gsn gsnVar = new gsn(this);
        this.l = dsnVar;
        int i = dsnVar.e;
        dsnVar.e = i + 1;
        int i2 = dsnVar.d;
        dsnVar.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        dsnVar.b(11, i2, i, null, bundle);
        dsnVar.h.put(i2, gsnVar);
        this.m = i;
        if (this.i) {
            dsnVar.a(i);
            int i3 = this.j;
            if (i3 >= 0) {
                dsnVar.c(this.m, i3);
                this.j = -1;
            }
            int i4 = this.k;
            if (i4 != 0) {
                dsnVar.d(this.m, i4);
                this.k = 0;
            }
        }
    }

    @Override // defpackage.esn
    public final int b() {
        return this.m;
    }

    @Override // defpackage.esn
    public final void c() {
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            int i = this.m;
            int i2 = dsnVar.d;
            dsnVar.d = i2 + 1;
            dsnVar.b(4, i2, i, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // defpackage.zqh
    public final void d() {
        jsn jsnVar = this.n;
        jsnVar.k.remove(this);
        c();
        jsnVar.m();
    }

    @Override // defpackage.zqh
    public final void e() {
        this.i = true;
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            dsnVar.a(this.m);
        }
    }

    @Override // defpackage.zqh
    public final void f(int i) {
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            dsnVar.c(this.m, i);
        } else {
            this.j = i;
            this.k = 0;
        }
    }

    @Override // defpackage.zqh
    public final void g() {
        h(0);
    }

    @Override // defpackage.zqh
    public final void h(int i) {
        this.i = false;
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = dsnVar.d;
            dsnVar.d = i3 + 1;
            dsnVar.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.zqh
    public final void i(int i) {
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            dsnVar.d(this.m, i);
        } else {
            this.k += i;
        }
    }

    @Override // defpackage.yqh
    public final String j() {
        return this.g;
    }

    @Override // defpackage.yqh
    public final String k() {
        return this.h;
    }

    @Override // defpackage.yqh
    public final void m(String str) {
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = dsnVar.d;
            dsnVar.d = i2 + 1;
            dsnVar.b(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.yqh
    public final void n(String str) {
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = dsnVar.d;
            dsnVar.d = i2 + 1;
            dsnVar.b(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.yqh
    public final void o(List list) {
        dsn dsnVar = this.l;
        if (dsnVar != null) {
            int i = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = dsnVar.d;
            dsnVar.d = i2 + 1;
            dsnVar.b(14, i2, i, null, bundle);
        }
    }
}
