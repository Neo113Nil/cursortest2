package defpackage;

import com.google.protobuf.n;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class qd20 extends n implements zt10 {
    public final void c(Iterable iterable) {
        copyOnWrite();
        ((rd20) this.instance).addAllInitialLogQueue(iterable);
    }

    public final void d(Iterable iterable) {
        copyOnWrite();
        ((rd20) this.instance).addAllOngoingLogQueue(iterable);
    }

    public final void e() {
        copyOnWrite();
        ((rd20) this.instance).clearInitialLogQueue();
    }

    public final void f() {
        copyOnWrite();
        ((rd20) this.instance).clearOngoingLogQueue();
    }

    public final String g() {
        return ((rd20) this.instance).getClientId();
    }

    public final int h() {
        return ((rd20) this.instance).getInitialLogQueueCount();
    }

    public final List i() {
        return Collections.unmodifiableList(((rd20) this.instance).getInitialLogQueueList());
    }

    public final int j() {
        return ((rd20) this.instance).getOngoingLogQueueCount();
    }

    public final List l() {
        return Collections.unmodifiableList(((rd20) this.instance).getOngoingLogQueueList());
    }

    public final int m() {
        return ((rd20) this.instance).getSessionId();
    }

    public final td20 o() {
        return ((rd20) this.instance).getStability();
    }

    public final boolean p() {
        return ((rd20) this.instance).hasClientId();
    }

    public final boolean q() {
        return ((rd20) this.instance).hasStability();
    }

    public final void r(String str) {
        copyOnWrite();
        ((rd20) this.instance).setClientId(str);
    }

    public final void s(int i) {
        copyOnWrite();
        ((rd20) this.instance).setSessionId(i);
    }

    public final void t(td20 td20Var) {
        copyOnWrite();
        ((rd20) this.instance).setStability(td20Var);
    }
}
