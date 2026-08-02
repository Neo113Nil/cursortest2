package androidx.compose.ui.tooling;

import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda5;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.checks.CheckDepositAmountKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.work.views.timecard.TimecardDetailViewKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class PreviewActivity$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda1(String str, int i, int i2, String str2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ComposableInvoker.invokeComposable(str2, str, gapComposer, new Object[0]);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.CenterVertically, gapComposer2, 54);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
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
                    String str3 = str2.length() > 0 ? str2 : null;
                    String str4 = str3 == null ? str : str3;
                    if (str2.length() == 0) {
                        gapComposer2.startReplaceGroup(2098259500);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors.semantic.text.placeholder;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(2098260817);
                        gapComposer2.startReplaceGroup(1044898235);
                        long j2 = ((Color) gapComposer2.consume(ArcadeThemeKt.LocalTextColor)).value;
                        if (j2 != 16) {
                            j = j2;
                        } else {
                            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                            } else {
                                gapComposer2.startReplaceGroup(-1762997739);
                                gapComposer2.end(false);
                            }
                            j = colors2.semantic.text.standard;
                        }
                        gapComposer2.end(false);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    Updater.CompositionLocalProvider(ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium), Expect_jvmKt.rememberComposableLambda(-607288511, new MarkerKt$$ExternalSyntheticLambda5(23), gapComposer2), gapComposer2, 56);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AfterpayCardKt.AdditionalOverduePaymentLabelRow(str2, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.GreenEligibleTransactionsSectionHeader(str2, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                CheckDepositAmountKt.ArcadeAnnotatedFrontOfCheck(str2, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.FullScreenActivityPickerHeader(str2, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                TimecardDetailViewKt.SummaryRow(str2, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                LinkAccountPickerScreenKt.SelectNewAccountIcon(str2, str, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda1(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }
}
