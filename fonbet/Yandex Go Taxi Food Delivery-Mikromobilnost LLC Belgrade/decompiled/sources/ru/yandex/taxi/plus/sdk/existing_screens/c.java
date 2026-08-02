package ru.yandex.taxi.plus.sdk.existing_screens;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.imo;
import defpackage.mth;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class c {
    public final SharedPreferences a;
    public final r0 b;
    public final n c;

    public c(Context context) {
        this.a = context.getSharedPreferences("ru_yandex_plus_existing_screens_repository", 0);
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = new n(new mth(c, 6), new ExistingScreensRepository$existingScreensFlow$1(this, null));
    }

    public final ArrayList a() {
        Map b = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!evu0.J(str) && !evu0.J(str2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new imo((String) entry2.getKey(), (String) entry2.getValue()));
        }
        return arrayList;
    }

    public final Map b() {
        Set<String> stringSet = this.a.getStringSet("existing_screens", EmptySet.a);
        if (stringSet == null) {
            return kotlin.collections.b.f();
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        for (String str : set) {
            arrayList.add(new Pair(evu0.g0(str, "$", str), evu0.d0(str, "$", str)));
        }
        return kotlin.collections.b.s(arrayList);
    }

    public final void c(HashMap hashMap) {
        SharedPreferences.Editor edit = this.a.edit();
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "$" + ((String) entry.getValue()));
        }
        edit.putStringSet("existing_screens", kotlin.collections.a.N0(arrayList)).apply();
    }
}
