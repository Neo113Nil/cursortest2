package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import g1.C4524d;

/* renamed from: com.icefishing.icefishingliveapp.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4413b implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37064n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CountryActivity f37065u;

    public /* synthetic */ ViewOnClickListenerC4413b(CountryActivity countryActivity, int i) {
        this.f37064n = i;
        this.f37065u = countryActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37064n) {
            case 0:
                CountryActivity.e(this.f37065u, "US");
                break;
            case 1:
                CountryActivity.e(this.f37065u, "SPAIN");
                break;
            case 2:
                CountryActivity.e(this.f37065u, "INDIA");
                break;
            case 3:
                CountryActivity.e(this.f37065u, "FRANCE");
                break;
            case 4:
                CountryActivity.e(this.f37065u, "GERMANY");
                break;
            case 5:
                CountryActivity.e(this.f37065u, "ITALY");
                break;
            case 6:
                CountryActivity.e(this.f37065u, "ARABIA");
                break;
            case 7:
                CountryActivity.e(this.f37065u, "OTHER");
                break;
            default:
                CountryActivity countryActivity = this.f37065u;
                view.startAnimation(AnimationUtils.loadAnimation(countryActivity.getApplicationContext(), C5284R.anim.button_push));
                if (!countryActivity.f36536n) {
                    Toast.makeText(countryActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        k4.m.e(countryActivity.f36527L).j(countryActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4524d(12, this));
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
        }
    }
}
