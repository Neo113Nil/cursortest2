package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public class n1j extends p1c {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1j(q1c q1cVar, r1c r1cVar, Integer num, String str, String str2, boolean z) {
        super(q1cVar, r1cVar, num, str2, str);
        q1cVar.getClass();
        str.getClass();
        this.f = z;
    }

    public final n1j b(r1c r1cVar) {
        return new n1j(this.b, r1cVar, this.d, this.a, (String) null, this.f);
    }

    public final boolean c() {
        Integer num = this.d;
        if ((num != null && num.intValue() == 429) || this.f) {
            return true;
        }
        if (this.c == r1c.c && num != null && num.intValue() == 500) {
            String str = this.a;
            str.getClass();
            if (StringsKt.M(str, "context deadline exceeded", false)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ n1j(q1c q1cVar, r1c r1cVar, Integer num, String str, String str2, int i) {
        this(q1cVar, r1cVar, num, str, (i & 16) != 0 ? null : str2, false);
    }
}
