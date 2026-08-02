package com.squareup.cash.investing.components.stock.details;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Content;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.idrnd.misnap.iad.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingAnalystOptionsKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ X509CertChainUtils f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingAnalystOptionsKt$$ExternalSyntheticLambda0(X509CertChainUtils x509CertChainUtils, Function1 function1) {
        this.f$0 = x509CertChainUtils;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.$r8$classId;
        Function1 function1 = this.f$1;
        X509CertChainUtils x509CertChainUtils = this.f$0;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                a.InvestingAnalystOptions(x509CertChainUtils, function1, Modifier.Companion.$$INSTANCE, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.semantic.background.prominent;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    InvestingAnalystOpinionsViewModel$Content investingAnalystOpinionsViewModel$Content = (InvestingAnalystOpinionsViewModel$Content) x509CertChainUtils;
                    String str = investingAnalystOpinionsViewModel$Content.title;
                    List list = investingAnalystOpinionsViewModel$Content.detailLabels;
                    ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1369434451, new LoanDetailsSheetKt$$ExternalSyntheticLambda8(x509CertChainUtils, j, 4), gapComposer), gapComposer, 6);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                    gapComposer.startReplaceGroup(1131289117);
                    int i4 = 0;
                    for (Object obj3 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        String str2 = (String) obj3;
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j2 = colors2.semantic.text.subtle;
                        if (i4 == 0) {
                            i = 5;
                        } else if (i4 == list.size() - 1) {
                            i2 = 6;
                            GapComposer gapComposer2 = gapComposer;
                            Room.m1165Text25TpFw(0, 0, 0, i2, 0, 0, 3824, j2, (Composer) gapComposer2, (Modifier) layoutWeightElement, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            i4 = i5;
                            gapComposer = gapComposer2;
                        } else {
                            i = 3;
                        }
                        i2 = i;
                        GapComposer gapComposer22 = gapComposer;
                        Room.m1165Text25TpFw(0, 0, 0, i2, 0, 0, 3824, j2, (Composer) gapComposer22, (Modifier) layoutWeightElement, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        i4 = i5;
                        gapComposer = gapComposer22;
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, null), vertical, gapComposer, 6);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    GapComposer gapComposer3 = gapComposer;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer3, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier, 1.0f, true), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact, (TextLineBalancing) null, investingAnalystOpinionsViewModel$Content.label, (Map) null, (Function1) null, false);
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15);
                    Icons icons = Icons.InformationFill16;
                    Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, Room.stringResource(gapComposer3, R.string.investing_components_more_info_content_description), m183clickableoSLSa3U$default, colors3.semantic.icon.extraSubtle, gapComposer3, 6, 0);
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ InvestingAnalystOptionsKt$$ExternalSyntheticLambda0(X509CertChainUtils x509CertChainUtils, Function1 function1, int i) {
        this.f$0 = x509CertChainUtils;
        this.f$1 = function1;
    }
}
