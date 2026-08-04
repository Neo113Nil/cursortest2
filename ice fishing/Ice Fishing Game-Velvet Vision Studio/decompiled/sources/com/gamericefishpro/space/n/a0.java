package com.gamericefishpro.space.n;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ int d;
    public final int e;
    public final Object i;
    public final Object v;

    public /* synthetic */ a0(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.i = obj;
        this.v = obj2;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((TextView) this.i).setTypeface((Typeface) this.v, this.e);
                break;
            case 1:
                ((com.gamericefishpro.space.o6.i) this.i).a(this.e, (Intent) this.v);
                break;
            case 2:
                ((SystemForegroundService) this.v).w.notify(this.e, (Notification) this.i);
                break;
            default:
                ((BottomSheetBehavior) this.v).E((View) this.i, this.e, false);
                break;
        }
    }

    public a0(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.d = 2;
        this.v = systemForegroundService;
        this.e = i;
        this.i = notification;
    }

    public a0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = 3;
        this.v = bottomSheetBehavior;
        this.i = view;
        this.e = i;
    }
}
