package defpackage;

import android.os.PersistableBundle;
import android.view.Surface;

/* loaded from: classes.dex */
public final class n8b extends akh {
    public final boolean e;
    public final boolean f;
    public final PersistableBundle g;

    public n8b(IllegalStateException illegalStateException, mih mihVar, Surface surface, boolean z, boolean z2) {
        super(illegalStateException, mihVar, surface);
        this.e = z;
        this.f = z2;
        this.g = null;
    }

    public n8b(IllegalStateException illegalStateException, mih mihVar, Surface surface, boolean z, boolean z2, PersistableBundle persistableBundle) {
        super(illegalStateException, mihVar, surface);
        this.e = z;
        this.f = z2;
        this.g = persistableBundle;
    }
}
