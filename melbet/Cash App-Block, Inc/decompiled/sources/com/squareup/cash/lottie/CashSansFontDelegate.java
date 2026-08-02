package com.squareup.cash.lottie;

import android.graphics.Typeface;
import com.airbnb.lottie.FontAssetDelegate;
import java.util.LinkedHashMap;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashSansFontDelegate extends FontAssetDelegate {
    @Override // com.airbnb.lottie.FontAssetDelegate
    public final Typeface fetchFont(String str) {
        LinkedHashMap linkedHashMap = CashSansFontsKt._CashSansFontMap;
        if (linkedHashMap.size() >= 3) {
            Typeface typeface = (Typeface) linkedHashMap.get(str);
            if (typeface != null) {
                return typeface;
            }
            Object obj = linkedHashMap.get("Cash Sans");
            obj.getClass();
            Typeface typeface2 = (Typeface) obj;
            Timber.Forest.e("Unknown font <%s> from Lottie file; using <Cash Sans> instead", str);
            return typeface2;
        }
        Timber.Forest.w("Cash Sans fonts not loaded yet; falling back to system default", new Object[0]);
        if (str != null && StringsKt.contains((CharSequence) str, (CharSequence) "Bold", false)) {
            Typeface typeface3 = Typeface.DEFAULT_BOLD;
            typeface3.getClass();
            return typeface3;
        }
        if (str == null || !StringsKt.contains((CharSequence) str, (CharSequence) "Medium", false)) {
            Typeface typeface4 = Typeface.DEFAULT;
            typeface4.getClass();
            return typeface4;
        }
        Typeface typeface5 = Typeface.DEFAULT_BOLD;
        typeface5.getClass();
        return typeface5;
    }
}
