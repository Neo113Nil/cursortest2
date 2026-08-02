package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xl50 extends s120 {
    public final g720 a;
    public final ChatRequest b;
    public final String c = "Messaging.Arguments.Key.NeophonishAttachMenu";

    public xl50(g720 g720Var, ChatRequest chatRequest) {
        this.a = g720Var;
        this.b = chatRequest;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl50)) {
            return false;
        }
        xl50 xl50Var = (xl50) obj;
        return jl40.l(this.a, xl50Var.a) && jl40.l(this.b, xl50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeophonishAttachMenuArguments(source=" + this.a + ", chatRequest=" + this.b + Extension.C_BRAKE;
    }
}
