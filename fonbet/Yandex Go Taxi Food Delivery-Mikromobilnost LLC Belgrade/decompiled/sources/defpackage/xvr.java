package defpackage;

import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xvr {
    public final String a;
    public final long b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final HashSet f;

    public xvr(String str, long j, Set set, Set set2, Set set3, HashSet hashSet) {
        this.a = str;
        this.b = j;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvr)) {
            return false;
        }
        xvr xvrVar = (xvr) obj;
        return jl40.l(this.a, xvrVar.a) && this.b == xvrVar.b && jl40.l(this.c, xvrVar.c) && jl40.l(this.d, xvrVar.d) && jl40.l(this.e, xvrVar.e) && this.f.equals(xvrVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + g8e.e(this.e, g8e.e(this.d, g8e.e(this.c, qv10.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("FolderChatData(folderId=", this.a, ", organizationId=", this.b);
        l.append(", includedChatsIds=");
        l.append(this.c);
        l.append(", excludedChatsIds=");
        l.append(this.d);
        l.append(", includedChatsIdsByFilters=");
        l.append(this.e);
        l.append(", excludedChatsIdsByFilters=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
