package com.anythink.expressad.widget.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ATGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f22705a;

    /* renamed from: b, reason: collision with root package name */
    private int f22706b;

    /* renamed from: c, reason: collision with root package name */
    private int f22707c;

    /* renamed from: d, reason: collision with root package name */
    private int f22708d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f22709e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f22710a;

        /* renamed from: b, reason: collision with root package name */
        public int f22711b;

        /* renamed from: c, reason: collision with root package name */
        public int f22712c;

        /* renamed from: d, reason: collision with root package name */
        public int f22713d = 40;

        /* renamed from: e, reason: collision with root package name */
        public float f22714e = 3.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f22715f = 1.5f;

        /* renamed from: g, reason: collision with root package name */
        public float f22716g = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context) {
        super(context);
        this.f22705a = b.f22731p;
        this.f22706b = b.f22732q;
        this.f22707c = b.f22726k;
        this.f22708d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f22708d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f22709e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f22705a, this.f22706b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f22707c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f22709e);
        super.onDraw(canvas);
    }

    public ATGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f22705a = b.f22731p;
        this.f22706b = b.f22732q;
        this.f22707c = b.f22726k;
        this.f22708d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f22705a = aVar.f22710a;
            this.f22706b = aVar.f22711b;
            this.f22707c = aVar.f22712c;
            this.f22708d = aVar.f22713d;
            this.mShadowRadius = aVar.f22714e;
            this.mShadowDx = aVar.f22715f;
            this.mShadowDy = aVar.f22716g;
        }
        a();
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22705a = b.f22731p;
        this.f22706b = b.f22732q;
        this.f22707c = b.f22726k;
        this.f22708d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22705a = b.f22731p;
        this.f22706b = b.f22732q;
        this.f22707c = b.f22726k;
        this.f22708d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f22705a = b.f22731p;
        this.f22706b = b.f22732q;
        this.f22707c = b.f22726k;
        this.f22708d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
