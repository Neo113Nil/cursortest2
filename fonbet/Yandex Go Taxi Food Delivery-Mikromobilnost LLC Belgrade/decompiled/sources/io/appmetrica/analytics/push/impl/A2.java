package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes4.dex */
public final class A2 extends C2 {
    public final z2 a;

    public A2(Context context, z2 z2Var) {
        this.a = z2Var;
        a(new C1009a1(context), new J0(context));
    }

    public final void a(C2... c2Arr) {
        for (C2 c2 : c2Arr) {
            this.a.a.add(c2);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C2
    public final D2 a(PushMessage pushMessage) {
        return this.a.a(pushMessage);
    }
}
