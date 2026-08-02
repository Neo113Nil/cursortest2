package defpackage;

import com.yandex.go.payments.common.a;
import com.yandex.go.payments.sbp.domain.c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class ygm0 extends ad5 {
    public final n0 A;
    public pzt0 B;
    public final c x;
    public final dfm0 y;
    public final a z;

    public ygm0(c cVar, dfm0 dfm0Var, a aVar) {
        super(vgm0.class);
        this.x = cVar;
        this.y = dfm0Var;
        this.z = aVar;
        this.A = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }
}
