package com.squareup.cash.profile.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Loading;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loaded;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loading;
import com.squareup.cash.profile.views.preview.ProfileViewModelProvider;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ProfileKt {
    public static final ProfileViewModel.Loaded DEFAULT_VIEW_MODEL = new ProfileViewModelProvider().defaultViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0321  */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileLoaded(Modifier modifier, ProfileViewModel.Loaded loaded, Function1 function1, boolean z, boolean z2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        boolean z3;
        ProfileViewModel.Loaded loaded2;
        Function1 function12;
        boolean z4;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        BiasAlignment.Horizontal horizontal;
        Arrangement$Top$1 arrangement$Top$1;
        boolean z5;
        Modifier modifier3;
        int i5;
        NeverEqualPolicy neverEqualPolicy;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Modifier.Companion companion;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ?? r4;
        float f;
        ProfileViewModel.Loaded.ProfileHeader profileHeader;
        boolean z6;
        GapComposer gapComposer2;
        Modifier modifier4;
        NeverEqualPolicy neverEqualPolicy2;
        NotificationCompat notificationCompat;
        Debug debug;
        boolean z7;
        Object rememberedValue;
        GapComposer gapComposer3;
        NavigationType navigationType;
        boolean z8;
        Function0 function0;
        boolean z9;
        ComposableLambdaImpl composableLambdaImpl;
        loaded.getClass();
        ProfileViewModel.Loaded.ProfileHeader profileHeader2 = loaded.header;
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-983174547);
        Applier applier = gapComposer4.applier;
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer4.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer4.changedInstance(loaded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer4.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer4.changed(z) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= gapComposer4.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer4.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (i6 != 0) {
                        modifier2 = companion2;
                    }
                    boolean z10 = i7 != 0 ? true : z;
                    boolean z11 = i4 != 0 ? true : z3;
                    Modifier then = modifier2.then(z11 ? SizeKt.fillMaxSize(companion2, 1.0f) : companion2);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(then, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer4, 0);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$15);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$16);
                    NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                    if (z10) {
                        gapComposer4.startReplaceGroup(-749474238);
                        ProfileViewModel.Loaded.ProfileHeader.FavoriteAction favoriteAction = profileHeader2.favoriteAction;
                        int ordinal = profileHeader2.navigationIcon.ordinal();
                        if (ordinal != 0) {
                            z5 = z10;
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            navigationType = NavigationType.CLOSE;
                        } else {
                            z5 = z10;
                            navigationType = NavigationType.BACK;
                        }
                        modifier3 = modifier2;
                        boolean z12 = (i3 & 896) == 256;
                        Object rememberedValue2 = gapComposer4.rememberedValue();
                        if (z12 || rememberedValue2 == neverEqualPolicy3) {
                            z8 = false;
                            rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda0(0, function1);
                            gapComposer4.updateRememberedValue(rememberedValue2);
                        } else {
                            z8 = false;
                        }
                        Function0 function02 = (Function0) rememberedValue2;
                        if (favoriteAction != null) {
                            gapComposer4.startReplaceGroup(-749101990);
                            function0 = function02;
                            z9 = false;
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-354524232, new ProfileKt$$ExternalSyntheticLambda1((int) (false ? 1 : 0), (Object) favoriteAction, (Object) function1), gapComposer4);
                            gapComposer4.end(false);
                        } else {
                            function0 = function02;
                            z9 = z8;
                            gapComposer4.startReplaceGroup(-747202899);
                            gapComposer4.end(z9);
                            composableLambdaImpl = null;
                        }
                        i5 = i3;
                        companion = companion2;
                        GapComposer gapComposer5 = gapComposer4;
                        horizontal = horizontal2;
                        arrangement$Top$1 = arrangement$Top$12;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        neverEqualPolicy = neverEqualPolicy3;
                        profileHeader = profileHeader2;
                        ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        boolean z13 = z9;
                        z6 = true;
                        f = 1.0f;
                        DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, composableLambdaImpl2, gapComposer5, 6, 44);
                        gapComposer5.end(z13);
                        r4 = z13;
                        gapComposer2 = gapComposer5;
                    } else {
                        horizontal = horizontal2;
                        arrangement$Top$1 = arrangement$Top$12;
                        z5 = z10;
                        modifier3 = modifier2;
                        i5 = i3;
                        neverEqualPolicy = neverEqualPolicy3;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                        companion = companion2;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        r4 = 0;
                        f = 1.0f;
                        profileHeader = profileHeader2;
                        GapComposer gapComposer6 = gapComposer4;
                        z6 = true;
                        gapComposer6.startReplaceGroup(-747159189);
                        gapComposer6.end(false);
                        gapComposer2 = gapComposer6;
                    }
                    if (z11) {
                        gapComposer2.startReplaceGroup(-747066344);
                        modifier4 = ImageKt.verticalScroll$default(new LayoutWeightElement(f, z6), ImageKt.rememberScrollState(gapComposer2), r4, 14);
                        gapComposer2.end(r4);
                    } else {
                        gapComposer2.startReplaceGroup(-746979575);
                        gapComposer2.end(r4);
                        modifier4 = companion;
                    }
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, r4);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, modifier4);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, f);
                    ProfileViewModel.Loaded.ProfileHeader profileHeader3 = profileHeader;
                    ProfileHeaderViewModel profileHeaderViewModel = profileHeader3.headerViewModel;
                    int i8 = i5 & 896;
                    boolean z14 = i8 == 256 ? z6 : r4;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (z14) {
                        neverEqualPolicy2 = neverEqualPolicy;
                    } else {
                        neverEqualPolicy2 = neverEqualPolicy;
                        if (rememberedValue3 != neverEqualPolicy2) {
                            function12 = function1;
                            BadgeNameKt.ProfileHeader(fillMaxWidth, profileHeaderViewModel, (Function0) rememberedValue3, gapComposer2, 6);
                            loaded2 = loaded;
                            notificationCompat = loaded2.body;
                            if (!(notificationCompat instanceof ProfileViewModel$Loaded$ProfileBody$Loaded)) {
                                debug = ((ProfileViewModel$Loaded$ProfileBody$Loaded) notificationCompat).genericProfileElements;
                            } else {
                                if (!Intrinsics.areEqual(notificationCompat, ProfileViewModel$Loaded$ProfileBody$Loading.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                debug = GenericProfileElementsViewModel$Loading.INSTANCE;
                            }
                            z7 = i8 != 256 ? z6 : r4;
                            rememberedValue = gapComposer2.rememberedValue();
                            if (!z7 || rememberedValue == neverEqualPolicy2) {
                                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(r4, function12);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            BadgeNameKt.GenericProfileElements(null, debug, (Function1) rememberedValue, gapComposer2, r4);
                            gapComposer2.end(z6);
                            ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton = profileHeader3.primaryButton;
                            ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton2 = profileHeader3.secondaryButton;
                            if (profileHeader3.showPayRequestButtons || (actionButton == null && actionButton2 == null)) {
                                gapComposer2.startReplaceGroup(-745447989);
                                gapComposer2.end(r4);
                                gapComposer3 = gapComposer2;
                            } else {
                                gapComposer2.startReplaceGroup(-746139134);
                                Composer composer2 = gapComposer2;
                                DimensionKt.ButtonCtaGroup(null, true, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(2112415715, new SheetKt$$ExternalSyntheticLambda5(5, actionButton, function12, actionButton2), gapComposer2), composer2, 25008, 9);
                                GapComposer gapComposer7 = composer2;
                                gapComposer7.end(r4);
                                gapComposer3 = gapComposer7;
                            }
                            gapComposer3.end(z6);
                            z3 = z11;
                            z4 = z5;
                            modifier2 = modifier3;
                            gapComposer = gapComposer3;
                        }
                    }
                    function12 = function1;
                    rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda0(10, function12);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                    BadgeNameKt.ProfileHeader(fillMaxWidth, profileHeaderViewModel, (Function0) rememberedValue3, gapComposer2, 6);
                    loaded2 = loaded;
                    notificationCompat = loaded2.body;
                    if (!(notificationCompat instanceof ProfileViewModel$Loaded$ProfileBody$Loaded)) {
                    }
                    if (i8 != 256) {
                    }
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!z7) {
                    }
                    rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(r4, function12);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    BadgeNameKt.GenericProfileElements(null, debug, (Function1) rememberedValue, gapComposer2, r4);
                    gapComposer2.end(z6);
                    ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton3 = profileHeader3.primaryButton;
                    ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton22 = profileHeader3.secondaryButton;
                    if (profileHeader3.showPayRequestButtons) {
                    }
                    gapComposer2.startReplaceGroup(-745447989);
                    gapComposer2.end(r4);
                    gapComposer3 = gapComposer2;
                    gapComposer3.end(z6);
                    z3 = z11;
                    z4 = z5;
                    modifier2 = modifier3;
                    gapComposer = gapComposer3;
                } else {
                    loaded2 = loaded;
                    function12 = function1;
                    GapComposer gapComposer8 = gapComposer4;
                    gapComposer8.skipToGroupEnd();
                    z4 = z;
                    gapComposer = gapComposer8;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(modifier2, loaded2, function12, z4, z3, i, i2, 0);
                    return;
                }
                return;
            }
            z3 = z2;
            if (gapComposer4.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if (gapComposer4.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
