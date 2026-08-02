package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class q implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6419n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f6420u;

    public /* synthetic */ q(LanguageActivity languageActivity, int i) {
        this.f6419n = i;
        this.f6420u = languageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6419n) {
            case 0:
                LanguageActivity.e(this.f6420u, "US");
                break;
            case 1:
                LanguageActivity.e(this.f6420u, "SPAIN");
                break;
            case 2:
                LanguageActivity.e(this.f6420u, "INDIA");
                break;
            case 3:
                LanguageActivity.e(this.f6420u, "FRANCE");
                break;
            case 4:
                LanguageActivity.e(this.f6420u, "GERMANY");
                break;
            case 5:
                LanguageActivity.e(this.f6420u, "ITALY");
                break;
            case 6:
                LanguageActivity.e(this.f6420u, "ARABIA");
                break;
            case 7:
                LanguageActivity.e(this.f6420u, "OTHER");
                break;
            default:
                LanguageActivity languageActivity = this.f6420u;
                view.startAnimation(AnimationUtils.loadAnimation(languageActivity.getApplicationContext(), C5248R.anim.button_push));
                if (!languageActivity.f6289n) {
                    Toast.makeText(languageActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        Y0.p.e(languageActivity.f6280L).j(languageActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new n4.c(23, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
