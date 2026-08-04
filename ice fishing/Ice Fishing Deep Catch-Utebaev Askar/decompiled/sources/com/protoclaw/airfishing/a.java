package com.protoclaw.airfishing;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f107b;

    public /* synthetic */ a(MainActivity mainActivity, int i2) {
        this.f106a = i2;
        this.f107b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f106a;
        MainActivity this$0 = this.f107b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MainActivity.hdLdr$lambda$13(this$0);
                break;
            case 1:
                MainActivity.NativeActions.postMessage$lambda$0(this$0);
                break;
            case 2:
                MainActivity.NativeActions.postMessage$lambda$1(this$0);
                break;
            default:
                int i3 = c.f109b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.hdLdr();
                break;
        }
    }
}
