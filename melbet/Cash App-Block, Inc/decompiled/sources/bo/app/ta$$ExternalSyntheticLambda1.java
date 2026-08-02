package bo.app;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.DateInputValidator;
import androidx.compose.material3.DatePickerDefaults$AllDates$1;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Answer;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.cart.LineSelectionInformationRenderer$ModifierInformation;
import app.cash.local.presenters.cart.LineSelectionInformationRendererKt;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.ComboCategory;
import app.cash.local.primitives.ComboCategoryToken;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.ComboSlotPriceAdjustment;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.MenuItemVariationToken;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.paraphrase.FormattedResource;
import com.google.mlkit.vision.text.internal.zzr;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerEvent;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewEvent;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.card.onboarding.core.SceneUpdate;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene$centerOnCardIndex$1;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.StarStepAnimationProgressTracker;
import com.squareup.cash.formview.components.arcade.AccessoryCheckedState;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$flatMapLatest$2;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.applets.sections.AppletTilePresentation;
import com.squareup.cash.money.applets.sections.AppletTileSection;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.ids.AppletTileUninstallationSectionId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.wallet.views.WalletHomeViewKt$WalletHome$2$3$1;
import com.squareup.cash.work.views.you.WorkYouViewKt;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import net.oneformapp.helper.matching.POPMatchingFactory;
import org.json.JSONObject;
import radiography.internal.ComposeLayoutInfoKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ta$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ ta$$ExternalSyntheticLambda1(SnapshotStateMap snapshotStateMap, LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, MenuItem menuItem, SnapshotStateMap snapshotStateMap2, List list, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 4;
        this.f$0 = snapshotStateMap;
        this.f$1 = menuItem;
        this.f$2 = snapshotStateMap2;
        this.f$3 = list;
        this.f$4 = parcelableSnapshotMutableIntState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:444:0x097c, code lost:
    
        if (r34 != null) goto L416;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x051d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0a3d A[LOOP:17: B:480:0x0a37->B:482:0x0a3d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0ad3 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus validationStatus;
        boolean z;
        List list;
        String str;
        CartEntry.ComboSlotSelection comboSlotSelection;
        ComboSlot comboSlot;
        String str2;
        Map map;
        boolean z2;
        MutableState mutableState;
        MutableState mutableState2;
        LocalMenuComboDetailsViewModel.ComboSlotOption comboSlotOption;
        MenuItemVariation menuItemVariation;
        Object obj;
        String str3;
        String str4;
        LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability available;
        String str5;
        String str6;
        String str7;
        Object obj2;
        FormattedResource formattedResource;
        ComboCategory comboCategory;
        int i;
        AppletTileItem copy$default;
        LinkedHashMap linkedHashMap;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        boolean z3;
        ArrayList arrayList;
        Iterator it2;
        boolean hasNext;
        Section.Layout layout;
        SectionId sectionId;
        Section.Layout layout2;
        Section.Header header;
        SectionId sectionId2;
        int i2;
        Section.Header.Spacer spacer;
        AppletTileUninstallationSectionId appletTileUninstallationSectionId;
        AppletTileInstallationSectionId appletTileInstallationSectionId;
        AppletTileItem appletTileItem;
        int intValue;
        int i3 = this.$r8$classId;
        int i4 = 11;
        int i5 = 10;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i3) {
            case 0:
                return ta.a((Lazy) obj7, (kd) obj6, (ta) obj5, (Map) obj4, (JSONObject) obj3);
            case 1:
                Locale locale = (Locale) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                return Updater.mutableStateOf$default(((TextFieldValue) mutableState3.getValue()).annotatedString.text.length() > 0 ? ((DateInputValidator) obj7).m521validateXivgLIo(((CalendarModelImpl) obj6).parse(((TextFieldValue) mutableState3.getValue()).annotatedString.text, ((DateInputFormat) obj5).patternWithoutDelimiters, locale), locale) : "");
            case 2:
                return new DatePickerStateImpl((Long) obj7, (Long) obj6, (IntRange) obj5, 0, (DatePickerDefaults$AllDates$1) obj4, (Locale) obj3);
            case 3:
                List list2 = null;
                LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) obj6;
                LocationMenu locationMenu = (LocationMenu) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                MutableState mutableState5 = (MutableState) obj3;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = ((ArrayList) obj7).iterator();
                while (it3.hasNext()) {
                    ComboSlot comboSlot2 = (ComboSlot) it3.next();
                    AndroidStringManager androidStringManager = localMenuComboDetailsPresenter.stringManager;
                    Integer num = 1;
                    List list3 = comboSlot2.availableItemTokens;
                    String str8 = comboSlot2.token;
                    if (list3.isEmpty()) {
                        list3 = list2;
                    }
                    if (list3 == null) {
                        String str9 = comboSlot2.comboCategoryToken;
                        list3 = (str9 == null || (comboCategory = (ComboCategory) locationMenu.comboCategories.get(new ComboCategoryToken(str9))) == null) ? list2 : comboCategory.items;
                        if (list3 == null) {
                            list3 = EmptyList.INSTANCE;
                        }
                    }
                    Map map2 = (Map) ((Map) mutableState4.getValue()).get(new ComboSlotToken(str8));
                    if (map2 == null) {
                        map2 = EmptyMap.INSTANCE;
                        map2.getClass();
                    }
                    boolean z4 = list3.size() > 1;
                    int i6 = comboSlot2.numberOfSelections;
                    ArrayList arrayList3 = new ArrayList(i6);
                    int i7 = 0;
                    while (i7 < i6) {
                        Iterator it4 = it3;
                        CartEntry.ComboSlotSelection comboSlotSelection2 = (CartEntry.ComboSlotSelection) map2.get(new LocalMenuComboDetailsViewModel.SectionIndex(i7));
                        Integer num2 = num;
                        int i8 = i7;
                        LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus validationStatus2 = (LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus) ((Map) mutableState5.getValue()).get(new LocalMenuComboDetailsPresenter.ComboTokenAndSectionIndex(str8, i7));
                        if (validationStatus2 == null) {
                            validationStatus2 = LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.NotValidated;
                        }
                        boolean z5 = validationStatus2 == LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.CustomizationRequired;
                        if (z4) {
                            if (z5) {
                                validationStatus = validationStatus2;
                                z = z5;
                                list = list3;
                                formattedResource = new FormattedResource(R.string.local_presenters_variations_exactly_select_customizations, new Object[]{num2});
                            } else {
                                validationStatus = validationStatus2;
                                z = z5;
                                list = list3;
                                formattedResource = new FormattedResource(R.string.local_presenters_variations_exactly, new Object[]{num2});
                            }
                            str = Countries.getString(androidStringManager.resources, formattedResource);
                        } else {
                            validationStatus = validationStatus2;
                            z = z5;
                            list = list3;
                            str = z ? androidStringManager.get(R.string.local_presenters_variations_select_customizations) : androidStringManager.get(R.string.local_presenters_variations_part_of_combo);
                        }
                        String str10 = str;
                        String str11 = comboSlot2.token;
                        String str12 = comboSlot2.name;
                        String str13 = androidStringManager.get((z4 || z) ? R.string.local_presenters_combo_slot_subtitle_required : R.string.local_presenters_combo_slot_subtitle_included);
                        AndroidStringManager androidStringManager2 = androidStringManager;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            String str14 = str11;
                            String str15 = ((MenuItemToken) it5.next()).value;
                            String str16 = str12;
                            MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(str15);
                            Iterator it6 = it5;
                            if (m1244menuItemOrNullGvMOdU0 != null) {
                                if (!MenuHoursKt.isNullOrAvailableNow(m1244menuItemOrNullGvMOdU0.menuHours)) {
                                    m1244menuItemOrNullGvMOdU0 = null;
                                }
                                if (m1244menuItemOrNullGvMOdU0 != null) {
                                    ArrayList arrayList5 = m1244menuItemOrNullGvMOdU0.variations;
                                    String str17 = comboSlotSelection2 != null ? comboSlotSelection2.menuItemToken : null;
                                    boolean equals = str17 == null ? false : str17.equals(str15);
                                    if (comboSlotSelection2 != null && (str7 = comboSlotSelection2.variationToken) != null) {
                                        str2 = str8;
                                        MenuItemVariationToken menuItemVariationToken = new MenuItemVariationToken(str7);
                                        if (!equals) {
                                            menuItemVariationToken = null;
                                        }
                                        String str18 = menuItemVariationToken != null ? menuItemVariationToken.value : null;
                                        if (str18 != null) {
                                            Iterator it7 = arrayList5.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    obj2 = it7.next();
                                                    Iterator it8 = it7;
                                                    if (!Intrinsics.areEqual(((MenuItemVariation) obj2).token, str18)) {
                                                        it7 = it8;
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            menuItemVariation = (MenuItemVariation) obj2;
                                            break;
                                        }
                                    } else {
                                        str2 = str8;
                                    }
                                    menuItemVariation = (MenuItemVariation) CollectionsKt.singleOrNull((List) arrayList5);
                                    MenuItemVariation menuItemVariation2 = menuItemVariation;
                                    Iterator it9 = comboSlot2.priceAdjustments.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            obj = it9.next();
                                            comboSlot = comboSlot2;
                                            String str19 = ((ComboSlotPriceAdjustment) obj).variationToken;
                                            Iterator it10 = it9;
                                            String str20 = menuItemVariation2 != null ? menuItemVariation2.token : null;
                                            if (!(str20 == null ? false : Intrinsics.areEqual(str19, str20))) {
                                                comboSlot2 = comboSlot;
                                                it9 = it10;
                                            }
                                        } else {
                                            comboSlot = comboSlot2;
                                            obj = null;
                                        }
                                    }
                                    ComboSlotPriceAdjustment comboSlotPriceAdjustment = (ComboSlotPriceAdjustment) obj;
                                    LocalMoney localMoney = comboSlotPriceAdjustment != null ? comboSlotPriceAdjustment.priceAdjustment : null;
                                    String str21 = m1244menuItemOrNullGvMOdU0.token;
                                    LocalImage localImage = m1244menuItemOrNullGvMOdU0.image;
                                    String str22 = m1244menuItemOrNullGvMOdU0.name;
                                    if (equals) {
                                        str3 = str22;
                                        if (menuItemVariation2 == null || (str6 = menuItemVariation2.name) == null) {
                                            map = map2;
                                        } else {
                                            map = map2;
                                            if (arrayList5.size() > 1) {
                                                str5 = str6;
                                                SortedSet<CartEntry.ModifierSelection> sortedSet = comboSlotSelection2.modifierSelections;
                                                ArrayList arrayList6 = new ArrayList();
                                                for (CartEntry.ModifierSelection modifierSelection : sortedSet) {
                                                    boolean z6 = z4;
                                                    modifierSelection.getClass();
                                                    LineSelectionInformationRenderer$ModifierInformation modifierInformation = LineSelectionInformationRendererKt.toModifierInformation(modifierSelection, locationMenu);
                                                    if (modifierInformation != null) {
                                                        arrayList6.add(modifierInformation);
                                                    }
                                                    z4 = z6;
                                                }
                                                z2 = z4;
                                                SortedSet<CartEntry.ModifierFreeEntry> sortedSet2 = comboSlotSelection2.freeTextEntries;
                                                comboSlotSelection = comboSlotSelection2;
                                                mutableState = mutableState5;
                                                mutableState2 = mutableState4;
                                                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet2, 10));
                                                for (CartEntry.ModifierFreeEntry modifierFreeEntry : sortedSet2) {
                                                    modifierFreeEntry.getClass();
                                                    arrayList7.add(LineSelectionInformationRendererKt.toTextModifierInformation(modifierFreeEntry, locationMenu));
                                                }
                                                str4 = WorkYouViewKt.renderSelectionInformation(str5, arrayList6, arrayList7);
                                            }
                                        }
                                        str5 = null;
                                        SortedSet<CartEntry.ModifierSelection> sortedSet3 = comboSlotSelection2.modifierSelections;
                                        ArrayList arrayList62 = new ArrayList();
                                        while (r34.hasNext()) {
                                        }
                                        z2 = z4;
                                        SortedSet<CartEntry.ModifierFreeEntry> sortedSet22 = comboSlotSelection2.freeTextEntries;
                                        comboSlotSelection = comboSlotSelection2;
                                        mutableState = mutableState5;
                                        mutableState2 = mutableState4;
                                        ArrayList arrayList72 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet22, 10));
                                        while (r9.hasNext()) {
                                        }
                                        str4 = WorkYouViewKt.renderSelectionInformation(str5, arrayList62, arrayList72);
                                    } else {
                                        comboSlotSelection = comboSlotSelection2;
                                        str3 = str22;
                                        map = map2;
                                        z2 = z4;
                                        mutableState = mutableState5;
                                        mutableState2 = mutableState4;
                                        str4 = null;
                                    }
                                    String str23 = menuItemVariation2 != null ? menuItemVariation2.token : null;
                                    LocalMenuAvailability localMenuAvailability = menuItemVariation2 != null ? menuItemVariation2.availability : null;
                                    int i9 = localMenuAvailability == null ? -1 : LocalMenuComboDetailsPresenter.WhenMappings.$EnumSwitchMapping$0[localMenuAvailability.ordinal()];
                                    if (i9 != -1 && i9 != 1) {
                                        if (i9 != 2) {
                                            if (i9 != 3) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            available = LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability.SoldOut.INSTANCE;
                                            comboSlotOption = new LocalMenuComboDetailsViewModel.ComboSlotOption(str21, str23, localImage, str3, str4, available, (arrayList5.size() <= 1 || !m1244menuItemOrNullGvMOdU0.modifierListConfigs.isEmpty()) ? new LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize(equals) : new LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Radio(equals));
                                            if (comboSlotOption != null) {
                                                arrayList4.add(comboSlotOption);
                                            }
                                            mutableState4 = mutableState2;
                                            it5 = it6;
                                            str11 = str14;
                                            str12 = str16;
                                            str8 = str2;
                                            comboSlotSelection2 = comboSlotSelection;
                                            comboSlot2 = comboSlot;
                                            map2 = map;
                                            z4 = z2;
                                            mutableState5 = mutableState;
                                        }
                                    }
                                    available = new LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability.Available(localMoney != null ? LocalMenuComboDetailsPresenter.prettyPrintOrBlank$default(localMenuComboDetailsPresenter, localMoney) : null);
                                    comboSlotOption = new LocalMenuComboDetailsViewModel.ComboSlotOption(str21, str23, localImage, str3, str4, available, (arrayList5.size() <= 1 || !m1244menuItemOrNullGvMOdU0.modifierListConfigs.isEmpty()) ? new LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize(equals) : new LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Radio(equals));
                                    if (comboSlotOption != null) {
                                    }
                                    mutableState4 = mutableState2;
                                    it5 = it6;
                                    str11 = str14;
                                    str12 = str16;
                                    str8 = str2;
                                    comboSlotSelection2 = comboSlotSelection;
                                    comboSlot2 = comboSlot;
                                    map2 = map;
                                    z4 = z2;
                                    mutableState5 = mutableState;
                                }
                            }
                            comboSlotSelection = comboSlotSelection2;
                            comboSlot = comboSlot2;
                            str2 = str8;
                            map = map2;
                            z2 = z4;
                            mutableState = mutableState5;
                            mutableState2 = mutableState4;
                            comboSlotOption = null;
                            if (comboSlotOption != null) {
                            }
                            mutableState4 = mutableState2;
                            it5 = it6;
                            str11 = str14;
                            str12 = str16;
                            str8 = str2;
                            comboSlotSelection2 = comboSlotSelection;
                            comboSlot2 = comboSlot;
                            map2 = map;
                            z4 = z2;
                            mutableState5 = mutableState;
                        }
                        arrayList3.add(new LocalMenuComboDetailsViewModel.ComboSlot(i8, str11, str12, str10, str13, arrayList4, validationStatus));
                        i7 = i8 + 1;
                        it3 = it4;
                        num = num2;
                        list3 = list;
                        androidStringManager = androidStringManager2;
                        map2 = map2;
                        z4 = z4;
                        mutableState5 = mutableState5;
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList2);
                    mutableState5 = mutableState5;
                    list2 = null;
                }
                return arrayList2;
            case 4:
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj7;
                MenuItem menuItem = (MenuItem) obj6;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj5;
                List list4 = (List) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                if (snapshotStateMap.get(new MenuItemModifierListToken("ユニーク")) == null) {
                    return null;
                }
                CartEntry createCartEntry = LocalMenuItemDetailsPresenter.createCartEntry(menuItem, snapshotStateMap, snapshotStateMap2);
                EmptyList emptyList = EmptyList.INSTANCE;
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return LocalMoneysKt.times(CartBuilderKt.getCostInMenu(createCartEntry, new LocationMenu(null, emptyList, emptyMap, null, emptyList, CollectionsKt__CollectionsJVMKt.listOf(menuItem), list4, emptyList, emptyMap)), parcelableSnapshotMutableIntState.getIntValue());
            case 5:
                Function1 function1 = (Function1) obj6;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj5;
                Shaker shaker = (Shaker) obj4;
                MutableState mutableState6 = (MutableState) obj3;
                if (((BitcoinKeypadAmountPickerModel) obj7).keypadModel.error == null) {
                    function1.invoke(BitcoinKeypadAmountPickerEvent.ButtonClicked.INSTANCE);
                } else {
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    shaker.shake();
                    mutableState6.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 6:
                AddressState addressState = (AddressState) obj7;
                Function1 function12 = (Function1) obj6;
                TouchRecorder touchRecorder = (TouchRecorder) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                MutableState mutableState7 = (MutableState) obj3;
                if (!addressState.equals(AddressState.Empty.INSTANCE) && !addressState.equals(AddressState.Searching.INSTANCE)) {
                    if (addressState instanceof AddressState.Error) {
                        mutableState7.setValue(((AddressState.Error) addressState).message);
                    } else {
                        if (!(addressState instanceof AddressState.Valid)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        function12.invoke(new SetAddressViewEvent.Submit(((AddressState.Valid) addressState).address, !r0.manuallyEdited, touchRecorder.getSignalsContext()));
                        if (delegatingSoftwareKeyboardController != null) {
                            delegatingSoftwareKeyboardController.hide();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function13 = (Function1) obj7;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                MutableState mutableState8 = (MutableState) obj5;
                MutableState mutableState9 = (MutableState) obj4;
                ScrollState scrollState = (ScrollState) obj3;
                if (((String) mutableState8.getValue()) != null) {
                    function13.invoke(PaymentDeviceCustomizationViewEvent.CloseProductDetailsPage.INSTANCE);
                    Job job = (Job) mutableState9.getValue();
                    Continuation continuation = null;
                    if (job != null) {
                        job.cancel(null);
                    }
                    mutableState9.setValue(JobKt.launch$default(coroutineScope, null, null, new WalletHomeViewKt$WalletHome$2$3$1(scrollState, mutableState8, continuation, 2), 3));
                } else {
                    function13.invoke(PaymentDeviceCustomizationViewEvent.Close.INSTANCE);
                }
                return Unit.INSTANCE;
            case 8:
                CardWobbleState cardWobbleState = (CardWobbleState) obj7;
                float[] fArr = CardSceneEffectKt.X_AXIS;
                Quat times = ((Quat) ((MutableState) obj3).getValue()).times(cardWobbleState.wobbleRotation());
                Vector4 vector4 = (Vector4) ((State) obj6).getValue();
                Vector4 wobbleTranslation = cardWobbleState.wobbleTranslation();
                vector4.getClass();
                wobbleTranslation.getClass();
                float[] fArr2 = vector4.vector;
                float f = fArr2[0];
                float[] fArr3 = wobbleTranslation.vector;
                return new SceneUpdate((CardModelView.ViewModel) ((MutableState) obj5).getValue(), times, new Vector4(f + fArr3[0], fArr2[1] + fArr3[1], fArr2[2] + fArr3[2], fArr2[3] + fArr3[3]), (EquatableBitmap) ((State) obj4).getValue());
            case 9:
                CardScreenBounds cardScreenBounds = (CardScreenBounds) obj7;
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) obj3;
                if (((ZoomLevel) ((MutableState) obj5).getValue()) != ZoomLevel.MEDIUM || cardScreenBounds.isCentered) {
                    cardDesignLibraryScene.onTap((cardScreenBounds.left + cardScreenBounds.right) / 2.0f, (cardScreenBounds.top + cardScreenBounds.bottom) / 2.0f, parcelableSnapshotMutableIntState2.getIntValue(), parcelableSnapshotMutableIntState3.getIntValue());
                } else {
                    cardDesignLibraryScene.glLauncher.launch(new CardDesignLibraryScene$centerOnCardIndex$1(cardDesignLibraryScene, cardScreenBounds.canonicalIndex, (Continuation) null));
                }
                return Unit.INSTANCE;
            case 10:
                return ((BetterNavigator) obj7).startPresenter((Screen) obj6, (String) obj5, (Answer) obj4, (SavedState) obj3);
            case 11:
                StarStepAnimationProgressTracker starStepAnimationProgressTracker = (StarStepAnimationProgressTracker) obj6;
                Integer num3 = (Integer) obj5;
                Integer num4 = (Integer) obj4;
                Integer num5 = (Integer) obj3;
                if (((FidesmoProvisioningViewModel) obj7) instanceof FidesmoProvisioningViewModel.Scanning.InProgress) {
                    starStepAnimationProgressTracker.progressPercent = num3;
                    starStepAnimationProgressTracker.stepAnimationPercentInterval = num4;
                    starStepAnimationProgressTracker.stepAnimationTurnsPerInterval = num5;
                } else {
                    starStepAnimationProgressTracker.progressPercent = null;
                    starStepAnimationProgressTracker.stepAnimationPercentInterval = null;
                    starStepAnimationProgressTracker.stepAnimationTurnsPerInterval = null;
                }
                return Unit.INSTANCE;
            case 12:
                BlockerAction blockerAction = (BlockerAction) obj7;
                Function1 function14 = (Function1) obj6;
                State state = (State) obj5;
                String str24 = (String) obj4;
                String str25 = (String) obj3;
                if (blockerAction != null) {
                    function14.invoke(new FormViewEvent.BlockerActionViewEvent.CellDefaultClicked(blockerAction));
                }
                AccessoryCheckedState accessoryCheckedState = (AccessoryCheckedState) state.getValue();
                if (accessoryCheckedState != null) {
                    function14.invoke(new FormViewEvent.UpdateResultEvent.CellDefaultChecked(str24, accessoryCheckedState.withChecked(!accessoryCheckedState.getChecked()).getChecked(), str25));
                }
                return Unit.INSTANCE;
            case 13:
                AppletTileSectionProvider appletTileSectionProvider = (AppletTileSectionProvider) obj7;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj6;
                MutableState mutableState10 = (MutableState) obj4;
                MutableState mutableState11 = (MutableState) obj3;
                List<AppletTileSectionProvider.Element> list5 = (List) ((MutableState) obj5).getValue();
                ArrayList arrayList8 = new ArrayList();
                for (AppletTileSectionProvider.Element element : list5) {
                    if (element == null || (element instanceof AppletTileSectionProvider.Element.Loading)) {
                        appletTileItem = null;
                    } else {
                        if (!(element instanceof AppletTileSectionProvider.Element.Loaded)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        appletTileItem = ((AppletTileSectionProvider.Element.Loaded) element).item;
                    }
                    if (appletTileItem != null) {
                        arrayList8.add(appletTileItem);
                    }
                }
                zzr zzrVar = appletTileSectionProvider.clientRecommendationProvider;
                AppletTileUninstalledRowVariantProvider appletTileUninstalledRowVariantProvider = appletTileSectionProvider.uninstalledRowVariantProvider;
                Map map3 = (Map) mutableState10.getValue();
                if (map3 == null) {
                    map3 = EmptyMap.INSTANCE;
                    map3.getClass();
                }
                String str26 = (String) mutableState11.getValue();
                AndroidStringManager androidStringManager3 = appletTileSectionProvider.stringManager;
                ErrorReporter errorReporter = appletTileSectionProvider.errorReporter;
                CoroutineContext coroutineContext = appletTileSectionProvider.ioDispatcher;
                ArrayList arrayList9 = new ArrayList();
                Iterator it11 = arrayList8.iterator();
                while (it11.hasNext()) {
                    AppletTileItem appletTileItem2 = (AppletTileItem) it11.next();
                    AppletTileItem.Section section = appletTileItem2.section;
                    section.getClass();
                    if (section instanceof AppletTileItem.Section.Installed) {
                        appletTileInstallationSectionId = ((AppletTileItem.Section.Installed) section).id;
                    } else {
                        if (!(section instanceof AppletTileItem.Section.Uninstalled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        appletTileInstallationSectionId = null;
                    }
                    Pair pair = appletTileInstallationSectionId != null ? new Pair(appletTileInstallationSectionId, appletTileItem2) : null;
                    if (pair != null) {
                        arrayList9.add(pair);
                    }
                }
                List<Pair> sortedWith = CollectionsKt.sortedWith(arrayList9, new b.C0008b(zzrVar));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Pair pair2 : sortedWith) {
                    AppletTileInstallationSectionId appletTileInstallationSectionId2 = (AppletTileInstallationSectionId) pair2.first;
                    Object obj8 = linkedHashMap3.get(appletTileInstallationSectionId2);
                    if (obj8 == null) {
                        ArrayList arrayList10 = new ArrayList();
                        linkedHashMap3.put(appletTileInstallationSectionId2, arrayList10);
                        obj8 = arrayList10;
                    }
                    ((List) obj8).add((AppletTileItem) pair2.second);
                }
                ArrayList arrayList11 = new ArrayList();
                Iterator it12 = arrayList8.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        AppletTileItem appletTileItem3 = (AppletTileItem) it12.next();
                        AppletTileItem.Section section2 = appletTileItem3.section;
                        section2.getClass();
                        if (section2 instanceof AppletTileItem.Section.Installed) {
                            appletTileUninstallationSectionId = null;
                        } else if (section2 instanceof AppletTileItem.Section.Uninstalled) {
                            appletTileUninstallationSectionId = ((AppletTileItem.Section.Uninstalled) section2).id;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        Pair pair3 = appletTileUninstallationSectionId != null ? new Pair(appletTileUninstallationSectionId, appletTileItem3) : null;
                        if (pair3 != null) {
                            arrayList11.add(pair3);
                        }
                    } else {
                        List sortedBy = ComposeLayoutInfoKt.sortedBy(arrayList11, zzrVar, map3);
                        sortedBy.getClass();
                        Pair pair4 = (Pair) CollectionsKt.firstOrNull(sortedBy);
                        if (pair4 == null) {
                            linkedHashMap = linkedHashMap3;
                        } else {
                            AppletTileItem appletTileItem4 = (AppletTileItem) pair4.second;
                            int ordinal = appletTileItem4.appletId.ordinal();
                            if (ordinal == 2) {
                                i = 10;
                                copy$default = AppletTileItem.copy$default(appletTileItem4, AppletId.PROMOTED_BANKING_BENEFITS, new AppletTileItem.Section.Uninstalled(AppletTileUninstallationSectionId.DEFAULT), AppletTilePresentation.Promoted, 10);
                            } else if (ordinal != 18) {
                                copy$default = null;
                                i = 10;
                            } else {
                                i = 10;
                                copy$default = AppletTileItem.copy$default(appletTileItem4, AppletId.PROMOTED_CARD, new AppletTileItem.Section.Uninstalled(AppletTileUninstallationSectionId.DEFAULT), AppletTilePresentation.Promoted, 10);
                            }
                            if (copy$default == null) {
                                List list6 = sortedBy;
                                ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, i));
                                Iterator it13 = list6.iterator();
                                int i10 = 0;
                                while (it13.hasNext()) {
                                    Object next = it13.next();
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    Pair pair5 = (Pair) next;
                                    if (i10 == 0) {
                                        it = it13;
                                        linkedHashMap2 = linkedHashMap3;
                                        pair5 = new Pair(pair5.first, AppletTileItem.copy$default((AppletTileItem) pair5.second, null, null, AppletTilePresentation.Promoted, 15));
                                    } else {
                                        it = it13;
                                        linkedHashMap2 = linkedHashMap3;
                                    }
                                    arrayList12.add(pair5);
                                    it13 = it;
                                    i10 = i11;
                                    linkedHashMap3 = linkedHashMap2;
                                }
                                linkedHashMap = linkedHashMap3;
                                sortedBy = arrayList12;
                            } else {
                                linkedHashMap = linkedHashMap3;
                                sortedBy = CollectionsKt.plus((Collection) sortedBy, (Object) new Pair(AppletTileUninstallationSectionId.DEFAULT, copy$default));
                            }
                        }
                        List<Pair> sortedBy2 = ComposeLayoutInfoKt.sortedBy(CollectionsKt.plus((Iterable) appletTileUninstalledRowVariantProvider.rowVariants(arrayList8, sortedBy), (Collection) sortedBy), zzrVar, map3);
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Pair pair6 : sortedBy2) {
                            AppletTileUninstallationSectionId appletTileUninstallationSectionId2 = (AppletTileUninstallationSectionId) pair6.first;
                            Object obj9 = linkedHashMap4.get(appletTileUninstallationSectionId2);
                            if (obj9 == null) {
                                obj9 = new ArrayList();
                                linkedHashMap4.put(appletTileUninstallationSectionId2, obj9);
                            }
                            ((List) obj9).add((AppletTileItem) pair6.second);
                        }
                        List list7 = MapsKt___MapsKt.toList(linkedHashMap4);
                        JobKt.launch$default(coroutineScope2, coroutineContext, null, new GenieViewKt$GenieView$1$1(list7, errorReporter, null, 11), 2);
                        List<Pair> list8 = list7;
                        if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                            Iterator it14 = list8.iterator();
                            while (it14.hasNext()) {
                                Iterable iterable = (Iterable) ((Pair) it14.next()).second;
                                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                    Iterator it15 = iterable.iterator();
                                    while (it15.hasNext()) {
                                        if (((AppletTileItem) it15.next()).appletId == AppletId.CARD) {
                                            z3 = true;
                                            arrayList = new ArrayList(linkedHashMap.size());
                                            it2 = linkedHashMap.entrySet().iterator();
                                            while (true) {
                                                hasNext = it2.hasNext();
                                                layout = Section.Layout.CardStack.INSTANCE;
                                                if (!hasNext) {
                                                    ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                                    for (Pair pair7 : list8) {
                                                        AppletTileUninstallationSectionId appletTileUninstallationSectionId3 = (AppletTileUninstallationSectionId) pair7.first;
                                                        List list9 = (List) pair7.second;
                                                        int ordinal2 = appletTileUninstallationSectionId3.ordinal();
                                                        if (ordinal2 == 0) {
                                                            sectionId = SectionId.CARD_UNINSTALLED;
                                                        } else if (ordinal2 == 1) {
                                                            sectionId = SectionId.APPLET_UNINSTALLED_BANKING;
                                                        } else if (ordinal2 == 2) {
                                                            sectionId = SectionId.APPLET_UNINSTALLED_EXPLORE_BUSINESS;
                                                        } else if (ordinal2 == 3) {
                                                            sectionId = SectionId.APPLET_UNINSTALLED_EXPLORE;
                                                        } else {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        }
                                                        int ordinal3 = appletTileUninstallationSectionId3.ordinal();
                                                        if (ordinal3 == 0) {
                                                            layout2 = layout;
                                                        } else if (ordinal3 == 1 || ordinal3 == 2) {
                                                            layout2 = new Section.Layout.VerticalStack(new Dp(RecyclerView.DECELERATION_RATE), null, 5);
                                                        } else {
                                                            if (ordinal3 != 3) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                            }
                                                            layout2 = new Section.Layout.VerticalStack(new Dp(RecyclerView.DECELERATION_RATE), null, 5);
                                                        }
                                                        int ordinal4 = appletTileUninstallationSectionId3.ordinal();
                                                        if (ordinal4 == 0) {
                                                            header = null;
                                                        } else if (ordinal4 == 1) {
                                                            header = new Section.Header.Spacer(8.0f);
                                                        } else if (ordinal4 == 2 || ordinal4 == 3) {
                                                            header = new Section.Header.DividerWithText(str26 == null ? androidStringManager3.get(R.string.uninstalled_header_more_for_you) : str26, null, 30);
                                                        } else {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        }
                                                        arrayList13.add(new AppletTileSection(sectionId, list9, layout2, header));
                                                    }
                                                    return CollectionsKt.plus((Iterable) arrayList13, (Collection) arrayList);
                                                }
                                                Map.Entry entry = (Map.Entry) it2.next();
                                                AppletTileInstallationSectionId appletTileInstallationSectionId3 = (AppletTileInstallationSectionId) entry.getKey();
                                                List list10 = (List) entry.getValue();
                                                int ordinal5 = appletTileInstallationSectionId3.ordinal();
                                                if (ordinal5 == 0) {
                                                    sectionId2 = SectionId.CARD_INSTALLED;
                                                } else if (ordinal5 == 1) {
                                                    sectionId2 = SectionId.APPLET_INSTALLED_BANKING_GROUPED;
                                                } else if (ordinal5 == 2) {
                                                    sectionId2 = SectionId.APPLET_INSTALLED_BALANCE;
                                                } else if (ordinal5 == 3) {
                                                    sectionId2 = SectionId.APPLET_INSTALLED_SERVICE;
                                                } else {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                }
                                                int ordinal6 = appletTileInstallationSectionId3.ordinal();
                                                if (ordinal6 == 0) {
                                                    i2 = 3;
                                                } else if (ordinal6 != 1) {
                                                    i2 = 3;
                                                    if (ordinal6 == 2 || ordinal6 == 3) {
                                                        layout = new Section.Layout.VerticalStack(null, new Dp(16.0f), 3);
                                                    } else {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    }
                                                } else {
                                                    i2 = 3;
                                                    layout = new Section.Layout.GroupedVerticalStack(z3);
                                                }
                                                int ordinal7 = appletTileInstallationSectionId3.ordinal();
                                                if (ordinal7 == 0 || ordinal7 == 1) {
                                                    spacer = null;
                                                } else if (ordinal7 == 2 || ordinal7 == i2) {
                                                    spacer = new Section.Header.Spacer(16.0f);
                                                } else {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                }
                                                arrayList.add(new AppletTileSection(sectionId2, list10, layout, spacer));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList flatten = CollectionsKt__IterablesKt.flatten(linkedHashMap.values());
                        if (!flatten.isEmpty()) {
                            Iterator it16 = flatten.iterator();
                            while (it16.hasNext()) {
                                if (((AppletTileItem) it16.next()).appletId == AppletId.CARD) {
                                    z3 = true;
                                    arrayList = new ArrayList(linkedHashMap.size());
                                    it2 = linkedHashMap.entrySet().iterator();
                                    while (true) {
                                        hasNext = it2.hasNext();
                                        layout = Section.Layout.CardStack.INSTANCE;
                                        if (!hasNext) {
                                        }
                                        arrayList.add(new AppletTileSection(sectionId2, list10, layout, spacer));
                                    }
                                }
                            }
                        }
                        z3 = false;
                        arrayList = new ArrayList(linkedHashMap.size());
                        it2 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            hasNext = it2.hasNext();
                            layout = Section.Layout.CardStack.INSTANCE;
                            if (!hasNext) {
                            }
                            arrayList.add(new AppletTileSection(sectionId2, list10, layout, spacer));
                        }
                    }
                }
                return null;
            case 14:
                AppletTileSectionProvider appletTileSectionProvider2 = (AppletTileSectionProvider) obj7;
                Applet applet = (Applet) obj6;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj5;
                AppletTile appletTile = (AppletTile) applet.tileBuilder.invoke(appletTileSectionProvider2.navigator, coroutineScope3);
                AppletId appletId = applet.id;
                Continuation continuation2 = null;
                return StateFlowKt.combineState(FlowKt.stateIn(FlowKt.transformLatest(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new GenieViewKt$GenieView$1$1(appletTileSectionProvider2, appletId, continuation2, i5), appletTile.getInstallationState()), new PaymentActionHandler$transform$$inlined$flatMapLatest$2(appletTileSectionProvider2, appletId, appletTile, continuation2, 4)), coroutineScope3, SharingStarted.Companion.Lazily, AppletTileSectionProvider.section(appletTile, (AppletTileInstallationState) appletTile.getInstallationState().getValue()).getValue()), (DerivedStateFlow) obj4, (StateFlow) obj3, new PoolToastKt$$ExternalSyntheticLambda0(i4, (Object) appletId, (Object) appletTileSectionProvider2, (Object) appletTile));
            case 15:
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj6;
                Haptics haptics = (Haptics) obj5;
                Function1 function15 = (Function1) obj4;
                ActionCardViewEvent actionCardViewEvent = (ActionCardViewEvent) obj3;
                if (((ActionCardViewModel) obj7).buttonGroup == null) {
                    realHapticVibrator.vibrate(haptics.input.standard);
                    function15.invoke(actionCardViewEvent);
                }
                return Unit.INSTANCE;
            case 16:
                RealHapticVibrator realHapticVibrator2 = (RealHapticVibrator) obj7;
                Function1 function16 = (Function1) obj6;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj4;
                MutableState mutableState12 = (MutableState) obj3;
                if (!StringsKt.isBlank(((TextFieldValue) mutableState12.getValue()).annotatedString.text)) {
                    realHapticVibrator2.getClass();
                    realHapticVibrator2.vibrator.vibrate(WindowCompat$Api35Impl.access$InputStandard$lambda$1());
                    function16.invoke(((TextFieldValue) mutableState12.getValue()).annotatedString.text);
                    focusOwnerImpl.clearFocus(false);
                    if (delegatingSoftwareKeyboardController2 != null) {
                        delegatingSoftwareKeyboardController2.hide();
                    }
                    mutableState12.setValue(new TextFieldValue("", 0L, 6));
                }
                return Unit.INSTANCE;
            case 17:
                RealCashVibrator realCashVibrator2 = (RealCashVibrator) obj5;
                Shaker shaker2 = (Shaker) obj4;
                Function1 function17 = (Function1) obj3;
                BigDecimal bigDecimalOrNull = StringsKt__StringNumberConversionsJVMKt.toBigDecimalOrNull(((AmountDisplayState) obj7).getRawAmount());
                AmountPickerViewModel.Ready.Amount amount = ((AmountPickerViewModel.Ready) obj6).minAmount;
                AmountPickerViewModel.Ready.Amount.PercentAmount percentAmount = amount instanceof AmountPickerViewModel.Ready.Amount.PercentAmount ? (AmountPickerViewModel.Ready.Amount.PercentAmount) amount : null;
                BigDecimal bigDecimal = percentAmount != null ? percentAmount.percent : null;
                if (bigDecimalOrNull == null || (bigDecimal != null && bigDecimalOrNull.compareTo(bigDecimal) < 0)) {
                    if (realCashVibrator2 != null) {
                        realCashVibrator2.error();
                    }
                    shaker2.shake();
                } else {
                    function17.invoke(new AmountPickerViewEvent$Full$PercentSubmitted(bigDecimalOrNull));
                }
                return Unit.INSTANCE;
            case 18:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj6;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj5;
                Function2 function2 = (Function2) obj4;
                State state2 = (State) obj3;
                if (!((Ref$BooleanRef) obj7).element) {
                    return Unit.INSTANCE;
                }
                Float f2 = (Float) ref$ObjectRef.element;
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    intValue = ((Number) state2.getValue()).intValue();
                    function2.invoke(Integer.valueOf(intValue), Float.valueOf(floatValue));
                }
                ref$ObjectRef.element = null;
                ref$ObjectRef2.element = null;
                return Unit.INSTANCE;
            case 19:
                return ((ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5) obj7).invoke(((StateFlow) obj6).getValue(), ((Function0) ((DerivedStateFlow) obj5).getValue).invoke(), ((StateFlow) obj4).getValue(), ((StateFlow) obj3).getValue());
            case 20:
                GovernmentIdWorkflow governmentIdWorkflow = (GovernmentIdWorkflow) obj7;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj6;
                TrackingEventsLogger.DefaultImpls.logGovernmentIdButtonClickEvent$default(governmentIdWorkflow.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda78((GovernmentIdState) obj5, (GovernmentIdWorkflow.Input) obj4, obj3, renderContext, (Object) governmentIdWorkflow, 4)));
                return Unit.INSTANCE;
            case 21:
                IdConfig idConfig = (IdConfig) obj7;
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = (GovernmentIdState.AutoClassificationManualSelect) obj6;
                StatefulWorkflow.RenderContext renderContext2 = (StatefulWorkflow.RenderContext) obj5;
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) obj4;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj3;
                if (idConfig == null) {
                    return Unit.INSTANCE;
                }
                GovernmentIdWorkflowUtilsKt.moveToNextStep$default(autoClassificationManualSelect, renderContext2, input, null, idConfig, pOPMatchingFactory, autoClassificationManualSelect.cameraProperties, false, idConfig.parts, -1, autoClassificationManualSelect.selectedCountryCode, 1152);
                return Unit.INSTANCE;
            default:
                IdConfig idConfig2 = (IdConfig) obj7;
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect2 = (GovernmentIdState.AutoClassificationManualSelect) obj6;
                SubtreeManager subtreeManager = (SubtreeManager) obj5;
                GovernmentIdWorkflow.Input input2 = (GovernmentIdWorkflow.Input) obj4;
                POPMatchingFactory pOPMatchingFactory2 = (POPMatchingFactory) obj3;
                if (idConfig2 == null) {
                    return Unit.INSTANCE;
                }
                GovernmentIdStateManagerUtilsKt.moveToNextStep$default(autoClassificationManualSelect2, subtreeManager, input2, null, idConfig2, pOPMatchingFactory2, autoClassificationManualSelect2.cameraProperties, false, idConfig2.parts, -1, autoClassificationManualSelect2.selectedCountryCode, 1152);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ta$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }
}
