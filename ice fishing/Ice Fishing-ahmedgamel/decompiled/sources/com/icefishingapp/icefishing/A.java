package com.icefishingapp.icefishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes2.dex */
public final class A implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36336n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PlaygamesActivity f36337u;

    public /* synthetic */ A(PlaygamesActivity playgamesActivity, int i) {
        this.f36336n = i;
        this.f36337u = playgamesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36336n) {
            case 0:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            default:
                PlaygamesActivity playgamesActivity = this.f36337u;
                view.startAnimation(AnimationUtils.loadAnimation(playgamesActivity.getApplicationContext(), C5275R.anim.button_push));
                playgamesActivity.f36880u.setClass(playgamesActivity.getApplicationContext(), MWebActivity.class);
                playgamesActivity.f36880u.putExtra("web_url", playgamesActivity.f36884y.getText().toString());
                try {
                    o4.m.e(playgamesActivity.f36885z).j(playgamesActivity, o4.m.f39627t, o4.m.f39619l, o4.m.f39600I, new I0.j(22, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
        }
    }
}
