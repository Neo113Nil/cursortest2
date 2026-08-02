package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z4k {
    public final Object a;
    public final Object b;

    public z4k(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z4k)) {
            return false;
        }
        z4k z4kVar = (z4k) obj;
        return Objects.equals(z4kVar.a, this.a) && Objects.equals(z4kVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + StringUtil.SPACE + this.b + "}";
    }
}
