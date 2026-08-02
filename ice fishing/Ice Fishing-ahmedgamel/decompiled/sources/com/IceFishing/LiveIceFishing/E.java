package com.IceFishing.LiveIceFishing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;
import w2.C5147g;
import w2.RunnableC5149i;

/* loaded from: classes.dex */
public final class E implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5881n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5882u;

    public /* synthetic */ E(int i, Object obj) {
        this.f5881n = i;
        this.f5882u = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5881n) {
            case 0:
                Intent intent = new Intent("android.settings.SETTINGS");
                SplashActivity splashActivity = (SplashActivity) this.f5882u;
                splashActivity.startActivity(intent);
                splashActivity.onBackPressed();
                break;
            case 1:
                ((AtomicInteger) this.f5882u).set(i);
                break;
            case 2:
                ((C5147g) this.f5882u).b();
                break;
            default:
                w2.D d9 = C4906k.f40186C.f40191c;
                w2.D.t((Context) this.f5882u, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }

    public E(RunnableC5149i runnableC5149i, Context context) {
        this.f5881n = 3;
        this.f5882u = context;
    }
}
