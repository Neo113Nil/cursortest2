package defpackage;

import kotlinx.coroutines.flow.q0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class wsr0 {
    public static final /* synthetic */ wsr0 a = new wsr0();
    public static final q2u0 b = new q2u0();
    public static final r2u0 c = new r2u0();

    public static q0 a(wsr0 wsr0Var, int i) {
        long j = (i & 1) != 0 ? 0L : 5000L;
        long j2 = (i & 2) != 0 ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : 0L;
        wsr0Var.getClass();
        return new q0(j, j2);
    }
}
