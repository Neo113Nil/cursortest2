package com.squareup.cash.scrubbing;

import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cropview.Edge;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class CardNumberKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrandGuesser$Brand.values().length];
            try {
                iArr[CardBrandGuesser$Brand.AMERICAN_EXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.FlowHalfSheet.deepLinkSpecs;
    }

    public static final MaskVisualTransformation rememberCardNumberTransformation(CardBrandGuesser$Brand cardBrandGuesser$Brand, Composer composer) {
        cardBrandGuesser$Brand.getClass();
        boolean changed = ((GapComposer) composer).changed(cardBrandGuesser$Brand.ordinal());
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new MaskVisualTransformation(WhenMappings.$EnumSwitchMapping$0[cardBrandGuesser$Brand.ordinal()] == 1 ? "XXXX XXXXXX XXXXX" : "XXXX XXXX XXXX XXXX", new Edge.Companion(9));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (MaskVisualTransformation) rememberedValue;
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
