package kotlin.jvm.internal;

import defpackage.a590;
import defpackage.jl40;
import defpackage.lms;
import defpackage.mfx;
import defpackage.qoi0;
import defpackage.unr0;
import defpackage.uoi0;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class AdaptedFunctionReference implements lms, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
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
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && jl40.l(this.receiver, adaptedFunctionReference.receiver) && jl40.l(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    @Override // defpackage.lms
    public int getArity() {
        return this.arity;
    }

    public mfx getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return qoi0.a(cls);
        }
        qoi0.a.getClass();
        return new a590(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((unr0.b(unr0.b((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        qoi0.a.getClass();
        return uoi0.a(this);
    }

    public AdaptedFunctionReference(int i, int i2, Class cls, String str, String str2) {
        this(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }
}
