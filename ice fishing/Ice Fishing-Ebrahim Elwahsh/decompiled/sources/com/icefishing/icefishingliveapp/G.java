package com.icefishing.icefishingliveapp;

import android.app.Dialog;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes2.dex */
public final class G implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36554n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Dialog f36555u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ StartActivity f36556v;

    public /* synthetic */ G(StartActivity startActivity, Dialog dialog, int i) {
        this.f36554n = i;
        this.f36556v = startActivity;
        this.f36555u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36554n) {
            case 0:
                view.startAnimation(AnimationUtils.loadAnimation(this.f36556v.getApplicationContext(), C5284R.anim.button_push));
                this.f36555u.dismiss();
                break;
            default:
                StartActivity startActivity = this.f36556v;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity.getApplicationContext(), C5284R.anim.button_push));
                this.f36555u.dismiss();
                startActivity.finishAffinity();
                break;
        }
    }
}
