package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.viewpager.widget.ViewPager;
import i1.C4585b;
import i1.C4586c;

/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6416n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f6417u;

    public /* synthetic */ o(IntroActivity introActivity, int i) {
        this.f6416n = i;
        this.f6417u = introActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6416n) {
            case 0:
                IntroActivity introActivity = this.f6417u;
                view.startAnimation(AnimationUtils.loadAnimation(introActivity.getApplicationContext(), C5248R.anim.button_push));
                if (introActivity.f6267v.getCurrentItem() != 2) {
                    ViewPager viewPager = introActivity.f6267v;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                    break;
                } else {
                    introActivity.f6269x = new Intent(introActivity, (Class<?>) StartActivity.class);
                    try {
                        Y0.p.e(introActivity.f6266u).j(introActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4585b(19, this));
                        break;
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
            default:
                IntroActivity introActivity2 = this.f6417u;
                view.startAnimation(AnimationUtils.loadAnimation(introActivity2.getApplicationContext(), C5248R.anim.button_push));
                introActivity2.f6269x = new Intent(introActivity2, (Class<?>) StartActivity.class);
                try {
                    Y0.p.e(introActivity2.f6266u).j(introActivity2, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4586c(16, this));
                    break;
                } catch (ActivityNotFoundException e10) {
                    e10.printStackTrace();
                }
        }
    }
}
