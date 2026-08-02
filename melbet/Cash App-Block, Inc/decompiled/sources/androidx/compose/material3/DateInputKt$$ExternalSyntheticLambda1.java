package androidx.compose.material3;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.DialogProperties;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.views.brand.checkout.CheckoutFulfillmentSectionKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.common.zzj;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$Content$nestedScrollConnection$1$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.views.BirthdayViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.cdf.check.CheckDepositReceiveError;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.checks.VerifyCheckDepositViewModel;
import com.squareup.cash.checks.screens.CheckCaptureAnswer;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.cash.checks.screens.CheckFace;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.checks.screens.VerifyCheckDialogScreen;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.composer.Subject;
import com.squareup.cash.pools.views.PoolContributeNoteKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.scrubbing.DateScrubber;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.scrubbing.PersistentMaskVisualTransformation;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$Origin;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchBounds;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchIcon;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cropview.Edge;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import net.idrnd.face.iad.capture.internal.s2;
import okhttp3.internal.Tags;
import okio.ByteString;

/* loaded from: classes3.dex */
public final /* synthetic */ class DateInputKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(LazyListState lazyListState, Async async, Async async2, String str, Function1 function1, Function2 function2, Function0 function0, Function0 function02, int i) {
        this.$r8$classId = 16;
        this.f$0 = lazyListState;
        this.f$2 = async;
        this.f$3 = async2;
        this.f$4 = str;
        this.f$1 = function1;
        this.f$5 = function2;
        this.f$6 = function0;
        this.f$7 = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        TextFieldState m382rememberTextFieldStateLepunE;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        LazyListState lazyListState;
        int i;
        CheckDepositReceiveError.Step step;
        String str;
        boolean z;
        int i2;
        CardTheme cardTheme;
        GapComposer gapComposer;
        Modifier.Companion companion;
        Modifier modifier;
        final Function0 function0;
        MutableState mutableState;
        MutableState mutableState2;
        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails;
        int i3 = this.$r8$classId;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Object obj3 = Composer.Companion.Empty;
        int i4 = 0;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$5;
        Object obj7 = this.f$1;
        Object obj8 = this.f$4;
        Object obj9 = this.f$3;
        Object obj10 = this.f$2;
        Object obj11 = this.f$0;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                DateInputKt.DateInputContent((Long) obj11, (Function1) obj7, (CalendarModelImpl) obj10, (IntRange) obj9, (DatePickerFormatterImpl) obj8, (DatePickerDefaults$AllDates$1) obj6, (DatePickerColors) obj5, (FocusRequester) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                DatePickerDialog_androidKt.m524DatePickerDialogGmEhDVc((Function0) obj11, (ComposableLambdaImpl) obj7, (Modifier) obj10, (Function2) obj9, (Shape) obj8, (DatePickerColors) obj5, (DialogProperties) obj6, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(100666423));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                CheckoutFulfillmentSectionKt.CheckoutFulfillmentSection((Modifier) obj11, (LocalBrandLocationCartViewModel.Fulfillment) obj10, (List) obj9, (Function0) obj8, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function1) obj7, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                AfterpaySearchViewKt$Content$nestedScrollConnection$1$1 afterpaySearchViewKt$Content$nestedScrollConnection$1$1 = (AfterpaySearchViewKt$Content$nestedScrollConnection$1$1) obj11;
                AfterpaySearchViewModel afterpaySearchViewModel = (AfterpaySearchViewModel) obj10;
                Function1 function1 = (Function1) obj7;
                LazyListState lazyListState2 = (LazyListState) obj9;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj8;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = (ParcelableSnapshotMutableIntState) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(NestedScrollModifierKt.nestedScroll(companion3, afterpaySearchViewKt$Content$nestedScrollConnection$1$1, null), 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    Function0 function02 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function02);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion3);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function02);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion3, Strings.getColors(gapComposer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == obj3) {
                        parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda14(9, parcelableSnapshotMutableIntState);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    } else {
                        parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                    }
                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(m177backgroundbw27NRU, (Function1) rememberedValue);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, onGloballyPositioned);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function02);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    InputFieldText inputFieldText = afterpaySearchViewModel.query;
                    if (inputFieldText instanceof TextFieldStateInputFieldText) {
                        gapComposer2.startReplaceGroup(-2069513021);
                        gapComposer2.end(false);
                        m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) inputFieldText).textFieldState;
                    } else {
                        gapComposer2.startReplaceGroup(258249933);
                        gapComposer2.startMovableGroup(-2069511778, inputFieldText);
                        m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(inputFieldText.getValue().toString(), 0L, gapComposer2, 0, 2);
                        gapComposer2.end(false);
                        gapComposer2.end(false);
                    }
                    CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changed(m382rememberTextFieldStateLepunE);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue2 == obj3) {
                        rememberedValue2 = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 2);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, charSequence, (Function2) rememberedValue2);
                    String str2 = afterpaySearchViewModel.title;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed2 = gapComposer2.changed(searchBarKeyboardState) | gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == obj3) {
                        rememberedValue3 = new AddFavoritesViewKt$$ExternalSyntheticLambda1(searchBarKeyboardState, function1, 1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.TitleBarSub(str2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                    SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, afterpaySearchViewModel.queryPlaceholder, searchBarKeyboardState, SizeKt.fillMaxWidth(companion3, 1.0f), null, ShowNavigationBack.Never, null, null, null, null, false, null, gapComposer2, 199680, 0, 8144);
                    gapComposer2.end(true);
                    Modifier zIndex = ZIndexModifierKt.zIndex(companion3, -1.0f);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == obj3) {
                        parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
                        rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda14(10, parcelableSnapshotMutableIntState2);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    } else {
                        parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
                    }
                    Modifier onGloballyPositioned2 = ValueInsets.onGloballyPositioned(zIndex, (Function1) rememberedValue4);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == obj3) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda14(11, parcelableSnapshotMutableIntState5);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    AfterpaySearchViewKt.FilterRow(SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(OffsetKt.offset(onGloballyPositioned2, (Function1) rememberedValue5), Strings.getColors(gapComposer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), 1.0f), afterpaySearchViewModel.filterPillViewModels, searchBarKeyboardState, function1, gapComposer2, 0);
                    gapComposer2.end(true);
                    Object obj12 = afterpaySearchViewModel.bodyViewModel;
                    if (obj12.equals(AfterpaySearchViewModel.BodyViewModel.LoadingViewModel.INSTANCE)) {
                        gapComposer2.startReplaceGroup(-1407307382);
                        i = 0;
                        AfterpaySearchViewKt.LoadingBody(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState2.getIntValue() + parcelableSnapshotMutableIntState.getIntValue()), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (obj12 instanceof AfterpaySearchViewModel.BodyViewModel.NoContentViewModel) {
                        gapComposer2.startReplaceGroup(-1406994437);
                        i = 0;
                        AfterpaySearchViewKt.NoResults(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState2.getIntValue() + parcelableSnapshotMutableIntState.getIntValue()), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (AfterpaySearchViewModel.BodyViewModel.NoContentViewModel) obj12, function1, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (!(obj12 instanceof AfterpaySearchViewModel.BodyViewModel.ResultsViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 370245906, false);
                        }
                        gapComposer2.startReplaceGroup(-1406558298);
                        Modifier fillMaxHeight = SizeKt.fillMaxHeight(ZIndexModifierKt.zIndex(companion3, -2.0f), 1.0f);
                        boolean changed3 = gapComposer2.changed(lazyListState2) | gapComposer2.changedInstance(obj12) | gapComposer2.changed(function1) | gapComposer2.changed(searchBarKeyboardState);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue6 == obj3) {
                            rememberedValue6 = new androidx.compose.material.SliderKt$$ExternalSyntheticLambda3(obj12, lazyListState2, function1, searchBarKeyboardState, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState2, 4);
                            lazyListState = lazyListState2;
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        } else {
                            lazyListState = lazyListState2;
                        }
                        LazyDslKt.LazyColumn(fillMaxHeight, lazyListState, null, null, null, null, false, null, (Function1) rememberedValue6, gapComposer2, 0, 508);
                        i = 0;
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    AfterpaySearchViewKt.FilterBottomSheet(afterpaySearchViewModel, function1, gapComposer2, i);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Shaker shaker = (Shaker) obj11;
                FocusRequester focusRequester = (FocusRequester) obj4;
                BirthdayViewModel birthdayViewModel = (BirthdayViewModel) obj10;
                Function1 function12 = (Function1) obj7;
                MutableState mutableState3 = (MutableState) obj9;
                TouchRecorder touchRecorder = (TouchRecorder) obj8;
                DateScrubber dateScrubber = (DateScrubber) obj6;
                MutableState mutableState4 = (MutableState) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier focusRequester2 = FocusTraversalKt.focusRequester(SharedViewEventsKt.shakeWith(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), shaker), focusRequester);
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getValue();
                    InputState inputState = (InputState) mutableState4.getValue();
                    MaskVisualTransformation maskVisualTransformation = new MaskVisualTransformation("XX/XX/XXXX", new Edge.Companion(9));
                    String str3 = birthdayViewModel.hint;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    PersistentMaskVisualTransformation persistentMaskVisualTransformation = new PersistentMaskVisualTransformation(maskVisualTransformation, str3, colors.semantic.text.placeholder);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 3, 2, (Boolean) null, 115);
                    boolean changed4 = gapComposer3.changed(function12) | gapComposer3.changed(mutableState3) | gapComposer3.changedInstance(touchRecorder);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue7 == obj3) {
                        rememberedValue7 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(function12, touchRecorder, mutableState3, 7);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    Function1 function13 = (Function1) rememberedValue7;
                    KeyboardActions keyboardActions = new KeyboardActions(function13, function13, function13, function13, function13, function13);
                    boolean changed5 = gapComposer3.changed(mutableState3) | gapComposer3.changedInstance(dateScrubber);
                    Object rememberedValue8 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue8 == obj3) {
                        rememberedValue8 = new BirthdayViewKt$$ExternalSyntheticLambda9(dateScrubber, mutableState3, 0);
                        gapComposer3.updateRememberedValue(rememberedValue8);
                    }
                    InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue8, focusRequester2, inputState, (Function2) null, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions, keyboardActions, persistentMaskVisualTransformation, gapComposer3, 805306368, 0, 496);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                VerifyCheckDepositPresenter verifyCheckDepositPresenter = (VerifyCheckDepositPresenter) obj11;
                VerifyCheckDepositScreen verifyCheckDepositScreen = verifyCheckDepositPresenter.args;
                MutableState mutableState5 = (MutableState) obj7;
                MutableState mutableState6 = (MutableState) obj10;
                MutableState mutableState7 = (MutableState) obj9;
                MutableState mutableState8 = (MutableState) obj8;
                MutableState mutableState9 = (MutableState) obj6;
                MutableState mutableState10 = (MutableState) obj5;
                MutableState mutableState11 = (MutableState) obj4;
                CheckCaptureAnswer checkCaptureAnswer = (CheckCaptureAnswer) obj2;
                ((CheckCaptureQuestion) obj).getClass();
                if (checkCaptureAnswer != null) {
                    if (!checkCaptureAnswer.equals(CheckCaptureAnswer.Canceled.INSTANCE)) {
                        if (checkCaptureAnswer instanceof CheckCaptureAnswer.Success) {
                            CheckCaptureAnswer.Success success = (CheckCaptureAnswer.Success) checkCaptureAnswer;
                            ByteString byteString = success.imageByteString;
                            int ordinal = success.face.ordinal();
                            if (ordinal == 0) {
                                VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState = (VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState) mutableState5.getValue();
                                VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState2 = VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState.CAPTURED;
                                mutableState6.setValue(Boolean.valueOf(captureState == captureState2));
                                mutableState7.setValue(byteString);
                                mutableState8.setValue(captureState2);
                                CheckDepositBlocker.PhotoCaptureData photoCaptureData = verifyCheckDepositScreen.checkDepositBlocker.photo_capture_data;
                                photoCaptureData.getClass();
                                CheckDepositBlocker.PhotoCaptureData.Controls controls = photoCaptureData.front_of_check_controls;
                                controls.getClass();
                                String str4 = controls.retake_photo_label;
                                str4.getClass();
                                mutableState9.setValue(str4);
                            } else if (ordinal == 1) {
                                VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState3 = (VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState) mutableState8.getValue();
                                VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState4 = VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState.CAPTURED;
                                mutableState6.setValue(Boolean.valueOf(captureState3 == captureState4));
                                mutableState10.setValue(byteString);
                                mutableState5.setValue(captureState4);
                                CheckDepositBlocker.PhotoCaptureData photoCaptureData2 = verifyCheckDepositScreen.checkDepositBlocker.photo_capture_data;
                                photoCaptureData2.getClass();
                                CheckDepositBlocker.PhotoCaptureData.Controls controls2 = photoCaptureData2.back_of_check_controls;
                                controls2.getClass();
                                String str5 = controls2.retake_photo_label;
                                str5.getClass();
                                mutableState11.setValue(str5);
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                        } else if (checkCaptureAnswer instanceof CheckCaptureAnswer.Failure) {
                            CheckCaptureAnswer.Failure failure = (CheckCaptureAnswer.Failure) checkCaptureAnswer;
                            CheckFace checkFace = failure.face;
                            String joinToString$default = CollectionsKt.joinToString$default(failure.warnings, null, null, null, 0, null, null, 63);
                            Analytics analytics = verifyCheckDepositPresenter.analytics;
                            AndroidStringManager androidStringManager = verifyCheckDepositPresenter.stringManager;
                            int ordinal2 = checkFace.ordinal();
                            if (ordinal2 == 0) {
                                step = CheckDepositReceiveError.Step.CHECK_CAPTURE_FRONT;
                            } else if (ordinal2 == 1) {
                                step = CheckDepositReceiveError.Step.CHECK_CAPTURE_BACK;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            analytics.track(new CheckDepositReceiveError(joinToString$default, null, null, step, 6), null);
                            BetterNavigator.ScreenNavigator screenNavigator = verifyCheckDepositPresenter.navigator;
                            int ordinal3 = checkFace.ordinal();
                            if (ordinal3 == 0) {
                                str = androidStringManager.get(R.string.retake_front);
                            } else if (ordinal3 == 1) {
                                str = androidStringManager.get(R.string.retake_back);
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            BlockersData blockersData = verifyCheckDepositScreen.blockersData;
                            String str6 = androidStringManager.get(R.string.retake_title);
                            str.getClass();
                            Object[] objArr = {str};
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format2 = new MessageFormat(resources.getString(R.string.retake_message)).format(objArr);
                            format2.getClass();
                            screenNavigator.goTo(new VerifyCheckDialogScreen(blockersData, str6, format2, androidStringManager.get(R.string.retake_label), androidStringManager.get(R.string.retake_cancel)));
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                    }
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            case 6:
                UiContainer uiContainer = (UiContainer) obj11;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj7;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj10;
                ImmutableList immutableList = (ImmutableList) obj9;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj8;
                CashComposeInsets cashComposeInsets = (CashComposeInsets) obj6;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj5;
                Function2 function2 = (Function2) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    uiContainer.StandardScreenContent(sharedTransitionScope, fullScreenLocation, immutableList, animatedContentScopeImpl, cashComposeInsets, saveableStateHolder, gapComposer4, 0);
                    if (function2 == null) {
                        gapComposer4.startReplaceGroup(-1678747589);
                        z = false;
                    } else {
                        z = false;
                        gapComposer4.startReplaceGroup(-2132363130);
                        function2.invoke(gapComposer4, 0);
                    }
                    gapComposer4.end(z);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                zzj.Content((UiScope) obj11, (PromotionDetailsViewModel.Loaded) obj10, (PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) obj9, (Function1) obj7, (Function0) obj8, (String) obj6, (RealImageLoader) obj5, (CashTreehouseLayout) obj4, (Composer) obj, Updater.updateChangedFlags(16777217));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                TortoiseCardEffectKt.TortoiseEffect((Modifier) obj11, (State) obj7, (State) obj10, (State) obj9, (State) obj8, (State) obj6, (State) obj5, (MutableState) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                s2.InvestingSearch((String) obj11, (InvestingSearchViewModel) obj10, (Function1) obj7, (Function1) obj9, (RealImageLoader) obj8, (Function0) obj6, (Function1) obj5, (FocusRequester) obj4, (Composer) obj, Updater.updateChangedFlags(12582977));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                MoneybotHomeViewKt.MoneybotHomeScaffold((Modifier) obj11, (LazyListState) obj10, (PaddingValuesImpl) obj9, (ComposableLambdaImpl) obj8, (ComposableLambdaImpl) obj6, (Function2) obj5, (ComposableLambdaImpl) obj4, (Function1) obj7, (Composer) obj, Updater.updateChangedFlags(1797505));
                return Unit.INSTANCE;
            case 11:
                HomeViewModel homeViewModel = (HomeViewModel) obj11;
                UiScope uiScope = (UiScope) obj10;
                DynamicColorConfiguration dynamicColorConfiguration = (DynamicColorConfiguration) obj9;
                Function1 function14 = (Function1) obj7;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj8;
                String str7 = (String) obj6;
                Painter painter = (Painter) obj5;
                String str8 = (String) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(140926028, new PoolToastKt$$ExternalSyntheticLambda0(23, (Serializable) str7, (Object) function14, (Object) elementBoundsRegistry), gapComposer5);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(53576264, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(homeViewModel, rememberComposableLambda, painter, str8, function14, elementBoundsRegistry, 9), gapComposer5);
                    HomeViewModel.Ready ready = (HomeViewModel.Ready) homeViewModel;
                    ComposableLambdaImpl composableLambdaImpl = ready.qrButtonPlacement == HomeViewModel.QrButtonPlacement.END ? rememberComposableLambda : null;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    TabToolbarInternalViewModel tabToolbarInternalViewModel = ready.toolbarInternalModel;
                    DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin = DiscoverTabSharedKey$Origin.Payment;
                    SimpleActor simpleActor = new SimpleActor(uiScope, uiScope, new DiscoverTabSharedKey$SearchBounds(discoverTabSharedKey$Origin), new DiscoverTabSharedKey$SearchIcon(discoverTabSharedKey$Origin));
                    boolean changed6 = gapComposer5.changed(function14);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue9 == obj3) {
                        rememberedValue9 = new UtilKt$$ExternalSyntheticLambda0(10, function14);
                        gapComposer5.updateRememberedValue(rememberedValue9);
                    }
                    TabToolbarsKt.TabToolbar(fillMaxWidth, tabToolbarInternalViewModel, dynamicColorConfiguration, true, rememberComposableLambda2, composableLambdaImpl, null, (Function1) rememberedValue9, elementBoundsRegistry, simpleActor, null, null, false, gapComposer5, 1073769478, 0, 7232);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Modifier modifier2 = (Modifier) obj11;
                Function0 function03 = (Function0) obj10;
                String str9 = (String) obj9;
                String str10 = (String) obj8;
                String str11 = (String) obj6;
                Function0 function04 = (Function0) obj5;
                Function1 function15 = (Function1) obj7;
                ImmutableList immutableList2 = (ImmutableList) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        i2 = 0;
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        i2 = 0;
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(modifier2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, i2);
                    int hashCode4 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer6, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    DBUtil.TitleBarSub((String) null, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, function03, (Modifier) null, (Function3) null, gapComposer6, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer6, null);
                    String str12 = "Contribute " + str9;
                    Subject subject = new Subject(str10, Expect_jvmKt.rememberComposableLambda(-118165205, new PoolContributeNoteKt$$ExternalSyntheticLambda6(immutableList2, 0), gapComposer6), str10);
                    Object rememberedValue10 = gapComposer6.rememberedValue();
                    if (rememberedValue10 == obj3) {
                        rememberedValue10 = new DateScrubber$$ExternalSyntheticLambda0(6);
                        gapComposer6.updateRememberedValue(rememberedValue10);
                    }
                    ErrorKt.SegmentedTitle((Function0) rememberedValue10, str12, subject, null, gapComposer6, 221574);
                    if (str11 == null) {
                        str11 = "";
                    }
                    ErrorKt.NoteInput(function04, true, null, function15, str11, false, true, Tags.persistentListOf(Room.stringResource(gapComposer6, R.string.pool_contribute_note_input_rotating_hint_one), Room.stringResource(gapComposer6, R.string.pool_contribute_note_input_rotating_hint_two), Room.stringResource(gapComposer6, R.string.pool_contribute_note_input_rotating_hint_three), Room.stringResource(gapComposer6, R.string.pool_contribute_note_input_rotating_hint_four)), null, "Review", gapComposer6, 807075888, EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState12 = (MutableState) obj11;
                Function1 function16 = (Function1) obj7;
                CardSchemeViewModel.Module.HeroCard heroCard = (CardSchemeViewModel.Module.HeroCard) obj10;
                final MutableState mutableState13 = (MutableState) obj9;
                final MutableState mutableState14 = (MutableState) obj8;
                final MutableState mutableState15 = (MutableState) obj6;
                final MutableState mutableState16 = (MutableState) obj5;
                MutableState mutableState17 = (MutableState) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean changed7 = gapComposer7.changed(mutableState12) | gapComposer7.changed(function16) | gapComposer7.changedInstance(heroCard);
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (changed7 || rememberedValue11 == obj3) {
                        rememberedValue11 = new HeroCardViewKt$$ExternalSyntheticLambda9(i4, function16, heroCard, mutableState12);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function05 = (Function0) rememberedValue11;
                    CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = heroCard.cardDetails;
                    CardSchemeViewModel.Module.CardAnimation cardAnimation = heroCardDetails2.animation;
                    CardSchemeViewModel.Module.CardAnimation.Updated updated = cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Updated ? (CardSchemeViewModel.Module.CardAnimation.Updated) cardAnimation : null;
                    if (updated == null || (cardTheme = updated.cardTheme) == null) {
                        cardTheme = heroCardDetails2.cardTheme;
                    }
                    String str13 = cardTheme.token;
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    if (str13 != null) {
                        gapComposer7.startReplaceGroup(-1406154326);
                        modifier = CardTransitionKt.cardTransition(6, 0, gapComposer7, companion4, str13, heroCard.disableFilament);
                        gapComposer = gapComposer7;
                        companion = companion4;
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer7;
                        companion = companion4;
                        gapComposer.startReplaceGroup(-1406054227);
                        gapComposer.end(false);
                        modifier = companion;
                    }
                    float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_module_spacing) / 2.0f;
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, dimensionResource);
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    final CardSchemeViewModel.Module.HeroCardDetails heroCardDetails3 = heroCard.cardDetails;
                    Object rememberedValue12 = gapComposer.rememberedValue();
                    if (rememberedValue12 == obj3) {
                        rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue12);
                    }
                    MutableState mutableState18 = (MutableState) rememberedValue12;
                    gapComposer.startReplaceGroup(-1825715437);
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb.append(Room.stringResource(R.string.hero_cash_app_card_last_four, new Object[]{CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(1, StringsKt___StringsKt.takeLast(4, heroCardDetails3.pan)), " ", null, null, 0, null, null, 62)}, gapComposer));
                    if (heroCardDetails3.showPrepurchaseContourText) {
                        gapComposer.startReplaceGroup(-1186638426);
                        sb.append(Room.stringResource(gapComposer, R.string.hero_card_prepurchase_turned_on));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1186551936);
                        gapComposer.end(false);
                    }
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        StringBuilder sb3 = sb;
                        arrayList2.add(((AnnotatedString.Builder.MutableRange) arrayList.get(i5)).toRange(sb3.length()));
                        i5++;
                        sb = sb3;
                    }
                    final AnnotatedString annotatedString = new AnnotatedString(sb2, (List) arrayList2);
                    gapComposer.end(false);
                    if (!heroCard.use3D || ((Boolean) mutableState18.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(-762197380);
                        Modifier align = BoxScopeInstance.INSTANCE.align(companion, biasAlignment);
                        boolean changed8 = gapComposer.changed(annotatedString);
                        Object rememberedValue13 = gapComposer.rememberedValue();
                        if (changed8 || rememberedValue13 == obj3) {
                            rememberedValue13 = new AlertBannerKt$$ExternalSyntheticLambda3(annotatedString, 19);
                            gapComposer.updateRememberedValue(rememberedValue13);
                        }
                        HeroCardViewKt.SlimCardRender(SemanticsModifierKt.semantics(align, false, (Function1) rememberedValue13), heroCardDetails3, function05, ((Boolean) mutableState12.getValue()).booleanValue(), gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-761833223);
                        final View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                        final String stringResource = Room.stringResource(gapComposer, R.string.hero_card_pan_announce);
                        final String stringResource2 = Room.stringResource(gapComposer, R.string.hero_card_cvv_announce);
                        final String stringResource3 = Room.stringResource(gapComposer, R.string.hero_card_exp_announce);
                        final String stringResource4 = Room.stringResource(gapComposer, R.string.hero_card_holder_announce);
                        final String stringResource5 = Room.stringResource(gapComposer, R.string.hero_card_front_resting);
                        final String stringResource6 = Room.stringResource(gapComposer, R.string.hero_card_back_resting);
                        final String stringResource7 = Room.stringResource(gapComposer, R.string.hero_card_flip);
                        final String stringResource8 = Room.stringResource(gapComposer, ((Boolean) mutableState13.getValue()).booleanValue() ? R.string.hero_show_details : R.string.hero_hide_details);
                        boolean changed9 = gapComposer.changed(annotatedString) | gapComposer.changed(stringResource7) | gapComposer.changedInstance(view) | gapComposer.changed(stringResource6) | gapComposer.changed(stringResource5) | gapComposer.changed(stringResource8) | gapComposer.changed(function05) | gapComposer.changed(mutableState13) | gapComposer.changed(stringResource) | gapComposer.changedInstance(heroCardDetails3) | gapComposer.changed(stringResource3) | gapComposer.changed(stringResource2) | gapComposer.changed(stringResource4);
                        Object rememberedValue14 = gapComposer.rememberedValue();
                        if (changed9 || rememberedValue14 == obj3) {
                            function0 = function05;
                            rememberedValue14 = new Function1() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj13) {
                                    SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj13;
                                    semanticsPropertyReceiver.getClass();
                                    SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                                    SemanticsPropertiesKt.setText(semanticsPropertyReceiver, AnnotatedString.this);
                                    final View view2 = view;
                                    SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, stringResource7, new StateFlowKt$$ExternalSyntheticLambda3(view2, stringResource6, stringResource5, mutableState14, mutableState15, mutableState16, 7));
                                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                    createListBuilder.add(new CustomAccessibilityAction(stringResource8, new AlertBannerKt$$ExternalSyntheticLambda2(15, function0)));
                                    if (!((Boolean) mutableState13.getValue()).booleanValue()) {
                                        final int i6 = 0;
                                        final CardSchemeViewModel.Module.HeroCardDetails heroCardDetails4 = heroCardDetails3;
                                        createListBuilder.add(new CustomAccessibilityAction(stringResource, new Function0() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i7 = i6;
                                                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails5 = heroCardDetails4;
                                                View view3 = view2;
                                                switch (i7) {
                                                    case 0:
                                                        char[] charArray = heroCardDetails5.pan.toCharArray();
                                                        charArray.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray));
                                                        break;
                                                    case 1:
                                                        view3.announceForAccessibility(heroCardDetails5.exp);
                                                        break;
                                                    case 2:
                                                        char[] charArray2 = heroCardDetails5.cvv.toCharArray();
                                                        charArray2.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray2));
                                                        break;
                                                    default:
                                                        view3.announceForAccessibility(heroCardDetails5.name);
                                                        break;
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }));
                                        final int i7 = 1;
                                        createListBuilder.add(new CustomAccessibilityAction(stringResource3, new Function0() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i72 = i7;
                                                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails5 = heroCardDetails4;
                                                View view3 = view2;
                                                switch (i72) {
                                                    case 0:
                                                        char[] charArray = heroCardDetails5.pan.toCharArray();
                                                        charArray.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray));
                                                        break;
                                                    case 1:
                                                        view3.announceForAccessibility(heroCardDetails5.exp);
                                                        break;
                                                    case 2:
                                                        char[] charArray2 = heroCardDetails5.cvv.toCharArray();
                                                        charArray2.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray2));
                                                        break;
                                                    default:
                                                        view3.announceForAccessibility(heroCardDetails5.name);
                                                        break;
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }));
                                        final int i8 = 2;
                                        createListBuilder.add(new CustomAccessibilityAction(stringResource2, new Function0() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i72 = i8;
                                                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails5 = heroCardDetails4;
                                                View view3 = view2;
                                                switch (i72) {
                                                    case 0:
                                                        char[] charArray = heroCardDetails5.pan.toCharArray();
                                                        charArray.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray));
                                                        break;
                                                    case 1:
                                                        view3.announceForAccessibility(heroCardDetails5.exp);
                                                        break;
                                                    case 2:
                                                        char[] charArray2 = heroCardDetails5.cvv.toCharArray();
                                                        charArray2.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray2));
                                                        break;
                                                    default:
                                                        view3.announceForAccessibility(heroCardDetails5.name);
                                                        break;
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }));
                                        final int i9 = 3;
                                        createListBuilder.add(new CustomAccessibilityAction(stringResource4, new Function0() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i72 = i9;
                                                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails5 = heroCardDetails4;
                                                View view3 = view2;
                                                switch (i72) {
                                                    case 0:
                                                        char[] charArray = heroCardDetails5.pan.toCharArray();
                                                        charArray.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray));
                                                        break;
                                                    case 1:
                                                        view3.announceForAccessibility(heroCardDetails5.exp);
                                                        break;
                                                    case 2:
                                                        char[] charArray2 = heroCardDetails5.cvv.toCharArray();
                                                        charArray2.getClass();
                                                        view3.announceForAccessibility(ArraysKt___ArraysKt.joinToString$default(charArray2));
                                                        break;
                                                    default:
                                                        view3.announceForAccessibility(heroCardDetails5.name);
                                                        break;
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }));
                                    }
                                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                                    return Unit.INSTANCE;
                                }
                            };
                            mutableState = mutableState14;
                            mutableState2 = mutableState15;
                            heroCardDetails = heroCardDetails3;
                            gapComposer.updateRememberedValue(rememberedValue14);
                        } else {
                            heroCardDetails = heroCardDetails3;
                            function0 = function05;
                            mutableState = mutableState14;
                            mutableState2 = mutableState15;
                        }
                        Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue14);
                        InteractiveCardState interactiveCardState = (InteractiveCardState) mutableState16.getValue();
                        boolean z2 = heroCard.disableFilament;
                        Object rememberedValue15 = gapComposer.rememberedValue();
                        if (rememberedValue15 == obj3) {
                            rememberedValue15 = new HeroTagViewKt$$ExternalSyntheticLambda7(1, mutableState);
                            gapComposer.updateRememberedValue(rememberedValue15);
                        }
                        Function1 function17 = (Function1) rememberedValue15;
                        Object rememberedValue16 = gapComposer.rememberedValue();
                        if (rememberedValue16 == obj3) {
                            rememberedValue16 = new HeroTagViewKt$$ExternalSyntheticLambda7(2, mutableState17);
                            gapComposer.updateRememberedValue(rememberedValue16);
                        }
                        Function1 function18 = (Function1) rememberedValue16;
                        Object rememberedValue17 = gapComposer.rememberedValue();
                        if (rememberedValue17 == obj3) {
                            rememberedValue17 = new HeroTagViewKt$$ExternalSyntheticLambda7(3, mutableState2);
                            gapComposer.updateRememberedValue(rememberedValue17);
                        }
                        Function1 function19 = (Function1) rememberedValue17;
                        Object rememberedValue18 = gapComposer.rememberedValue();
                        if (rememberedValue18 == obj3) {
                            rememberedValue18 = new HeroCardViewKt$$ExternalSyntheticLambda15(0, mutableState18);
                            gapComposer.updateRememberedValue(rememberedValue18);
                        }
                        CoreInteractiveCardKt.AdaptiveInteractiveCard(clearAndSetSemantics, interactiveCardState, heroCardDetails, z2, function17, function18, function19, function0, (Function0) rememberedValue18, ((Boolean) mutableState12.getValue()).booleanValue(), true, gapComposer, 102457344, 6, 0);
                        gapComposer.end(false);
                    }
                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) mutableState12.getValue()).booleanValue(), null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, UtilsKt.f742lambda$1106265579, gapComposer, 1600512, 18);
                    gapComposer.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockInMainContent((ClockInBottomSheetViewModel) obj11, (JobIdentifier) obj7, (LocationIdentifier) obj10, (Function0) obj9, (Function0) obj8, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(27649));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                AccountPickerScreenKt.AccountPickerContent((AccountPickerState) obj11, (Function1) obj7, (Function1) obj10, (Function0) obj9, (Function0) obj8, (Function0) obj6, (Function0) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.InstitutionPickerContent((LazyListState) obj11, (Async) obj10, (Async) obj9, (String) obj8, (Function1) obj7, (Function2) obj6, (Function0) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Object obj2, Function function, Function function2, Function function3, Function function4, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = function;
        this.f$5 = function2;
        this.f$6 = function3;
        this.f$7 = function4;
        this.f$1 = function1;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(Modifier modifier, Function0 function0, String str, String str2, String str3, Function0 function02, Function1 function1, ImmutableList immutableList) {
        this.$r8$classId = 12;
        this.f$0 = modifier;
        this.f$2 = function0;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = str3;
        this.f$6 = function02;
        this.f$1 = function1;
        this.f$7 = immutableList;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(UiScope uiScope, PromotionDetailsViewModel.Loaded loaded, PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV1, Function1 function1, Function0 function0, String str, RealImageLoader realImageLoader, CashTreehouseLayout cashTreehouseLayout, int i) {
        this.$r8$classId = 7;
        this.f$0 = uiScope;
        this.f$2 = loaded;
        this.f$3 = detailsPageV1;
        this.f$1 = function1;
        this.f$4 = function0;
        this.f$5 = str;
        this.f$6 = realImageLoader;
        this.f$7 = cashTreehouseLayout;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(AfterpaySearchViewKt$Content$nestedScrollConnection$1$1 afterpaySearchViewKt$Content$nestedScrollConnection$1$1, AfterpaySearchViewModel afterpaySearchViewModel, Function1 function1, LazyListState lazyListState, SearchBarKeyboardState searchBarKeyboardState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3) {
        this.$r8$classId = 3;
        this.f$0 = afterpaySearchViewKt$Content$nestedScrollConnection$1$1;
        this.f$2 = afterpaySearchViewModel;
        this.f$1 = function1;
        this.f$3 = lazyListState;
        this.f$4 = searchBarKeyboardState;
        this.f$5 = parcelableSnapshotMutableIntState;
        this.f$6 = parcelableSnapshotMutableIntState2;
        this.f$7 = parcelableSnapshotMutableIntState3;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(Shaker shaker, FocusRequester focusRequester, BirthdayViewModel birthdayViewModel, Function1 function1, MutableState mutableState, TouchRecorder touchRecorder, DateScrubber dateScrubber, MutableState mutableState2) {
        this.$r8$classId = 4;
        this.f$0 = shaker;
        this.f$7 = focusRequester;
        this.f$2 = birthdayViewModel;
        this.f$1 = function1;
        this.f$3 = mutableState;
        this.f$4 = touchRecorder;
        this.f$5 = dateScrubber;
        this.f$6 = mutableState2;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(HomeViewModel homeViewModel, UiScope uiScope, DynamicColorConfiguration dynamicColorConfiguration, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, String str, Painter painter, String str2) {
        this.$r8$classId = 11;
        this.f$0 = homeViewModel;
        this.f$2 = uiScope;
        this.f$3 = dynamicColorConfiguration;
        this.f$1 = function1;
        this.f$4 = elementBoundsRegistry;
        this.f$5 = str;
        this.f$6 = painter;
        this.f$7 = str2;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
        this.f$7 = obj8;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
        this.f$7 = obj8;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(String str, InvestingSearchViewModel investingSearchViewModel, Function1 function1, Function1 function12, RealImageLoader realImageLoader, Function0 function0, Function1 function13, FocusRequester focusRequester, int i) {
        this.$r8$classId = 9;
        this.f$0 = str;
        this.f$2 = investingSearchViewModel;
        this.f$1 = function1;
        this.f$3 = function12;
        this.f$4 = realImageLoader;
        this.f$5 = function0;
        this.f$6 = function13;
        this.f$7 = focusRequester;
    }

    public /* synthetic */ DateInputKt$$ExternalSyntheticLambda1(Function0 function0, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Shape shape, DatePickerColors datePickerColors, DialogProperties dialogProperties, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 1;
        this.f$0 = function0;
        this.f$1 = composableLambdaImpl;
        this.f$2 = modifier;
        this.f$3 = function2;
        this.f$4 = shape;
        this.f$6 = datePickerColors;
        this.f$5 = dialogProperties;
        this.f$7 = composableLambdaImpl2;
    }
}
