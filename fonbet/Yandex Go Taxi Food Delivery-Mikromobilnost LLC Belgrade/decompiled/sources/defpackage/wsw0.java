package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.b;

@gsq0
/* loaded from: classes6.dex */
public final class wsw0 {
    public static final vsw0 Companion = new vsw0();
    public static final i3y[] f;
    public final Set a;
    public final b b;
    public final w03 c;
    public final Map d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new bhw0(21)), null, null, a.b(lazyThreadSafetyMode, new bhw0(22)), null};
    }

    public /* synthetic */ wsw0(int i, Set set, b bVar, w03 w03Var, Map map, String str) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, usw0.a.getDescriptor());
            throw null;
        }
        this.a = set;
        this.b = bVar;
        this.c = w03Var;
        this.d = map;
        this.e = str;
    }

    public wsw0(Set set, b bVar, w03 w03Var, Map map, String str) {
        this.a = set;
        this.b = bVar;
        this.c = w03Var;
        this.d = map;
        this.e = str;
    }
}
