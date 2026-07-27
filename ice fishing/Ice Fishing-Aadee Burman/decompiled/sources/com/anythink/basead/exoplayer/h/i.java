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
    private static final int f7634a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7635b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7636c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7637d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7638e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7639f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7640g = 6;

    /* renamed from: h, reason: collision with root package name */
    private final List<e> f7641h;
    private final List<e> i;

    /* renamed from: j, reason: collision with root package name */
    private final e f7642j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<r, e> f7643k;

    /* renamed from: l, reason: collision with root package name */
    private final List<d> f7644l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7645m;

    /* renamed from: n, reason: collision with root package name */
    private final ae.b f7646n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h f7647o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7648p;

    /* renamed from: q, reason: collision with root package name */
    private aa f7649q;

    /* renamed from: r, reason: collision with root package name */
    private int f7650r;

    /* renamed from: s, reason: collision with root package name */
    private int f7651s;

    public static final class a extends com.anythink.basead.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final int f7652b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7653c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f7654d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f7655e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.ae[] f7656f;

        /* renamed from: g, reason: collision with root package name */
        private final Object[] f7657g;

        /* renamed from: h, reason: collision with root package name */
        private final HashMap<Object, Integer> f7658h;

        public a(Collection<e> collection, int i, int i6, aa aaVar, boolean z3) {
            super(z3, aaVar);
            this.f7652b = i;
            this.f7653c = i6;
            int size = collection.size();
            this.f7654d = new int[size];
            this.f7655e = new int[size];
            this.f7656f = new com.anythink.basead.exoplayer.ae[size];
            this.f7657g = new Object[size];
            this.f7658h = new HashMap<>();
            int i9 = 0;
            for (e eVar : collection) {
                this.f7656f[i9] = eVar.f7667c;
                this.f7654d[i9] = eVar.f7670f;
                this.f7655e[i9] = eVar.f7669e;
                Object[] objArr = this.f7657g;
                Object obj = eVar.f7666b;
                objArr[i9] = obj;
                this.f7658h.put(obj, Integer.valueOf(i9));
                i9++;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int a(int i) {
            return com.anythink.basead.exoplayer.k.af.a(this.f7654d, i + 1);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(int i) {
            return com.anythink.basead.exoplayer.k.af.a(this.f7655e, i + 1);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final com.anythink.basead.exoplayer.ae c(int i) {
            return this.f7656f[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int d(int i) {
            return this.f7654d[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int e(int i) {
            return this.f7655e[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final Object f(int i) {
            return this.f7657g[i];
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(Object obj) {
            Integer num = this.f7658h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return this.f7653c;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return this.f7652b;
        }
    }

    public static final class b extends p {

        /* renamed from: c, reason: collision with root package name */
        private static final Object f7659c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private static final ae.a f7660d = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private static final c f7661e = new c(0);

        /* renamed from: f, reason: collision with root package name */
        private final Object f7662f;

        public b() {
            this(f7661e, null);
        }

        public final b a(com.anythink.basead.exoplayer.ae aeVar) {
            return new b(aeVar, (this.f7662f != null || aeVar.c() <= 0) ? this.f7662f : aeVar.a(0, f7660d, true).f6343b);
        }

        public final com.anythink.basead.exoplayer.ae d() {
            return this.f7759b;
        }

        private b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
            super(aeVar);
            this.f7662f = obj;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z3) {
            this.f7759b.a(i, aVar, z3);
            if (com.anythink.basead.exoplayer.k.af.a(aVar.f6343b, this.f7662f)) {
                aVar.f6343b = f7659c;
            }
            return aVar;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            com.anythink.basead.exoplayer.ae aeVar = this.f7759b;
            if (f7659c.equals(obj)) {
                obj = this.f7662f;
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
        public final ae.b a(int i, ae.b bVar, boolean z3, long j6) {
            return bVar.a(null, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b, false, true, j6 > 0 ? com.anythink.basead.exoplayer.b.f6382b : 0L, com.anythink.basead.exoplayer.b.f6382b, 0L);
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z3) {
            return aVar.a(null, null, com.anythink.basead.exoplayer.b.f6382b, 0L);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f7663a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f7664b;

        public d(Runnable runnable) {
            this.f7664b = runnable;
            this.f7663a = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        private void a() {
            this.f7663a.post(this.f7664b);
        }
    }

    public static final class f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f7673a;

        /* renamed from: b, reason: collision with root package name */
        public final T f7674b;

        /* renamed from: c, reason: collision with root package name */
        public final d f7675c;

        public f(int i, T t6, Runnable runnable) {
            this.f7673a = i;
            this.f7675c = runnable != null ? new d(runnable) : null;
            this.f7674b = t6;
        }
    }

    public i() {
        this(false, (aa) new aa.a());
    }

    private s b(int i) {
        return this.f7641h.get(i).f7665a;
    }

    private void c(int i) {
        e remove = this.i.remove(i);
        b bVar = remove.f7667c;
        a(i, -1, -bVar.b(), -bVar.c());
        remove.f7672h = true;
        if (remove.i.isEmpty()) {
            a((i) remove);
        }
    }

    private int d() {
        return this.f7641h.size();
    }

    private void e() {
        this.f7648p = false;
        List arrayList = this.f7644l.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(this.f7644l);
        this.f7644l.clear();
        a(new a(this.i, this.f7650r, this.f7651s, this.f7649q, this.f7645m), (Object) null);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f7647o.a((x.b) this).a(6).a(arrayList).i();
    }

    private void f() {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            c(size);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ int a(e eVar, int i) {
        return i + eVar.f7669e;
    }

    private i(boolean z3) {
        this(z3, new aa.a());
    }

    private void b(int i, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            a(i, it.next());
            i++;
        }
    }

    private int d(int i) {
        e eVar = this.f7642j;
        eVar.f7670f = i;
        int binarySearch = Collections.binarySearch(this.i, eVar);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        while (binarySearch < this.i.size() - 1) {
            int i6 = binarySearch + 1;
            if (this.i.get(i6).f7670f != i) {
                break;
            }
            binarySearch = i6;
        }
        return binarySearch;
    }

    private i(boolean z3, aa aaVar) {
        this(z3, aaVar, new s[0]);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ s.a a(e eVar, s.a aVar) {
        e eVar2 = eVar;
        for (int i = 0; i < eVar2.i.size(); i++) {
            if (eVar2.i.get(i).f7677b.f7770d == aVar.f7770d) {
                return aVar.a(aVar.f7767a + eVar2.f7670f);
            }
        }
        return null;
    }

    private i(s... sVarArr) {
        this(sVarArr, (byte) 0);
    }

    private void b(e eVar, com.anythink.basead.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f7667c;
            if (bVar.d() == aeVar) {
                return;
            }
            int b9 = aeVar.b() - bVar.b();
            int c9 = aeVar.c() - bVar.c();
            if (b9 != 0 || c9 != 0) {
                a(eVar.f7668d + 1, 0, b9, c9);
            }
            eVar.f7667c = bVar.a(aeVar);
            if (!eVar.f7671g && !aeVar.a()) {
                aeVar.a(0, this.f7646n, false);
                ae.b bVar2 = this.f7646n;
                long j6 = bVar2.f6356j + bVar2.f6355h;
                for (int i = 0; i < eVar.i.size(); i++) {
                    l lVar = eVar.i.get(i);
                    lVar.d(j6);
                    lVar.f();
                }
                eVar.f7671g = true;
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
        public final s f7665a;

        /* renamed from: d, reason: collision with root package name */
        public int f7668d;

        /* renamed from: e, reason: collision with root package name */
        public int f7669e;

        /* renamed from: f, reason: collision with root package name */
        public int f7670f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7671g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7672h;

        /* renamed from: c, reason: collision with root package name */
        public b f7667c = new b();
        public List<l> i = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f7666b = new Object();

        public e(s sVar) {
            this.f7665a = sVar;
        }

        public final void a(int i, int i6, int i9) {
            this.f7668d = i;
            this.f7669e = i6;
            this.f7670f = i9;
            this.f7671g = false;
            this.f7672h = false;
            this.i.clear();
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(e eVar) {
            return this.f7670f - eVar.f7670f;
        }

        private int a(e eVar) {
            return this.f7670f - eVar.f7670f;
        }
    }

    private i(boolean z3, aa aaVar, s... sVarArr) {
        for (s sVar : sVarArr) {
            com.anythink.basead.exoplayer.k.a.a(sVar);
        }
        this.f7649q = aaVar.a() > 0 ? aaVar.d() : aaVar;
        this.f7643k = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        this.f7641h = arrayList;
        this.i = new ArrayList();
        this.f7644l = new ArrayList();
        this.f7642j = new e(null);
        this.f7645m = z3;
        this.f7646n = new ae.b();
        a(arrayList.size(), Arrays.asList(sVarArr), (Runnable) null);
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(e eVar, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        e eVar2 = eVar;
        if (eVar2 != null) {
            b bVar = eVar2.f7667c;
            if (bVar.d() != aeVar) {
                int b9 = aeVar.b() - bVar.b();
                int c9 = aeVar.c() - bVar.c();
                if (b9 != 0 || c9 != 0) {
                    a(eVar2.f7668d + 1, 0, b9, c9);
                }
                eVar2.f7667c = bVar.a(aeVar);
                if (!eVar2.f7671g && !aeVar.a()) {
                    aeVar.a(0, this.f7646n, false);
                    ae.b bVar2 = this.f7646n;
                    long j6 = bVar2.f6356j + bVar2.f6355h;
                    for (int i = 0; i < eVar2.i.size(); i++) {
                        l lVar = eVar2.i.get(i);
                        lVar.d(j6);
                        lVar.f();
                    }
                    eVar2.f7671g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void c() {
        this.f7641h.clear();
        com.anythink.basead.exoplayer.h hVar = this.f7647o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a((Object) null).i();
        }
    }

    private void b(int i, int i6) {
        int min = Math.min(i, i6);
        int max = Math.max(i, i6);
        int i9 = this.i.get(min).f7669e;
        int i10 = this.i.get(min).f7670f;
        List<e> list = this.i;
        list.add(i6, list.remove(i));
        while (min <= max) {
            e eVar = this.i.get(min);
            eVar.f7669e = i9;
            eVar.f7670f = i10;
            i9 += eVar.f7667c.b();
            i10 += eVar.f7667c.c();
            min++;
        }
    }

    private void a(s sVar) {
        a(this.f7641h.size(), sVar, (Runnable) null);
    }

    private void a(s sVar, Runnable runnable) {
        a(this.f7641h.size(), sVar, runnable);
    }

    private void a(int i, s sVar) {
        a(i, sVar, (Runnable) null);
    }

    private void a(int i, s sVar, Runnable runnable) {
        com.anythink.basead.exoplayer.k.a.a(sVar);
        e eVar = new e(sVar);
        this.f7641h.add(i, eVar);
        com.anythink.basead.exoplayer.h hVar = this.f7647o;
        if (hVar != null) {
            hVar.a((x.b) this).a(0).a(new f(i, eVar, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Collection<s> collection) {
        a(this.f7641h.size(), collection, (Runnable) null);
    }

    private void a(Collection<s> collection, Runnable runnable) {
        a(this.f7641h.size(), collection, runnable);
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
        this.f7641h.addAll(i, arrayList);
        if (this.f7647o != null && !collection.isEmpty()) {
            this.f7647o.a((x.b) this).a(1).a(new f(i, arrayList, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i, Runnable runnable) {
        this.f7641h.remove(i);
        com.anythink.basead.exoplayer.h hVar = this.f7647o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i, null, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i, int i6, Runnable runnable) {
        if (i == i6) {
            return;
        }
        List<e> list = this.f7641h;
        list.add(i6, list.remove(i));
        com.anythink.basead.exoplayer.h hVar = this.f7647o;
        if (hVar != null) {
            hVar.a((x.b) this).a(3).a(new f(i, Integer.valueOf(i6), runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Runnable runnable) {
        this.f7641h.clear();
        com.anythink.basead.exoplayer.h hVar = this.f7647o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a(runnable != null ? new d(runnable) : null).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        super.a(hVar, z3);
        this.f7647o = hVar;
        if (this.f7641h.isEmpty()) {
            e();
            return;
        }
        this.f7649q = this.f7649q.a(0, this.f7641h.size());
        b(0, this.f7641h);
        a((d) null);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        int i;
        int i6 = aVar.f7767a;
        e eVar = this.f7642j;
        eVar.f7670f = i6;
        int binarySearch = Collections.binarySearch(this.i, eVar);
        if (binarySearch < 0) {
            i = (-binarySearch) - 2;
        } else {
            while (binarySearch < this.i.size() - 1) {
                int i9 = binarySearch + 1;
                if (this.i.get(i9).f7670f != i6) {
                    break;
                }
                binarySearch = i9;
            }
            i = binarySearch;
        }
        e eVar2 = this.i.get(i);
        l lVar = new l(eVar2.f7665a, aVar.a(aVar.f7767a - eVar2.f7670f), bVar);
        this.f7643k.put(lVar, eVar2);
        eVar2.i.add(lVar);
        if (eVar2.f7671g) {
            lVar.f();
        }
        return lVar;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        e remove = this.f7643k.remove(rVar);
        ((l) rVar).g();
        remove.i.remove(rVar);
        if (remove.i.isEmpty() && remove.f7672h) {
            a((i) remove);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.i.clear();
        this.f7647o = null;
        this.f7649q = this.f7649q.d();
        this.f7650r = 0;
        this.f7651s = 0;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(e eVar, s.a aVar) {
        for (int i = 0; i < eVar.i.size(); i++) {
            if (eVar.i.get(i).f7677b.f7770d == aVar.f7770d) {
                return aVar.a(aVar.f7767a + eVar.f7670f);
            }
        }
        return null;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static int a2(e eVar, int i) {
        return i + eVar.f7669e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                f fVar = (f) obj;
                this.f7649q = this.f7649q.a(fVar.f7673a, 1);
                a(fVar.f7673a, (e) fVar.f7674b);
                a(fVar.f7675c);
                return;
            case 1:
                f fVar2 = (f) obj;
                this.f7649q = this.f7649q.a(fVar2.f7673a, ((Collection) fVar2.f7674b).size());
                b(fVar2.f7673a, (Collection<e>) fVar2.f7674b);
                a(fVar2.f7675c);
                return;
            case 2:
                f fVar3 = (f) obj;
                this.f7649q = this.f7649q.c(fVar3.f7673a);
                c(fVar3.f7673a);
                a(fVar3.f7675c);
                return;
            case 3:
                f fVar4 = (f) obj;
                aa c9 = this.f7649q.c(fVar4.f7673a);
                this.f7649q = c9;
                this.f7649q = c9.a(((Integer) fVar4.f7674b).intValue(), 1);
                int i6 = fVar4.f7673a;
                int intValue = ((Integer) fVar4.f7674b).intValue();
                int min = Math.min(i6, intValue);
                int max = Math.max(i6, intValue);
                int i9 = this.i.get(min).f7669e;
                int i10 = this.i.get(min).f7670f;
                List<e> list = this.i;
                list.add(intValue, list.remove(i6));
                while (min <= max) {
                    e eVar = this.i.get(min);
                    eVar.f7669e = i9;
                    eVar.f7670f = i10;
                    i9 += eVar.f7667c.b();
                    i10 += eVar.f7667c.c();
                    min++;
                }
                a(fVar4.f7675c);
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
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    d dVar = (d) list2.get(i11);
                    dVar.f7663a.post(dVar.f7664b);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(d dVar) {
        if (!this.f7648p) {
            this.f7647o.a((x.b) this).a(5).i();
            this.f7648p = true;
        }
        if (dVar != null) {
            this.f7644l.add(dVar);
        }
    }

    private void a(int i, e eVar) {
        if (i > 0) {
            e eVar2 = this.i.get(i - 1);
            eVar.a(i, eVar2.f7667c.b() + eVar2.f7669e, eVar2.f7667c.c() + eVar2.f7670f);
        } else {
            eVar.a(i, 0, 0);
        }
        a(i, 1, eVar.f7667c.b(), eVar.f7667c.c());
        this.i.add(i, eVar);
        a((i) eVar, eVar.f7665a);
    }

    private void a(int i, int i6, int i9, int i10) {
        this.f7650r += i9;
        this.f7651s += i10;
        while (i < this.i.size()) {
            this.i.get(i).f7668d += i6;
            this.i.get(i).f7669e += i9;
            this.i.get(i).f7670f += i10;
            i++;
        }
    }

    private void a(int i) {
        this.f7641h.remove(i);
        com.anythink.basead.exoplayer.h hVar = this.f7647o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i, null, null)).i();
        }
    }

    private void a(int i, int i6) {
        if (i != i6) {
            List<e> list = this.f7641h;
            list.add(i6, list.remove(i));
            com.anythink.basead.exoplayer.h hVar = this.f7647o;
            if (hVar != null) {
                hVar.a((x.b) this).a(3).a(new f(i, Integer.valueOf(i6), null)).i();
            }
        }
    }

    private void a(e eVar, com.anythink.basead.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f7667c;
            if (bVar.d() != aeVar) {
                int b9 = aeVar.b() - bVar.b();
                int c9 = aeVar.c() - bVar.c();
                if (b9 != 0 || c9 != 0) {
                    a(eVar.f7668d + 1, 0, b9, c9);
                }
                eVar.f7667c = bVar.a(aeVar);
                if (!eVar.f7671g && !aeVar.a()) {
                    aeVar.a(0, this.f7646n, false);
                    ae.b bVar2 = this.f7646n;
                    long j6 = bVar2.f6356j + bVar2.f6355h;
                    for (int i = 0; i < eVar.i.size(); i++) {
                        l lVar = eVar.i.get(i);
                        lVar.d(j6);
                        lVar.f();
                    }
                    eVar.f7671g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
