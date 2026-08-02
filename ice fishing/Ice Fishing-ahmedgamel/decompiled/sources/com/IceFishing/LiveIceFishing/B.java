package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class B implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5846n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PlaygamesActivity f5847u;

    public /* synthetic */ B(PlaygamesActivity playgamesActivity, int i) {
        this.f5846n = i;
        this.f5847u = playgamesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5846n) {
            case 0:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            default:
                PlaygamesActivity playgamesActivity = this.f5847u;
                view.startAnimation(AnimationUtils.loadAnimation(playgamesActivity.getApplicationContext(), C5248R.anim.button_push));
                playgamesActivity.f6369u.setClass(playgamesActivity.getApplicationContext(), MWebActivity.class);
                playgamesActivity.f6369u.putExtra("web_url", playgamesActivity.f6373y.getText().toString());
                try {
                    Y0.p.e(playgamesActivity.f6374z).j(playgamesActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new n4.c(25, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
        }
    }
}
