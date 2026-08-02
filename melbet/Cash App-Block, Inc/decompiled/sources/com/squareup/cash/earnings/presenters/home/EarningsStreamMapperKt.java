package com.squareup.cash.earnings.presenters.home;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.earnings.backend.api.EarningsStream;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.GrpcStatus;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes6.dex */
public abstract class EarningsStreamMapperKt {
    public static final StackedAvatarViewModel.Single toStackedAvatarViewModel(EarningsStream.Avatar avatar, String str) {
        String str2;
        String str3;
        Image image;
        Color color;
        Character monogram;
        String str4;
        String str5;
        str.getClass();
        if (avatar == null || (str2 = avatar.lightUrl) == null || StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (avatar == null || (str3 = avatar.darkUrl) == null || StringsKt.isBlank(str3)) {
            str3 = null;
        }
        if (str2 != null) {
            if (str3 == null) {
                str3 = str2;
            }
            image = new Image(str2, str3, 4);
        } else {
            image = null;
        }
        if (avatar == null || (str5 = avatar.accentColor) == null) {
            color = null;
        } else {
            Color.ModeVariant modeVariant = new Color.ModeVariant(str5, null, null, null, null, 30, null);
            String str6 = avatar.darkAccentColor;
            color = new Color(modeVariant, str6 != null ? new Color.ModeVariant(str6, null, null, null, null, 30, null) : null, 4);
        }
        if (avatar == null || (str4 = avatar.initial) == null || (monogram = StringsKt___StringsKt.firstOrNull(str4)) == null) {
            monogram = GrpcStatus.Companion.monogram(str);
        }
        return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(color != null ? new ColorModel.Accented(color) : null, monogram, str, image, null, null, null, null, false, false, null, false, null, null, 131056));
    }
}
