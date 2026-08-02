package com.onesignal.common.threading;

import U7.g;
import U7.i;
import U7.j;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public class f {
    private final g channel = j.a(-1, null, 6);

    public final Object waitForWake(InterfaceC5240d interfaceC5240d) {
        return this.channel.b(interfaceC5240d);
    }

    public final void wake(Object obj) {
        Object e9 = this.channel.e(obj);
        if (e9 instanceof i) {
            throw new Exception("WaiterWithValue.wait failed", j.b(e9));
        }
    }
}
