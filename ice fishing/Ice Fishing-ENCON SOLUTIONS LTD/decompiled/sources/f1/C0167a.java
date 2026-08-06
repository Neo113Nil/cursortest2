package f1;

import a1.InterfaceC0090f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import i1.AbstractC0252i;
import j1.C0969c;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint({"UseKtx"})
/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167a implements W0.b, InterfaceC0172f {

    /* renamed from: a, reason: collision with root package name */
    public final m0.j f2922a = new m0.j(28, false);

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f2923b;

    public final boolean a(String str, List list) {
        SharedPreferences sharedPreferences = this.f2923b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.i.i("preferences");
            throw null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Set V2 = list != null ? AbstractC0252i.V(list) : null;
        SharedPreferences sharedPreferences2 = this.f2923b;
        if (sharedPreferences2 == null) {
            kotlin.jvm.internal.i.i("preferences");
            throw null;
        }
        Set<String> keySet = sharedPreferences2.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str2 = (String) obj;
            kotlin.jvm.internal.i.b(str2);
            if (z1.o.R(str2, str, false) && (V2 == null || V2.contains(str2))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return edit.commit();
    }

    public final C0969c b(String str, List list) {
        Object obj;
        Set V2 = list != null ? AbstractC0252i.V(list) : null;
        C0969c c0969c = new C0969c(8);
        SharedPreferences sharedPreferences = this.f2923b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.i.i("preferences");
            throw null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            kotlin.jvm.internal.i.b(key);
            if (z1.o.R(key, str, false) && value != null && (V2 == null || V2.contains(key))) {
                boolean z2 = value instanceof String;
                m0.j jVar = this.f2922a;
                if (z2) {
                    String str2 = (String) value;
                    if (z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
                        obj = value;
                        if (!z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
                            String substring = str2.substring(40);
                            kotlin.jvm.internal.i.d(substring, "substring(...)");
                            obj = jVar.f(substring);
                        }
                    } else if (z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy", false)) {
                        String substring2 = str2.substring(44);
                        kotlin.jvm.internal.i.d(substring2, "substring(...)");
                        obj = new BigInteger(substring2, 36);
                    } else {
                        obj = value;
                        if (z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
                            String substring3 = str2.substring(40);
                            kotlin.jvm.internal.i.d(substring3, "substring(...)");
                            obj = Double.valueOf(Double.parseDouble(substring3));
                        }
                    }
                } else {
                    boolean z3 = value instanceof Set;
                    obj = value;
                    if (z3) {
                        List R2 = AbstractC0252i.R((Set) value);
                        SharedPreferences sharedPreferences2 = this.f2923b;
                        if (sharedPreferences2 == null) {
                            kotlin.jvm.internal.i.i("preferences");
                            throw null;
                        }
                        sharedPreferences2.edit().remove(key).putString(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(jVar.h(R2))).apply();
                        obj = R2;
                    }
                }
                c0969c.put(key, obj);
            }
        }
        c0969c.b();
        c0969c.f8055m = true;
        if (c0969c.f8051i > 0) {
            return c0969c;
        }
        C0969c c0969c2 = C0969c.f8042n;
        kotlin.jvm.internal.i.c(c0969c2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c0969c2;
    }

    public final boolean c(String str, String str2) {
        if (z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy", false) || z1.o.R(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        SharedPreferences sharedPreferences = this.f2923b;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().putString(str, str2).commit();
        }
        kotlin.jvm.internal.i.i("preferences");
        throw null;
    }

    @Override // W0.b
    public final void onAttachedToEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        InterfaceC0090f interfaceC0090f = binding.f1856b;
        kotlin.jvm.internal.i.d(interfaceC0090f, "getBinaryMessenger(...)");
        Context context = binding.f1855a;
        kotlin.jvm.internal.i.d(context, "getApplicationContext(...)");
        this.f2923b = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            C0171e.b(InterfaceC0172f.f2930P, interfaceC0090f, this);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        InterfaceC0090f interfaceC0090f = binding.f1856b;
        kotlin.jvm.internal.i.d(interfaceC0090f, "getBinaryMessenger(...)");
        C0171e.b(InterfaceC0172f.f2930P, interfaceC0090f, null);
    }
}
