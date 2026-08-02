package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.provider.api.PushServiceController;

/* renamed from: io.appmetrica.analytics.push.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1022d2 implements v2 {
    public final C1018c2 a;

    public C1022d2(C1018c2 c1018c2) {
        this.a = c1018c2;
    }

    @Override // io.appmetrica.analytics.push.impl.v2
    public final boolean a(u2 u2Var) {
        C1018c2 c1018c2 = this.a;
        if (c1018c2 == null) {
            return true;
        }
        String str = u2Var.b;
        if (str == null) {
            str = "";
        }
        PushServiceController pushServiceController = (PushServiceController) c1018c2.b.get(u2Var.a);
        if (pushServiceController != null) {
            return pushServiceController.shouldSendToken(str);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.push.impl.v2
    public final String a() {
        return "shouldSendTokenForProvider";
    }
}
