package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/* renamed from: com.IceFishing.LiveIceFishing.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0557a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6388n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AgeSelection f6389u;

    public /* synthetic */ ViewOnClickListenerC0557a(AgeSelection ageSelection, int i) {
        this.f6388n = i;
        this.f6389u = ageSelection;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6388n) {
            case 0:
                AgeSelection.e(this.f6389u, "US");
                break;
            case 1:
                AgeSelection.e(this.f6389u, "SPAIN");
                break;
            case 2:
                AgeSelection.e(this.f6389u, "INDIA");
                break;
            case 3:
                AgeSelection.e(this.f6389u, "FRANCE");
                break;
            default:
                AgeSelection ageSelection = this.f6389u;
                view.startAnimation(AnimationUtils.loadAnimation(ageSelection.getApplicationContext(), C5248R.anim.button_push));
                if (!ageSelection.f5839n) {
                    Toast.makeText(ageSelection, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        Y0.p.e(ageSelection.f5834D).j(ageSelection, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new I0.j(18, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
