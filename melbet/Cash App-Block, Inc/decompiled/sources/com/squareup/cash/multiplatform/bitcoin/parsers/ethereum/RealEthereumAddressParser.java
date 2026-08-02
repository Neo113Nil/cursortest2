package com.squareup.cash.multiplatform.bitcoin.parsers.ethereum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class RealEthereumAddressParser implements EthereumAddressParser {
    public static final Regex ETHEREUM_ADDRESS_PATTERN = new Regex("^0x[a-fA-F0-9]{40}$");

    public final EthereumAddress parse(String str) {
        Object obj;
        String str2;
        String str3 = null;
        if (!StringsKt.isBlank(str)) {
            boolean startsWith = StringsKt__StringsJVMKt.startsWith(str, "eip155:", true);
            Regex regex = ETHEREUM_ADDRESS_PATTERN;
            if (startsWith) {
                String substringAfterLast$default = StringsKt.substringAfterLast$default(str, ":");
                EthereumAddress ethereumAddress = !regex.matches(substringAfterLast$default) ? null : new EthereumAddress(substringAfterLast$default, substringAfterLast$default, null, false);
                if (ethereumAddress != null) {
                    String str4 = ethereumAddress.address;
                    String str5 = ethereumAddress.value;
                    boolean z = ethereumAddress.isUri;
                    str4.getClass();
                    return new EthereumAddress(str4, str, str5, z);
                }
            } else {
                if (!StringsKt__StringsJVMKt.startsWith(str, "ethereum:", true)) {
                    if (regex.matches(str)) {
                        return new EthereumAddress(str, str, null, false);
                    }
                    return null;
                }
                String removePrefix = StringsKt.removePrefix("//", StringsKt.substringAfter(str, ":", ""));
                int length = removePrefix.length();
                for (int i = 0; i < length; i++) {
                    char charAt = removePrefix.charAt(i);
                    if (charAt == '@' || charAt == '/' || charAt == '?') {
                        removePrefix = removePrefix.substring(0, i);
                        break;
                    }
                }
                EthereumAddress ethereumAddress2 = !regex.matches(removePrefix) ? null : new EthereumAddress(removePrefix, removePrefix, null, false);
                if (ethereumAddress2 != null) {
                    String str6 = ethereumAddress2.address;
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6);
                    if (indexOf$default != -1) {
                        List split$default = StringsKt.split$default(str.substring(indexOf$default + 1), new char[]{'&'}, 6);
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
                        Iterator it = split$default.iterator();
                        while (it.hasNext()) {
                            arrayList.add(StringsKt.split$default((String) it.next(), new char[]{'='}, 2));
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (Intrinsics.areEqual(((List) obj).get(0), "value")) {
                                break;
                            }
                        }
                        List list = (List) obj;
                        if (list != null && (str2 = (String) CollectionsKt.getOrNull(1, list)) != null && !StringsKt.isBlank(str2)) {
                            str3 = str2;
                        }
                    }
                    return new EthereumAddress(str6, str, str3, true);
                }
            }
        }
        return null;
    }
}
