package com.squareup.cash.investing.components.common;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class InvestingImageView extends AppCompatImageView {
    public final Lazy gradientDrawable$delegate;
    public final RealImageLoader imageLoader;
    public final ThemeInfo themeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingImageView(Context context, RealImageLoader realImageLoader) {
        super(context, null);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        this.themeInfo = ThemeHelpersKt.themeInfo(this);
        this.gradientDrawable$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new RealGooglePayer$$ExternalSyntheticLambda0(this, 17));
    }

    public final void render(InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon, Integer num) {
        int i;
        if ((investingCryptoAvatarContentModel$Icon != null ? investingCryptoAvatarContentModel$Icon.image : null) == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int ordinal = investingCryptoAvatarContentModel$Icon.image.ordinal();
        if (ordinal == 0) {
            i = R.drawable.btc_badge;
        } else if (ordinal == 1) {
            i = R.drawable.arrow_up;
        } else if (ordinal == 2) {
            i = R.drawable.arrow_down;
        } else if (ordinal == 3) {
            i = R.drawable.investing_stale_data_caution;
        } else {
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = R.drawable.savings;
        }
        setImageResource(i);
        if (num != null) {
            setColorFilter(num.intValue());
        }
    }
}
