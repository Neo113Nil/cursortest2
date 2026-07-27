package com.icefishing.icefishinglive2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.viewpager.widget.ViewPager;
import g1.C4523c;
import o4.C4799l;

/* loaded from: classes2.dex */
public final class o implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36927n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f36928u;

    public /* synthetic */ o(IntroActivity introActivity, int i) {
        this.f36927n = i;
        this.f36928u = introActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36927n) {
            case 0:
                IntroActivity introActivity = this.f36928u;
                view.startAnimation(AnimationUtils.loadAnimation(introActivity.getApplicationContext(), C5275R.anim.button_push));
                if (introActivity.f36777v.getCurrentItem() != 2) {
                    ViewPager viewPager = introActivity.f36777v;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                    break;
                } else {
                    introActivity.f36779x = new Intent(introActivity, (Class<?>) StartActivity.class);
                    try {
                        C4799l.e(introActivity.f36776u).j(introActivity, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4523c(17, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
            default:
                IntroActivity introActivity2 = this.f36928u;
                view.startAnimation(AnimationUtils.loadAnimation(introActivity2.getApplicationContext(), C5275R.anim.button_push));
                introActivity2.f36779x = new Intent(introActivity2, (Class<?>) StartActivity.class);
                try {
                    C4799l.e(introActivity2.f36776u).j(introActivity2, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new F1.a(13, this));
                    break;
                } catch (ActivityNotFoundException e10) {
                    e10.printStackTrace();
                }
        }
    }
}
