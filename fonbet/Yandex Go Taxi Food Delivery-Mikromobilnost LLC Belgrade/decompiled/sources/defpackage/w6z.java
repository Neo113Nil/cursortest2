package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw6z;", "", "Companion", "j6z", "l6z", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class w6z {
    public static final l6z Companion = new l6z();
    public final Double a;
    public final Double b;

    public /* synthetic */ w6z(int i, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Double getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Double getB() {
        return this.b;
    }

    public w6z() {
        this.a = null;
        this.b = null;
    }
}
