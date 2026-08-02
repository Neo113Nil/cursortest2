package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.core.view.DisplayCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.presenters.OffersTabMapperKt;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.cash.offers.viewmodels.ShoppingIconId;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.CountdownCaption;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.IconId;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import okhttp3.internal.Tags;

/* loaded from: classes3.dex */
public abstract class AndroidTileMode_androidKt {
    public static final HeroSection.HeroTile currentEffectiveHeroTile(HeroSection heroSection, long j) {
        Object obj;
        Long l;
        List list = heroSection.hero_tiles;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            HeroSection.HeroTile heroTile = (HeroSection.HeroTile) obj2;
            Long l2 = heroTile.effective_at_ms;
            boolean z = true;
            boolean z2 = l2 != null && l2.longValue() <= j;
            CountdownCaption countdownCaption = heroTile.countdown_caption;
            if (countdownCaption != null && (l = countdownCaption.countdown_to_ms) != null) {
                z = l.longValue() > j;
            }
            if (z2 && z) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Long l3 = ((HeroSection.HeroTile) next).effective_at_ms;
                l3.getClass();
                long longValue = l3.longValue();
                do {
                    Object next2 = it.next();
                    Long l4 = ((HeroSection.HeroTile) next2).effective_at_ms;
                    l4.getClass();
                    long longValue2 = l4.longValue();
                    if (longValue < longValue2) {
                        next = next2;
                        longValue = longValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (HeroSection.HeroTile) obj;
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m668toAndroidTileMode0vamqd0(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3 && Build.VERSION.SDK_INT >= 31) {
            return DisplayCompat.getFrameworkTileModeDecal();
        }
        return Shader.TileMode.CLAMP;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc A[LOOP:0: B:45:0x00f6->B:47:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile toHeroTileListItemViewModel(HeroSection.HeroTile heroTile, String str, OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
        OfferCountdownTemplateViewModel offerCountdownTemplateViewModel;
        HeroSection.HeroTile.DisplayStyle displayStyle;
        zzle zzleVar;
        UrlTapAction urlTapAction;
        Iterator it;
        ShoppingIconId shoppingIconId;
        ShoppingIconId shoppingIconId2;
        offersAnalyticsEventSpec.getClass();
        boolean z = str != null && str.equals(heroTile.boost_token);
        AnalyticsEvent analyticsEvent = heroTile.analytics_view_event;
        TapAction tapAction = heroTile.tap_action;
        FormattedDetail formattedDetail = heroTile.formatted_footer;
        if (analyticsEvent == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: hero_tile analytics_view_event is null");
            return null;
        }
        OffersAnalyticsEventSpec offersAnalyticsEventSpec2 = androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent);
        if (formattedDetail != null) {
            StyledText styledText = formattedDetail.styled_text;
            FormattedDetail.CountdownInfoCheck countdownInfoCheck = formattedDetail.countdown_check;
            if (countdownInfoCheck != null) {
                String str2 = countdownInfoCheck.string_to_replace;
                if (str2 == null) {
                    str2 = "{countDownTimer}";
                }
                String str3 = str2;
                String str4 = styledText != null ? styledText.text : null;
                IconId iconId = formattedDetail.icon;
                if (iconId != null) {
                    switch (iconId.ordinal()) {
                        case 0:
                            shoppingIconId2 = ShoppingIconId.CARD_SIMPLE;
                            break;
                        case 1:
                            shoppingIconId2 = ShoppingIconId.STOPWATCH;
                            break;
                        case 2:
                            shoppingIconId2 = ShoppingIconId.HOURGLASS;
                            break;
                        case 3:
                            shoppingIconId2 = ShoppingIconId.LIMIT_FILL;
                            break;
                        case 4:
                            shoppingIconId2 = ShoppingIconId.DISCOUNT_MIN;
                            break;
                        case 5:
                            shoppingIconId2 = ShoppingIconId.CASH_APP_PAY;
                            break;
                        case 6:
                            shoppingIconId2 = ShoppingIconId.TIME;
                            break;
                        case 7:
                            shoppingIconId2 = ShoppingIconId.CASH_APP_CUSTOMER;
                            break;
                        case 8:
                            shoppingIconId2 = ShoppingIconId.CARD_NEW;
                            break;
                        default:
                            shoppingIconId2 = ShoppingIconId.CARD_SIMPLE;
                            break;
                    }
                    shoppingIconId = shoppingIconId2;
                } else {
                    shoppingIconId = null;
                }
                offerCountdownTemplateViewModel = new OfferCountdownTemplateViewModel(OfferCountdownTemplateViewModel.CountdownFormatStyle.DETAILED, shoppingIconId, str4, styledText != null ? styledText.text_color : null, countdownInfoCheck.countdown_to_ms, str3);
                ImmutableList immutableList = Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new OffersAnalyticsEventSpec[]{offersAnalyticsEventSpec, offersAnalyticsEventSpec2}));
                OffersItemToken offersItemToken = OffersTabMapperKt.getOffersItemToken(heroTile.business_token, heroTile.engaged_token);
                String str5 = heroTile.offer_token;
                str5.getClass();
                String str6 = heroTile.boost_token;
                Image image = heroTile.picture;
                image.getClass();
                displayStyle = heroTile.display_style;
                if (displayStyle == null) {
                    displayStyle = HeroSection.HeroTile.DisplayStyle.TALL;
                }
                Avatar avatar = heroTile.avatar;
                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel$default = avatar == null ? OffersTabMapperKt.toLegacyOffersAvatarViewModel$default(avatar) : null;
                StyledText styledText2 = heroTile.title;
                HeroSection.HeroTile.DisplayStyle displayStyle2 = displayStyle;
                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = legacyOffersAvatarViewModel$default;
                StyledText styledText3 = heroTile.subtitle;
                Boolean bool = heroTile.dimmer_enabled;
                boolean booleanValue = bool == null ? bool.booleanValue() : false;
                tapAction.getClass();
                zzleVar = tapAction.action;
                if (zzleVar != null) {
                    TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                    if (tapAction$Action$UrlAction != null) {
                        urlTapAction = tapAction$Action$UrlAction.value;
                        urlTapAction.getClass();
                        String str7 = urlTapAction.action_url;
                        str7.getClass();
                        List list = tapAction.analytics_tap_events;
                        PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                        it = list.iterator();
                        while (it.hasNext()) {
                            builder.add(androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it.next()));
                            immutableList = immutableList;
                        }
                        return new OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile(immutableList, str5, offersItemToken, str6, image, displayStyle2, legacyOffersAvatarViewModel, z, styledText2, styledText3, offerCountdownTemplateViewModel, heroTile.background_color, booleanValue, str7, builder.build(), formattedDetail != null ? formattedDetail.arcade_icon : null);
                    }
                }
                urlTapAction = null;
                urlTapAction.getClass();
                String str72 = urlTapAction.action_url;
                str72.getClass();
                List list2 = tapAction.analytics_tap_events;
                PersistentVectorBuilder builder2 = SmallPersistentVector.EMPTY.builder();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                return new OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile(immutableList, str5, offersItemToken, str6, image, displayStyle2, legacyOffersAvatarViewModel, z, styledText2, styledText3, offerCountdownTemplateViewModel, heroTile.background_color, booleanValue, str72, builder2.build(), formattedDetail != null ? formattedDetail.arcade_icon : null);
            }
        }
        offerCountdownTemplateViewModel = null;
        ImmutableList immutableList2 = Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new OffersAnalyticsEventSpec[]{offersAnalyticsEventSpec, offersAnalyticsEventSpec2}));
        OffersItemToken offersItemToken2 = OffersTabMapperKt.getOffersItemToken(heroTile.business_token, heroTile.engaged_token);
        String str52 = heroTile.offer_token;
        str52.getClass();
        String str62 = heroTile.boost_token;
        Image image2 = heroTile.picture;
        image2.getClass();
        displayStyle = heroTile.display_style;
        if (displayStyle == null) {
        }
        Avatar avatar2 = heroTile.avatar;
        if (avatar2 == null) {
        }
        StyledText styledText22 = heroTile.title;
        HeroSection.HeroTile.DisplayStyle displayStyle22 = displayStyle;
        LegacyOffersAvatarViewModel legacyOffersAvatarViewModel2 = legacyOffersAvatarViewModel$default;
        StyledText styledText32 = heroTile.subtitle;
        Boolean bool2 = heroTile.dimmer_enabled;
        if (bool2 == null) {
        }
        tapAction.getClass();
        zzleVar = tapAction.action;
        if (zzleVar != null) {
        }
        urlTapAction = null;
        urlTapAction.getClass();
        String str722 = urlTapAction.action_url;
        str722.getClass();
        List list22 = tapAction.analytics_tap_events;
        PersistentVectorBuilder builder22 = SmallPersistentVector.EMPTY.builder();
        it = list22.iterator();
        while (it.hasNext()) {
        }
        return new OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile(immutableList2, str52, offersItemToken2, str62, image2, displayStyle22, legacyOffersAvatarViewModel2, z, styledText22, styledText32, offerCountdownTemplateViewModel, heroTile.background_color, booleanValue, str722, builder22.build(), formattedDetail != null ? formattedDetail.arcade_icon : null);
    }

    public abstract String getMessage();
}
