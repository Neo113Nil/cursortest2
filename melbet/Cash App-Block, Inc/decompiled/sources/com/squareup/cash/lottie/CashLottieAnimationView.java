package com.squareup.cash.lottie;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.TextDelegate;

/* loaded from: classes.dex */
public class CashLottieAnimationView extends LottieAnimationView {
    public TextDelegate textDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLottieAnimationView(Context context) {
        super(context);
        context.getClass();
        this.textDelegate = new TextDelegate(this);
        setFontAssetDelegate(new CashSansFontDelegate());
        setTextDelegate(this.textDelegate);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        super.setFontAssetDelegate(fontAssetDelegate);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void setTextDelegate(TextDelegate textDelegate) {
        textDelegate.getClass();
        super.setTextDelegate(textDelegate);
        this.textDelegate = textDelegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.textDelegate = new TextDelegate(this);
        setFontAssetDelegate(new CashSansFontDelegate());
        setTextDelegate(this.textDelegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.textDelegate = new TextDelegate(this);
        setFontAssetDelegate(new CashSansFontDelegate());
        setTextDelegate(this.textDelegate);
    }
}
