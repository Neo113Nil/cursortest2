package androidx.camera.video.internal.config;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.util.Rational;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import coil3.memory.RealWeakMemoryCache;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class AudioConfigUtil {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DiagonalStackedAvatars(DiagonalAvatarValues diagonalAvatarValues, AvatarEntry avatarEntry, AvatarEntry avatarEntry2, Modifier modifier, Composer composer, int i, int i2) {
        AvatarEntry avatarEntry3;
        AvatarEntry avatarEntry4;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        DiagonalAvatarValues diagonalAvatarValues2 = diagonalAvatarValues;
        diagonalAvatarValues2.getClass();
        avatarEntry.getClass();
        avatarEntry2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1511182398);
        int i3 = (i & 6) == 0 ? (gapComposer2.changed(diagonalAvatarValues2.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            avatarEntry3 = avatarEntry;
            i3 |= gapComposer2.changed(avatarEntry3) ? 32 : 16;
        } else {
            avatarEntry3 = avatarEntry;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            avatarEntry4 = avatarEntry2;
            i3 |= gapComposer2.changed(avatarEntry4) ? 256 : 128;
        } else {
            avatarEntry4 = avatarEntry2;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            boolean z = true;
            boolean z2 = false;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier4 = i4 != 0 ? companion : modifier2;
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                gapComposer2.startReplaceGroup(548626493);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier4, diagonalAvatarValues2.size);
                boolean changed = gapComposer2.changed(diagonalAvatarValues2.ordinal());
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SliderKt$SliderImpl$2$1(diagonalAvatarValues2, 3);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m285size3ABfNKs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer2.startReplaceGroup(-868310363);
                for (AvatarEntry avatarEntry5 : CollectionsKt__CollectionsKt.listOf((Object[]) new AvatarEntry[]{avatarEntry, avatarEntry2})) {
                    RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj = DefaultSizes.border.annotationsMap;
                    GapComposer gapComposer3 = gapComposer2;
                    TextViewKt.m3613AvatarB_rZmmc(diagonalAvatarValues2.avatarValue, avatarEntry5.monogram, avatarEntry5.backgroundColor, avatarEntry5.contentDescription, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 2.0f), avatarEntry5.avatarImage, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 0, 0, 1984);
                    z = z;
                    z2 = z2;
                    gapComposer2 = gapComposer3;
                    modifier4 = modifier4;
                    realWeakMemoryCache = realWeakMemoryCache;
                    diagonalAvatarValues2 = diagonalAvatarValues;
                }
                modifier3 = modifier4;
                boolean z3 = z2;
                gapComposer = gapComposer2;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, z3, z, z3);
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(diagonalAvatarValues, avatarEntry3, avatarEntry4, modifier3, i, i2, 8);
                return;
            }
            return;
        }
        modifier2 = modifier;
        boolean z4 = true;
        boolean z22 = false;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean access$isValid(Money money, Money money2, Money money3) {
        Long l;
        Long l2;
        Long l3 = money.amount;
        if (l3 == null) {
            return false;
        }
        long longValue = l3.longValue();
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        if (longValue <= 0) {
            return false;
        }
        if (money2 != null) {
            CurrencyCode currencyCode2 = money2.currency_code;
            if (currencyCode2 != null && currencyCode2 != currencyCode) {
                money2 = null;
            }
            if (money2 != null && (l2 = money2.amount) != null && longValue < l2.longValue()) {
                return false;
            }
        }
        if (money3 == null) {
            return true;
        }
        CurrencyCode currencyCode3 = money3.currency_code;
        if (currencyCode3 != null && currencyCode3 != currencyCode) {
            money3 = null;
        }
        return money3 == null || (l = money3.amount) == null || longValue <= l.longValue();
    }

    public static CaptureEncodeRates resolveSampleRates$camera_video(int i, int i2, Rational rational) {
        int roundToInt;
        int selectSampleRateOrNearestSupported;
        int roundToInt2;
        if (rational == null) {
            selectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(i2, i);
        } else {
            if (zzabw.isInvalidCaptureToEncodeRatio(rational)) {
                StringUtilsKt.w("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
                roundToInt = i;
            } else {
                roundToInt = MathKt__MathJVMKt.roundToInt(rational.floatValue() * i);
            }
            selectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(i2, roundToInt);
            if (!zzabw.isInvalidCaptureToEncodeRatio(rational)) {
                roundToInt2 = MathKt__MathJVMKt.roundToInt(selectSampleRateOrNearestSupported / rational.floatValue());
                StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(selectSampleRateOrNearestSupported, roundToInt2, "Resolved capture/encode sample rate ", "Hz/", "Hz, [target sample rate: ");
                Recorder$$ExternalSyntheticOutline1.m105m(i, i2, ", channel count: ", ", source format: 2, capture to encode sample rate ratio: ", m107m);
                m107m.append(rational);
                m107m.append(']');
                StringUtilsKt.d("AudioConfigUtil", m107m.toString());
                return new CaptureEncodeRates(selectSampleRateOrNearestSupported, roundToInt2);
            }
            StringUtilsKt.w("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        }
        roundToInt2 = selectSampleRateOrNearestSupported;
        StringBuilder m107m2 = Recorder$$ExternalSyntheticOutline2.m107m(selectSampleRateOrNearestSupported, roundToInt2, "Resolved capture/encode sample rate ", "Hz/", "Hz, [target sample rate: ");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, ", channel count: ", ", source format: 2, capture to encode sample rate ratio: ", m107m2);
        m107m2.append(rational);
        m107m2.append(']');
        StringUtilsKt.d("AudioConfigUtil", m107m2.toString());
        return new CaptureEncodeRates(selectSampleRateOrNearestSupported, roundToInt2);
    }

    public static int scaleBitrate(int i, int i2, int i3, int i4, int i5) {
        String str;
        Rational rational = new Rational(i2, i3);
        int doubleValue = (int) (new Rational(i4, i5).doubleValue() * rational.doubleValue() * i);
        if (StringUtilsKt.isLogLevelEnabled(3, "AudioConfigUtil")) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Base Bitrate(", "bps) * Channel Count Ratio(", " / ");
            Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, ") * Sample Rate Ratio(", " / ", m107m);
            str = Recorder$$ExternalSyntheticOutline2.m(i5, doubleValue, ") = ", m107m);
        } else {
            str = "";
        }
        StringUtilsKt.d("AudioConfigUtil", str);
        return doubleValue;
    }

    public static int selectSampleRateOrNearestSupported(int i, int i2) {
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 1;
            int i6 = 2;
            if (i4 > 0 && i > 0) {
                if (AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, 2) > 0) {
                    try {
                        new AudioFormat.Builder().setSampleRate(i4).setChannelMask(i == 1 ? 16 : 12).setEncoding(2).build();
                        return i4;
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            StringUtilsKt.d("AudioConfigUtil", Recorder$$ExternalSyntheticOutline2.m(i4, i, "Sample rate ", " Hz is not supported by audio source with channel count ", " and source format 2"));
            if (arrayList == null) {
                StringUtilsKt.d("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i2 + " Hz");
                arrayList = new ArrayList(AutoValue_AudioSettings.COMMON_SAMPLE_RATES);
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new VideoCapture$$ExternalSyntheticLambda6(new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i2, i5), i6));
            }
            if (i3 >= arrayList.size()) {
                StringUtilsKt.d("AudioConfigUtil", "No sample rate found or supported by audio source. Falling back to default sample rate of 44100 Hz");
                return 44100;
            }
            i4 = ((Number) arrayList.get(i3)).intValue();
            i3++;
        }
    }
}
