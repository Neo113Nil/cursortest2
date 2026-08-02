package com.squareup.cash.moneybot.presenters.plugins;

import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.subtle.X25519;
import com.squareup.cash.cdf.moneybot.SavingsTransferOptionKind;
import com.squareup.cash.instruments.presenters.ResolvedTransferOption;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.kgoose.api.v3.LinkTransferOption;
import com.squareup.protos.cash.kgoose.api.v3.LinkVisibility;
import com.squareup.protos.cash.kgoose.api.v3.PickerOptionRule;
import com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon;
import com.squareup.protos.cash.kgoose.api.v3.TransferOptionKind;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes6.dex */
public abstract class TemplateCardPresenterKt {
    public static final WorkLauncherImpl SelectedInlineContentValuesSaver = new WorkLauncherImpl(8, new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(11), new MoneyTabUIKt$$ExternalSyntheticLambda13(29));
    public static final JsonAdapter JSON_STRING_ADAPTER = new Moshi(new Moshi.Builder()).adapter(String.class, Util.NO_ANNOTATIONS, null);

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferOptionKind.values().length];
            try {
                iArr[TransferOptionKind.TRANSFER_OPTION_KIND_CASH_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferOptionKind.TRANSFER_OPTION_KIND_DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferOptionKind.TRANSFER_OPTION_KIND_SAVINGS_GOAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferOptionKind.TRANSFER_OPTION_KIND_GENERAL_SAVINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferOptionKind.TRANSFER_OPTION_KIND_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LinkVisibility.values().length];
            try {
                iArr2[LinkVisibility.LINK_VISIBILITY_EMPTY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LinkVisibility.LINK_VISIBILITY_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferOptions.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TransferOptions transferOptions = TransferOptions.CashBalance;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TransferOptions transferOptions2 = TransferOptions.CashBalance;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TransferOptions transferOptions3 = TransferOptions.CashBalance;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                TransferOptions transferOptions4 = TransferOptions.CashBalance;
                iArr3[6] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static final Money access$effectiveMaxAmount(Money money, Money money2) {
        CurrencyCode currencyCode;
        CurrencyCode currencyCode2;
        if (money == null) {
            return money2;
        }
        if (money2 == null || ((currencyCode = money.currency_code) != null && (currencyCode2 = money2.currency_code) != null && currencyCode != currencyCode2)) {
            return money;
        }
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Money[]{money, money2}).iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Long l = ((Money) next).amount;
            long longValue = l != null ? l.longValue() : Long.MAX_VALUE;
            do {
                Object next2 = it.next();
                Long l2 = ((Money) next2).amount;
                long longValue2 = l2 != null ? l2.longValue() : Long.MAX_VALUE;
                if (longValue > longValue2) {
                    next = next2;
                    longValue = longValue2;
                }
            } while (it.hasNext());
        }
        return (Money) next;
    }

    public static final boolean access$hasBalanceGatingRule(TemplateCard.Picker.SavingsTransferOptionPicker savingsTransferOptionPicker) {
        List list = savingsTransferOptionPicker.optionRules;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((PickerOptionRule) it.next()).target instanceof PickerOptionRule.Target.BalanceBelowSiblingAmount) {
                return true;
            }
        }
        return false;
    }

    public static final List access$hiddenOptionValues(TemplateCard.Picker.SavingsTransferOptionPicker savingsTransferOptionPicker, Map map) {
        SelectedInlineContentValue selectedInlineContentValue;
        List<PickerOptionRule> list = savingsTransferOptionPicker.optionRules;
        ArrayList arrayList = new ArrayList();
        for (PickerOptionRule pickerOptionRule : list) {
            PickerOptionRule.Target target = pickerOptionRule.target;
            String str = null;
            if (target instanceof PickerOptionRule.Target.OptionValueEqualsSibling) {
                String str2 = pickerOptionRule.sibling_placeholder_key;
                if (str2 != null && (selectedInlineContentValue = (SelectedInlineContentValue) map.get(str2)) != null) {
                    if (selectedInlineContentValue instanceof SelectedInlineContentValue.Text) {
                        str = ((SelectedInlineContentValue.Text) selectedInlineContentValue).value;
                    } else if (selectedInlineContentValue instanceof SelectedInlineContentValue.Picker) {
                        str = ((SelectedInlineContentValue.Picker) selectedInlineContentValue).value;
                    } else if (selectedInlineContentValue instanceof SelectedInlineContentValue.TransferOption) {
                        str = X25519.getOptionValue(((SelectedInlineContentValue.TransferOption) selectedInlineContentValue).option.selection);
                    } else if (!(selectedInlineContentValue instanceof SelectedInlineContentValue.Amount)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
            } else if (!(target instanceof PickerOptionRule.Target.BalanceBelowSiblingAmount) && target != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map access$hydrateTransferOptionPrefills(LinkedHashMap linkedHashMap, TemplateCard templateCard, Map map, boolean z) {
        String str;
        Object obj;
        TemplateCard.Picker picker;
        TemplateCard.BottomPicker bottomPicker = templateCard.bottomPicker;
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(bottomPicker != null ? new Pair(bottomPicker.placeholderKey, bottomPicker.picker) : null);
        ArrayList<TemplateCard.InlineContent> arrayList = templateCard.inlineContent;
        ArrayList arrayList2 = new ArrayList();
        for (TemplateCard.InlineContent inlineContent : arrayList) {
            TemplateCard.EditableField editableField = inlineContent.editableField;
            TemplateCard.EditableField.Picker picker2 = editableField instanceof TemplateCard.EditableField.Picker ? (TemplateCard.EditableField.Picker) editableField : null;
            Pair pair = (picker2 == null || (picker = picker2.picker) == null) ? null : new Pair(inlineContent.placeholderKey, picker);
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        Iterator it = CollectionsKt.plus((Iterable) arrayList2, (Collection) listOfNotNull).iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            String str2 = (String) pair2.first;
            TemplateCard.Picker picker3 = (TemplateCard.Picker) pair2.second;
            TemplateCard.Picker.SavingsTransferOptionPicker savingsTransferOptionPicker = picker3 instanceof TemplateCard.Picker.SavingsTransferOptionPicker ? (TemplateCard.Picker.SavingsTransferOptionPicker) picker3 : null;
            if (savingsTransferOptionPicker != null && !(linkedHashMap.get(str2) instanceof SelectedInlineContentValue.TransferOption)) {
                Object obj2 = linkedHashMap.get(str2);
                SelectedInlineContentValue.Text text = obj2 instanceof SelectedInlineContentValue.Text ? (SelectedInlineContentValue.Text) obj2 : null;
                if ((text != null && (str = text.value) != null) || (str = savingsTransferOptionPicker.prefilledValue) != null) {
                    Iterable iterable = (List) map.get(str2);
                    if (iterable == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    Iterator it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        ResolvedTransferOption resolvedTransferOption = (ResolvedTransferOption) obj;
                        if (z || resolvedTransferOption.isSelectable()) {
                            String optionValue = X25519.getOptionValue(resolvedTransferOption.selectedOption.selection);
                            Locale locale = Locale.US;
                            locale.getClass();
                            String lowerCase = optionValue.toLowerCase(locale);
                            lowerCase.getClass();
                            locale.getClass();
                            String lowerCase2 = str.toLowerCase(locale);
                            lowerCase2.getClass();
                            if (lowerCase.equals(lowerCase2)) {
                                break;
                            }
                        }
                    }
                    ResolvedTransferOption resolvedTransferOption2 = (ResolvedTransferOption) obj;
                    if (resolvedTransferOption2 != null) {
                        linkedHashMap = MapsKt__MapsKt.plus(linkedHashMap, new Pair(str2, new SelectedInlineContentValue.TransferOption(resolvedTransferOption2.selectedOption)));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final ArrayList access$linkedPickers(TemplateCard templateCard, String str) {
        boolean areEqual;
        ArrayList allPickers = allPickers(templateCard);
        ArrayList arrayList = new ArrayList();
        Iterator it = allPickers.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            TemplateCard.Picker picker = (TemplateCard.Picker) ((Pair) next).second;
            if (picker instanceof TemplateCard.Picker.StaticPicker) {
                areEqual = Intrinsics.areEqual(((TemplateCard.Picker.StaticPicker) picker).amountFieldPlaceholderKey, str);
            } else {
                if (!(picker instanceof TemplateCard.Picker.SavingsTransferOptionPicker)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                areEqual = Intrinsics.areEqual(((TemplateCard.Picker.SavingsTransferOptionPicker) picker).amountFieldPlaceholderKey, str);
            }
            if (areEqual) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final String access$resolvedTitle(TemplateCard.Picker.SavingsTransferOptionPicker savingsTransferOptionPicker, Map map, MoneyFormatter moneyFormatter) {
        String str = savingsTransferOptionPicker.titleTemplate;
        if (str == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((SelectedInlineContentValue) entry.getValue()).displayText(moneyFormatter));
        }
        return replaceTemplateValues(str, linkedHashMap);
    }

    public static final String access$toOptionKind(String str, Map map) {
        SelectedInlineContentValue selectedInlineContentValue = (SelectedInlineContentValue) map.get(str);
        if (selectedInlineContentValue instanceof SelectedInlineContentValue.TransferOption) {
            return toAnalyticsOptionKind(((SelectedInlineContentValue.TransferOption) selectedInlineContentValue).option.selection.transferOption);
        }
        return null;
    }

    public static final TransferOptions access$toTransferOption(LinkTransferOption linkTransferOption) {
        LinkVisibility linkVisibility = linkTransferOption.visibility;
        if (linkVisibility == null) {
            linkVisibility = LinkVisibility.LINK_VISIBILITY_EMPTY_ONLY;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[linkVisibility.ordinal()];
        if (i != 1 && i != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        TransferOptionKind transferOptionKind = linkTransferOption.kind;
        int i2 = transferOptionKind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transferOptionKind.ordinal()];
        if (i2 != -1 && i2 != 1) {
            if (i2 == 2) {
                return TransferOptions.LinkDebit;
            }
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return null;
    }

    public static final ArrayList allPickers(TemplateCard templateCard) {
        TemplateCard.Picker picker;
        TemplateCard.BottomPicker bottomPicker = templateCard.bottomPicker;
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(bottomPicker != null ? new Pair(bottomPicker.placeholderKey, bottomPicker.picker) : null);
        ArrayList<TemplateCard.InlineContent> arrayList = templateCard.inlineContent;
        ArrayList arrayList2 = new ArrayList();
        for (TemplateCard.InlineContent inlineContent : arrayList) {
            TemplateCard.EditableField editableField = inlineContent.editableField;
            TemplateCard.EditableField.Picker picker2 = editableField instanceof TemplateCard.EditableField.Picker ? (TemplateCard.EditableField.Picker) editableField : null;
            Pair pair = (picker2 == null || (picker = picker2.picker) == null) ? null : new Pair(inlineContent.placeholderKey, picker);
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        return CollectionsKt.plus((Iterable) arrayList2, (Collection) listOfNotNull);
    }

    public static final TemplateCardViewModel.Icon icon(SelectedInlineContentValue selectedInlineContentValue) {
        TransferOptionPickerDisplayIcon transferOptionPickerDisplayIcon;
        if (selectedInlineContentValue instanceof SelectedInlineContentValue.Picker) {
            MoneybotStaticPickerOption.Icon icon = ((SelectedInlineContentValue.Picker) selectedInlineContentValue).icon;
            if (icon instanceof MoneybotStaticPickerOption.Icon.Avatar) {
                return new TemplateCardViewModel.Icon.Avatar(((MoneybotStaticPickerOption.Icon.Avatar) icon).avatar);
            }
            if (icon instanceof MoneybotStaticPickerOption.Icon.SavingsGoalIcon) {
                SavingsGoalIcon savingsGoalIcon = ((MoneybotStaticPickerOption.Icon.SavingsGoalIcon) icon).savingsGoalIcon;
                String str = savingsGoalIcon.icon_id;
                if (str == null) {
                    str = "";
                }
                return new TemplateCardViewModel.Icon.SavingsGoalIcon(savingsGoalIcon.progress, str);
            }
            if (icon != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else if ((selectedInlineContentValue instanceof SelectedInlineContentValue.TransferOption) && (transferOptionPickerDisplayIcon = ((SelectedInlineContentValue.TransferOption) selectedInlineContentValue).option.icon) != null) {
            return new TemplateCardViewModel.Icon.TransferOptionIcon(transferOptionPickerDisplayIcon);
        }
        return null;
    }

    public static final ArrayList parseBoldText(String str) {
        List split$default;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"**"}, false, 0, 6, null);
        IndexingIterable withIndex = CollectionsKt.withIndex(split$default);
        ArrayList arrayList = new ArrayList();
        Iterator it = withIndex.iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                break;
            }
            Object next = arrayIterator.next();
            if (((String) ((IndexedValue) next).value).length() > 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) it2.next();
            int i = indexedValue.index;
            String str2 = (String) indexedValue.value;
            boolean z = true;
            if (i % 2 != 1) {
                z = false;
            }
            arrayList2.add(new TemplateCardViewModel.DisplayTextSegment.Text(str2, z));
        }
        return arrayList2;
    }

    public static final String replaceTemplateValues(String str, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            str = StringsKt__StringsJVMKt.replace$default(str, "{" + str2 + "}", (String) entry.getValue());
        }
        return str;
    }

    public static final TemplateCard.Picker.StaticPicker.Option selectedOption(TemplateCard.Picker.StaticPicker staticPicker, String str) {
        Object obj;
        Iterator it = staticPicker.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((TemplateCard.Picker.StaticPicker.Option) obj).value, str)) {
                break;
            }
        }
        return (TemplateCard.Picker.StaticPicker.Option) obj;
    }

    public static final String toAnalyticsOptionKind(TransferOptions transferOptions) {
        int ordinal = transferOptions.ordinal();
        SavingsTransferOptionKind savingsTransferOptionKind = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? (ordinal == 3 || ordinal == 6) ? SavingsTransferOptionKind.LINKED_DEBIT : null : SavingsTransferOptionKind.GENERAL_SAVINGS : SavingsTransferOptionKind.SAVINGS_GOAL : SavingsTransferOptionKind.CASH_BALANCE;
        if (savingsTransferOptionKind != null) {
            return savingsTransferOptionKind.name();
        }
        return null;
    }

    public static final SelectedInlineContentValue.Picker toSelectedInlineContentValue(TemplateCard.Picker.StaticPicker.Option option) {
        String str = option.value;
        String str2 = option.label;
        TemplateCard.Picker.StaticPicker.Icon icon = option.icon;
        return new SelectedInlineContentValue.Picker(str, str2, icon != null ? toStaticPickerIcon(icon) : null);
    }

    public static final MoneybotStaticPickerOption.Icon toStaticPickerIcon(TemplateCard.Picker.StaticPicker.Icon icon) {
        if (icon instanceof TemplateCard.Picker.StaticPicker.Icon.Avatar) {
            return new MoneybotStaticPickerOption.Icon.Avatar(((TemplateCard.Picker.StaticPicker.Icon.Avatar) icon).avatar);
        }
        if (icon instanceof TemplateCard.Picker.StaticPicker.Icon.SavingsGoalIcon) {
            return new MoneybotStaticPickerOption.Icon.SavingsGoalIcon(((TemplateCard.Picker.StaticPicker.Icon.SavingsGoalIcon) icon).savingsGoalIcon);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final TransferOptions access$toTransferOption(TransferOptionKind transferOptionKind) {
        int i = WhenMappings.$EnumSwitchMapping$0[transferOptionKind.ordinal()];
        if (i == 1) {
            return TransferOptions.CashBalance;
        }
        if (i == 2) {
            return TransferOptions.DebitCard;
        }
        if (i == 3) {
            return TransferOptions.SavingsGoal;
        }
        if (i == 4) {
            return TransferOptions.SavingsGeneral;
        }
        if (i == 5) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
