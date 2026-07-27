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
    private int f6597A;

    /* renamed from: B, reason: collision with root package name */
    private int f6598B;

    /* renamed from: C, reason: collision with root package name */
    private long f6599C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f6600D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f6601E;

    /* renamed from: r, reason: collision with root package name */
    private final Context f6602r;

    /* renamed from: s, reason: collision with root package name */
    private final g.a f6603s;

    /* renamed from: t, reason: collision with root package name */
    private final h f6604t;

    /* renamed from: u, reason: collision with root package name */
    private int f6605u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6606v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6607w;

    /* renamed from: x, reason: collision with root package name */
    private MediaFormat f6608x;

    /* renamed from: y, reason: collision with root package name */
    private int f6609y;

    /* renamed from: z, reason: collision with root package name */
    private int f6610z;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.b.h.c
        public final void a(int i) {
            o.this.f6603s.a(i);
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
            o.this.f6603s.a(i, j6, j9);
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
        long a9 = this.f6604t.a(v());
        if (a9 != Long.MIN_VALUE) {
            if (!this.f6601E) {
                a9 = Math.max(this.f6599C, a9);
            }
            this.f6599C = a9;
            this.f6601E = false;
        }
    }

    public static /* synthetic */ boolean b(o oVar) {
        oVar.f6601E = true;
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
        return this.f6599C;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        return this.f6604t.f();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void n() {
        super.n();
        this.f6604t.a();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void o() {
        F();
        this.f6604t.h();
        super.o();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void p() {
        try {
            this.f6604t.j();
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
        return this.f6604t.e() || super.u();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean v() {
        return super.v() && this.f6604t.d();
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void w() {
        try {
            this.f6604t.c();
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
        this.f6603s.a(mVar);
        this.f6609y = com.anythink.basead.exoplayer.k.o.f8465w.equals(mVar.f8665h) ? mVar.f8679w : 2;
        this.f6610z = mVar.f8677u;
        this.f6597A = mVar.f8680x;
        this.f6598B = mVar.f8681y;
    }

    private o(Context context, com.anythink.basead.exoplayer.f.c cVar, Handler handler, g gVar) {
        this(context, cVar, null, handler, gVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, com.anythink.basead.exoplayer.m mVar) {
        boolean z3;
        int i;
        int i6;
        String str = mVar.f8665h;
        if (!com.anythink.basead.exoplayer.k.o.a(str)) {
            return 0;
        }
        int i9 = af.f8346a >= 21 ? 32 : 0;
        boolean a9 = com.anythink.basead.exoplayer.a.a(gVar, mVar.f8667k);
        if (a9 && a(str) && cVar.a() != null) {
            return i9 | 12;
        }
        if ((com.anythink.basead.exoplayer.k.o.f8465w.equals(str) && !this.f6604t.a(mVar.f8679w)) || !this.f6604t.a(2)) {
            return 1;
        }
        com.anythink.basead.exoplayer.d.e eVar = mVar.f8667k;
        if (eVar != null) {
            z3 = false;
            for (int i10 = 0; i10 < eVar.f6845b; i10++) {
                z3 |= eVar.a(i10).f6851d;
            }
        } else {
            z3 = false;
        }
        com.anythink.basead.exoplayer.f.a a10 = cVar.a(str, z3);
        if (a10 == null) {
            return (!z3 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (a9) {
            return ((af.f8346a < 21 || (((i = mVar.f8678v) == -1 || a10.a(i)) && ((i6 = mVar.f8677u) == -1 || a10.b(i6)))) ? 4 : 3) | i9 | 8;
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
        this.f6602r = context.getApplicationContext();
        this.f6604t = hVar;
        this.f6603s = new g.a(handler, gVar2);
        hVar.a(new a(this, (byte) 0));
    }

    private int b(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar) {
        PackageManager packageManager;
        int i = af.f8346a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7198c) || (i == 23 && (packageManager = this.f6602r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.i;
        }
        return -1;
    }

    private static boolean b(String str) {
        if (af.f8346a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(af.f8348c)) {
            return false;
        }
        String str2 = af.f8347b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final com.anythink.basead.exoplayer.f.a a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.m mVar, boolean z3) {
        com.anythink.basead.exoplayer.f.a a9;
        return (!a(mVar.f8665h) || (a9 = cVar.a()) == null) ? super.a(cVar, mVar, z3) : a9;
    }

    private boolean a(String str) {
        int e9 = com.anythink.basead.exoplayer.k.o.e(str);
        return e9 != 0 && this.f6604t.a(e9);
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
        boolean z3;
        String str;
        PackageManager packageManager;
        q();
        int i = af.f8346a;
        this.f6605u = (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7198c) || (i == 23 && (packageManager = this.f6602r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) ? mVar.i : -1;
        String str2 = aVar.f7198c;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(af.f8348c)) {
            String str3 = af.f8347b;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z3 = true;
                this.f6607w = z3;
                this.f6606v = aVar.i;
                str = aVar.f7199d;
                if (str == null) {
                    str = com.anythink.basead.exoplayer.k.o.f8465w;
                }
                int i6 = this.f6605u;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("channel-count", mVar.f8677u);
                mediaFormat.setInteger("sample-rate", mVar.f8678v);
                com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8666j);
                com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", i6);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                }
                mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
                if (!this.f6606v) {
                    this.f6608x = mediaFormat;
                    mediaFormat.setString("mime", mVar.f8665h);
                    return;
                } else {
                    this.f6608x = null;
                    return;
                }
            }
        }
        z3 = false;
        this.f6607w = z3;
        this.f6606v = aVar.i;
        str = aVar.f7199d;
        if (str == null) {
        }
        int i62 = this.f6605u;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str);
        mediaFormat2.setInteger("channel-count", mVar.f8677u);
        mediaFormat2.setInteger("sample-rate", mVar.f8678v);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat2, mVar.f8666j);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat2, "max-input-size", i62);
        if (i >= 23) {
        }
        mediaCodec.configure(mediaFormat2, (Surface) null, mediaCrypto, 0);
        if (!this.f6606v) {
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(String str, long j6, long j9) {
        this.f6603s.a(str, j6, j9);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i6;
        MediaFormat mediaFormat2 = this.f6608x;
        if (mediaFormat2 != null) {
            i = com.anythink.basead.exoplayer.k.o.e(mediaFormat2.getString("mime"));
            mediaFormat = this.f6608x;
        } else {
            i = this.f6609y;
        }
        int i9 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f6607w && integer == 6 && (i6 = this.f6610z) < 6) {
            iArr = new int[i6];
            for (int i10 = 0; i10 < this.f6610z; i10++) {
                iArr[i10] = i10;
            }
        } else {
            iArr = null;
        }
        try {
            this.f6604t.a(i9, integer, integer2, iArr, this.f6597A, this.f6598B);
        } catch (h.a e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(boolean z3) {
        super.a(z3);
        this.f6603s.a(((com.anythink.basead.exoplayer.f.b) this).f7240q);
        int i = r().f6310b;
        if (i != 0) {
            this.f6604t.c(i);
        } else {
            this.f6604t.g();
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z3) {
        super.a(j6, z3);
        this.f6604t.i();
        this.f6599C = j6;
        this.f6600D = true;
        this.f6601E = true;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        return this.f6604t.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.c.e eVar) {
        if (!this.f6600D || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.f6743f - this.f6599C) > 500000) {
            this.f6599C = eVar.f6743f;
        }
        this.f6600D = false;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final boolean a(long j6, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i6, long j10, boolean z3) {
        if (this.f6606v && (i6 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z3) {
            mediaCodec.releaseOutputBuffer(i, false);
            ((com.anythink.basead.exoplayer.f.b) this).f7240q.f6735f++;
            this.f6604t.b();
            return true;
        }
        try {
            if (!this.f6604t.a(byteBuffer, j10)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            ((com.anythink.basead.exoplayer.f.b) this).f7240q.f6734e++;
            return true;
        } catch (h.b | h.d e9) {
            throw com.anythink.basead.exoplayer.g.a(e9, s());
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i == 2) {
            this.f6604t.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.f6604t.a((b) obj);
        }
    }

    private static MediaFormat a(com.anythink.basead.exoplayer.m mVar, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", mVar.f8677u);
        mediaFormat.setInteger("sample-rate", mVar.f8678v);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8666j);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", i);
        if (af.f8346a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    private static boolean a(com.anythink.basead.exoplayer.m mVar, com.anythink.basead.exoplayer.m mVar2) {
        return mVar.f8665h.equals(mVar2.f8665h) && mVar.f8677u == mVar2.f8677u && mVar.f8678v == mVar2.f8678v && mVar.f8680x == 0 && mVar.f8681y == 0 && mVar2.f8680x == 0 && mVar2.f8681y == 0 && mVar.b(mVar2);
    }

    private int a(com.anythink.basead.exoplayer.f.a aVar, com.anythink.basead.exoplayer.m mVar) {
        PackageManager packageManager;
        int i = af.f8346a;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(aVar.f7198c) || (i == 23 && (packageManager = this.f6602r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.i;
        }
        return -1;
    }
}
