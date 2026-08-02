package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.AnimationUtils;
import com.google.mlkit.vision.text.zzd;

/* loaded from: classes4.dex */
public final class FadeTabIndicatorInterpolator extends zzd {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FadeTabIndicatorInterpolator(int i) {
        super(8);
        this.$r8$classId = i;
    }

    @Override // com.google.mlkit.vision.text.zzd
    public final void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float sin;
        float cos;
        switch (this.$r8$classId) {
            case 0:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF calculateIndicatorWidthForTab = zzd.calculateIndicatorWidthForTab(tabLayout, view);
                float lerp = f < 0.5f ? AnimationUtils.lerp(1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f, f) : AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (lerp * 255.0f));
                break;
            default:
                RectF calculateIndicatorWidthForTab2 = zzd.calculateIndicatorWidthForTab(tabLayout, view);
                RectF calculateIndicatorWidthForTab3 = zzd.calculateIndicatorWidthForTab(tabLayout, view2);
                if (calculateIndicatorWidthForTab2.left < calculateIndicatorWidthForTab3.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d2);
                    cos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(AnimationUtils.lerp((int) calculateIndicatorWidthForTab2.left, (int) calculateIndicatorWidthForTab3.left, sin), drawable.getBounds().top, AnimationUtils.lerp((int) calculateIndicatorWidthForTab2.right, (int) calculateIndicatorWidthForTab3.right, cos), drawable.getBounds().bottom);
                break;
        }
    }
}
