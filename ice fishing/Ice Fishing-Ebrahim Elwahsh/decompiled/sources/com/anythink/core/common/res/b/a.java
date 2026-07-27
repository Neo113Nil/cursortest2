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
    final String f16338a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.core.common.res.b.b f16339b;

    /* renamed from: c, reason: collision with root package name */
    public List<b> f16340c;

    /* renamed from: k, reason: collision with root package name */
    public c f16341k;

    /* renamed from: l, reason: collision with root package name */
    int f16342l;

    /* renamed from: m, reason: collision with root package name */
    private final int f16343m;

    /* renamed from: n, reason: collision with root package name */
    private final int f16344n;

    /* renamed from: o, reason: collision with root package name */
    private int f16345o;

    /* renamed from: p, reason: collision with root package name */
    private int f16346p;

    /* renamed from: q, reason: collision with root package name */
    private long f16347q;

    /* renamed from: r, reason: collision with root package name */
    private String f16348r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16349s;

    /* renamed from: t, reason: collision with root package name */
    private final long f16350t;

    /* renamed from: u, reason: collision with root package name */
    private long f16351u;

    /* renamed from: v, reason: collision with root package name */
    private MediaMetadataRetriever f16352v;

    /* renamed from: w, reason: collision with root package name */
    private Object f16353w;

    /* renamed from: com.anythink.core.common.res.b.a$a, reason: collision with other inner class name */
    public class C0094a {

        /* renamed from: a, reason: collision with root package name */
        long f16354a;

        /* renamed from: b, reason: collision with root package name */
        long f16355b;

        /* renamed from: c, reason: collision with root package name */
        long f16356c;

        /* renamed from: d, reason: collision with root package name */
        int f16357d;

        public C0094a(long j9, long j10, long j11, int i) {
            this.f16354a = j9;
            this.f16355b = j10;
            this.f16356c = j11;
            this.f16357d = i;
        }

        public final long a() {
            return this.f16354a;
        }

        public final long b() {
            return this.f16355b;
        }

        public final long c() {
            return this.f16356c;
        }

        public final int d() {
            return this.f16357d;
        }
    }

    public static abstract class b {
        public abstract void a(C0094a c0094a);

        public abstract void a(String str, String str2);

        public abstract boolean a(int i, long j9, long j10);
    }

    public static abstract class c {
        public abstract void a();

        public abstract void a(String str, String str2);
    }

    public a(String str) {
        super(str);
        this.f16338a = "a";
        this.f16343m = 0;
        this.f16344n = 1;
        this.f16350t = 512000L;
        this.f16353w = new Object();
        this.f16342l = -1;
        this.f16340c = new ArrayList();
        this.f16339b = new com.anythink.core.common.res.b.b();
        this.f16346p = 0;
        this.f16347q = 0L;
        this.f16349s = false;
        this.f16351u = 0L;
        this.f16345o = 0;
    }

    private int h() {
        return this.f16345o;
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
        this.f16348r = d.a(t.b().g()).c(4, o.a(this.f16397d));
        File file2 = new File(this.f16348r);
        if (file2.exists()) {
            this.f16347q = file2.length();
        }
    }

    private boolean j() {
        int i = this.f16346p;
        if (i != 100) {
            return this.f16345o == 0 && i < 100;
        }
        a(i, this.f16347q);
        b(this.f16346p, this.f16347q);
        return false;
    }

    private synchronized void k() {
        this.f16340c.clear();
    }

    private void l() {
        long j9;
        MediaMetadataRetriever mediaMetadataRetriever;
        if (this.f16351u > 0 && this.f16352v == null) {
            long currentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            this.f16352v = mediaMetadataRetriever2;
            int i = this.f16339b.f16359a;
            try {
                try {
                    mediaMetadataRetriever2.setDataSource(this.f16348r);
                    j9 = Long.parseLong(this.f16352v.extractMetadata(9));
                    if (j9 > 0) {
                        try {
                            int i4 = (int) (((this.f16351u + 500) * 100) / j9);
                            i = i4 > 100 ? 100 : i4;
                            com.anythink.core.common.res.b.b bVar = this.f16339b;
                            if (bVar.f16359a < i) {
                                bVar.f16359a = i;
                            }
                        } catch (Throwable unused) {
                            mediaMetadataRetriever = this.f16352v;
                            mediaMetadataRetriever.release();
                            a(new C0094a(this.f16351u, j9, System.currentTimeMillis() - currentTimeMillis, i));
                            int i9 = this.f16339b.f16359a;
                        }
                    }
                    mediaMetadataRetriever = this.f16352v;
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                j9 = -1;
            }
            mediaMetadataRetriever.release();
            a(new C0094a(this.f16351u, j9, System.currentTimeMillis() - currentTimeMillis, i));
            int i92 = this.f16339b.f16359a;
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
        this.f16345o = 0;
    }

    public final void e() {
        j();
        if (j()) {
            i();
            this.f16345o = 1;
            d();
        }
    }

    public final void f() {
        j();
        this.f16349s = true;
        if (j()) {
            i();
            this.f16345o = 1;
            d();
        }
    }

    public final void g() {
        this.f16349s = false;
        this.f16345o = 0;
    }

    private boolean b(int i) {
        synchronized (this.f16353w) {
            try {
                if (this.f16349s) {
                    return true;
                }
                if (this.f16402j < 512000) {
                    return true;
                }
                com.anythink.core.common.res.b.b bVar = this.f16339b;
                int i4 = bVar.f16361c;
                if (i4 == 2 && i >= bVar.f16359a) {
                    return false;
                }
                if (i4 == 1) {
                    return true;
                }
                List<b> list = this.f16340c;
                return list == null || list.size() != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(com.anythink.core.common.res.b.b bVar) {
        synchronized (this.f16353w) {
            try {
                int i = bVar.f16359a;
                int i4 = bVar.f16361c;
                long j9 = bVar.f16362d;
                com.anythink.core.common.res.b.b bVar2 = this.f16339b;
                if (bVar2.f16359a < i) {
                    bVar2.f16359a = i;
                }
                if (j9 > this.f16351u) {
                    this.f16351u = j9;
                }
                if (Build.VERSION.SDK_INT <= 24) {
                    bVar2.f16361c = 1;
                } else if (bVar2.f16361c != 1) {
                    bVar2.f16361c = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a(b bVar) {
        if (!this.f16340c.contains(bVar)) {
            this.f16340c.add(bVar);
        }
    }

    private void b(int i, long j9) {
        if (i == 100) {
            com.anythink.core.common.a.o.a().a(this.f16397d, this.f16348r, this.f16402j, j9, i, true);
            c cVar = this.f16341k;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    private void a(c cVar) {
        this.f16341k = cVar;
    }

    private void a(int i) {
        this.f16345o = i;
    }

    private synchronized void b(String str, String str2) {
        try {
            this.f16345o = 0;
            Iterator<b> it = this.f16340c.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2);
            }
            k();
            c cVar = this.f16341k;
            if (cVar != null) {
                cVar.a(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(int i, long j9) {
        try {
            if (this.f16342l != i) {
                this.f16342l = i;
            }
            com.anythink.core.common.a.o.a().a(this.f16397d, this.f16348r, this.f16402j, j9, i, false);
            Iterator<b> it = this.f16340c.iterator();
            boolean z8 = false;
            if (this.f16402j > 512000 || i == 100) {
                boolean z9 = false;
                while (it.hasNext()) {
                    if (it.next().a(i, j9, this.f16402j)) {
                        z9 = i != 100;
                        it.remove();
                    }
                }
                z8 = z9;
            }
            if (z8) {
                com.anythink.core.common.a.o.a().a(this.f16397d, this.f16348r, this.f16402j, j9, i);
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

    private synchronized void a(C0094a c0094a) {
        long j9 = c0094a.f16355b;
        Iterator<b> it = this.f16340c.iterator();
        while (it.hasNext()) {
            it.next().a(c0094a);
        }
    }
}
