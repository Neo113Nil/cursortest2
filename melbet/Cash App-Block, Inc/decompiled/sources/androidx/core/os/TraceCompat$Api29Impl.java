package androidx.core.os;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.core.os.TraceCompat$Api29Impl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class TraceCompat$Api29Impl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0089  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* renamed from: SelectablePillRow-sXL4qRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1099SelectablePillRowsXL4qRs(final Modifier modifier, final String str, final Image image, final boolean z, final RealImageLoader realImageLoader, int i, final Function0 function0, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        final int i8;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        ?? r15;
        Modifier.Companion companion;
        float f;
        GapComposer gapComposer2;
        realImageLoader.getClass();
        function0.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1689872704);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer3.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i4 | (gapComposer3.changed(str) ? 32 : 16);
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i9 |= gapComposer3.changedInstance(image) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i9 |= gapComposer3.changed(z) ? 2048 : 1024;
        }
        int i10 = i9 | (gapComposer3.changedInstance(realImageLoader) ? 16384 : PKIFailureInfo.certRevoked);
        if ((i3 & 32) == 0) {
            i5 = i;
            if (gapComposer3.changed(i5)) {
                i6 = PKIFailureInfo.unsupportedVersion;
                i7 = i10 | i6 | 1572864 | (!gapComposer3.changedInstance(function0) ? 8388608 : 4194304);
                if (gapComposer3.shouldExecute(i7 & 1, (4793491 & i7) == 4793490)) {
                    gapComposer3.skipToGroupEnd();
                    i8 = i5;
                    gapComposer = gapComposer3;
                } else {
                    gapComposer3.startDefaults();
                    if ((i2 & 1) != 0 && !gapComposer3.getDefaultsInvalid()) {
                        gapComposer3.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                        }
                    } else if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        i5 = 1;
                    }
                    int i11 = i7;
                    int i12 = i5;
                    gapComposer3.endDefaults();
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(ClipKt.clip(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(modifier, MooncakeTheme.getColors(gapComposer3).background, m340RoundedCornerShape0680j_4), 2.0f, MooncakeTheme.getColors(gapComposer3).secondaryButtonBackground, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4), 1.0f);
                    boolean z2 = (i11 & 29360128) == 8388608;
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(25, function0);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue, 15), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (image == null) {
                        gapComposer3.startReplaceGroup(1097072364);
                        gapComposer3.end(false);
                        companion = companion2;
                        f = 12.0f;
                        r15 = 0;
                        gapComposer2 = gapComposer3;
                    } else {
                        gapComposer3.startReplaceGroup(1097072365);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 24.0f);
                        gapComposer3.startReplaceGroup(1950711520);
                        gapComposer3.end(false);
                        r15 = 0;
                        companion = companion2;
                        f = 12.0f;
                        AsyncImageKt.m1440AsyncImagenc27qi8(image, realImageLoader, m285size3ABfNKs, null, null, null, null, null, null, gapComposer3, ((i11 >> 6) & 896) | 3120 | (Painter.$stable << 12), 0, 65504);
                        GapComposer gapComposer4 = gapComposer3;
                        SpacerKt.Spacer(gapComposer4, SizeKt.m290width3ABfNKs(companion, 12.0f));
                        gapComposer4.end(false);
                        gapComposer2 = gapComposer4;
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, i12, 0, ((i11 >> 3) & 14) | ((i11 << 9) & 234881024), 0, 3824, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(1.0f, true), MooncakeTheme.getTypography(gapComposer2).mainTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    if (z) {
                        gapComposer2.startReplaceGroup(1097671347);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f));
                        Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                        Painter painterResource = Countries.painterResource(R.drawable.mooncake_chevron_right, r15, gapComposer2);
                        long j = MooncakeTheme.getColors(gapComposer2).chevron;
                        ImageKt.Image(painterResource, null, m285size3ABfNKs2, Alignment.Companion.Center, ContentScale.Companion.Inside, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 28080, 32);
                        gapComposer2.end(r15);
                    } else {
                        gapComposer2.startReplaceGroup(1098089382);
                        gapComposer2.end(r15);
                    }
                    gapComposer2.end(true);
                    i8 = i12;
                    gapComposer = gapComposer2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.recurringpayments.views.SelectablePillRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            TraceCompat$Api29Impl.m1099SelectablePillRowsXL4qRs(Modifier.this, str, image, z, realImageLoader, i8, function0, (Composer) obj, Updater.updateChangedFlags(i2 | 1), i3);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            i5 = i;
        }
        i6 = 65536;
        i7 = i10 | i6 | 1572864 | (!gapComposer3.changedInstance(function0) ? 8388608 : 4194304);
        if (gapComposer3.shouldExecute(i7 & 1, (4793491 & i7) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewReviewPrompt.deepLinkSpecs;
    }
}
