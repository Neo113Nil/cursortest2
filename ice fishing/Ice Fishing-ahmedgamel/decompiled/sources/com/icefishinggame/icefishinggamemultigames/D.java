package com.icefishinggame.icefishinggamemultigames;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;
import u2.C5076g;
import u2.RunnableC5078i;

/* loaded from: classes2.dex */
public final class D implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36381n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f36382u;

    public /* synthetic */ D(int i, Object obj) {
        this.f36381n = i;
        this.f36382u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36381n) {
            case 0:
                Intent intent = new Intent("android.settings.SETTINGS");
                SplashActivity splashActivity = (SplashActivity) this.f36382u;
                splashActivity.startActivity(intent);
                splashActivity.onBackPressed();
                break;
            case 1:
                ((AtomicInteger) this.f36382u).set(i);
                break;
            case 2:
                ((C5076g) this.f36382u).b();
                break;
            default:
                u2.D d2 = C4835j.f39733C.f39738c;
                u2.D.t((Context) this.f36382u, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }

    public D(RunnableC5078i runnableC5078i, Context context) {
        this.f36381n = 3;
        this.f36382u = context;
    }
}
