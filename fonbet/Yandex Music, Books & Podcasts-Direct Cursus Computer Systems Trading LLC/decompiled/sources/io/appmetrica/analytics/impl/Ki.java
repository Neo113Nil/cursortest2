package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.juc;
import defpackage.k5r;

/* loaded from: classes5.dex */
public final class Ki implements InstallReferrerStateListener {
    public final /* synthetic */ Li a;
    public final /* synthetic */ Vi b;

    public Ki(Li li, Vi vi) {
        this.a = li;
        this.b = vi;
    }

    public static final void a(Li li, Vi vi) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = li.b.getInstallReferrer();
                vi.a(new Qi(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), Pi.c));
                installReferrerClient = li.b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                vi.a(th);
                installReferrerClient = li.b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        Li li = this.a;
        if (i != 0) {
            li.a(this.b, new IllegalStateException(k5r.i(i, "Referrer check failed with error ")));
        } else {
            li.a.execute(new juc(10, li, this.b));
        }
    }
}
