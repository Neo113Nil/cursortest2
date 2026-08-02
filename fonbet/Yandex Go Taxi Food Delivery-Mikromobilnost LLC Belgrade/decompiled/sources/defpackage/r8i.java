package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;

/* loaded from: classes5.dex */
public final class r8i {
    public final String a;
    public final DeliveryExplicitCommentCourierFlowType b;
    public final String c;

    public r8i(String str, DeliveryExplicitCommentCourierFlowType deliveryExplicitCommentCourierFlowType, String str2) {
        this.a = str;
        this.b = deliveryExplicitCommentCourierFlowType;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8i)) {
            return false;
        }
        r8i r8iVar = (r8i) obj;
        return jl40.l(this.a, r8iVar.a) && this.b == r8iVar.b && jl40.l(this.c, r8iVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryExplicitCommentCourierPayload(tariffName=");
        sb.append(this.a);
        sb.append(", flowType=");
        sb.append(this.b);
        sb.append(", initialComment=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
