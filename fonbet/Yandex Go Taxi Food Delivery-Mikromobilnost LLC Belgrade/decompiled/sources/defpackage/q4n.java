package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class q4n {
    public static final p4n Companion = new p4n();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(12))};
    public final List a;

    public /* synthetic */ q4n(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, o4n.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4n) && jl40.l(this.a, ((q4n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("DwhEventsRequest(events="), this.a, ')');
    }

    public q4n(List list) {
        this.a = list;
    }
}
