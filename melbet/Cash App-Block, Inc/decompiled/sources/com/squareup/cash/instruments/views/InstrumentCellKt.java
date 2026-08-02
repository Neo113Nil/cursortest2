package com.squareup.cash.instruments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class InstrumentCellKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[InstrumentCellViewModel.InstrumentLabel.Color.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InstrumentIcon.IconShape.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InstrumentIcon.IconShape iconShape = InstrumentIcon.IconShape.CIRCLE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[AvatarSize.values().length];
            try {
                iArr3[AvatarSize.Size64.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[AvatarSize.Size48.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[AvatarSize.Size32.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[InstrumentIcon.LocalIcon.IconTint.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                InstrumentIcon.LocalIcon.IconTint iconTint = InstrumentIcon.LocalIcon.IconTint.SUBTLE;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                InstrumentIcon.LocalIcon.IconTint iconTint2 = InstrumentIcon.LocalIcon.IconTint.SUBTLE;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[InstrumentIcon.LocalIcon.IconBackground.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                InstrumentIcon.LocalIcon.IconBackground iconBackground = InstrumentIcon.LocalIcon.IconBackground.BRAND;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                InstrumentIcon.LocalIcon.IconBackground iconBackground2 = InstrumentIcon.LocalIcon.IconBackground.BRAND;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                InstrumentIcon.LocalIcon.IconBackground iconBackground3 = InstrumentIcon.LocalIcon.IconBackground.BRAND;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[CashInstrumentType.values().length];
            try {
                iArr6[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[CashInstrumentType.CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    static {
        CashInstrumentType cashInstrumentType = CashInstrumentType.DEBIT_CARD;
        InstrumentType.Companion companion = InstrumentType.INSTANCE;
        cashInstrumentType.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void CardArtImages(Modifier modifier, List list, AvatarSize avatarSize, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Iterator it;
        float f;
        Modifier modifier2;
        float f2;
        Modifier.Companion companion;
        Modifier modifier3;
        boolean z;
        Color color;
        long j;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2043690573);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(avatarSize.ordinal()) ? 256 : 128;
        }
        boolean z2 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = avatarSize.ordinal();
            CardArtDimensions cardArtDimensions = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? new CardArtDimensions(48, 30, 3) : new CardArtDimensions(64, 43, 4) : new CardArtDimensions(48, 30, 3) : new CardArtDimensions(32, 20, 2);
            int i3 = cardArtDimensions.width;
            int i4 = (-i3) / 3;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion2, i3);
            float f3 = cardArtDimensions.height;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(m290width3ABfNKs, f3);
            float f4 = cardArtDimensions.cornerRadius;
            Modifier clip = ClipKt.clip(m277height3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f4));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(i4, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(297725983);
            Iterator it2 = list.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (it2.hasNext()) {
                InstrumentIcon instrumentIcon = (InstrumentIcon) it2.next();
                if (instrumentIcon instanceof InstrumentIcon.RemoteIcon) {
                    gapComposer3.startReplaceGroup(-1182843456);
                    float f5 = f4;
                    Modifier modifier4 = m277height3ABfNKs;
                    it = it2;
                    CardArtImageKt.m3576CardArtImageAFY4PWA(modifier4, instrumentIcon, f5, null, null, null, false, gapComposer3, 0, 120);
                    modifier2 = modifier4;
                    f = f5;
                    gapComposer3.end(z2);
                    f2 = f3;
                    companion = companion2;
                    z = z2;
                    modifier3 = clip;
                } else {
                    it = it2;
                    f = f4;
                    modifier2 = m277height3ABfNKs;
                    Modifier.Companion companion3 = companion2;
                    float f6 = f3;
                    if (instrumentIcon instanceof InstrumentIcon.LocalBrand) {
                        gapComposer3.startReplaceGroup(-1182639507);
                        Modifier modifier5 = clip;
                        ImageKt.Image(Countries.painterResource(themedDrawable((InstrumentIcon.LocalBrand) instrumentIcon, gapComposer3), z2, gapComposer3), null, modifier5, null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer3, Painter.$stable | 24624, 104);
                        gapComposer3.end(z2);
                        f2 = f6;
                        companion = companion3;
                        modifier3 = modifier5;
                        z = z2;
                    } else {
                        Modifier modifier6 = clip;
                        boolean z3 = instrumentIcon instanceof InstrumentIcon.Savings;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                        if (z3) {
                            gapComposer3.startReplaceGroup(-1182383881);
                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z2);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(z2);
                            }
                            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier6, colors.semantic.background.standard, rectangleShapeKt$RectangleShape$1);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                            Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion3, f6), f6);
                            InstrumentIcon.Savings savings = (InstrumentIcon.Savings) instrumentIcon;
                            Composer composer2 = gapComposer3;
                            f2 = f6;
                            modifier3 = modifier6;
                            companion = companion3;
                            z = z2;
                            VisibleKt.m3496ProgressEmojiIconLzaahlw(savings.iconId, savings.progress, m277height3ABfNKs2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, composer2, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                            gapComposer3 = composer2;
                            gapComposer3.end(true);
                            gapComposer3.end(z);
                        } else {
                            f2 = f6;
                            companion = companion3;
                            modifier3 = modifier6;
                            z = z2;
                            if (!(instrumentIcon instanceof InstrumentIcon.LocalIcon)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1562176990, z);
                            }
                            gapComposer3.startReplaceGroup(-1181951989);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                            Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(z);
                            }
                            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(modifier3, colors2.semantic.background.standard, rectangleShapeKt$RectangleShape$1);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z);
                            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU2);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                            InstrumentIcon.LocalIcon localIcon = (InstrumentIcon.LocalIcon) instrumentIcon;
                            Icons icons = localIcon.icon;
                            InstrumentIcon.LocalIcon.IconTint iconTint = localIcon.color;
                            if (iconTint == null) {
                                gapComposer3.startReplaceGroup(335585859);
                                gapComposer3.end(z);
                                color = null;
                            } else {
                                gapComposer3.startReplaceGroup(-266269314);
                                color = toColor(iconTint, gapComposer3);
                                gapComposer3.end(z);
                            }
                            if (color == null) {
                                gapComposer3.startReplaceGroup(-266267845);
                                Colors colors3 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                if (colors3 == null) {
                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(z);
                                }
                                j = colors3.semantic.icon.subtle;
                                gapComposer3.end(z);
                            } else {
                                gapComposer3.startReplaceGroup(-266269643);
                                gapComposer3.end(z);
                                j = color.value;
                            }
                            GapComposer gapComposer4 = gapComposer3;
                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer4, 48, 4);
                            gapComposer3 = gapComposer4;
                            gapComposer3.end(true);
                            gapComposer3.end(z);
                        }
                    }
                }
                it2 = it;
                clip = modifier3;
                z2 = z;
                m277height3ABfNKs = modifier2;
                f4 = f;
                companion2 = companion;
                f3 = f2;
                gapComposer3 = gapComposer3;
            }
            gapComposer3.end(z2);
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda12(modifier, list, avatarSize, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CircleAvatars(Modifier modifier, List list, AvatarSize avatarSize, Composer composer, int i) {
        long j;
        Color color;
        long j2;
        AvatarImage avatarImage;
        long j3;
        Color color2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(551359572);
        int i2 = (i & 6) == 0 ? (gapComposer.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(avatarSize.ordinal()) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(1575580545);
            List<InstrumentIcon> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (InstrumentIcon instrumentIcon : list2) {
                boolean z = instrumentIcon instanceof InstrumentIcon.RemoteIcon;
                if (z || (instrumentIcon instanceof InstrumentIcon.LocalBrand)) {
                    gapComposer.startReplaceGroup(-2049115091);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.background.f1047app;
                    gapComposer.end(false);
                } else if (instrumentIcon instanceof InstrumentIcon.Savings) {
                    gapComposer.startReplaceGroup(-2049112755);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.background.f1047app;
                    gapComposer.end(false);
                } else {
                    if (!(instrumentIcon instanceof InstrumentIcon.LocalIcon)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2049118783, false);
                    }
                    gapComposer.startReplaceGroup(902070767);
                    InstrumentIcon.LocalIcon.IconBackground iconBackground = ((InstrumentIcon.LocalIcon) instrumentIcon).background;
                    if (iconBackground == null) {
                        gapComposer.startReplaceGroup(902094574);
                        gapComposer.end(false);
                        color2 = null;
                    } else {
                        gapComposer.startReplaceGroup(-2049110157);
                        gapComposer.startReplaceGroup(2143123182);
                        int ordinal = iconBackground.ordinal();
                        if (ordinal == 0) {
                            gapComposer.startReplaceGroup(-616177715);
                            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j3 = colors3.semantic.background.brand;
                            gapComposer.end(false);
                        } else if (ordinal == 1) {
                            gapComposer.startReplaceGroup(-616175123);
                            Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors4 == null) {
                                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j3 = colors4.semantic.icon.brand;
                            gapComposer.end(false);
                        } else if (ordinal == 2) {
                            gapComposer.startReplaceGroup(-616172370);
                            Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors5 == null) {
                                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j3 = colors5.semantic.background.subtle;
                            gapComposer.end(false);
                        } else {
                            if (ordinal != 3) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -616180289, false);
                            }
                            gapComposer.startReplaceGroup(-616167957);
                            Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors6 == null) {
                                colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j3 = colors6.semantic.background.f1047app;
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                        color2 = new Color(j3);
                        gapComposer.end(false);
                    }
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(-2049107856);
                        Colors colors7 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors7 == null) {
                            colors7 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors7.semantic.background.subtle;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2049110925);
                        gapComposer.end(false);
                        j = color2.value;
                    }
                    gapComposer.end(false);
                }
                long j4 = j;
                if (z) {
                    gapComposer.startReplaceGroup(-2049103266);
                    gapComposer.end(false);
                    avatarImage = new AvatarImage.Remote.Image(((InstrumentIcon.RemoteIcon) instrumentIcon).iconUrl, false, null, 0L, new InstrumentCellKt$$ExternalSyntheticLambda11(0), 62);
                } else if (instrumentIcon instanceof InstrumentIcon.LocalBrand) {
                    gapComposer.startReplaceGroup(902508735);
                    AvatarImage localResource = new AvatarImage.LocalResource(themedDrawable((InstrumentIcon.LocalBrand) instrumentIcon, gapComposer));
                    gapComposer.end(false);
                    avatarImage = localResource;
                } else if (instrumentIcon instanceof InstrumentIcon.Savings) {
                    gapComposer.startReplaceGroup(-2049088927);
                    Icons icons = Icons.SavingsGoal24;
                    Colors colors8 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    AvatarImage localIcon = new AvatarImage.LocalIcon(icons, colors8.semantic.icon.subtle, 4);
                    gapComposer.end(false);
                    avatarImage = localIcon;
                } else {
                    if (!(instrumentIcon instanceof InstrumentIcon.LocalIcon)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2049104852, false);
                    }
                    gapComposer.startReplaceGroup(-2049081990);
                    InstrumentIcon.LocalIcon localIcon2 = (InstrumentIcon.LocalIcon) instrumentIcon;
                    Icons icons2 = localIcon2.icon;
                    InstrumentIcon.LocalIcon.IconTint iconTint = localIcon2.color;
                    if (iconTint == null) {
                        gapComposer.startReplaceGroup(903095502);
                        gapComposer.end(false);
                        color = null;
                    } else {
                        gapComposer.startReplaceGroup(-2049077869);
                        color = toColor(iconTint, gapComposer);
                        gapComposer.end(false);
                    }
                    if (color == null) {
                        gapComposer.startReplaceGroup(-2049076400);
                        Colors colors9 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors9 == null) {
                            colors9 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j2 = colors9.semantic.icon.subtle;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2049078508);
                        gapComposer.end(false);
                        j2 = color.value;
                    }
                    AvatarImage localIcon3 = new AvatarImage.LocalIcon(icons2, j2, 4);
                    gapComposer.end(false);
                    avatarImage = localIcon3;
                    Icons badge = instrumentIcon.getBadge();
                    arrayList.add(new AvatarEntry("", j4, null, avatarImage, null, badge == null ? new AvatarOverlay.LocalIcon(14, 0L, 0L, badge) : null, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                }
                Icons badge2 = instrumentIcon.getBadge();
                arrayList.add(new AvatarEntry("", j4, null, avatarImage, null, badge2 == null ? new AvatarOverlay.LocalIcon(14, 0L, 0L, badge2) : null, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
            }
            gapComposer.end(false);
            zzabw.HorizontalStackedAvatars(avatarSize, Tags.toPersistentList(arrayList), modifier, gapComposer, ((i2 >> 6) & 14) | ((i2 << 6) & 896), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda12(modifier, list, avatarSize, i, 0);
        }
    }

    public static final void InstrumentAvatar(Modifier modifier, List list, AvatarSize avatarSize, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        InstrumentIcon.IconShape iconShape;
        list.getClass();
        avatarSize.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1341948382);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(avatarSize.ordinal()) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            modifier2 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            InstrumentIcon instrumentIcon = (InstrumentIcon) CollectionsKt.firstOrNull(list);
            if (instrumentIcon == null || (iconShape = instrumentIcon.getShape()) == null) {
                iconShape = InstrumentIcon.IconShape.CIRCLE;
            }
            if (CollectionsKt.firstOrNull(list) instanceof InstrumentIcon.Savings) {
                gapComposer.startReplaceGroup(-428417269);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof InstrumentIcon.Savings) {
                        arrayList.add(obj);
                    }
                }
                SavingsAvatars(modifier2, arrayList, avatarSize, gapComposer, i3 & 910);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-428318596);
                int ordinal = iconShape.ordinal();
                if (ordinal == 0) {
                    gapComposer.startReplaceGroup(-1122194192);
                    CircleAvatars(modifier2, list, avatarSize, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    gapComposer.end(false);
                } else {
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1122195386, false);
                    }
                    gapComposer.startReplaceGroup(-1122191920);
                    CardArtImages(modifier2, list, avatarSize, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(modifier2, list, avatarSize, i, i2, 0);
        }
    }

    public static final void InstrumentCellSmall(Modifier modifier, InstrumentCellViewModel instrumentCellViewModel, InstrumentCellAlignment instrumentCellAlignment, TextStyle textStyle, Function0 function0, Composer composer, int i, int i2) {
        TextStyle textStyle2;
        InstrumentCellViewModel instrumentCellViewModel2;
        Modifier modifier2;
        InstrumentCellAlignment instrumentCellAlignment2;
        int i3;
        Modifier modifier3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        TextStyle textStyle3;
        Arrangement$End$1 arrangement$End$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Modifier.Companion companion;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        float f;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        BiasAlignment.Vertical vertical;
        boolean z2;
        RowScopeInstance rowScopeInstance;
        int i4;
        instrumentCellViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(346263717);
        Applier applier = gapComposer.applier;
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= gapComposer.changedInstance(instrumentCellViewModel) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(instrumentCellAlignment == null ? -1 : instrumentCellAlignment.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                textStyle2 = textStyle;
                if (gapComposer.changed(textStyle2)) {
                    i4 = 2048;
                    i5 |= i4;
                }
            } else {
                textStyle2 = textStyle;
            }
            i4 = 1024;
            i5 |= i4;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & 24576) == 0) {
            i5 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            gapComposer.startDefaults();
            int i7 = i & 1;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (i7 == 0 || gapComposer.getDefaultsInvalid()) {
                instrumentCellAlignment2 = i6 != 0 ? InstrumentCellAlignment.LEFT : instrumentCellAlignment;
                if ((i2 & 8) != 0) {
                    textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    i5 &= -7169;
                }
                i3 = i5;
                modifier3 = companion2;
            } else {
                gapComposer.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
                instrumentCellAlignment2 = instrumentCellAlignment;
                i3 = i5;
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            gapComposer.startReplaceGroup(2046969595);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(TestTagKt.testTag(modifier3, "instrument-cell-small"), Strings.getColors(gapComposer).component.cell.background.f171default, ColorKt.RectangleShape), 56.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ActivityItemLayout$$ExternalSyntheticLambda4(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, true, (Function1) rememberedValue), 1.0f);
            if (function0 != null) {
                String stringResource = Room.stringResource(gapComposer, R.string.instrument_selector_on_click_instrument_accessibility_label);
                boolean z3 = (i3 & 57344) == 16384;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda10(20, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                fillMaxWidth = fillMaxWidth.then(ImageKt.m183clickableoSLSa3U$default(companion2, false, stringResource, null, (Function0) rememberedValue2, 13));
            }
            gapComposer.end(false);
            BiasAlignment.Vertical vertical2 = Alignment.Companion.CenterVertically;
            Arrangement$End$1 arrangement$End$12 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$12, vertical2, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
            String str = instrumentCellViewModel.prefix;
            if (str == null) {
                gapComposer.startReplaceGroup(1581725843);
                gapComposer.end(false);
                vertical = vertical2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                modifier2 = modifier3;
                textStyle3 = textStyle2;
                z2 = false;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                arrangement$End$1 = arrangement$End$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                z = true;
                f = 1.0f;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
            } else {
                gapComposer.startReplaceGroup(1581725844);
                Strings.getSizes(gapComposer).getClass();
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                textStyle3 = textStyle2;
                arrangement$End$1 = arrangement$End$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                companion = companion2;
                z = true;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                f = 1.0f;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                modifier2 = modifier3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                vertical = vertical2;
                z2 = false;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance2.weight(f, companion, z);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(instrumentCellAlignment2 == InstrumentCellAlignment.RIGHT ? SpacerKt.End : arrangement$End$1, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, weight);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$13);
            instrumentCellViewModel2 = instrumentCellViewModel;
            if (instrumentCellViewModel2.icons.isEmpty()) {
                rowScopeInstance = rowScopeInstance2;
                gapComposer.startReplaceGroup(733629477);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(733430550);
                Strings.getSizes(gapComposer).getClass();
                GapComposer gapComposer2 = gapComposer;
                rowScopeInstance = rowScopeInstance2;
                InstrumentAvatar(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), instrumentCellViewModel2.icons, AvatarSize.Size32, gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
                gapComposer = gapComposer2;
                gapComposer.end(z2);
            }
            int i8 = (i3 >> 3) & 896;
            GapComposer gapComposer3 = gapComposer;
            TextStyle textStyle4 = textStyle3;
            Room.m1165Text25TpFw(5, 1, 0, 0, i8 | 1769472, 0, 3992, 0L, (Composer) gapComposer3, rowScopeInstance.weight(f, companion, instrumentCellAlignment2 == InstrumentCellAlignment.LEFT ? z : z2), textStyle4, (TextLineBalancing) null, instrumentCellViewModel2.primaryLabel, (Map) null, (Function1) null, false);
            gapComposer = gapComposer3;
            String str2 = instrumentCellViewModel2.suffixLabel;
            if (str2 == null) {
                gapComposer.startReplaceGroup(733940809);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(733940810);
                Strings.getSizes(gapComposer).getClass();
                Room.m1165Text25TpFw(0, 1, 0, 0, i8 | 1572864, 0, 4016, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), textStyle4, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(z2);
            }
            gapComposer.end(z);
            InstrumentCellViewModel.Accessory accessory = instrumentCellViewModel2.accessory;
            if (Intrinsics.areEqual(accessory, InstrumentCellViewModel.Accessory.Push.INSTANCE)) {
                gapComposer.startReplaceGroup(-226027889);
                Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(z2);
            } else if (Intrinsics.areEqual(accessory, InstrumentCellViewModel.Accessory.Expand.INSTANCE)) {
                gapComposer.startReplaceGroup(-226025871);
                Trace.m1191Iconww6aTOc(Icons.Expand24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(z2);
            } else if (Intrinsics.areEqual(accessory, InstrumentCellViewModel.Accessory.Info.INSTANCE)) {
                gapComposer.startReplaceGroup(1583206838);
                Strings.getSizes(gapComposer).getClass();
                Trace.m1191Iconww6aTOc(Icons.InformationOutline16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 0L, gapComposer, 54, 8);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(1583386111);
                gapComposer.end(z2);
            }
            gapComposer.end(z);
            textStyle2 = textStyle4;
        } else {
            instrumentCellViewModel2 = instrumentCellViewModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            instrumentCellAlignment2 = instrumentCellAlignment;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier2, (Object) instrumentCellViewModel2, (Object) instrumentCellAlignment2, (Object) textStyle2, (Object) function0, i, i2, 18);
        }
    }

    /* renamed from: InstrumentRow-jM_yU8I, reason: not valid java name */
    public static final void m3578InstrumentRowjM_yU8I(Modifier modifier, InstrumentCellViewModel instrumentCellViewModel, AvatarSize avatarSize, boolean z, Color color, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Color color2;
        int i5;
        GapComposer gapComposer;
        Modifier modifier3;
        boolean z3;
        Color color3;
        AvatarSize avatarSize2;
        CellDefaultAccessory cellDefaultAccessory;
        instrumentCellViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1366536145);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i3 | (gapComposer2.changedInstance(instrumentCellViewModel) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i7 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i7 |= gapComposer2.changed(avatarSize == null ? -1 : avatarSize.ordinal()) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i4 = i7 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i7 | (gapComposer2.changed(z2) ? 2048 : 1024);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i4 | 24576;
            color2 = color;
        } else {
            color2 = color;
            i5 = i4 | (gapComposer2.changed(color2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i11 = i5 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i11 & 1, (74899 & i11) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i6 != 0) {
                modifier2 = companion;
            }
            AvatarSize avatarSize3 = i8 != 0 ? AvatarSize.Size48 : avatarSize;
            boolean z4 = i9 != 0 ? false : z2;
            CellDefaultAccessory cellDefaultAccessory2 = null;
            Color color4 = i10 != 0 ? null : color2;
            gapComposer2.startReplaceGroup(-1018747318);
            Modifier testTag = TestTagKt.testTag(modifier2, "instrument-cell");
            String str = instrumentCellViewModel.accessibilityLabel;
            if (str != null) {
                boolean changed = gapComposer2.changed(str);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 28);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                testTag = testTag.then(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue));
            }
            Modifier modifier4 = testTag;
            gapComposer2.end(false);
            boolean z5 = instrumentCellViewModel.enabled;
            InstrumentCellViewModel.Accessory accessory = instrumentCellViewModel.accessory;
            if (Intrinsics.areEqual(accessory, InstrumentCellViewModel.Accessory.Radio.INSTANCE)) {
                gapComposer2.startReplaceGroup(-1018706944);
                gapComposer2.end(false);
                cellDefaultAccessory2 = new CellDefaultAccessory.Radio(z4);
            } else if (Intrinsics.areEqual(accessory, InstrumentCellViewModel.Accessory.Push.INSTANCE)) {
                gapComposer2.startReplaceGroup(-1018705910);
                gapComposer2.end(false);
                cellDefaultAccessory2 = CellDefaultAccessory.Push.INSTANCE;
            } else if (accessory instanceof InstrumentCellViewModel.Accessory.Button) {
                gapComposer2.startReplaceGroup(-1018703714);
                CellDefaultAccessory buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(-1843601133, new FormView$$ExternalSyntheticLambda0(accessory, 10), gapComposer2), 15);
                gapComposer2.end(false);
                cellDefaultAccessory = buttonCompact;
                gapComposer = gapComposer2;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(797580659, new SkipPaymentView$$ExternalSyntheticLambda1(6, instrumentCellViewModel, avatarSize3), gapComposer2), Expect_jvmKt.rememberComposableLambda(-471089420, new ArcadeModal$$ExternalSyntheticLambda5(instrumentCellViewModel, 29), gapComposer2), modifier4, function0, null, z5, true, Expect_jvmKt.rememberComposableLambda(506824698, new SkipPaymentView$$ExternalSyntheticLambda1(7, instrumentCellViewModel, color4), gapComposer2), null, cellDefaultAccessory, 0L, null, gapComposer, ((i11 >> 6) & 7168) | 14155830, 0, 3344);
                Modifier modifier5 = modifier2;
                avatarSize2 = avatarSize3;
                modifier3 = modifier5;
                z3 = z4;
                color3 = color4;
            } else {
                gapComposer2.startReplaceGroup(-1514983828);
                gapComposer2.end(false);
            }
            cellDefaultAccessory = cellDefaultAccessory2;
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(797580659, new SkipPaymentView$$ExternalSyntheticLambda1(6, instrumentCellViewModel, avatarSize3), gapComposer2), Expect_jvmKt.rememberComposableLambda(-471089420, new ArcadeModal$$ExternalSyntheticLambda5(instrumentCellViewModel, 29), gapComposer2), modifier4, function0, null, z5, true, Expect_jvmKt.rememberComposableLambda(506824698, new SkipPaymentView$$ExternalSyntheticLambda1(7, instrumentCellViewModel, color4), gapComposer2), null, cellDefaultAccessory, 0L, null, gapComposer, ((i11 >> 6) & 7168) | 14155830, 0, 3344);
            Modifier modifier52 = modifier2;
            avatarSize2 = avatarSize3;
            modifier3 = modifier52;
            z3 = z4;
            color3 = color4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            z3 = z2;
            color3 = color2;
            avatarSize2 = avatarSize;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier3, instrumentCellViewModel, avatarSize2, z3, color3, function0, i, i2);
        }
    }

    public static final void SavingsAvatars(Modifier modifier, ArrayList arrayList, AvatarSize avatarSize, Composer composer, int i) {
        ArrayList<InstrumentIcon.Savings> arrayList2;
        AvatarSize avatarSize2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(199436065);
        Applier applier = gapComposer2.applier;
        int i2 = (i & 6) == 0 ? (gapComposer2.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            arrayList2 = arrayList;
            i2 |= gapComposer2.changedInstance(arrayList2) ? 32 : 16;
        } else {
            arrayList2 = arrayList;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(avatarSize.ordinal()) ? 256 : 128;
        }
        boolean z = false;
        boolean z2 = true;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            avatarSize2 = avatarSize;
            float f = avatarSize2.size;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned((-f) / 3.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(1448477574);
            for (InstrumentIcon.Savings savings : arrayList2) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f), RoundedCornerShapeKt.CircleShape);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(z);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                boolean z3 = z2;
                GapComposer gapComposer3 = gapComposer2;
                VisibleKt.m3496ProgressEmojiIconLzaahlw(savings.iconId, savings.progress, SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer3, MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer3.end(z3);
                f = f;
                z2 = z3;
                gapComposer2 = gapComposer3;
                z = false;
            }
            gapComposer = gapComposer2;
            gapComposer.end(z);
            gapComposer.end(z2);
        } else {
            avatarSize2 = avatarSize;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier, arrayList, avatarSize2, i, 3);
        }
    }

    public static final int themedDrawable(InstrumentIcon.LocalBrand localBrand, Composer composer) {
        int i = localBrand.lightResId;
        int i2 = localBrand.darkResId;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        Boolean valueOf = colors != null ? Boolean.valueOf(colors.isLight) : null;
        if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
            gapComposer.startReplaceGroup(955489306);
            gapComposer.end(false);
            return i2;
        }
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            gapComposer.startReplaceGroup(955490011);
            gapComposer.end(false);
            return i;
        }
        gapComposer.startReplaceGroup(-444555061);
        if (ImageKt.isSystemInDarkTheme(gapComposer)) {
            i = i2;
        }
        gapComposer.end(false);
        return i;
    }

    public static final InstrumentCellViewModel toCell(SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument, GapComposer gapComposer) {
        InstrumentIcon.LocalIcon localIcon;
        paymentInstrument.getClass();
        boolean z = paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance;
        InstrumentCellViewModel.Accessory.Radio radio = InstrumentCellViewModel.Accessory.Radio.INSTANCE;
        if (!z) {
            boolean z2 = true;
            if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) {
                gapComposer.startReplaceGroup(762431073);
                SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument existingInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument;
                String str = existingInstrument.name;
                String str2 = existingInstrument.details;
                if (!existingInstrument.enabled || existingInstrument.amountExceededMessage != null) {
                    z2 = false;
                }
                Instrument instrument = existingInstrument.instrument;
                instrument.getClass();
                String str3 = instrument.iconUrl;
                InstrumentCellViewModel instrumentCellViewModel = new InstrumentCellViewModel(str, str2, z2, CollectionsKt__CollectionsJVMKt.listOf(str3 != null ? new InstrumentIcon.RemoteIcon(str3, (InstrumentIcon.IconShape) null, 6) : instrument.cashInstrumentType == CashInstrumentType.GOOGLE_PAY ? new InstrumentIcon.LocalBrand(R.drawable.google_pay, R.drawable.google_pay, null, null, 12) : InstrumentAvatarUtilsKt.toInstrumentIcon(instrument.cardBrand)), radio, null, null, null, null, 480);
                gapComposer.end(false);
                return instrumentCellViewModel;
            }
            if (!(paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 762420483, false);
            }
            gapComposer.startReplaceGroup(762439854);
            SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument newInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) paymentInstrument;
            CashInstrumentType cashInstrumentType = newInstrument.f1148type;
            int i = cashInstrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$5[cashInstrumentType.ordinal()];
            String stringResource = Room.stringResource(gapComposer, i != 1 ? i != 2 ? i != 3 ? R.string.instruments_link_new_card : R.string.instruments_link_bank : R.string.instruments_link_credit_card : R.string.instruments_link_debit_card);
            String str4 = newInstrument.details;
            if (str4 == null) {
                str4 = "";
            }
            InstrumentCellViewModel instrumentCellViewModel2 = new InstrumentCellViewModel(stringResource, str4, newInstrument.enabled && newInstrument.amountExceededMessage == null, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.LocalIcon(Icons.Add24, InstrumentIcon.LocalIcon.IconTint.SUBTLE, InstrumentIcon.LocalIcon.IconBackground.SUBTLE, null, null, 24)), null, null, null, null, null, 480);
            gapComposer.end(false);
            return instrumentCellViewModel2;
        }
        gapComposer.startReplaceGroup(762421283);
        int i2 = -1;
        SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance existingCashBalance = (SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument;
        String str5 = existingCashBalance.name;
        boolean z3 = true;
        String str6 = existingCashBalance.details;
        if (!existingCashBalance.enabled || existingCashBalance.amountExceededMessage != null) {
            z3 = false;
        }
        CurrencyCode currencyCode = existingCashBalance.balance.balance.currency_code;
        if (currencyCode != null) {
            i2 = InstrumentAvatarUtilsKt.WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()];
        }
        switch (i2) {
            case -1:
            case 1:
            case 2:
            case 3:
                localIcon = new InstrumentIcon.LocalIcon(Icons.CurrencyUsd24, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                break;
            case 0:
            default:
                Timber.Forest.e("Not supported currency " + currencyCode + " for instrument icon", new Object[0], new IllegalStateException("Not supported currency"));
                localIcon = new InstrumentIcon.LocalIcon(Icons.CurrencyUsd24, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                break;
            case 4:
                localIcon = new InstrumentIcon.LocalIcon(Icons.CurrencyBtc24, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BITCOIN, null, null, 24);
                break;
            case 5:
                localIcon = new InstrumentIcon.LocalIcon(Icons.CurrencyGbp24, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                break;
            case 6:
                localIcon = new InstrumentIcon.LocalIcon(Icons.CurrencyEur24, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                break;
        }
        InstrumentCellViewModel instrumentCellViewModel3 = new InstrumentCellViewModel(str5, str6, z3, CollectionsKt__CollectionsJVMKt.listOf(localIcon), radio, null, null, null, null, 480);
        gapComposer.end(false);
        return instrumentCellViewModel3;
    }

    public static final Color toColor(InstrumentIcon.LocalIcon.IconTint iconTint, Composer composer) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        if (iconTint == null) {
            gapComposer.startReplaceGroup(-860708547);
            gapComposer.end(false);
            return null;
        }
        gapComposer.startReplaceGroup(-860708546);
        int ordinal = iconTint.ordinal();
        if (ordinal == 0) {
            gapComposer.startReplaceGroup(1848505736);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors.semantic.icon.subtle;
            gapComposer.end(false);
        } else if (ordinal == 1) {
            gapComposer.startReplaceGroup(1848508169);
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors2.semantic.icon.inverse;
            gapComposer.end(false);
        } else {
            if (ordinal != 2) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1848503356, false);
            }
            gapComposer.startReplaceGroup(1848510666);
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors3.semantic.icon.standard;
            gapComposer.end(false);
        }
        return Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j);
    }
}
