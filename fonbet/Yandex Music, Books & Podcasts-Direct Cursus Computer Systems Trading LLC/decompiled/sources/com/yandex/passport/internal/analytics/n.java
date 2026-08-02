package com.yandex.passport.internal.analytics;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.e7o;
import defpackage.jyr;
import defpackage.tah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public abstract class n implements com.yandex.passport.internal.methods.f {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ n(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = b((Map) value);
            } else if (!(value instanceof List) && (value instanceof Collection)) {
                value = CollectionsKt.w0((Iterable) value);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public LinkedHashMap a(Parcel parcel) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            parcel.readMap(linkedHashMap, null);
            return linkedHashMap;
        } catch (Throwable th) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.h;
            String concat = this.b.concat(" unparcel failed!");
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, concat, th);
            return null;
        }
    }

    public String c(Bundle bundle) {
        bundle.getClass();
        String str = this.b;
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        e7o.f("can't get required string ".concat(str));
        return null;
    }

    public List d(Bundle bundle) {
        bundle.getClass();
        String str = this.b;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        e7o.f("can't get required parcelable array list ".concat(str));
        return null;
    }

    public void e(Map map, Parcel parcel) {
        LinkedHashMap b;
        parcel.getClass();
        if (map != null) {
            try {
                b = b(map);
            } catch (Throwable th) {
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.h;
                String concat = this.b.concat(" parcel failed!");
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, concat, th);
                return;
            }
        } else {
            b = null;
        }
        parcel.writeMap(b);
    }

    @Override // com.yandex.passport.internal.methods.f
    public /* bridge */ /* synthetic */ Object f(Bundle bundle) {
        switch (this.a) {
            case 1:
                return d(bundle);
            default:
                return c(bundle);
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public void g(Bundle bundle, Object obj) {
        switch (this.a) {
            case 1:
                List list = (List) obj;
                list.getClass();
                bundle.putParcelableArrayList(this.b, new ArrayList<>(list));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                bundle.putString(this.b, str);
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        switch (this.a) {
        }
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }
}
