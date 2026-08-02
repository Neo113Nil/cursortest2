package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;

/* loaded from: classes10.dex */
public final class ui10 implements wp61 {
    public final /* synthetic */ int a = 0;
    public final float b;
    public final Context c;
    public final Object w;
    public final Object x;

    public ui10(Context context) {
        this.b = 1.0f;
        this.c = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.w = activityManager;
        this.x = new i4u(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.b = 0.0f;
        }
    }

    @Override // defpackage.wp61
    public hm61 l(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.a;
        Object obj = this.w;
        float f = this.b;
        Context context = this.c;
        Object obj2 = this.x;
        switch (i3) {
            case 1:
                hm61 hm61Var = (hm61) obj2;
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int round = Math.round(sj71.f(context) * f);
                ViewGroup.LayoutParams layoutParams = ((ViewGroup) obj).getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
                }
                int max = (int) Math.max(Math.min(size, round), 0.0d);
                hm61Var.a = i;
                hm61Var.b = View.MeasureSpec.makeMeasureSpec(max, mode);
                return hm61Var;
            default:
                hm61 hm61Var2 = (hm61) obj2;
                int mode2 = View.MeasureSpec.getMode(i);
                int size2 = View.MeasureSpec.getSize(i);
                am81 am81Var = sj71.a;
                int round2 = Math.round(context.getResources().getDisplayMetrics().widthPixels * f);
                ViewGroup.LayoutParams layoutParams2 = ((ExtendedViewContainer) obj).getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    round2 = (round2 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                }
                hm61Var2.a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size2, round2), 0.0d), mode2);
                hm61Var2.b = i2;
                return hm61Var2;
        }
    }

    public ui10(ExtendedViewContainer extendedViewContainer, float f) {
        Context applicationContext = extendedViewContainer.getContext().getApplicationContext();
        hm61 hm61Var = new hm61();
        this.w = extendedViewContainer;
        this.b = f;
        this.c = applicationContext;
        this.x = hm61Var;
    }

    public ui10(ViewGroup viewGroup, float f) {
        Context applicationContext = viewGroup.getContext().getApplicationContext();
        hm61 hm61Var = new hm61();
        this.w = viewGroup;
        this.b = f;
        this.c = applicationContext;
        this.x = hm61Var;
    }
}
