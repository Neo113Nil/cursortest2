package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

@gsq0
/* loaded from: classes5.dex */
public final class ua1 {
    public static final sa1 Companion = new sa1();
    public static final i3y[] d;
    public final String a;
    public final Map b;
    public final Map c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new pn0(14)), a.b(lazyThreadSafetyMode, new pn0(15))};
    }

    public /* synthetic */ ua1(int i, String str, Map map, Map map2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, qa1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = b.f();
        } else {
            this.c = map2;
        }
    }
}
