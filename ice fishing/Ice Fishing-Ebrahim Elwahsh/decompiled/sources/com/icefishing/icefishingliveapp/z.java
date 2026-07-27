package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes2.dex */
public final class z implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37111n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PlaygamesActivity f37112u;

    public /* synthetic */ z(PlaygamesActivity playgamesActivity, int i) {
        this.f37111n = i;
        this.f37112u = playgamesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37111n) {
            case 0:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            default:
                PlaygamesActivity playgamesActivity = this.f37112u;
                view.startAnimation(AnimationUtils.loadAnimation(playgamesActivity.getApplicationContext(), C5284R.anim.button_push));
                playgamesActivity.f37041u.setClass(playgamesActivity.getApplicationContext(), MWebActivity.class);
                playgamesActivity.f37041u.putExtra("web_url", playgamesActivity.f37045y.getText().toString());
                try {
                    k4.m.e(playgamesActivity.f37046z).j(playgamesActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new I0.j(25, this));
                    break;
                } catch (ActivityNotFoundException e6) {
                    e6.printStackTrace();
                }
        }
    }
}
