package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class r0d implements q0d {
    public final c1d a;
    public final xzc b;
    public final dib c;
    public final fkn d;

    public r0d(c1d c1dVar, xzc xzcVar, dib dibVar) {
        c1dVar.getClass();
        xzcVar.getClass();
        dibVar.getClass();
        this.a = c1dVar;
        this.b = xzcVar;
        this.c = dibVar;
        this.d = c1dVar.q;
    }

    @Override // defpackage.q0d
    public final void a(int i) {
        this.b.a(i);
    }

    @Override // defpackage.q0d
    public final void b(int i) {
        int i2;
        xdr xdrVar = this.a.p;
        while (true) {
            Object value = xdrVar.getValue();
            Object obj = (a1d) value;
            if (Intrinsics.d(obj, y0d.a) || Intrinsics.d(obj, x0d.a)) {
                i2 = i;
            } else if (!(obj instanceof z0d)) {
                b6e.s();
                return;
            } else {
                i2 = i;
                obj = z0d.a((z0d) obj, i2, 0, null, false, 125);
            }
            if (xdrVar.k(value, obj)) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // defpackage.q0d
    public final void c(pbu pbuVar) {
        w0d w0dVar;
        pbuVar.getClass();
        c1d c1dVar = this.a;
        c1dVar.getClass();
        xdr xdrVar = c1dVar.p;
        Object value = xdrVar.getValue();
        z0d z0dVar = value instanceof z0d ? (z0d) value : null;
        if (z0dVar == null) {
            return;
        }
        if (!(pbuVar instanceof obu)) {
            if (pbuVar.equals(lbu.a) || pbuVar.equals(nbu.a) || (pbuVar instanceof mbu)) {
                return;
            }
            b6e.s();
            return;
        }
        if ((z0dVar.e.get(z0dVar.b) instanceof k0d) && (w0dVar = c1dVar.o) != null) {
            ExoPlayer exoPlayer = ((obu) pbuVar).a;
            exoPlayer.getClass();
            if (w0dVar.g && w0dVar.c) {
                v0d v0dVar = w0dVar.h;
                if (v0dVar != null) {
                    exoPlayer.x0(v0dVar);
                }
                v0d v0dVar2 = new v0d(new u0d(w0dVar, 0), new aub(1, exoPlayer, ExoPlayer.class, "removeListener", "removeListener(Landroidx/media3/common/Player$Listener;)V", 0, 5));
                exoPlayer.j0(v0dVar2);
                w0dVar.h = v0dVar2;
            }
        }
        c1d.a(xdrVar, new cnc(8));
    }

    @Override // defpackage.q0d
    public final void d(int i) {
        int i2;
        xdr xdrVar = this.a.p;
        while (true) {
            Object value = xdrVar.getValue();
            Object obj = (a1d) value;
            if (Intrinsics.d(obj, y0d.a) || Intrinsics.d(obj, x0d.a)) {
                i2 = i;
            } else if (!(obj instanceof z0d)) {
                b6e.s();
                return;
            } else {
                i2 = i;
                obj = z0d.a((z0d) obj, 0, i2, null, false, 123);
            }
            if (xdrVar.k(value, obj)) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // defpackage.q0d
    public final void e(IntRange intRange) {
        IntRange intRange2;
        intRange.getClass();
        c1d c1dVar = this.a;
        c1dVar.getClass();
        xdr xdrVar = c1dVar.p;
        while (true) {
            Object value = xdrVar.getValue();
            Object obj = (a1d) value;
            if (Intrinsics.d(obj, y0d.a) || Intrinsics.d(obj, x0d.a)) {
                intRange2 = intRange;
            } else if (!(obj instanceof z0d)) {
                b6e.s();
                return;
            } else {
                intRange2 = intRange;
                obj = z0d.a((z0d) obj, 0, 0, intRange2, false, 119);
            }
            if (xdrVar.k(value, obj)) {
                return;
            } else {
                intRange = intRange2;
            }
        }
    }

    @Override // defpackage.q0d
    public final vdr getState() {
        return this.d;
    }

    @Override // defpackage.q0d
    public final dib h() {
        return this.c;
    }

    @Override // defpackage.q0d
    public final void l() {
        w0d w0dVar = this.a.o;
        if (w0dVar != null) {
            rar rarVar = w0dVar.i;
            if (rarVar != null) {
                rarVar.g(null);
            }
            w0dVar.i = null;
            w0dVar.g = false;
        }
    }

    @Override // defpackage.q0d
    public final void m() {
        w0d w0dVar = this.a.o;
        if (w0dVar != null) {
            rar rarVar = w0dVar.i;
            if (rarVar != null) {
                rarVar.g(null);
            }
            w0dVar.i = null;
        }
    }
}
