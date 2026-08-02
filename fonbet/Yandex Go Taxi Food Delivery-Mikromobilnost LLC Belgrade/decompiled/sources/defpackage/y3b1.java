package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class y3b1 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final f530 f530Var, final long j, float f, float f2, float f3, long j2, final a aVar, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        float f4;
        int i5;
        Throwable th;
        long j3;
        final float f5;
        final long j4;
        final float f6;
        final float f7;
        aii0 v;
        long j5;
        float f8;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2089424475);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.d(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(null) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.b(f) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                f4 = f2;
                i3 |= btsVar.b(f4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    i3 |= btsVar.b(f3) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        th = null;
                        j3 = j2;
                        i3 |= ((i2 & 64) == 0 && btsVar.d(j3)) ? 1048576 : 524288;
                    } else {
                        th = null;
                        j3 = j2;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= btsVar.e(aVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                    if (btsVar.V(i3 & 1, (4793491 & i3) == 4793490)) {
                        btsVar.Y();
                        f5 = f;
                        j4 = j3;
                        f6 = f4;
                        f7 = f3;
                    } else {
                        btsVar.a0();
                        if ((i & 1) == 0 || btsVar.C()) {
                            f5 = i6 != 0 ? 19.0f : f;
                            f6 = i4 != 0 ? 6.0f : f4;
                            float f9 = i5 != 0 ? 8.0f : f3;
                            if ((i2 & 64) != 0) {
                                j3 = n0u.a;
                                i3 &= -3670017;
                            }
                            j5 = j3;
                            f8 = f9;
                            z = false;
                        } else {
                            btsVar.Y();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            f5 = f;
                            j5 = j3;
                            f6 = f4;
                            z = false;
                            f8 = f3;
                        }
                        btsVar.u();
                        byk0 byk0Var = cyk0.a;
                        f530 m = an91.m(ljs0.e(m4m0.b(ibb1.c(f530Var, f8, byk0Var, 0L, j5, 8), j, byk0Var).k(c530.a), f5), f6, 0.0f, 2);
                        int i7 = ((i3 >> 12) & 7168) | 48;
                        z910 d = pi6.d(x4c.y, z);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d2 = b.d(btsVar, m);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (btsVar.a == null) {
                            cma1.b0();
                            throw th;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, d.f, d);
                        qje.W(btsVar, d.e, o);
                        wls wlsVar = d.g;
                        if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar, hashCode, wlsVar);
                        }
                        qje.W(btsVar, d.d, d2);
                        aVar.invoke(cj6.a, btsVar, Integer.valueOf(((i7 >> 6) & 112) | 6));
                        btsVar.t(true);
                        f7 = f8;
                        j4 = j5;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: tk4
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                y3b1.a(f530.this, j, f5, f6, f7, j4, aVar, (fid) obj, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (btsVar.V(i3 & 1, (4793491 & i3) == 4793490)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            f4 = f2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (btsVar.V(i3 & 1, (4793491 & i3) == 4793490)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f4 = f2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(final String str, final f530 f530Var, long j, long j2, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        final long j3;
        final long j4;
        int i3;
        long n;
        long c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-862485748);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= 1024;
        }
        int i4 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i5 = 1;
        if (btsVar2.V(i4 & 1, (i4 & 9363) != 9362)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                a7u0 a7u0Var = gl51.a;
                i3 = i4 & (-8065);
                n = ((el51) btsVar2.m(a7u0Var)).n();
                c = ((el51) btsVar2.m(a7u0Var)).c();
            } else {
                btsVar2.Y();
                c = j2;
                i3 = i4 & (-8065);
                n = j;
            }
            btsVar2.u();
            btsVar = btsVar2;
            a(f530Var, c, 22.0f, 6.0f, 0.0f, 0L, wwg.S(-2119800730, true, new rk4(str, n, i5), btsVar2), btsVar, ((i3 >> 3) & 14) | 12610560 | ((i3 >> 6) & 896), 96);
            j3 = n;
            j4 = c;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            j3 = j;
            j4 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: uk4
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y3b1.b(str, f530Var, j3, j4, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, f530 f530Var, final long j, final long j2, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        bts btsVar;
        final f530 f530Var3;
        aii0 v;
        f530 f530Var4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1795840085);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar2.d(j) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar2.d(j2) ? 2048 : 1024;
            }
            i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            int i6 = 0;
            if (btsVar2.V(i4 & 1, (i4 & 9363) == 9362)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                btsVar2.a0();
                if ((i & 1) == 0 || btsVar2.C()) {
                    f530Var4 = i5 != 0 ? c530.a : f530Var2;
                } else {
                    btsVar2.Y();
                    f530Var4 = f530Var2;
                }
                btsVar2.u();
                int i7 = ((i4 >> 3) & 14) | 12610560;
                int i8 = i4 >> 6;
                btsVar = btsVar2;
                a(f530Var4, j2, 19.0f, 6.0f, 0.0f, 0L, wwg.S(1241812229, true, new rk4(str, j, i6), btsVar2), btsVar, i7 | (i8 & 112) | (i8 & 896), 96);
                f530Var3 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: sk4
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y3b1.c(str, f530Var3, j, j2, (fid) obj, vng.O(i | 1), i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i62 = 0;
        if (btsVar2.V(i4 & 1, (i4 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(String str, f530 f530Var, long j, long j2, fid fidVar, int i) {
        f530 f530Var2;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1193968485);
        int i2 = 2;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | 48 | (btsVar.d(j) ? 256 : 128) | (btsVar.d(j2) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = c530.a;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
            }
            btsVar.u();
            f530 f530Var4 = f530Var3;
            a(f530Var4, j2, 16.0f, 4.0f, 0.0f, 0L, wwg.S(-63346497, true, new rk4(str, j, i2), btsVar), btsVar, ((i3 >> 6) & 112) | 12610950, 96);
            f530Var2 = f530Var4;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vk4(str, f530Var2, j, j2, i);
        }
    }

    public static final e1f0 e(Integer num) {
        return new e1f0(num.doubleValue());
    }

    public static Drawable f(Context context, int i, int i2) {
        Drawable t = vng.t(i, context);
        if (t == null) {
            return null;
        }
        Drawable mutate = t.mutate();
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }

    public static void g(TextView textView, int i) {
        Drawable mutate;
        Drawable t = vng.t(i, textView.getContext());
        if (t == null) {
            mutate = null;
        } else {
            mutate = t.mutate();
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        }
        if (mutate != null) {
            textView.setCompoundDrawablesRelative(mutate, null, null, null);
        }
    }

    public static void h(int i, int i2, TextView textView) {
        Drawable f = f(textView.getContext(), i, fxa1.c(i2, textView.getContext()).data);
        if (f != null) {
            textView.setCompoundDrawablesRelative(f, null, null, null);
        }
    }
}
