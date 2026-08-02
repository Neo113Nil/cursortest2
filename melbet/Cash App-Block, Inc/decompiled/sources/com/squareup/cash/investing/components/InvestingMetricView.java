package com.squareup.cash.investing.components;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.ui.util.BalanceAnimator;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class InvestingMetricView extends AppCompatTextView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ThemeInfo themeInfo;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestingCryptoImage.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza zzaVar = InvestingCryptoImage.Companion;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza zzaVar2 = InvestingCryptoImage.Companion;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza zzaVar3 = InvestingCryptoImage.Companion;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza zzaVar4 = InvestingCryptoImage.Companion;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StockMetric.BackgroundType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                StockMetric.BackgroundType backgroundType = StockMetric.BackgroundType.LIGHT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingMetricView(Context context, BalanceAnimator balanceAnimator) {
        super(context);
        context.getClass();
        this.themeInfo = ThemeHelpersKt.themeInfo(this);
        BundleKt.setTypeface(this, R.font.cashsans_medium);
        setTextSize(24.0f);
        setLineHeight(28);
        setLetterSpacing(RecyclerView.DECELERATION_RATE);
    }
}
