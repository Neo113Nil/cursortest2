package com.anythink.basead.exoplayer.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.anythink.basead.exoplayer.b.g;
import com.anythink.basead.exoplayer.b.h;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.v;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o extends com.anythink.basead.exoplayer.f.b implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: A, reason: collision with root package name */
    private int f7383A;

    /* renamed from: B, reason: collision with root package name */
    private int f7384B;

    /* renamed from: C, reason: collision with root package name */
    private long f7385C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7386D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7387E;

    /* renamed from: r, reason: collision with root package name */
    private final Context f7388r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f7389s;

    /* renamed from: t, reason: collision with root package name */
    private final h f7390t;

    /* renamed from: u, reason: collision with root package name */
    private int f7391u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7392v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7393w;

    /* renamed from: x, reason: collision with root package name */
    private MediaFormat f7394x;

    /* renamed from: y, reason: collision with root package name */
    private int f7395y;

    /* renamed from: z, reason: collision with root package name */
    private int f7396z;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i) {
            o.this.f7389s.a(i);
        }

        public /* synthetic */ a(o oVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a() {
            o.b(o.this);
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i, long j6, long j9) {
            o.this.f7389s.a(i, j6, j9);
        }
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar) {
        this(context, cVar, null);
    }

    private static void C() {
    }

    private static void D() {
    }

    private static void E() {
    }

    private void F() {
        long a9 = this.f7390t.a(v());
        if (a9 != Long.MIN_VALUE) {
            if (!this.f7387E) {
                a9 = Math.max(this.f7385C, a9);
            }
            this.f7385C = a9;
            this.f7387E = false;
        }
    }

    public static /* synthetic */ boolean b(o oVar) {
        oVar.f7387E = true;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar, com.anythink.basead.exoplayer.m mVar2) {
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.k.n c() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        if (a_() == 2) {
            F();
        }
        return this.f7385C;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        return this.f7390t.f();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void n() {
        super.n();
        this.f7390t.a();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void o() {
        F();
        this.f7390t.h();
        super.o();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void p() {
        try {
            this.f7390t.j();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean u() {
        return this.f7390t.e() || super.u();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean v() {
        return super.v() && this.f7390t.d();
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void w() {
        try {
            this.f7390t.c();
        } catch (h.d e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar) {
        this(context, cVar, gVar, null, null);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void b(com.anythink.basead.exoplayer.m mVar) {
        super.b(mVar);
        this.f7389s.a(mVar);
        this.f7395y = com.anythink.basead.exoplayer.k.o.f9251w.equals(mVar.f9451h) ? mVar.f9465w : 2;
        this.f7396z = mVar.f9463u;
        this.f7383A = mVar.f9466x;
        this.f7384B = mVar.f9467y;
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, Handler handler, g gVar) {
        this(context, cVar, null, handler, gVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, com.anythink.basead.exoplayer.m mVar) {
        boolean z6;
        int i;
        int i4;
        String str = mVar.f9451h;
        if (!com.anythink.basead.exoplayer.k.o.a(str)) {
            return 0;
        }
        int i6 = af.f9132a >= 21 ? 32 : 0;
        boolean a9 = com.anythink.basead.exoplayer.a.a(gVar, mVar.f9453k);
        if (a9 && a(str) && cVar.a() != null) {
            return i6 | 12;
        }
        if ((com.anythink.basead.exoplayer.k.o.f9251w.equals(str) && !this.f7390t.a(mVar.f9465w)) || !this.f7390t.a(2)) {
            return 1;
        }
        com.anythink.basead.exoplayer.d.e eVar = mVar.f9453k;
        if (eVar != null) {
            z6 = false;
            for (int i9 = 0; i9 < eVar.f7631b; i9++) {
                z6 |= eVar.a(i9).f7637d;
            }
        } else {
            z6 = false;
        }
        com.anythink.basead.exoplayer.f.a a10 = cVar.a(str, z6);
        if (a10 == null) {
            return (!z6 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (a9) {
            return ((af.f9132a < 21 || (((i = mVar.f9464v) == -1 || a10.a(i)) && ((i4 = mVar.f9463u) == -1 || a10.b(i4)))) ? 4 : 3) | i6 | 8;
        }
        return 2;
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, Handler handler, g gVar2) {
        this(context, cVar, gVar, handler, gVar2, null, new f[0]);
    }

    public o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, Handler handler, g gVar2, c cVar2, f... fVarArr) {
        this(context, cVar, gVar, handler, gVar2, new l(cVar2, fVarArr));
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, Handler handler, g gVar2, h hVar) {
        super(1, cVar, gVar, false);
        this.f7388r = context.getApplicationContext();
        this.f7390t = hVar;
        this.f7389s = new g.a(handler, gVar2);
        hVar.a(new a(this, (byte) 0));
    }

    private int b(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar) {
        PackageManager packageManager;
        int i = af.f9132a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7984c) || (i == 23 && (packageManager = this.f7388r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.i;
        }
        return -1;
    }

    private static boolean b(String str) {
        if (af.f9132a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(af.f9134c)) {
            return false;
        }
        String str2 = af.f9133b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final com.anythink.basead.exoplayer.f.a a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.m mVar, boolean z6) {
        com.anythink.basead.exoplayer.f.a a9;
        return (!a(mVar.f9451h) || (a9 = cVar.a()) == null) ? super.a(cVar, mVar, z6) : a9;
    }

    private boolean a(String str) {
        int e9 = com.anythink.basead.exoplayer.k.o.e(str);
        return e9 != 0 && this.f7390t.a(e9);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    @Override // com.anythink.basead.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.basead.exoplayer.f.a aVar, MediaCodec mediaCodec, com.anythink.basead.exoplayer.m mVar, MediaCrypto mediaCrypto) {
        boolean z6;
        String str;
        PackageManager packageManager;
        q();
        int i = af.f9132a;
        this.f7391u = (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7984c) || (i == 23 && (packageManager = this.f7388r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) ? mVar.i : -1;
        String str2 = aVar.f7984c;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(af.f9134c)) {
            String str3 = af.f9133b;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z6 = true;
                this.f7393w = z6;
                this.f7392v = aVar.i;
                str = aVar.f7985d;
                if (str == null) {
                    str = com.anythink.basead.exoplayer.k.o.f9251w;
                }
                int i4 = this.f7391u;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("channel-count", mVar.f9463u);
                mediaFormat.setInteger("sample-rate", mVar.f9464v);
                com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f9452j);
                com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", i4);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                }
                mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
                if (!this.f7392v) {
                    this.f7394x = mediaFormat;
                    mediaFormat.setString("mime", mVar.f9451h);
                    return;
                } else {
                    this.f7394x = null;
                    return;
                }
            }
        }
        z6 = false;
        this.f7393w = z6;
        this.f7392v = aVar.i;
        str = aVar.f7985d;
        if (str == null) {
        }
        int i42 = this.f7391u;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str);
        mediaFormat2.setInteger("channel-count", mVar.f9463u);
        mediaFormat2.setInteger("sample-rate", mVar.f9464v);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat2, mVar.f9452j);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat2, "max-input-size", i42);
        if (i >= 23) {
        }
        mediaCodec.configure(mediaFormat2, (Surface) null, mediaCrypto, 0);
        if (!this.f7392v) {
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(String str, long j6, long j9) {
        this.f7389s.a(str, j6, j9);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i4;
        MediaFormat mediaFormat2 = this.f7394x;
        if (mediaFormat2 != null) {
            i = com.anythink.basead.exoplayer.k.o.e(mediaFormat2.getString("mime"));
            mediaFormat = this.f7394x;
        } else {
            i = this.f7395y;
        }
        int i6 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f7393w && integer == 6 && (i4 = this.f7396z) < 6) {
            iArr = new int[i4];
            for (int i9 = 0; i9 < this.f7396z; i9++) {
                iArr[i9] = i9;
            }
        } else {
            iArr = null;
        }
        try {
            this.f7390t.a(i6, integer, integer2, iArr, this.f7383A, this.f7384B);
        } catch (h.a e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(boolean z6) {
        super.a(z6);
        this.f7389s.a(((com.anythink.basead.exoplayer.f.b) this).f8026q);
        int i = r().f7096b;
        if (i != 0) {
            this.f7390t.c(i);
        } else {
            this.f7390t.g();
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z6) {
        super.a(j6, z6);
        this.f7390t.i();
        this.f7385C = j6;
        this.f7386D = true;
        this.f7387E = true;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        return this.f7390t.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.c.e eVar) {
        if (!this.f7386D || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f7529f - this.f7385C) > 500000) {
            this.f7385C = eVar.f7529f;
        }
        this.f7386D = false;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final boolean a(long j6, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i4, long j10, boolean z6) {
        if (this.f7392v && (i4 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z6) {
            mediaCodec.releaseOutputBuffer(i, false);
            ((com.anythink.basead.exoplayer.f.b) this).f8026q.f7521f++;
            this.f7390t.b();
            return true;
        }
        try {
            if (!this.f7390t.a(byteBuffer, j10)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            ((com.anythink.basead.exoplayer.f.b) this).f8026q.f7520e++;
            return true;
        } catch (h.b | h.d e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f7390t.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.f7390t.a((b) obj);
        }
    }

    private static MediaFormat a(com.anythink.basead.exoplayer.m mVar, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", mVar.f9463u);
        mediaFormat.setInteger("sample-rate", mVar.f9464v);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f9452j);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", i);
        if (af.f9132a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    private static boolean a(com.anythink.basead.exoplayer.m mVar, com.anythink.basead.exoplayer.m mVar2) {
        return mVar.f9451h.equals(mVar2.f9451h) && mVar.f9463u == mVar2.f9463u && mVar.f9464v == mVar2.f9464v && mVar.f9466x == 0 && mVar.f9467y == 0 && mVar2.f9466x == 0 && mVar2.f9467y == 0 && mVar.b(mVar2);
    }

    private int a(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar) {
        PackageManager packageManager;
        int i = af.f9132a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7984c) || (i == 23 && (packageManager = this.f7388r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.i;
        }
        return -1;
    }
}
