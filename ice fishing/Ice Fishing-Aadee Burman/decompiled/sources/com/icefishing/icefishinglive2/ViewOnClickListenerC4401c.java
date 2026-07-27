package com.icefishing.icefishinglive2;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import o4.C4799l;

/* renamed from: com.icefishing.icefishinglive2.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4401c implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36905n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GameCategoriesActivity f36906u;

    public /* synthetic */ ViewOnClickListenerC4401c(GameCategoriesActivity gameCategoriesActivity, int i) {
        this.f36905n = i;
        this.f36906u = gameCategoriesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36905n) {
            case 0:
                GameCategoriesActivity.e(this.f36906u, "horror");
                break;
            case 1:
                GameCategoriesActivity gameCategoriesActivity = this.f36906u;
                view.startAnimation(AnimationUtils.loadAnimation(gameCategoriesActivity.getApplicationContext(), C5275R.anim.button_push));
                if (!gameCategoriesActivity.f36417n) {
                    Toast.makeText(gameCategoriesActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        C4799l.e(gameCategoriesActivity.f36407P).j(gameCategoriesActivity, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new I0.j(19, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
            case 2:
                GameCategoriesActivity.e(this.f36906u, "US");
                break;
            case 3:
                GameCategoriesActivity.e(this.f36906u, "SPAIN");
                break;
            case 4:
                GameCategoriesActivity.e(this.f36906u, "INDIA");
                break;
            case 5:
                GameCategoriesActivity.e(this.f36906u, "FRANCE");
                break;
            case 6:
                GameCategoriesActivity.e(this.f36906u, "GERMANY");
                break;
            case 7:
                GameCategoriesActivity.e(this.f36906u, "ITALY");
                break;
            case 8:
                GameCategoriesActivity.e(this.f36906u, "ARABIA");
                break;
            case 9:
                GameCategoriesActivity.e(this.f36906u, "lifestyle");
                break;
            default:
                GameCategoriesActivity.e(this.f36906u, "photo");
                break;
        }
    }
}
