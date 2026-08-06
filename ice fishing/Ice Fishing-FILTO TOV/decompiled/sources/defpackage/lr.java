package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class lr implements fb {
    public final File GWasM1elztuh;
    public final AtomicBoolean Yi7zF1RB1 = new AtomicBoolean(false);

    public lr(File file) {
        this.GWasM1elztuh = file;
    }

    @Override // defpackage.fb
    public final void close() {
        this.Yi7zF1RB1.set(true);
    }
}
