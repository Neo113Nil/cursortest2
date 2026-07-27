package r0;

import L.Q;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j0.InterfaceC0188a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m0.InterfaceC0208f;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0240a implements InterfaceC0188a, InterfaceC0245f {

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f2874f;

    /* renamed from: g, reason: collision with root package name */
    public final E.a f2875g = new E.a(24);

    public final boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f2874f.edit();
        Map<String, ?> all = this.f2874f.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return edit.commit();
    }

    public final HashMap b(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f2874f.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z2 = obj2 instanceof String;
                E.a aVar = this.f2875g;
                if (z2) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            obj2 = aVar.c(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f2874f.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar.d(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // j0.InterfaceC0188a
    public final void c(Q q2) {
        InterfaceC0208f interfaceC0208f = (InterfaceC0208f) q2.f598h;
        InterfaceC0245f.f2882d.getClass();
        C0244e.b(interfaceC0208f, null);
    }

    public final boolean d(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return this.f2874f.edit().putString(str, str2).commit();
    }

    @Override // j0.InterfaceC0188a
    public final void n(Q q2) {
        InterfaceC0208f interfaceC0208f = (InterfaceC0208f) q2.f598h;
        this.f2874f = ((Context) q2.f597g).getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            InterfaceC0245f.f2882d.getClass();
            C0244e.b(interfaceC0208f, this);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
    }
}
