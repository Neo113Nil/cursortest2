package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public class CircularRevealFrameLayout extends FrameLayout implements CircularRevealWidget {
    public final JWECryptoParts helper;

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.helper = new JWECryptoParts(this);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public final void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public final boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public final void buildCircularRevealCache() {
        this.helper.getClass();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public final void destroyCircularRevealCache() {
        this.helper.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        JWECryptoParts jWECryptoParts = this.helper;
        if (jWECryptoParts != null) {
            jWECryptoParts.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public final int getCircularRevealScrimColor() {
        return ((Paint) this.helper.iv).getColor();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public final CircularRevealWidget.RevealInfo getRevealInfo() {
        JWECryptoParts jWECryptoParts = this.helper;
        CircularRevealWidget.RevealInfo revealInfo = (CircularRevealWidget.RevealInfo) jWECryptoParts.cipherText;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.radius == Float.MAX_VALUE) {
            float f = revealInfo2.centerX;
            float f2 = revealInfo2.centerY;
            FrameLayout frameLayout = (FrameLayout) jWECryptoParts.encryptedKey;
            revealInfo2.radius = MathUtils.distanceToFurthestCorner(f, f2, frameLayout.getWidth(), frameLayout.getHeight());
        }
        return revealInfo2;
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        JWECryptoParts jWECryptoParts = this.helper;
        if (jWECryptoParts == null) {
            return super.isOpaque();
        }
        if (!((CircularRevealWidget) jWECryptoParts.header).actualIsOpaque()) {
            return false;
        }
        CircularRevealWidget.RevealInfo revealInfo = (CircularRevealWidget.RevealInfo) jWECryptoParts.cipherText;
        return revealInfo == null || revealInfo.radius == Float.MAX_VALUE;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        JWECryptoParts jWECryptoParts = this.helper;
        jWECryptoParts.authenticationTag = drawable;
        ((FrameLayout) jWECryptoParts.encryptedKey).invalidate();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(int i) {
        JWECryptoParts jWECryptoParts = this.helper;
        ((Paint) jWECryptoParts.iv).setColor(i);
        ((FrameLayout) jWECryptoParts.encryptedKey).invalidate();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(CircularRevealWidget.RevealInfo revealInfo) {
        this.helper.setRevealInfo(revealInfo);
    }

    public CircularRevealFrameLayout(Context context) {
        this(context, null);
    }
}
