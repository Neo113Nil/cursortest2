package com.google.android.instantapps;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.internal.zza;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.behavior.HideLeftViewOnScrollDelegate;
import com.google.android.material.color.MaterialColors;
import com.google.mlkit.vision.text.internal.zzr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genericelements.components.base.GenericProgressMeterKt;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.IconTextDetailViewModel;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.squareup.cash.genericelements.viewmodels.PillTextViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import com.withpersona.sdk2.inquiry.nfc.NfcTrackingEventsHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InstantApps {
    public static Boolean isInstantApp;
    public static Context lastApplicationContext;
    public static zzr packageManagerWrapper;

    public static final void GenericBaseElement(GenericBaseViewModel genericBaseViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Color composeColor;
        genericBaseViewModel.getClass();
        modifier.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(889836731);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(genericBaseViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i4 = (i2 >> 3) & 14;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Color color = null;
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
            com.squareup.protos.cash.genericelements.ui.Alignment alignment = genericBaseViewModel.getAlignment();
            BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
            int ordinal = alignment.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    biasAlignment = Alignment.Companion.CenterEnd;
                } else if (ordinal == 2) {
                    biasAlignment = Alignment.Companion.Center;
                }
            }
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier align = boxScopeInstance.align(companion, biasAlignment);
            if (genericBaseViewModel instanceof GenericBaseViewModel.TextViewModel) {
                gapComposer.startReplaceGroup(2051072433);
                MaterialColors.GenericText((GenericBaseViewModel.TextViewModel) genericBaseViewModel, modifier, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.ButtonViewModel) {
                gapComposer.startReplaceGroup(-841175603);
                EmulatorDeviceUtilsKt.GenericButton((GenericBaseViewModel.ButtonViewModel) genericBaseViewModel, align, function1, gapComposer, i2 & 910);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.IconButtonViewModel) {
                gapComposer.startReplaceGroup(2051078660);
                AnimatorSetCompat.GenericIconButton((GenericBaseViewModel.IconButtonViewModel) genericBaseViewModel, align, function1, gapComposer, i2 & 910);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof IconViewModel.ProgressMeterViewModel) {
                gapComposer.startReplaceGroup(2051082324);
                GenericProgressMeterKt.GenericProgressMeter((IconViewModel.ProgressMeterViewModel) genericBaseViewModel, align, gapComposer, i2 & 14);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof IconViewModel.ImageViewModel) {
                gapComposer.startReplaceGroup(2051085209);
                NfcTrackingEventsHolder.GenericImage((IconViewModel.ImageViewModel) genericBaseViewModel, align, gapComposer, i2 & 14);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.AvatarViewModel) {
                gapComposer.startReplaceGroup(2051087309);
                CameraFeedKt.GenericAvatar((GenericBaseViewModel.AvatarViewModel) genericBaseViewModel, align, gapComposer, i2 & 14);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.BlankDividerBaseViewModel) {
                gapComposer.startReplaceGroup(2051090348);
                re$$ExternalSyntheticOutline0.m(companion, ((GenericBaseViewModel.BlankDividerBaseViewModel) genericBaseViewModel).size.value, gapComposer, false);
            } else if (genericBaseViewModel instanceof IconTextDetailViewModel) {
                gapComposer.startReplaceGroup(2051093301);
                HideLeftViewOnScrollDelegate.GenericIconTextDetail((IconTextDetailViewModel) genericBaseViewModel, align, null, gapComposer, i2 & 14);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof PillTextViewModel) {
                gapComposer.startReplaceGroup(-840506933);
                PillTextViewModel pillTextViewModel = (PillTextViewModel) genericBaseViewModel;
                String str = pillTextViewModel.text;
                int ordinal2 = pillTextViewModel.alignment.ordinal();
                if (ordinal2 == 0) {
                    i3 = 1;
                } else if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        i3 = 3;
                    } else {
                        if (ordinal2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        i3 = 4;
                    }
                }
                com.squareup.protos.cash.ui.Color color2 = pillTextViewModel.textColor;
                if (color2 == null) {
                    gapComposer.startReplaceGroup(-840322980);
                    z3 = false;
                    gapComposer.end(false);
                    composeColor = null;
                } else {
                    z3 = false;
                    gapComposer.startReplaceGroup(2051102789);
                    composeColor = ComposeUtilsKt.toComposeColor(color2, gapComposer);
                    gapComposer.end(false);
                }
                com.squareup.protos.cash.ui.Color color3 = pillTextViewModel.backgroundColor;
                if (color3 == null) {
                    gapComposer.startReplaceGroup(-840254532);
                } else {
                    gapComposer.startReplaceGroup(2051104997);
                    color = ComposeUtilsKt.toComposeColor(color3, gapComposer);
                }
                gapComposer.end(z3);
                KeypadKt.m3647PillMogV5mo(str, align, i3, composeColor, color, gapComposer, MLKEMEngine.KyberPolyBytes);
                gapComposer = gapComposer;
                gapComposer.end(z3);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.BetweenSectionSpacerViewModel) {
                gapComposer.startReplaceGroup(-840168847);
                int ordinal3 = ((GenericBaseViewModel.BetweenSectionSpacerViewModel) genericBaseViewModel).size.ordinal();
                if (ordinal3 == 0) {
                    z2 = false;
                    gapComposer.startReplaceGroup(2051108803);
                    DBUtil.SpacerBetweenSectionLarge(i4, 0, gapComposer, modifier);
                    gapComposer.end(false);
                } else if (ordinal3 == 1) {
                    z2 = false;
                    gapComposer.startReplaceGroup(2051110948);
                    DBUtil.SpacerBetweenSectionXLarge(i4, 0, gapComposer, modifier);
                    gapComposer.end(false);
                } else {
                    if (ordinal3 != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2051107761, false);
                    }
                    gapComposer.startReplaceGroup(2051113517);
                    z2 = false;
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(i4, 0, gapComposer, modifier);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.WithinSectionSpacerViewModel) {
                gapComposer.startReplaceGroup(-839872084);
                int ordinal4 = ((GenericBaseViewModel.WithinSectionSpacerViewModel) genericBaseViewModel).size.ordinal();
                if (ordinal4 == 0) {
                    z = false;
                    gapComposer.startReplaceGroup(2051118466);
                    DBUtil.SpacerWithinSectionSmall(i4, 0, gapComposer, modifier);
                    gapComposer.end(false);
                } else {
                    if (ordinal4 != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2051117334, false);
                    }
                    gapComposer.startReplaceGroup(2051120579);
                    z = false;
                    DBUtil.SpacerWithinSectionMedium(i4, 0, gapComposer, modifier);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.ArcadeTextViewModel) {
                gapComposer.startReplaceGroup(-839681992);
                zza.GenericArcadeText((GenericBaseViewModel.ArcadeTextViewModel) genericBaseViewModel, modifier, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.ArcadeButtonViewModel) {
                gapComposer.startReplaceGroup(2051126566);
                CameraUpdateFactory.GenericArcadeButton(align, (GenericBaseViewModel.ArcadeButtonViewModel) genericBaseViewModel, function1, gapComposer, (i2 & 896) | ((i2 << 3) & 112), 0);
                gapComposer.end(false);
            } else if (genericBaseViewModel instanceof GenericBaseViewModel.CopyCodeViewModel) {
                gapComposer.startReplaceGroup(-839464186);
                GenericBaseViewModel.CopyCodeViewModel copyCodeViewModel = (GenericBaseViewModel.CopyCodeViewModel) genericBaseViewModel;
                CopyCodeKt.CopyCode(copyCodeViewModel.label, copyCodeViewModel.body, copyCodeViewModel.contentDescription, modifier, null, null, gapComposer, (i2 << 6) & 7168, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (!(genericBaseViewModel instanceof GenericBaseViewModel.ArcadeBadgedAvatarViewModel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2051073234, false);
                }
                gapComposer.startReplaceGroup(2051137305);
                ImageToAnalyzeKt.GenericArcadeBadgedAvatar(align, (GenericBaseViewModel.ArcadeBadgedAvatarViewModel) genericBaseViewModel, gapComposer, (i2 << 3) & 112);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(genericBaseViewModel, modifier, function1, i, 24);
        }
    }

    public static final Rect calculateViewfinderRect(ViewfinderInfo viewfinderInfo, ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1) {
        double d;
        viewfinderInfo.getClass();
        imageToAnalyzeKt$toImageToAnalyze$1.getClass();
        int i = imageToAnalyzeKt$toImageToAnalyze$1.rotationDegrees;
        Rect rect = viewfinderInfo.viewport;
        Rect rect2 = viewfinderInfo.region;
        int width = rect.width();
        int height = rect.height();
        if (width == 0 || height == 0) {
            return null;
        }
        int i2 = imageToAnalyzeKt$toImageToAnalyze$1.height;
        int i3 = imageToAnalyzeKt$toImageToAnalyze$1.width;
        if (i != 90 && i != 270) {
            i2 = i3;
            i3 = i2;
        }
        double d2 = i2;
        double d3 = width;
        double d4 = d2 / d3;
        double d5 = i3;
        double d6 = height;
        double d7 = d5 / d6;
        double min = Math.min(d4, d7);
        double d8 = 0.0d;
        if (d4 > d7) {
            d = 0.0d;
            d8 = (d2 - (d3 * min)) / 2.0d;
        } else {
            d = (d5 - (d6 * min)) / 2.0d;
        }
        double d9 = ((rect2.left - rect.left) * min) + d8;
        double d10 = ((rect2.top - rect.top) * min) + d;
        double width2 = rect2.width() * min;
        double height2 = rect2.height() * min;
        return (i == 90 || i == 270) ? new Rect((int) d10, (int) d9, (int) (d10 + height2), (int) (d9 + width2)) : new Rect((int) d9, (int) d10, (int) (d9 + width2), (int) (d10 + height2));
    }

    public static boolean isInstantApp(Context context) {
        if (context == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Context must be non-null");
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Application context is null!");
            return false;
        }
        if (isInstantApp != null && applicationContext.equals(lastApplicationContext)) {
            return isInstantApp.booleanValue();
        }
        Boolean bool = null;
        isInstantApp = null;
        if (packageManagerWrapper == null || !applicationContext.equals(lastApplicationContext)) {
            packageManagerWrapper = new zzr(applicationContext.getPackageManager(), 1);
        }
        zzr zzrVar = packageManagerWrapper;
        zzrVar.getClass();
        if (zzr.isInstantAppMethod == null) {
            try {
                zzr.isInstantAppMethod = PackageManager.class.getDeclaredMethod("isInstantApp", null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        bool = (Boolean) zzr.isInstantAppMethod.invoke((PackageManager) zzrVar.zza, null);
        lastApplicationContext = applicationContext;
        if (bool != null) {
            isInstantApp = bool;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                isInstantApp = Boolean.TRUE;
            } catch (ClassNotFoundException unused2) {
                isInstantApp = Boolean.FALSE;
            }
        }
        return isInstantApp.booleanValue();
    }
}
