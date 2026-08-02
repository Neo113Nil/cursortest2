package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ly9s0;", "", "Companion", "w9s0", "x9s0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y9s0 {
    public static final x9s0 Companion = new x9s0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(13))};
    public final Map a;

    public /* synthetic */ y9s0(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = new LinkedHashMap();
        } else {
            this.a = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Map getA() {
        return this.a;
    }

    public y9s0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public y9s0() {
        this(new LinkedHashMap());
    }
}
