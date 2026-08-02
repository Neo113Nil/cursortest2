package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class IconKt {
    public static final Modifier DefaultIconSizeModifier = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if ((r23 & 8) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0160, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r3 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax))) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0064  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m492Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        Modifier modifier3;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1142959010);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && gapComposer.changed(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            } else {
                gapComposer.startDefaults();
                int i5 = i & 1;
                Modifier modifier5 = Modifier.Companion.$$INSTANCE;
                if (i5 == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i4 != 0) {
                        modifier2 = modifier5;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = Color.m675copywmQWz5c$default(((Number) gapComposer.consume(ContentAlphaKt.LocalContentAlpha)).floatValue(), ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value, 14);
                        i3 &= -7169;
                    }
                    gapComposer.endDefaults();
                    boolean z2 = (((i3 & 7168) ^ 3072) > 2048 && gapComposer.changed(j2)) || (i3 & 3072) == 2048;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = Color.m676equalsimpl0(j2, Color.Unspecified) ? null : new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ColorFilter colorFilter = (ColorFilter) rememberedValue;
                    if (str != null) {
                        gapComposer.startReplaceGroup(609219782);
                        boolean z3 = (i3 & 112) == 32;
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (z3 || rememberedValue2 == neverEqualPolicy) {
                            z = false;
                            rememberedValue2 = new IconKt$$ExternalSyntheticLambda0(str, 0);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        } else {
                            z = false;
                        }
                        modifier4 = SemanticsModifierKt.semantics(modifier5, z, (Function1) rememberedValue2);
                        gapComposer.end(z);
                    } else {
                        gapComposer.startReplaceGroup(609378564);
                        gapComposer.end(false);
                        modifier4 = modifier5;
                    }
                    if (!Size.m639equalsimpl0(painter.mo759getIntrinsicSizeNHjbRc(), 9205357640488583168L)) {
                        long mo759getIntrinsicSizeNHjbRc = painter.mo759getIntrinsicSizeNHjbRc();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (mo759getIntrinsicSizeNHjbRc >> 32)))) {
                        }
                        BoxKt.Box(ClipKt.paint$default(modifier2.then(modifier5), painter, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, colorFilter, 22).then(modifier4), gapComposer, 0);
                        modifier3 = modifier2;
                        j3 = j2;
                    }
                    modifier5 = DefaultIconSizeModifier;
                    BoxKt.Box(ClipKt.paint$default(modifier2.then(modifier5), painter, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, colorFilter, 22).then(modifier4), gapComposer, 0);
                    modifier3 = modifier2;
                    j3 = j2;
                } else {
                    gapComposer.skipToGroupEnd();
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconKt$$ExternalSyntheticLambda1(painter, str, modifier3, j3, i, i2, 0);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
