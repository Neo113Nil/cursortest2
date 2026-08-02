package defpackage;

import com.ybsdk.core.utils.ScreenDensity;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public abstract class tev {
    public final int a;
    public final int b;

    public tev(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public String c(ScreenDensity screenDensity) {
        return oyr.h((int) (screenDensity.getMultiplier() * this.a), (int) (screenDensity.getMultiplier() * this.b), "wrapper_", RemoteBioParameters.X);
    }
}
