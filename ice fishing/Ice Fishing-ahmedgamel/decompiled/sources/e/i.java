package e;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.InterfaceC0505t;
import com.google.android.gms.internal.ads.Wv;
import f.AbstractC4511a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f37199a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f37200b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f37201c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f37202d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f37203e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f37204f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f37205g = new Bundle();

    public final boolean a(int i, int i4, Intent intent) {
        String str = (String) this.f37199a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C4470e c4470e = (C4470e) this.f37203e.get(str);
        if ((c4470e != null ? c4470e.f37192a : null) != null) {
            ArrayList arrayList = this.f37202d;
            if (arrayList.contains(str)) {
                c4470e.f37192a.f(c4470e.f37193b.c(i4, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f37204f.remove(str);
        this.f37205g.putParcelable(str, new C4466a(i4, intent));
        return true;
    }

    public abstract void b(int i, AbstractC4511a abstractC4511a, Parcelable parcelable);

    public final h c(String key, AbstractC4511a abstractC4511a, InterfaceC4467b interfaceC4467b) {
        kotlin.jvm.internal.h.e(key, "key");
        d(key);
        this.f37203e.put(key, new C4470e(abstractC4511a, interfaceC4467b));
        LinkedHashMap linkedHashMap = this.f37204f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC4467b.f(obj);
        }
        Bundle bundle = this.f37205g;
        C4466a c4466a = (C4466a) com.bumptech.glide.g.o(bundle, key, C4466a.class);
        if (c4466a != null) {
            bundle.remove(key);
            interfaceC4467b.f(abstractC4511a.c(c4466a.f37186n, c4466a.f37187u));
        }
        return new h(this, key, abstractC4511a);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f37200b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new P7.a(new P7.g(0, new P7.j())).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f37199a;
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
        if (!this.f37202d.contains(key) && (num = (Integer) this.f37200b.remove(key)) != null) {
            this.f37199a.remove(num);
        }
        this.f37203e.remove(key);
        LinkedHashMap linkedHashMap = this.f37204f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder l9 = Wv.l("Dropping pending result for request ", key, ": ");
            l9.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", l9.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f37205g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4466a) com.bumptech.glide.g.o(bundle, key, C4466a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f37201c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f37195b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f37194a.b((InterfaceC0505t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
