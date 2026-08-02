package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class setFriction implements Executor {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;
    private final Handler get;

    public setFriction(Handler handler) {
        this.get = handler;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setFriction setfriction = new setFriction(new Handler(Looper.getMainLooper()));
        int i = getWarnings;
        int i2 = i ^ 51;
        int i3 = (((i & 51) | i2) << 1) - i2;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            return setfriction;
        }
        throw null;
    }

    public static Executor ThreeDS2ServiceInstance() {
        return (Executor) get(new Object[0], -409402454, 409402454, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2Service(objArr);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        int i = getWarnings + 79;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        Handler handler = this.get;
        if (i2 == 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
            int i3 = 79 / 0;
        }
    }
}
