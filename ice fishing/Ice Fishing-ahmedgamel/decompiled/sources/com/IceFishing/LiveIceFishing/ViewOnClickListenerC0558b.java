package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import i1.C4585b;

/* renamed from: com.IceFishing.LiveIceFishing.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0558b implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6392n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CountryActivity f6393u;

    public /* synthetic */ ViewOnClickListenerC0558b(CountryActivity countryActivity, int i) {
        this.f6392n = i;
        this.f6393u = countryActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6392n) {
            case 0:
                CountryActivity.e(this.f6393u, "US");
                break;
            case 1:
                CountryActivity.e(this.f6393u, "SPAIN");
                break;
            case 2:
                CountryActivity.e(this.f6393u, "INDIA");
                break;
            case 3:
                CountryActivity.e(this.f6393u, "FRANCE");
                break;
            case 4:
                CountryActivity.e(this.f6393u, "GERMANY");
                break;
            case 5:
                CountryActivity.e(this.f6393u, "ITALY");
                break;
            case 6:
                CountryActivity.e(this.f6393u, "ARABIA");
                break;
            case 7:
                CountryActivity.e(this.f6393u, "OTHER");
                break;
            default:
                CountryActivity countryActivity = this.f6393u;
                view.startAnimation(AnimationUtils.loadAnimation(countryActivity.getApplicationContext(), C5248R.anim.button_push));
                if (!countryActivity.f5868n) {
                    Toast.makeText(countryActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        Y0.p.e(countryActivity.f5859L).j(countryActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4585b(18, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
