package com.google.android.gms.internal.mlkit_vision_barcode;

import android.media.MediaCodecInfo;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.support.chat.views.input.InputTextFieldKt$InputTextField$1;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public abstract class zzpc {
    public static final void InputTextField(TextFieldState textFieldState, Modifier modifier, Composer composer, int i) {
        int i2;
        textFieldState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1578965022);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(textFieldState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            BasicTextFieldKt.BasicTextField(textFieldState, SpacerKt.m299paddingVpY3zN4(modifier, 4.0f, 6.0f), false, false, null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).input, Strings.getColors(gapComposer).component.input.text.f195default, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), new KeyboardOptions(3, (Boolean) null, 0, 0, (Boolean) null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE), null, null, (MutableInteractionSourceImpl) rememberedValue, new SolidColor(Strings.getColors(gapComposer).component.input.cursor), null, new InputTextFieldKt$InputTextField$1(i3, textFieldState), null, gapComposer, (i2 & 14) | 1572864, 6, 21404);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(textFieldState, modifier, i, 18);
        }
    }

    public static final void PlaceholderText(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1493551756);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_input_hint_new);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.input.text.placeholder, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetPresenter$$ExternalSyntheticLambda0(i, 29);
        }
    }

    public static int evaluateH264RequiredSupport(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            Format.Builder builder = new Format.Builder();
            builder.sampleMimeType = MimeTypes.normalizeMimeType("video/avc");
            Format format2 = new Format(builder);
            String str = format2.sampleMimeType;
            if (str != null) {
                List decoderInfos = MediaCodecUtil.getDecoderInfos(str, z, false);
                String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format2);
                Iterable decoderInfos2 = alternativeCodecMimeType == null ? RegularImmutableList.EMPTY : MediaCodecUtil.getDecoderInfos(alternativeCodecMimeType, z, false);
                ImmutableList.Builder builder2 = ImmutableList.builder();
                builder2.addAll(decoderInfos);
                builder2.addAll(decoderInfos2);
                RegularImmutableList build = builder2.build();
                for (int i = 0; i < build.size; i++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) build.get(i)).capabilities.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (supportedPerformancePoints.get(i2).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil.DecoderQueryException unused) {
        }
        return 0;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAddMoneyBottomSheet.deepLinkSpecs;
    }
}
