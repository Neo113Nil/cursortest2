package com.anythink.basead.exoplayer;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.anythink.basead.exoplayer.a.a;
import com.anythink.basead.exoplayer.b.b;
import com.anythink.basead.exoplayer.h;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.exoplayer.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class ad implements h, w.e, w.g {

    /* renamed from: x, reason: collision with root package name */
    private static final String f6475x = "SimpleExoPlayer";

    /* renamed from: A, reason: collision with root package name */
    private final a f6476A;

    /* renamed from: B, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.l.g> f6477B;

    /* renamed from: C, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.g.f> f6478C;

    /* renamed from: D, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.l.h> f6479D;

    /* renamed from: E, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.b.g> f6480E;

    /* renamed from: F, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.a.a f6481F;

    /* renamed from: G, reason: collision with root package name */
    private m f6482G;

    /* renamed from: H, reason: collision with root package name */
    private m f6483H;

    /* renamed from: I, reason: collision with root package name */
    private Surface f6484I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f6485K;

    /* renamed from: L, reason: collision with root package name */
    private SurfaceHolder f6486L;

    /* renamed from: M, reason: collision with root package name */
    private TextureView f6487M;

    /* renamed from: N, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f6488N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f6489O;

    /* renamed from: P, reason: collision with root package name */
    private int f6490P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.b.b f6491Q;

    /* renamed from: R, reason: collision with root package name */
    private float f6492R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.s f6493S;

    /* renamed from: w, reason: collision with root package name */
    protected final y[] f6494w;

    /* renamed from: y, reason: collision with root package name */
    private final h f6495y;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f6496z;

    public final class a implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, com.anythink.basead.exoplayer.b.g, com.anythink.basead.exoplayer.g.f, com.anythink.basead.exoplayer.l.h {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(com.anythink.basead.exoplayer.c.d dVar) {
            ad.this.f6488N = dVar;
            Iterator it = ad.this.f6479D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(dVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void b(com.anythink.basead.exoplayer.c.d dVar) {
            Iterator it = ad.this.f6479D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).b(dVar);
            }
            ad.this.f6482G = null;
            ad.this.f6488N = null;
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void c(com.anythink.basead.exoplayer.c.d dVar) {
            ad.this.f6489O = dVar;
            Iterator it = ad.this.f6480E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).c(dVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void d(com.anythink.basead.exoplayer.c.d dVar) {
            Iterator it = ad.this.f6480E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).d(dVar);
            }
            ad.this.f6483H = null;
            ad.this.f6489O = null;
            ad.this.f6490P = 0;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
            ad.this.a(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ad.this.a((Surface) null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i9) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ad.this.a(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ad.this.a((Surface) null, false);
        }

        public /* synthetic */ a(ad adVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(String str, long j9, long j10) {
            Iterator it = ad.this.f6479D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(str, j9, j10);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void b(String str, long j9, long j10) {
            Iterator it = ad.this.f6480E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).b(str, j9, j10);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(m mVar) {
            ad.this.f6482G = mVar;
            Iterator it = ad.this.f6479D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void b(m mVar) {
            ad.this.f6483H = mVar;
            Iterator it = ad.this.f6480E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).b(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(int i, long j9) {
            Iterator it = ad.this.f6479D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(i, j9);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(int i, int i4, int i9, float f6) {
            Iterator it = ad.this.f6477B.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.g) it.next()).a(i, i4);
            }
            Iterator it2 = ad.this.f6479D.iterator();
            while (it2.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it2.next()).a(i, i4, i9, f6);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(Surface surface) {
            if (ad.this.f6484I == surface) {
                Iterator it = ad.this.f6477B.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            Iterator it2 = ad.this.f6479D.iterator();
            while (it2.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it2.next()).a(surface);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void a(int i) {
            ad.this.f6490P = i;
            Iterator it = ad.this.f6480E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).a(i);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void a(int i, long j9, long j10) {
            Iterator it = ad.this.f6480E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).a(i, j9, j10);
            }
        }

        @Override // com.anythink.basead.exoplayer.g.f
        public final void a(com.anythink.basead.exoplayer.g.a aVar) {
            Iterator it = ad.this.f6478C.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.g.f) it.next()).a(aVar);
            }
        }
    }

    @Deprecated
    public interface b extends com.anythink.basead.exoplayer.l.g {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ad(ab abVar, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar) {
        this(abVar, hVar, pVar, gVar, (byte) 0);
        new a.C0013a();
    }

    @Deprecated
    private int K() {
        return af.f(this.f6491Q.f6584d);
    }

    private com.anythink.basead.exoplayer.a.a L() {
        return this.f6481F;
    }

    private com.anythink.basead.exoplayer.b.b M() {
        return this.f6491Q;
    }

    private float N() {
        return this.f6492R;
    }

    private m O() {
        return this.f6482G;
    }

    private m P() {
        return this.f6483H;
    }

    private int Q() {
        return this.f6490P;
    }

    private com.anythink.basead.exoplayer.c.d R() {
        return this.f6488N;
    }

    private com.anythink.basead.exoplayer.c.d S() {
        return this.f6489O;
    }

    private void T() {
        TextureView textureView = this.f6487M;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f6476A) {
                Log.w(f6475x, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f6487M.setSurfaceTextureListener(null);
            }
            this.f6487M = null;
        }
        SurfaceHolder surfaceHolder = this.f6486L;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f6476A);
            this.f6486L = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int A() {
        return this.f6495y.A();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long B() {
        return this.f6495y.B();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int C() {
        return this.f6495y.C();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.h.af D() {
        return this.f6495y.D();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.i.g E() {
        return this.f6495y.E();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final ae F() {
        return this.f6495y.F();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object G() {
        return this.f6495y.G();
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final int H() {
        return this.f6485K;
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void I() {
        a((Surface) null);
    }

    public final boolean J() {
        return d() == 3 && f();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final w.g b() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final w.e c() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean f() {
        return this.f6495y.f();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int g() {
        return this.f6495y.g();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean h() {
        return this.f6495y.h();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean i() {
        return this.f6495y.i();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void j() {
        this.f6481F.a();
        this.f6495y.j();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final v k() {
        return this.f6495y.k();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object l() {
        return this.f6495y.l();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void m() {
        c(false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void n() {
        this.f6495y.n();
        T();
        Surface surface = this.f6484I;
        if (surface != null) {
            if (this.J) {
                surface.release();
            }
            this.f6484I = null;
        }
        com.anythink.basead.exoplayer.h.s sVar = this.f6493S;
        if (sVar != null) {
            sVar.a(this.f6481F);
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int o() {
        return this.f6495y.o();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int p() {
        return this.f6495y.p();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int q() {
        return this.f6495y.q();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int r() {
        return this.f6495y.r();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long s() {
        try {
            return this.f6495y.s();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long t() {
        return this.f6495y.t();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long u() {
        return this.f6495y.u();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int v() {
        return this.f6495y.v();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean w() {
        return this.f6495y.w();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean x() {
        return this.f6495y.x();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean y() {
        return this.f6495y.y();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int z() {
        return this.f6495y.z();
    }

    public ad(ab abVar, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, byte b9) {
        this(abVar, hVar, pVar, gVar, com.anythink.basead.exoplayer.k.c.f8522a);
    }

    @Deprecated
    private void e(int i) {
        com.anythink.basead.exoplayer.b.b a9 = new b.a().b(af.d(i)).a(af.e(i)).a();
        this.f6491Q = a9;
        for (y yVar : this.f6494w) {
            if (yVar.a() == 1) {
                this.f6495y.a(yVar).a(3).a(a9).i();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void d(int i) {
        this.f6485K = i;
        for (y yVar : this.f6494w) {
            if (yVar.a() == 2) {
                this.f6495y.a(yVar).a(4).a(Integer.valueOf(i)).i();
            }
        }
    }

    private ad(ab abVar, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, com.anythink.basead.exoplayer.k.c cVar) {
        a aVar = new a(this, (byte) 0);
        this.f6476A = aVar;
        this.f6477B = new CopyOnWriteArraySet<>();
        this.f6478C = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<com.anythink.basead.exoplayer.l.h> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f6479D = copyOnWriteArraySet;
        CopyOnWriteArraySet<com.anythink.basead.exoplayer.b.g> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f6480E = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f6496z = handler;
        y[] a9 = abVar.a(handler, aVar, aVar, aVar, gVar);
        this.f6494w = a9;
        this.f6492R = 1.0f;
        this.f6490P = 0;
        this.f6491Q = com.anythink.basead.exoplayer.b.b.f6581a;
        this.f6485K = 1;
        j jVar = new j(a9, hVar, pVar, cVar);
        this.f6495y = jVar;
        com.anythink.basead.exoplayer.a.a a10 = a.C0013a.a(jVar, cVar);
        this.f6481F = a10;
        a((w.c) a10);
        copyOnWriteArraySet.add(a10);
        copyOnWriteArraySet2.add(a10);
        a((com.anythink.basead.exoplayer.g.f) a10);
        if (gVar instanceof com.anythink.basead.exoplayer.d.d) {
            ((com.anythink.basead.exoplayer.d.d) gVar).a(handler, a10);
        }
    }

    @Deprecated
    private void c(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6478C.retainAll(Collections.singleton(this.f6481F));
        if (fVar != null) {
            a(fVar);
        }
    }

    @Deprecated
    private void c(com.anythink.basead.exoplayer.l.h hVar) {
        this.f6479D.remove(hVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(Surface surface) {
        if (surface == null || surface != this.f6484I) {
            return;
        }
        a((Surface) null);
    }

    @Deprecated
    private void c(com.anythink.basead.exoplayer.b.g gVar) {
        this.f6480E.remove(gVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(Surface surface) {
        T();
        a(surface, false);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null || surfaceHolder != this.f6486L) {
            return;
        }
        a((SurfaceHolder) null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void c(boolean z8) {
        this.f6495y.c(z8);
        com.anythink.basead.exoplayer.h.s sVar = this.f6493S;
        if (sVar != null) {
            sVar.a(this.f6481F);
            this.f6493S = null;
            this.f6481F.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.isValid() != false) goto L11;
     */
    @Override // com.anythink.basead.exoplayer.w.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(SurfaceHolder surfaceHolder) {
        Surface surface;
        T();
        this.f6486L = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f6476A);
            surface = surfaceHolder.getSurface();
            if (surface != null) {
            }
        }
        surface = null;
        a(surface, false);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        if (holder == null || holder != this.f6486L) {
            return;
        }
        a((SurfaceHolder) null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int d() {
        return this.f6495y.d();
    }

    @Deprecated
    private void d(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6478C.remove(fVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(TextureView textureView) {
        if (textureView == null || textureView != this.f6487M) {
            return;
        }
        a((TextureView) null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int c(int i) {
        return this.f6495y.c(i);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(SurfaceView surfaceView) {
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    private void b(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6481F.b(bVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(TextureView textureView) {
        T();
        this.f6487M = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w(f6475x, "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f6476A);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        a(surface, true);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final g e() {
        return this.f6495y.e();
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(com.anythink.basead.exoplayer.l.g gVar) {
        this.f6477B.remove(gVar);
    }

    @Deprecated
    private void b(b bVar) {
        b((com.anythink.basead.exoplayer.l.g) bVar);
    }

    private void b(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6478C.remove(fVar);
    }

    @Deprecated
    private void b(com.anythink.basead.exoplayer.l.h hVar) {
        this.f6479D.add(hVar);
    }

    @Deprecated
    private void b(com.anythink.basead.exoplayer.b.g gVar) {
        this.f6480E.add(gVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(w.c cVar) {
        this.f6495y.b(cVar);
    }

    private void a(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6481F.a(bVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(boolean z8) {
        this.f6495y.b(z8);
    }

    private void a(com.anythink.basead.exoplayer.b.b bVar) {
        this.f6491Q = bVar;
        for (y yVar : this.f6494w) {
            if (yVar.a() == 1) {
                this.f6495y.a(yVar).a(3).a(bVar).i();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(int i) {
        this.f6481F.a();
        this.f6495y.b(i);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void b(h.c... cVarArr) {
        this.f6495y.b(cVarArr);
    }

    public final void a(float f6) {
        this.f6492R = f6;
        for (y yVar : this.f6494w) {
            if (yVar.a() == 1) {
                this.f6495y.a(yVar).a(2).a(Float.valueOf(f6)).i();
            }
        }
    }

    @Deprecated
    private void a(PlaybackParams playbackParams) {
        v vVar;
        if (playbackParams != null) {
            playbackParams.allowDefaults();
            vVar = new v(playbackParams.getSpeed(), playbackParams.getPitch());
        } else {
            vVar = null;
        }
        a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(com.anythink.basead.exoplayer.l.g gVar) {
        this.f6477B.add(gVar);
    }

    @Deprecated
    private void a(b bVar) {
        this.f6477B.clear();
        if (bVar != null) {
            a((com.anythink.basead.exoplayer.l.g) bVar);
        }
    }

    private void a(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6478C.add(fVar);
    }

    @Deprecated
    private void a(com.anythink.basead.exoplayer.l.h hVar) {
        this.f6479D.retainAll(Collections.singleton(this.f6481F));
        if (hVar != null) {
            this.f6479D.add(hVar);
        }
    }

    @Deprecated
    private void a(com.anythink.basead.exoplayer.b.g gVar) {
        this.f6480E.retainAll(Collections.singleton(this.f6481F));
        if (gVar != null) {
            this.f6480E.add(gVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final Looper a() {
        return this.f6495y.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(w.c cVar) {
        this.f6495y.a(cVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z8, boolean z9) {
        com.anythink.basead.exoplayer.h.s sVar2 = this.f6493S;
        if (sVar2 != sVar) {
            if (sVar2 != null) {
                sVar2.a(this.f6481F);
                this.f6481F.b();
            }
            sVar.a(this.f6496z, this.f6481F);
            this.f6493S = sVar;
        }
        this.f6495y.a(sVar, z8, z9);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(boolean z8) {
        this.f6495y.a(z8);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i) {
        this.f6495y.a(i);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(long j9) {
        this.f6481F.a();
        this.f6495y.a(j9);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i, long j9) {
        this.f6481F.a();
        this.f6495y.a(i, j9);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(v vVar) {
        this.f6495y.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(ac acVar) {
        this.f6495y.a(acVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(h.c... cVarArr) {
        this.f6495y.a(cVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final x a(x.b bVar) {
        return this.f6495y.a(bVar);
    }

    private static h a(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.k.c cVar) {
        return new j(yVarArr, hVar, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface, boolean z8) {
        ArrayList arrayList = new ArrayList();
        for (y yVar : this.f6494w) {
            if (yVar.a() == 2) {
                arrayList.add(this.f6495y.a(yVar).a(1).a(surface).i());
            }
        }
        Surface surface2 = this.f6484I;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).k();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f6495y.c(false);
            }
            if (this.J) {
                this.f6484I.release();
            }
        }
        this.f6484I = surface;
        this.J = z8;
    }
}
