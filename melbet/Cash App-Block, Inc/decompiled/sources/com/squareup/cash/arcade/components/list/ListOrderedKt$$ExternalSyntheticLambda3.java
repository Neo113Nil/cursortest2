package com.squareup.cash.arcade.components.list;

import androidx.biometric.KeyguardUtils;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.R;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class ListOrderedKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda3(int i, int i2, Function1 function1, Modifier modifier, int i3) {
        this.$r8$classId = 5;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$1 = function1;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.$r8$classId;
        int i2 = this.f$3;
        int i3 = this.f$2;
        Modifier modifier = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ListOrderedKt.ListOrderedStandard(Updater.updateChangedFlags(i3 | 1), i2, (Composer) obj, modifier, function1);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ListOrderedKt.ListOrderedSubtle(Updater.updateChangedFlags(i3 | 1), i2, (Composer) obj, modifier, function1);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                BenefitsLeafletViewKt.ErrorContent(Updater.updateChangedFlags(i3 | 1), i2, (Composer) obj, modifier, function1);
                return Unit.INSTANCE;
            case 3:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(modifier, zzagn.rememberNestedScrollInteropConnection(gapComposer), null);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, nestedScroll);
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
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m300paddingVpY3zN4$default(new LayoutWeightElement(1.0f, true), 16.0f, RecyclerView.DECELERATION_RATE, 2), ImageKt.rememberScrollState(gapComposer), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    ImageKt.Image(Countries.painterResource(R.drawable.grant_sheet_info_graphic, 0, gapComposer), null, SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 300.0f), 150.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
                    gapComposer.startReplaceGroup(-1383279588);
                    String stringResource = Room.stringResource(gapComposer, R.string.in_transaction_top_up_info_sheet_title);
                    gapComposer.end(false);
                    KeypadKt.m3651TextPdH14aY(0, 0, this.f$2, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getTypography(gapComposer).header4, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 24.0f));
                    gapComposer.startReplaceGroup(-1383268261);
                    String stringResource2 = Room.stringResource(gapComposer, R.string.in_transaction_top_up_info_sheet_body);
                    gapComposer.end(false);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    TextStyle textStyle = MooncakeTheme.getTypography(gapComposer).smallBody;
                    long j = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        str = stringResource2;
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(14, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        str = stringResource2;
                    }
                    KeyguardUtils.m14MarkdownTextnvClB8o(str, (Function2) rememberedValue, fillMaxWidth, textStyle, j, null, null, 0, this.f$3, null, 0, gapComposer, MLKEMEngine.KyberPolyBytes, 1760);
                    re$$ExternalSyntheticOutline0.m(companion, 48.0f, gapComposer, true);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    gapComposer.startReplaceGroup(1789340451);
                    gapComposer.end(false);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(companion, 60.0f, gapComposer, companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    String m = re$$ExternalSyntheticOutline0.m(gapComposer, -1743382436, R.string.in_transaction_top_up_info_sheet_dismiss_button, gapComposer, false);
                    MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda4(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    KeypadKt.m3640ButtonGFipHI0(m, (Function0) rememberedValue2, m300paddingVpY3zN4$default, null, null, style, null, false, 0, null, null, gapComposer, 196992, 0, 4056);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 20.0f));
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                WebSectionKt.SearchVisibilitySection(Updater.updateChangedFlags(i3 | 1), i2, (Composer) obj, modifier, function1);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                UtilsKt.PagerDots(this.f$2, this.f$3, this.f$1, this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda3(Modifier modifier, int i, Function1 function1, int i2, TextStyle textStyle) {
        this.$r8$classId = 3;
        this.f$0 = modifier;
        this.f$2 = i;
        this.f$1 = function1;
        this.f$3 = i2;
    }

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda3(Modifier modifier, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = function1;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda3(Function1 function1, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = function1;
        this.f$0 = modifier;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
