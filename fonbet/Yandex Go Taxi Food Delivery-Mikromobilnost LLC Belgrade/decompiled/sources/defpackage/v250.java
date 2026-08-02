package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class v250 implements s250 {
    public static final u250 Companion = new u250();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(14))};
    public final List a;

    public /* synthetic */ v250(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, t250.a.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.s250
    public final List a() {
        return this.a;
    }

    public v250(List list) {
        this.a = list;
    }
}
