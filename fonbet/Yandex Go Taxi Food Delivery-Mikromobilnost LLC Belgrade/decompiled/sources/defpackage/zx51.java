package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.YbTransaction$Type;

@gsq0
/* loaded from: classes5.dex */
public final class zx51 {
    public static final xx51 Companion = new xx51();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new dp51(11))};
    public final os51 a;
    public final os51 b;
    public final String c;
    public final YbTransaction$Type d;

    public /* synthetic */ zx51(int i, os51 os51Var, os51 os51Var2, String str, YbTransaction$Type ybTransaction$Type) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, wx51.a.getDescriptor());
            throw null;
        }
        this.a = os51Var;
        this.b = os51Var2;
        this.c = str;
        this.d = ybTransaction$Type;
    }
}
