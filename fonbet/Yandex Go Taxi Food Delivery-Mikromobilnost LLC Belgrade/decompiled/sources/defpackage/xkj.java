package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xkj implements jxh {
    public final CancelType a;
    public final Object b;

    public xkj(CancelType cancelType, Object obj) {
        this.a = cancelType;
        this.b = obj;
    }

    public final CancelType a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkj)) {
            return false;
        }
        xkj xkjVar = (xkj) obj;
        return this.a == xkjVar.a && jl40.l(this.b, xkjVar.b);
    }

    public final int hashCode() {
        CancelType cancelType = this.a;
        int hashCode = (cancelType == null ? 0 : cancelType.hashCode()) * 31;
        Object obj = this.b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "DirectCancelPayload(cancelType=" + this.a + ", meta=" + this.b + Extension.C_BRAKE;
    }
}
