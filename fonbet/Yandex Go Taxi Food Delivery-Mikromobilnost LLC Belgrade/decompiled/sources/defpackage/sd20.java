package defpackage;

import com.google.protobuf.n;

/* loaded from: classes8.dex */
public final class sd20 extends n implements zt10 {
    public final int c() {
        return ((td20) this.instance).getAfterCrashResumeCount();
    }

    public final int d() {
        return ((td20) this.instance).getCleanResumeCount();
    }

    public final void e(int i) {
        copyOnWrite();
        ((td20) this.instance).setAfterCrashResumeCount(i);
    }

    public final void f(int i) {
        copyOnWrite();
        ((td20) this.instance).setCleanResumeCount(i);
    }

    public final void g(boolean z) {
        copyOnWrite();
        ((td20) this.instance).setIsExitedCleanly(z);
    }
}
