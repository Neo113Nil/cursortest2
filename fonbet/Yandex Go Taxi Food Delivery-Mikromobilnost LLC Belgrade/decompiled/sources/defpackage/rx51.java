package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.YbStateResponse$YbState;

@gsq0
/* loaded from: classes5.dex */
public final class rx51 {
    public static final px51 Companion = new px51();
    public static final i3y[] d;
    public final YbStateResponse$YbState a;
    public final os51 b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new dp51(7)), null, a.b(lazyThreadSafetyMode, new dp51(8))};
    }

    public /* synthetic */ rx51(int i, YbStateResponse$YbState ybStateResponse$YbState, os51 os51Var, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ox51.a.getDescriptor());
            throw null;
        }
        this.a = ybStateResponse$YbState;
        this.b = os51Var;
        this.c = list;
    }

    public rx51(YbStateResponse$YbState ybStateResponse$YbState, os51 os51Var, ArrayList arrayList) {
        this.a = ybStateResponse$YbState;
        this.b = os51Var;
        this.c = arrayList;
    }
}
