package com.anythink.basead.exoplayer.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.exoplayer.d.b;
import com.anythink.basead.exoplayer.d.c;
import com.anythink.basead.exoplayer.d.e;
import com.anythink.basead.exoplayer.d.f;
import com.anythink.basead.exoplayer.d.i;
import com.anythink.basead.exoplayer.d.j;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d<T extends i> implements b.c<T>, g<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6823a = "PRCustomData";

    /* renamed from: b, reason: collision with root package name */
    public static final int f6824b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6825c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6826d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6827e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6828f = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final String f6829h = "DefaultDrmSessionMgr";

    /* renamed from: g, reason: collision with root package name */
    volatile d<T>.c f6830g;
    private final UUID i;

    /* renamed from: j, reason: collision with root package name */
    private final j<T> f6831j;

    /* renamed from: k, reason: collision with root package name */
    private final n f6832k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, String> f6833l;

    /* renamed from: m, reason: collision with root package name */
    private final c.a f6834m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6835n;

    /* renamed from: o, reason: collision with root package name */
    private final int f6836o;

    /* renamed from: p, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.d.b<T>> f6837p;

    /* renamed from: q, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.d.b<T>> f6838q;

    /* renamed from: r, reason: collision with root package name */
    private Looper f6839r;

    /* renamed from: s, reason: collision with root package name */
    private int f6840s;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f6841t;

    @Deprecated
    public interface a extends com.anythink.basead.exoplayer.d.c {
    }

    public class b implements j.f<T> {
        private b() {
        }

        @Override // com.anythink.basead.exoplayer.d.j.f
        public final void a(byte[] bArr, int i) {
            if (d.this.f6840s == 0) {
                d.this.f6830g.obtainMessage(i, bArr).sendToTarget();
            }
        }

        public /* synthetic */ b(d dVar, byte b9) {
            this();
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (com.anythink.basead.exoplayer.d.b bVar : d.this.f6837p) {
                if (bVar.b(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.d.d$d, reason: collision with other inner class name */
    public static final class C0020d extends Exception {
        public /* synthetic */ C0020d(UUID uuid, byte b9) {
            this(uuid);
        }

        private C0020d(UUID uuid) {
            super("Media does not support uuid: ".concat(String.valueOf(uuid)));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        this(uuid, jVar, nVar, hashMap);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private static d<k> a(n nVar, HashMap<String, String> hashMap) {
        return a(com.anythink.basead.exoplayer.b.bk, nVar, hashMap);
    }

    private byte[] b(String str) {
        return this.f6831j.b(str);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap) {
        this(uuid, (j) jVar, nVar, hashMap, false, 3);
    }

    private static d<k> a(n nVar, String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(f6823a, str);
        }
        return a(com.anythink.basead.exoplayer.b.bl, nVar, (HashMap<String, String>) hashMap);
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar, boolean z3) {
        this(uuid, jVar, nVar, hashMap, z3);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, boolean z3) {
        this(uuid, jVar, nVar, hashMap, z3, 3);
    }

    @Deprecated
    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar, boolean z3, int i) {
        this(uuid, jVar, nVar, hashMap, z3, i);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    @Deprecated
    private static d<k> a(UUID uuid, n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        d<k> a9 = a(uuid, nVar, hashMap);
        if (handler != null && cVar != null) {
            a9.a(handler, cVar);
        }
        return a9;
    }

    private d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> hashMap, boolean z3, int i) {
        com.anythink.basead.exoplayer.k.a.a(uuid);
        com.anythink.basead.exoplayer.k.a.a(jVar);
        com.anythink.basead.exoplayer.k.a.a(!com.anythink.basead.exoplayer.b.bi.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.i = uuid;
        this.f6831j = jVar;
        this.f6832k = nVar;
        this.f6833l = hashMap;
        this.f6834m = new c.a();
        this.f6835n = z3;
        this.f6836o = i;
        byte b9 = 0;
        this.f6840s = 0;
        this.f6837p = new ArrayList();
        this.f6838q = new ArrayList();
        if (z3) {
            jVar.a("sessionSharing", "enable");
        }
        jVar.a(new b(this, b9));
    }

    private static d<k> a(UUID uuid, n nVar, HashMap<String, String> hashMap) {
        return new d<>(uuid, (j) l.a(uuid), nVar, hashMap, false, 3);
    }

    public final void a(Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        this.f6834m.a(handler, cVar);
    }

    private void a(com.anythink.basead.exoplayer.d.c cVar) {
        this.f6834m.a(cVar);
    }

    private String a(String str) {
        return this.f6831j.a(str);
    }

    private void a(String str, String str2) {
        this.f6831j.a(str, str2);
    }

    private void a(String str, byte[] bArr) {
        this.f6831j.a(str, bArr);
    }

    private void a(int i, byte[] bArr) {
        com.anythink.basead.exoplayer.k.a.b(this.f6837p.isEmpty());
        if (i == 1 || i == 3) {
            com.anythink.basead.exoplayer.k.a.a(bArr);
        }
        this.f6840s = i;
        this.f6841t = bArr;
    }

    @Override // com.anythink.basead.exoplayer.d.g
    public final boolean a(com.anythink.basead.exoplayer.d.e eVar) {
        if (this.f6841t != null) {
            return true;
        }
        if (a(eVar, this.i, true) == null) {
            if (eVar.f6845b != 1 || !eVar.a(0).a(com.anythink.basead.exoplayer.b.bi)) {
                return false;
            }
            Log.w(f6829h, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.i);
        }
        String str = eVar.f6844a;
        if (str == null || com.anythink.basead.exoplayer.b.bd.equals(str)) {
            return true;
        }
        return !(com.anythink.basead.exoplayer.b.be.equals(str) || com.anythink.basead.exoplayer.b.bg.equals(str) || com.anythink.basead.exoplayer.b.bf.equals(str)) || af.f8346a >= 25;
    }

    @Override // com.anythink.basead.exoplayer.d.g
    public final f<T> a(Looper looper, com.anythink.basead.exoplayer.d.e eVar) {
        e.a aVar;
        Looper looper2 = this.f6839r;
        byte b9 = 0;
        com.anythink.basead.exoplayer.k.a.b(looper2 == null || looper2 == looper);
        if (this.f6837p.isEmpty()) {
            this.f6839r = looper;
            if (this.f6830g == null) {
                this.f6830g = new c(looper);
            }
        }
        com.anythink.basead.exoplayer.d.b<T> bVar = null;
        if (this.f6841t == null) {
            e.a a9 = a(eVar, this.i, false);
            if (a9 == null) {
                C0020d c0020d = new C0020d(this.i, b9);
                this.f6834m.a(c0020d);
                return new h(new f.a(c0020d));
            }
            aVar = a9;
        } else {
            aVar = null;
        }
        if (!this.f6835n) {
            if (!this.f6837p.isEmpty()) {
                bVar = this.f6837p.get(0);
            }
        } else {
            byte[] bArr = aVar != null ? aVar.f6850c : null;
            Iterator<com.anythink.basead.exoplayer.d.b<T>> it = this.f6837p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.anythink.basead.exoplayer.d.b<T> next = it.next();
                if (next.a(bArr)) {
                    bVar = next;
                    break;
                }
            }
        }
        if (bVar == null) {
            com.anythink.basead.exoplayer.d.b<T> bVar2 = new com.anythink.basead.exoplayer.d.b<>(this.i, this.f6831j, this, aVar, this.f6840s, this.f6841t, this.f6833l, this.f6832k, looper, this.f6834m, this.f6836o);
            this.f6837p.add(bVar2);
            bVar = bVar2;
        }
        bVar.a();
        return bVar;
    }

    @Override // com.anythink.basead.exoplayer.d.g
    public final void a(f<T> fVar) {
        if (fVar instanceof h) {
            return;
        }
        com.anythink.basead.exoplayer.d.b<T> bVar = (com.anythink.basead.exoplayer.d.b) fVar;
        if (bVar.b()) {
            this.f6837p.remove(bVar);
            if (this.f6838q.size() > 1 && this.f6838q.get(0) == bVar) {
                this.f6838q.get(1).c();
            }
            this.f6838q.remove(bVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.b.c
    public final void a(com.anythink.basead.exoplayer.d.b<T> bVar) {
        this.f6838q.add(bVar);
        if (this.f6838q.size() == 1) {
            bVar.c();
        }
    }

    @Override // com.anythink.basead.exoplayer.d.b.c
    public final void a() {
        Iterator<com.anythink.basead.exoplayer.d.b<T>> it = this.f6838q.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f6838q.clear();
    }

    @Override // com.anythink.basead.exoplayer.d.b.c
    public final void a(Exception exc) {
        Iterator<com.anythink.basead.exoplayer.d.b<T>> it = this.f6838q.iterator();
        while (it.hasNext()) {
            it.next().a(exc);
        }
        this.f6838q.clear();
    }

    private static e.a a(com.anythink.basead.exoplayer.d.e eVar, UUID uuid, boolean z3) {
        ArrayList arrayList = new ArrayList(eVar.f6845b);
        for (int i = 0; i < eVar.f6845b; i++) {
            e.a a9 = eVar.a(i);
            if ((a9.a(uuid) || (com.anythink.basead.exoplayer.b.bj.equals(uuid) && a9.a(com.anythink.basead.exoplayer.b.bi))) && (a9.f6850c != null || z3)) {
                arrayList.add(a9);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (com.anythink.basead.exoplayer.b.bk.equals(uuid)) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                e.a aVar = (e.a) arrayList.get(i6);
                int b9 = aVar.a() ? com.anythink.basead.exoplayer.e.a.h.b(aVar.f6850c) : -1;
                int i9 = af.f8346a;
                if ((i9 < 23 && b9 == 0) || (i9 >= 23 && b9 == 1)) {
                    return aVar;
                }
            }
        }
        return (e.a) arrayList.get(0);
    }

    @Deprecated
    private static d<k> a(n nVar, HashMap<String, String> hashMap, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        d<k> a9 = a(com.anythink.basead.exoplayer.b.bk, nVar, hashMap);
        if (handler != null && cVar != null) {
            a9.a(handler, cVar);
        }
        return a9;
    }

    @Deprecated
    private static d<k> a(n nVar, String str, Handler handler, com.anythink.basead.exoplayer.d.c cVar) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(f6823a, str);
        }
        d<k> a9 = a(com.anythink.basead.exoplayer.b.bl, nVar, (HashMap<String, String>) hashMap);
        if (handler != null && cVar != null) {
            a9.a(handler, cVar);
        }
        return a9;
    }
}
