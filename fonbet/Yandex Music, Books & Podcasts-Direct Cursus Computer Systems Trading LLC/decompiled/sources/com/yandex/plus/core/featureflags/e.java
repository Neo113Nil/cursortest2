package com.yandex.plus.core.featureflags;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class e implements s {
    public final a a;

    public e(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.core.featureflags.s
    public final Set a(String str) {
        Object obj;
        ArrayList arrayList;
        u a;
        com.yandex.plus.home.l lVar = this.a.b.e;
        Map map = (lVar == null || (a = lVar.a()) == null) ? null : a.a;
        if (map == null || (obj = map.get(str)) == null || !(obj instanceof Set)) {
            obj = null;
        }
        Collection collection = (Collection) obj;
        if (collection != null) {
            arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (collection != null && arrayList != null && collection.size() != arrayList.size()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return CollectionsKt.A0(arrayList);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.core.featureflags.s
    public final Float b(String str) {
        Object obj;
        u a;
        com.yandex.plus.home.l lVar = this.a.b.e;
        Object obj2 = null;
        Map map = (lVar == null || (a = lVar.a()) == null) ? null : a.a;
        if (map != null && (obj = map.get(str)) != null && (obj instanceof Float)) {
            obj2 = obj;
        }
        return (Float) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.core.featureflags.s
    public final Boolean c(String str) {
        Object obj;
        u a;
        com.yandex.plus.home.l lVar = this.a.b.e;
        Object obj2 = null;
        Map map = (lVar == null || (a = lVar.a()) == null) ? null : a.a;
        if (map != null && (obj = map.get(str)) != null && (obj instanceof Boolean)) {
            obj2 = obj;
        }
        return (Boolean) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.core.featureflags.s
    public final String d(String str) {
        Object obj;
        u a;
        com.yandex.plus.home.l lVar = this.a.b.e;
        Object obj2 = null;
        Map map = (lVar == null || (a = lVar.a()) == null) ? null : a.a;
        if (map != null && (obj = map.get(str)) != null && (obj instanceof String)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.core.featureflags.s
    public final Integer e(String str) {
        Object obj;
        u a;
        com.yandex.plus.home.l lVar = this.a.b.e;
        Object obj2 = null;
        Map map = (lVar == null || (a = lVar.a()) == null) ? null : a.a;
        if (map != null && (obj = map.get(str)) != null && (obj instanceof Integer)) {
            obj2 = obj;
        }
        return (Integer) obj2;
    }
}
