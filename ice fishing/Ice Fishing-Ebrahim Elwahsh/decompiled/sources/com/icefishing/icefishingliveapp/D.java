package com.icefishing.icefishingliveapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import t2.C5074h;
import t2.RunnableC5076j;

/* loaded from: classes2.dex */
public final class D implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36543n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f36544u;

    public /* synthetic */ D(int i, Object obj) {
        this.f36543n = i;
        this.f36544u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36543n) {
            case 0:
                Intent intent = new Intent("android.settings.SETTINGS");
                SplashActivity splashActivity = (SplashActivity) this.f36544u;
                splashActivity.startActivity(intent);
                splashActivity.onBackPressed();
                break;
            case 1:
                ((AtomicInteger) this.f36544u).set(i);
                break;
            case 2:
                ((C5074h) this.f36544u).b();
                break;
            default:
                t2.G g9 = p2.j.f39798C.f39803c;
                t2.G.t((Context) this.f36544u, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }

    public D(RunnableC5076j runnableC5076j, Context context) {
        this.f36543n = 3;
        this.f36544u = context;
    }
}
