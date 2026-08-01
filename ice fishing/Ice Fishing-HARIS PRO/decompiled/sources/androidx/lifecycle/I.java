package androidx.lifecycle;

import a.AbstractC0078a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l0.InterfaceC0232c;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2000f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2001a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2002b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2003c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2004d;
    public final InterfaceC0232c e;

    public I(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2001a = linkedHashMap;
        this.f2002b = new LinkedHashMap();
        this.f2003c = new LinkedHashMap();
        this.f2004d = new LinkedHashMap();
        this.e = new Z.B(1, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(I i) {
        D1.i.e(i, "this$0");
        Iterator it = u1.s.G(i.f2002b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = i.f2001a;
            if (!hasNext) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return AbstractC0078a.d(new t1.d("keys", arrayList), new t1.d("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle a2 = ((InterfaceC0232c) entry.getValue()).a();
            D1.i.e(str2, "key");
            if (a2 != null) {
                Class[] clsArr = f2000f;
                for (int i2 = 0; i2 < 29; i2++) {
                    Class cls = clsArr[i2];
                    D1.i.b(cls);
                    if (!cls.isInstance(a2)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a2.getClass() + " into saved state");
            }
            Object obj = i.f2003c.get(str2);
            z zVar = obj instanceof z ? (z) obj : null;
            if (zVar != null) {
                zVar.d(a2);
            } else {
                linkedHashMap.put(str2, a2);
            }
            O1.h hVar = (O1.h) i.f2004d.get(str2);
            if (hVar != null) {
                ((O1.q) hVar).g(a2);
            }
        }
    }

    public I() {
        this.f2001a = new LinkedHashMap();
        this.f2002b = new LinkedHashMap();
        this.f2003c = new LinkedHashMap();
        this.f2004d = new LinkedHashMap();
        this.e = new Z.B(1, this);
    }
}
