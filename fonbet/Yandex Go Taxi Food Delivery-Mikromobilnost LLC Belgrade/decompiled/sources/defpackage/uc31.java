package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class uc31 {
    public final r0 a;
    public final gci0 b;
    public final n0 c;
    public final eci0 d;

    public uc31() {
        r0 c = bvf0.c(ModalState.Other);
        this.a = c;
        this.b = e.d(c);
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.c = b;
        this.d = e.c(b);
    }
}
