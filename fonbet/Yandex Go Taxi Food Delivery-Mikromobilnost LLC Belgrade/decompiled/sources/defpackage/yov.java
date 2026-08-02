package defpackage;

import com.yandex.go.navigator.events.g;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class yov {
    public final g a;
    public final zuj0 b;
    public final n0 c;
    public final n0 d;
    public final xov e;

    public yov(g gVar, zuj0 zuj0Var) {
        this.a = gVar;
        this.b = zuj0Var;
        n0 b = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        this.c = b;
        this.d = b;
        this.e = new xov(this);
    }
}
