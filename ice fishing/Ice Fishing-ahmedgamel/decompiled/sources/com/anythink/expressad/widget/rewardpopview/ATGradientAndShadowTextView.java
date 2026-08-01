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
    private int f22547a;

    /* renamed from: b, reason: collision with root package name */
    private int f22548b;

    /* renamed from: c, reason: collision with root package name */
    private int f22549c;

    /* renamed from: d, reason: collision with root package name */
    private int f22550d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f22551e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f22552a;

        /* renamed from: b, reason: collision with root package name */
        public int f22553b;

        /* renamed from: c, reason: collision with root package name */
        public int f22554c;

        /* renamed from: d, reason: collision with root package name */
        public int f22555d = 40;

        /* renamed from: e, reason: collision with root package name */
        public float f22556e = 3.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f22557f = 1.5f;

        /* renamed from: g, reason: collision with root package name */
        public float f22558g = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context) {
        super(context);
        this.f22547a = b.f22573p;
        this.f22548b = b.f22574q;
        this.f22549c = b.f22568k;
        this.f22550d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f22550d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f22551e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f22547a, this.f22548b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f22549c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f22551e);
        super.onDraw(canvas);
    }

    public ATGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f22547a = b.f22573p;
        this.f22548b = b.f22574q;
        this.f22549c = b.f22568k;
        this.f22550d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f22547a = aVar.f22552a;
            this.f22548b = aVar.f22553b;
            this.f22549c = aVar.f22554c;
            this.f22550d = aVar.f22555d;
            this.mShadowRadius = aVar.f22556e;
            this.mShadowDx = aVar.f22557f;
            this.mShadowDy = aVar.f22558g;
        }
        a();
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22547a = b.f22573p;
        this.f22548b = b.f22574q;
        this.f22549c = b.f22568k;
        this.f22550d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22547a = b.f22573p;
        this.f22548b = b.f22574q;
        this.f22549c = b.f22568k;
        this.f22550d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
        this.f22547a = b.f22573p;
        this.f22548b = b.f22574q;
        this.f22549c = b.f22568k;
        this.f22550d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
