package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w8t {
    public final ChatRequest a;
    public final r3z b;

    public w8t(ChatRequest chatRequest, r3z r3zVar) {
        this.a = chatRequest;
        this.b = r3zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8t)) {
            return false;
        }
        w8t w8tVar = (w8t) obj;
        return jl40.l(this.a, w8tVar.a) && jl40.l(this.b, w8tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoParams(chatRequest=" + this.a + ", localMessage=" + this.b + Extension.C_BRAKE;
    }
}
