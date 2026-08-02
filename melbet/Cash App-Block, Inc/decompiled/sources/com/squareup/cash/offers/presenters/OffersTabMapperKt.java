package com.squareup.cash.offers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.draw.ShadowKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.offers.backend.api.BusinessToken;
import com.squareup.cash.offers.backend.api.CategoryToken;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHeaderViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSaleChipViewModel;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$CategoryToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import com.squareup.protos.cash.shop.rendering.api.OfferBadge;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.GrpcStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public abstract class OffersTabMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OffersItemToken getOffersItemToken(String str, EngagedItemToken engagedItemToken) {
        String str2;
        String str3;
        ErrorEvent.Meta.Companion companion;
        ErrorEvent.Meta.Companion companion2;
        String str4 = null;
        if (engagedItemToken != null && (companion2 = engagedItemToken.token) != null) {
            EngagedItemToken$Token$MerchantToken engagedItemToken$Token$MerchantToken = companion2 instanceof EngagedItemToken$Token$MerchantToken ? (EngagedItemToken$Token$MerchantToken) companion2 : null;
            if (engagedItemToken$Token$MerchantToken != null) {
                str2 = engagedItemToken$Token$MerchantToken.value;
                if (str2 == null) {
                    ErrorEvent.Meta.Companion companion3 = engagedItemToken.token;
                    if (companion3 != null) {
                        EngagedItemToken$Token$MerchantToken engagedItemToken$Token$MerchantToken2 = companion3 instanceof EngagedItemToken$Token$MerchantToken ? (EngagedItemToken$Token$MerchantToken) companion3 : null;
                        if (engagedItemToken$Token$MerchantToken2 != null) {
                            str4 = engagedItemToken$Token$MerchantToken2.value;
                        }
                    }
                    str4.getClass();
                    return new BusinessToken(str4);
                }
                if (engagedItemToken != null && (companion = engagedItemToken.token) != null) {
                    EngagedItemToken$Token$CategoryToken engagedItemToken$Token$CategoryToken = companion instanceof EngagedItemToken$Token$CategoryToken ? (EngagedItemToken$Token$CategoryToken) companion : null;
                    if (engagedItemToken$Token$CategoryToken != null) {
                        str3 = engagedItemToken$Token$CategoryToken.value;
                        if (str3 != null) {
                            if (str != null) {
                                return new BusinessToken(str);
                            }
                            return null;
                        }
                        ErrorEvent.Meta.Companion companion4 = engagedItemToken.token;
                        if (companion4 != null) {
                            EngagedItemToken$Token$CategoryToken engagedItemToken$Token$CategoryToken2 = companion4 instanceof EngagedItemToken$Token$CategoryToken ? (EngagedItemToken$Token$CategoryToken) companion4 : null;
                            if (engagedItemToken$Token$CategoryToken2 != null) {
                                str4 = engagedItemToken$Token$CategoryToken2.value;
                            }
                        }
                        str4.getClass();
                        return new CategoryToken(str4);
                    }
                }
                str3 = null;
                if (str3 != null) {
                }
            }
        }
        str2 = null;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r7 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OffersHeaderViewModel toHeaderViewModel(SectionHeader sectionHeader, String str) {
        AbstractPersistentList abstractPersistentList;
        List list;
        zzle zzleVar;
        sectionHeader.getClass();
        str.getClass();
        StyledText styledText = sectionHeader.title;
        String str2 = null;
        if (styledText == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: header title == null");
            return null;
        }
        String m = Recorder$$ExternalSyntheticOutline2.m(str, "|header|", styledText.text);
        TapAction tapAction = sectionHeader.tap_action;
        if (tapAction != null && (zzleVar = tapAction.action) != null) {
            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
            UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
            if (urlTapAction != null) {
                str2 = urlTapAction.action_url;
            }
        }
        String str3 = str2;
        if (tapAction != null && (list = tapAction.analytics_tap_events) != null) {
            PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it.next()));
            }
            abstractPersistentList = builder.build();
        }
        abstractPersistentList = SmallPersistentVector.EMPTY;
        return new OffersHeaderViewModel(m, styledText, str3, abstractPersistentList, sectionHeader.cta_button);
    }

    public static LegacyOffersAvatarViewModel toLegacyOffersAvatarViewModel$default(Avatar avatar) {
        Color color;
        avatar.getClass();
        if (avatar.accent_color != null) {
            Color.ModeVariant modeVariant = new Color.ModeVariant(avatar.accent_color, null, null, null, null, 30, null);
            String str = avatar.dark_theme_accent_color;
            if (str == null) {
                str = avatar.accent_color;
            }
            color = new Color(modeVariant, new Color.ModeVariant(str, null, null, null, null, 30, null), 4);
        } else {
            color = null;
        }
        String str2 = avatar.image_url;
        String str3 = avatar.dark_theme_image_url;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = avatar.image_url;
        }
        String str4 = str3;
        String str5 = avatar.initial;
        Character monogram = GrpcStatus.Companion.monogram(str5 != null ? str5 : null);
        boolean areEqual = Intrinsics.areEqual(avatar.colorize_image, Boolean.TRUE);
        Avatar.Shape shape = avatar.shape;
        if (shape == null) {
            shape = Avatar.Shape.CIRCLE;
        }
        return new LegacyOffersAvatarViewModel(str2, str4, monogram, color, areEqual, shape);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OffersCommonOfferRowViewModel toOfferRowViewModel(RowSection.OfferRow offerRow, String str, boolean z, OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
        String str2;
        OffersSaleChipViewModel offersSaleChipViewModel;
        Button button;
        zzle zzleVar;
        str.getClass();
        String str3 = offerRow.offer_token;
        Button button2 = offerRow.button;
        TapAction tapAction = offerRow.tap_action;
        if (str3 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer row offer_token == null");
            return null;
        }
        AnalyticsEvent analyticsEvent = offerRow.analytics_view_event;
        OffersAnalyticsEventSpec offersAnalyticsEventSpec2 = analyticsEvent != null ? ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent) : null;
        String m = Recorder$$ExternalSyntheticOutline2.m(str, "|offer_row|", str3);
        ImmutableList immutableList = Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new OffersAnalyticsEventSpec[]{offersAnalyticsEventSpec2, offersAnalyticsEventSpec}));
        OffersItemToken offersItemToken = getOffersItemToken(offerRow.business_token, offerRow.engaged_token);
        String str4 = offerRow.boost_token;
        if (tapAction != null && (zzleVar = tapAction.action) != null) {
            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
            UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
            if (urlTapAction != null) {
                str2 = urlTapAction.action_url;
                if (str2 != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer row tap action url == null");
                    return null;
                }
                Avatar avatar = offerRow.avatar;
                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel$default = avatar != null ? toLegacyOffersAvatarViewModel$default(avatar) : null;
                if (legacyOffersAvatarViewModel$default == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer row avatar == null");
                    return null;
                }
                StyledText styledText = offerRow.title;
                if (styledText == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer row title == null");
                    return null;
                }
                StyledText styledText2 = offerRow.subtitle;
                OfferBadge offerBadge = offerRow.merchant_sale_badge;
                if (offerBadge != null) {
                    StyledText styledText3 = offerBadge.title;
                    if (styledText3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: sale chip title must not be null");
                        return null;
                    }
                    offersSaleChipViewModel = new OffersSaleChipViewModel(styledText3, offerBadge.background_color);
                } else {
                    offersSaleChipViewModel = null;
                }
                Button button3 = (!z || (button = offerRow.selected_button) == null) ? button2 : button;
                boolean z2 = button2 != null && z;
                if (tapAction == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: offer row tap action == null");
                    return null;
                }
                List list = tapAction.analytics_tap_events;
                PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    builder.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it.next()));
                }
                return new OffersCommonOfferRowViewModel(m, immutableList, str3, offersItemToken, str4, new OffersRowViewModel(legacyOffersAvatarViewModel$default, styledText, styledText2, builder.build(), button3, z2, z, offersSaleChipViewModel), str2);
            }
        }
        str2 = null;
        if (str2 != null) {
        }
    }
}
