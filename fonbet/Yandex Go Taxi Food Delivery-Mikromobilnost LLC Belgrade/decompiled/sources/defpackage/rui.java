package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class rui {
    public final String a;
    public final Map b;
    public final Expansion c;
    public final UUID d;
    public final boolean e;

    public /* synthetic */ rui(String str, Map map, Expansion expansion, UUID uuid, int i) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? Expansion.ANCHORED : expansion, (i & 8) != 0 ? null : uuid, false);
    }

    public rui(String str, Map map, Expansion expansion, UUID uuid, boolean z) {
        this.a = str;
        this.b = map;
        this.c = expansion;
        this.d = uuid;
        this.e = z;
    }
}
