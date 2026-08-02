package com.yandex.passport.internal.sloth;

import defpackage.c7;
import defpackage.rdb;
import defpackage.tah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    public static final com.yandex.passport.data.network.token.i b;
    public static final LinkedHashMap c;
    public static final Set d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final /* synthetic */ l[] h;
    public static final /* synthetic */ rdb i;
    public final String a;

    static {
        l lVar = new l("RegFormat", 0, "regFormat");
        l lVar2 = new l("UserAgreementText", 1, "userAgreementText");
        l lVar3 = new l("UserAgreementUrl", 2, "userAgreementUrl");
        e = lVar3;
        l lVar4 = new l("PrivacyPolicyText", 3, "privacyPolicyText");
        l lVar5 = new l("PrivacyPolicyUrl", 4, "privacyPolicyUrl");
        f = lVar5;
        l lVar6 = new l("TaxiAgreementText", 5, "taxiAgreementText");
        l lVar7 = new l("TaxiAgreementUrl", 6, "taxiAgreementUrl");
        g = lVar7;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7};
        h = lVarArr;
        rdb rdbVar = new rdb(lVarArr);
        i = rdbVar;
        b = new com.yandex.passport.data.network.token.i(19);
        int a = tah.a(v75.o(rdbVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        c7 c7Var = new c7(0, rdbVar);
        while (c7Var.hasNext()) {
            Object next = c7Var.next();
            linkedHashMap.put(((l) next).a, next);
        }
        c = linkedHashMap;
        rdb rdbVar2 = i;
        ArrayList arrayList = new ArrayList(v75.o(rdbVar2, 10));
        c7 c7Var2 = new c7(0, rdbVar2);
        while (c7Var2.hasNext()) {
            arrayList.add(((l) c7Var2.next()).a);
        }
        d = CollectionsKt.A0(arrayList);
    }

    public l(String str, int i2, String str2) {
        this.a = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) h.clone();
    }
}
