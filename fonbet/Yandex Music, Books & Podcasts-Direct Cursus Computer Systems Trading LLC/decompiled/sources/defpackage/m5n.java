package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes3.dex */
public final class m5n {
    public final Class a;
    public final Class b;

    public m5n(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static m5n a(Class cls) {
        return new m5n(l5n.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m5n.class != obj.getClass()) {
            return false;
        }
        m5n m5nVar = (m5n) obj;
        if (this.b.equals(m5nVar.b)) {
            return this.a.equals(m5nVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == l5n.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + StringUtil.SPACE + cls.getName();
    }
}
