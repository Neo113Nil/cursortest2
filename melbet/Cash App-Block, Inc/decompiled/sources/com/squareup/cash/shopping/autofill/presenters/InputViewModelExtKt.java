package com.squareup.cash.shopping.autofill.presenters;

import com.google.android.gms.internal.mlkit_genai_prompt.zzqu;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntriesList;

/* loaded from: classes7.dex */
public abstract class InputViewModelExtKt {
    public static final boolean allValid(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((InputViewModel) it2.next()).getState() == InputViewModel.InputState.ERROR) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final ArrayList getInputFields(AutofillCombinedInfo autofillCombinedInfo, AndroidStringManager androidStringManager) {
        autofillCombinedInfo.getClass();
        ArrayList arrayList = new ArrayList();
        String str = autofillCombinedInfo.firstName;
        GlobalAddress globalAddress = autofillCombinedInfo.address;
        InputViewModel.InputType inputType = InputViewModel.InputType.FIRST_NAME;
        String invalidErrorMessage = zzqu.invalidErrorMessage(str, inputType, androidStringManager);
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage, str, invalidErrorMessage != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType, androidStringManager.get(R.string.first_name_label), androidStringManager.get(R.string.placeholder_text), 64)));
        String str2 = autofillCombinedInfo.lastName;
        InputViewModel.InputType inputType2 = InputViewModel.InputType.LAST_NAME;
        String invalidErrorMessage2 = zzqu.invalidErrorMessage(str2, inputType2, androidStringManager);
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage2, str2, invalidErrorMessage2 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType2, androidStringManager.get(R.string.last_name_label), androidStringManager.get(R.string.placeholder_text), 64)));
        String str3 = autofillCombinedInfo.email;
        InputViewModel.InputType inputType3 = InputViewModel.InputType.EMAIL;
        String invalidErrorMessage3 = zzqu.invalidErrorMessage(str3, inputType3, androidStringManager);
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage3, str3, invalidErrorMessage3 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType3, androidStringManager.get(R.string.email_label), androidStringManager.get(R.string.placeholder_text), 64)));
        String str4 = autofillCombinedInfo.phone;
        InputViewModel.InputType inputType4 = InputViewModel.InputType.PHONE;
        String invalidErrorMessage4 = zzqu.invalidErrorMessage(str4, inputType4, androidStringManager);
        if (str4 != null) {
            int length = str4.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!Character.isDigit(str4.charAt(i))) {
                    str4 = str4.substring(0, i);
                    break;
                }
                i++;
            }
        } else {
            str4 = null;
        }
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage4, str4, invalidErrorMessage4 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType4, androidStringManager.get(R.string.phone_label), androidStringManager.get(R.string.placeholder_text), 64)));
        globalAddress.getClass();
        InputViewModel.InputType inputType5 = InputViewModel.InputType.ADDRESS1;
        String invalidErrorMessage5 = zzqu.invalidErrorMessage(globalAddress.address_line_1, inputType5, androidStringManager);
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage5, globalAddress.address_line_1, invalidErrorMessage5 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType5, androidStringManager.get(R.string.address_1_label), androidStringManager.get(R.string.placeholder_text), 64)));
        InputViewModel.InputType inputType6 = InputViewModel.InputType.ADDRESS2;
        String invalidErrorMessage6 = zzqu.invalidErrorMessage(globalAddress.address_line_2, inputType6, androidStringManager);
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage6, globalAddress.address_line_2, invalidErrorMessage6 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType6, androidStringManager.get(R.string.address_2_label), androidStringManager.get(R.string.placeholder_text), 64)));
        InputViewModel.InputType inputType7 = InputViewModel.InputType.CITY;
        String invalidErrorMessage7 = zzqu.invalidErrorMessage(globalAddress.locality, inputType7, androidStringManager);
        arrayList.add(CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel(invalidErrorMessage7, globalAddress.locality, invalidErrorMessage7 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, inputType7, androidStringManager.get(R.string.city_label), androidStringManager.get(R.string.placeholder_text), 64)));
        String invalidErrorMessage8 = zzqu.invalidErrorMessage(globalAddress.administrative_district_level_1, InputViewModel.InputType.STATE, androidStringManager);
        String invalidErrorMessage9 = zzqu.invalidErrorMessage(globalAddress.postal_code, InputViewModel.InputType.POSTAL, androidStringManager);
        EnumEntriesList enumEntriesList = States$US_STATE_ABBREVIATIONS.$ENTRIES;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
        Iterator it = enumEntriesList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((States$US_STATE_ABBREVIATIONS) it.next()).toString());
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new LinkedHashTreeMap.AnonymousClass1(12));
        String str5 = globalAddress.administrative_district_level_1;
        InputViewModel.InputType inputType8 = InputViewModel.InputType.FIRST_NAME;
        arrayList.add(CollectionsKt__CollectionsKt.listOf((Object[]) new InputViewModel[]{new InputViewModel.InputDropdownViewModel(sortedWith, invalidErrorMessage8, str5, invalidErrorMessage8 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, androidStringManager.get(R.string.state_label), androidStringManager.get(R.string.placeholder_text)), new InputViewModel.InputFieldViewModel(invalidErrorMessage9, globalAddress.postal_code, invalidErrorMessage9 != null ? InputViewModel.InputState.ERROR : InputViewModel.InputState.DEFAULT, InputViewModel.InputType.POSTAL, androidStringManager.get(R.string.postal_code_label), androidStringManager.get(R.string.placeholder_text), InputViewModel.KeyboardType.NUMBERS)}));
        return arrayList;
    }

    public static final CreateShippingAddressRequest.ShippingAddress toCreateShippingAddress(AutofillCombinedInfo autofillCombinedInfo) {
        autofillCombinedInfo.getClass();
        Action.Type.Companion companion = ShippingAddressSource.Companion;
        return new CreateShippingAddressRequest.ShippingAddress(null, new FullName(autofillCombinedInfo.firstName, autofillCombinedInfo.lastName), autofillCombinedInfo.address, new Phone(autofillCombinedInfo.phone), autofillCombinedInfo.email, 389);
    }

    public static final UpdateShippingAddressRequest.ShippingAddress toUpdateShippingAddress(AutofillCombinedInfo autofillCombinedInfo) {
        autofillCombinedInfo.getClass();
        Action.Type.Companion companion = ShippingAddressSource.Companion;
        return new UpdateShippingAddressRequest.ShippingAddress(new FullName(autofillCombinedInfo.firstName, autofillCombinedInfo.lastName), autofillCombinedInfo.address, new Phone(autofillCombinedInfo.phone), autofillCombinedInfo.email);
    }

    public static final AutofillCombinedInfo update(AutofillCombinedInfo autofillCombinedInfo, InputViewModel.InputType inputType, String str) {
        autofillCombinedInfo.getClass();
        inputType.getClass();
        str.getClass();
        switch (inputType.ordinal()) {
            case 0:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, str, null, null, null, null, 30);
            case 1:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, str, null, null, null, 29);
            case 2:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, str, null, null, 27);
            case 3:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, null, str, null, 23);
            case 4:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, null, null, GlobalAddress.copy$default(autofillCombinedInfo.address, str, null, null, null, null, null, null, 4194302), 15);
            case 5:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, null, null, GlobalAddress.copy$default(autofillCombinedInfo.address, null, str, null, null, null, null, null, 4194301), 15);
            case 6:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, null, null, GlobalAddress.copy$default(autofillCombinedInfo.address, null, null, str, null, null, null, null, 4194295), 15);
            case 7:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, null, null, GlobalAddress.copy$default(autofillCombinedInfo.address, null, null, null, str, null, null, null, 4194271), 15);
            case 8:
                return AutofillCombinedInfo.copy$default(autofillCombinedInfo, null, null, null, null, GlobalAddress.copy$default(autofillCombinedInfo.address, null, null, null, null, str, null, null, 4194239), 15);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
