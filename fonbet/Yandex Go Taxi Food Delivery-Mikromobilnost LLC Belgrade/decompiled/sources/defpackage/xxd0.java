package defpackage;

import androidx.room.util.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class xxd0 {
    public final eta0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final n0 c = ffx.b(1000, 1000, BufferOverflow.DROP_OLDEST);

    public xxd0(at2 at2Var) {
        this.a = at2Var.N();
    }

    public final void a(long j, String str) {
        if (((Number) a.b(this.a.a, false, true, new qo6(j, str, 19))).intValue() > 0) {
            this.b.remove(new Pair(str, Long.valueOf(j)));
            this.c.g(new wxd0(str, j, false));
        }
    }
}
