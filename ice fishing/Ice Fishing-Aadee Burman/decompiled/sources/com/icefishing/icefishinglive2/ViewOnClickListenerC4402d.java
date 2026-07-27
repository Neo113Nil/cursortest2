package com.icefishing.icefishinglive2;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import g1.C4522b;
import o4.C4799l;

/* renamed from: com.icefishing.icefishinglive2.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4402d implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36907n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GenderActivity f36908u;

    public /* synthetic */ ViewOnClickListenerC4402d(GenderActivity genderActivity, int i) {
        this.f36907n = i;
        this.f36908u = genderActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36907n) {
            case 0:
                GenderActivity.e(this.f36908u, "US");
                break;
            case 1:
                GenderActivity.e(this.f36908u, "SPAIN");
                break;
            default:
                GenderActivity genderActivity = this.f36908u;
                if (!genderActivity.f36426n) {
                    Toast.makeText(genderActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    view.startAnimation(AnimationUtils.loadAnimation(genderActivity.getApplicationContext(), C5275R.anim.button_push));
                    try {
                        C4799l.e(genderActivity.f36427u).j(genderActivity, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4522b(15, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
