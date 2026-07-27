package com.icefishing.icefishinglive2;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import o4.C4799l;

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
                    C4799l.e(playgamesActivity.f36885z).j(playgamesActivity, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new I0.j(22, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
        }
    }
}
