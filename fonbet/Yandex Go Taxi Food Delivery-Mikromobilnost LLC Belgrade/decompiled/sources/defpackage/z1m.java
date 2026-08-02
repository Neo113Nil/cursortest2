package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.c;

@gsq0
/* loaded from: classes9.dex */
public final class z1m {
    public static final y1m Companion = new y1m();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(10)), null};
    public final String a;
    public final Map b;
    public final c c;

    public /* synthetic */ z1m(int i, String str, Map map, c cVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, x1m.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = cVar;
    }
}
