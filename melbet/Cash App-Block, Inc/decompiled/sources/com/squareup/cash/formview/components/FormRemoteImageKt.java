package com.squareup.cash.formview.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class FormRemoteImageKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.RemoteImageElement.HorizontalAlignment.values().length];
            try {
                iArr[FormBlocker.Element.RemoteImageElement.HorizontalAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.RemoteImageElement.HorizontalAlignment.FULL_BLEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.RemoteImageElement.HorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormBlocker.Element.RemoteImageElement.HorizontalAlignment.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FormRemoteImage(FormBlocker.Element.RemoteImageElement remoteImageElement, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        BiasAlignment biasAlignment;
        String m;
        Modifier wrapContentHeight;
        Color m2;
        BlendModeColorFilter blendModeColorFilter;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-202007623);
        int i2 = i | (gapComposer.changedInstance(remoteImageElement) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Integer num = remoteImageElement.width;
            if (num == null) {
                a$$ExternalSyntheticBUOutline0.m$1("RemoteImageElement.width == null");
                return;
            }
            int intValue = num.intValue();
            Integer num2 = remoteImageElement.height;
            if (num2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("RemoteImageElement.height == null");
                return;
            }
            int intValue2 = num2.intValue();
            FormBlocker.Element.RemoteImageElement.HorizontalAlignment horizontalAlignment = remoteImageElement.alignment;
            if (horizontalAlignment == null) {
                horizontalAlignment = FormBlocker.Element.RemoteImageElement.HorizontalAlignment.START;
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
            if (i3 == 1) {
                biasAlignment = Alignment.Companion.CenterStart;
            } else if (i3 == 2 || i3 == 3) {
                biasAlignment = Alignment.Companion.Center;
            } else {
                if (i3 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                biasAlignment = Alignment.Companion.CenterEnd;
            }
            Image image = remoteImageElement.image;
            if (image == null) {
                gapComposer.startReplaceGroup(-759266917);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -855776474, image, gapComposer, false);
            }
            if (m == null) {
                m = remoteImageElement.url;
            }
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
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
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, biasAlignment);
            Modifier aspectRatio = OffsetKt.aspectRatio(intValue / intValue2, horizontalAlignment == FormBlocker.Element.RemoteImageElement.HorizontalAlignment.FULL_BLEED ? SizeKt.fillMaxWidth(align, 1.0f) : SizeKt.m290width3ABfNKs(align, intValue), false);
            com.squareup.protos.cash.ui.Color color = remoteImageElement.tint_color;
            if (color == null) {
                gapComposer.startReplaceGroup(785818980);
                gapComposer.end(false);
                m2 = null;
            } else {
                m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1826464317, color, gapComposer, false);
            }
            if (m2 != null) {
                long j = m2.value;
                blendModeColorFilter = new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            } else {
                blendModeColorFilter = null;
            }
            AsyncImageKt.m1441AsyncImagesKDTAoQ(m, remoteImageElement.accessibility_label, realImageLoader, aspectRatio, null, null, blendModeColorFilter, gapComposer, (i2 << 3) & 896, 0, 3568);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(remoteImageElement, realImageLoader, modifier, i, 0);
        }
    }
}
