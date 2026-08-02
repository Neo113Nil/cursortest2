package com.squareup.cash.marketing.components;

import com.google.mlkit.vision.text.zza;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.protos.cash.ui.Illustration;

/* loaded from: classes5.dex */
public abstract class IllustrationsKt {
    public static final CardUpsellIllustration toCardUpsellIllustration(Illustration illustration) {
        CardUpsellIllustration cardUpsellIllustration;
        illustration.getClass();
        zza zzaVar = Illustrations.Companion;
        String str = illustration.arcade_id;
        str.getClass();
        zzaVar.getClass();
        Illustrations illustrations = (Illustrations) Illustrations.illustrationMap.get(str);
        if (illustrations != null && (cardUpsellIllustration = CardUpsellKt.toCardUpsellIllustration(illustrations)) != null) {
            return cardUpsellIllustration;
        }
        Illustration.FallbackRemoteIllustration fallbackRemoteIllustration = illustration.fallback_illustration;
        if (fallbackRemoteIllustration == null) {
            return null;
        }
        String str2 = fallbackRemoteIllustration.light_url;
        str2.getClass();
        String str3 = fallbackRemoteIllustration.dark_url;
        if (str3 == null) {
            str3 = fallbackRemoteIllustration.light_url;
            str3.getClass();
        }
        Integer num = fallbackRemoteIllustration.height;
        num.getClass();
        int intValue = num.intValue();
        Integer num2 = fallbackRemoteIllustration.width;
        num2.getClass();
        return new CardUpsellIllustration(str2, intValue, num2.intValue(), str3);
    }
}
