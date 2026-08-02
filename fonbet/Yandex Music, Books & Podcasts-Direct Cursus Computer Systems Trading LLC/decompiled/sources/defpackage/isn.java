package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class isn extends zqh implements esn {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public dsn f;
    public int g;
    public final /* synthetic */ jsn h;

    public isn(jsn jsnVar, String str, String str2) {
        this.h = jsnVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.esn
    public final void a(dsn dsnVar) {
        this.f = dsnVar;
        int i = dsnVar.e;
        dsnVar.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = dsnVar.d;
        dsnVar.d = i2 + 1;
        dsnVar.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            dsnVar.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                dsnVar.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                dsnVar.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override // defpackage.esn
    public final int b() {
        return this.g;
    }

    @Override // defpackage.esn
    public final void c() {
        dsn dsnVar = this.f;
        if (dsnVar != null) {
            int i = this.g;
            int i2 = dsnVar.d;
            dsnVar.d = i2 + 1;
            dsnVar.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.zqh
    public final void d() {
        jsn jsnVar = this.h;
        jsnVar.k.remove(this);
        c();
        jsnVar.m();
    }

    @Override // defpackage.zqh
    public final void e() {
        this.c = true;
        dsn dsnVar = this.f;
        if (dsnVar != null) {
            dsnVar.a(this.g);
        }
    }

    @Override // defpackage.zqh
    public final void f(int i) {
        dsn dsnVar = this.f;
        if (dsnVar != null) {
            dsnVar.c(this.g, i);
        } else {
            this.d = i;
            this.e = 0;
        }
    }

    @Override // defpackage.zqh
    public final void g() {
        h(0);
    }

    @Override // defpackage.zqh
    public final void h(int i) {
        this.c = false;
        dsn dsnVar = this.f;
        if (dsnVar != null) {
            int i2 = this.g;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = dsnVar.d;
            dsnVar.d = i3 + 1;
            dsnVar.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.zqh
    public final void i(int i) {
        dsn dsnVar = this.f;
        if (dsnVar != null) {
            dsnVar.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
