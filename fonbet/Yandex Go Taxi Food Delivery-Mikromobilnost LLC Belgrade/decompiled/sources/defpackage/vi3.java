package defpackage;

import com.yandex.messaging.action.MessagingAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vi3 extends s120 {
    public final g720 a;
    public final MessagingAction b;
    public final boolean c;
    public final String d = "Messaging.Arguments.Key.Fullscreen";

    public vi3(g720 g720Var, MessagingAction messagingAction, boolean z) {
        this.a = g720Var;
        this.b = messagingAction;
        this.c = z;
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
        if (!(obj instanceof vi3)) {
            return false;
        }
        vi3 vi3Var = (vi3) obj;
        return jl40.l(this.a, vi3Var.a) && jl40.l(this.b, vi3Var.b) && this.c == vi3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthFullscreenArguments(source=");
        sb.append(this.a);
        sb.append(", pendingAction=");
        sb.append(this.b);
        sb.append(", phoneRequired=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
