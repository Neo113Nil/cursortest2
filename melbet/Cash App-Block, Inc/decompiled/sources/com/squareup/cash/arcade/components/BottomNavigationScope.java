package com.squareup.cash.arcade.components;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda5;
import androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda3;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda23;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.internal.TooltipKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class BottomNavigationScope implements RowScope {
    public final DynamicColorConfiguration dynamicColorConfiguration;

    public BottomNavigationScope(DynamicColorConfiguration dynamicColorConfiguration) {
        this.dynamicColorConfiguration = dynamicColorConfiguration;
    }

    public final void BottomNavItem(Modifier modifier, boolean z, Badge badge, BadgePlacement badgePlacement, String str, String str2, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        BadgePlacement badgePlacement2;
        long j;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1039185078);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(badge) : gapComposer.changedInstance(badge) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer.changed(this) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
            BadgePlacement badgePlacement3 = BadgePlacement.BottomNavigation;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new TooltipState(coroutineScope);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            TooltipState tooltipState = (TooltipState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
            DynamicColorConfiguration dynamicColorConfiguration = this.dynamicColorConfiguration;
            long j2 = dynamicColorConfiguration.bottomNavigationIconSelected;
            if (z) {
                j = j2;
            } else {
                j = j2;
                j2 = dynamicColorConfiguration.bottomNavigationIconDeselected;
            }
            int i4 = i3;
            Modifier weight = weight(1.0f, SizeKt.m275defaultMinSizeVpY3zN4(modifier, 48.0f, 52.0f), true);
            Function0 withHaptics = PlatformKt.withHaptics(function0, null, gapComposer, (i4 >> 18) & 14, 1);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.bottom_navigation_click_action)).format(zzel$EnumUnboxingLocalUtility.m(1, "destination", str));
            format2.getClass();
            String stringResource = Room.stringResource(gapComposer, R.string.bottom_navigation_long_press_action);
            Role role = new Role(4);
            boolean changedInstance = gapComposer.changedInstance(tooltipState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == obj) {
                rememberedValue4 = new TooltipKt$$ExternalSyntheticLambda2(tooltipState, 1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(weight, mutableInteractionSourceImpl, null, false, format2, role, stringResource, (Function0) rememberedValue4, withHaptics, 388);
            boolean z2 = ((i4 & 458752) == 131072) | ((i4 & 112) == 32);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z2 || rememberedValue5 == obj) {
                rememberedValue5 = new SnackbarHostKt$$ExternalSyntheticLambda5(str2, 1, z);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m184combinedClickableauXiCPI$default, false, (Function1) rememberedValue5);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle), re$$ExternalSyntheticOutline0.m(j2, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(j2, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(1618160656, new DatePickerKt$$ExternalSyntheticLambda23(mutableInteractionSourceImpl, j, str, tooltipState, badge, badgePlacement3, composableLambdaImpl), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            badgePlacement2 = badgePlacement3;
        } else {
            gapComposer.skipToGroupEnd();
            badgePlacement2 = badgePlacement;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldDefaults$$ExternalSyntheticLambda3(this, modifier, z, badge, badgePlacement2, str, str2, function0, composableLambdaImpl, i);
        }
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier align(Modifier modifier, BiasAlignment.Vertical vertical) {
        modifier.getClass();
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        if (!(((double) f) > 0.0d)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, z));
    }
}
