package com.anythink.core.b.b;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingListener;

/* loaded from: classes.dex */
public abstract class c implements ATBiddingListener {

    /* renamed from: c, reason: collision with root package name */
    protected ATBaseAdAdapter f11726c;

    public c(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f11726c = aTBaseAdAdapter;
    }

    private void a() {
        this.f11726c = null;
    }
}
