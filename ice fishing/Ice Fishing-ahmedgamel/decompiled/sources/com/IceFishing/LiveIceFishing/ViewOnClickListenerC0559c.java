package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/* renamed from: com.IceFishing.LiveIceFishing.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0559c implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6394n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GameCategoriesActivity f6395u;

    public /* synthetic */ ViewOnClickListenerC0559c(GameCategoriesActivity gameCategoriesActivity, int i) {
        this.f6394n = i;
        this.f6395u = gameCategoriesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6394n) {
            case 0:
                GameCategoriesActivity.e(this.f6395u, "horror");
                break;
            case 1:
                GameCategoriesActivity gameCategoriesActivity = this.f6395u;
                view.startAnimation(AnimationUtils.loadAnimation(gameCategoriesActivity.getApplicationContext(), C5248R.anim.button_push));
                if (!gameCategoriesActivity.f5911n) {
                    Toast.makeText(gameCategoriesActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        Y0.p.e(gameCategoriesActivity.f5901P).j(gameCategoriesActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new n4.c(22, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
            case 2:
                GameCategoriesActivity.e(this.f6395u, "US");
                break;
            case 3:
                GameCategoriesActivity.e(this.f6395u, "SPAIN");
                break;
            case 4:
                GameCategoriesActivity.e(this.f6395u, "INDIA");
                break;
            case 5:
                GameCategoriesActivity.e(this.f6395u, "FRANCE");
                break;
            case 6:
                GameCategoriesActivity.e(this.f6395u, "GERMANY");
                break;
            case 7:
                GameCategoriesActivity.e(this.f6395u, "ITALY");
                break;
            case 8:
                GameCategoriesActivity.e(this.f6395u, "ARABIA");
                break;
            case 9:
                GameCategoriesActivity.e(this.f6395u, "lifestyle");
                break;
            default:
                GameCategoriesActivity.e(this.f6395u, "photo");
                break;
        }
    }
}
