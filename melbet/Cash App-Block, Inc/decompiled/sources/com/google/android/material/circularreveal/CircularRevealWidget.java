package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.math.MathUtils;

/* loaded from: classes4.dex */
public interface CircularRevealWidget {

    public final class CircularRevealEvaluator implements TypeEvaluator {
        public static final CircularRevealEvaluator CIRCULAR_REVEAL = new CircularRevealEvaluator();
        public final RevealInfo revealInfo = new RevealInfo();

        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            RevealInfo revealInfo = (RevealInfo) obj;
            RevealInfo revealInfo2 = (RevealInfo) obj2;
            float lerp = MathUtils.lerp(revealInfo.centerX, revealInfo2.centerX, f);
            float lerp2 = MathUtils.lerp(revealInfo.centerY, revealInfo2.centerY, f);
            float lerp3 = MathUtils.lerp(revealInfo.radius, revealInfo2.radius, f);
            RevealInfo revealInfo3 = this.revealInfo;
            revealInfo3.centerX = lerp;
            revealInfo3.centerY = lerp2;
            revealInfo3.radius = lerp3;
            return revealInfo3;
        }
    }

    public final class CircularRevealProperty extends Property {
        public static final CircularRevealProperty CIRCULAR_REVEAL = new CircularRevealProperty(RevealInfo.class, "circularReveal");

        @Override // android.util.Property
        public final Object get(Object obj) {
            return ((CircularRevealWidget) obj).getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(Object obj, Object obj2) {
            ((CircularRevealWidget) obj).setRevealInfo((RevealInfo) obj2);
        }
    }

    public final class CircularRevealScrimColorProperty extends Property {
        public static final CircularRevealScrimColorProperty CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealScrimColorProperty(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Object get(Object obj) {
            return Integer.valueOf(((CircularRevealWidget) obj).getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(Object obj, Object obj2) {
            ((CircularRevealWidget) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    void actualDraw(Canvas canvas);

    boolean actualIsOpaque();

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    int getCircularRevealScrimColor();

    RevealInfo getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(RevealInfo revealInfo);

    public final class RevealInfo {
        public float centerX;
        public float centerY;
        public float radius;

        public RevealInfo(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        public RevealInfo(RevealInfo revealInfo) {
            this(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }
    }
}
