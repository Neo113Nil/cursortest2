package com.fillr.core.utilities;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class SchemaTranslation {
    public static final ArrayList replaceArray = new ArrayList(Arrays.asList(".HomeAddress", ".PostalAddress", ".BillingAddress", ".WorkAddress"));

    static {
        new HashMap();
    }

    public static String translateSchemaNamespaceToMiddlewareNamespace(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = replaceArray;
            if (i >= arrayList.size()) {
                return str;
            }
            String str2 = (String) arrayList.get(i);
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, ".Address[", "]");
            if (str.contains(m)) {
                return str.replace(m, str2);
            }
            i++;
        }
    }
}
