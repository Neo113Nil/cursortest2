package app.cash.broadway.ui;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzr;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.franklin.cards.CardTheme;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public abstract class LifecyclesKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowCreditLimit.deepLinkSpecs;
    }

    public static final zzr getUiLifecycle(Context context) {
        context.getClass();
        while (!(context instanceof ScreenLifecycleOwnerContextWrapper)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            if (context == null) {
                a$$ExternalSyntheticBUOutline0.m$1("no screenLifecycleOwner on this context");
                return null;
            }
        }
        return ((ScreenLifecycleOwnerContextWrapper) context).uiLifecycle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0113, code lost:
    
        if (r4 == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CardSchemeViewModel.Module.HeroCardDetails toCardDetails$default(IssuedCardFactory.IssuedCard issuedCard, CardTheme cardTheme, byte[] bArr, String str, boolean z, boolean z2, boolean z3, CardSchemeViewModel.Module.CardAnimation cardAnimation, CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1, int i) {
        Pair pair;
        int intValue;
        Integer intOrNull;
        String str2 = null;
        String str3 = (i & 4) != 0 ? null : str;
        boolean z4 = (i & 32) != 0 ? false : z3;
        CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12 = (i & 128) != 0 ? null : cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
        issuedCard.getClass();
        cardTheme.getClass();
        CardSchemeViewModel.Module.CustomizationImage customizationImage = bArr != null ? new CardSchemeViewModel.Module.CustomizationImage(bArr) : null;
        String str4 = issuedCard.cardholderName;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        String pan = issuedCard.getPan();
        if (z2) {
            pan = null;
        }
        if (pan == null) {
            pan = Recorder$$ExternalSyntheticOutline2.m("•••• •••• •••• ", issuedCard.lastFour);
        }
        String str6 = pan;
        IssuedCardFactory.SensitiveCardData sensitiveCardData = issuedCard.this$0.sensitiveData;
        String str7 = sensitiveCardData != null ? sensitiveCardData.securityCode.value : null;
        if (z2) {
            str7 = null;
        }
        if (str7 == null) {
            str7 = "•••";
        }
        String str8 = str7;
        String expiration = issuedCard.getExpiration();
        if (z2) {
            expiration = null;
        }
        if (expiration != null) {
            StringBuilder sb = new StringBuilder();
            int length = expiration.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = expiration.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            int length2 = sb2.length();
            if (3 <= length2 && length2 < 7) {
                int length3 = sb2.length();
                if (length3 == 3) {
                    pair = new Pair(sb2.substring(0, 2), sb2.substring(2, 3));
                } else if (length3 == 4) {
                    pair = new Pair(sb2.substring(0, 2), sb2.substring(2, 4));
                } else if (length3 == 5) {
                    pair = new Pair(StringsKt___StringsKt.takeLast(2, sb2.substring(0, 4)), sb2.substring(4, 5));
                } else if (length3 == 6) {
                    pair = new Pair(StringsKt___StringsKt.takeLast(2, sb2.substring(0, 4)), sb2.substring(4, 6));
                }
                String str9 = (String) pair.first;
                Integer intOrNull2 = StringsKt.toIntOrNull((String) pair.second);
                if (intOrNull2 != null && 1 <= (intValue = intOrNull2.intValue()) && intValue < 13 && (intOrNull = StringsKt.toIntOrNull(str9)) != null) {
                    str2 = String.format("%02d/%02d", Arrays.copyOf(new Object[]{intOrNull2, intOrNull}, 2));
                }
            }
        }
        str2 = "••/••";
        return new CardSchemeViewModel.Module.HeroCardDetails(cardTheme, customizationImage, str3, str5, str6, str8, str2, z, z2, z4, cardAnimation, cardSchemePresenter$toHeroModule$cardDetails$2$1$1$12);
    }

    public static final CardSchemeViewModel.Module.HeroCardDetails toDefaultCardDetails(CardTheme cardTheme) {
        cardTheme.getClass();
        return new CardSchemeViewModel.Module.HeroCardDetails(cardTheme, null, "Reese Hills", "4000 1234 5678 9010", "11/27", new CardSchemeViewModel.Module.CardAnimation.None(true, true), 2562);
    }
}
