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
    private int f23334a;

    /* renamed from: b, reason: collision with root package name */
    private int f23335b;

    /* renamed from: c, reason: collision with root package name */
    private int f23336c;

    /* renamed from: d, reason: collision with root package name */
    private int f23337d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f23338e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f23339a;

        /* renamed from: b, reason: collision with root package name */
        public int f23340b;

        /* renamed from: c, reason: collision with root package name */
        public int f23341c;

        /* renamed from: d, reason: collision with root package name */
        public int f23342d = 40;

        /* renamed from: e, reason: collision with root package name */
        public float f23343e = 3.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f23344f = 1.5f;

        /* renamed from: g, reason: collision with root package name */
        public float f23345g = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context) {
        super(context);
        this.f23334a = b.f23360p;
        this.f23335b = b.f23361q;
        this.f23336c = b.f23355k;
        this.f23337d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f23337d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f23338e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f23334a, this.f23335b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f23336c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f23338e);
        super.onDraw(canvas);
    }

    public ATGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f23334a = b.f23360p;
        this.f23335b = b.f23361q;
        this.f23336c = b.f23355k;
        this.f23337d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f23334a = aVar.f23339a;
            this.f23335b = aVar.f23340b;
            this.f23336c = aVar.f23341c;
            this.f23337d = aVar.f23342d;
            this.mShadowRadius = aVar.f23343e;
            this.mShadowDx = aVar.f23344f;
            this.mShadowDy = aVar.f23345g;
        }
        a();
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23334a = b.f23360p;
        this.f23335b = b.f23361q;
        this.f23336c = b.f23355k;
        this.f23337d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23334a = b.f23360p;
        this.f23335b = b.f23361q;
        this.f23336c = b.f23355k;
        this.f23337d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f23334a = b.f23360p;
        this.f23335b = b.f23361q;
        this.f23336c = b.f23355k;
        this.f23337d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
