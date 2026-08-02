package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.aa;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends com.anythink.basead.exoplayer.h.f<e> implements x.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8420a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8421b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8422c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8423d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8424e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8425f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8426g = 6;

    /* renamed from: h, reason: collision with root package name */
    private final List<e> f8427h;
    private final List<e> i;

    /* renamed from: j, reason: collision with root package name */
    private final e f8428j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<r, e> f8429k;

    /* renamed from: l, reason: collision with root package name */
    private final List<d> f8430l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f8431m;

    /* renamed from: n, reason: collision with root package name */
    private final ae.b f8432n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f8433o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8434p;

    /* renamed from: q, reason: collision with root package name */
    private aa f8435q;

    /* renamed from: r, reason: collision with root package name */
    private int f8436r;

    /* renamed from: s, reason: collision with root package name */
    private int f8437s;

    public static final class a extends com.anythink.basead.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final int f8438b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8439c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f8440d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f8441e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.ae[] f8442f;

        /* renamed from: g, reason: collision with root package name */
        private final Object[] f8443g;

        /* renamed from: h, reason: collision with root package name */
        private final HashMap<Object, Integer> f8444h;

        public a(Collection<e> collection, int i, int i4, aa aaVar, boolean z6) {
            super(z6, aaVar);
            this.f8438b = i;
            this.f8439c = i4;
            int size = collection.size();
            this.f8440d = new int[size];
            this.f8441e = new int[size];
            this.f8442f = new com.anythink.basead.exoplayer.ae[size];
            this.f8443g = new Object[size];
            this.f8444h = new HashMap<>();
            int i6 = 0;
            for (e eVar : collection) {
                this.f8442f[i6] = eVar.f8453c;
                this.f8440d[i6] = eVar.f8456f;
                this.f8441e[i6] = eVar.f8455e;
                Object[] objArr = this.f8443g;
                Object obj = eVar.f8452b;
                objArr[i6] = obj;
                this.f8444h.put(obj, Integer.valueOf(i6));
                i6++;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int a(int i) {
            return com.anythink.basead.exoplayer.k.af.a(this.f8440d, i + 1);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(int i) {
            return com.anythink.basead.exoplayer.k.af.a(this.f8441e, i + 1);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final com.anythink.basead.exoplayer.ae c(int i) {
            return this.f8442f[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int d(int i) {
            return this.f8440d[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int e(int i) {
            return this.f8441e[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final Object f(int i) {
            return this.f8443g[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(Object obj) {
            Integer num = this.f8444h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return this.f8439c;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return this.f8438b;
        }
    }

    public static final class b extends p {

        /* renamed from: c, reason: collision with root package name */
        private static final Object f8445c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private static final ae.a f8446d = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private static final c f8447e = new c(0);

        /* renamed from: f, reason: collision with root package name */
        private final Object f8448f;

        public b() {
            this(f8447e, null);
        }

        public final b a(com.anythink.basead.exoplayer.ae aeVar) {
            return new b(aeVar, (this.f8448f != null || aeVar.c() <= 0) ? this.f8448f : aeVar.a(0, f8446d, true).f7129b);
        }

        public final com.anythink.basead.exoplayer.ae d() {
            return this.f8545b;
        }

        private b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
            super(aeVar);
            this.f8448f = obj;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z6) {
            this.f8545b.a(i, aVar, z6);
            if (com.anythink.basead.exoplayer.k.af.a(aVar.f7129b, this.f8448f)) {
                aVar.f7129b = f8445c;
            }
            return aVar;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            com.anythink.basead.exoplayer.ae aeVar = this.f8545b;
            if (f8445c.equals(obj)) {
                obj = this.f8448f;
            }
            return aeVar.a(obj);
        }
    }

    public static final class c extends com.anythink.basead.exoplayer.ae {
        private c() {
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return 1;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return 1;
        }

        public /* synthetic */ c(byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final ae.b a(int i, ae.b bVar, boolean z6, long j6) {
            return bVar.a(null, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b, false, true, j6 > 0 ? com.anythink.basead.exoplayer.b.f7168b : 0L, com.anythink.basead.exoplayer.b.f7168b, 0L);
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z6) {
            return aVar.a(null, null, com.anythink.basead.exoplayer.b.f7168b, 0L);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f8449a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f8450b;

        public d(Runnable runnable) {
            this.f8450b = runnable;
            this.f8449a = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        private void a() {
            this.f8449a.post(this.f8450b);
        }
    }

    public static final class f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f8459a;

        /* renamed from: b, reason: collision with root package name */
        public final T f8460b;

        /* renamed from: c, reason: collision with root package name */
        public final d f8461c;

        public f(int i, T t6, Runnable runnable) {
            this.f8459a = i;
            this.f8461c = runnable != null ? new d(runnable) : null;
            this.f8460b = t6;
        }
    }

    public i() {
        this(false, (aa) new aa.a());
    }

    private s b(int i) {
        return this.f8427h.get(i).f8451a;
    }

    private void c(int i) {
        e remove = this.i.remove(i);
        b bVar = remove.f8453c;
        a(i, -1, -bVar.b(), -bVar.c());
        remove.f8458h = true;
        if (remove.i.isEmpty()) {
            a((i) remove);
        }
    }

    private int d() {
        return this.f8427h.size();
    }

    private void e() {
        this.f8434p = false;
        List arrayList = this.f8430l.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(this.f8430l);
        this.f8430l.clear();
        a(new a(this.i, this.f8436r, this.f8437s, this.f8435q, this.f8431m), (Object) null);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f8433o.a((x.b) this).a(6).a(arrayList).i();
    }

    private void f() {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            c(size);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ int a(e eVar, int i) {
        return i + eVar.f8455e;
    }

    private i(boolean z6) {
        this(z6, new aa.a());
    }

    private void b(int i, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            a(i, it.next());
            i++;
        }
    }

    private int d(int i) {
        e eVar = this.f8428j;
        eVar.f8456f = i;
        int binarySearch = Collections.binarySearch(this.i, eVar);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        while (binarySearch < this.i.size() - 1) {
            int i4 = binarySearch + 1;
            if (this.i.get(i4).f8456f != i) {
                break;
            }
            binarySearch = i4;
        }
        return binarySearch;
    }

    private i(boolean z6, aa aaVar) {
        this(z6, aaVar, new s[0]);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ s.a a(e eVar, s.a aVar) {
        e eVar2 = eVar;
        for (int i = 0; i < eVar2.i.size(); i++) {
            if (eVar2.i.get(i).f8463b.f8556d == aVar.f8556d) {
                return aVar.a(aVar.f8553a + eVar2.f8456f);
            }
        }
        return null;
    }

    private i(s... sVarArr) {
        this(sVarArr, (byte) 0);
    }

    private void b(e eVar, com.anythink.basead.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f8453c;
            if (bVar.d() == aeVar) {
                return;
            }
            int b9 = aeVar.b() - bVar.b();
            int c9 = aeVar.c() - bVar.c();
            if (b9 != 0 || c9 != 0) {
                a(eVar.f8454d + 1, 0, b9, c9);
            }
            eVar.f8453c = bVar.a(aeVar);
            if (!eVar.f8457g && !aeVar.a()) {
                aeVar.a(0, this.f8432n, false);
                ae.b bVar2 = this.f8432n;
                long j6 = bVar2.f7142j + bVar2.f7141h;
                for (int i = 0; i < eVar.i.size(); i++) {
                    l lVar = eVar.i.get(i);
                    lVar.d(j6);
                    lVar.f();
                }
                eVar.f8457g = true;
            }
            a((d) null);
            return;
        }
        throw new IllegalArgumentException();
    }

    private i(s[] sVarArr, byte b9) {
        this(false, new aa.a(), sVarArr);
    }

    public static final class e implements Comparable<e> {

        /* renamed from: a, reason: collision with root package name */
        public final s f8451a;

        /* renamed from: d, reason: collision with root package name */
        public int f8454d;

        /* renamed from: e, reason: collision with root package name */
        public int f8455e;

        /* renamed from: f, reason: collision with root package name */
        public int f8456f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8457g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8458h;

        /* renamed from: c, reason: collision with root package name */
        public b f8453c = new b();
        public List<l> i = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f8452b = new Object();

        public e(s sVar) {
            this.f8451a = sVar;
        }

        public final void a(int i, int i4, int i6) {
            this.f8454d = i;
            this.f8455e = i4;
            this.f8456f = i6;
            this.f8457g = false;
            this.f8458h = false;
            this.i.clear();
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(e eVar) {
            return this.f8456f - eVar.f8456f;
        }

        private int a(e eVar) {
            return this.f8456f - eVar.f8456f;
        }
    }

    private i(boolean z6, aa aaVar, s... sVarArr) {
        for (s sVar : sVarArr) {
            com.anythink.basead.exoplayer.k.a.a(sVar);
        }
        this.f8435q = aaVar.a() > 0 ? aaVar.d() : aaVar;
        this.f8429k = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        this.f8427h = arrayList;
        this.i = new ArrayList();
        this.f8430l = new ArrayList();
        this.f8428j = new e(null);
        this.f8431m = z6;
        this.f8432n = new ae.b();
        a(arrayList.size(), Arrays.asList(sVarArr), (Runnable) null);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(e eVar, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        e eVar2 = eVar;
        if (eVar2 != null) {
            b bVar = eVar2.f8453c;
            if (bVar.d() != aeVar) {
                int b9 = aeVar.b() - bVar.b();
                int c9 = aeVar.c() - bVar.c();
                if (b9 != 0 || c9 != 0) {
                    a(eVar2.f8454d + 1, 0, b9, c9);
                }
                eVar2.f8453c = bVar.a(aeVar);
                if (!eVar2.f8457g && !aeVar.a()) {
                    aeVar.a(0, this.f8432n, false);
                    ae.b bVar2 = this.f8432n;
                    long j6 = bVar2.f7142j + bVar2.f7141h;
                    for (int i = 0; i < eVar2.i.size(); i++) {
                        l lVar = eVar2.i.get(i);
                        lVar.d(j6);
                        lVar.f();
                    }
                    eVar2.f8457g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void c() {
        this.f8427h.clear();
        com.anythink.basead.exoplayer.h hVar = this.f8433o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a((Object) null).i();
        }
    }

    private void b(int i, int i4) {
        int min = Math.min(i, i4);
        int max = Math.max(i, i4);
        int i6 = this.i.get(min).f8455e;
        int i9 = this.i.get(min).f8456f;
        List<e> list = this.i;
        list.add(i4, list.remove(i));
        while (min <= max) {
            e eVar = this.i.get(min);
            eVar.f8455e = i6;
            eVar.f8456f = i9;
            i6 += eVar.f8453c.b();
            i9 += eVar.f8453c.c();
            min++;
        }
    }

    private void a(s sVar) {
        a(this.f8427h.size(), sVar, (Runnable) null);
    }

    private void a(s sVar, Runnable runnable) {
        a(this.f8427h.size(), sVar, runnable);
    }

    private void a(int i, s sVar) {
        a(i, sVar, (Runnable) null);
    }

    private void a(int i, s sVar, Runnable runnable) {
        com.anythink.basead.exoplayer.k.a.a(sVar);
        e eVar = new e(sVar);
        this.f8427h.add(i, eVar);
        com.anythink.basead.exoplayer.h hVar = this.f8433o;
        if (hVar != null) {
            hVar.a((x.b) this).a(0).a(new f(i, eVar, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Collection<s> collection) {
        a(this.f8427h.size(), collection, (Runnable) null);
    }

    private void a(Collection<s> collection, Runnable runnable) {
        a(this.f8427h.size(), collection, runnable);
    }

    private void a(int i, Collection<s> collection) {
        a(i, collection, (Runnable) null);
    }

    private void a(int i, Collection<s> collection, Runnable runnable) {
        Iterator<s> it = collection.iterator();
        while (it.hasNext()) {
            com.anythink.basead.exoplayer.k.a.a(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<s> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next()));
        }
        this.f8427h.addAll(i, arrayList);
        if (this.f8433o != null && !collection.isEmpty()) {
            this.f8433o.a((x.b) this).a(1).a(new f(i, arrayList, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i, Runnable runnable) {
        this.f8427h.remove(i);
        com.anythink.basead.exoplayer.h hVar = this.f8433o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i, null, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i, int i4, Runnable runnable) {
        if (i == i4) {
            return;
        }
        List<e> list = this.f8427h;
        list.add(i4, list.remove(i));
        com.anythink.basead.exoplayer.h hVar = this.f8433o;
        if (hVar != null) {
            hVar.a((x.b) this).a(3).a(new f(i, Integer.valueOf(i4), runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Runnable runnable) {
        this.f8427h.clear();
        com.anythink.basead.exoplayer.h hVar = this.f8433o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a(runnable != null ? new d(runnable) : null).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        super.a(hVar, z6);
        this.f8433o = hVar;
        if (this.f8427h.isEmpty()) {
            e();
            return;
        }
        this.f8435q = this.f8435q.a(0, this.f8427h.size());
        b(0, this.f8427h);
        a((d) null);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        int i;
        int i4 = aVar.f8553a;
        e eVar = this.f8428j;
        eVar.f8456f = i4;
        int binarySearch = Collections.binarySearch(this.i, eVar);
        if (binarySearch < 0) {
            i = (-binarySearch) - 2;
        } else {
            while (binarySearch < this.i.size() - 1) {
                int i6 = binarySearch + 1;
                if (this.i.get(i6).f8456f != i4) {
                    break;
                }
                binarySearch = i6;
            }
            i = binarySearch;
        }
        e eVar2 = this.i.get(i);
        l lVar = new l(eVar2.f8451a, aVar.a(aVar.f8553a - eVar2.f8456f), bVar);
        this.f8429k.put(lVar, eVar2);
        eVar2.i.add(lVar);
        if (eVar2.f8457g) {
            lVar.f();
        }
        return lVar;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        e remove = this.f8429k.remove(rVar);
        ((l) rVar).g();
        remove.i.remove(rVar);
        if (remove.i.isEmpty() && remove.f8458h) {
            a((i) remove);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.i.clear();
        this.f8433o = null;
        this.f8435q = this.f8435q.d();
        this.f8436r = 0;
        this.f8437s = 0;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(e eVar, s.a aVar) {
        for (int i = 0; i < eVar.i.size(); i++) {
            if (eVar.i.get(i).f8463b.f8556d == aVar.f8556d) {
                return aVar.a(aVar.f8553a + eVar.f8456f);
            }
        }
        return null;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static int a2(e eVar, int i) {
        return i + eVar.f8455e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                f fVar = (f) obj;
                this.f8435q = this.f8435q.a(fVar.f8459a, 1);
                a(fVar.f8459a, (e) fVar.f8460b);
                a(fVar.f8461c);
                return;
            case 1:
                f fVar2 = (f) obj;
                this.f8435q = this.f8435q.a(fVar2.f8459a, ((Collection) fVar2.f8460b).size());
                b(fVar2.f8459a, (Collection<e>) fVar2.f8460b);
                a(fVar2.f8461c);
                return;
            case 2:
                f fVar3 = (f) obj;
                this.f8435q = this.f8435q.c(fVar3.f8459a);
                c(fVar3.f8459a);
                a(fVar3.f8461c);
                return;
            case 3:
                f fVar4 = (f) obj;
                aa c9 = this.f8435q.c(fVar4.f8459a);
                this.f8435q = c9;
                this.f8435q = c9.a(((Integer) fVar4.f8460b).intValue(), 1);
                int i4 = fVar4.f8459a;
                int intValue = ((Integer) fVar4.f8460b).intValue();
                int min = Math.min(i4, intValue);
                int max = Math.max(i4, intValue);
                int i6 = this.i.get(min).f8455e;
                int i9 = this.i.get(min).f8456f;
                List<e> list = this.i;
                list.add(intValue, list.remove(i4));
                while (min <= max) {
                    e eVar = this.i.get(min);
                    eVar.f8455e = i6;
                    eVar.f8456f = i9;
                    i6 += eVar.f8453c.b();
                    i9 += eVar.f8453c.c();
                    min++;
                }
                a(fVar4.f8461c);
                return;
            case 4:
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    c(size);
                }
                a((d) obj);
                return;
            case 5:
                e();
                return;
            case 6:
                List list2 = (List) obj;
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    d dVar = (d) list2.get(i10);
                    dVar.f8449a.post(dVar.f8450b);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(d dVar) {
        if (!this.f8434p) {
            this.f8433o.a((x.b) this).a(5).i();
            this.f8434p = true;
        }
        if (dVar != null) {
            this.f8430l.add(dVar);
        }
    }

    private void a(int i, e eVar) {
        if (i > 0) {
            e eVar2 = this.i.get(i - 1);
            eVar.a(i, eVar2.f8453c.b() + eVar2.f8455e, eVar2.f8453c.c() + eVar2.f8456f);
        } else {
            eVar.a(i, 0, 0);
        }
        a(i, 1, eVar.f8453c.b(), eVar.f8453c.c());
        this.i.add(i, eVar);
        a((i) eVar, eVar.f8451a);
    }

    private void a(int i, int i4, int i6, int i9) {
        this.f8436r += i6;
        this.f8437s += i9;
        while (i < this.i.size()) {
            this.i.get(i).f8454d += i4;
            this.i.get(i).f8455e += i6;
            this.i.get(i).f8456f += i9;
            i++;
        }
    }

    private void a(int i) {
        this.f8427h.remove(i);
        com.anythink.basead.exoplayer.h hVar = this.f8433o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i, null, null)).i();
        }
    }

    private void a(int i, int i4) {
        if (i != i4) {
            List<e> list = this.f8427h;
            list.add(i4, list.remove(i));
            com.anythink.basead.exoplayer.h hVar = this.f8433o;
            if (hVar != null) {
                hVar.a((x.b) this).a(3).a(new f(i, Integer.valueOf(i4), null)).i();
            }
        }
    }

    private void a(e eVar, com.anythink.basead.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f8453c;
            if (bVar.d() != aeVar) {
                int b9 = aeVar.b() - bVar.b();
                int c9 = aeVar.c() - bVar.c();
                if (b9 != 0 || c9 != 0) {
                    a(eVar.f8454d + 1, 0, b9, c9);
                }
                eVar.f8453c = bVar.a(aeVar);
                if (!eVar.f8457g && !aeVar.a()) {
                    aeVar.a(0, this.f8432n, false);
                    ae.b bVar2 = this.f8432n;
                    long j6 = bVar2.f7142j + bVar2.f7141h;
                    for (int i = 0; i < eVar.i.size(); i++) {
                        l lVar = eVar.i.get(i);
                        lVar.d(j6);
                        lVar.f();
                    }
                    eVar.f8457g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
