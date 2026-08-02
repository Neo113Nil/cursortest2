package defpackage;

import android.os.Bundle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w2u extends s120 {
    public final g720 a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    public w2u(Bundle bundle) {
        String d = dlb1.d(bundle, "Messaging.Arguments.Source");
        int i = g720.c;
        g720 b = glb1.b(d);
        String d2 = dlb1.d(bundle, "chat_id");
        String d3 = dlb1.d(bundle, "group_uuid");
        String d4 = dlb1.d(bundle, "group_name");
        long c = dlb1.c(bundle, "group_organization_id");
        this.a = b;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = c;
        this.f = "Messaging.Arguments.Key.GROUP";
    }

    @Override // defpackage.s120
    public final String a() {
        return this.f;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2u)) {
            return false;
        }
        w2u w2uVar = (w2u) obj;
        return jl40.l(this.a, w2uVar.a) && jl40.l(this.b, w2uVar.b) && jl40.l(this.c, w2uVar.c) && jl40.l(this.d, w2uVar.d) && this.e == w2uVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupParticipantsArguments(source=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", groupUuid=");
        g8e.D(sb, this.c, ", groupName=", this.d, ", organizationId=");
        return oyr.n(this.e, Extension.C_BRAKE, sb);
    }
}
