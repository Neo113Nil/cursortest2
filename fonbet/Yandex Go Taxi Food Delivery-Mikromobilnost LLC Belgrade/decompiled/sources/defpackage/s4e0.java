package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls4e0;", "", "Companion", "q4e0", "r4e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s4e0 {
    public static final r4e0 Companion = new r4e0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(13)), null};
    public final Float[] a;
    public final Float b;

    public /* synthetic */ s4e0(int i, Float[] fArr, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = fArr;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Float getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final Float[] getA() {
        return this.a;
    }

    public s4e0() {
        this.a = null;
        this.b = null;
    }
}
