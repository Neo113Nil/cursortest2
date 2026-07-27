package e;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.InterfaceC0511t;
import com.google.android.gms.internal.ads.CL;
import f.AbstractC4485a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f37222a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f37223b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f37224c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f37225d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f37226e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f37227f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f37228g = new Bundle();

    public final boolean a(int i, int i4, Intent intent) {
        String str = (String) this.f37222a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C4466e c4466e = (C4466e) this.f37226e.get(str);
        if ((c4466e != null ? c4466e.f37215a : null) != null) {
            ArrayList arrayList = this.f37225d;
            if (arrayList.contains(str)) {
                c4466e.f37215a.g(c4466e.f37216b.c(i4, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f37227f.remove(str);
        this.f37228g.putParcelable(str, new C4462a(i4, intent));
        return true;
    }

    public abstract void b(int i, AbstractC4485a abstractC4485a, Parcelable parcelable);

    public final h c(String key, AbstractC4485a abstractC4485a, InterfaceC4463b interfaceC4463b) {
        kotlin.jvm.internal.h.e(key, "key");
        d(key);
        this.f37226e.put(key, new C4466e(abstractC4485a, interfaceC4463b));
        LinkedHashMap linkedHashMap = this.f37227f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC4463b.g(obj);
        }
        Bundle bundle = this.f37228g;
        C4462a c4462a = (C4462a) com.bumptech.glide.d.s(key, bundle);
        if (c4462a != null) {
            bundle.remove(key);
            interfaceC4463b.g(abstractC4485a.c(c4462a.f37209n, c4462a.f37210u));
        }
        return new h(this, key, abstractC4485a);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f37223b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new L7.a(new L7.g(0, new L7.j())).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f37222a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String key) {
        Integer num;
        kotlin.jvm.internal.h.e(key, "key");
        if (!this.f37225d.contains(key) && (num = (Integer) this.f37223b.remove(key)) != null) {
            this.f37222a.remove(num);
        }
        this.f37226e.remove(key);
        LinkedHashMap linkedHashMap = this.f37227f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder m8 = CL.m("Dropping pending result for request ", key, ": ");
            m8.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", m8.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f37228g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4462a) com.bumptech.glide.d.s(key, bundle)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f37224c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f37218b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f37217a.b((InterfaceC0511t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
