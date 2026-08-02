package defpackage;

import android.os.Looper;
import androidx.media3.common.a;

/* loaded from: classes10.dex */
public interface qmm {
    public static final omm a = new omm();

    jmm acquireSession(mmm mmmVar, a aVar);

    int getCryptoType(a aVar);

    default pmm preacquireSession(mmm mmmVar, a aVar) {
        return pmm.Y1;
    }

    default void prepare() {
    }

    default void release() {
    }

    void setPlayer(Looper looper, vyc0 vyc0Var);
}
