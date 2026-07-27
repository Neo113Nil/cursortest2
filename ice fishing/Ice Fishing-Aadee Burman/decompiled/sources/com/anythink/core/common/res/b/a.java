package com.anythink.core.common.res.b;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.res.d;
import com.anythink.core.common.v.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    final String f16180a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.core.common.res.b.b f16181b;

    /* renamed from: c, reason: collision with root package name */
    public List<b> f16182c;

    /* renamed from: k, reason: collision with root package name */
    public c f16183k;

    /* renamed from: l, reason: collision with root package name */
    int f16184l;

    /* renamed from: m, reason: collision with root package name */
    private final int f16185m;

    /* renamed from: n, reason: collision with root package name */
    private final int f16186n;

    /* renamed from: o, reason: collision with root package name */
    private int f16187o;

    /* renamed from: p, reason: collision with root package name */
    private int f16188p;

    /* renamed from: q, reason: collision with root package name */
    private long f16189q;

    /* renamed from: r, reason: collision with root package name */
    private String f16190r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16191s;

    /* renamed from: t, reason: collision with root package name */
    private final long f16192t;

    /* renamed from: u, reason: collision with root package name */
    private long f16193u;

    /* renamed from: v, reason: collision with root package name */
    private MediaMetadataRetriever f16194v;

    /* renamed from: w, reason: collision with root package name */
    private Object f16195w;

    /* renamed from: com.anythink.core.common.res.b.a$a, reason: collision with other inner class name */
    public class C0095a {

        /* renamed from: a, reason: collision with root package name */
        long f16196a;

        /* renamed from: b, reason: collision with root package name */
        long f16197b;

        /* renamed from: c, reason: collision with root package name */
        long f16198c;

        /* renamed from: d, reason: collision with root package name */
        int f16199d;

        public C0095a(long j6, long j9, long j10, int i) {
            this.f16196a = j6;
            this.f16197b = j9;
            this.f16198c = j10;
            this.f16199d = i;
        }

        public final long a() {
            return this.f16196a;
        }

        public final long b() {
            return this.f16197b;
        }

        public final long c() {
            return this.f16198c;
        }

        public final int d() {
            return this.f16199d;
        }
    }

    public static abstract class b {
        public abstract void a(C0095a c0095a);

        public abstract void a(String str, String str2);

        public abstract boolean a(int i, long j6, long j9);
    }

    public static abstract class c {
        public abstract void a();

        public abstract void a(String str, String str2);
    }

    public a(String str) {
        super(str);
        this.f16180a = "a";
        this.f16185m = 0;
        this.f16186n = 1;
        this.f16192t = 512000L;
        this.f16195w = new Object();
        this.f16184l = -1;
        this.f16182c = new ArrayList();
        this.f16181b = new com.anythink.core.common.res.b.b();
        this.f16188p = 0;
        this.f16189q = 0L;
        this.f16191s = false;
        this.f16193u = 0L;
        this.f16187o = 0;
    }

    private int h() {
        return this.f16187o;
    }

    private void i() {
        String a9 = d.a(t.b().g()).a(4);
        if (TextUtils.isEmpty(a9)) {
            b("", "without saveDirectory");
            return;
        }
        File file = new File(a9);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f16190r = d.a(t.b().g()).c(4, o.a(this.f16239d));
        File file2 = new File(this.f16190r);
        if (file2.exists()) {
            this.f16189q = file2.length();
        }
    }

    private boolean j() {
        int i = this.f16188p;
        if (i != 100) {
            return this.f16187o == 0 && i < 100;
        }
        a(i, this.f16189q);
        b(this.f16188p, this.f16189q);
        return false;
    }

    private synchronized void k() {
        this.f16182c.clear();
    }

    private void l() {
        long j6;
        MediaMetadataRetriever mediaMetadataRetriever;
        if (this.f16193u > 0 && this.f16194v == null) {
            long currentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            this.f16194v = mediaMetadataRetriever2;
            int i = this.f16181b.f16201a;
            try {
                try {
                    mediaMetadataRetriever2.setDataSource(this.f16190r);
                    j6 = Long.parseLong(this.f16194v.extractMetadata(9));
                    if (j6 > 0) {
                        try {
                            int i6 = (int) (((this.f16193u + 500) * 100) / j6);
                            i = i6 > 100 ? 100 : i6;
                            com.anythink.core.common.res.b.b bVar = this.f16181b;
                            if (bVar.f16201a < i) {
                                bVar.f16201a = i;
                            }
                        } catch (Throwable unused) {
                            mediaMetadataRetriever = this.f16194v;
                            mediaMetadataRetriever.release();
                            a(new C0095a(this.f16193u, j6, System.currentTimeMillis() - currentTimeMillis, i));
                            int i9 = this.f16181b.f16201a;
                        }
                    }
                    mediaMetadataRetriever = this.f16194v;
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                j6 = -1;
            }
            mediaMetadataRetriever.release();
            a(new C0095a(this.f16193u, j6, System.currentTimeMillis() - currentTimeMillis, i));
            int i92 = this.f16181b.f16201a;
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        this.f16187o = 0;
    }

    public final void e() {
        j();
        if (j()) {
            i();
            this.f16187o = 1;
            d();
        }
    }

    public final void f() {
        j();
        this.f16191s = true;
        if (j()) {
            i();
            this.f16187o = 1;
            d();
        }
    }

    public final void g() {
        this.f16191s = false;
        this.f16187o = 0;
    }

    private boolean b(int i) {
        synchronized (this.f16195w) {
            try {
                if (this.f16191s) {
                    return true;
                }
                if (this.f16244j < 512000) {
                    return true;
                }
                com.anythink.core.common.res.b.b bVar = this.f16181b;
                int i6 = bVar.f16203c;
                if (i6 == 2 && i >= bVar.f16201a) {
                    return false;
                }
                if (i6 == 1) {
                    return true;
                }
                List<b> list = this.f16182c;
                return list == null || list.size() != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(com.anythink.core.common.res.b.b bVar) {
        synchronized (this.f16195w) {
            try {
                int i = bVar.f16201a;
                int i6 = bVar.f16203c;
                long j6 = bVar.f16204d;
                com.anythink.core.common.res.b.b bVar2 = this.f16181b;
                if (bVar2.f16201a < i) {
                    bVar2.f16201a = i;
                }
                if (j6 > this.f16193u) {
                    this.f16193u = j6;
                }
                if (Build.VERSION.SDK_INT <= 24) {
                    bVar2.f16203c = 1;
                } else if (bVar2.f16203c != 1) {
                    bVar2.f16203c = i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a(b bVar) {
        if (!this.f16182c.contains(bVar)) {
            this.f16182c.add(bVar);
        }
    }

    private void b(int i, long j6) {
        if (i == 100) {
            com.anythink.core.common.a.o.a().a(this.f16239d, this.f16190r, this.f16244j, j6, i, true);
            c cVar = this.f16183k;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    private void a(c cVar) {
        this.f16183k = cVar;
    }

    private void a(int i) {
        this.f16187o = i;
    }

    private synchronized void b(String str, String str2) {
        try {
            this.f16187o = 0;
            Iterator<b> it = this.f16182c.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2);
            }
            k();
            c cVar = this.f16183k;
            if (cVar != null) {
                cVar.a(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(int i, long j6) {
        try {
            if (this.f16184l != i) {
                this.f16184l = i;
            }
            com.anythink.core.common.a.o.a().a(this.f16239d, this.f16190r, this.f16244j, j6, i, false);
            Iterator<b> it = this.f16182c.iterator();
            boolean z3 = false;
            if (this.f16244j > 512000 || i == 100) {
                boolean z6 = false;
                while (it.hasNext()) {
                    if (it.next().a(i, j6, this.f16244j)) {
                        z6 = i != 100;
                        it.remove();
                    }
                }
                z3 = z6;
            }
            if (z3) {
                com.anythink.core.common.a.o.a().a(this.f16239d, this.f16190r, this.f16244j, j6, i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:87:0x0120
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:131)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    @Override // com.anythink.core.common.res.image.b
    public final boolean a(java.io.InputStream r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.b.a.a(java.io.InputStream):boolean");
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.v.b.d dVar) {
        com.anythink.core.common.v.b.b.a().a(dVar, 4);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        b(str, str2);
    }

    private synchronized void a(C0095a c0095a) {
        long j6 = c0095a.f16197b;
        Iterator<b> it = this.f16182c.iterator();
        while (it.hasNext()) {
            it.next().a(c0095a);
        }
    }
}
