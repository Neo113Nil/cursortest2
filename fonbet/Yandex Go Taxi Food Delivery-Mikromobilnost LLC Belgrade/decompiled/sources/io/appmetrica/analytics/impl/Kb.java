package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.evu0;
import defpackage.xm2;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class Kb implements InstallReferrerStateListener {
    public final InstallReferrerClient a;
    public final Wi b;
    public final /* synthetic */ Lb c;

    public Kb(Lb lb, InstallReferrerClient installReferrerClient, Wi wi) {
        this.c = lb;
        this.a = installReferrerClient;
        this.b = wi;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0006, B:16:0x0021, B:21:0x004d, B:22:0x0055, B:23:0x002a, B:25:0x0030, B:28:0x0037), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0006, B:16:0x0021, B:21:0x004d, B:22:0x0055, B:23:0x002a, B:25:0x0030, B:28:0x0037), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Kb kb, int i) {
        Object failure;
        String installReferrer;
        Ui ui;
        try {
            if (i != 0) {
                kb.getClass();
                a(i);
                failure = new C0252cj("The connection returned an error code " + i, null, 2, null);
            } else {
                ReferrerDetails installReferrer2 = kb.a.getInstallReferrer();
                if (installReferrer2 != null && (installReferrer = installReferrer2.getInstallReferrer()) != null && !evu0.J(installReferrer)) {
                    ui = new Ui(installReferrer2.getInstallReferrer(), installReferrer2.getReferrerClickTimestampSeconds(), installReferrer2.getInstallBeginTimestampSeconds(), 2);
                    failure = ui != null ? new C0252cj("Referrer is null", null, 2, null) : new C0281dj(ui);
                }
                ui = null;
                if (ui != null) {
                }
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            C0313en c0313en = Cm.a;
            c0313en.getClass();
            c0313en.a(new Dm("Failed to get referrer via Google Play referrer library", a));
            failure = new C0252cj("Failed to get referrer via Google Play referrer library", a);
        }
        InterfaceC0309ej interfaceC0309ej = (InterfaceC0309ej) failure;
        try {
            kb.a.endConnection();
        } catch (Throwable unused) {
        }
        kb.b.a(interfaceC0309ej);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        this.c.a.execute(new xm2(this, i, 10));
    }

    public static void a(int i) {
        if (i == 3) {
            C0313en c0313en = Cm.a;
            IllegalStateException illegalStateException = new IllegalStateException("Developer error");
            c0313en.getClass();
            c0313en.a(new Dm("Failed to get referrer via Google Play referrer library", illegalStateException));
            return;
        }
        if (i != 4) {
            return;
        }
        C0313en c0313en2 = Cm.a;
        IllegalStateException illegalStateException2 = new IllegalStateException("Permission error");
        c0313en2.getClass();
        c0313en2.a(new Dm("Failed to get referrer via Google Play referrer library", illegalStateException2));
    }
}
