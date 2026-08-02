package com.yandex.passport.internal.flags;

import defpackage.v75;
import defpackage.yhn;
import defpackage.ype;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class k extends g {
    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            IntRange m = yhn.m(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(v75.o(m, 10));
            ype it = m.iterator();
            while (it.c) {
                arrayList.add(jSONArray.optString(it.nextInt()));
            }
            return arrayList;
        } catch (Exception unused) {
            return (List) this.b;
        }
    }
}
