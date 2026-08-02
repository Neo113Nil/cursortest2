package e;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.InterfaceC0501t;
import com.icefishingapp.icefishing.AbstractC4404f;
import f.AbstractC4494a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f37091a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f37092b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f37093c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f37094d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f37095e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f37096f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f37097g = new Bundle();

    public final boolean a(int i, int i6, Intent intent) {
        String str = (String) this.f37091a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C4459e c4459e = (C4459e) this.f37095e.get(str);
        if ((c4459e != null ? c4459e.f37084a : null) != null) {
            ArrayList arrayList = this.f37094d;
            if (arrayList.contains(str)) {
                c4459e.f37084a.g(c4459e.f37085b.c(i6, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f37096f.remove(str);
        this.f37097g.putParcelable(str, new C4455a(i6, intent));
        return true;
    }

    public abstract void b(int i, AbstractC4494a abstractC4494a, Parcelable parcelable);

    public final h c(String key, AbstractC4494a abstractC4494a, InterfaceC4456b interfaceC4456b) {
        kotlin.jvm.internal.h.e(key, "key");
        d(key);
        this.f37095e.put(key, new C4459e(abstractC4494a, interfaceC4456b));
        LinkedHashMap linkedHashMap = this.f37096f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC4456b.g(obj);
        }
        Bundle bundle = this.f37097g;
        C4455a c4455a = (C4455a) com.bumptech.glide.f.g(bundle, key, C4455a.class);
        if (c4455a != null) {
            bundle.remove(key);
            interfaceC4456b.g(abstractC4494a.c(c4455a.f37078n, c4455a.f37079u));
        }
        return new h(this, key, abstractC4494a);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f37092b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new P7.a(new P7.g(0, new P7.j())).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f37091a;
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
        if (!this.f37094d.contains(key) && (num = (Integer) this.f37092b.remove(key)) != null) {
            this.f37091a.remove(num);
        }
        this.f37095e.remove(key);
        LinkedHashMap linkedHashMap = this.f37096f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder j6 = AbstractC4404f.j("Dropping pending result for request ", key, ": ");
            j6.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", j6.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f37097g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4455a) com.bumptech.glide.f.g(bundle, key, C4455a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f37093c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f37087b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f37086a.b((InterfaceC0501t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
