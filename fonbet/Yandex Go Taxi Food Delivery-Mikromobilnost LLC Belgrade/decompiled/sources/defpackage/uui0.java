package defpackage;

import com.ybsdk.rconfig.RemoteConfigDeserializationCache$cache$1;

/* loaded from: classes8.dex */
public final class uui0 {
    public final int a;
    public final RemoteConfigDeserializationCache$cache$1 b;

    public uui0(int i) {
        this.a = 512;
        this.b = new RemoteConfigDeserializationCache$cache$1(this);
    }

    public final Object a(dfr dfrVar, String str, sls slsVar) {
        Object obj;
        if (str != null) {
            tui0 tui0Var = new tui0(dfrVar.a, str);
            synchronized (this.b) {
                obj = this.b.get(tui0Var);
                if (obj == null) {
                    obj = null;
                }
            }
            if (obj != null) {
                return obj;
            }
            Object invoke = slsVar.invoke();
            if (invoke != null) {
                synchronized (this.b) {
                    this.b.put(tui0Var, invoke);
                }
                return invoke;
            }
        }
        return null;
    }

    public uui0() {
        this(0);
    }
}
