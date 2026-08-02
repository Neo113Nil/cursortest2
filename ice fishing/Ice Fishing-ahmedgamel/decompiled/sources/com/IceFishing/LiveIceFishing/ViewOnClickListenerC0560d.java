package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/* renamed from: com.IceFishing.LiveIceFishing.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0560d implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6396n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GenderActivity f6397u;

    public /* synthetic */ ViewOnClickListenerC0560d(GenderActivity genderActivity, int i) {
        this.f6396n = i;
        this.f6397u = genderActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6396n) {
            case 0:
                GenderActivity.e(this.f6397u, "US");
                break;
            case 1:
                GenderActivity.e(this.f6397u, "SPAIN");
                break;
            default:
                GenderActivity genderActivity = this.f6397u;
                if (!genderActivity.f5920n) {
                    Toast.makeText(genderActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    view.startAnimation(AnimationUtils.loadAnimation(genderActivity.getApplicationContext(), C5248R.anim.button_push));
                    try {
                        Y0.p.e(genderActivity.f5921u).j(genderActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new I0.j(19, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
