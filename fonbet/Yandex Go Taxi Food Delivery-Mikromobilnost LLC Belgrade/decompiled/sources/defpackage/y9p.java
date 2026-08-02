package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class y9p {
    public final pho a;

    public y9p(pho phoVar) {
        this.a = phoVar;
    }

    public static void c(y9p y9pVar, String str, String str2, String str3, boolean z, String str4, String str5, int i) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        y9pVar.getClass();
        HashMap h = b.h(new Pair("type_group", str2), new Pair("group_id", str3), new Pair("payment_method_flag", Boolean.valueOf(z)));
        if (str4 != null) {
            h.put("context", str4);
        }
        if (str5 != null) {
            h.put("enable", str5);
        }
        x4e.B(y9pVar.a, str, h, 1);
    }

    public final void a(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("type_group", str);
        }
        if (str2 != null) {
            hashMap.put("group_id", str2);
        }
        hashMap.put("success", str3);
        hashMap.put("new_card_flag", bool);
        if (str4 != null) {
            hashMap.put("context", str4);
        }
        if (str5 != null) {
            hashMap.put("error", str5);
        }
        this.a.a("FamilyAccount.Card.SelectCreditCardResult", hashMap, 1, new HashMap());
    }

    public final void b(String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("type_group", str);
        }
        if (bool != null) {
            hashMap.put("enter_symbol_flag", bool);
        }
        this.a.a("CreateFamilyAccount.InviteButtonTapped", hashMap, 1, new HashMap());
    }
}
