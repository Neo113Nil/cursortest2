package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ya41 {
    public final tn3 a;
    public final Uri b;
    public final tn3 c;
    public final Uri d;
    public final boolean e;

    public ya41(tn3 tn3Var, Uri uri, tn3 tn3Var2, Uri uri2, boolean z) {
        this.a = tn3Var;
        this.b = uri;
        this.c = tn3Var2;
        this.d = uri2;
        this.e = z;
    }

    public static ya41 a(ya41 ya41Var, tn3 tn3Var, Uri uri, tn3 tn3Var2, Uri uri2, boolean z, int i) {
        if ((i & 1) != 0) {
            tn3Var = ya41Var.a;
        }
        tn3 tn3Var3 = tn3Var;
        if ((i & 2) != 0) {
            uri = ya41Var.b;
        }
        Uri uri3 = uri;
        if ((i & 4) != 0) {
            tn3Var2 = ya41Var.c;
        }
        tn3 tn3Var4 = tn3Var2;
        if ((i & 8) != 0) {
            uri2 = ya41Var.d;
        }
        Uri uri4 = uri2;
        if ((i & 16) != 0) {
            z = ya41Var.e;
        }
        ya41Var.getClass();
        return new ya41(tn3Var3, uri3, tn3Var4, uri4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean l;
        if (jl40.l(this.a, this.c)) {
            Uri uri = this.b;
            Uri uri2 = this.d;
            if (uri == null) {
                if (uri2 == null) {
                    l = true;
                    if (!l && !this.e) {
                        return true;
                    }
                }
                l = false;
                if (!l) {
                }
            } else {
                if (uri2 != null) {
                    Set set = le41.b;
                    l = jl40.l(uri, uri2);
                    if (!l) {
                    }
                }
                l = false;
                if (!l) {
                }
            }
        }
        return false;
    }

    public final Map c() {
        Pair pair = new Pair("from", dai0.p(this.a));
        Pair pair2 = new Pair("to", dai0.p(this.c));
        Uri uri = this.b;
        if (uri == null) {
            uri = null;
        }
        Pair pair3 = new Pair("from_url", String.valueOf(uri));
        Uri uri2 = this.d;
        return b.i(pair, pair2, pair3, new Pair("to_url", String.valueOf(uri2 != null ? uri2 : null)), new Pair("pending_logout", Boolean.valueOf(this.e)));
    }

    public final boolean equals(Object obj) {
        boolean l;
        boolean l2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya41)) {
            return false;
        }
        ya41 ya41Var = (ya41) obj;
        if (!jl40.l(this.a, ya41Var.a)) {
            return false;
        }
        Uri uri = ya41Var.b;
        Uri uri2 = this.b;
        if (uri2 == null) {
            if (uri == null) {
                l = true;
            }
            l = false;
        } else {
            if (uri != null) {
                Set set = le41.b;
                l = jl40.l(uri2, uri);
            }
            l = false;
        }
        if (!l || !jl40.l(this.c, ya41Var.c)) {
            return false;
        }
        Uri uri3 = ya41Var.d;
        Uri uri4 = this.d;
        if (uri4 == null) {
            if (uri3 == null) {
                l2 = true;
            }
            l2 = false;
        } else {
            if (uri3 != null) {
                Set set2 = le41.b;
                l2 = jl40.l(uri4, uri3);
            }
            l2 = false;
        }
        return l2 && this.e == ya41Var.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            Set set = le41.b;
            hashCode = uri.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        Uri uri2 = this.d;
        if (uri2 != null) {
            Set set2 = le41.b;
            i = uri2.hashCode();
        }
        return Boolean.hashCode(this.e) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        Uri uri = this.b;
        String a = uri == null ? "null" : le41.a(uri);
        Uri uri2 = this.d;
        String a2 = uri2 != null ? le41.a(uri2) : "null";
        StringBuilder sb = new StringBuilder("InternalSynchronizationState(currentState=");
        sb.append(this.a);
        sb.append(", currentUrl=");
        sb.append(a);
        sb.append(", targetState=");
        sb.append(this.c);
        sb.append(", targetUrl=");
        sb.append(a2);
        sb.append(", pendingLogout=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
