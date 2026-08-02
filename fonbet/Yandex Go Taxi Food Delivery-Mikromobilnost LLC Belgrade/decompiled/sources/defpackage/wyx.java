package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.b;

@gsq0
/* loaded from: classes9.dex */
public final class wyx {
    public static final vyx Companion = new vyx();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(3))};
    public final b a;
    public final b b;
    public final Map c;

    public /* synthetic */ wyx(int i, b bVar, b bVar2, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, uyx.a.getDescriptor());
            throw null;
        }
        this.a = bVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public wyx(b bVar, b bVar2, LinkedHashMap linkedHashMap) {
        this.a = bVar;
        this.b = bVar2;
        this.c = linkedHashMap;
    }
}
