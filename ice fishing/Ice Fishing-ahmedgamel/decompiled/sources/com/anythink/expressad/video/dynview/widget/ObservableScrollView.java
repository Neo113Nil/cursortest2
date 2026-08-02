package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes.dex */
public class ObservableScrollView extends HorizontalScrollView {

    /* renamed from: a, reason: collision with root package name */
    private a f22224a;

    public ObservableScrollView(Context context) {
        super(context);
        this.f22224a = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        super.fling(i / 4);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i4, int i6, int i9) {
        super.onScrollChanged(i, i4, i6, i9);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22224a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22224a = null;
    }
}
