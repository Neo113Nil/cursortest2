package com.plaid.internal;

import com.plaid.internal.C0095a6;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class L2 {
    public static LinkError a(Throwable th, String str) {
        if (!(th instanceof B2)) {
            return LinkError.INSTANCE.fromException$link_sdk_release(th);
        }
        C0095a6.a.a(C0095a6.a, th);
        return LinkError.INSTANCE.fromException$link_sdk_release(new LinkException((str == null || str.length() == 0) ? "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists" : "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists\n".concat(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkExit b(Throwable th, String str) {
        return new LinkExit(a(th, str), null, 2, 0 == true ? 1 : 0);
    }

    public static String a(String str, String str2, String str3) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("{\"error_code\":\"", str, "\",\"error_message\":\"", str2, "\",\"display_message\":\""), str3, "\"}");
    }

    public static LinkExitMetadata a(int i, String str) {
        if ((i & 8) != 0) {
            str = null;
        }
        return new LinkExitMetadata(null, null, null, str, null);
    }

    public static LinkSuccess a(String str, LinkSuccessMetadata linkSuccessMetadata) {
        str.getClass();
        linkSuccessMetadata.getClass();
        return new LinkSuccess(str, linkSuccessMetadata);
    }

    public static LinkSuccess a(LinkedHashMap linkedHashMap, List list) {
        linkedHashMap.getClass();
        list.getClass();
        return LinkSuccess.INSTANCE.fromMap$link_sdk_release(linkedHashMap, list);
    }

    public static LinkSuccessMetadata a(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.getClass();
        str3.getClass();
        str4.getClass();
        return new LinkSuccessMetadata((str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(str, str2), arrayList, str3, str4);
    }

    public static LinkAccount a(D1 d1) {
        d1.getClass();
        return LinkAccount.INSTANCE.fromResponse$link_sdk_release(d1);
    }

    public static String a(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("{\"link_session_id\":\"");
        sb.append(str);
        sb.append("\",\"request_id\":\"");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, "\"}");
    }
}
