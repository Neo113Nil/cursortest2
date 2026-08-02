package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.pK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2361pK implements C4W {
    public Message A00;
    public C2360pJ A01;

    public C2361pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C2360pJ.A01(this);
    }

    public final C2361pK A01(Message message, C2360pJ c2360pJ) {
        this.A00 = message;
        this.A01 = c2360pJ;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC06443y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC06443y.A01(this.A00));
        A00();
        return success;
    }
}
