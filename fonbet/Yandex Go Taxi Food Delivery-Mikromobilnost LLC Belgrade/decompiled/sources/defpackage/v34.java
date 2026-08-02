package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class v34 extends mt7 {
    public final Executor a;
    public final Handler b;

    public v34(Executor executor, Handler handler) {
        if (executor == null) {
            ny61.t("Null cameraExecutor");
            throw null;
        }
        this.a = executor;
        if (handler != null) {
            this.b = handler;
        } else {
            ny61.t("Null schedulerHandler");
            throw null;
        }
    }

    @Override // defpackage.mt7
    public final Executor a() {
        return this.a;
    }

    @Override // defpackage.mt7
    public final Handler b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mt7)) {
            return false;
        }
        mt7 mt7Var = (mt7) obj;
        return this.a.equals(mt7Var.a()) && this.b.equals(mt7Var.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
