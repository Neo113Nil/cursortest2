package com.anythink.core.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h;
import com.anythink.core.common.h.a;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.n;
import com.anythink.core.common.j;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.l;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.anythink.core.common.w.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b extends com.anythink.core.common.v.b implements j.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12473a = "b";

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.core.common.h f12476d;

    /* renamed from: e, reason: collision with root package name */
    protected long f12477e;

    /* renamed from: g, reason: collision with root package name */
    private String f12479g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f12480h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private long f12481j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12482k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.h.a f12483l;

    /* renamed from: m, reason: collision with root package name */
    private Map<Integer, d> f12484m;

    /* renamed from: n, reason: collision with root package name */
    private long f12485n;

    /* renamed from: o, reason: collision with root package name */
    private List<bv> f12486o;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.core.common.t.b f12488q;

    /* renamed from: b, reason: collision with root package name */
    Map<String, n> f12474b = new ConcurrentHashMap(3);

    /* renamed from: c, reason: collision with root package name */
    com.anythink.core.common.t.b f12475c = new com.anythink.core.common.t.b() { // from class: com.anythink.core.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.b.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    };

    /* renamed from: p, reason: collision with root package name */
    private boolean f12487p = false;

    /* renamed from: f, reason: collision with root package name */
    h.b f12478f = new h.b() { // from class: com.anythink.core.b.b.3
        @Override // com.anythink.core.common.h.b
        public final void a(d dVar, int i) {
            b.a(b.this, dVar, i);
        }
    };

    /* renamed from: com.anythink.core.b.b$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.core.b.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12495a;

        public AnonymousClass4(int i) {
            this.f12495a = i;
        }

        @Override // com.anythink.core.b.b.b
        public final void a(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
            b.a(b.this, bvVar, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.b.b.b
        public final void a(List<bv> list, List<bv> list2) {
            b.this.b(Integer.valueOf(this.f12495a), list, list2);
            com.anythink.core.common.h hVar = b.this.f12476d;
            if (hVar != null) {
                hVar.b();
            }
        }
    }

    /* renamed from: com.anythink.core.b.b$5, reason: invalid class name */
    public class AnonymousClass5 implements com.anythink.core.common.t.b {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.b.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.d();
                }
            });
        }
    }

    /* renamed from: com.anythink.core.b.b$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bv f12500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f12501b;

        public AnonymousClass7(bv bvVar, n nVar) {
            this.f12500a = bvVar;
            this.f12501b = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adSourceBidError, "", this.f12500a.F());
            if (b.this.f12483l.f14114c.f14334d != null) {
                if (this.f12501b != null) {
                    b.this.f12483l.f14114c.f14334d.onAdSourceBiddingFail(this.f12501b, errorCode);
                }
                b.this.f12474b.remove(this.f12500a.z());
            }
            b.this.a(this.f12501b, errorCode, a.b.f17772c, this.f12500a);
        }
    }

    /* renamed from: com.anythink.core.b.b$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f12503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bv f12504b;

        public AnonymousClass8(n nVar, bv bvVar) {
            this.f12503a = nVar;
            this.f12504b = bvVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f12483l.f14114c.f14334d != null) {
                n nVar = this.f12503a;
                if (nVar != null) {
                    aj.a(nVar, this.f12504b, 0, false);
                    b.this.f12483l.f14114c.f14334d.onAdSourceBiddingFilled(this.f12503a);
                }
                b.this.f12474b.remove(this.f12504b.z());
            }
        }
    }

    public b(com.anythink.core.common.h.a aVar) {
        this.f12483l = aVar;
        this.f12479g = aVar.f14116e;
        this.i = aVar.f14115d;
        this.f12481j = aVar.f14118g;
        this.f12476d = aVar.f14112F;
        List<bv> list = aVar.f14120j;
        int size = list.size();
        List<bv> a9 = aVar.f14135y.a();
        if (a9.size() > 0) {
            this.f12483l.f14136z = a9.size() + size;
        } else {
            this.f12483l.f14136z = size;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<bv> list2 = null;
        List<bv> list3 = null;
        List<bv> list4 = null;
        List<bv> list5 = null;
        for (int i = 0; i < size; i++) {
            bv bvVar = list.get(i);
            if (bvVar.q() == 1 || bvVar.q() == 3) {
                if (this.f12483l.f14111E == 1 && bvVar.q() == 3) {
                    list2 = list2 == null ? new ArrayList<>() : list2;
                    list2.add(bvVar);
                } else {
                    arrayList.add(bvVar);
                }
            } else if (bvVar.q() == 2) {
                list3 = list3 == null ? new ArrayList<>(size) : list3;
                list3.add(bvVar);
            } else if (bvVar.q() == 5) {
                list4 = list4 == null ? new ArrayList<>(size) : list4;
                list4.add(bvVar);
            } else if (bvVar.q() == 6) {
                list5 = list5 == null ? new ArrayList<>(size) : list5;
                list5.add(bvVar);
            } else if (bvVar.q() == 7) {
                arrayList2.add(bvVar);
            }
        }
        this.f12484m = new HashMap(5);
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            this.f12484m.put(1, new c(aVar.a(arrayList, arrayList2), list));
        }
        if (list2 != null && list2.size() > 0) {
            this.f12484m.put(3, new c(aVar.a(list2, null), list));
        }
        if (list3 != null && list3.size() > 0) {
            this.f12484m.put(2, new a(aVar.a(list3)));
        }
        if (list4 != null && list4.size() > 0) {
            this.f12484m.put(5, new h(aVar.b(list4)));
        }
        if (list5 == null || list5.size() <= 0) {
            return;
        }
        this.f12484m.put(6, new g(aVar.c(list5)));
    }

    private void e() {
        boolean z6 = this.f12483l.f14110D > 0;
        this.f12487p = z6;
        if (z6) {
            this.f12486o = Collections.synchronizedList(new ArrayList());
            this.f12488q = new AnonymousClass5();
            com.anythink.core.common.t.d.a().a(this.f12488q, this.f12483l.f14110D, false);
        }
    }

    private void b(long j6) {
        com.anythink.core.common.h.a aVar = this.f12483l;
        this.f12477e = aVar.i;
        ar arVar = aVar.f14114c;
        if (arVar.f14339j) {
            int i = arVar.f14338h;
            int bw = aVar.f14124n.a().bw();
            if (bw > 0 && i > bw) {
                this.f12477e = i - bw;
            }
        }
        if (this.f12477e <= 0) {
            this.f12477e = com.anythink.basead.exoplayer.i.a.f8669f;
        }
        this.f12477e += j6;
        com.anythink.core.common.t.d.a().a(this.f12475c, this.f12477e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        try {
            j.a aVar = this.f12480h;
            if (aVar != null) {
                aVar.a(this.i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        try {
            if (this.f12487p) {
                this.f12487p = false;
                List<bv> list = this.f12486o;
                if (list != null && list.size() != 0) {
                    Objects.toString(this.f12486o);
                    ArrayList arrayList = new ArrayList(this.f12486o);
                    this.f12486o.clear();
                    j.a aVar = this.f12480h;
                    if (aVar != null) {
                        aVar.a(this.i, arrayList, new ArrayList(1), false);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.j.b
    public final void a(boolean z6) {
        this.f12482k = z6;
    }

    @Override // com.anythink.core.common.j.b
    public final void a(j.a aVar) {
        this.f12480h = aVar;
        com.anythink.core.common.h hVar = this.f12476d;
        long c9 = hVar == null ? 0L : hVar.c();
        a(this.f12481j + c9);
        com.anythink.core.common.h.a aVar2 = this.f12483l;
        this.f12477e = aVar2.i;
        ar arVar = aVar2.f14114c;
        if (arVar.f14339j) {
            int i = arVar.f14338h;
            int bw = aVar2.f14124n.a().bw();
            if (bw > 0 && i > bw) {
                this.f12477e = i - bw;
            }
        }
        if (this.f12477e <= 0) {
            this.f12477e = com.anythink.basead.exoplayer.i.a.f8669f;
        }
        this.f12477e += c9;
        com.anythink.core.common.t.d.a().a(this.f12475c, this.f12477e, false);
        boolean z6 = this.f12483l.f14110D > 0;
        this.f12487p = z6;
        if (z6) {
            this.f12486o = Collections.synchronizedList(new ArrayList());
            this.f12488q = new AnonymousClass5();
            com.anythink.core.common.t.d.a().a(this.f12488q, this.f12483l.f14110D, false);
        }
        this.f12485n = System.currentTimeMillis();
        HashMap hashMap = new HashMap(this.f12484m);
        com.anythink.core.common.h hVar2 = this.f12476d;
        if (hVar2 != null) {
            hVar2.a(this.f12478f);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            final Integer num = (Integer) entry.getKey();
            final d dVar = (d) entry.getValue();
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.a(b.this.f12477e);
                        dVar.a(b.this.f12482k);
                        b bVar = b.this;
                        com.anythink.core.common.h hVar3 = bVar.f12476d;
                        if (hVar3 == null) {
                            b.a(bVar, dVar, num.intValue());
                            return;
                        }
                        d dVar3 = dVar;
                        int intValue = num.intValue();
                        if (dVar3 != null) {
                            hVar3.new a(dVar3, intValue);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Integer num, List<bv> list, List<bv> list2) {
        a(num, list, list2);
    }

    @Override // com.anythink.core.common.v.b
    public final void b() {
        HashMap hashMap;
        synchronized (this) {
            hashMap = new HashMap(this.f12484m);
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            d dVar = (d) ((Map.Entry) it.next()).getValue();
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    private void b(bv bvVar) {
        n nVar = this.f12474b.get(bvVar.z());
        if (nVar != null) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass8(nVar, bvVar));
        }
        com.anythink.core.common.v.d.a().a(nVar, bvVar, 2);
    }

    private void a(d dVar, int i) {
        dVar.a(new AnonymousClass4(i));
    }

    private boolean a(Integer num) {
        d dVar = this.f12484m.get(num);
        if (dVar != null && dVar.c()) {
            this.f12484m.remove(num);
        }
        boolean z6 = false;
        if (this.f12484m.size() == 0) {
            a();
            com.anythink.core.common.t.d.a().b(this.f12475c);
            this.f12487p = false;
            z6 = true;
            if (this.f12488q != null) {
                com.anythink.core.common.t.d.a().b(this.f12488q);
            }
        }
        return z6;
    }

    private void a(String str, bv bvVar, boolean z6) {
        bv bvVar2;
        Throwable th;
        String str2;
        if (bvVar.r() == 2) {
            bw a9 = com.anythink.core.common.a.a().a(str, bvVar);
            ad R8 = bvVar.R();
            int i = 0;
            com.anythink.core.common.h.c cVar = null;
            if (a9 != null) {
                com.anythink.core.common.h.j a10 = a9.a((ad) null);
                cVar = a10.b();
                i = a10.d();
            }
            if (cVar != null) {
                bvVar.ay();
            }
            bvVar.toString();
            if (cVar == null || i < bvVar.ay()) {
                return;
            }
            try {
                double a11 = p.a(cVar.e().getUnitGroupInfo());
                if (l.a(bvVar, cVar.e().getUnitGroupInfo()) < 0) {
                    bvVar.a(bvVar, 2, bvVar.t(), 1);
                    return;
                }
                try {
                    bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                    if (unitGroupInfo.R() != null) {
                        try {
                            str2 = unitGroupInfo.R().token;
                        } catch (Throwable th2) {
                            th = th2;
                            bvVar2 = bvVar;
                            th.printStackTrace();
                            bvVar2.a(cVar.e().getUnitGroupInfo(), 1, bvVar2.t(), z6 ? 1 : 0);
                        }
                    } else {
                        str2 = "";
                    }
                    if (R8 == null || TextUtils.equals(R8.token, str2)) {
                        bvVar2 = bvVar;
                    } else {
                        bvVar2 = bvVar;
                        try {
                            com.anythink.core.b.d.c.a(R8, new aw(2, bvVar2, this.f12483l.f14129s, a11), true, 26);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            th.printStackTrace();
                            bvVar2.a(cVar.e().getUnitGroupInfo(), 1, bvVar2.t(), z6 ? 1 : 0);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bvVar2 = bvVar;
                }
                bvVar2.a(cVar.e().getUnitGroupInfo(), 1, bvVar2.t(), z6 ? 1 : 0);
            } catch (Exception unused) {
            }
        }
    }

    private void a(bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        n nVar;
        try {
            nVar = this.f12483l.f14129s.af();
            try {
                aj.a(nVar, bvVar, 0, false);
                nVar.m(ak.a(bvVar, (ATBaseAdAdapter) null));
                this.f12474b.put(bvVar.z(), nVar);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            nVar = null;
        }
        if (bvVar.q() != 7 && aTBaseAdAdapter != null) {
            try {
                if (this.f12483l.f14114c.f14334d != null) {
                    aj.a(nVar);
                    this.f12483l.f14114c.f14334d.onAdSourceBiddingAttempt(nVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        a(nVar, (AdError) null, a.b.f17770a, bvVar);
        com.anythink.core.common.v.d.a().a(nVar, bvVar, 1);
    }

    private void a(bv bvVar) {
        n nVar = this.f12474b.get(bvVar.z());
        if (nVar != null) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(bvVar, nVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, AdError adError, int i, bv bvVar) {
        String str;
        String str2;
        if (nVar == null) {
            return;
        }
        com.anythink.core.common.w.a.b.d dVar = (com.anythink.core.common.w.a.b.d) com.anythink.core.common.w.a.a.d.a(nVar.aI(), com.anythink.core.common.w.a.b.d.class);
        if (dVar != null) {
            if (adError != null) {
                str = adError.getPlatformCode();
                str2 = adError.getPlatformMSG();
            } else {
                str = "";
                str2 = "";
            }
            al a9 = al.a(nVar, str, str2, i);
            a9.a(adError != null);
            dVar.a(a9);
        }
        bvVar.z();
        com.anythink.core.common.h.a aVar = this.f12483l;
        Context g9 = aVar != null ? aVar.f14113b : t.b().g();
        com.anythink.core.a.c.a();
        if (i == a.b.f17770a) {
            com.anythink.core.a.c.a(g9, bvVar, nVar.aI());
        } else if (i == a.b.f17772c) {
            com.anythink.core.a.c.b(g9, bvVar, nVar.aI());
        }
    }

    private synchronized void a(Integer num, List<bv> list, List<bv> list2) {
        boolean z6;
        try {
            d dVar = this.f12484m.get(num);
            if (dVar != null && dVar.c()) {
                this.f12484m.remove(num);
            }
            if (this.f12484m.size() == 0) {
                a();
                com.anythink.core.common.t.d.a().b(this.f12475c);
                this.f12487p = false;
                if (this.f12488q != null) {
                    com.anythink.core.common.t.d.a().b(this.f12488q);
                }
                z6 = true;
            } else {
                z6 = false;
            }
            int size = list != null ? list.size() : 0;
            int size2 = list2 != null ? list2.size() : 0;
            if (size > 0 || size2 > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        bv bvVar = list.get(i);
                        a(this.f12479g, bvVar, true);
                        arrayList.add(bvVar);
                        arrayList3.add(bvVar);
                        n nVar = this.f12474b.get(bvVar.z());
                        if (nVar != null) {
                            com.anythink.core.common.v.b.b.a().a(new AnonymousClass8(nVar, bvVar));
                        }
                        com.anythink.core.common.v.d.a().a(nVar, bvVar, 2);
                    }
                    list.clear();
                }
                if (size2 > 0) {
                    for (int i4 = 0; i4 < size2; i4++) {
                        bv bvVar2 = list2.get(i4);
                        if (bvVar2 == null) {
                            try {
                                com.anythink.core.common.u.e.b("Bid Fail AdSource Object is null, currentSize:" + list2.size() + "\n" + q.a(new Throwable().getStackTrace()), "Bidding inner error", t.b().r());
                            } catch (Throwable unused) {
                            }
                        }
                        a(this.f12479g, bvVar2, false);
                        if (p.a(bvVar2) > 0.0d && !TextUtils.isEmpty(bvVar2.E())) {
                            arrayList.add(bvVar2);
                        } else {
                            arrayList2.add(bvVar2);
                        }
                        arrayList3.add(bvVar2);
                        n nVar2 = this.f12474b.get(bvVar2.z());
                        if (nVar2 != null) {
                            com.anythink.core.common.v.b.b.a().a(new AnonymousClass7(bvVar2, nVar2));
                        }
                    }
                    list2.clear();
                }
                n af = this.f12483l.f14129s.af();
                long j6 = this.f12485n;
                com.anythink.core.common.h.a aVar = this.f12483l;
                com.anythink.core.b.d.c.a(af, arrayList3, j6, aVar.f14130t, aVar.f14117f);
                if (this.f12487p) {
                    if (arrayList.size() > 0) {
                        List<bv> list3 = this.f12486o;
                        if (list3 != null) {
                            list3.addAll(arrayList);
                        }
                        arrayList.toString();
                        arrayList.clear();
                    }
                    if (arrayList.size() == 0 && arrayList2.size() == 0) {
                        return;
                    }
                }
                if (z6) {
                    List<bv> list4 = this.f12486o;
                    if (list4 != null && list4.size() > 0) {
                        arrayList.addAll(0, this.f12486o);
                        this.f12486o.clear();
                    }
                    com.anythink.core.common.h hVar = this.f12476d;
                    if (hVar != null) {
                        hVar.a();
                    }
                }
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, new Comparator<bv>() { // from class: com.anythink.core.b.b.6
                        private static int a(bv bvVar3, bv bvVar4) {
                            return l.a(bvVar3, bvVar4);
                        }

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(bv bvVar3, bv bvVar4) {
                            return l.a(bvVar3, bvVar4);
                        }
                    });
                }
                j.a aVar2 = this.f12480h;
                if (aVar2 != null) {
                    aVar2.a(this.i, arrayList, arrayList2, z6);
                }
                if (z6) {
                    this.f12480h = null;
                }
            }
        } finally {
        }
    }

    public static /* synthetic */ void a(b bVar, d dVar, int i) {
        dVar.a(bVar.new AnonymousClass4(i));
    }

    public static /* synthetic */ void a(b bVar, bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        n nVar;
        try {
            nVar = bVar.f12483l.f14129s.af();
            try {
                aj.a(nVar, bvVar, 0, false);
                nVar.m(ak.a(bvVar, (ATBaseAdAdapter) null));
                bVar.f12474b.put(bvVar.z(), nVar);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            nVar = null;
        }
        if (bvVar.q() != 7 && aTBaseAdAdapter != null) {
            try {
                if (bVar.f12483l.f14114c.f14334d != null) {
                    aj.a(nVar);
                    bVar.f12483l.f14114c.f14334d.onAdSourceBiddingAttempt(nVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        bVar.a(nVar, (AdError) null, a.b.f17770a, bvVar);
        com.anythink.core.common.v.d.a().a(nVar, bvVar, 1);
    }
}
