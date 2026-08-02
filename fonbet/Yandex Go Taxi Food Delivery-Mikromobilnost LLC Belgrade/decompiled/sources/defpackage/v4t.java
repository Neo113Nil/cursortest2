package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class v4t {
    public final ChatRequest a;
    public final h3t0 b;

    public v4t(ChatRequest chatRequest, h3t0 h3t0Var) {
        this.a = chatRequest;
        this.b = h3t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4t)) {
            return false;
        }
        v4t v4tVar = (v4t) obj;
        return jl40.l(this.a, v4tVar.a) && jl40.l(this.b, v4tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(chat=" + this.a + ", availablePoint=" + this.b + Extension.C_BRAKE;
    }

    public v4t(ChatRequest chatRequest) {
        this(chatRequest, h3t0.a);
    }
}
