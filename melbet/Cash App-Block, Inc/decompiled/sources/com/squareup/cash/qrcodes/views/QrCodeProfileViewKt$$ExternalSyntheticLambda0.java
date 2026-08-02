package com.squareup.cash.qrcodes.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class QrCodeProfileViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ QrCodeProfileViewModel f$2;

    public /* synthetic */ QrCodeProfileViewKt$$ExternalSyntheticLambda0(Function1 function1, QrCodeProfileViewModel qrCodeProfileViewModel, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$2 = qrCodeProfileViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object[] objArr;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        final QrCodeProfileViewModel qrCodeProfileViewModel = this.f$2;
        Function1 function1 = this.f$1;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ChromeConfigKt.ChromeConfig(null, null, null, Boolean.TRUE, null, null, null, gapComposer, 3072, 119);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(29, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(60571105, new QrCodeProfileViewKt$$ExternalSyntheticLambda3(qrCodeProfileViewModel, function1), gapComposer), gapComposer, 1572918, 44);
                    GapComposer gapComposer2 = gapComposer;
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    boolean z = qrCodeProfileViewModel.showSegmentedControl;
                    boolean z2 = qrCodeProfileViewModel.showUpdatedSharingUi;
                    if (z) {
                        gapComposer2.startReplaceGroup(-34843705);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(!z2 ? 1 : 0, gapComposer2);
                        }
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
                        int intValue2 = parcelableSnapshotMutableIntState.getIntValue();
                        boolean changed2 = gapComposer2.changed(z2);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new CardTransitionKt$$ExternalSyntheticLambda4(5, qrCodeProfileViewModel, function1, parcelableSnapshotMutableIntState);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        Function1 function12 = (Function1) rememberedValue3;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed3 = gapComposer2.changed(z2);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new RealSandboxer$$ExternalSyntheticLambda0(qrCodeProfileViewModel, 1);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        objArr = z2 ? 1 : 0;
                        ModalKt.SegmentedControl(intValue2, function12, fillMaxWidth, (Function1) rememberedValue4, gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        gapComposer2.end(false);
                    } else {
                        objArr = z2 ? 1 : 0;
                        gapComposer2.startReplaceGroup(-33743360);
                        gapComposer2.end(false);
                    }
                    EmptyChatKt.ProfileHeader(Expect_jvmKt.rememberComposableLambda(1089256845, new Function2() { // from class: com.squareup.cash.qrcodes.views.QrCodeProfileViewKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = i2;
                            QrCodeProfileViewModel qrCodeProfileViewModel2 = qrCodeProfileViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        CharSequence charSequence = qrCodeProfileViewModel2.fullName;
                                        String obj5 = charSequence != null ? charSequence.toString() : null;
                                        CameraXPreviewKt.m3729BadgeNameDpqVIHw(obj5 == null ? "" : obj5, qrCodeProfileViewModel2.badge, null, 0, null, gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        String str = qrCodeProfileViewModel2.cashtag;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(576738474, new Function2() { // from class: com.squareup.cash.qrcodes.views.QrCodeProfileViewKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = i3;
                            QrCodeProfileViewModel qrCodeProfileViewModel2 = qrCodeProfileViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        CharSequence charSequence = qrCodeProfileViewModel2.fullName;
                                        String obj5 = charSequence != null ? charSequence.toString() : null;
                                        CameraXPreviewKt.m3729BadgeNameDpqVIHw(obj5 == null ? "" : obj5, qrCodeProfileViewModel2.badge, null, 0, null, gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        String str = qrCodeProfileViewModel2.cashtag;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 3078, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(-1978465811, new QrCodeProfileViewKt$$ExternalSyntheticLambda0(function1, qrCodeProfileViewModel, i3), gapComposer2), gapComposer2, 3072, 6);
                    if (qrCodeProfileViewModel.shareEnabled && objArr == true) {
                        gapComposer2.startReplaceGroup(-31979863);
                        SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f, true));
                        DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1547784182, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(11, function1), gapComposer2), gapComposer2, 24576, 15);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-31588736);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    Strings.getSizes(gapComposer3).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(OffsetKt.aspectRatio(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false), 1.0f);
                    Strings.getSizes(gapComposer3).getClass();
                    Object obj3 = DefaultSizes.border.annotationsMap;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(fillMaxWidth2, 2.0f, Strings.getColors(gapComposer3).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer3).semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Strings.getSizes(gapComposer3).getClass();
                    OffsetKt.BoxWithConstraints(SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f), null, false, Expect_jvmKt.rememberComposableLambda(-1364750633, new QrCodeProfileViewKt$$ExternalSyntheticLambda3(function1, qrCodeProfileViewModel), gapComposer3), gapComposer3, 3072, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
