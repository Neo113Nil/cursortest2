package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class uw31 {
    public static final tw31 Companion = new tw31();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new b931(14))};
    public final List a;

    public /* synthetic */ uw31(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, sw31.a.getDescriptor());
            throw null;
        }
    }

    public uw31(List list) {
        this.a = list;
    }
}
