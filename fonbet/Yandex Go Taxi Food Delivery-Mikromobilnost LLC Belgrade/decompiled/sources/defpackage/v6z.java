package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lv6z;", "", "Companion", "k6z", "m6z", "eats_orders"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v6z {
    public static final m6z Companion = new m6z();
    public final double a;
    public final double b;

    public /* synthetic */ v6z(double d, double d2, int i) {
        if ((i & 1) == 0) {
            this.a = 0.0d;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final double getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final double getB() {
        return this.b;
    }

    public v6z(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public v6z() {
        this(0.0d, 0.0d);
    }
}
