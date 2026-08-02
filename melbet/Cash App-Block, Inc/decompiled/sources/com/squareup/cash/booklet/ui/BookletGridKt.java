package com.squareup.cash.booklet.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.ReferralCodeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda14;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BookletGridKt {

    /* renamed from: lambda$-1436969450, reason: not valid java name */
    public static final ComposableLambdaImpl f316lambda$1436969450;

    /* renamed from: lambda$-471221710, reason: not valid java name */
    public static final ComposableLambdaImpl f318lambda$471221710;

    /* renamed from: lambda$-1987640807, reason: not valid java name */
    public static final ComposableLambdaImpl f317lambda$1987640807 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(27), false, -1987640807);
    public static final ComposableLambdaImpl lambda$886873452 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(1), false, 886873452);

    static {
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(2), false, -911103828);
        f318lambda$471221710 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(3), false, -471221710);
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(4), false, -1750534798);
        f316lambda$1436969450 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(5), false, -1436969450);
        new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(6), false, -279104810);
    }

    public static final void BookletGrid(Modifier modifier, String str, Function0 function0, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function0 function02;
        int i4;
        Function0 function03;
        Modifier wrapContentHeight;
        Modifier.Companion companion;
        Function0 function04;
        Modifier modifier3;
        Modifier m182clickableO2vRcR0$default;
        Modifier wrapContentHeight2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2008510041);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i6 = i3 | (gapComposer.changed(str) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | MLKEMEngine.KyberPolyBytes;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i6 | (gapComposer.changedInstance(function02) ? 256 : 128);
        }
        int i8 = i4 | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        int i9 = 0;
        if (gapComposer.shouldExecute(i8 & 1, (i8 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (i5 != 0) {
                modifier2 = companion2;
            }
            if (i7 != 0) {
                function02 = null;
            }
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxSize(modifier2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            if (function02 == null) {
                gapComposer.startReplaceGroup(1962014884);
                gapComposer.end(false);
                function04 = function02;
                modifier3 = wrapContentHeight;
                companion = companion2;
                m182clickableO2vRcR0$default = null;
            } else {
                gapComposer.startReplaceGroup(1962014885);
                Modifier clip = ClipKt.clip(companion2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                companion = companion2;
                function04 = function02;
                modifier3 = wrapContentHeight;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                boolean changed = gapComposer.changed(function04);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda10(7, function04);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28);
                gapComposer.end(false);
            }
            if (m182clickableO2vRcR0$default == null) {
                m182clickableO2vRcR0$default = companion;
            }
            Modifier then = modifier3.then(m182clickableO2vRcR0$default);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(32.0f, then, colors.semantic.background.subtle, 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, (i8 >> 3) & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            wrapContentHeight2 = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            OffsetKt.FlowRow(wrapContentHeight2, arrangement$SpacedAligned, new Arrangement$SpacedAligned(32.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 2, 0, Expect_jvmKt.rememberComposableLambda(1245489410, new BookletGridKt$$ExternalSyntheticLambda1(i9, function1), gapComposer), gapComposer, 1597446, 40);
            gapComposer = gapComposer;
            gapComposer.end(true);
            function03 = function04;
        } else {
            gapComposer.skipToGroupEnd();
            function03 = function02;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(modifier2, str, function03, function1, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: BookletTile-eHTjO5g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3424BookletTileeHTjO5g(Modifier modifier, String str, String str2, Image image, float f, Function0 function0, Function2 function2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        Function0 function02;
        int i5;
        int i6;
        Function2 function22;
        int i7;
        Function2 function23;
        Modifier modifier3;
        float f3;
        Function0 function03;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        boolean z;
        Function2 function24;
        Modifier wrapContentHeight;
        Modifier modifier4;
        AsyncImagePainter asyncImagePainter;
        Modifier m182clickableO2vRcR0$default;
        GapComposer gapComposer2;
        Object obj;
        str.getClass();
        str2.getClass();
        image.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-4528881);
        Applier applier = gapComposer3.applier;
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer3.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(str2) ? 256 : 128;
        }
        int i9 = i3 | (gapComposer3.changedInstance(image) ? 2048 : 1024);
        int i10 = i2 & 32;
        if (i10 != 0) {
            i9 |= 196608;
        } else if ((196608 & i) == 0) {
            f2 = f;
            i9 |= gapComposer3.changed(f2) ? PKIFailureInfo.unsupportedVersion : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i5 = i9 | 1572864;
                function02 = function0;
            } else {
                function02 = function0;
                i5 = i9 | (gapComposer3.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            }
            i6 = i2 & 128;
            if (i6 == 0) {
                i7 = i5 | 12582912;
                function22 = function2;
            } else {
                function22 = function2;
                i7 = i5 | (gapComposer3.changedInstance(function22) ? 8388608 : 4194304);
            }
            if (gapComposer3.shouldExecute(i7 & 1, (i7 & 4793491) == 4793490)) {
                gapComposer3.skipToGroupEnd();
                function23 = function22;
                modifier3 = modifier2;
                f3 = f2;
                function03 = function02;
                gapComposer = gapComposer3;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i8 != 0) {
                    modifier2 = companion;
                }
                float f4 = i10 != 0 ? 160.0f : f2;
                if (i4 != 0) {
                    function02 = null;
                }
                if (i6 != 0) {
                    function22 = null;
                }
                UriHandler uriHandler = (UriHandler) gapComposer3.consume(CompositionLocalsKt.LocalUriHandler);
                Object obj2 = Composer.Companion.Empty;
                if (function22 == null) {
                    gapComposer3.startReplaceGroup(-1775506770);
                    boolean changedInstance = gapComposer3.changedInstance(uriHandler);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue == obj2) {
                        z = false;
                        Object bookletTileKt$$ExternalSyntheticLambda0 = new BookletTileKt$$ExternalSyntheticLambda0(uriHandler, 0);
                        gapComposer3.updateRememberedValue(bookletTileKt$$ExternalSyntheticLambda0);
                        obj = bookletTileKt$$ExternalSyntheticLambda0;
                    } else {
                        z = false;
                        obj = rememberedValue;
                    }
                    gapComposer3.end(z);
                    function24 = (Function2) obj;
                } else {
                    z = false;
                    gapComposer3.startReplaceGroup(-57274846);
                    gapComposer3.end(false);
                    function24 = function22;
                }
                boolean changed = gapComposer3.changed(image);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                Object obj3 = rememberedValue2;
                if (changed || rememberedValue2 == obj2) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(BookletImageState.Success);
                    gapComposer3.updateRememberedValue(mutableStateOf$default);
                    obj3 = mutableStateOf$default;
                }
                MutableState mutableState = (MutableState) obj3;
                boolean z2 = z;
                String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer3);
                boolean changed2 = gapComposer3.changed(mutableState);
                Function2 function25 = function22;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                Object obj4 = rememberedValue3;
                if (changed2 || rememberedValue3 == obj2) {
                    Object cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(11, mutableState);
                    gapComposer3.updateRememberedValue(cashCardKt$$ExternalSyntheticLambda0);
                    obj4 = cashCardKt$$ExternalSyntheticLambda0;
                }
                Function1 function1 = (Function1) obj4;
                boolean changed3 = gapComposer3.changed(mutableState);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                Object obj5 = rememberedValue4;
                if (changed3 || rememberedValue4 == obj2) {
                    Object cashCardKt$$ExternalSyntheticLambda02 = new CashCardKt$$ExternalSyntheticLambda0(12, mutableState);
                    gapComposer3.updateRememberedValue(cashCardKt$$ExternalSyntheticLambda02);
                    obj5 = cashCardKt$$ExternalSyntheticLambda02;
                }
                Function1 function12 = (Function1) obj5;
                boolean changed4 = gapComposer3.changed(mutableState);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                Object obj6 = rememberedValue5;
                if (changed4 || rememberedValue5 == obj2) {
                    Object cashCardKt$$ExternalSyntheticLambda03 = new CashCardKt$$ExternalSyntheticLambda0(13, mutableState);
                    gapComposer3.updateRememberedValue(cashCardKt$$ExternalSyntheticLambda03);
                    obj6 = cashCardKt$$ExternalSyntheticLambda03;
                }
                Function0 function04 = function02;
                int i11 = i7;
                AsyncImagePainter m1450rememberAsyncImagePainterMqRF_0 = AsyncImageKt.m1450rememberAsyncImagePainterMqRF_0(urlForTheme, function1, function12, (Function1) obj6, gapComposer3, 0, 398);
                wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxSize(modifier2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                if (function04 == null) {
                    gapComposer3.startReplaceGroup(-1774978500);
                    gapComposer3.end(z2);
                    asyncImagePainter = m1450rememberAsyncImagePainterMqRF_0;
                    modifier4 = wrapContentHeight;
                    m182clickableO2vRcR0$default = null;
                    gapComposer2 = gapComposer3;
                } else {
                    gapComposer3.startReplaceGroup(-1774978499);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj7 = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    Object obj8 = rememberedValue6;
                    if (rememberedValue6 == obj2) {
                        obj8 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj8;
                    modifier4 = wrapContentHeight;
                    asyncImagePainter = m1450rememberAsyncImagePainterMqRF_0;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer3, 48, 13);
                    GapComposer gapComposer4 = gapComposer3;
                    boolean changed5 = gapComposer4.changed(function04);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    Object obj9 = rememberedValue7;
                    if (changed5 || rememberedValue7 == obj2) {
                        Object composeDialogKt$$ExternalSyntheticLambda10 = new ComposeDialogKt$$ExternalSyntheticLambda10(8, function04);
                        gapComposer4.updateRememberedValue(composeDialogKt$$ExternalSyntheticLambda10);
                        obj9 = composeDialogKt$$ExternalSyntheticLambda10;
                    }
                    m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) obj9, 28);
                    gapComposer4.end(z2);
                    gapComposer2 = gapComposer4;
                }
                if (m182clickableO2vRcR0$default == null) {
                    m182clickableO2vRcR0$default = companion;
                }
                Modifier then = modifier4.then(m182clickableO2vRcR0$default);
                long j = Strings.getColors(gapComposer2).semantic.background.subtle;
                Strings.getSizes(gapComposer2).getClass();
                Object obj10 = DefaultSizes.border.entries;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(then, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 8.0f);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, z2 ? 1 : 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Strings.getSizes(gapComposer2).getClass();
                Modifier modifier5 = modifier2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer2).semantic.background.prominent, ColorKt.RectangleShape), f4), 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                BookletImageState bookletImageState = (BookletImageState) mutableState.getValue();
                Object rememberedValue8 = gapComposer2.rememberedValue();
                Object obj11 = rememberedValue8;
                if (rememberedValue8 == obj2) {
                    Object rewardQueries$$ExternalSyntheticLambda4 = new RewardQueries$$ExternalSyntheticLambda4(4);
                    gapComposer2.updateRememberedValue(rewardQueries$$ExternalSyntheticLambda4);
                    obj11 = rewardQueries$$ExternalSyntheticLambda4;
                }
                GapComposer gapComposer5 = gapComposer2;
                AnimatedContentKt.AnimatedContent(bookletImageState, null, (Function1) obj11, null, null, null, Expect_jvmKt.rememberComposableLambda(-482837264, new BookletTileKt$$ExternalSyntheticLambda6(asyncImagePainter, 0), gapComposer2), gapComposer5, 1573248, 58);
                gapComposer5.end(true);
                Strings.getSizes(gapComposer5).getClass();
                Strings.getSizes(gapComposer5).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 32.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, m299paddingVpY3zN4);
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Room.m1165Text25TpFw(0, 0, 0, 0, (i11 >> 3) & 14, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, Strings.getTypography(gapComposer5).headlineSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, function24, null, Strings.getTypography(gapComposer5).bodyMedium, 0L, null, null, null, 0, 0, 0, gapComposer5, (i11 >> 6) & 14, 2036);
                GapComposer gapComposer6 = gapComposer5;
                gapComposer6.end(true);
                gapComposer6.end(true);
                function23 = function25;
                function03 = function04;
                f3 = f4;
                modifier3 = modifier5;
                gapComposer = gapComposer6;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BookletTileKt$$ExternalSyntheticLambda7(modifier3, str, str2, image, f3, function03, function23, i, i2, 0);
                return;
            }
            return;
        }
        f2 = f;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if (gapComposer3.shouldExecute(i7 & 1, (i7 & 4793491) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
