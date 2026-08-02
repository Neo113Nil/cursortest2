package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda32;
import com.squareup.cash.work.views.shift.LoadingAction;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class OutlinedTextFieldKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(Modifier modifier, boolean z, boolean z2, String str, Function0 function0, int i) {
        this.$r8$classId = 6;
        this.f$2 = modifier;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$3 = str;
        this.f$4 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj5;
                TextFieldColors textFieldColors = (TextFieldColors) obj4;
                Shape shape = (Shape) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextFieldDefaults.INSTANCE.m507BorderBoxnbWgWpA(this.f$0, this.f$1, mutableInteractionSourceImpl, textFieldColors, shape, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer, 12582912);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AfterpayCardKt.CalendarDateItem((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj4, this.f$0, this.f$1, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                CardAppletTileKt.CardWithPill(this.f$0, this.f$1, (CardSchemeViewModel.Module.HeroCardDetails) obj5, (CardAppletTileViewModel.CardPillViewModel) obj4, (StyledCardViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(196609));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ShiftListViewKt.NoteButtonSection(this.f$0, this.f$1, (LoadingAction) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(24577));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.InstitutionResultTile((Modifier) obj5, (FinancialConnectionsInstitution) obj4, this.f$0, this.f$1, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 5:
                SimpleTextFieldController simpleTextFieldController = (SimpleTextFieldController) obj5;
                MutableState mutableState = (MutableState) obj4;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    TextFieldUIKt.TextFieldSection(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1), simpleTextFieldController, ((Boolean) mutableState.getValue()).booleanValue(), Expect_jvmKt.rememberComposableLambda(-763771920, new HeroCardViewKt$$ExternalSyntheticLambda32(focusRequester, this.f$1, simpleTextFieldController, mutableState), gapComposer2), gapComposer2, 24582);
                    if (this.f$0) {
                        gapComposer2.startReplaceGroup(1669587098);
                        ProgressIndicatorKt.m496CircularProgressIndicatorLxG7B9w(SpacerKt.m301paddingqDBjuR0(SizeKt.m285size3ABfNKs(companion, 32.0f), RecyclerView.DECELERATION_RATE, 8.0f, 16.0f, 8.0f), ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).iconTint, 2.0f, 0L, 0, gapComposer2, 390, 24);
                        gapComposer2 = gapComposer2;
                    } else {
                        gapComposer2.startReplaceGroup(1656896969);
                    }
                    gapComposer2.end(false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                SuccessContentKt.SuccessFooter((Modifier) obj5, this.f$0, this.f$1, (String) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(Modifier modifier, Object obj, boolean z, boolean z2, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$3 = obj;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$4 = function;
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(SimpleTextFieldController simpleTextFieldController, boolean z, MutableState mutableState, FocusRequester focusRequester, boolean z2) {
        this.$r8$classId = 5;
        this.f$2 = simpleTextFieldController;
        this.f$0 = z;
        this.f$3 = mutableState;
        this.f$4 = focusRequester;
        this.f$1 = z2;
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, TextFieldColors textFieldColors, Shape shape) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = mutableInteractionSourceImpl;
        this.f$3 = textFieldColors;
        this.f$4 = shape;
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(boolean z, boolean z2, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }
}
