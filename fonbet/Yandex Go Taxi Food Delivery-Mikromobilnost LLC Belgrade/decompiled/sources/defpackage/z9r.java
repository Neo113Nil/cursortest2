package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

@gsq0
/* loaded from: classes2.dex */
public final class z9r extends kr {
    public static final x9r Companion = new x9r();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(3))};
    public final String a;
    public final Map b;

    public /* synthetic */ z9r(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, v9r.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }
}
