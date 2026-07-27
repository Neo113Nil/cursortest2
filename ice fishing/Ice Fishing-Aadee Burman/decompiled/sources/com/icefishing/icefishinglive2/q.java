package com.icefishing.icefishinglive2;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import o4.C4799l;

/* loaded from: classes2.dex */
public final class q implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36930n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f36931u;

    public /* synthetic */ q(LanguageActivity languageActivity, int i) {
        this.f36930n = i;
        this.f36931u = languageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36930n) {
            case 0:
                LanguageActivity.e(this.f36931u, "US");
                break;
            case 1:
                LanguageActivity.e(this.f36931u, "SPAIN");
                break;
            case 2:
                LanguageActivity.e(this.f36931u, "INDIA");
                break;
            case 3:
                LanguageActivity.e(this.f36931u, "FRANCE");
                break;
            case 4:
                LanguageActivity.e(this.f36931u, "GERMANY");
                break;
            case 5:
                LanguageActivity.e(this.f36931u, "ITALY");
                break;
            case 6:
                LanguageActivity.e(this.f36931u, "ARABIA");
                break;
            case 7:
                LanguageActivity.e(this.f36931u, "OTHER");
                break;
            default:
                LanguageActivity languageActivity = this.f36931u;
                view.startAnimation(AnimationUtils.loadAnimation(languageActivity.getApplicationContext(), C5275R.anim.button_push));
                if (!languageActivity.f36799n) {
                    Toast.makeText(languageActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        C4799l.e(languageActivity.f36790L).j(languageActivity, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new I0.j(20, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
        }
    }
}
