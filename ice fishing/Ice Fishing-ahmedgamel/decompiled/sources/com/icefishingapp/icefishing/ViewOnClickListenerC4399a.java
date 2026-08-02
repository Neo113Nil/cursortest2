package com.icefishingapp.icefishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import g1.C4522b;

/* renamed from: com.icefishingapp.icefishing.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4399a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36899n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AgeSelection f36900u;

    public /* synthetic */ ViewOnClickListenerC4399a(AgeSelection ageSelection, int i) {
        this.f36899n = i;
        this.f36900u = ageSelection;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36899n) {
            case 0:
                AgeSelection.e(this.f36900u, "US");
                break;
            case 1:
                AgeSelection.e(this.f36900u, "SPAIN");
                break;
            case 2:
                AgeSelection.e(this.f36900u, "INDIA");
                break;
            case 3:
                AgeSelection.e(this.f36900u, "FRANCE");
                break;
            default:
                AgeSelection ageSelection = this.f36900u;
                view.startAnimation(AnimationUtils.loadAnimation(ageSelection.getApplicationContext(), C5275R.anim.button_push));
                if (!ageSelection.f36346n) {
                    Toast.makeText(ageSelection, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        o4.m.e(ageSelection.f36341D).j(ageSelection, o4.m.f39627t, o4.m.f39619l, o4.m.f39600I, new C4522b(14, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
