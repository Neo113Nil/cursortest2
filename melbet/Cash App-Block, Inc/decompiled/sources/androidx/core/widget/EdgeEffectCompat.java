package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.scrubbing.CurrencyConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public abstract class EdgeEffectCompat {

    public abstract class Api31Impl {
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return RecyclerView.DECELERATION_RATE;
            }
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return RecyclerView.DECELERATION_RATE;
            }
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.InitiateBitcoinPartnerAction.deepLinkSpecs;
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.getDistance(edgeEffect) : RecyclerView.DECELERATION_RATE;
    }

    public static final String moneyFormatMask(CurrencyConfig currencyConfig, String str) {
        StringBuilder sb;
        currencyConfig.getClass();
        str.getClass();
        char c = currencyConfig.decimalSeparator;
        if (StringsKt.contains((CharSequence) str, c, false)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringsKt__StringsJVMKt.repeat(currencyConfig.maxFractionDigits, "0"));
            sb = sb2;
        } else {
            sb = null;
        }
        if (sb != null) {
            String substringAfter = StringsKt.substringAfter(c, str, str);
            if (substringAfter.length() > sb.length()) {
                a$$ExternalSyntheticBUOutline0.m$3("Fractional portion is longer than maxFractionDigitCount. The scrubber should have prevented this.");
                return null;
            }
            int i = 0;
            int i2 = 0;
            while (i < substringAfter.length()) {
                int i3 = i2 + 1;
                if (substringAfter.charAt(i) != sb.charAt(i2)) {
                    sb.setCharAt(i2, 'X');
                }
                i++;
                i2 = i3;
            }
            sb.insert(0, c);
        }
        String fastJoinToString$default = ListUtilsKt.fastJoinToString$default(62, String.valueOf(currencyConfig.groupingSeparator), CollectionsKt.reversed(StringsKt___StringsKt.chunked(3, StringsKt__StringsJVMKt.repeat(StringsKt.substringBefore$default(str, c).length(), "X"))), null);
        CharSequence charSequence = sb;
        if (sb == null) {
            charSequence = "";
        }
        return fastJoinToString$default + ((Object) charSequence);
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.onPullDistance(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
