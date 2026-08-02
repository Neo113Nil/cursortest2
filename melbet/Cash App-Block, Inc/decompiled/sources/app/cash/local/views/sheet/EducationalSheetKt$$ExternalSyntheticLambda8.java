package app.cash.local.views.sheet;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.res.ResourcesCompat;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7;
import app.cash.local.views.internal.dropdown.LocalDropdownItemKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$Origin;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchBounds;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchIcon;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardLockViewKt;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda35;
import com.squareup.cash.work.viewmodels.PayHomeViewModel;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.android.StringsKt;
import com.stripe.android.financialconnections.ui.components.MultipleEventsCutterImpl;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class EducationalSheetKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda8(CardLockPresenter cardLockPresenter, ArrayList arrayList, boolean z) {
        this.$r8$classId = 7;
        this.f$1 = cardLockPresenter;
        this.f$2 = arrayList;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier then;
        ToolbarConfig toolbarConfig;
        float f;
        Function0 function0;
        Typeface font;
        boolean z;
        int i = this.$r8$classId;
        int i2 = 12;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        boolean z2 = this.f$0;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj6;
                EducationalSheetModel.Button button = (EducationalSheetModel.Button) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    gapComposer.skipToGroupEnd();
                } else if (z2) {
                    gapComposer.startReplaceGroup(-1689004640);
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer, VisibleKt.scaleHeightToTextLineHeight(modifier, gapComposer, 0));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1688919886);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button.label, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj6;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldScrollerPosition.orientation$delegate;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj5;
                ((Integer) obj3).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(-2137546592);
                boolean z3 = ((Orientation) parcelableSnapshotMutableState.getValue()) == Orientation.Vertical || !(gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection) == LayoutDirection.Rtl);
                boolean changed = gapComposer2.changed(textFieldScrollerPosition);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == obj4) {
                    rememberedValue = new ObjectList$$ExternalSyntheticLambda0(textFieldScrollerPosition, 26);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((Function1) rememberedValue, gapComposer2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj4) {
                    Object defaultScrollableState = new DefaultScrollableState(new DateInputKt$$ExternalSyntheticLambda5(1, rememberUpdatedState));
                    gapComposer2.updateRememberedValue(defaultScrollableState);
                    rememberedValue2 = defaultScrollableState;
                }
                final ScrollableState scrollableState = (ScrollableState) rememberedValue2;
                boolean changed2 = gapComposer2.changed(scrollableState) | gapComposer2.changed(textFieldScrollerPosition);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue3 == obj4) {
                    rememberedValue3 = new ScrollableState(textFieldScrollerPosition) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        public final DerivedSnapshotState canScrollBackward$delegate;
                        public final DerivedSnapshotState canScrollForward$delegate;

                        {
                            final int i3 = 0;
                            this.canScrollForward$delegate = Updater.derivedStateOf(new Function0() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4 = i3;
                                    TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf(textFieldScrollerPosition2.offset$delegate.getFloatValue() < textFieldScrollerPosition2.maximum$delegate.getFloatValue());
                                        default:
                                            return Boolean.valueOf(textFieldScrollerPosition2.offset$delegate.getFloatValue() > RecyclerView.DECELERATION_RATE);
                                    }
                                }
                            });
                            final int i4 = 1;
                            this.canScrollBackward$delegate = Updater.derivedStateOf(new Function0() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i42 = i4;
                                    TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                    switch (i42) {
                                        case 0:
                                            return Boolean.valueOf(textFieldScrollerPosition2.offset$delegate.getFloatValue() < textFieldScrollerPosition2.maximum$delegate.getFloatValue());
                                        default:
                                            return Boolean.valueOf(textFieldScrollerPosition2.offset$delegate.getFloatValue() > RecyclerView.DECELERATION_RATE);
                                    }
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final float dispatchRawDelta(float f2) {
                            return ScrollableState.this.dispatchRawDelta(f2);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final boolean getCanScrollBackward() {
                            return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final boolean getCanScrollForward() {
                            return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final boolean isScrollInProgress() {
                            return ScrollableState.this.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
                            return ScrollableState.this.scroll(mutatePriority, function2, continuation);
                        }
                    };
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                then = Modifier.Companion.$$INSTANCE.then(new ScrollableElement((TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue3, (Orientation) parcelableSnapshotMutableState.getValue(), z2 && textFieldScrollerPosition.maximum$delegate.getFloatValue() != RecyclerView.DECELERATION_RATE, z3, mutableInteractionSourceImpl));
                gapComposer2.end(false);
                return then;
            case 2:
                ImmutableList immutableList = (ImmutableList) obj6;
                MutableState mutableState = (MutableState) obj5;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int size = immutableList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        LocalDropdownItemModel localDropdownItemModel = (LocalDropdownItemModel) immutableList.get(i3);
                        if (!z2 || i3 <= 0) {
                            gapComposer3.startReplaceGroup(-201843898);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-201928466);
                            ModalKt.HorizontalDivider(6, 0, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            gapComposer3.end(false);
                        }
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        if (rememberedValue4 == obj4) {
                            rememberedValue4 = new TabContentViewKt$$ExternalSyntheticLambda1(5, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        LocalDropdownItemKt.LocalDropdownItem(columnScope, localDropdownItemModel, (Function0) rememberedValue4, gapComposer3, (intValue2 & 14) | MLKEMEngine.KyberPolyBytes);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function1 = (Function1) obj6;
                ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj5;
                UiScope uiScope = (UiScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String stringResource = Room.stringResource(gapComposer4, R.string.activity_title);
                    MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function1, gapComposer4);
                    if (z2) {
                        gapComposer4.startReplaceGroup(10339912);
                        boolean changed3 = gapComposer4.changed(activityTabViewModel.tabToolbarModel) | gapComposer4.changed(stringResource);
                        Object rememberedValue5 = gapComposer4.rememberedValue();
                        if (changed3 || rememberedValue5 == obj4) {
                            TabToolbarInternalViewModel tabToolbarInternalViewModel = activityTabViewModel.tabToolbarModel;
                            CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(1, rememberUpdatedState2);
                            DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin = DiscoverTabSharedKey$Origin.Activity;
                            Object toolbarConfig2 = new ToolbarConfig(null, null, null, tabToolbarInternalViewModel, stringResource, cashCardKt$$ExternalSyntheticLambda0, true, false, new ToolbarConfig.SearchSharedElementKeys(new DiscoverTabSharedKey$SearchBounds(discoverTabSharedKey$Origin), new DiscoverTabSharedKey$SearchIcon(discoverTabSharedKey$Origin)), null, 647);
                            gapComposer4.updateRememberedValue(toolbarConfig2);
                            rememberedValue5 = toolbarConfig2;
                        }
                        gapComposer4.end(false);
                        toolbarConfig = (ToolbarConfig) rememberedValue5;
                    } else {
                        gapComposer4.startReplaceGroup(11142874);
                        gapComposer4.end(false);
                        toolbarConfig = null;
                    }
                    if (z2) {
                        gapComposer4.startReplaceGroup(11223784);
                        ChromeConfigKt.ChromeConfig(null, null, null, null, null, toolbarConfig, null, gapComposer4, PKIFailureInfo.transactionIdInUse, 95);
                        TabToolbarsKt.SharedTabToolbarSpacer(0, 1, gapComposer4, null);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(11394160);
                        TabToolbarInternalViewModel tabToolbarInternalViewModel2 = activityTabViewModel.tabToolbarModel;
                        DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin2 = DiscoverTabSharedKey$Origin.Activity;
                        SimpleActor simpleActor = new SimpleActor(uiScope, uiScope, new DiscoverTabSharedKey$SearchBounds(discoverTabSharedKey$Origin2), new DiscoverTabSharedKey$SearchIcon(discoverTabSharedKey$Origin2));
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1821746578, new LocalHomeViewKt$$ExternalSyntheticLambda1(stringResource, i2), gapComposer4);
                        boolean changed4 = gapComposer4.changed(function1);
                        Object rememberedValue6 = gapComposer4.rememberedValue();
                        if (changed4 || rememberedValue6 == obj4) {
                            rememberedValue6 = new UtilsKt$$ExternalSyntheticLambda1(i2, function1);
                            gapComposer4.updateRememberedValue(rememberedValue6);
                        }
                        TabToolbarsKt.TabToolbar(null, tabToolbarInternalViewModel2, null, true, null, null, rememberComposableLambda, (Function1) rememberedValue6, null, simpleActor, null, null, false, gapComposer4, 1075317760, 0, 7477);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Latch$await$2$2 latch$await$2$2 = (Latch$await$2$2) obj6;
                BorrowHomeOverlayViewModel.InfoSheet infoSheet = (BorrowHomeOverlayViewModel.InfoSheet) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (!gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer5.skipToGroupEnd();
                } else if (z2) {
                    gapComposer5.startReplaceGroup(-1725424286);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed5 = gapComposer5.changed(latch$await$2$2) | gapComposer5.changedInstance(infoSheet);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue7 == obj4) {
                        rememberedValue7 = new BulletinTileKt$$ExternalSyntheticLambda12(29, latch$await$2$2, infoSheet);
                        gapComposer5.updateRememberedValue(rememberedValue7);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue7, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1321572447, new SsnViewKt$$ExternalSyntheticLambda2(infoSheet, 27), gapComposer5), gapComposer5, 1573296, 56);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-1725192375);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel = (InstalledBalanceAppletTileContentModel) obj6;
                InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig = (InstalledBalanceAppletTileLayoutConfig) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    SharedUIKt.InstalledBalanceAppletTileContent(installedBalanceAppletTileContentModel, z2, installedBalanceAppletTileLayoutConfig, gapComposer6, 8);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj6;
                List list = (List) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16);
                Applier applier = gapComposer7.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (z2) {
                        gapComposer7.startReplaceGroup(-662872151);
                        Object rememberedValue8 = gapComposer7.rememberedValue();
                        if (rememberedValue8 == obj4) {
                            rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda13(i2);
                            gapComposer7.updateRememberedValue(rememberedValue8);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(companion2, false, (Function1) rememberedValue8);
                        Density density = (Density) gapComposer7.consume(CompositionLocalsKt.LocalDensity);
                        Float f2 = (Float) cardNestedScrollExpander.cardHeight$delegate.getValue();
                        Modifier evolutionBackground = HypeWelcomeUIKt.evolutionBackground(CardTransitionKt.cardSlideInOut(semantics.then(ValueInsets.layout(companion2, new PoolDetailsViewKt$$ExternalSyntheticLambda28(density.mo232toDpu2uoSUM(f2 != null ? f2.floatValue() : 759.0f) - density.mo232toDpu2uoSUM(cardNestedScrollExpander.cardRevealDistance$delegate.getFloatValue()), 5))), gapComposer7), RoundedCornerShapeKt.m341RoundedCornerShapea9UjIt4(40.0f, 40.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), gapComposer7, 1);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, evolutionBackground);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        HypeWelcomeUIKt.m3611GroupedInnerContentTDGSqEk(list, true, gapComposer7, 48);
                        gapComposer7.end(true);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-661826769);
                        Density density2 = (Density) gapComposer7.consume(CompositionLocalsKt.LocalDensity);
                        float floatValue = cardNestedScrollExpander.cardRevealDistance$delegate.getFloatValue();
                        if (floatValue < RecyclerView.DECELERATION_RATE) {
                            floatValue = RecyclerView.DECELERATION_RATE;
                        }
                        Modifier cardSlideInOut = CardTransitionKt.cardSlideInOut(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, density2.mo232toDpu2uoSUM(floatValue), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), gapComposer7);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                        int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, cardSlideInOut);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        HypeWelcomeUIKt.m3611GroupedInnerContentTDGSqEk(list, false, gapComposer7, 48);
                        gapComposer7.end(true);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                int intValue7 = ((Integer) obj2).intValue();
                float floatValue2 = ((Float) obj3).floatValue();
                ((MultipleAllocationViewModel.Active) obj).getClass();
                return ((CardLockPresenter) obj6).createActiveModel(CardLockPresenter.distributionUpdated((ArrayList) obj5, intValue7, UtilsKt.getBasisPoints(floatValue2)), z2);
            case 8:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj6;
                Function0 function02 = (Function0) obj5;
                BoxScope boxScope = (BoxScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer7).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    Modifier fillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(boxScope.align(companion, Alignment.Companion.TopCenter), 1.0f), 0.24271844f);
                    long j = Color.DarkGray;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(fillMaxHeight, j, rectangleShapeKt$RectangleShape$1), gapComposer8, 0);
                    Context context = (Context) gapComposer8.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    Object rememberedValue9 = gapComposer8.rememberedValue();
                    if (rememberedValue9 == obj4) {
                        f = 1.0f;
                        rememberedValue9 = Float.valueOf(ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_pan_width));
                        gapComposer8.updateRememberedValue(rememberedValue9);
                    } else {
                        f = 1.0f;
                    }
                    float floatValue3 = ((Number) rememberedValue9).floatValue();
                    String str = heroCardDetails.pan;
                    boolean z4 = heroCardDetails.isEnabled;
                    boolean z5 = heroCardDetails.isLocked;
                    CardTheme cardTheme = heroCardDetails.cardTheme;
                    boolean changed6 = gapComposer8.changed(str);
                    Object rememberedValue10 = gapComposer8.rememberedValue();
                    if (changed6 || rememberedValue10 == obj4) {
                        function0 = function02;
                        rememberedValue10 = StringsKt___StringsKt.chunked(4, StringsKt__StringsJVMKt.replace$default(heroCardDetails.pan, " ", ""));
                        gapComposer8.updateRememberedValue(rememberedValue10);
                    } else {
                        function0 = function02;
                    }
                    List list2 = (List) rememberedValue10;
                    Integer safeParseColor = StringsKt.safeParseColor(cardTheme.card_info_text_color, null);
                    safeParseColor.getClass();
                    int intValue9 = safeParseColor.intValue();
                    CardTheme.BackgroundImage backgroundImage = cardTheme.background_image;
                    boolean changed7 = gapComposer8.changed(backgroundImage == null ? -1 : backgroundImage.ordinal());
                    Object rememberedValue11 = gapComposer8.rememberedValue();
                    if (changed7 || rememberedValue11 == obj4) {
                        RectF rectF = CardsKt.ICON_TEXTURE_BOUNDS;
                        context.getClass();
                        if ((backgroundImage == null ? -1 : CardsKt.WhenMappings.$EnumSwitchMapping$1[backgroundImage.ordinal()]) == 1) {
                            font = ResourcesCompat.getFont(context, R.font.shantell_sans_normal_medium);
                            font.getClass();
                        } else {
                            font = ResourcesCompat.getFont(context, R.font.sqmarket_regular);
                            font.getClass();
                        }
                        rememberedValue11 = new LoadedFontFamily(new Recorder.AnonymousClass6(font, 18));
                        gapComposer8.updateRememberedValue(rememberedValue11);
                    }
                    Shadow shadow = new Shadow(1.0f, j, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax));
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                    Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(new DensityImpl(((Density) gapComposer8.consume(staticProvidableCompositionLocal)).getDensity(), f)), Expect_jvmKt.rememberComposableLambda(-1476216388, new HeroCardViewKt$$ExternalSyntheticLambda35(boxScope, floatValue3, (FontFamily) rememberedValue11, shadow, intValue9, list2, heroCardDetails), gapComposer8), gapComposer8, 56);
                    AnimatedContentKt.AnimatedVisibility(!z4 || z2, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) com.squareup.cash.wallet.views.UtilsKt.f748lambda$2022303276, (Composer) gapComposer8, 200064, 18);
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState((z4 || z2) ? RecyclerView.DECELERATION_RATE : 1.0f, null, null, null, gapComposer8, 0, 30);
                    Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(boxScope.align(companion, Alignment.Companion.Center), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer8, R.dimen.wallet_card_max_width), 1), 0.25f), false);
                    boolean changed8 = gapComposer8.changed(animateFloatAsState);
                    Object rememberedValue12 = gapComposer8.rememberedValue();
                    if (changed8 || rememberedValue12 == obj4) {
                        rememberedValue12 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 23);
                        gapComposer8.updateRememberedValue(rememberedValue12);
                    }
                    CardLockViewKt.LockAnimation(z4, ColorKt.graphicsLayer(aspectRatio, (Function1) rememberedValue12), CardLockViewKt.lockAnimationColorTreatment(cardTheme), gapComposer8, 0);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m298padding3ABfNKs(OffsetKt.aspectRatio(1.0f, boxScope.align(SizeKt.fillMaxHeight(companion, 0.24271844f), Alignment.Companion.TopEnd), false), 8.0f), RoundedCornerShapeKt.CircleShape), HeroCardViewKt.ICON_BACKGROUND, rectangleShapeKt$RectangleShape$1);
                    String stringResource2 = Room.stringResource(gapComposer8, z5 ? R.string.hero_show_details : R.string.hero_hide_details);
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer8, 0, 15);
                    Object rememberedValue13 = gapComposer8.rememberedValue();
                    if (rememberedValue13 == obj4) {
                        rememberedValue13 = Recorder$$ExternalSyntheticOutline2.m(gapComposer8);
                    }
                    Trace.m1191Iconww6aTOc(z5 ? Icons.SensitiveVisible24 : Icons.SensitiveHidden24, (String) null, SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue13, m3400rippleYJYuY3k, false, stringResource2, new Role(0), function0, 4), 8.0f), Color.White, gapComposer8, 3120, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                TextFieldState textFieldState = (TextFieldState) obj6;
                Function1 function12 = (Function1) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    CharSequence charSequence = textFieldState.getValue$foundation().text;
                    int i4 = 0;
                    while (true) {
                        if (i4 < charSequence.length()) {
                            if (!Character.isDigit(charSequence.charAt(i4))) {
                                i4++;
                            } else if (!z2) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed9 = gapComposer9.changed(function12) | gapComposer9.changed(textFieldState);
                    Object rememberedValue14 = gapComposer9.rememberedValue();
                    if (changed9 || rememberedValue14 == obj4) {
                        rememberedValue14 = new CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7(r10, textFieldState, function12);
                        gapComposer9.updateRememberedValue(rememberedValue14);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, fillMaxWidth2, buttonProminence2, false, z, null, Expect_jvmKt.rememberComposableLambda(999639637, new MoneyTabUIKt$$ExternalSyntheticLambda38(z2, i2), gapComposer9), gapComposer9, 1573296, 40);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                PayHomeViewModel.Loaded loaded = (PayHomeViewModel.Loaded) obj6;
                Function1 function13 = (Function1) obj5;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer9).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (!gapComposer10.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    gapComposer10.skipToGroupEnd();
                } else if (z2) {
                    gapComposer10.startReplaceGroup(-613461819);
                    PayCellViewKt.PayHomeOverflowAction(titleBarActionScope, loaded, function13, gapComposer10, intValue11 & 14);
                    gapComposer10.end(false);
                } else {
                    gapComposer10.startReplaceGroup(-613383017);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            default:
                Role role = (Role) obj6;
                Function0 function03 = (Function0) obj5;
                ((Integer) obj3).getClass();
                ((Modifier) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) ((Composer) obj2);
                gapComposer11.startReplaceGroup(-1610772522);
                Object rememberedValue15 = gapComposer11.rememberedValue();
                if (rememberedValue15 == obj4) {
                    rememberedValue15 = new MultipleEventsCutterImpl();
                    gapComposer11.updateRememberedValue(rememberedValue15);
                }
                MultipleEventsCutterImpl multipleEventsCutterImpl = (MultipleEventsCutterImpl) rememberedValue15;
                Object rememberedValue16 = gapComposer11.rememberedValue();
                if (rememberedValue16 == obj4) {
                    rememberedValue16 = Recorder$$ExternalSyntheticOutline2.m(gapComposer11);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue16;
                IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) gapComposer11.consume(IndicationKt.LocalIndication);
                boolean changedInstance = gapComposer11.changedInstance(multipleEventsCutterImpl) | gapComposer11.changed(function03);
                Object rememberedValue17 = gapComposer11.rememberedValue();
                if (changedInstance || rememberedValue17 == obj4) {
                    rememberedValue17 = new StateFlowsKt$$ExternalSyntheticLambda2(r11, multipleEventsCutterImpl, function03);
                    gapComposer11.updateRememberedValue(rememberedValue17);
                }
                Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl2, indicationNodeFactory, this.f$0, null, role, (Function0) rememberedValue17);
                gapComposer11.end(false);
                return m181clickableO2vRcR0;
        }
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda8(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
        this.f$2 = obj2;
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda8(boolean z, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = obj;
        this.f$2 = obj2;
    }
}
