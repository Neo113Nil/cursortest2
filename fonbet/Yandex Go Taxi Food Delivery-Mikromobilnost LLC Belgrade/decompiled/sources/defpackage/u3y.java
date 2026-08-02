package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.l;

/* loaded from: classes11.dex */
public class u3y {
    public volatile wt10 a;
    public volatile ByteString b;

    public final int a(int i) {
        return b() + l.f(i);
    }

    public final int b() {
        int size = this.b != null ? this.b.size() : this.a != null ? this.a.getSerializedSize() : 0;
        return l.g(size) + size;
    }

    public final wt10 c(wt10 wt10Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = wt10Var;
                        this.b = ByteString.a;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = wt10Var;
                        this.b = ByteString.a;
                    }
                }
            }
        }
        return this.a;
    }

    public final ByteString d() {
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
                    this.b = this.a.toByteString();
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
        if (!(obj instanceof u3y)) {
            return false;
        }
        u3y u3yVar = (u3y) obj;
        wt10 wt10Var = this.a;
        wt10 wt10Var2 = u3yVar.a;
        return (wt10Var == null && wt10Var2 == null) ? d().equals(u3yVar.d()) : (wt10Var == null || wt10Var2 == null) ? wt10Var != null ? wt10Var.equals(u3yVar.c(wt10Var.getDefaultInstanceForType())) : c(wt10Var2.getDefaultInstanceForType()).equals(wt10Var2) : wt10Var.equals(wt10Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
