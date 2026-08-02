package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import defpackage.bsq0;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmServiceWrapper;

/* loaded from: classes9.dex */
public final class Tl implements InterfaceC0746tn {
    public static final Sl b = new Sl();
    public static final int c = 2;
    public final IRtmServiceWrapper a;

    public Tl(Context context) {
        this.a = new Xl().a(context);
    }

    public static final void a(Tl tl, Bundle bundle) {
        tl.a.reportData(bundle);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0746tn
    public final void reportData(int i, Bundle bundle) {
        Jb.I.d.g().execute(new bsq0(5, this, bundle));
    }
}
