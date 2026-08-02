package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class b implements AdComponentViewParentApi {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdNativeComponentView f24288n;

    public b(AdNativeComponentView adNativeComponentView) {
        this.f24288n = adNativeComponentView;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        super/*android.view.ViewGroup*/.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i, int i4) {
        super/*android.widget.RelativeLayout*/.onMeasure(i, i4);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z6) {
        super/*android.view.View*/.onWindowFocusChanged(z6);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.view.View*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i, int i4) {
        super/*android.view.View*/.setMeasuredDimension(i, i4);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view) {
        super/*android.view.ViewGroup*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i) {
        super/*android.view.ViewGroup*/.addView(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(View view, int i, int i4) {
        super/*android.view.ViewGroup*/.addView(view, i, i4);
    }
}
