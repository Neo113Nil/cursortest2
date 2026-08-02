package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* loaded from: classes5.dex */
public class oj implements bzc, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public oj(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj)) {
            return false;
        }
        oj ojVar = (oj) obj;
        return this.isTopLevel == ojVar.isTopLevel && this.arity == ojVar.arity && this.flags == ojVar.flags && Intrinsics.d(this.receiver, ojVar.receiver) && Intrinsics.d(this.owner, ojVar.owner) && this.name.equals(ojVar.name) && this.signature.equals(ojVar.signature);
    }

    @Override // defpackage.bzc
    public int getArity() {
        return this.arity;
    }

    public g9f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ern.a(cls);
        }
        ern.a.getClass();
        return new d0k(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((k5r.c(k5r.c((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        ern.a.getClass();
        return frn.a(this);
    }

    public oj(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, a.NO_RECEIVER, str, str2);
    }
}
