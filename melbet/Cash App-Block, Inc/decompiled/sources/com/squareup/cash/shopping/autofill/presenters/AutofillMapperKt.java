package com.squareup.cash.shopping.autofill.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.shopping.autofill.screens.AutofillData;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes5.dex */
public abstract class AutofillMapperKt {
    public static final boolean containsAny(Map map, AutofillWebField... autofillWebFieldArr) {
        map.getClass();
        ArrayList arrayList = new ArrayList(autofillWebFieldArr.length);
        for (AutofillWebField autofillWebField : autofillWebFieldArr) {
            arrayList.add(autofillWebField.value);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (map.containsKey((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final FullName getFullName(Map map) {
        map.getClass();
        return new FullName(getOrEmpty(map, AutofillWebField.FIRST_NAME), getOrEmpty(map, AutofillWebField.LAST_NAME));
    }

    public static final GlobalAddress getGlobalAddress(Map map) {
        map.getClass();
        return map.containsKey("AddressDetails.PostalAddress.AddressLine1") ? new GlobalAddress(getOrNull(map, AutofillWebField.ADDRESS_LINE_1), getOrNull(map, AutofillWebField.ADDRESS_LINE_2), getOrNull(map, AutofillWebField.SUBURB), getOrNull(map, AutofillWebField.ADMINISTRATIVE_AREA), getOrNull(map, AutofillWebField.POSTCODE), null, null, null, 4194196) : new GlobalAddress(getOrNull(map, AutofillWebField.BILLING_ADDRESS_LINE_1), getOrNull(map, AutofillWebField.BILLING_ADDRESS_LINE_2), getOrNull(map, AutofillWebField.BILLING_SUBURB), getOrNull(map, AutofillWebField.BILLING_ADMINISTRATIVE_AREA), getOrNull(map, AutofillWebField.BILLING_POSTCODE), null, null, null, 4194196);
    }

    public static final String getOrEmpty(Map map, AutofillWebField autofillWebField) {
        map.getClass();
        autofillWebField.getClass();
        return (String) map.getOrDefault(autofillWebField.value, "");
    }

    public static final String getOrNull(Map map, AutofillWebField autofillWebField) {
        map.getClass();
        autofillWebField.getClass();
        return (String) map.getOrDefault(autofillWebField.value, null);
    }

    public static final Phone getPhone(Map map) {
        map.getClass();
        String orNull = getOrNull(map, AutofillWebField.PHONE_NUMBER);
        if (orNull == null) {
            return null;
        }
        if (orNull.length() <= 0) {
            orNull = null;
        }
        if (orNull != null) {
            return new Phone(orNull);
        }
        return null;
    }

    public static final AutofillData toAutofillData(String str, Map map) {
        List listOf;
        map.getClass();
        AutofillWebField autofillWebField = AutofillWebField.FIRST_NAME;
        AutofillWebField autofillWebField2 = AutofillWebField.LAST_NAME;
        String m = containsAny(map, autofillWebField, autofillWebField2) ? Recorder$$ExternalSyntheticOutline2.m(getOrEmpty(map, autofillWebField), " ", getOrEmpty(map, autofillWebField2)) : null;
        AutofillWebField autofillWebField3 = AutofillWebField.ADDRESS_LINE_1;
        if (map.containsKey("AddressDetails.PostalAddress.AddressLine1")) {
            String orEmpty = getOrEmpty(map, autofillWebField3);
            String orEmpty2 = getOrEmpty(map, AutofillWebField.ADDRESS_LINE_2);
            AutofillWebField autofillWebField4 = AutofillWebField.SUBURB;
            AutofillWebField autofillWebField5 = AutofillWebField.ADMINISTRATIVE_AREA;
            AutofillWebField autofillWebField6 = AutofillWebField.POSTCODE;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{orEmpty, orEmpty2, containsAny(map, autofillWebField4, autofillWebField5, autofillWebField6) ? Boxes$$ExternalSyntheticOutline1.m$1(getOrEmpty(map, autofillWebField4), ", ", getOrEmpty(map, autofillWebField5), ", ", getOrEmpty(map, autofillWebField6)) : null});
        } else {
            String orEmpty3 = getOrEmpty(map, AutofillWebField.BILLING_ADDRESS_LINE_1);
            String orEmpty4 = getOrEmpty(map, AutofillWebField.BILLING_ADDRESS_LINE_2);
            AutofillWebField autofillWebField7 = AutofillWebField.BILLING_SUBURB;
            AutofillWebField autofillWebField8 = AutofillWebField.BILLING_ADMINISTRATIVE_AREA;
            AutofillWebField autofillWebField9 = AutofillWebField.BILLING_POSTCODE;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{orEmpty3, orEmpty4, containsAny(map, autofillWebField7, autofillWebField8, autofillWebField9) ? Boxes$$ExternalSyntheticOutline1.m$1(getOrEmpty(map, autofillWebField7), ", ", getOrEmpty(map, autofillWebField8), ", ", getOrEmpty(map, autofillWebField9)) : null});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            String str2 = (String) obj;
            if (str2 != null && str2.length() != 0) {
                arrayList.add(obj);
            }
        }
        return new AutofillData(m, CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62), getOrNull(map, AutofillWebField.EMAIL), getOrNull(map, AutofillWebField.PHONE_NUMBER), str);
    }
}
