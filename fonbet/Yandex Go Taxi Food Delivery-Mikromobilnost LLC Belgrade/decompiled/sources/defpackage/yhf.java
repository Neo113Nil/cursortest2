package defpackage;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class yhf {
    public static final /* synthetic */ yhf a = new yhf();
    public static final xhf b = new zhf() { // from class: xhf
        public final /* synthetic */ int b = 0;

        @Override // defpackage.zhf
        public final long get() {
            switch (this.b) {
                case 0:
                    return System.currentTimeMillis();
                default:
                    return SystemClock.elapsedRealtime();
            }
        }
    };
}
