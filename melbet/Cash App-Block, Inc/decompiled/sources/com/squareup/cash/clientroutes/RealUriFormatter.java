package com.squareup.cash.clientroutes;

import android.net.Uri;
import com.squareup.cash.clientroutes.AccountRequirement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class RealUriFormatter {
    public static final RealUriFormatter INSTANCE = new RealUriFormatter();

    public static String format(String str, String str2, String str3, List list, Map map, String str4, AccountRequirement accountRequirement) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        map.getClass();
        accountRequirement.getClass();
        if ((accountRequirement.getValue() == AccountRequirement.Value.REQUIRED && str4 == null) || !map.keySet().containsAll(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            Object obj = map.get(str5);
            obj.getClass();
            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default((String) obj, "?", "%3F"), "€", "%E2%82%AC"), "£", "%C2%A3"), "¥", "%C2%A5"), Marker.ANY_NON_NULL_MARKER, "%2B"), "{", "%7B"), "}", "%7D"), "#", "%23"), "[", "%5B"), "]", "%5D"), ";", "%3B"), " ", "%20");
            String replace$default2 = StringsKt__StringsJVMKt.replace$default(str3, "$" + str5, replace$default);
            if (str3.equals(replace$default2)) {
                arrayList.add(str5 + "=" + StringsKt__StringsJVMKt.replace$default(replace$default, "=", "%3D"));
            } else {
                str3 = replace$default2;
            }
        }
        if (str4 != null) {
            arrayList.add(accountRequirement.getAccountIdentifierParameterName() + "=" + str4);
        }
        return Uri.parse(str + "://" + str2 + str3 + (arrayList.size() != 0 ? "?".concat(CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62)) : "")).toString();
    }
}
