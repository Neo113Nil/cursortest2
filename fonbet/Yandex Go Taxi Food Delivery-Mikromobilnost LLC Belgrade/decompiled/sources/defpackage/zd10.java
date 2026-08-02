package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class zd10 {
    public final Uri a;
    public final String b;
    public final List c;
    public final String d;
    public final ImmutableList e;
    public final long f;

    static {
        x4e.x(0, 1, 2, 3, 4);
        tw21.Q(5);
        tw21.Q(6);
        tw21.Q(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zd10(Uri uri, String str, lkb1 lkb1Var, List list, String str2, ImmutableList immutableList, long j) {
        this.a = uri;
        this.b = eh20.q(str);
        this.c = list;
        this.d = str2;
        this.e = immutableList;
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < immutableList.size(); i++) {
            ((de10) immutableList.get(i)).getClass();
            aVar.a(new de10());
        }
        aVar.g();
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd10)) {
            return false;
        }
        zd10 zd10Var = (zd10) obj;
        return this.a.equals(zd10Var.a) && Objects.equals(this.b, zd10Var.b) && Objects.equals(null, null) && this.c.equals(zd10Var.c) && Objects.equals(this.d, zd10Var.d) && this.e.equals(zd10Var.e) && this.f == zd10Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 31;
        return (int) (((this.e.hashCode() + ((hashCode2 + (this.d != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.f);
    }
}
