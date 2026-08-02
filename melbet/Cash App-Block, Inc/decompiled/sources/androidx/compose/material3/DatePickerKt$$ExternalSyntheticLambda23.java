package androidx.compose.material3;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.mooncake.compose_ui.components.PushOnPressScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda23 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda23(MutableInteractionSourceImpl mutableInteractionSourceImpl, long j, String str, TooltipState tooltipState, Badge badge, BadgePlacement badgePlacement, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = mutableInteractionSourceImpl;
        this.f$1 = j;
        this.f$2 = str;
        this.f$3 = tooltipState;
        this.f$4 = badge;
        this.f$5 = badgePlacement;
        this.f$6 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                DatePickerKt.YearPicker((Modifier) obj8, this.f$1, (Function1) obj7, (DatePickerDefaults$AllDates$1) obj6, (CalendarModelImpl) obj5, (IntRange) obj4, (DatePickerColors) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 1:
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj8;
                String str = (String) obj7;
                TooltipState tooltipState = (TooltipState) obj6;
                Badge badge = (Badge) obj5;
                BadgePlacement badgePlacement = (BadgePlacement) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BoxKt.Box(IndicationKt.indication(boxScopeInstance.matchParentSize(), mutableInteractionSourceImpl, com.squareup.cash.arcade.theme.RippleKt.m3400rippleYJYuY3k(this.f$1, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 12)), gapComposer, 0);
                    RuntimeHelpersKt.TooltipBox(null, str, tooltipState, Expect_jvmKt.rememberComposableLambda(1460600447, new LocalViewFactory$$ExternalSyntheticLambda6(29, badge, badgePlacement, composableLambdaImpl), gapComposer), gapComposer, 3072);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                CollapsingToolbarKt.m3476CollapsingHeaderScaffoldMooncake8r3B23s((ComposableLambdaImpl) obj8, (ComposableLambdaImpl) obj7, this.f$1, (Function3) obj6, (NavigationIconType) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(12583351));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj6).m3603GenericTreeElementsSectionV9fs2A((Modifier) obj8, (GenericTreeElementsViewModel) obj5, (RealImageLoader) obj4, (ScrollState) obj3, (Function1) obj7, this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Modifier modifier = (Modifier) obj8;
                Shape shape = (Shape) obj7;
                Function0 function0 = (Function0) obj6;
                PushOnPressScope pushOnPressScope = (PushOnPressScope) obj5;
                Alignment alignment = (Alignment) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m3657decorateCardXOJAsU = KeypadKt.m3657decorateCardXOJAsU(modifier, shape, this.f$1, true);
                    Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                    if (function0 != null) {
                        pushOnPressScope.getClass();
                        modifier2 = PlatformKt.composed(modifier2, new MoneyTabUIKt$$ExternalSyntheticLambda11(13, pushOnPressScope, function0));
                    }
                    Modifier then = m3657decorateCardXOJAsU.then(modifier2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
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
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl2.invoke((Object) boxScopeInstance, (Object) gapComposer2, (Object) 6);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda23(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, long j, Function3 function3, NavigationIconType navigationIconType, Function0 function0, ComposableLambdaImpl composableLambdaImpl3, int i) {
        this.f$0 = composableLambdaImpl;
        this.f$2 = composableLambdaImpl2;
        this.f$1 = j;
        this.f$3 = function3;
        this.f$4 = navigationIconType;
        this.f$5 = function0;
        this.f$6 = composableLambdaImpl3;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda23(Modifier modifier, long j, Function1 function1, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, CalendarModelImpl calendarModelImpl, IntRange intRange, DatePickerColors datePickerColors, int i) {
        this.f$0 = modifier;
        this.f$1 = j;
        this.f$2 = function1;
        this.f$3 = datePickerDefaults$AllDates$1;
        this.f$4 = calendarModelImpl;
        this.f$5 = intRange;
        this.f$6 = datePickerColors;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda23(Modifier modifier, Shape shape, long j, Function0 function0, PushOnPressScope pushOnPressScope, Alignment alignment, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = modifier;
        this.f$2 = shape;
        this.f$1 = j;
        this.f$3 = function0;
        this.f$4 = pushOnPressScope;
        this.f$5 = alignment;
        this.f$6 = composableLambdaImpl;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda23(SquareLoyaltyDetailsView squareLoyaltyDetailsView, Modifier modifier, GenericTreeElementsViewModel genericTreeElementsViewModel, RealImageLoader realImageLoader, ScrollState scrollState, Function1 function1, long j, int i) {
        this.f$3 = squareLoyaltyDetailsView;
        this.f$0 = modifier;
        this.f$4 = genericTreeElementsViewModel;
        this.f$5 = realImageLoader;
        this.f$6 = scrollState;
        this.f$2 = function1;
        this.f$1 = j;
    }
}
