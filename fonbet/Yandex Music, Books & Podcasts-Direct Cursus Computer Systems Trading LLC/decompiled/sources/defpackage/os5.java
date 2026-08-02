package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class os5 {
    public final int a;
    public final ps5[] b;
    public long c;

    public os5(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new ps5[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new ps5(threadFactory);
        }
    }
}
