package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls1r0;", "", "Companion", "q1r0", "r1r0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class s1r0 {
    public static final r1r0 Companion = new r1r0();
    public final Long a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ s1r0(int i, Long l, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final Long getA() {
        return this.a;
    }

    public s1r0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
