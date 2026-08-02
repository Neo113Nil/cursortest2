package defpackage;

import java.util.Date;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class zjw0 {
    public final crg a;
    public final cne0 b;
    public final r0 c;

    public zjw0(dne0 dne0Var, crg crgVar) {
        this.a = crgVar;
        cne0 b = dne0Var.b();
        this.b = b;
        this.c = bvf0.c(Integer.valueOf(b.i("unread_support_messages_count", 0)));
    }

    public final boolean a(int i, String str) {
        crg crgVar = this.a;
        Date c = crgVar.c(str);
        if (c == null) {
            return false;
        }
        cne0 cne0Var = this.b;
        Date c2 = crgVar.c(cne0Var.l("support_message_timestamp", null));
        if (c2 != null && c.compareTo(c2) <= 0) {
            return false;
        }
        cne0Var.r("support_message_timestamp", str);
        if (i <= -1) {
            return true;
        }
        b(i);
        return true;
    }

    public final void b(int i) {
        this.b.p(i, "unread_support_messages_count");
        x4e.z(i, this.c, null);
    }
}
