package com.squareup.cash.formview.components;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.platform.ComposeView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.formview.components.LocalImageType;
import com.squareup.cash.formview.components.arcade.ArcadeFormAddressView;
import com.squareup.cash.formview.components.arcade.ArcadeFormBadgedAvatar;
import com.squareup.cash.formview.components.arcade.ArcadeFormCaptionedTile;
import com.squareup.cash.formview.components.arcade.ArcadeFormCheckBoxView;
import com.squareup.cash.formview.components.arcade.ArcadeFormCopyableElementGroup;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyInput;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormProfilePreview;
import com.squareup.cash.formview.components.arcade.ArcadeFormSelectableInput;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeSelectableRow;
import com.squareup.cash.formview.components.arcade.CollapseWhitespaceTransformation;
import com.squareup.cash.formview.components.arcade.EmojiAwareMaxLengthTransformation;
import com.squareup.cash.formview.components.arcade.InvalidInput;
import com.squareup.cash.formview.components.arcade.NewlinesToSpacesTransformation;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.presenters.FormDateInputPresenter;
import com.squareup.cash.formview.viewmodels.ClientScenarioAndFlowToken;
import com.squareup.cash.formview.viewmodels.FormTextInputIconViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.util.android.Views;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final class FormElementViewBuilder {
    public final PlacesAddressSearcher addressSearcher;
    public final FormCashtagPresenter.Factory cashtagPresenterFactory;
    public final ClientScenarioAndFlowToken clientScenarioAndFlowToken;
    public final Context context;
    public final FormDateInputPresenter.Factory formDateInputPresenterFactory;
    public final boolean hasAccentColor;
    public final RealImageLoader imageLoader;
    public final CoroutineContext ioDispatcher;
    public final LocalImageFinder localImageFinder;
    public final MoneyFormatter moneyFormatter;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final AndroidStringManager stringManager;
    public final RealStyledCardPresenter$Factory$Impl styledCardPresenterFactory;
    public final String submitActionId;
    public final SyncValueReader syncValueReader;
    public final MutableSharedFlow viewEvents;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.TimelineElement.Event.Icon.values().length];
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.HIGHLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.SKIPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.ALERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.HIGHLIGHT_COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.CANCELED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FormBlocker.Element.TimelineElement.Event.Icon.REFUNDED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FormElementViewBuilder(FormCashtagPresenter.Factory factory, FormDateInputPresenter.Factory factory2, RealStyledCardPresenter$Factory$Impl realStyledCardPresenter$Factory$Impl, RealImageLoader realImageLoader, LocalizedMoneyFormatter.Factory factory3, PlacesAddressSearcher placesAddressSearcher, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, CoroutineContext coroutineContext, LinearLayout linearLayout, SharedFlowImpl sharedFlowImpl, Context context, String str, boolean z, ClientScenarioAndFlowToken clientScenarioAndFlowToken) {
        sharedFlowImpl.getClass();
        context.getClass();
        this.cashtagPresenterFactory = factory;
        this.formDateInputPresenterFactory = factory2;
        this.styledCardPresenterFactory = realStyledCardPresenter$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.moneyFormatterFactory = factory3;
        this.addressSearcher = placesAddressSearcher;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.ioDispatcher = coroutineContext;
        this.viewEvents = sharedFlowImpl;
        this.context = context;
        this.submitActionId = str;
        this.hasAccentColor = z;
        this.clientScenarioAndFlowToken = clientScenarioAndFlowToken;
        ThemeHelpersKt.findThemeInfo(context);
        this.localImageFinder = new LocalImageFinder(context);
        this.moneyFormatter = factory3.create(MoneyFormatterConfig.COMPACT);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ComposeView toView(FormBlocker.Element.TimelineElement timelineElement) {
        Integer num;
        Timeline.CollapseRanges collapseRanges;
        ImmutableList immutableList;
        Timeline.CollapseRanges collapseRanges2;
        IntRange until;
        TimelineItem.State state;
        Integer num2;
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        FormBlocker.Element.TimelineElement.CollapseRule collapseRule = timelineElement.collapse_rule;
        if (collapseRule != null) {
            FormBlocker.Element.TimelineElement.CollapseRule.CollapsedSize collapsedSize = collapseRule instanceof FormBlocker.Element.TimelineElement.CollapseRule.CollapsedSize ? (FormBlocker.Element.TimelineElement.CollapseRule.CollapsedSize) collapseRule : null;
            if (collapsedSize != null) {
                num = Integer.valueOf(collapsedSize.getValue());
                if (num == null) {
                    FormBlocker.Element.TimelineElement.CollapseRule collapseRule2 = timelineElement.collapse_rule;
                    if (collapseRule2 != null) {
                        FormBlocker.Element.TimelineElement.CollapseRule.CollapsedSize collapsedSize2 = collapseRule2 instanceof FormBlocker.Element.TimelineElement.CollapseRule.CollapsedSize ? (FormBlocker.Element.TimelineElement.CollapseRule.CollapsedSize) collapseRule2 : null;
                        if (collapsedSize2 != null) {
                            num2 = Integer.valueOf(collapsedSize2.getValue());
                            num2.getClass();
                            immutableList = Tags.persistentListOf(new TimelineState.CollapseRange(null, new IntRange(num2.intValue(), Integer.MAX_VALUE, 1)));
                        }
                    }
                    num2 = null;
                    num2.getClass();
                    immutableList = Tags.persistentListOf(new TimelineState.CollapseRange(null, new IntRange(num2.intValue(), Integer.MAX_VALUE, 1)));
                } else {
                    FormBlocker.Element.TimelineElement.CollapseRule collapseRule3 = timelineElement.collapse_rule;
                    if (collapseRule3 != null) {
                        FormBlocker.Element.TimelineElement.CollapseRule.CollapseRanges collapseRanges3 = collapseRule3 instanceof FormBlocker.Element.TimelineElement.CollapseRule.CollapseRanges ? (FormBlocker.Element.TimelineElement.CollapseRule.CollapseRanges) collapseRule3 : null;
                        if (collapseRanges3 != null) {
                            collapseRanges = collapseRanges3.getValue();
                            if (collapseRanges == null) {
                                FormBlocker.Element.TimelineElement.CollapseRule collapseRule4 = timelineElement.collapse_rule;
                                if (collapseRule4 != null) {
                                    FormBlocker.Element.TimelineElement.CollapseRule.CollapseRanges collapseRanges4 = collapseRule4 instanceof FormBlocker.Element.TimelineElement.CollapseRule.CollapseRanges ? (FormBlocker.Element.TimelineElement.CollapseRule.CollapseRanges) collapseRule4 : null;
                                    if (collapseRanges4 != null) {
                                        collapseRanges2 = collapseRanges4.getValue();
                                        collapseRanges2.getClass();
                                        List<Timeline.CollapseRanges.Range> list = collapseRanges2.ranges;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        for (Timeline.CollapseRanges.Range range : list) {
                                            if (range.collapse_end_index == null) {
                                                Integer num3 = range.collapse_start_index;
                                                num3.getClass();
                                                until = new IntRange(num3.intValue(), Integer.MAX_VALUE, 1);
                                            } else {
                                                Integer num4 = range.collapse_start_index;
                                                num4.getClass();
                                                int intValue = num4.intValue();
                                                Integer num5 = range.collapse_end_index;
                                                num5.getClass();
                                                until = RangesKt___RangesKt.until(intValue, num5.intValue());
                                            }
                                            LocalizedString localizedString = range.label;
                                            arrayList.add(new TimelineState.CollapseRange(localizedString != null ? StringsKt.translated(localizedString) : null, until));
                                        }
                                        immutableList = Tags.toPersistentList(arrayList);
                                    }
                                }
                                collapseRanges2 = null;
                                collapseRanges2.getClass();
                                List<Timeline.CollapseRanges.Range> list2 = collapseRanges2.ranges;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                while (r13.hasNext()) {
                                }
                                immutableList = Tags.toPersistentList(arrayList2);
                            } else {
                                immutableList = SmallPersistentVector.EMPTY;
                            }
                        }
                    }
                    collapseRanges = null;
                    if (collapseRanges == null) {
                    }
                }
                List<FormBlocker.Element.TimelineElement.Event> list3 = timelineElement.events;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (FormBlocker.Element.TimelineElement.Event event : list3) {
                    FormBlocker.Element.TimelineElement.Event.Icon icon = event.icon;
                    icon.getClass();
                    switch (WhenMappings.$EnumSwitchMapping$0[icon.ordinal()]) {
                        case 1:
                            state = TimelineItem.State.NotStarted;
                            break;
                        case 2:
                            state = TimelineItem.State.Incomplete;
                            break;
                        case 3:
                            state = TimelineItem.State.Skipped;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            state = TimelineItem.State.Done;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                    TimelineItem.State state2 = state;
                    String str = event.title;
                    str.getClass();
                    arrayList3.add(LazyListLayoutInfoKt.TimelineItem$default(state2, str, event.detail_text, event.inline_description_text, null, null, 112));
                }
                composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda27(immutableList, Tags.toPersistentList(arrayList3), 0), true, -1723220833));
                return composeView;
            }
        }
        num = null;
        if (num == null) {
        }
        List<FormBlocker.Element.TimelineElement.Event> list32 = timelineElement.events;
        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
        while (r14.hasNext()) {
        }
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda27(immutableList, Tags.toPersistentList(arrayList32), 0), true, -1723220833));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.FixedSpacerElement fixedSpacerElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda4(fixedSpacerElement), true, 1753057086));
        return composeView;
    }

    public final ArcadeFormButtonView toView(FormBlocker.Element.ButtonElement buttonElement) {
        return new ArcadeFormButtonView(this.context, new FormElementViewBuilder$toView$2(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), buttonElement);
    }

    public final View toView(FormBlocker.Element.LocalImageElement localImageElement) {
        LocalImageType find = this.localImageFinder.find(localImageElement);
        int i = 0;
        if (find instanceof LocalImageType.ArcadeComposable) {
            ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
            composeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda14((LocalImageType.ArcadeComposable) find, i), true, 265770950));
            return composeView;
        }
        if (find instanceof LocalImageType.ArcadeIcon) {
            ComposeView composeView2 = new ComposeView(this.context, null, 0, 6, null);
            composeView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            composeView2.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda15((LocalImageType.ArcadeIcon) find, i), true, 1204495599));
            return composeView2;
        }
        boolean z = find instanceof LocalImageType.MooncakeIcon;
        Context context = this.context;
        if (z) {
            return new MooncakeLargeIcon(context, null, ((LocalImageType.MooncakeIcon) find).icon, 2);
        }
        if (find instanceof LocalImageType.HeroImage) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            LocalImageType.HeroImage heroImage = (LocalImageType.HeroImage) find;
            int i2 = heroImage.resourceId;
            Integer num = heroImage.tint;
            if (num != null) {
                Context context2 = appCompatImageView.getContext();
                context2.getClass();
                appCompatImageView.setImageDrawable(PlatformKt.getDrawableCompat(context2, i2, num));
            } else {
                appCompatImageView.setImageResource(i2);
            }
            appCompatImageView.setScaleType(heroImage.scaleType);
            return appCompatImageView;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final ComposeView toView(FormBlocker.Element.RemoteImageElement remoteImageElement, ColorModel colorModel) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda1(this, colorModel, remoteImageElement), true, -1476842961));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.MoneyElement moneyElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(18, moneyElement, this), true, 173539134));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.CallToActionElement callToActionElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(17, callToActionElement, this), true, 1722315245));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.TextElement textElement, FormBlocker.Element element) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormRemoteImageKt$$ExternalSyntheticLambda0(10, this, element, textElement), true, 1658504795));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.LegalTextElement legalTextElement, ColorPalette colorPalette) {
        colorPalette.getClass();
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(21, legalTextElement, this), true, 568413996));
        return composeView;
    }

    public final FormCustomizedCardView toView(FormBlocker.Element.CustomizedCardElement customizedCardElement) {
        CardCustomizationData cardCustomizationData = customizedCardElement.card_customization;
        cardCustomizationData.getClass();
        FormCustomizedCardView formCustomizedCardView = new FormCustomizedCardView(cardCustomizationData, this.styledCardPresenterFactory, this.context);
        formCustomizedCardView.setClipChildren(false);
        return formCustomizedCardView;
    }

    public final ArcadeFormAddressView toView(FormBlocker.Element.AddressElement addressElement, String str) {
        Country country = addressElement.country_code;
        if (country == null) {
            country = Country.US;
        }
        Country country2 = country;
        LocationType locationType = LocationType.Address;
        FormElementViewBuilder$toView$12 formElementViewBuilder$toView$12 = new FormElementViewBuilder$toView$12(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
        GlobalAddress globalAddress = addressElement.prefill_address;
        Boolean bool = addressElement.autocomplete;
        PlacesAddressSearcher placesAddressSearcher = bool != null ? bool.booleanValue() : true ? this.addressSearcher : null;
        Boolean bool2 = addressElement.autofill;
        return new ArcadeFormAddressView(this.context, country2, str, locationType, formElementViewBuilder$toView$12, globalAddress, placesAddressSearcher, bool2 != null ? bool2.booleanValue() : false);
    }

    public final ArcadeFormOptionPickerView toView(FormBlocker.Element.OptionPickerElement optionPickerElement, String str) {
        ArcadeFormOptionPickerView arcadeFormOptionPickerView = new ArcadeFormOptionPickerView(this.context, str, optionPickerElement);
        arcadeFormOptionPickerView.setModel(Unit.INSTANCE);
        arcadeFormOptionPickerView.setEventReceiver(new FormElementViewBuilder$toView$14(this.viewEvents));
        return arcadeFormOptionPickerView;
    }

    public final ArcadeFormTextInputGroupView toView(FormBlocker.Element.TextInputElement textInputElement, String str, ColorPalette colorPalette) {
        FormTextInputIconViewModel formTextInputIconViewModel;
        colorPalette.getClass();
        List<FormBlocker.Element.TextInputElement.InputField> list = textInputElement.input_fields;
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormBlocker.Element.TextInputElement.InputField inputField = (FormBlocker.Element.TextInputElement.InputField) it.next();
            inputField.getClass();
            FormBlocker.Element.TextInputElement.InputField.TrailingFieldAccessory trailingFieldAccessory = inputField.trailing_field_accessory;
            int i2 = trailingFieldAccessory == null ? -1 : FormElementViewBuilderKt$WhenMappings.$EnumSwitchMapping$1[trailingFieldAccessory.ordinal()];
            if (i2 == 1) {
                if (inputField.security == FormBlocker.Element.TextInputElement.Security.SECURE) {
                    formTextInputIconViewModel = FormTextInputIconViewModel.SHOW_HIDE;
                }
                formTextInputIconViewModel = null;
            } else if (i2 == 2) {
                if (inputField.security == FormBlocker.Element.TextInputElement.Security.SECURE) {
                    formTextInputIconViewModel = FormTextInputIconViewModel.LOCK;
                }
                formTextInputIconViewModel = null;
            } else if (i2 != 3) {
                if (inputField.security == FormBlocker.Element.TextInputElement.Security.SECURE) {
                    FormBlocker.Element.TextInputElement.InputField.SecureFieldAccessory secureFieldAccessory = inputField.secure_field_accessory;
                    int i3 = secureFieldAccessory == null ? -1 : FormElementViewBuilderKt$WhenMappings.$EnumSwitchMapping$0[secureFieldAccessory.ordinal()];
                    if (i3 != -1 && i3 != 1) {
                        if (i3 == 2) {
                            formTextInputIconViewModel = FormTextInputIconViewModel.SHOW_HIDE;
                        } else if (i3 == 3) {
                            formTextInputIconViewModel = FormTextInputIconViewModel.LOCK;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                }
                formTextInputIconViewModel = null;
            } else {
                formTextInputIconViewModel = FormTextInputIconViewModel.CLEAR;
            }
            String str2 = inputField.prefill_text;
            String str3 = inputField.hint_text;
            String str4 = inputField.label_text;
            FormBlocker.Element.TextInputElement.KeyboardType keyboardType = inputField.keyboardType;
            FormBlocker.Element.TextInputElement.Security security = inputField.security;
            List<FormBlocker.Element.TextInputElement.Validation> list2 = inputField.validations;
            EmptyList emptyList = EmptyList.INSTANCE;
            boolean z = !Intrinsics.areEqual(inputField.disabled, Boolean.TRUE);
            FormBlocker.Element.TextInputElement.InputField.AutofillContentType autofillContentType = inputField.autofill_content_type;
            FormBlocker.Element.TextInputElement.InputField.CapitalizationType capitalizationType = inputField.capitalization;
            List<FormBlocker.Element.TextInputElement.InputField.InvalidInput> list3 = inputField.invalid_inputs;
            Iterator it2 = it;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                FormBlocker.Element.TextInputElement.InputField.InvalidInput invalidInput = (FormBlocker.Element.TextInputElement.InputField.InvalidInput) it3.next();
                String str5 = invalidInput.regex;
                Iterator it4 = it3;
                arrayList2.add(new InvalidInput(invalidInput.message, str5 != null ? new Regex(str5) : null));
                it3 = it4;
            }
            arrayList.add(new ArcadeFormTextInputGroupView.InputFieldModel(formTextInputIconViewModel, str2, str3, str4, null, null, keyboardType, security, list2, true, false, emptyList, z, autofillContentType, capitalizationType, arrayList2));
            it = it2;
            i = 10;
        }
        return new ArcadeFormTextInputGroupView(this.context, arrayList, textInputElement.security_text, new FormElementViewBuilder$toView$16(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), new FormElementViewBuilder$$ExternalSyntheticLambda12(this, 1), str);
    }

    public final ArcadeFormEmojiPicker toView(FormBlocker.Element.EmojiPickerElement emojiPickerElement, String str) {
        FormElementViewBuilder$toView$18 formElementViewBuilder$toView$18 = new FormElementViewBuilder$toView$18(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
        if (str == null) {
            str = "";
        }
        return new ArcadeFormEmojiPicker(this.context, emojiPickerElement, formElementViewBuilder$toView$18, str);
    }

    public final ArcadeFormTextInputGroupView toView(FormBlocker.Element.MultilineTextInputElement multilineTextInputElement, String str) {
        String str2 = multilineTextInputElement.prefill_text;
        String str3 = multilineTextInputElement.hint_text;
        String str4 = multilineTextInputElement.label_text;
        Integer num = multilineTextInputElement.min_character_count;
        Integer num2 = multilineTextInputElement.max_character_count;
        Boolean bool = multilineTextInputElement.is_required;
        Boolean bool2 = Boolean.TRUE;
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(Intrinsics.areEqual(bool, bool2) ? ArcadeFormTextInputGroupViewKt.RequiredFieldValidation : null);
        Boolean bool3 = multilineTextInputElement.is_required;
        boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
        NewlinesToSpacesTransformation newlinesToSpacesTransformation = Intrinsics.areEqual(multilineTextInputElement.disallow_newlines, bool2) ? NewlinesToSpacesTransformation.INSTANCE : null;
        CollapseWhitespaceTransformation collapseWhitespaceTransformation = Intrinsics.areEqual(multilineTextInputElement.collapse_whitespace, bool2) ? CollapseWhitespaceTransformation.INSTANCE : null;
        Integer num3 = multilineTextInputElement.max_character_count;
        return new ArcadeFormTextInputGroupView(this.context, CollectionsKt__CollectionsJVMKt.listOf(new ArcadeFormTextInputGroupView.InputFieldModel(null, str2, str3, str4, num, num2, null, null, listOfNotNull, false, booleanValue, ArraysKt___ArraysKt.filterNotNull(new Function1[]{newlinesToSpacesTransformation, collapseWhitespaceTransformation, num3 != null ? new EmojiAwareMaxLengthTransformation(num3.intValue()) : null}), true, FormBlocker.Element.TextInputElement.InputField.AutofillContentType.DISABLED, FormBlocker.Element.TextInputElement.InputField.CapitalizationType.SENTENCES, EmptyList.INSTANCE)), null, new FormElementViewBuilder$toView$19(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), new FormElementViewBuilder$$ExternalSyntheticLambda12(this, 0), str);
    }

    public final ComposeView toView(FormBlocker.Element.DetailRowElement detailRowElement, ListUnorderedState listUnorderedState) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormRemoteImageKt$$ExternalSyntheticLambda0(9, detailRowElement, listUnorderedState, this), true, 64424326));
        return composeView;
    }

    public final FormCashtag toView(FormBlocker.Element.CashtagElement cashtagElement, String str) {
        if (this.clientScenarioAndFlowToken != null) {
            return new FormCashtag(this.cashtagPresenterFactory, str, cashtagElement, new ContextThemeWrapper(this.context, this.hasAccentColor ? R.style.TextAppearance_Cash_Input_PlainAccent : R.style.TextAppearance_Cash_Input), this.clientScenarioAndFlowToken);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot use FormCashtag without a ClientScenarioAndFlowToken");
        return null;
    }

    public final ArcadeFormDateInputView toView(FormBlocker.Element.DateInputElement dateInputElement, String str) {
        return new ArcadeFormDateInputView(dateInputElement, str, new FormElementViewBuilder$toView$23(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), this.formDateInputPresenterFactory, this.context);
    }

    public final ArcadeFormBadgedAvatar toView(FormBlocker.Element.AvatarElement avatarElement) {
        return new ArcadeFormBadgedAvatar(this.context, avatarElement, this.imageLoader);
    }

    public final ArcadeSelectableRow toView(FormBlocker.Element.SelectableRowElement selectableRowElement) {
        return new ArcadeSelectableRow(this.context, selectableRowElement, new FormElementViewBuilder$toView$24(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), this.imageLoader);
    }

    public final Space toView(FormBlocker.Element.SpacerElement spacerElement, int i) {
        Space space = new Space(this.context);
        space.setMinimumHeight(i);
        return space;
    }

    public final ComposeView toView(FormBlocker.Element.TimelineCardListElement timelineCardListElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(19, timelineCardListElement, this), true, -262959091));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.DividerElement dividerElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        byte b = 0;
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda25(dividerElement, b, b), true, -1419082409));
        return composeView;
    }

    public final ArcadeFormCaptionedTile toView(FormBlocker.Element.CaptionedTileElement captionedTileElement) {
        return new ArcadeFormCaptionedTile(this.context, captionedTileElement, this.imageLoader);
    }

    public final ComposeView toView(FormBlocker.Element.HeroElement heroElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda16(heroElement, 0), true, 203634712));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.HeroHeaderElement heroHeaderElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda17(heroHeaderElement, 0), true, 751413765));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.HeroNumericsHeaderElement heroNumericsHeaderElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda18(heroNumericsHeaderElement, 0), true, 1329778987));
        return composeView;
    }

    public final CardFormElementView toView(FormBlocker.Element.CardElement cardElement) {
        Context context = this.context;
        context.getClass();
        CardFormElementView cardFormElementView = new CardFormElementView(context);
        Integer num = cardElement.width;
        num.getClass();
        int dip = Views.dip((View) cardFormElementView, num.intValue());
        Integer num2 = cardElement.height;
        num2.getClass();
        int dip2 = Views.dip((View) cardFormElementView, num2.intValue());
        cardFormElementView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Views.waitForMeasure$default(cardFormElementView, new CardFormElementView$$ExternalSyntheticLambda0(dip, dip2, cardFormElementView, this.imageLoader, context, cardElement));
        return cardFormElementView;
    }

    public final ArcadeFormMoneyInput toView(FormBlocker.Element.MoneyInputElement moneyInputElement, String str) {
        return new ArcadeFormMoneyInput(this.context, moneyInputElement, new FormElementViewBuilder$toView$31(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), this.moneyFormatter, str, this.stringManager, this.ioDispatcher);
    }

    public final ComposeView toView(FormBlocker.Element.NoticeElement noticeElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda10(noticeElement, 0), true, 730519414));
        return composeView;
    }

    public final ArcadeFormCopyableElementGroup toView(FormBlocker.Element.CopyableElementGroup copyableElementGroup) {
        return new ArcadeFormCopyableElementGroup(this.context, copyableElementGroup);
    }

    public final ComposeView toView(FormBlocker.Element.FamilyUpsellElement familyUpsellElement) {
        return toView(new FormBlocker.Element.UpsellElement(familyUpsellElement.title, familyUpsellElement.subtitle, familyUpsellElement.image_width, familyUpsellElement.image_height, familyUpsellElement.image, null, null, null, null, null, 992, null));
    }

    public final ComposeView toView(FormBlocker.Element.UpsellElement upsellElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(20, upsellElement, this), true, 1589854667));
        return composeView;
    }

    public final ArcadeFormMerchantTransactionPickerView toView(FormBlocker.Element.MerchantTransactionOptionPicker merchantTransactionOptionPicker, String str) {
        return new ArcadeFormMerchantTransactionPickerView(this.context, str, merchantTransactionOptionPicker.options, this.moneyFormatterFactory, this.imageLoader, new FormElementViewBuilder$toView$36(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"));
    }

    public final ComposeView toView(FormBlocker.Element.MerchantTransactionElement merchantTransactionElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(22, this, merchantTransactionElement), true, -649653004));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(24, paymentPlanScheduleElement, this), true, 217359108));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.PaymentPlanSummaryElement paymentPlanSummaryElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(27, paymentPlanSummaryElement, this), true, 166677813));
        return composeView;
    }

    public final ArcadeFormSelectableInput toView(FormBlocker.Element.SelectableInputElement selectableInputElement) {
        return new ArcadeFormSelectableInput(this.context, selectableInputElement, new FormElementViewBuilder$toView$40(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"));
    }

    public final ArcadeFormProfilePreview toView(FormBlocker.Element.ProfilePreviewElement profilePreviewElement) {
        return new ArcadeFormProfilePreview(this.context, this.imageLoader, profilePreviewElement);
    }

    public final ArcadeFormAddressView toView(FormBlocker.Element.LocationElement locationElement, String str) {
        return new ArcadeFormAddressView(this.context, Country.US, str, LocationType.City, new FormElementViewBuilder$toView$41(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), null, this.addressSearcher, false);
    }

    public final ArcadeFormCheckBoxView toView(FormBlocker.Element.CheckBoxElement checkBoxElement, String str) {
        return new ArcadeFormCheckBoxView(this.context, str, new FormElementViewBuilder$toView$42(1, 1, StateFlowKt.class, this.viewEvents, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V"), checkBoxElement, this.imageLoader);
    }

    public final ComposeView toView(FormBlocker.Element.ListUnorderedElement listUnorderedElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(28, listUnorderedElement, this), true, -98872908));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.ListOrderedElement listOrderedElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(25, listOrderedElement, this), true, 2055322285));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.InstructionCardElement instructionCardElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(23, instructionCardElement, this), true, -603804740));
        return composeView;
    }

    public final FormElementViewBuilder$toView$46 toView(FormBlocker.Element.CellDefaultElement cellDefaultElement, String str, SnapshotStateMap snapshotStateMap) {
        return new FormElementViewBuilder$toView$46(cellDefaultElement, str, snapshotStateMap, this, this.context);
    }

    public final ComposeView toView(FormBlocker.Element.SectionHeaderElement sectionHeaderElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(26, sectionHeaderElement, this), true, 1510278096));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.EditorialContentElement editorialContentElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda9(this, editorialContentElement), true, -876863792));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.CashAppTagElement cashAppTagElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new FormCashtag$8$$ExternalSyntheticLambda0(16, cashAppTagElement, this), true, 40023658));
        return composeView;
    }

    public final ComposeView toView(FormBlocker.Element.SelectedInstrumentElement selectedInstrumentElement) {
        ComposeView composeView = new ComposeView(this.context, null, 0, 6, null);
        byte b = 0;
        composeView.setContent(new ComposableLambdaImpl(new FormElementViewBuilder$$ExternalSyntheticLambda2(selectedInstrumentElement, b, b), true, -1161400576));
        return composeView;
    }
}
