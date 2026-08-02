package com.IceFishing.LiveIceFishing;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class r implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6421n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Dialog f6422u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MWebActivity f6423v;

    public /* synthetic */ r(MWebActivity mWebActivity, Dialog dialog, int i) {
        this.f6421n = i;
        this.f6423v = mWebActivity;
        this.f6422u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6421n) {
            case 0:
                MWebActivity mWebActivity = this.f6423v;
                view.startAnimation(AnimationUtils.loadAnimation(mWebActivity.getApplicationContext(), C5248R.anim.button_push));
                this.f6422u.dismiss();
                mWebActivity.f6298v.reload();
                break;
            case 1:
                view.startAnimation(AnimationUtils.loadAnimation(this.f6423v.getApplicationContext(), C5248R.anim.button_push));
                this.f6422u.dismiss();
                break;
            default:
                MWebActivity mWebActivity2 = this.f6423v;
                view.startAnimation(AnimationUtils.loadAnimation(mWebActivity2.getApplicationContext(), C5248R.anim.button_push));
                try {
                    Y0.p.e(mWebActivity2.f6296n).j(mWebActivity2, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new I0.j(20, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
        }
    }
}
