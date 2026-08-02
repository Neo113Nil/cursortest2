package androidx.camera.viewfinder.core.impl;

import android.util.CloseGuard;
import androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl;

/* loaded from: classes3.dex */
public final class CloseGuardApi30Impl implements CloseGuardHelper$CloseGuardImpl, CloseGuardImpl {
    public final /* synthetic */ int $r8$classId;
    public final CloseGuard platformImpl;

    public CloseGuardApi30Impl(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.platformImpl = new CloseGuard();
                break;
            default:
                this.platformImpl = new CloseGuard();
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl, androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public final void close() {
        switch (this.$r8$classId) {
            case 0:
                this.platformImpl.close();
                break;
            default:
                this.platformImpl.close();
                break;
        }
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void open() {
        this.platformImpl.open("close");
    }

    @Override // androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl, androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public final void warnIfOpen() {
        switch (this.$r8$classId) {
            case 0:
                this.platformImpl.warnIfOpen();
                break;
            default:
                this.platformImpl.warnIfOpen();
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl
    public void open(String str) {
        this.platformImpl.open(str);
    }
}
