package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

@gsq0
/* loaded from: classes2.dex */
public final class uoq0 extends kr {
    public static final soq0 Companion = new soq0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(6))};
    public final String a;
    public final Map b;

    public /* synthetic */ uoq0(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, qoq0.a.getDescriptor());
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
