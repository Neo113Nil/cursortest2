package com.google.android.gms.internal.mlkit_vision_barcode;

import app.cash.local.viewmodels.internal.MiniCardModel;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton$Action$ClientRoute;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton$Action$Finish;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton$Action$PaginatedSheet;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton$Action$Shortlink;
import com.squareup.protos.cash.local.client.v1.EducationalSheetContent;
import com.squareup.protos.cash.local.client.v1.EducationalSheetContent$Content$Image;
import com.squareup.protos.cash.local.client.v1.EducationalSheetContent$Content$List;
import com.squareup.protos.cash.local.client.v1.EducationalSheetContent$Content$Text;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage$Image$FullBleedHeroImage;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage$Image$HeroImage;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage$Image$MiniCard;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage$Image$TiledHeroImage;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.local.client.v1.TiledHeroImage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public abstract class zztj {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerInvestingProfileForCashtag.deepLinkSpecs;
    }

    public static final EducationalButtonAction toButtonAction(EducationalSheetButton educationalSheetButton) {
        com.google.android.gms.internal.mlkit_vision_common.zzhs zzhsVar = educationalSheetButton.action;
        if (zzhsVar instanceof EducationalSheetButton$Action$Finish) {
            if (((EducationalSheetButton$Action$Finish) zzhsVar).value) {
                return EducationalButtonAction.Dismiss.INSTANCE;
            }
            Path$$ExternalSyntheticBUOutline0.m$1(educationalSheetButton, "Expected true finish action for ");
            return null;
        }
        if (zzhsVar instanceof EducationalSheetButton$Action$ClientRoute) {
            return new EducationalButtonAction.ClientRoute(((EducationalSheetButton$Action$ClientRoute) zzhsVar).value);
        }
        if (zzhsVar instanceof EducationalSheetButton$Action$PaginatedSheet) {
            return EducationalButtonAction.Paginate.INSTANCE;
        }
        if (zzhsVar instanceof EducationalSheetButton$Action$Shortlink) {
            ShortlinkAction shortlinkAction = ((EducationalSheetButton$Action$Shortlink) zzhsVar).value;
            String str = shortlinkAction.shortlink_key;
            str.getClass();
            return new EducationalButtonAction.Shortlink(str, shortlinkAction.next_shortlink_flow_state);
        }
        if (zzhsVar == null) {
            Path$$ExternalSyntheticBUOutline0.m$1(educationalSheetButton, "Expected an action for ");
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final EducationalSheetModel.Content toModel(EducationalSheetContent educationalSheetContent) {
        EducationalSheetModel.Text.Style style;
        NdkCrashLog.Companion companion = educationalSheetContent.content;
        String str = educationalSheetContent.analytics_id;
        if (companion instanceof EducationalSheetContent$Content$Image) {
            EducationalSheetImage educationalSheetImage = ((EducationalSheetContent$Content$Image) companion).value;
            com.google.android.gms.internal.mlkit_vision_common.zzhu zzhuVar = educationalSheetImage.image;
            if (zzhuVar instanceof EducationalSheetImage$Image$TiledHeroImage) {
                TiledHeroImage tiledHeroImage = ((EducationalSheetImage$Image$TiledHeroImage) zzhuVar).value;
                LocalImage localImage = tiledHeroImage.hero_image;
                localImage.getClass();
                LocalMiniCard localMiniCard = tiledHeroImage.mini_card;
                localMiniCard.getClass();
                LocalImage localImage2 = localMiniCard.icon;
                localImage2.getClass();
                LocalImage copy$default = LocalImage.copy$default(localImage2, localMiniCard.background_color, null, 47);
                String str2 = tiledHeroImage.caption;
                str2.getClass();
                return new EducationalSheetModel.Image.TiledHeroImage(localImage, copy$default, str2, str);
            }
            if (zzhuVar instanceof EducationalSheetImage$Image$MiniCard) {
                LocalMiniCard localMiniCard2 = ((EducationalSheetImage$Image$MiniCard) zzhuVar).value;
                return new EducationalSheetModel.Image.MiniCard(new MiniCardModel(localMiniCard2.background_color, localMiniCard2.icon), str);
            }
            if (zzhuVar instanceof EducationalSheetImage$Image$HeroImage) {
                return new EducationalSheetModel.Image.HeroImage(((EducationalSheetImage$Image$HeroImage) zzhuVar).value, false, str);
            }
            if (zzhuVar instanceof EducationalSheetImage$Image$FullBleedHeroImage) {
                return new EducationalSheetModel.Image.HeroImage(((EducationalSheetImage$Image$FullBleedHeroImage) zzhuVar).value, true, str);
            }
            if (zzhuVar == null) {
                Path$$ExternalSyntheticBUOutline0.m$1(educationalSheetImage, "Expected an image to be set for ");
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (!(companion instanceof EducationalSheetContent$Content$Text)) {
            if (companion instanceof EducationalSheetContent$Content$List) {
                return new EducationalSheetModel.NumberedList(((EducationalSheetContent$Content$List) companion).value.items, str);
            }
            if (companion == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Expected a content to be set for ", educationalSheetContent, ".");
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str3 = ((EducationalSheetContent$Content$Text) companion).value.value;
        switch (r6.style) {
            case STYLE_UNSPECIFIED:
            case STYLE_BODY:
                style = EducationalSheetModel.Text.Style.BODY;
                break;
            case STYLE_HERO:
                style = EducationalSheetModel.Text.Style.HERO;
                break;
            case STYLE_HEADING_MEDIUM:
                style = EducationalSheetModel.Text.Style.HEADING;
                break;
            case STYLE_HERO_SUBTITLE:
                style = EducationalSheetModel.Text.Style.HERO_SUBTITLE;
                break;
            case STYLE_BODY_LEGAL:
                style = EducationalSheetModel.Text.Style.BODY_LEGAL;
                break;
            case STYLE_BRANDED_FOOTNOTE:
                style = EducationalSheetModel.Text.Style.BRANDED_FOOTNOTE;
                break;
            case STYLE_HEADING_REGULAR:
                style = EducationalSheetModel.Text.Style.HEADING;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        return new EducationalSheetModel.Text(str3, style, str);
    }
}
