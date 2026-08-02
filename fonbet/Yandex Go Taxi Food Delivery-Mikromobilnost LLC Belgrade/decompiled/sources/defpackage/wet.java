package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wet {
    public final Long a;
    public final ChatRequest b;
    public final boolean c;

    public /* synthetic */ wet(Long l, int i) {
        this((i & 1) != 0 ? null : l, null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wet)) {
            return false;
        }
        wet wetVar = (wet) obj;
        return jl40.l(this.a, wetVar.a) && jl40.l(this.b, wetVar.b) && this.c == wetVar.c;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        ChatRequest chatRequest = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (chatRequest != null ? chatRequest.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(orgId=");
        sb.append(this.a);
        sb.append(", chatRequest=");
        sb.append(this.b);
        sb.append(", readOnMainThread=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public wet() {
        this(null, 7);
    }

    public wet(Long l, ChatRequest chatRequest, boolean z) {
        this.a = l;
        this.b = chatRequest;
        this.c = z;
    }
}
