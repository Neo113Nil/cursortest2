package defpackage;

import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q5r {
    public final String a;
    public final PopupPriorityLauncher$PopupType b;
    public final Map c;

    public q5r(String str, PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType, Map map) {
        this.a = str;
        this.b = popupPriorityLauncher$PopupType;
        this.c = map;
    }

    public final String a() {
        return this.a;
    }

    public final PopupPriorityLauncher$PopupType b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5r)) {
            return false;
        }
        q5r q5rVar = (q5r) obj;
        return jl40.l(this.a, q5rVar.a) && this.b == q5rVar.b && jl40.l(this.c, q5rVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Communication(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", analyticsPayload=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }
}
