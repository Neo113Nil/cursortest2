package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewNavigationEntry$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vdb {
    public final String a;
    public final ChatViewNavigationEntry$Type b;
    public final String c;
    public final boolean d;

    public vdb(String str, ChatViewNavigationEntry$Type chatViewNavigationEntry$Type, String str2, boolean z) {
        this.a = str;
        this.b = chatViewNavigationEntry$Type;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdb)) {
            return false;
        }
        vdb vdbVar = (vdb) obj;
        return jl40.l(this.a, vdbVar.a) && this.b == vdbVar.b && jl40.l(this.c, vdbVar.c) && this.d == vdbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatViewNavigationEntry(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        return nnm.i(this.c, ", canNavigateBack=", Extension.C_BRAKE, sb, this.d);
    }
}
