package com.squareup.cash.payments.backend.real;

import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfig;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.payments.backend.api.BackgroundMetadata;
import com.squareup.protos.cash.ui.Color;
import java.util.List;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes6.dex */
public abstract class RealPersonalizationRepositoryKt {
    public static final BackgroundMetadata toBackgroundMetadata(ExpressivePaymentsBackgroundConfig expressivePaymentsBackgroundConfig) {
        expressivePaymentsBackgroundConfig.getClass();
        String str = expressivePaymentsBackgroundConfig.name;
        if (str == null) {
            str = "";
        }
        String str2 = expressivePaymentsBackgroundConfig.main_url;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = expressivePaymentsBackgroundConfig.preview_url;
        String str4 = str3 != null ? str3 : "";
        boolean z = expressivePaymentsBackgroundConfig.release_state == ReleaseState.RELEASE_STATE_ACTIVE;
        Color color = expressivePaymentsBackgroundConfig.background_color;
        if (color == null) {
            color = new Color(new Color.ModeVariant("#000000", null, null, null, null, 30, null), new Color.ModeVariant("#000000", null, null, null, null, 30, null), 4);
        }
        boolean z2 = expressivePaymentsBackgroundConfig.is_default;
        TextFormat textFormat = expressivePaymentsBackgroundConfig.default_text_format;
        if (textFormat == null) {
            textFormat = new TextFormat(null, new Color(new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), new Color.ModeVariant("#000000", null, null, null, null, 30, null), 4), new Color(new Color.ModeVariant("#000000", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), ByteString.EMPTY);
        }
        TextFormat textFormat2 = textFormat;
        List list = expressivePaymentsBackgroundConfig.effects;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        return new BackgroundMetadata(str, str2, str4, z, color, z2, textFormat2, list, expressivePaymentsBackgroundConfig.accessibility_description);
    }
}
