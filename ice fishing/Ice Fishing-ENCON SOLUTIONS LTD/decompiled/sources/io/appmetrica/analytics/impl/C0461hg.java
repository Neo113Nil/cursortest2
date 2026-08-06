package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461hg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0486ig f6145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0745sg f6146b;

    public C0461hg(C0486ig c0486ig, InterfaceC0745sg interfaceC0745sg) {
        this.f6145a = c0486ig;
        this.f6146b = interfaceC0745sg;
    }

    public static final void a(C0486ig c0486ig, InterfaceC0745sg interfaceC0745sg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0486ig.f6191b.getInstallReferrer();
                interfaceC0745sg.a(new C0616ng(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0590mg.f6520c));
                installReferrerClient = c0486ig.f6191b;
            } catch (Throwable th) {
                try {
                    interfaceC0745sg.a(th);
                    installReferrerClient = c0486ig.f6191b;
                } catch (Throwable th2) {
                    try {
                        c0486ig.f6191b.endConnection();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i2) {
        if (i2 != 0) {
            this.f6145a.a(this.f6146b, new IllegalStateException(C1.a.f(i2, "Referrer check failed with error ")));
            return;
        }
        C0486ig c0486ig = this.f6145a;
        c0486ig.f6190a.execute(new F0.c(7, c0486ig, this.f6146b));
    }
}
