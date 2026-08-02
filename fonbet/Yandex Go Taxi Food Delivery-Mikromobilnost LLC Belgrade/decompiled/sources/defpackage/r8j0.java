package defpackage;

import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r8j0 extends u8j0 {
    public final Object a;
    public final boolean b;
    public final boolean c;
    public final RequestStatus$Data$Source d;

    public /* synthetic */ r8j0(Object obj, RequestStatus$Data$Source requestStatus$Data$Source, int i) {
        this(obj, (i & 2) == 0, true, (i & 8) != 0 ? null : requestStatus$Data$Source);
    }

    public static r8j0 d(r8j0 r8j0Var, wtt0 wtt0Var, boolean z, boolean z2, int i) {
        Object obj = wtt0Var;
        if ((i & 1) != 0) {
            obj = r8j0Var.a;
        }
        if ((i & 2) != 0) {
            z = r8j0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = r8j0Var.c;
        }
        return new r8j0(obj, z, z2, r8j0Var.d);
    }

    @Override // defpackage.u8j0
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.u8j0
    public final u8j0 c() {
        return new r8j0(this.a, null, 12);
    }

    public final Object e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8j0)) {
            return false;
        }
        r8j0 r8j0Var = (r8j0) obj;
        return jl40.l(this.a, r8j0Var.a) && this.b == r8j0Var.b && this.c == r8j0Var.c && this.d == r8j0Var.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int e = unr0.e(unr0.e((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b), 31, this.c);
        RequestStatus$Data$Source requestStatus$Data$Source = this.d;
        return e + (requestStatus$Data$Source != null ? requestStatus$Data$Source.hashCode() : 0);
    }

    public final String toString() {
        return "Data(data=" + this.a + ", isRefreshing=" + this.b + ", isCacheValid=" + this.c + ", source=" + this.d + Extension.C_BRAKE;
    }

    public r8j0(Object obj, boolean z, boolean z2, RequestStatus$Data$Source requestStatus$Data$Source) {
        this.a = obj;
        this.b = z;
        this.c = z2;
        this.d = requestStatus$Data$Source;
    }
}
