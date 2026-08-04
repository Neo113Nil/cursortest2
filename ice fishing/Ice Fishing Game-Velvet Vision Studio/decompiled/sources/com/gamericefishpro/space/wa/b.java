package com.gamericefishpro.space.wa;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.b2.t;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.c0;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.j;
import com.gamericefishpro.space.d0.v;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d4.i;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h0.w0;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.h3.l;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.oh.o;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.pi.e0;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.y.q;
import com.gamericefishpro.space.z4.s0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static com.gamericefishpro.space.u1.f a;
    public static com.gamericefishpro.space.u1.f b;

    public static final com.gamericefishpro.space.i4.a D(View view) {
        com.gamericefishpro.space.i4.a aVar = (com.gamericefishpro.space.i4.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        com.gamericefishpro.space.i4.a aVar2 = new com.gamericefishpro.space.i4.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final long F(long j) {
        if (j < 0) {
            com.gamericefishpro.space.ni.b.d.getClass();
            return com.gamericefishpro.space.ni.b.i;
        }
        com.gamericefishpro.space.ni.b.d.getClass();
        return com.gamericefishpro.space.ni.b.e;
    }

    public static boolean H(byte b2) {
        return b2 > -65;
    }

    public static final void K(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException(y0.g("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static com.gamericefishpro.space.t4.b L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    com.gamericefishpro.space.t4.b bVar = new com.gamericefishpro.space.t4.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.v = byteBufferDuplicate;
                    bVar.d = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.e = i6;
                    bVar.i = ((ByteBuffer) bVar.v).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final long M(long j, long j2, com.gamericefishpro.space.ni.d dVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return com.gamericefishpro.space.u6.f.L(j3, dVar);
        }
        com.gamericefishpro.space.ni.d dVar2 = com.gamericefishpro.space.ni.d.MILLISECONDS;
        if (dVar.compareTo(dVar2) >= 0) {
            return com.gamericefishpro.space.ni.b.f(F(j3));
        }
        long jA = com.gamericefishpro.space.ni.e.a(1L, dVar2, dVar);
        long j4 = (j / jA) - (j2 / jA);
        long j5 = (j % jA) - (j2 % jA);
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        return com.gamericefishpro.space.ni.b.d(com.gamericefishpro.space.u6.f.L(j4, dVar2), com.gamericefishpro.space.u6.f.L(j5, dVar));
    }

    public static void N(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            i.e(window, z);
        } else {
            if (i >= 30) {
                i.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void P(Object obj) {
        if (obj instanceof o) {
            throw ((o) obj).d;
        }
    }

    public static final void Q(com.gamericefishpro.space.b2.h hVar, long j, Function1 function1, boolean z) {
        MotionEvent motionEventA = hVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    public static final boolean R(Throwable th, Function0 function0) {
        com.gamericefishpro.space.g1.h hVar;
        Intrinsics.checkNotNullParameter(th, "<this>");
        List listB = com.gamericefishpro.space.xh.c.a.b(th);
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listB.get(i)) instanceof com.gamericefishpro.space.g1.h) {
                return false;
            }
        }
        try {
            com.gamericefishpro.space.g1.a aVar = (com.gamericefishpro.space.g1.a) function0.invoke();
            if (aVar != null && !aVar.a.isEmpty()) {
                z = true;
            }
            if (z) {
                Intrinsics.b(aVar);
                hVar = new com.gamericefishpro.space.g1.h(aVar);
            } else {
                hVar = null;
            }
        } catch (Throwable th2) {
            hVar = th2;
        }
        if (hVar != null) {
            com.gamericefishpro.space.oh.c.a(th, hVar);
        }
        return z;
    }

    public static int T(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static void U(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static int V(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long W(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static final void a(Function0 onBack, com.gamericefishpro.space.u7.c cVar, r rVar, int i) {
        int i2;
        com.gamericefishpro.space.u7.c cVar2;
        y yVar;
        long j;
        com.gamericefishpro.space.u7.c cVar3;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar2.b0(-1853016066);
        int i3 = i | (rVar2.h(onBack) ? 4 : 2) | 16;
        if ((i3 & 19) == 18 && rVar2.E()) {
            rVar2.V();
            cVar3 = cVar;
        } else {
            rVar2.X();
            if ((i & 1) == 0 || rVar2.B()) {
                rVar2.a0(-1614864554);
                com.gamericefishpro.space.z4.y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar2);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = com.gamericefishpro.space.d9.h.K(b0.a(com.gamericefishpro.space.u7.c.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar2), null);
                rVar2.p(false);
                i2 = i3 & (-113);
                cVar2 = (com.gamericefishpro.space.u7.c) s0VarK;
            } else {
                rVar2.V();
                i2 = i3 & (-113);
                cVar2 = cVar;
            }
            int i4 = i2;
            rVar2.q();
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(cVar2.c, rVar2);
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = com.gamericefishpro.space.d9.h.F(h0Var, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar2 = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.u7.c cVar4 = cVar2;
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j2 = s.b;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new s(s.c(j2, 0.5f))), new Pair(Float.valueOf(0.5f), new s(s.f)), new Pair(Float.valueOf(1.0f), new s(s.c(j2, 0.8f)))}), null, 6), rVar2, 6);
            a4.f(rVar2, 0);
            float f = 20;
            m mVarM = j.m(h0Var, f, 48);
            v vVar = com.gamericefishpro.space.d0.h.b;
            com.gamericefishpro.space.h1.c cVar5 = com.gamericefishpro.space.h1.b.F;
            com.gamericefishpro.space.d0.b0 b0VarA = z.a(vVar, cVar5, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarM, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarB = g1.b(jVar, 1.0f);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarB, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, eVar4);
            com.gamericefishpro.space.u6.f.b(onBack, rVar2, i4 & 14);
            float f2 = 16;
            j.c(g1.g(jVar, f2), rVar2);
            long j3 = s.c;
            r0.a("STATISTICS", null, j3, com.gamericefishpro.space.hj.c.C(28), k.y, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new j0(s.c(j2, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar.p(true);
            float f3 = 40;
            j.c(g1.d(jVar, f3), rVar);
            m mVarA = c0.a(g1.b(jVar, 1.0f));
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.e, false);
            int iHashCode4 = Long.hashCode(rVar.T);
            l1 l1VarL4 = rVar.l();
            m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarA, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar = yVar2;
                rVar.k(yVar);
            } else {
                yVar = yVar2;
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL4, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF4, eVar4);
            float f4 = 32;
            y yVar3 = yVar;
            m mVarO = j.o(j.m(q.g(q.e(com.gamericefishpro.space.l1.h.b(j.o(g1.b(jVar, 1.0f), 0.0f, 60, 0.0f, 0.0f, 13), com.gamericefishpro.space.k0.e.a(f4)), s.c(j3, 0.15f), com.gamericefishpro.space.o1.o.b), 1, s.c(j3, 0.4f), com.gamericefishpro.space.k0.e.a(f4)), f, f4), 0.0f, f3, 0.0f, 0.0f, 13);
            com.gamericefishpro.space.d0.b0 b0VarA2 = z.a(com.gamericefishpro.space.d0.h.g(f2), cVar5, rVar, 6);
            int iHashCode5 = Long.hashCode(rVar.T);
            l1 l1VarL5 = rVar.l();
            m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarO, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar3);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL5, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF5, eVar4);
            String strValueOf = String.valueOf(((com.gamericefishpro.space.u7.b) v0VarL.getValue()).a);
            com.gamericefishpro.space.u1.f fVarB = a4.c;
            if (fVarB != null) {
                j = j2;
            } else {
                com.gamericefishpro.space.u1.e eVar5 = new com.gamericefishpro.space.u1.e("Filled.DoneAll", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                g0 g0Var = com.gamericefishpro.space.u1.g0.a;
                j = j2;
                m0 m0Var = new m0(j);
                u uVar = new u(1);
                uVar.B(18.0f, 7.0f);
                uVar.A(-1.41f, -1.41f);
                uVar.A(-6.34f, 6.34f);
                uVar.A(1.41f, 1.41f);
                uVar.z(18.0f, 7.0f);
                uVar.s();
                uVar.B(22.24f, 5.59f);
                uVar.z(11.66f, 16.17f);
                uVar.z(7.48f, 12.0f);
                uVar.A(-1.41f, 1.41f);
                uVar.z(11.66f, 19.0f);
                uVar.A(12.0f, -12.0f);
                uVar.A(-1.42f, -1.41f);
                uVar.s();
                uVar.B(0.41f, 13.41f);
                uVar.z(6.0f, 19.0f);
                uVar.A(1.41f, -1.41f);
                uVar.z(1.83f, 12.0f);
                uVar.z(0.41f, 13.41f);
                uVar.s();
                com.gamericefishpro.space.u1.e.a(eVar5, (ArrayList) uVar.e, m0Var);
                fVarB = eVar5.b();
                a4.c = fVarB;
            }
            long j4 = j;
            d5.d("Levels Completed", strValueOf, fVarB, null, j3, rVar, 24582, 8);
            String strValueOf2 = String.valueOf(((com.gamericefishpro.space.u7.b) v0VarL.getValue()).d);
            com.gamericefishpro.space.u1.f fVarB2 = com.gamericefishpro.space.a.a.a;
            if (fVarB2 == null) {
                com.gamericefishpro.space.u1.e eVar6 = new com.gamericefishpro.space.u1.e("Filled.Landscape", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                g0 g0Var2 = com.gamericefishpro.space.u1.g0.a;
                m0 m0Var2 = new m0(j4);
                u uVar2 = new u(1);
                uVar2.B(14.0f, 6.0f);
                uVar2.A(-3.75f, 5.0f);
                uVar2.A(2.85f, 3.8f);
                uVar2.A(-1.6f, 1.2f);
                uVar2.t(9.81f, 13.75f, 7.0f, 10.0f, 7.0f, 10.0f);
                uVar2.A(-6.0f, 8.0f);
                uVar2.y(22.0f);
                uVar2.z(14.0f, 6.0f);
                uVar2.s();
                com.gamericefishpro.space.u1.e.a(eVar6, (ArrayList) uVar2.e, m0Var2);
                fVarB2 = eVar6.b();
                com.gamericefishpro.space.a.a.a = fVarB2;
            }
            d5.d("Highest Level", strValueOf2, fVarB2, null, j3, rVar, 24582, 8);
            String strValueOf3 = String.valueOf(((com.gamericefishpro.space.u7.b) v0VarL.getValue()).b);
            com.gamericefishpro.space.u1.f fVarG = d5.G();
            long j5 = com.gamericefishpro.space.l7.c.e;
            d5.d("Total Stars", strValueOf3, fVarG, null, j5, rVar, 24582, 8);
            String strValueOf4 = String.valueOf(((com.gamericefishpro.space.u7.b) v0VarL.getValue()).e);
            com.gamericefishpro.space.u1.f fVarB3 = com.gamericefishpro.space.u6.f.f;
            if (fVarB3 == null) {
                com.gamericefishpro.space.u1.e eVar7 = new com.gamericefishpro.space.u1.e("Filled.Stars", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                g0 g0Var3 = com.gamericefishpro.space.u1.g0.a;
                m0 m0Var3 = new m0(j4);
                u uVar3 = new u(1);
                uVar3.B(11.99f, 2.0f);
                uVar3.t(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                uVar3.E(4.47f, 10.0f, 9.99f, 10.0f);
                uVar3.t(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                uVar3.D(17.52f, 2.0f, 11.99f, 2.0f);
                uVar3.s();
                uVar3.B(16.23f, 18.0f);
                uVar3.z(12.0f, 15.45f);
                uVar3.z(7.77f, 18.0f);
                uVar3.A(1.12f, -4.81f);
                uVar3.A(-3.73f, -3.23f);
                uVar3.A(4.92f, -0.42f);
                uVar3.z(12.0f, 5.0f);
                uVar3.A(1.92f, 4.53f);
                uVar3.A(4.92f, 0.42f);
                uVar3.A(-3.73f, 3.23f);
                uVar3.z(16.23f, 18.0f);
                uVar3.s();
                com.gamericefishpro.space.u1.e.a(eVar7, (ArrayList) uVar3.e, m0Var3);
                fVarB3 = eVar7.b();
                com.gamericefishpro.space.u6.f.f = fVarB3;
            }
            rVar2 = rVar;
            d5.d("3-Star Levels", strValueOf4, fVarB3, null, j5, rVar2, 24582, 8);
            d5.d("Total Coins", String.valueOf(((com.gamericefishpro.space.u7.b) v0VarL.getValue()).c), null, Integer.valueOf(R.drawable.ic_money), j5, rVar2, 24582, 4);
            rVar2.p(true);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.girl_with_red_fish, rVar2, 0), "Stats Fisher", com.gamericefishpro.space.hj.c.Y(j.i(g1.f(jVar, 160), 0, -20), 1.0f), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar2, 25016, 104);
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
            cVar3 = cVar4;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new w(i, 14, onBack, cVar3);
        }
    }

    public static final boolean b(com.gamericefishpro.space.k1.e eVar, long j) {
        if (!eVar.d.G) {
            return false;
        }
        com.gamericefishpro.space.h2.q qVar = com.gamericefishpro.space.h2.k.s(eVar).Z.c;
        if (!qVar.j0.G) {
            return false;
        }
        long jH = qVar.H(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        long j2 = eVar.J;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static com.gamericefishpro.space.h3.k c(e0 this_asListenableFuture) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "<this>");
        com.gamericefishpro.space.h3.i completer = new com.gamericefishpro.space.h3.i();
        completer.c = new l();
        com.gamericefishpro.space.h3.k kVar = new com.gamericefishpro.space.h3.k(completer);
        completer.b = kVar;
        completer.a = com.gamericefishpro.space.m5.a.class;
        try {
            Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
            Intrinsics.checkNotNullParameter(completer, "completer");
            this_asListenableFuture.n(new t(9, completer, this_asListenableFuture));
            completer.a = "Deferred.asListenableFuture";
        } catch (Exception e) {
            kVar.e.k(e);
        }
        Intrinsics.checkNotNullExpressionValue(kVar, "getFuture { completer ->…      }\n        tag\n    }");
        return kVar;
    }

    public static final Object d(com.gamericefishpro.space.r9.o oVar, com.gamericefishpro.space.f7.g frame) throws Exception {
        if (!oVar.j()) {
            com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
            hVar.s();
            oVar.b(com.gamericefishpro.space.yi.a.d, new u(28, hVar));
            Object objR = hVar.r();
            if (objR == com.gamericefishpro.space.uh.a.d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objR;
        }
        Exception exception = oVar.getException();
        if (exception != null) {
            throw exception;
        }
        if (!oVar.d) {
            return oVar.getResult();
        }
        throw new CancellationException("Task " + oVar + " was cancelled normally.");
    }

    public static String e(String str, int i, int i2) {
        if (i < 0) {
            return com.gamericefishpro.space.a.a.w("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.gamericefishpro.space.a.a.w("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Object f(com.gamericefishpro.space.h2.i iVar, Function0 function0, com.gamericefishpro.space.vh.i iVar2) {
        Object obj;
        a1 a1Var;
        com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) iVar;
        boolean z = lVar.d.G;
        if (!z) {
            return Unit.a;
        }
        if (!z) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar2 = lVar.d.w;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(iVar);
        loop0: while (true) {
            obj = null;
            if (f0VarS == null) {
                break;
            }
            if ((f0VarS.Z.f.v & 524288) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.i & 524288) != 0) {
                        com.gamericefishpro.space.h1.l lVarE = lVar2;
                        com.gamericefishpro.space.v0.e eVar = null;
                        while (lVarE != null) {
                            if (lVarE instanceof com.gamericefishpro.space.l2.a) {
                                obj = lVarE;
                                break loop0;
                            }
                            if ((lVarE.i & 524288) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                int i = 0;
                                for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                    if ((lVar3.i & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                        }
                    }
                    lVar2 = lVar2.w;
                }
            }
            f0VarS = f0VarS.v();
            lVar2 = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
        }
        com.gamericefishpro.space.l2.a aVar = (com.gamericefishpro.space.l2.a) obj;
        if (aVar == null) {
            return Unit.a;
        }
        f1 f1VarR = com.gamericefishpro.space.h2.k.r(iVar);
        Object objB = aVar.B(f1VarR, new com.gamericefishpro.space.b2.b(8, function0, f1VarR), iVar2);
        return objB == com.gamericefishpro.space.uh.a.d ? objB : Unit.a;
    }

    public static final Bundle g(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.d;
            Object obj = pair.e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                com.gamericefishpro.space.y3.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                com.gamericefishpro.space.y3.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void j(int i, int i2) {
        String strW;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strW = com.gamericefishpro.space.a.a.w("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strW = com.gamericefishpro.space.a.a.w("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strW);
        }
    }

    public static void k(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(e("index", i, i2));
        }
    }

    public static void l(int i, int i2, int i3) {
        String strE;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strE = e("start index", i, i3);
            } else {
                strE = (i2 < 0 || i2 > i3) ? e("end index", i2, i3) : com.gamericefishpro.space.a.a.w("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static int m(com.gamericefishpro.space.r5.j0 j0Var, com.gamericefishpro.space.f.b bVar, View view, View view2, com.gamericefishpro.space.r5.b0 b0Var, boolean z) {
        if (b0Var.q() == 0 || j0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(com.gamericefishpro.space.r5.b0.A(view) - com.gamericefishpro.space.r5.b0.A(view2)) + 1;
        }
        return Math.min(bVar.o(), bVar.c(view2) - bVar.f(view));
    }

    public static int n(com.gamericefishpro.space.r5.j0 j0Var, com.gamericefishpro.space.f.b bVar, View view, View view2, com.gamericefishpro.space.r5.b0 b0Var, boolean z, boolean z2) {
        if (b0Var.q() == 0 || j0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (j0Var.a() - Math.max(com.gamericefishpro.space.r5.b0.A(view), com.gamericefishpro.space.r5.b0.A(view2))) - 1) : Math.max(0, Math.min(com.gamericefishpro.space.r5.b0.A(view), com.gamericefishpro.space.r5.b0.A(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(bVar.c(view2) - bVar.f(view)) / (Math.abs(com.gamericefishpro.space.r5.b0.A(view) - com.gamericefishpro.space.r5.b0.A(view2)) + 1))) + (bVar.m() - bVar.f(view)));
        }
        return iMax;
    }

    public static int o(com.gamericefishpro.space.r5.j0 j0Var, com.gamericefishpro.space.f.b bVar, View view, View view2, com.gamericefishpro.space.r5.b0 b0Var, boolean z) {
        if (b0Var.q() == 0 || j0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return j0Var.a();
        }
        return (int) (((bVar.c(view2) - bVar.f(view)) / (Math.abs(com.gamericefishpro.space.r5.b0.A(view) - com.gamericefishpro.space.r5.b0.A(view2)) + 1)) * j0Var.a());
    }

    public static com.gamericefishpro.space.bb.b p(String str, String str2) {
        com.gamericefishpro.space.vb.a aVar = new com.gamericefishpro.space.vb.a(str, str2);
        com.gamericefishpro.space.bb.a aVarB = com.gamericefishpro.space.bb.b.b(com.gamericefishpro.space.vb.a.class);
        aVarB.b = 1;
        aVarB.g = new com.gamericefishpro.space.a8.b(1, aVar);
        return aVarB.c();
    }

    public static final o q(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new o(exception);
    }

    public static void r(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void s(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static final ArrayList t(com.gamericefishpro.space.g1.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = aVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            com.gamericefishpro.space.g1.c cVar = (com.gamericefishpro.space.g1.c) list.get(i);
            int i3 = cVar.a;
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                }
                if (i3 == iArr[i4]) {
                    break;
                }
                i4++;
            }
            if (!(i4 >= 0)) {
                if (cVar.a == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((com.gamericefishpro.space.g1.c) list.get(i5)).a == 1000) {
                        break;
                    }
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(x.e(arrayList));
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static com.gamericefishpro.space.bb.b u(String str, com.gamericefishpro.space.tb.j jVar) {
        com.gamericefishpro.space.bb.a aVarB = com.gamericefishpro.space.bb.b.b(com.gamericefishpro.space.vb.a.class);
        aVarB.b = 1;
        aVarB.a(com.gamericefishpro.space.bb.l.a(Context.class));
        aVarB.g = new w0(6, str, jVar);
        return aVarB.c();
    }

    public static final long v(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final com.gamericefishpro.space.u1.f y() {
        com.gamericefishpro.space.u1.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        m0 m0Var = new m0(s.b);
        u uVar = new u(1);
        uVar.B(12.0f, 2.0f);
        uVar.t(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        uVar.E(4.48f, 10.0f, 10.0f, 10.0f);
        uVar.E(10.0f, -4.48f, 10.0f, -10.0f);
        uVar.D(17.52f, 2.0f, 12.0f, 2.0f);
        uVar.s();
        uVar.B(13.0f, 17.0f);
        uVar.y(-2.0f);
        uVar.G(-6.0f);
        uVar.y(2.0f);
        uVar.G(6.0f);
        uVar.s();
        uVar.B(13.0f, 9.0f);
        uVar.y(-2.0f);
        uVar.z(11.0f, 7.0f);
        uVar.y(2.0f);
        uVar.G(2.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        com.gamericefishpro.space.u1.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public abstract int A();

    public abstract int B(View view);

    public abstract int C(CoordinatorLayout coordinatorLayout);

    public abstract int E();

    public abstract boolean G(float f);

    public abstract boolean I(View view);

    public abstract boolean J(float f, float f2);

    public abstract boolean O(View view, float f);

    public abstract void S(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float i(int i);

    public abstract int w();

    public abstract int x();

    public abstract int z();
}
