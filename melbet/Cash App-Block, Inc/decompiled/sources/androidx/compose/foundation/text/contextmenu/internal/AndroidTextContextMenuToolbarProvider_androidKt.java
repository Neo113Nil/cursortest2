package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class AndroidTextContextMenuToolbarProvider_androidKt {

    /* renamed from: lambda$-1357803046, reason: not valid java name */
    public static final ComposableLambdaImpl f6lambda$1357803046;
    public static final ComposableLambdaImpl lambda$636288403;

    static {
        final int i = 0;
        lambda$636288403 = new ComposableLambdaImpl(new Function5() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int i2;
                int i3;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj;
                TextContextMenuDataProvider textContextMenuDataProvider = (TextContextMenuDataProvider) obj2;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj4;
                Integer num = (Integer) obj5;
                switch (i) {
                    case 0:
                        int intValue = num.intValue();
                        if ((intValue & 6) == 0) {
                            i2 = intValue | ((intValue & 8) == 0 ? ((GapComposer) composer).changed(textContextMenuSession) : ((GapComposer) composer).changedInstance(textContextMenuSession) ? 4 : 2);
                        } else {
                            i2 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i2 |= (intValue & 64) == 0 ? ((GapComposer) composer).changed(textContextMenuDataProvider) : ((GapComposer) composer).changedInstance(textContextMenuDataProvider) ? 32 : 16;
                        }
                        if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                            i2 |= ((GapComposer) composer).changedInstance(function0) ? 256 : 128;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, function0, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        break;
                    default:
                        int intValue2 = num.intValue();
                        if ((intValue2 & 6) == 0) {
                            i3 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer).changed(textContextMenuSession) : ((GapComposer) composer).changedInstance(textContextMenuSession) ? 4 : 2);
                        } else {
                            i3 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i3 |= (intValue2 & 64) == 0 ? ((GapComposer) composer).changed(textContextMenuDataProvider) : ((GapComposer) composer).changedInstance(textContextMenuDataProvider) ? 32 : 16;
                        }
                        if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                            i3 |= ((GapComposer) composer).changedInstance(function0) ? 256 : 128;
                        }
                        GapComposer gapComposer2 = (GapComposer) composer;
                        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, function0, gapComposer2, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, false, 636288403);
        final int i2 = 1;
        f6lambda$1357803046 = new ComposableLambdaImpl(new Function5() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int i22;
                int i3;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) obj;
                TextContextMenuDataProvider textContextMenuDataProvider = (TextContextMenuDataProvider) obj2;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj4;
                Integer num = (Integer) obj5;
                switch (i2) {
                    case 0:
                        int intValue = num.intValue();
                        if ((intValue & 6) == 0) {
                            i22 = intValue | ((intValue & 8) == 0 ? ((GapComposer) composer).changed(textContextMenuSession) : ((GapComposer) composer).changedInstance(textContextMenuSession) ? 4 : 2);
                        } else {
                            i22 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i22 |= (intValue & 64) == 0 ? ((GapComposer) composer).changed(textContextMenuDataProvider) : ((GapComposer) composer).changedInstance(textContextMenuDataProvider) ? 32 : 16;
                        }
                        if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                            i22 |= ((GapComposer) composer).changedInstance(function0) ? 256 : 128;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(i22 & 1, (i22 & 1171) != 1170)) {
                            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, function0, gapComposer, i22 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        break;
                    default:
                        int intValue2 = num.intValue();
                        if ((intValue2 & 6) == 0) {
                            i3 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer).changed(textContextMenuSession) : ((GapComposer) composer).changedInstance(textContextMenuSession) ? 4 : 2);
                        } else {
                            i3 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i3 |= (intValue2 & 64) == 0 ? ((GapComposer) composer).changed(textContextMenuDataProvider) : ((GapComposer) composer).changedInstance(textContextMenuDataProvider) ? 32 : 16;
                        }
                        if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                            i3 |= ((GapComposer) composer).changedInstance(function0) ? 256 : 128;
                        }
                        GapComposer gapComposer2 = (GapComposer) composer;
                        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, function0, gapComposer2, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, false, -1357803046);
    }

    public static final void ProvideBothDefaultProviders(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(790527681);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, NeverEqualPolicy.INSTANCE);
                gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                rememberedValue = parcelableSnapshotMutableState;
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ImageLoader$Builder$$ExternalSyntheticLambda1(mutableState, 7);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            PopupProperties popupProperties = DefaultTextContextMenuDropdownProvider_androidKt.DefaultPopupProperties;
            BasicTextContextMenuProvider basicTextContextMenuProvider = TransactorKt.basicTextContextMenuProvider(f6lambda$1357803046, gapComposer, 6);
            modifier2 = modifier;
            composableLambdaImpl2 = composableLambdaImpl;
            Updater.CompositionLocalProvider(new ProvidedValue[]{TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider.defaultProvidedValue$runtime(platformTextContextMenuToolbarProvider(function0, gapComposer, 2)), TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider.defaultProvidedValue$runtime(basicTextContextMenuProvider)}, Expect_jvmKt.rememberComposableLambda(1070596993, new ScreenshotViewKt$$ExternalSyntheticLambda5(modifier2, mutableState, composableLambdaImpl2, basicTextContextMenuProvider, function0, 1), gapComposer), gapComposer, 56);
        } else {
            modifier2 = modifier;
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlatformDefaultTextContextMenuProviders_androidKt$$ExternalSyntheticLambda0(modifier2, composableLambdaImpl2, i, 1);
        }
    }

    public static final void ProvideDefaultPlatformTextContextMenuProviders(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(155925518);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = gapComposer.consume(TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider) != null;
            boolean z2 = gapComposer.consume(TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider) != null;
            if (z && z2) {
                gapComposer.startReplaceGroup(-1977187922);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i2 >> 3) & 14));
                gapComposer.end(true);
                gapComposer.end(false);
            } else if (z) {
                gapComposer.startReplaceGroup(-1976997706);
                ProvidePlatformTextContextMenuToolbar(modifier, composableLambdaImpl, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else if (z2) {
                gapComposer.startReplaceGroup(-1976846922);
                DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown(modifier, composableLambdaImpl, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1976716505);
                ProvideBothDefaultProviders(modifier, composableLambdaImpl, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlatformDefaultTextContextMenuProviders_androidKt$$ExternalSyntheticLambda0(modifier, composableLambdaImpl, i, 0);
        }
    }

    public static final void ProvidePlatformTextContextMenuToolbar(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2064964257);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ProvidePlatformTextContextMenuToolbar$1(modifier, composableLambdaImpl, gapComposer, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda11(modifier, composableLambdaImpl, i, i3);
        }
    }

    public static final void ProvidePlatformTextContextMenuToolbar$1(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(771959668);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(null) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, NeverEqualPolicy.INSTANCE);
                gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                rememberedValue = parcelableSnapshotMutableState;
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TooltipKt$$ExternalSyntheticLambda1(8, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.CompositionLocalProvider(TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider.defaultProvidedValue$runtime(platformTextContextMenuToolbarProvider((Function0) rememberedValue2, gapComposer, 0)), Expect_jvmKt.rememberComposableLambda(-291176396, new MenuKt$$ExternalSyntheticLambda1(3, modifier, mutableState, composableLambdaImpl), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda11(modifier, composableLambdaImpl, i, i3);
        }
    }

    public static final AndroidTextContextMenuToolbarProvider platformTextContextMenuToolbarProvider(Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
        boolean changed = gapComposer.changed(view);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new AndroidTextContextMenuToolbarProvider(view, null, function0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(androidTextContextMenuToolbarProvider);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0(androidTextContextMenuToolbarProvider, 3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(androidTextContextMenuToolbarProvider, (Function1) rememberedValue2, gapComposer);
        return androidTextContextMenuToolbarProvider;
    }
}
