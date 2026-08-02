package com.anythink.basead.mixad.shake;

import android.content.Context;
import android.widget.FrameLayout;
import com.anythink.basead.ui.ShakeThumbView;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public class MixNativeAdShakeView extends FrameLayout implements com.anythink.core.common.l.a {

    /* renamed from: a, reason: collision with root package name */
    private y f10368a;

    /* renamed from: b, reason: collision with root package name */
    private int f10369b;

    /* renamed from: c, reason: collision with root package name */
    private ATShakeViewListener f10370c;

    public MixNativeAdShakeView(Context context) {
        super(context);
    }

    public void initView(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        this.f10370c = aTShakeViewListener;
        ShakeThumbView shakeThumbView = new ShakeThumbView(getContext());
        if (i <= 0) {
            i = -2;
        }
        if (i4 <= 0) {
            i4 = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i4);
        layoutParams.gravity = 17;
        shakeThumbView.setLayoutParams(layoutParams);
        addView(shakeThumbView);
        shakeThumbView.setShakeSetting(this.f10368a, this.f10369b != 1 ? 3 : 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ATShakeViewListener aTShakeViewListener = this.f10370c;
        if (aTShakeViewListener != null) {
            aTShakeViewListener.onDismiss();
        }
    }

    public MixNativeAdShakeView(Context context, y yVar, int i) {
        super(context);
        this.f10368a = yVar;
        this.f10369b = i;
    }
}
