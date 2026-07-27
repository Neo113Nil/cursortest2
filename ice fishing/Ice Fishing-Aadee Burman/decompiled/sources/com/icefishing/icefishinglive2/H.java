package com.icefishing.icefishinglive2;

import android.app.Dialog;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes2.dex */
public final class H implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36771n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Dialog f36772u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ StartActivity f36773v;

    public /* synthetic */ H(StartActivity startActivity, Dialog dialog, int i) {
        this.f36771n = i;
        this.f36773v = startActivity;
        this.f36772u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36771n) {
            case 0:
                view.startAnimation(AnimationUtils.loadAnimation(this.f36773v.getApplicationContext(), C5275R.anim.button_push));
                this.f36772u.dismiss();
                break;
            default:
                StartActivity startActivity = this.f36773v;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity.getApplicationContext(), C5275R.anim.button_push));
                this.f36772u.dismiss();
                startActivity.finishAffinity();
                break;
        }
    }
}
