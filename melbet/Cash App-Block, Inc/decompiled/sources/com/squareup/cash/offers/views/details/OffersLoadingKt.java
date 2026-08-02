package com.squareup.cash.offers.views.details;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.R;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OffersLoadingKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* renamed from: OffersLoading-Ct2sIOU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3679OffersLoadingCt2sIOU(Modifier modifier, float f, Dp dp, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        Dp dp2;
        float f3;
        Dp dp3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(335841116);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                dp2 = dp;
                i3 |= gapComposer.changed(dp2) ? 256 : 128;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = companion;
                    }
                    float f4 = i6 != 0 ? 60.0f : f2;
                    if (i4 != 0) {
                        dp2 = null;
                    }
                    dp3 = dp2;
                    LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(R.raw.infinite_spin)), null, null, null, null, null, gapComposer, 0, 62);
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
                    if (dp3 == null || (modifier3 = SizeKt.m277height3ABfNKs(companion, dp3.value)) == null) {
                        modifier3 = companion;
                    }
                    Modifier then = fillMaxWidth.then(modifier3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    LottieAnimationKt.LottieAnimation((LottieComposition) rememberLottieComposition.getValue(), SizeKt.m285size3ABfNKs(companion, f4), false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, gapComposer, 1572864, 0, 0, 4194236);
                    gapComposer = gapComposer;
                    gapComposer.end(true);
                    f3 = f4;
                } else {
                    gapComposer.skipToGroupEnd();
                    f3 = f2;
                    dp3 = dp2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new OffersLoadingKt$$ExternalSyntheticLambda0(modifier2, f3, dp3, i, i2, 0);
                    return;
                }
                return;
            }
            dp2 = dp;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dp2 = dp;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
