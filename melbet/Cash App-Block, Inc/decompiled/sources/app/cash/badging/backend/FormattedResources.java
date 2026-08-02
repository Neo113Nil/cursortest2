package app.cash.badging.backend;

import androidx.collection.ArrayMap;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.data.TagFormFactorKt$WhenMappings;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class FormattedResources {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowBenefitsLeaflet.deepLinkSpecs;
    }

    public static FormattedResource notifications_available(Long l) {
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put("count", l);
        return new FormattedResource(R.string.notifications_available, arrayMap);
    }

    public static final TagFormFactor toAppTagFormFactor(TagThemeDefinition.TagFormFactor tagFormFactor) {
        switch (tagFormFactor == null ? -1 : TagFormFactorKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
            case -1:
            case 7:
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                return TagFormFactor.WAND;
            case 2:
                return TagFormFactor.HEART;
            case 3:
                return TagFormFactor.MINI_CARD;
            case 4:
                return TagFormFactor.WAND_FIRST_EDITION;
            case 5:
                return TagFormFactor.HEART_FIRST_EDITION;
            case 6:
                return TagFormFactor.MINI_CARD_FIRST_EDITION;
        }
    }
}
