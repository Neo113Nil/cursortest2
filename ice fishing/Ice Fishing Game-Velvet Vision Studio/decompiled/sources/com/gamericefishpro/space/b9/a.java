package com.gamericefishpro.space.b9;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.b1.n;
import com.gamericefishpro.space.c3.j;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.g;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i6.w;
import com.gamericefishpro.space.k0.e;
import com.gamericefishpro.space.l1.h;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.q;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.tb.d;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u1.f;
import com.gamericefishpro.space.ui.p;
import com.gamericefishpro.space.w.j0;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.z4.k;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Context a = null;
    public static Boolean b = null;
    public static boolean c = true;
    public static f d;
    public static f e;
    public static f f;

    public static int A(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int B(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static MappedByteBuffer C(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final j D(com.gamericefishpro.space.n1.c cVar) {
        return new j(Math.round(cVar.a), Math.round(cVar.b), Math.round(cVar.c), Math.round(cVar.d));
    }

    public static int E(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final Object F(p pVar, p pVar2, Function2 function2) {
        Object qVar;
        Object objX;
        try {
            e0.c(2, function2);
            qVar = function2.invoke(pVar2, pVar);
        } catch (Throwable th) {
            qVar = new q(th, false);
        }
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (qVar == aVar || (objX = pVar.X(qVar)) == a0.e) {
            return aVar;
        }
        pVar.m0();
        if (objX instanceof q) {
            throw ((q) objX).a;
        }
        return a0.C(objX);
    }

    public static void G(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            w.m(viewGroup, z);
        } else if (c) {
            try {
                w.m(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }

    public static byte[] H(d dVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = dVar.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return l(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (dVar.read() == -1) {
            return l(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static String I(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(J(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(J(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String J(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strJ = com.gamericefishpro.space.m5.a.j(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strJ.length() + 8 + name2.length() + 1);
            sb.append("<");
            sb.append(strJ);
            sb.append(" threw ");
            sb.append(name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static boolean K(byte b2) {
        return b2 > -65;
    }

    public static final void a(m mVar, r rVar, int i) {
        r rVar2;
        rVar.b0(303456620);
        if ((i & 3) == 2 && rVar.E()) {
            rVar.V();
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            m mVarF = h.f(mVar, ((Number) com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("ice_pulse", rVar), 0.95f, 1.05f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1200, 2, t.a), j0.e), "pulse_scale", rVar, 29112).v.getValue()).floatValue());
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarF, rVar2);
            g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD, com.gamericefishpro.space.h2.f.e);
            i.B(rVar2, l1VarL, com.gamericefishpro.space.h2.f.d);
            i.t(rVar2, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            i.x(rVar2, com.gamericefishpro.space.h2.f.g);
            i.B(rVar2, mVarF2, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(g1.f(com.gamericefishpro.space.h1.j.a, 100), com.gamericefishpro.space.n9.a0.d(14, x.f(new s(s.c(s.c, 0.3f)), new s(s.f))), e.a, 4), rVar2, 0);
            com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.ic_ice, rVar2, 0), "Frozen", g1.c, null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar2, 25016, 104);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new n1(i, 7, mVar);
        }
    }

    public static final void b(final boolean z, final int i, final float f2, r rVar, final int i2) {
        com.gamericefishpro.space.o1.j0 j0Var;
        rVar.b0(-1216526596);
        if (((i2 | (rVar.g(z) ? 4 : 2) | (rVar.c(f2) ? 256 : 128)) & 147) == 146 && rVar.E()) {
            rVar.V();
        } else {
            long jC = com.gamericefishpro.space.hj.c.C(i);
            long jC2 = z ? com.gamericefishpro.space.q7.d.c : s.c(s.c, 0.15f);
            m mVarI = com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.h1.j.a, 0, f2);
            if (z) {
                j0Var = new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.q7.d.d, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 8.0f);
            } else {
                j0Var = null;
            }
            r0.a("★", mVarI, jC2, jC, null, 0L, null, 0L, 0, false, 0, 0, new i0(j0Var, 16769023), rVar, 6, 0, 131048);
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(z, i, f2, i2) { // from class: com.gamericefishpro.space.q7.a
                public final /* synthetic */ boolean d;
                public final /* synthetic */ int e;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = i.D(49);
                    com.gamericefishpro.space.b9.a.b(this.d, this.e, this.i, (r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(Function0 onResume, Function0 onExit, r rVar, int i) {
        Function0 function0;
        r rVar2;
        Intrinsics.checkNotNullParameter(onResume, "onResume");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        rVar.b0(-500563460);
        int i2 = (rVar.h(onResume) ? 4 : 2) | i | (rVar.h(onExit) ? 32 : 16);
        if ((i2 & 19) == 18 && rVar.E()) {
            rVar.V();
            function0 = onResume;
            rVar2 = rVar;
        } else {
            function0 = onResume;
            rVar2 = rVar;
            com.gamericefishpro.space.d9.h.b(function0, null, n.c(-2119049133, new com.gamericefishpro.space.g5.m(3, onExit, onResume), rVar), rVar2, (i2 & 14) | 384, 2);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 9, function0, onExit);
        }
    }

    public static final void d(Function0 onClick, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(593029558);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-1827839001);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarI = com.gamericefishpro.space.y.q.i(g1.f(jVar, 56), iVar, false, onClick, 28);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar4);
            h0 h0Var = g1.c;
            float f2 = 4;
            m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f2, 0.0f, 0.0f, 13);
            long jC = o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            long j = s.c;
            m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f2, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.l7.c.b, dVar2), 2, s.c(j, 0.5f), dVar2);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD2, eVar);
            i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(h.b(h0Var, dVar2), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new s(s.c(j, 0.3f))), new Pair(Float.valueOf(0.5f), new s(s.f))}), null, 6), rVar2, 0);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.x(), "Back", g1.f(jVar, 28), j, rVar2, 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 5);
        }
    }

    public static final boolean e(File srcFile, File dstFile) {
        Intrinsics.checkNotNullParameter(srcFile, "<this>");
        Intrinsics.checkNotNullParameter(dstFile, "toFile");
        Intrinsics.checkNotNullParameter(srcFile, "srcFile");
        Intrinsics.checkNotNullParameter(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean f(int i, Rect rect, Rect rect2, Rect rect3) {
        int iA;
        int i2;
        int i3;
        boolean zG = g(i, rect, rect2);
        if (g(i, rect, rect3) || !zG) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            iA = A(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iA < Math.max(1, i2 - i3)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i != 17) {
                        iA = A(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iA < Math.max(1, i2 - i3)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i != 17) {
                    iA = A(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iA < Math.max(1, i2 - i3)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i != 17) {
                iA = A(i, rect, rect2);
                if (i != 17) {
                    i2 = rect.left;
                    i3 = rect3.left;
                } else if (i != 33) {
                    i2 = rect.top;
                    i3 = rect3.top;
                } else if (i != 66) {
                    i2 = rect3.right;
                    i3 = rect.right;
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = rect3.bottom;
                    i3 = rect.bottom;
                }
                if (iA < Math.max(1, i2 - i3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final void h(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static final void i(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static final void j(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] l(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static boolean m(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zN = n(file, inputStreamOpenRawResource);
                k(inputStreamOpenRawResource);
                return zN;
            } catch (Throwable th) {
                th = th;
                k(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean n(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            k(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final com.gamericefishpro.space.s5.q o(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (StringsKt.u(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new com.gamericefishpro.space.s5.q(context, klass, str);
    }

    public static final com.gamericefishpro.space.c5.c p(com.gamericefishpro.space.z4.y0 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        return viewModelStoreOwner instanceof k ? ((k) viewModelStoreOwner).e() : com.gamericefishpro.space.c5.a.b;
    }

    public static final void q(long j, byte[] dst, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = com.gamericefishpro.space.mi.b.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            dst[i] = (byte) (i6 >> 8);
            i += 2;
            dst[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static int r(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueI = com.gamericefishpro.space.d9.h.I(context, i);
        if (typedValueI != null) {
            int i3 = typedValueI.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueI.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int s(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueJ = com.gamericefishpro.space.d9.h.J(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValueJ.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueJ.data;
    }

    public static final f t() {
        f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        m0 m0Var = new m0(s.b);
        u uVar = new u(1);
        uVar.B(18.0f, 8.0f);
        uVar.y(-1.0f);
        uVar.z(17.0f, 6.0f);
        uVar.u(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        uVar.D(7.0f, 3.24f, 7.0f, 6.0f);
        uVar.G(2.0f);
        uVar.z(6.0f, 8.0f);
        uVar.u(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uVar.G(10.0f);
        uVar.u(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        uVar.y(12.0f);
        uVar.u(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        uVar.z(20.0f, 10.0f);
        uVar.u(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uVar.s();
        uVar.B(12.0f, 17.0f);
        uVar.u(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        uVar.E(0.9f, -2.0f, 2.0f, -2.0f);
        uVar.E(2.0f, 0.9f, 2.0f, 2.0f);
        uVar.E(-0.9f, 2.0f, -2.0f, 2.0f);
        uVar.s();
        uVar.B(15.1f, 8.0f);
        uVar.z(8.9f, 8.0f);
        uVar.z(8.9f, 6.0f);
        uVar.u(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        uVar.u(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        uVar.G(2.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final long u(int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static File v(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static com.gamericefishpro.space.e6.c w(com.gamericefishpro.space.vb.c refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        com.gamericefishpro.space.e6.c cVar = (com.gamericefishpro.space.e6.c) refHolder.e;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.a(cVar.d, sqLiteDatabase)) {
                return cVar;
            }
        }
        com.gamericefishpro.space.e6.c cVar2 = new com.gamericefishpro.space.e6.c(sqLiteDatabase);
        refHolder.e = cVar2;
        return cVar2;
    }

    public static boolean x(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static synchronized boolean y(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static int z(float f2, int i, int i2) {
        return com.gamericefishpro.space.u3.a.b(com.gamericefishpro.space.u3.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }
}
