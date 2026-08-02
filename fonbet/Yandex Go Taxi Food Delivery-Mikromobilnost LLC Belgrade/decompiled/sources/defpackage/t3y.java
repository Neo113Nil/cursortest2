package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;

/* loaded from: classes.dex */
public class t3y {
    public volatile vt10 a;
    public volatile ByteString b;

    static {
        oyo.b();
    }

    public final vt10 a(vt10 vt10Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = vt10Var;
                        this.b = ByteString.a;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = vt10Var;
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
                    this.b = ((a) this.a).f();
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
        if (!(obj instanceof t3y)) {
            return false;
        }
        t3y t3yVar = (t3y) obj;
        vt10 vt10Var = this.a;
        vt10 vt10Var2 = t3yVar.a;
        return (vt10Var == null && vt10Var2 == null) ? b().equals(t3yVar.b()) : (vt10Var == null || vt10Var2 == null) ? vt10Var != null ? vt10Var.equals(t3yVar.a(vt10Var.getDefaultInstanceForType())) : a(vt10Var2.getDefaultInstanceForType()).equals(vt10Var2) : vt10Var.equals(vt10Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
