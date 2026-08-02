package com.plaid.internal;

import com.google.gson.internal.LinkedTreeMap;
import com.plaid.internal.AbstractC0193i4;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.plaid.internal.s1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0279s1 {
    public static final boolean a(AbstractC0193i4.a<Object> aVar) {
        aVar.getClass();
        Object obj = aVar.a;
        if (obj instanceof LinkedTreeMap) {
            String upperCase = String.valueOf(((Map) obj).get("error_code")).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (aVar.b == 400 && "INVALID_CHANNEL_ID".equals(upperCase)) {
                return true;
            }
        }
        return false;
    }
}
