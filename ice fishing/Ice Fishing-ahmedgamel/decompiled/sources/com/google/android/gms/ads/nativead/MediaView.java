package com.google.android.gms.ads.nativead;

import I0.j;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i1.C4585b;
import m2.o;

/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public o f24369n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24370u;

    /* renamed from: v, reason: collision with root package name */
    public C4585b f24371v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView.ScaleType f24372w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24373x;

    /* renamed from: y, reason: collision with root package name */
    public j f24374y;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o getMediaContent() {
        return this.f24369n;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f24373x = true;
        this.f24372w = scaleType;
        j jVar = this.f24374y;
        if (jVar != null) {
            jVar.v(scaleType);
        }
    }

    public void setMediaContent(o oVar) {
        this.f24370u = true;
        this.f24369n = oVar;
        C4585b c4585b = this.f24371v;
        if (c4585b != null) {
            c4585b.u(oVar);
        }
    }
}
