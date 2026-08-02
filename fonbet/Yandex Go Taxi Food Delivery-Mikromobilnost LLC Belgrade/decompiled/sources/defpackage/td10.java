package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class td10 {
    public String a;
    public Uri b;
    public String c;
    public final ud10 d;
    public final r400 e;
    public List f;
    public String g;
    public final ImmutableList h;
    public final long i;
    public final re10 j;
    public xd10 k;
    public final be10 l;

    public td10(fe10 fe10Var) {
        this();
        wd10 wd10Var = fe10Var.e;
        ud10 ud10Var = new ud10();
        ud10Var.a = wd10Var.a;
        this.d = ud10Var;
        this.a = fe10Var.a;
        this.j = fe10Var.d;
        this.k = fe10Var.c.a();
        this.l = fe10Var.f;
        zd10 zd10Var = fe10Var.b;
        if (zd10Var != null) {
            this.g = zd10Var.d;
            this.c = zd10Var.b;
            this.b = zd10Var.a;
            this.f = zd10Var.c;
            this.h = zd10Var.e;
            this.e = new r400();
            this.i = zd10Var.f;
        }
    }

    public final fe10 a() {
        zd10 zd10Var;
        r400 r400Var = this.e;
        r400Var.getClass();
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            r400Var.getClass();
            zd10Var = new zd10(uri, str, null, this.f, this.g, this.h, this.i);
        } else {
            zd10Var = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ud10 ud10Var = this.d;
        ud10Var.getClass();
        wd10 wd10Var = new wd10(ud10Var);
        xd10 xd10Var = this.k;
        xd10Var.getClass();
        yd10 yd10Var = new yd10(xd10Var);
        re10 re10Var = this.j;
        if (re10Var == null) {
            re10Var = re10.B;
        }
        return new fe10(str3, wd10Var, zd10Var, yd10Var, re10Var, this.l);
    }

    public final void b(String str) {
        this.b = str == null ? null : Uri.parse(str);
    }

    public td10() {
        this.d = new ud10();
        this.e = new r400();
        this.f = Collections.EMPTY_LIST;
        this.h = ImmutableList.p();
        this.k = new xd10();
        this.l = be10.a;
        this.i = -9223372036854775807L;
    }
}
