package com.google.android.gms.ads.nativead;

import I0.j;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g1.C4522b;
import k2.o;

/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public o f23589n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23590u;

    /* renamed from: v, reason: collision with root package name */
    public C4522b f23591v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView.ScaleType f23592w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23593x;

    /* renamed from: y, reason: collision with root package name */
    public j f23594y;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o getMediaContent() {
        return this.f23589n;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f23593x = true;
        this.f23592w = scaleType;
        j jVar = this.f23594y;
        if (jVar != null) {
            jVar.b(scaleType);
        }
    }

    public void setMediaContent(o oVar) {
        this.f23590u = true;
        this.f23589n = oVar;
        C4522b c4522b = this.f23591v;
        if (c4522b != null) {
            c4522b.X(oVar);
        }
    }
}
