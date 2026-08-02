package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathParserKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class IconKt {
    public static final Modifier DefaultIconSizeModifier = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, SmallIconButtonTokens.IconSize);

    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r10 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax))) != false) goto L78;
     */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m533Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i) {
        Painter painter2;
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2142239481);
        if ((i & 6) == 0) {
            painter2 = painter;
            i2 = (gapComposer.changedInstance(painter2) ? 4 : 2) | i;
        } else {
            painter2 = painter;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(j) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && gapComposer.changed(j)) || (i2 & 3072) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = Color.m676equalsimpl0(j, Color.Unspecified) ? null : new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ColorFilter colorFilter = (ColorFilter) rememberedValue;
            Modifier modifier3 = Modifier.Companion.$$INSTANCE;
            if (str != null) {
                gapComposer.startReplaceGroup(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(str, 8);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier semantics = SemanticsModifierKt.semantics(modifier3, false, (Function1) rememberedValue2);
                gapComposer.end(false);
                modifier2 = semantics;
            } else {
                gapComposer.startReplaceGroup(-536832197);
                gapComposer.end(false);
                modifier2 = modifier3;
            }
            Modifier modifier4 = modifier2;
            if (!Size.m639equalsimpl0(painter2.mo759getIntrinsicSizeNHjbRc(), 9205357640488583168L)) {
                long mo759getIntrinsicSizeNHjbRc = painter2.mo759getIntrinsicSizeNHjbRc();
                if (Float.isInfinite(Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32)))) {
                }
                BoxKt.Box(ClipKt.paint$default(modifier.then(modifier3), painter2, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, colorFilter, 22).then(modifier4), gapComposer, 0);
            }
            modifier3 = DefaultIconSizeModifier;
            BoxKt.Box(ClipKt.paint$default(modifier.then(modifier3), painter2, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, colorFilter, 22).then(modifier4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconKt$$ExternalSyntheticLambda0(painter, str, modifier, j, i);
        }
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m534Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        String str2;
        long j2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-126890956);
        int i4 = (gapComposer.changed(imageVector) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (gapComposer.changed(modifier) ? 256 : 128);
        }
        int i6 = i3 | 1024;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    modifier = Modifier.Companion.$$INSTANCE;
                }
                j = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
            }
            int i7 = i6 & (-7169);
            Modifier modifier3 = modifier;
            long j3 = j;
            gapComposer.endDefaults();
            str2 = str;
            m533Iconww6aTOc(PathParserKt.rememberVectorPainter(imageVector, gapComposer), str2, modifier3, j3, gapComposer, (i7 & 112) | 8 | (i7 & 896));
            modifier2 = modifier3;
            j2 = j3;
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
            j2 = j;
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconKt$$ExternalSyntheticLambda0(imageVector, str2, modifier2, j2, i, i2);
        }
    }
}
