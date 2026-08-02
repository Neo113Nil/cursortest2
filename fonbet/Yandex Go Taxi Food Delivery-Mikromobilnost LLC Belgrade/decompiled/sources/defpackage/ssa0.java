package defpackage;

import com.yandex.messaging.internal.entities.MessageReactions;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ssa0 {
    public final long a;
    public final MessageReactions b;

    public ssa0(long j, MessageReactions messageReactions) {
        this.a = j;
        this.b = messageReactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssa0)) {
            return false;
        }
        ssa0 ssa0Var = (ssa0) obj;
        return this.a == ssa0Var.a && jl40.l(this.b, ssa0Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        MessageReactions messageReactions = this.b;
        return hashCode + (messageReactions == null ? 0 : messageReactions.hashCode());
    }

    public final String toString() {
        return "PendingMessageReactions(prevVersion=" + this.a + ", reactions=" + this.b + Extension.C_BRAKE;
    }
}
