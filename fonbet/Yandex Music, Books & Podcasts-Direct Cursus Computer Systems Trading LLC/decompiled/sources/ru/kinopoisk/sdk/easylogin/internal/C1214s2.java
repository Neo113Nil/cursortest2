package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1214s2 extends uif implements Function1<String, Unit> {
    public final /* synthetic */ LinkedHashMap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1214s2(C1200r2 c1200r2, LinkedHashMap linkedHashMap) {
        super(1);
        this.a = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        String str = (String) obj;
        str.getClass();
        LinkedHashMap linkedHashMap = this.a;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String obj2 = StringsKt.t0((String) it.next()).toString();
            String str2 = StringsKt.U(obj2) ? null : obj2;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        if (arrayList.size() != 2) {
            arrayList = null;
        }
        if (arrayList != null) {
            linkedHashMap.put((String) arrayList.get(0), (String) arrayList.get(1));
        }
        return Unit.a;
    }
}
