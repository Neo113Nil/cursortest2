package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.session.i;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class gvh extends Binder implements c9e {
    public static final /* synthetic */ int m = 0;
    public final WeakReference a;
    public final zth h;
    public final g06 i;
    public final Set j;
    public psn k;
    public int l;

    public gvh(i iVar) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(iVar);
        this.h = zth.a(iVar.f);
        this.i = new g06(iVar);
        this.j = Collections.synchronizedSet(new HashSet());
        this.k = psn.i;
    }

    public static lcg L0(i iVar, wrh wrhVar, int i, fvh fvhVar, ua6 ua6Var) {
        if (iVar.k()) {
            return kde.b;
        }
        lcg lcgVar = (lcg) fvhVar.h(iVar, wrhVar, i);
        xop xopVar = new xop();
        lcgVar.a(new r8(iVar, xopVar, ua6Var, lcgVar, 9), e48.a);
        return xopVar;
    }

    public static void P0(wrh wrhVar, int i, ump umpVar) {
        try {
            vrh vrhVar = wrhVar.d;
            vq1.B(vrhVar);
            vrhVar.k(i, umpVar);
        } catch (RemoteException e) {
            vq1.o0("MediaSessionStub", "Failed to send result to controller " + wrhVar, e);
        }
    }

    public static uvg Q0(ua6 ua6Var) {
        return new uvg(12, new uvg(13, ua6Var));
    }

    @Override // defpackage.c9e
    public final void B0(u8e u8eVar, int i, int i2) {
        if (u8eVar == null || i2 < 0) {
            return;
        }
        N0(u8eVar, i, 25, Q0(new irb(i2, 6)));
    }

    @Override // defpackage.c9e
    public final void C(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 2, Q0(new tuh(1)));
    }

    @Override // defpackage.c9e
    public final void D(u8e u8eVar, int i, int i2) {
        if (u8eVar == null || i2 < 0) {
            return;
        }
        N0(u8eVar, i, 10, new uvg(12, new puh(this, i2, 0)));
    }

    @Override // defpackage.c9e
    public final void E(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 26, Q0(new dlh(26)));
    }

    @Override // defpackage.c9e
    public final void F(u8e u8eVar, int i, boolean z) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 1, Q0(new qrb(3, z)));
    }

    @Override // defpackage.c9e
    public final void F0(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 7, Q0(new dlh(20)));
    }

    @Override // defpackage.c9e
    public final void G0(u8e u8eVar, int i, int i2) {
        if (u8eVar == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            N0(u8eVar, i, 15, Q0(new irb(i2, 5)));
        }
    }

    @Override // defpackage.c9e
    public final void H(u8e u8eVar, int i, Bundle bundle, boolean z) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            N0(u8eVar, i, 31, new yuh(new suh(1, new w1e(onh.b(bundle), z, 2), new tuh(6)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.c9e
    public final void I(u8e u8eVar) {
        if (u8eVar == null) {
            return;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            i iVar = (i) this.a.get();
            if (iVar != null && !iVar.k()) {
                wrh y = this.i.y(u8eVar.asBinder());
                if (y != null) {
                    dvt.c0(iVar.l, new juc(29, this, y));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.c9e
    public final void I0(u8e u8eVar, int i, int i2, int i3) {
        if (u8eVar == null || i2 < 0 || i3 < 0) {
            return;
        }
        N0(u8eVar, i, 20, Q0(new orb(i2, i3, 3)));
    }

    @Override // defpackage.c9e
    public final void J(u8e u8eVar, int i, Bundle bundle) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            N0(u8eVar, i, 13, Q0(new olh(new p0l(bundle.getFloat(p0l.e, 1.0f), bundle.getFloat(p0l.f, 1.0f)), 2)));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // defpackage.c9e
    public final void J0(u8e u8eVar, int i, int i2, Bundle bundle) {
        if (u8eVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            int i3 = 2;
            N0(u8eVar, i, 20, new yuh(new suh(i3, new quh(1, onh.b(bundle)), new puh(this, i2, i3)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.c9e
    public final void K(u8e u8eVar, int i, Bundle bundle, Bundle bundle2) {
        if (u8eVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            alp a = alp.a(bundle);
            X(u8eVar, i, a, 0, new yuh(new v13(28, a, bundle2), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.c9e
    public final void K0(u8e u8eVar, int i, boolean z) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 14, Q0(new qrb(5, z)));
    }

    @Override // defpackage.c9e
    public final void L(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 20, Q0(new tuh(4)));
    }

    @Override // defpackage.c9e
    public final void M(u8e u8eVar, int i, final boolean z, final int i2) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 34, Q0(new ua6() { // from class: uuh
            @Override // defpackage.ua6
            public final void accept(Object obj) {
                ((lrl) obj).D(i2, z);
            }
        }));
    }

    public final int M0(wrh wrhVar, lrl lrlVar, int i) {
        if (lrlVar.V0(17)) {
            g06 g06Var = this.i;
            if (!g06Var.J(wrhVar, 17) && g06Var.J(wrhVar, 16)) {
                return lrlVar.v0() + i;
            }
        }
        return i;
    }

    @Override // defpackage.c9e
    public final void N(u8e u8eVar, int i, Bundle bundle) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            N0(u8eVar, i, 19, Q0(new lrb(hoh.b(bundle), 2)));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    public final void N0(u8e u8eVar, int i, int i2, fvh fvhVar) {
        wrh y = this.i.y(u8eVar.asBinder());
        if (y != null) {
            O0(y, i, i2, fvhVar);
        }
    }

    @Override // defpackage.c9e
    public final void O(u8e u8eVar, int i, boolean z) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 26, Q0(new qrb(4, z)));
    }

    public final void O0(final wrh wrhVar, final int i, final int i2, final fvh fvhVar) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final i iVar = (i) this.a.get();
            if (iVar != null && !iVar.k()) {
                dvt.c0(iVar.l, new Runnable() { // from class: xuh
                    @Override // java.lang.Runnable
                    public final void run() {
                        g06 g06Var = gvh.this.i;
                        final wrh wrhVar2 = wrhVar;
                        int i3 = i2;
                        boolean J = g06Var.J(wrhVar2, i3);
                        final int i4 = i;
                        if (!J) {
                            gvh.P0(wrhVar2, i4, new ump(-4));
                            return;
                        }
                        final i iVar2 = iVar;
                        int W = iVar2.e.W(iVar2.k, iVar2.u(wrhVar2), i3);
                        if (W != 0) {
                            gvh.P0(wrhVar2, i4, new ump(W));
                            return;
                        }
                        final fvh fvhVar2 = fvhVar;
                        if (i3 != 27) {
                            g06Var.g(wrhVar2, i3, new s56() { // from class: bvh
                                @Override // defpackage.s56
                                public final lcg run() {
                                    return (lcg) fvh.this.h(iVar2, wrhVar2, i4);
                                }
                            });
                        } else {
                            fvhVar2.h(iVar2, wrhVar2, i4);
                            g06Var.g(wrhVar2, i3, new avh());
                        }
                    }
                });
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.c9e
    public final void P(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 3, Q0(new dlh(29)));
    }

    @Override // defpackage.c9e
    public final void Q(u8e u8eVar, int i, final int i2, final int i3, final int i4) {
        if (u8eVar == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        N0(u8eVar, i, 20, Q0(new ua6() { // from class: ruh
            @Override // defpackage.ua6
            public final void accept(Object obj) {
                ((lrl) obj).z0(i2, i3, i4);
            }
        }));
    }

    public final void R(u8e u8eVar, wrh wrhVar) {
        if (u8eVar != null) {
            i iVar = (i) this.a.get();
            if (iVar == null || iVar.k()) {
                try {
                    u8eVar.d();
                } catch (RemoteException unused) {
                }
            } else {
                this.j.add(wrhVar);
                dvt.c0(iVar.l, new r8(this, wrhVar, iVar, u8eVar, 8));
            }
        }
    }

    @Override // defpackage.c9e
    public final void U(u8e u8eVar, int i, Bundle bundle) {
        t56 t56Var;
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            ump a = ump.a(bundle);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                g06 g06Var = this.i;
                IBinder asBinder = u8eVar.asBinder();
                synchronized (g06Var.a) {
                    try {
                        wrh y = g06Var.y(asBinder);
                        t56Var = y != null ? (t56) ((xy0) g06Var.c).get(y) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ps1 ps1Var = t56Var != null ? t56Var.b : null;
                if (ps1Var == null) {
                    return;
                }
                ps1Var.e(i, a);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.c9e
    public final void V(u8e u8eVar, int i, Bundle bundle, boolean z) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            N0(u8eVar, i, 35, Q0(new w1e(dv1.a(bundle), z, 3)));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.c9e
    public final void W(u8e u8eVar, int i, Bundle bundle, long j) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            int i2 = 1;
            N0(u8eVar, i, 31, new yuh(new suh(i2, new plh(j, onh.b(bundle)), new tuh(6)), i2));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void X(u8e u8eVar, final int i, final alp alpVar, final int i2, final fvh fvhVar) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final i iVar = (i) this.a.get();
            if (iVar != null && !iVar.k()) {
                final wrh y = this.i.y(u8eVar.asBinder());
                if (y == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    dvt.c0(iVar.l, new Runnable() { // from class: wuh
                        @Override // java.lang.Runnable
                        public final void run() {
                            g06 g06Var = gvh.this.i;
                            wrh wrhVar = y;
                            if (g06Var.I(wrhVar)) {
                                alp alpVar2 = alpVar;
                                int i3 = i;
                                if (alpVar2 != null) {
                                    if (!g06Var.L(wrhVar, alpVar2)) {
                                        gvh.P0(wrhVar, i3, new ump(-4));
                                        return;
                                    }
                                } else if (!g06Var.K(wrhVar, i2)) {
                                    gvh.P0(wrhVar, i3, new ump(-4));
                                    return;
                                }
                                fvhVar.h(iVar, wrhVar, i3);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.c9e
    public final void Z(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 1, Q0(new v13(29, this, y)));
    }

    @Override // defpackage.c9e
    public final void a0(u8e u8eVar, int i, IBinder iBinder, int i2, long j) {
        if (u8eVar == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                yde a = vk3.a(iBinder);
                tde u = yde.u();
                for (int i3 = 0; i3 < a.size(); i3++) {
                    Bundle bundle = (Bundle) a.get(i3);
                    bundle.getClass();
                    u.a(onh.b(bundle));
                }
                int i4 = 1;
                N0(u8eVar, i, 20, new yuh(new suh(i4, new aj7(j, u.f(), i2), new tuh(6)), i4));
            } catch (RuntimeException e) {
                vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.c9e
    public final void b0(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 8, Q0(new dlh(17)));
    }

    @Override // defpackage.c9e
    public final void c0(u8e u8eVar, int i, float f) {
        if (u8eVar == null || f <= 0.0f) {
            return;
        }
        N0(u8eVar, i, 13, Q0(new mrb(3, f)));
    }

    @Override // defpackage.c9e
    public final void e(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 1, Q0(new dlh(16)));
    }

    @Override // defpackage.c9e
    public final void g0(u8e u8eVar, int i, int i2) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 34, Q0(new irb(i2, 4)));
    }

    @Override // defpackage.c9e
    public final void i0(u8e u8eVar, int i, int i2) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 34, Q0(new irb(i2, 3)));
    }

    @Override // defpackage.c9e
    public final void j0(u8e u8eVar, int i, IBinder iBinder, boolean z) {
        if (u8eVar == null || iBinder == null) {
            return;
        }
        try {
            yde a = vk3.a(iBinder);
            tde u = yde.u();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                u.a(onh.b(bundle));
            }
            N0(u8eVar, i, 20, new yuh(new suh(1, new w1e(u.f(), z, 4), new tuh(6)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.c9e
    public final void k0(u8e u8eVar, int i, int i2, int i3, IBinder iBinder) {
        if (u8eVar == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            yde a = vk3.a(iBinder);
            tde u = yde.u();
            for (int i4 = 0; i4 < a.size(); i4++) {
                Bundle bundle = (Bundle) a.get(i4);
                bundle.getClass();
                u.a(onh.b(bundle));
            }
            N0(u8eVar, i, 20, new yuh(new suh(2, new gth(u.f(), 2), new ouh(this, i2, i3)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.c9e
    public final void m(u8e u8eVar, int i, int i2, int i3) {
        if (u8eVar == null || i2 < 0) {
            return;
        }
        N0(u8eVar, i, 33, Q0(new orb(i2, i3, 2)));
    }

    @Override // defpackage.c9e
    public final void m0(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 9, Q0(new dlh(24)));
    }

    @Override // defpackage.c9e
    public final void n0(u8e u8eVar, int i, int i2, long j) {
        if (u8eVar == null || i2 < 0) {
            return;
        }
        N0(u8eVar, i, 10, new uvg(12, new aj7(j, this, i2)));
    }

    @Override // defpackage.c9e
    public final void o(u8e u8eVar, int i, float f) {
        if (u8eVar == null || f < 0.0f || f > 1.0f) {
            return;
        }
        N0(u8eVar, i, 24, Q0(new mrb(4, f)));
    }

    @Override // defpackage.c9e
    public final void o0(u8e u8eVar, int i, IBinder iBinder) {
        if (u8eVar == null || iBinder == null) {
            return;
        }
        try {
            yde a = vk3.a(iBinder);
            tde u = yde.u();
            for (int i2 = 0; i2 < a.size(); i2++) {
                Bundle bundle = (Bundle) a.get(i2);
                bundle.getClass();
                u.a(onh.b(bundle));
            }
            N0(u8eVar, i, 20, new yuh(new suh(2, new trb(u.f(), 2), new dlh(25)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i) {
            case 3002:
                o(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                B0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                p(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                E(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                O(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                H(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                W(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                H(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                j0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                j0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                a0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                F(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                U(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                z0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                u8e R = gmh.R(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                K(R, readInt, (Bundle) j66.C(parcel, creator), (Bundle) j66.C(parcel, creator));
                return true;
            case 3017:
                G0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                K0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                w(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                v(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                L(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                I0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                Q(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                Z(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                e(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                C(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                J(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                c0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                u8e R2 = gmh.R(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) j66.C(parcel, Bundle.CREATOR);
                if (R2 != null && bundle != null) {
                    try {
                        N0(R2, readInt2, 20, new yuh(new suh(2, new quh(2, onh.b(bundle)), new dlh(27)), 1));
                    } catch (RuntimeException e) {
                        vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    }
                }
                return true;
            case 3030:
                s(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                o0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                r0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                N(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                P(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                v0(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                q0(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                D(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                u0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                n0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                u(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                r(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                s0(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                b0(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                y0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Surface) j66.C(parcel, Surface.CREATOR));
                return true;
            case 3045:
                I(gmh.R(parcel.readStrongBinder()));
                return true;
            case 3046:
                F0(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                m0(gmh.R(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                q(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                u8e R3 = gmh.R(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                if (R3 != null && readString != null && bundle2 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        vq1.n0("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            X(R3, readInt3, null, 40010, new yuh(new suh(0, readString, gin.a(bundle2)), 1));
                        } catch (RuntimeException e2) {
                            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e2);
                        }
                    }
                }
                return true;
            case 3050:
                u8e R4 = gmh.R(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                Bundle bundle3 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                if (R4 != null && bundle3 != null) {
                    try {
                        X(R4, readInt4, null, 40010, new yuh(new uvg(14, gin.a(bundle3)), 1));
                    } catch (RuntimeException e3) {
                        vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e3);
                    }
                }
                return true;
            case 3051:
                m(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                g0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                i0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                M(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                J0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                k0(gmh.R(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                V(gmh.R(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j66.C(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            default:
                switch (i) {
                    case 4001:
                        u8e R5 = gmh.R(parcel.readStrongBinder());
                        int readInt5 = parcel.readInt();
                        Bundle bundle4 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                        if (R5 != null) {
                            if (bundle4 != null) {
                                try {
                                    znh.a(bundle4);
                                } catch (RuntimeException e4) {
                                    vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e4);
                                }
                            }
                            int i3 = 0;
                            X(R5, readInt5, null, 50000, new yuh(new tuh(i3), i3));
                        }
                        return true;
                    case 4002:
                        u8e R6 = gmh.R(parcel.readStrongBinder());
                        int readInt6 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (R6 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                vq1.n0("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            X(R6, readInt6, null, 50004, new yuh(new dlh(22), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        u8e R7 = gmh.R(parcel.readStrongBinder());
                        int readInt7 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt8 = parcel.readInt();
                        int readInt9 = parcel.readInt();
                        Bundle bundle5 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                        if (R7 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                vq1.n0("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt8 < 0) {
                                vq1.n0("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt9 < 1) {
                                vq1.n0("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle5 != null) {
                                    try {
                                        znh.a(bundle5);
                                    } catch (RuntimeException e5) {
                                        vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e5);
                                    }
                                }
                                X(R7, readInt7, null, 50003, new yuh(new dlh(15), 0));
                            }
                        }
                        return true;
                    case 4004:
                        u8e R8 = gmh.R(parcel.readStrongBinder());
                        int readInt10 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle6 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                        if (R8 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                vq1.n0("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle6 != null) {
                                    try {
                                        znh.a(bundle6);
                                    } catch (RuntimeException e6) {
                                        vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e6);
                                    }
                                }
                                X(R8, readInt10, null, 50005, new yuh(new tuh(5), 0));
                            }
                        }
                        return true;
                    case 4005:
                        u8e R9 = gmh.R(parcel.readStrongBinder());
                        int readInt11 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt12 = parcel.readInt();
                        int readInt13 = parcel.readInt();
                        Bundle bundle7 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                        if (R9 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                vq1.n0("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt12 < 0) {
                                vq1.n0("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt13 < 1) {
                                vq1.n0("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle7 != null) {
                                    try {
                                        znh.a(bundle7);
                                    } catch (RuntimeException e7) {
                                        vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e7);
                                    }
                                }
                                X(R9, readInt11, null, 50006, new yuh(new dlh(28), 0));
                            }
                        }
                        return true;
                    case 4006:
                        u8e R10 = gmh.R(parcel.readStrongBinder());
                        int readInt14 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle8 = (Bundle) j66.C(parcel, Bundle.CREATOR);
                        if (R10 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                vq1.n0("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle8 != null) {
                                    try {
                                        znh.a(bundle8);
                                    } catch (RuntimeException e8) {
                                        vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                    }
                                }
                                X(R10, readInt14, null, 50001, new yuh(new tuh(3), 0));
                            }
                        }
                        return true;
                    case 4007:
                        u8e R11 = gmh.R(parcel.readStrongBinder());
                        int readInt15 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (R11 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                vq1.n0("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            X(R11, readInt15, null, 50002, new yuh(new dlh(14), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.c9e
    public final void p(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 26, Q0(new dlh(18)));
    }

    public final rdl p0(rdl rdlVar) {
        yde ydeVar = rdlVar.D.a;
        tde u = yde.u();
        lde ldeVar = new lde(4);
        for (int i = 0; i < ydeVar.size(); i++) {
            d3t d3tVar = (d3t) ydeVar.get(i);
            xvs xvsVar = d3tVar.b;
            String str = (String) this.k.get(xvsVar);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.l;
                this.l = i2 + 1;
                int i3 = dvt.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(xvsVar.b);
                str = sb.toString();
            }
            ldeVar.h0(xvsVar, str);
            u.a(new d3t(new xvs(str, d3tVar.b.d), d3tVar.c, d3tVar.d, d3tVar.e));
        }
        this.k = ldeVar.r();
        rdl b = rdlVar.b(new e3t(u.f()));
        w0t w0tVar = b.E;
        if (w0tVar.D.isEmpty()) {
            return b;
        }
        v0t c = w0tVar.a().c();
        xkt it = w0tVar.D.values().iterator();
        while (it.hasNext()) {
            s0t s0tVar = (s0t) it.next();
            xvs xvsVar2 = s0tVar.a;
            String str2 = (String) this.k.get(xvsVar2);
            if (str2 != null) {
                c.a(new s0t(new xvs(str2, xvsVar2.d), s0tVar.b));
            } else {
                c.a(s0tVar);
            }
        }
        return b.o(c.b());
    }

    @Override // defpackage.c9e
    public final void q(u8e u8eVar, int i, Bundle bundle) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            N0(u8eVar, i, 29, Q0(new v13(27, this, w0t.b(bundle))));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // defpackage.c9e
    public final void q0(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 4, Q0(new tuh(2)));
    }

    @Override // defpackage.c9e
    public final void r(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 12, Q0(new dlh(23)));
    }

    @Override // defpackage.c9e
    public final void r0(u8e u8eVar, int i, int i2, IBinder iBinder) {
        if (u8eVar == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            yde a = vk3.a(iBinder);
            tde u = yde.u();
            for (int i3 = 0; i3 < a.size(); i3++) {
                Bundle bundle = (Bundle) a.get(i3);
                bundle.getClass();
                u.a(onh.b(bundle));
            }
            N0(u8eVar, i, 20, new yuh(new suh(2, new trb(u.f(), 1), new puh(this, i2, 3)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.c9e
    public final void s(u8e u8eVar, int i, int i2, Bundle bundle) {
        if (u8eVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            N0(u8eVar, i, 20, new yuh(new suh(2, new quh(0, onh.b(bundle)), new puh(this, i2, 1)), 1));
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.c9e
    public final void s0(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 6, Q0(new dlh(21)));
    }

    @Override // defpackage.c9e
    public final void u(u8e u8eVar, int i) {
        wrh y;
        if (u8eVar == null || (y = this.i.y(u8eVar.asBinder())) == null) {
            return;
        }
        O0(y, i, 11, Q0(new dlh(19)));
    }

    @Override // defpackage.c9e
    public final void u0(u8e u8eVar, int i, long j) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 5, Q0(new vuh(j)));
    }

    @Override // defpackage.c9e
    public final void v(u8e u8eVar, int i, int i2, int i3) {
        if (u8eVar == null || i2 < 0 || i3 < i2) {
            return;
        }
        N0(u8eVar, i, 20, new uvg(12, new ouh(this, i2, i3)));
    }

    @Override // defpackage.c9e
    public final void v0(u8e u8eVar, int i) {
        if (u8eVar == null) {
            return;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            i iVar = (i) this.a.get();
            if (iVar != null && !iVar.k()) {
                dvt.c0(iVar.l, new juc(28, this, u8eVar));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.c9e
    public final void w(u8e u8eVar, int i, int i2) {
        if (u8eVar == null || i2 < 0) {
            return;
        }
        N0(u8eVar, i, 20, new uvg(12, new puh(this, i2, 4)));
    }

    @Override // defpackage.c9e
    public final void y0(u8e u8eVar, int i, Surface surface) {
        if (u8eVar == null) {
            return;
        }
        N0(u8eVar, i, 27, Q0(new uvg(11, surface)));
    }

    @Override // defpackage.c9e
    public final void z0(u8e u8eVar, int i, Bundle bundle) {
        if (u8eVar == null || bundle == null) {
            return;
        }
        try {
            g66 a = g66.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = a.d;
            }
            try {
                xth xthVar = new xth(a.c, callingPid, callingUid);
                R(u8eVar, new wrh(xthVar, a.a, a.b, this.h.b(xthVar), new cvh(u8eVar, a.b), a.e));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            vq1.o0("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
