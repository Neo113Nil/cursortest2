package com.icefishing.icefishinglive2;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import g1.C4522b;
import o4.C4799l;

/* loaded from: classes2.dex */
public final class r implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36932n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Dialog f36933u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MWebActivity f36934v;

    public /* synthetic */ r(MWebActivity mWebActivity, Dialog dialog, int i) {
        this.f36932n = i;
        this.f36934v = mWebActivity;
        this.f36933u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36932n) {
            case 0:
                MWebActivity mWebActivity = this.f36934v;
                view.startAnimation(AnimationUtils.loadAnimation(mWebActivity.getApplicationContext(), C5275R.anim.button_push));
                this.f36933u.dismiss();
                mWebActivity.f36808v.reload();
                break;
            case 1:
                view.startAnimation(AnimationUtils.loadAnimation(this.f36934v.getApplicationContext(), C5275R.anim.button_push));
                this.f36933u.dismiss();
                break;
            default:
                MWebActivity mWebActivity2 = this.f36934v;
                view.startAnimation(AnimationUtils.loadAnimation(mWebActivity2.getApplicationContext(), C5275R.anim.button_push));
                try {
                    C4799l.e(mWebActivity2.f36806n).j(mWebActivity2, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4522b(16, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
        }
    }
}
