package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r221 implements s221 {
    public final ChatRequest a;

    public r221(ChatRequest chatRequest) {
        this.a = chatRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r221) && jl40.l(this.a, ((r221) obj).a);
    }

    @Override // defpackage.s221
    public final ChatRequest getChatRequest() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneChat(chatRequest=" + this.a + Extension.C_BRAKE;
    }
}
