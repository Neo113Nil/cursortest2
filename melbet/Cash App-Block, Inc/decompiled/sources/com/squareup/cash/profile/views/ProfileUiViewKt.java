package com.squareup.cash.profile.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.NavigationIcon;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ProfileUiViewKt {
    static {
        NavigationIcon navigationIcon = NavigationIcon.BACK;
        GenericProfileElementViewModel.IconTextWidget iconTextWidget = new GenericProfileElementViewModel.IconTextWidget("Joined 4 weeks ago", null);
        GenericProfileElementViewModel.IconTextWidget iconTextWidget2 = new GenericProfileElementViewModel.IconTextWidget("Profile Element 2", null);
        GenericProfileElementViewModel.IconTextWidget iconTextWidget3 = new GenericProfileElementViewModel.IconTextWidget("Profile Element 3", null);
        Edge.Companion companion = GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.Companion;
        CollectionsKt__CollectionsKt.listOf((Object[]) new GenericProfileElementViewModel[]{iconTextWidget, iconTextWidget2, iconTextWidget3, new GenericProfileElementViewModel.ButtonWidget("Block", (GenericProfileElement.ButtonElement.BlockAction) null, (GenericProfileElement.ButtonElement.ReportAction) null, 12), new GenericProfileElementViewModel.ButtonWidget("Report", (GenericProfileElement.ButtonElement.BlockAction) null, (GenericProfileElement.ButtonElement.ReportAction) null, 12)}).getClass();
    }

    public static final void ProfilePhotoOverlay(Modifier modifier, ProfileViewModel.Loaded.ProfilePhoto profilePhoto, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(582701359);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(profilePhoto) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(profilePhoto, null, (Function1) rememberedValue, null, "PhotoOverlayAnimatedContent", null, Expect_jvmKt.rememberComposableLambda(761671309, new HeroCardViewKt$$ExternalSyntheticLambda1(18, function1), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1597824, 42);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(i, 15, modifier2, profilePhoto, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileView(Modifier modifier, ProfileViewModel profileViewModel, Function1 function1, boolean z, boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        GapComposer gapComposer;
        boolean z5;
        boolean z6;
        RecomposeScopeImpl endRestartGroup;
        boolean z7;
        profileViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-52973666);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(profileViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z;
            i3 |= gapComposer2.changed(z3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= gapComposer2.changed(z4) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        z3 = true;
                    }
                    boolean z8 = i4 != 0 ? true : z4;
                    if (profileViewModel instanceof ProfileViewModel.Loading) {
                        gapComposer2.startReplaceGroup(631923973);
                        TransactorKt.LoadingPlaceholder(modifier, null, gapComposer2, i3 & 14, 2);
                        gapComposer2.end(false);
                        z7 = z3;
                    } else {
                        if (!(profileViewModel instanceof ProfileViewModel.Loaded)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 631921219, false);
                        }
                        gapComposer2.startReplaceGroup(631926795);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
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
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        ProfileViewModel.Loaded loaded = (ProfileViewModel.Loaded) profileViewModel;
                        z7 = z3;
                        ProfileKt.ProfileLoaded(modifier, loaded, function1, z7, z8, gapComposer2, i3 & JpegConstants.COM_MARKER, 0);
                        ProfilePhotoOverlay(null, loaded.photoOverlay, function1, gapComposer2, i3 & 896);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    }
                    gapComposer = gapComposer2;
                    z6 = z8;
                    z5 = z7;
                } else {
                    gapComposer2.skipToGroupEnd();
                    gapComposer = gapComposer2;
                    z5 = z3;
                    z6 = z4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(modifier, profileViewModel, function1, z5, z6, i, i2, 6);
                    return;
                }
                return;
            }
            z4 = z2;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
