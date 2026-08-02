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
    final String f16967a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.core.common.res.b.b f16968b;

    /* renamed from: c, reason: collision with root package name */
    public List<b> f16969c;

    /* renamed from: k, reason: collision with root package name */
    public c f16970k;

    /* renamed from: l, reason: collision with root package name */
    int f16971l;

    /* renamed from: m, reason: collision with root package name */
    private final int f16972m;

    /* renamed from: n, reason: collision with root package name */
    private final int f16973n;

    /* renamed from: o, reason: collision with root package name */
    private int f16974o;

    /* renamed from: p, reason: collision with root package name */
    private int f16975p;

    /* renamed from: q, reason: collision with root package name */
    private long f16976q;

    /* renamed from: r, reason: collision with root package name */
    private String f16977r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16978s;

    /* renamed from: t, reason: collision with root package name */
    private final long f16979t;

    /* renamed from: u, reason: collision with root package name */
    private long f16980u;

    /* renamed from: v, reason: collision with root package name */
    private MediaMetadataRetriever f16981v;

    /* renamed from: w, reason: collision with root package name */
    private Object f16982w;

    /* renamed from: com.anythink.core.common.res.b.a$a, reason: collision with other inner class name */
    public class C0095a {

        /* renamed from: a, reason: collision with root package name */
        long f16983a;

        /* renamed from: b, reason: collision with root package name */
        long f16984b;

        /* renamed from: c, reason: collision with root package name */
        long f16985c;

        /* renamed from: d, reason: collision with root package name */
        int f16986d;

        public C0095a(long j6, long j9, long j10, int i) {
            this.f16983a = j6;
            this.f16984b = j9;
            this.f16985c = j10;
            this.f16986d = i;
        }

        public final long a() {
            return this.f16983a;
        }

        public final long b() {
            return this.f16984b;
        }

        public final long c() {
            return this.f16985c;
        }

        public final int d() {
            return this.f16986d;
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
        this.f16967a = "a";
        this.f16972m = 0;
        this.f16973n = 1;
        this.f16979t = 512000L;
        this.f16982w = new Object();
        this.f16971l = -1;
        this.f16969c = new ArrayList();
        this.f16968b = new com.anythink.core.common.res.b.b();
        this.f16975p = 0;
        this.f16976q = 0L;
        this.f16978s = false;
        this.f16980u = 0L;
        this.f16974o = 0;
    }

    private int h() {
        return this.f16974o;
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
        this.f16977r = d.a(t.b().g()).c(4, o.a(this.f17026d));
        File file2 = new File(this.f16977r);
        if (file2.exists()) {
            this.f16976q = file2.length();
        }
    }

    private boolean j() {
        int i = this.f16975p;
        if (i != 100) {
            return this.f16974o == 0 && i < 100;
        }
        a(i, this.f16976q);
        b(this.f16975p, this.f16976q);
        return false;
    }

    private synchronized void k() {
        this.f16969c.clear();
    }

    private void l() {
        long j6;
        MediaMetadataRetriever mediaMetadataRetriever;
        if (this.f16980u > 0 && this.f16981v == null) {
            long currentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            this.f16981v = mediaMetadataRetriever2;
            int i = this.f16968b.f16988a;
            try {
                try {
                    mediaMetadataRetriever2.setDataSource(this.f16977r);
                    j6 = Long.parseLong(this.f16981v.extractMetadata(9));
                    if (j6 > 0) {
                        try {
                            int i4 = (int) (((this.f16980u + 500) * 100) / j6);
                            i = i4 > 100 ? 100 : i4;
                            com.anythink.core.common.res.b.b bVar = this.f16968b;
                            if (bVar.f16988a < i) {
                                bVar.f16988a = i;
                            }
                        } catch (Throwable unused) {
                            mediaMetadataRetriever = this.f16981v;
                            mediaMetadataRetriever.release();
                            a(new C0095a(this.f16980u, j6, System.currentTimeMillis() - currentTimeMillis, i));
                            int i6 = this.f16968b.f16988a;
                        }
                    }
                    mediaMetadataRetriever = this.f16981v;
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                j6 = -1;
            }
            mediaMetadataRetriever.release();
            a(new C0095a(this.f16980u, j6, System.currentTimeMillis() - currentTimeMillis, i));
            int i62 = this.f16968b.f16988a;
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
        this.f16974o = 0;
    }

    public final void e() {
        j();
        if (j()) {
            i();
            this.f16974o = 1;
            d();
        }
    }

    public final void f() {
        j();
        this.f16978s = true;
        if (j()) {
            i();
            this.f16974o = 1;
            d();
        }
    }

    public final void g() {
        this.f16978s = false;
        this.f16974o = 0;
    }

    private boolean b(int i) {
        synchronized (this.f16982w) {
            try {
                if (this.f16978s) {
                    return true;
                }
                if (this.f17031j < 512000) {
                    return true;
                }
                com.anythink.core.common.res.b.b bVar = this.f16968b;
                int i4 = bVar.f16990c;
                if (i4 == 2 && i >= bVar.f16988a) {
                    return false;
                }
                if (i4 == 1) {
                    return true;
                }
                List<b> list = this.f16969c;
                return list == null || list.size() != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(com.anythink.core.common.res.b.b bVar) {
        synchronized (this.f16982w) {
            try {
                int i = bVar.f16988a;
                int i4 = bVar.f16990c;
                long j6 = bVar.f16991d;
                com.anythink.core.common.res.b.b bVar2 = this.f16968b;
                if (bVar2.f16988a < i) {
                    bVar2.f16988a = i;
                }
                if (j6 > this.f16980u) {
                    this.f16980u = j6;
                }
                if (Build.VERSION.SDK_INT <= 24) {
                    bVar2.f16990c = 1;
                } else if (bVar2.f16990c != 1) {
                    bVar2.f16990c = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a(b bVar) {
        if (!this.f16969c.contains(bVar)) {
            this.f16969c.add(bVar);
        }
    }

    private void b(int i, long j6) {
        if (i == 100) {
            com.anythink.core.common.a.o.a().a(this.f17026d, this.f16977r, this.f17031j, j6, i, true);
            c cVar = this.f16970k;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    private void a(c cVar) {
        this.f16970k = cVar;
    }

    private void a(int i) {
        this.f16974o = i;
    }

    private synchronized void b(String str, String str2) {
        try {
            this.f16974o = 0;
            Iterator<b> it = this.f16969c.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2);
            }
            k();
            c cVar = this.f16970k;
            if (cVar != null) {
                cVar.a(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(int i, long j6) {
        try {
            if (this.f16971l != i) {
                this.f16971l = i;
            }
            com.anythink.core.common.a.o.a().a(this.f17026d, this.f16977r, this.f17031j, j6, i, false);
            Iterator<b> it = this.f16969c.iterator();
            boolean z6 = false;
            if (this.f17031j > 512000 || i == 100) {
                boolean z9 = false;
                while (it.hasNext()) {
                    if (it.next().a(i, j6, this.f17031j)) {
                        z9 = i != 100;
                        it.remove();
                    }
                }
                z6 = z9;
            }
            if (z6) {
                com.anythink.core.common.a.o.a().a(this.f17026d, this.f16977r, this.f17031j, j6, i);
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
        long j6 = c0095a.f16984b;
        Iterator<b> it = this.f16969c.iterator();
        while (it.hasNext()) {
            it.next().a(c0095a);
        }
    }
}
