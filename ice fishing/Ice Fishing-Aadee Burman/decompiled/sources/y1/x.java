package y1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final z f41833e = new z(10);

    /* renamed from: f, reason: collision with root package name */
    public static final C5202A f41834f = new C5202A(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41835a;

    /* renamed from: b, reason: collision with root package name */
    public final z f41836b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f41837c;

    /* renamed from: d, reason: collision with root package name */
    public final Z2.e f41838d;

    public x(Z2.e eVar) {
        z zVar = f41833e;
        this.f41835a = new ArrayList();
        this.f41837c = new HashSet();
        this.f41838d = eVar;
        this.f41836b = zVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f41835a.iterator();
            while (it.hasNext()) {
                C5228w c5228w = (C5228w) it.next();
                if (!this.f41837c.contains(c5228w) && c5228w.f41830a.isAssignableFrom(cls)) {
                    this.f41837c.add(c5228w);
                    arrayList.add(c5228w.f41832c.i(this));
                    this.f41837c.remove(c5228w);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized InterfaceC5223r b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f41835a.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                C5228w c5228w = (C5228w) it.next();
                if (this.f41837c.contains(c5228w)) {
                    z3 = true;
                } else if (c5228w.f41830a.isAssignableFrom(cls) && c5228w.f41831b.isAssignableFrom(cls2)) {
                    this.f41837c.add(c5228w);
                    arrayList.add(c5228w.f41832c.i(this));
                    this.f41837c.remove(c5228w);
                }
            }
            if (arrayList.size() > 1) {
                z zVar = this.f41836b;
                Z2.e eVar = this.f41838d;
                zVar.getClass();
                return new C5207b(2, arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC5223r) arrayList.get(0);
            }
            if (z3) {
                return f41834f;
            }
            throw new com.bumptech.glide.k("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f41837c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f41835a.iterator();
        while (it.hasNext()) {
            C5228w c5228w = (C5228w) it.next();
            if (!arrayList.contains(c5228w.f41831b) && c5228w.f41830a.isAssignableFrom(cls)) {
                arrayList.add(c5228w.f41831b);
            }
        }
        return arrayList;
    }
}
