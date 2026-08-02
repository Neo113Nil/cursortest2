package com.squareup.cash.profile.devicemanager.views;

import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda47;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceViewModel;
import com.squareup.cash.profile.views.ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.features.common.ListItemKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class DeviceManagerListViewKt {

    /* renamed from: lambda$-724835155, reason: not valid java name */
    public static final ComposableLambdaImpl f582lambda$724835155 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(15), false, -724835155);
    public static final ComposableLambdaImpl lambda$68369613 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(16), false, 68369613);
    public static final ComposableLambdaImpl lambda$1918326906 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(17), false, 1918326906);
    public static final ComposableLambdaImpl lambda$1700539183 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(18), false, 1700539183);
    public static final ComposableLambdaImpl lambda$1782415465 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(19), false, 1782415465);

    /* renamed from: lambda$-848800731, reason: not valid java name */
    public static final ComposableLambdaImpl f583lambda$848800731 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(20), false, -848800731);
    public static final ComposableLambdaImpl lambda$2012278529 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(21), false, 2012278529);
    public static final ComposableLambdaImpl lambda$1076051874 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(8), false, 1076051874);
    public static final ComposableLambdaImpl lambda$1951658004 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(22), false, 1951658004);

    /* renamed from: lambda$-395444859, reason: not valid java name */
    public static final ComposableLambdaImpl f581lambda$395444859 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(9), false, -395444859);
    public static final ComposableLambdaImpl lambda$1685271335 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(23), false, 1685271335);
    public static final ComposableLambdaImpl lambda$2058889470 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(10), false, 2058889470);
    public static final ComposableLambdaImpl lambda$1076069360 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(24), false, 1076069360);
    public static final ComposableLambdaImpl lambda$821332313 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(25), false, 821332313);
    public static final ComposableLambdaImpl lambda$956843130 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(11), false, 956843130);

    /* renamed from: lambda$-1468153828, reason: not valid java name */
    public static final ComposableLambdaImpl f580lambda$1468153828 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(26), false, -1468153828);

    /* renamed from: lambda$-1192175341, reason: not valid java name */
    public static final ComposableLambdaImpl f579lambda$1192175341 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(27), false, -1192175341);
    public static final ComposableLambdaImpl lambda$344324478 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(7), false, 344324478);
    public static final ComposableLambdaImpl lambda$544737060 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(8), false, 544737060);
    public static final ComposableLambdaImpl lambda$308119235 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(9), false, 308119235);
    public static final ComposableLambdaImpl lambda$832469673 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(10), false, 832469673);
    public static final ComposableLambdaImpl lambda$595851848 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(11), false, 595851848);

    public static final void ConfirmRemoveDevicesContent(DeviceManagerConfirmRemoveDevicesScreen deviceManagerConfirmRemoveDevicesScreen, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1196570745);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerConfirmRemoveDevicesScreen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(724346012, new ErrorView$$ExternalSyntheticLambda0(deviceManagerConfirmRemoveDevicesScreen, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(deviceManagerConfirmRemoveDevicesScreen, function1, modifier2, i, 7);
        }
    }

    public static final void DeviceDetailsView(DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel, Function1 function1, Composer composer, int i) {
        deviceManagerDeviceDetailViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-591174250);
        int i2 = (gapComposer.changedInstance(deviceManagerDeviceDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        byte b = 0;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(825351979, new DeviceManagerDeviceDetailsView$$ExternalSyntheticLambda0(deviceManagerDeviceDetailViewModel, function1, i3, b), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceManagerDeviceDetailsView$$ExternalSyntheticLambda0(deviceManagerDeviceDetailViewModel, function1, i);
        }
    }

    public static final void DeviceItemView(Modifier modifier, final DeviceViewModel deviceViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1262798922);
        int i2 = i | 6 | (gapComposer.changedInstance(deviceViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-554590308, new Function2() { // from class: com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    long j;
                    int i4 = r2;
                    DeviceViewModel deviceViewModel2 = deviceViewModel;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                switch (deviceViewModel2.f1188type.ordinal()) {
                                    case 0:
                                    case 7:
                                        icons = Icons.International24;
                                        break;
                                    case 1:
                                    case 2:
                                    case 5:
                                    case 6:
                                        icons = Icons.DeviceMobile24;
                                        break;
                                    case 3:
                                    case 4:
                                        icons = Icons.DeviceDesktop24;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceViewModel2.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                gapComposer4.startReplaceGroup(1495217442);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                String str = deviceViewModel2.location;
                                DeviceViewModel.LastActive lastActive = deviceViewModel2.lastActive;
                                builder.append(str);
                                if (lastActive.shouldHighlight) {
                                    gapComposer4.startReplaceGroup(1307994768);
                                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    j = colors.semantic.text.success;
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(1307996815);
                                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    j = colors2.semantic.text.subtle;
                                    gapComposer4.end(false);
                                }
                                int pushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                                try {
                                    builder.append(lastActive.activeTime);
                                    builder.pop(pushStyle);
                                    AnnotatedString annotatedString = builder.toAnnotatedString();
                                    gapComposer4.end(false);
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } catch (Throwable th) {
                                    builder.pop(pushStyle);
                                    throw th;
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-300200901, new Function2() { // from class: com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    long j;
                    int i4 = i3;
                    DeviceViewModel deviceViewModel2 = deviceViewModel;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                switch (deviceViewModel2.f1188type.ordinal()) {
                                    case 0:
                                    case 7:
                                        icons = Icons.International24;
                                        break;
                                    case 1:
                                    case 2:
                                    case 5:
                                    case 6:
                                        icons = Icons.DeviceMobile24;
                                        break;
                                    case 3:
                                    case 4:
                                        icons = Icons.DeviceDesktop24;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceViewModel2.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                gapComposer4.startReplaceGroup(1495217442);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                String str = deviceViewModel2.location;
                                DeviceViewModel.LastActive lastActive = deviceViewModel2.lastActive;
                                builder.append(str);
                                if (lastActive.shouldHighlight) {
                                    gapComposer4.startReplaceGroup(1307994768);
                                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    j = colors.semantic.text.success;
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(1307996815);
                                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    j = colors2.semantic.text.subtle;
                                    gapComposer4.end(false);
                                }
                                int pushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                                try {
                                    builder.append(lastActive.activeTime);
                                    builder.pop(pushStyle);
                                    AnnotatedString annotatedString = builder.toAnnotatedString();
                                    gapComposer4.end(false);
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } catch (Throwable th) {
                                    builder.pop(pushStyle);
                                    throw th;
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            int i4 = (gapComposer.changedInstance(deviceViewModel) ? 1 : 0) | ((i2 & 896) == 256 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(15, function1, deviceViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            final int i5 = 2;
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1226135541, new Function2() { // from class: com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    long j;
                    int i42 = i5;
                    DeviceViewModel deviceViewModel2 = deviceViewModel;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                switch (deviceViewModel2.f1188type.ordinal()) {
                                    case 0:
                                    case 7:
                                        icons = Icons.International24;
                                        break;
                                    case 1:
                                    case 2:
                                    case 5:
                                    case 6:
                                        icons = Icons.DeviceMobile24;
                                        break;
                                    case 3:
                                    case 4:
                                        icons = Icons.DeviceDesktop24;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceViewModel2.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                gapComposer4.startReplaceGroup(1495217442);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                String str = deviceViewModel2.location;
                                DeviceViewModel.LastActive lastActive = deviceViewModel2.lastActive;
                                builder.append(str);
                                if (lastActive.shouldHighlight) {
                                    gapComposer4.startReplaceGroup(1307994768);
                                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    j = colors.semantic.text.success;
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(1307996815);
                                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    j = colors2.semantic.text.subtle;
                                    gapComposer4.end(false);
                                }
                                int pushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                                try {
                                    builder.append(lastActive.activeTime);
                                    builder.pop(pushStyle);
                                    AnnotatedString annotatedString = builder.toAnnotatedString();
                                    gapComposer4.end(false);
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } catch (Throwable th) {
                                    builder.pop(pushStyle);
                                    throw th;
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, companion, function0, false, false, rememberComposableLambda3, null, push, 0L, gapComposer, 817889718, 3440);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(modifier2, deviceViewModel, function1, i, 15);
        }
    }

    public static final void DeviceManagerList(DeviceManagerListViewModel deviceManagerListViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1309902305);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1820651498, new DeviceManagerListViewKt$$ExternalSyntheticLambda3(function1, deviceManagerListViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceManagerListViewKt$$ExternalSyntheticLambda2(deviceManagerListViewModel, function1, i, 1);
        }
    }

    public static final void DeviceManagerListContent(DeviceManagerListViewModel deviceManagerListViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        deviceManagerListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(769053514);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            DeviceManagerList(deviceManagerListViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ErrorViewKt$$ExternalSyntheticLambda4(5, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceManagerListViewKt$$ExternalSyntheticLambda2(deviceManagerListViewModel, function1, i, 0);
        }
    }

    public static final void DeviceManagerRemovedSuccessFullScreen(DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(771932108);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerRemovedSuccessViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2132957855, new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda4(function1, deviceManagerRemovedSuccessViewModel, i4), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(deviceManagerRemovedSuccessViewModel, function1, modifier2, i, 9);
        }
    }

    public static final void DeviceManagerRemovedSuccessFullScreenContent(DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        deviceManagerRemovedSuccessViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(201312010);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerRemovedSuccessViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DeviceManagerRemovedSuccessFullScreen(deviceManagerRemovedSuccessViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda1(deviceManagerRemovedSuccessViewModel, function1, i, 1);
        }
    }

    public static final void DeviceManagerRemovedSuccessHalfSheet(DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(529303384);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerRemovedSuccessViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-305630419, new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda4(function1, deviceManagerRemovedSuccessViewModel, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda1(deviceManagerRemovedSuccessViewModel, function1, i, 2);
        }
    }

    public static final void DeviceManagerRemovedSuccessHalfSheetContent(DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(112277114);
        int i4 = 2;
        int i5 = i | (gapComposer.changedInstance(deviceManagerRemovedSuccessViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i6 != 0 ? companion : modifier2;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(modifier4, 1.0f), ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp * 0.6f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceEvenly, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.device_removal_success_title), (Modifier) null, f581lambda$395444859, deviceManagerRemovedSuccessViewModel.message, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.border.subtle;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            DeviceManagerRemovedSuccessViewModel.SecurityOption securityOption = deviceManagerRemovedSuccessViewModel.securityOption;
            ModalKt.InlineMessage(m178borderxT4_qwU, securityOption.title, securityOption.description, Expect_jvmKt.rememberComposableLambda(870087782, new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda9(function1, deviceManagerRemovedSuccessViewModel, i4), gapComposer), (Function3) null, (Function3) null, gapComposer, 3072, 48);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-167828990, new PdfPreviewViewKt$$ExternalSyntheticLambda4(22, function1), gapComposer), gapComposer, 24582, 14);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) deviceManagerRemovedSuccessViewModel, function1, modifier3, i, i2, 10);
        }
    }

    public static final void DeviceManagerRemovedSuccessHalfSheetScreen(DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        deviceManagerRemovedSuccessViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(845457124);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceManagerRemovedSuccessViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DeviceManagerRemovedSuccessHalfSheet(deviceManagerRemovedSuccessViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda1(deviceManagerRemovedSuccessViewModel, function1, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void DeviceMap(DeviceManagerDeviceDetailViewModel.Loaded loaded, Composer composer, int i) {
        int i2;
        ?? r0;
        Unit unit;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1332411437);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = loaded.locationUrl;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp / 2);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier clip = ClipKt.clip(SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            if (str == null) {
                gapComposer.startReplaceGroup(218943717);
                gapComposer.end(false);
                unit = null;
                r0 = 0;
            } else {
                gapComposer.startReplaceGroup(218943718);
                r0 = 0;
                zzmn.m2026FoundationRemoteImageNXws8ko(new PoolDetailsViewKt$$ExternalSyntheticLambda47(28), str, clip, null, ContentScale.Companion.FillBounds, Recorder$$ExternalSyntheticOutline2.m(Room.stringResource(gapComposer, R.string.device_details_map), ", ", loaded.locationDescription), null, null, null, null, Expect_jvmKt.rememberComposableLambda(1385306766, new ListItemKt$$ExternalSyntheticLambda2(clip, i3), gapComposer), Expect_jvmKt.rememberComposableLambda(-148938771, new ScoreHomeKt$$ExternalSyntheticLambda4(clip, 10), gapComposer), gapComposer, 24576, 54, 968);
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-547111296);
                DeviceMapNoLocation(clip, gapComposer, r0);
            } else {
                gapComposer.startReplaceGroup(-547126982);
            }
            gapComposer.end(r0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(loaded, i, 2);
        }
    }

    public static final void DeviceMapError(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(887111801);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(22, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = modifier;
            ImagePlaceholder(ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, (Function0) rememberedValue, 15), Room.stringResource(gapComposer, R.string.device_manager_reload_map), Icons.Refresh24, gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier2, function0, i, 12);
        }
    }

    public static final void DeviceMapNoLocation(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1897398191);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda6(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ImagePlaceholder(SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue), Room.stringResource(gapComposer, R.string.device_manager_location_unknown), Icons.AlertOutline24, gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 9);
        }
    }

    public static final void DeviceMapPlaceholder(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-919370782);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ImagePlaceholder(modifier, "", null, gapComposer, (i2 & 14) | 432);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 8);
        }
    }

    public static final void DeviceRemovalFailedFullScreenContent(DeviceRemovalFailedViewModel deviceRemovalFailedViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        deviceRemovalFailedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1931083311);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceRemovalFailedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DeviceRemovalFailedFullView(deviceRemovalFailedViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceRemovalFailedViewKt$$ExternalSyntheticLambda1(deviceRemovalFailedViewModel, function1, i, 0);
        }
    }

    public static final void DeviceRemovalFailedFullView(DeviceRemovalFailedViewModel deviceRemovalFailedViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(553290152);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceRemovalFailedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2031435907, new DeviceRemovalFailedViewKt$$ExternalSyntheticLambda4(function1, deviceRemovalFailedViewModel, i4), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(deviceRemovalFailedViewModel, function1, modifier2, i, 10);
        }
    }

    public static final void DeviceRemovalFailedHalfSheet(DeviceRemovalFailedViewModel deviceRemovalFailedViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1584188129);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceRemovalFailedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-317911052, new DeviceRemovalFailedViewKt$$ExternalSyntheticLambda4(function1, deviceRemovalFailedViewModel, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceRemovalFailedViewKt$$ExternalSyntheticLambda1(deviceRemovalFailedViewModel, function1, i, 2);
        }
    }

    public static final void DeviceRemovalFailedHalfSheetContent(DeviceRemovalFailedViewModel deviceRemovalFailedViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1182190703);
        int i4 = i | (gapComposer.changedInstance(deviceRemovalFailedViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (gapComposer.changed(modifier) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            float f = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m299paddingVpY3zN4(modifier3, 8.0f, 16.0f), f * 0.6f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Transformations.SheetHeader(deviceRemovalFailedViewModel.title, (Modifier) null, lambda$956843130, deviceRemovalFailedViewModel.description, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1161089015, new PdfPreviewViewKt$$ExternalSyntheticLambda4(23, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) deviceRemovalFailedViewModel, function1, modifier2, i, i2, 11);
        }
    }

    public static final void DeviceRemovalFailedHalfSheetScreen(DeviceRemovalFailedViewModel deviceRemovalFailedViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        deviceRemovalFailedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1527624555);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deviceRemovalFailedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DeviceRemovalFailedHalfSheet(deviceRemovalFailedViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DeviceRemovalFailedViewKt$$ExternalSyntheticLambda1(deviceRemovalFailedViewModel, function1, i, 1);
        }
    }

    public static final void ImagePlaceholder(Modifier modifier, String str, Icons icons, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-259671440);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2);
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.standard, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (icons == null) {
                gapComposer.startReplaceGroup(-1068666128);
            } else {
                gapComposer.startReplaceGroup(-1068666127);
                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
            }
            gapComposer.end(false);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(i, 8, modifier, str, icons);
        }
    }
}
