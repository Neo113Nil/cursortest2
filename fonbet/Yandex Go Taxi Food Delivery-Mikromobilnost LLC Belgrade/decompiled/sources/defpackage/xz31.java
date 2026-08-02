package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xz31 extends s120 {
    public final g720 a;
    public final String b;
    public final ChatRequest c;
    public final String d = "Messaging.Arguments.Key.VpnBlockedDialog";

    public xz31(g720 g720Var, String str, ChatRequest chatRequest) {
        this.a = g720Var;
        this.b = str;
        this.c = chatRequest;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz31)) {
            return false;
        }
        xz31 xz31Var = (xz31) obj;
        return jl40.l(this.a, xz31Var.a) && jl40.l(this.b, xz31Var.b) && jl40.l(this.c, xz31Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChatRequest chatRequest = this.c;
        return hashCode2 + (chatRequest != null ? chatRequest.hashCode() : 0);
    }

    public final String toString() {
        return "VpnBlockedDialogArguments(source=" + this.a + ", messageId=" + this.b + ", chatRequest=" + this.c + Extension.C_BRAKE;
    }
}
