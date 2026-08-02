package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import com.google.android.material.color.MaterialColors;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.viewmodels.IconTextDetailViewModel;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.withpersona.sdk2.inquiry.nfc.NfcTrackingEventsHolder;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public final class HideLeftViewOnScrollDelegate {
    public final /* synthetic */ int $r8$classId;

    public static final void GenericIconTextDetail(IconTextDetailViewModel iconTextDetailViewModel, Modifier modifier, Modifier modifier2, Composer composer, int i) {
        int i2;
        Modifier modifier3;
        iconTextDetailViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-611175046);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(iconTextDetailViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            IconViewModel.ImageViewModel imageViewModel = iconTextDetailViewModel.icon;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NfcTrackingEventsHolder.GenericImage(imageViewModel, SizeKt.wrapContentSize$default(companion, null, 3), gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 5.0f));
            MaterialColors.GenericText(iconTextDetailViewModel.text, SizeKt.wrapContentSize$default(companion, null, 3), gapComposer, 48);
            gapComposer.end(true);
            modifier3 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(iconTextDetailViewModel, modifier, modifier3, i, 27);
        }
    }

    public static final SelfieCapture to(Selfie selfie) {
        SelfieCapture.CaptureMethod captureMethod;
        if (!new File(selfie.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int ordinal = selfie.getCaptureMethod().ordinal();
        if (ordinal == 0) {
            captureMethod = SelfieCapture.CaptureMethod.Auto;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            captureMethod = SelfieCapture.CaptureMethod.Manual;
        }
        return new SelfieCapture(captureMethod, new File(selfie.getAbsoluteFilePath()));
    }

    public final ViewPropertyAnimator getViewTranslationAnimator(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                return view.animate().translationX(-i);
            case 1:
                return view.animate().translationY(i);
            default:
                return view.animate().translationX(i);
        }
    }
}
