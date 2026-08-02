package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gnh {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final cnh c;
    public final vmh d;
    public final List e;
    public final String f;
    public final yde g;
    public final long h;

    static {
        int i2 = dvt.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public gnh(Uri uri, String str, cnh cnhVar, vmh vmhVar, List list, String str2, yde ydeVar, long j2) {
        this.a = uri;
        this.b = l5i.p(str);
        this.c = cnhVar;
        this.d = vmhVar;
        this.e = list;
        this.f = str2;
        this.g = ydeVar;
        tde u = yde.u();
        for (int i2 = 0; i2 < ydeVar.size(); i2++) {
            mnh mnhVar = (mnh) ydeVar.get(i2);
            eg0 eg0Var = new eg0();
            eg0Var.c = mnhVar.a;
            eg0Var.d = mnhVar.b;
            eg0Var.e = mnhVar.c;
            eg0Var.a = mnhVar.d;
            eg0Var.b = mnhVar.e;
            eg0Var.f = mnhVar.f;
            eg0Var.g = mnhVar.g;
            u.a(new lnh(eg0Var));
        }
        u.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnh)) {
            return false;
        }
        gnh gnhVar = (gnh) obj;
        return this.a.equals(gnhVar.a) && Objects.equals(this.b, gnhVar.b) && Objects.equals(this.c, gnhVar.c) && Objects.equals(this.d, gnhVar.d) && this.e.equals(gnhVar.e) && Objects.equals(this.f, gnhVar.f) && this.g.equals(gnhVar.g) && this.h == gnhVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        cnh cnhVar = this.c;
        int hashCode3 = (hashCode2 + (cnhVar == null ? 0 : cnhVar.hashCode())) * 31;
        vmh vmhVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (vmhVar == null ? 0 : vmhVar.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((hashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
