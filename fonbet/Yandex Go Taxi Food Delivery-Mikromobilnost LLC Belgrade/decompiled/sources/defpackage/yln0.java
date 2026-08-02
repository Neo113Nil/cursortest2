package defpackage;

import com.yandex.go.scooters.qr.domain.e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class yln0 {
    public final tt2 a;
    public final e b;
    public final jpo0 c;
    public final suo0 d;
    public final lqo0 e;
    public final n0 f;
    public final n0 g;

    public yln0(tt2 tt2Var, e eVar, jpo0 jpo0Var, suo0 suo0Var, lqo0 lqo0Var) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = jpo0Var;
        this.d = suo0Var;
        this.e = lqo0Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.f = ffx.b(0, 1, bufferOverflow);
        this.g = ffx.b(0, 1, bufferOverflow);
    }
}
