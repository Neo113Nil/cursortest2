package app.cash.local.views.internal;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.TextFormatting;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public abstract class LocalViewsKt {
    public static final long CloseToWhiteBackgroundBorderColor = Color.m675copywmQWz5c$default(0.1f, Color.Black, 14);
    public static final float CloseToWhiteBackgroundBorderWidth = 0.5f;

    public static final void LocalImagePlaceholder(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-728150342);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            KeypadKt.MooncakeShimmerBox(null, null, LocalMapKt.f49lambda$215022383, gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkerKt$$ExternalSyntheticLambda10(i, 5);
        }
    }

    /* renamed from: blendColors--OWjLjI, reason: not valid java name */
    public static final long m1324blendColorsOWjLjI(long j, long j2) {
        long Color;
        float m677getAlphaimpl = Color.m677getAlphaimpl(j2);
        float f = 1.0f - m677getAlphaimpl;
        Color = ColorKt.Color((Color.m681getRedimpl(j) * f) + (Color.m681getRedimpl(j2) * m677getAlphaimpl), (Color.m680getGreenimpl(j) * f) + (Color.m680getGreenimpl(j2) * m677getAlphaimpl), (Color.m678getBlueimpl(j) * f) + (Color.m678getBlueimpl(j2) * m677getAlphaimpl), 1.0f, ColorSpaces.Srgb);
        return Color;
    }

    /* renamed from: borderIfWhite-iJQMabo, reason: not valid java name */
    public static final Modifier m1325borderIfWhiteiJQMabo(Modifier modifier, long j, Shape shape, Composer composer) {
        modifier.getClass();
        shape.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (!colors.isLight || Color.m681getRedimpl(j) < 0.95f || Color.m680getGreenimpl(j) < 0.95f || Color.m678getBlueimpl(j) < 0.95f) {
            return modifier;
        }
        return modifier.then(ImageKt.m178borderxT4_qwU(Modifier.Companion.$$INSTANCE, CloseToWhiteBackgroundBorderWidth, CloseToWhiteBackgroundBorderColor, shape));
    }

    public static final void enqueuePreload(RealImageLoader realImageLoader, Context context, String str) {
        realImageLoader.getClass();
        context.getClass();
        str.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = str;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        builder.memoryCachePolicy = cachePolicy;
        builder.diskCachePolicy = cachePolicy;
        realImageLoader.enqueue(builder.build());
    }

    public static final Float getRatio(LocalImage localImage) {
        localImage.getClass();
        Long l = localImage.width;
        if (l == null || localImage.height == null) {
            return null;
        }
        l.getClass();
        double longValue = l.longValue();
        localImage.height.getClass();
        return Float.valueOf((float) (longValue / r4.longValue()));
    }

    public static final String getThemedUrl(LocalImage localImage, Composer composer) {
        String str;
        localImage.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (colors.isLight) {
            str = localImage.light_url;
            str.getClass();
        } else {
            String str2 = localImage.dark_url;
            if (str2 != null) {
                if (StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    str = str2;
                }
            }
            str = localImage.light_url;
            str.getClass();
        }
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }

    public static final boolean isWorkingAsync(Object obj) {
        obj.getClass();
        CanWorkAsync canWorkAsync = obj instanceof CanWorkAsync ? (CanWorkAsync) obj : null;
        if (canWorkAsync != null) {
            return canWorkAsync.isWorkingAsync();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object loadBitmapFromUrl(RealImageLoader realImageLoader, Context context, String str, int i, int i2, ContinuationImpl continuationImpl) {
        LocalViewsKt$loadBitmapFromUrl$1 localViewsKt$loadBitmapFromUrl$1;
        int i3;
        Image image;
        if (continuationImpl instanceof LocalViewsKt$loadBitmapFromUrl$1) {
            localViewsKt$loadBitmapFromUrl$1 = (LocalViewsKt$loadBitmapFromUrl$1) continuationImpl;
            int i4 = localViewsKt$loadBitmapFromUrl$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                localViewsKt$loadBitmapFromUrl$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = localViewsKt$loadBitmapFromUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = localViewsKt$loadBitmapFromUrl$1.label;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ImageRequest.Builder builder = new ImageRequest.Builder(context);
                    builder.data = str;
                    builder.size(i, i2);
                    ImageRequests_androidKt.allowHardware(builder, false);
                    ImageRequest build = builder.build();
                    localViewsKt$loadBitmapFromUrl$1.I$0 = i;
                    localViewsKt$loadBitmapFromUrl$1.I$1 = i2;
                    localViewsKt$loadBitmapFromUrl$1.label = 1;
                    obj = realImageLoader.execute(build, localViewsKt$loadBitmapFromUrl$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = localViewsKt$loadBitmapFromUrl$1.I$1;
                    i = localViewsKt$loadBitmapFromUrl$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                image = ((ImageResult) obj).getImage();
                if (image == null) {
                    return Image_androidKt.toBitmap(image, i, i2);
                }
                return null;
            }
        }
        localViewsKt$loadBitmapFromUrl$1 = new LocalViewsKt$loadBitmapFromUrl$1(continuationImpl);
        Object obj3 = localViewsKt$loadBitmapFromUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = localViewsKt$loadBitmapFromUrl$1.label;
        if (i3 != 0) {
        }
        image = ((ImageResult) obj3).getImage();
        if (image == null) {
        }
    }

    public static final void preload(LocalImage localImage, Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        LocalViewsKt$$ExternalSyntheticLambda2 localViewsKt$$ExternalSyntheticLambda2;
        localImage.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1446865162);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(localImage) ? 4 : 2) | i;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            String themedUrl = getThemedUrl(localImage, gapComposer);
            if (themedUrl == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    localViewsKt$$ExternalSyntheticLambda2 = new LocalViewsKt$$ExternalSyntheticLambda2(localImage, i, i4);
                    endRestartGroup.block = localViewsKt$$ExternalSyntheticLambda2;
                }
                return;
            }
            Context applicationContext = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getApplicationContext();
            RealImageLoader realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            boolean changedInstance = gapComposer.changedInstance(realImageLoader) | gapComposer.changedInstance(applicationContext) | gapComposer.changed(themedUrl);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(realImageLoader, applicationContext, themedUrl, null, 20);
                gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
                rememberedValue = animatedImageDecoder$wrapDrawable$2;
            }
            Updater.LaunchedEffect(realImageLoader, themedUrl, (Function2) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            localViewsKt$$ExternalSyntheticLambda2 = new LocalViewsKt$$ExternalSyntheticLambda2(localImage, i, i2);
            endRestartGroup.block = localViewsKt$$ExternalSyntheticLambda2;
        }
    }

    public static final TextStyle textStyle(LocalText localText, TextStyle textStyle, Composer composer) {
        Color m;
        localText.getClass();
        textStyle.getClass();
        LocalColor localColor = localText.text_color;
        if (localColor == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(304412788);
            gapComposer.end(false);
            m = null;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1810935085);
            m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, toComposeColor(localColor, gapComposer2, 0));
        }
        TextStyle m994copyp1EtxEg$default = m != null ? TextStyle.m994copyp1EtxEg$default(textStyle, m.value, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214) : textStyle;
        TextFormatting textFormatting = localText.text_formatting;
        return textFormatting != null ? Intrinsics.areEqual(textFormatting.strikethrough, Boolean.TRUE) : false ? TextStyle.m994copyp1EtxEg$default(m994copyp1EtxEg$default, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119) : m994copyp1EtxEg$default;
    }

    public static final AnnotatedString toAnnotatedString(LocalText localText, Composer composer) {
        Color m;
        localText.getClass();
        String str = localText.text;
        if (str == null) {
            str = "";
        }
        LocalColor localColor = localText.text_color;
        if (localColor == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-804435045);
            gapComposer.end(false);
            m = null;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-441591514);
            m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, toComposeColor(localColor, gapComposer2, 0));
        }
        long j = m != null ? m.value : Color.Unspecified;
        TextFormatting textFormatting = localText.text_formatting;
        return AnnotatedStringKt.AnnotatedString$default(str, new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textFormatting != null ? Intrinsics.areEqual(textFormatting.strikethrough, Boolean.TRUE) : false ? TextDecoration.LineThrough : null, (Shadow) null, 61438));
    }

    public static final long toComposeColor(LocalColor localColor, Composer composer, int i) {
        localColor.getClass();
        LocalComposeColor localComposeColor = toLocalComposeColor(localColor, composer);
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return colors.isLight ? localComposeColor.light : localComposeColor.dark;
    }

    public static final LocalComposeColor toLocalComposeColor(final LocalColor localColor, Composer composer) {
        localColor.getClass();
        String str = localColor.light_color;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean changedInstance = gapComposer.changedInstance(localColor);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            final int i = 0;
            rememberedValue = new Function1() { // from class: app.cash.local.views.internal.LocalViewsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    LocalColor localColor2 = localColor;
                    Exception exc = (Exception) obj;
                    switch (i2) {
                        case 0:
                            exc.getClass();
                            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("failed parsing ", localColor2.light_color), new Object[0], exc);
                            break;
                        default:
                            exc.getClass();
                            Timber.Forest.e(CameraSelector$$ExternalSyntheticOutline0.m("failed parsing ", localColor2.dark_color, " or ", localColor2.light_color), new Object[0], exc);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Integer safeParseColor = com.squareup.util.android.StringsKt.safeParseColor(str, (Function1) rememberedValue);
        safeParseColor.getClass();
        long Color = ColorKt.Color(safeParseColor.intValue());
        String str2 = localColor.dark_color;
        if (str2 == null) {
            str2 = localColor.light_color;
            str2.getClass();
        }
        boolean changedInstance2 = gapComposer.changedInstance(localColor);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            final int i2 = 1;
            rememberedValue2 = new Function1() { // from class: app.cash.local.views.internal.LocalViewsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    LocalColor localColor2 = localColor;
                    Exception exc = (Exception) obj;
                    switch (i22) {
                        case 0:
                            exc.getClass();
                            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("failed parsing ", localColor2.light_color), new Object[0], exc);
                            break;
                        default:
                            exc.getClass();
                            Timber.Forest.e(CameraSelector$$ExternalSyntheticOutline0.m("failed parsing ", localColor2.dark_color, " or ", localColor2.light_color), new Object[0], exc);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Integer safeParseColor2 = com.squareup.util.android.StringsKt.safeParseColor(str2, (Function1) rememberedValue2);
        safeParseColor2.getClass();
        return new LocalComposeColor(Color, ColorKt.Color(safeParseColor2.intValue()));
    }
}
