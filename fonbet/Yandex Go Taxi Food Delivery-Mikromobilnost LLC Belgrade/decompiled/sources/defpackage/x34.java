package defpackage;

import android.hardware.camera2.CaptureRequest;

/* loaded from: classes10.dex */
public final class x34 {
    public final String a;
    public final Class b;
    public final Object c;

    public x34(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls == null) {
            ny61.t("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x34)) {
            return false;
        }
        x34 x34Var = (x34) obj;
        if (!this.a.equals(x34Var.a) || !this.b.equals(x34Var.b)) {
            return false;
        }
        Object obj2 = x34Var.c;
        Object obj3 = this.c;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.a);
        sb.append(", valueClass=");
        sb.append(this.b);
        sb.append(", token=");
        return x4e.h(sb, this.c, "}");
    }
}
