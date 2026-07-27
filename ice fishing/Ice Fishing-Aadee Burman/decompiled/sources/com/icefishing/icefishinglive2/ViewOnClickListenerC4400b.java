package com.icefishing.icefishinglive2;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import g1.C4523c;
import o4.C4799l;

/* renamed from: com.icefishing.icefishinglive2.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4400b implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36903n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CountryActivity f36904u;

    public /* synthetic */ ViewOnClickListenerC4400b(CountryActivity countryActivity, int i) {
        this.f36903n = i;
        this.f36904u = countryActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36903n) {
            case 0:
                CountryActivity.e(this.f36904u, "US");
                break;
            case 1:
                CountryActivity.e(this.f36904u, "SPAIN");
                break;
            case 2:
                CountryActivity.e(this.f36904u, "INDIA");
                break;
            case 3:
                CountryActivity.e(this.f36904u, "FRANCE");
                break;
            case 4:
                CountryActivity.e(this.f36904u, "GERMANY");
                break;
            case 5:
                CountryActivity.e(this.f36904u, "ITALY");
                break;
            case 6:
                CountryActivity.e(this.f36904u, "ARABIA");
                break;
            case 7:
                CountryActivity.e(this.f36904u, "OTHER");
                break;
            default:
                CountryActivity countryActivity = this.f36904u;
                view.startAnimation(AnimationUtils.loadAnimation(countryActivity.getApplicationContext(), C5275R.anim.button_push));
                if (!countryActivity.f36374n) {
                    Toast.makeText(countryActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        C4799l.e(countryActivity.f36365L).j(countryActivity, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4523c(16, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
