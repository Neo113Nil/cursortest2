package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.a;

/* loaded from: classes.dex */
public class v3y {
    public volatile xt10 a;
    public volatile ByteString b;

    public final xt10 a(xt10 xt10Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = xt10Var;
                        this.b = ByteString.a;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = xt10Var;
                        this.b = ByteString.a;
                    }
                }
            }
        }
        return this.a;
    }

    public final ByteString b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = ByteString.a;
                } else {
                    this.b = ((a) this.a).e();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3y)) {
            return false;
        }
        v3y v3yVar = (v3y) obj;
        xt10 xt10Var = this.a;
        xt10 xt10Var2 = v3yVar.a;
        return (xt10Var == null && xt10Var2 == null) ? b().equals(v3yVar.b()) : (xt10Var == null || xt10Var2 == null) ? xt10Var != null ? xt10Var.equals(v3yVar.a(xt10Var.a())) : a(xt10Var2.a()).equals(xt10Var2) : xt10Var.equals(xt10Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
