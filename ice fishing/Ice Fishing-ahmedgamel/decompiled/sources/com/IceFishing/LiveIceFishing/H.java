package com.IceFishing.LiveIceFishing;

import android.app.Dialog;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class H implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6261n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Dialog f6262u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ StartActivity f6263v;

    public /* synthetic */ H(StartActivity startActivity, Dialog dialog, int i) {
        this.f6261n = i;
        this.f6263v = startActivity;
        this.f6262u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6261n) {
            case 0:
                view.startAnimation(AnimationUtils.loadAnimation(this.f6263v.getApplicationContext(), C5248R.anim.button_push));
                this.f6262u.dismiss();
                break;
            default:
                StartActivity startActivity = this.f6263v;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity.getApplicationContext(), C5248R.anim.button_push));
                this.f6262u.dismiss();
                startActivity.finishAffinity();
                break;
        }
    }
}
