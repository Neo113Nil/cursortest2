package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.Inflater;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.model.GroundThreadPriority;

/* loaded from: classes11.dex */
public abstract class vha1 {
    public static final void a(zgi0 zgi0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-941022921);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(zgi0Var) : btsVar.e(zgi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, tnb1.e(null, null, btsVar, 5), null, null, false, false, wwg.S(-942080499, true, new wg0(25, tlsVar), btsVar), wwg.S(324553541, true, new y740(14, zgi0Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(zgi0Var, tlsVar, i, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x003f, code lost:
    
        if (r1 != 1918990112) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(dl81 dl81Var) {
        ArrayList arrayList;
        boolean z;
        Object ts71Var;
        dl81 dl81Var2 = dl81Var;
        ArrayList arrayList2 = null;
        if (dl81Var2.s() == 0) {
            dl81Var2.m(dl81Var2.b + 7);
            int a = dl81Var2.a();
            boolean z2 = true;
            if (a == 1684433976) {
                dl81 dl81Var3 = new dl81();
                Inflater inflater = new Inflater(true);
                try {
                    if (!rf71.p(dl81Var2, dl81Var3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    dl81Var2 = dl81Var3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int i = dl81Var2.b;
            int i2 = dl81Var2.c;
            while (i < i2) {
                int a2 = dl81Var2.a() + i;
                if (a2 > i && a2 <= i2) {
                    if (dl81Var2.a() == 1835365224) {
                        int a3 = dl81Var2.a();
                        if (a3 <= 10000) {
                            float[] fArr = new float[a3];
                            for (int i3 = 0; i3 < a3; i3++) {
                                fArr[i3] = Float.intBitsToFloat(dl81Var2.a());
                            }
                            int a4 = dl81Var2.a();
                            if (a4 <= 32000) {
                                double log = Math.log(2.0d);
                                int ceil = (int) Math.ceil(Math.log(a3 * 2.0d) / log);
                                arrayList = arrayList2;
                                uh81 uh81Var = new uh81(dl81Var2.a);
                                z = z2;
                                uh81Var.f(dl81Var2.b * 8);
                                float[] fArr2 = new float[a4 * 5];
                                int i4 = 5;
                                int[] iArr = new int[5];
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    if (i5 < a4) {
                                        int i7 = 0;
                                        while (i7 < i4) {
                                            int i8 = iArr[i7];
                                            int a5 = uh81Var.a(ceil);
                                            int i9 = ((a5 >> 1) ^ (-(a5 & 1))) + i8;
                                            if (i9 >= a3 || i9 < 0) {
                                                break;
                                            }
                                            fArr2[i6] = fArr[i9];
                                            iArr[i7] = i9;
                                            i7++;
                                            i6++;
                                            i4 = 5;
                                        }
                                        i5++;
                                        i4 = 5;
                                    } else {
                                        uh81Var.f((uh81Var.i() + 7) & (-8));
                                        int i10 = 32;
                                        int a6 = uh81Var.a(32);
                                        ykf0[] ykf0VarArr = new ykf0[a6];
                                        int i11 = 0;
                                        while (i11 < a6) {
                                            int a7 = uh81Var.a(8);
                                            int a8 = uh81Var.a(8);
                                            int a9 = uh81Var.a(i10);
                                            if (a9 <= 128000) {
                                                int i12 = a6;
                                                int ceil2 = (int) Math.ceil(Math.log(a4 * 2.0d) / log);
                                                float[] fArr3 = new float[a9 * 3];
                                                float[] fArr4 = new float[a9 * 2];
                                                int i13 = 0;
                                                int i14 = 0;
                                                while (i13 < a9) {
                                                    int a10 = uh81Var.a(ceil2);
                                                    float[] fArr5 = fArr2;
                                                    int i15 = ((a10 >> 1) ^ (-(a10 & 1))) + i14;
                                                    if (i15 >= 0 && i15 < a4) {
                                                        int i16 = i13 * 3;
                                                        int i17 = i15 * 5;
                                                        fArr3[i16] = fArr5[i17];
                                                        fArr3[i16 + 1] = fArr5[i17 + 1];
                                                        fArr3[i16 + 2] = fArr5[i17 + 2];
                                                        int i18 = i13 * 2;
                                                        fArr4[i18] = fArr5[i17 + 3];
                                                        fArr4[i18 + 1] = fArr5[i17 + 4];
                                                        i13++;
                                                        i14 = i15;
                                                        fArr2 = fArr5;
                                                    }
                                                }
                                                ykf0VarArr[i11] = new ykf0(fArr3, a7, fArr4, a8, 1);
                                                i11++;
                                                a6 = i12;
                                                i10 = 32;
                                            }
                                        }
                                        ts71Var = new ts71(ykf0VarArr);
                                    }
                                }
                                ts71Var = arrayList;
                                if (ts71Var != null) {
                                    return arrayList;
                                }
                                arrayList3.add(ts71Var);
                            }
                        }
                        arrayList = arrayList2;
                        z = z2;
                        ts71Var = arrayList;
                        if (ts71Var != null) {
                        }
                    } else {
                        arrayList = arrayList2;
                        z = z2;
                    }
                    dl81Var2.m(a2);
                    i = a2;
                    arrayList2 = arrayList;
                    z2 = z;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    public static final GroundThreadPriority c(w1u w1uVar, Map map) {
        boolean z = (map != null ? (wy30) map.get(w1uVar.f) : null) != null;
        boolean z2 = w1uVar.i;
        ArrayList arrayList = w1uVar.g;
        if (z2) {
            return GroundThreadPriority.Selected;
        }
        if (z && arrayList.isEmpty()) {
            return GroundThreadPriority.HasScheduleAndNoAlerts;
        }
        if (z && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((rc30) it.next()) instanceof qc30) {
                    return GroundThreadPriority.HasScheduleAndLastTrip;
                }
            }
        }
        if (z) {
            return GroundThreadPriority.HasSchedule;
        }
        if (arrayList.isEmpty()) {
            return GroundThreadPriority.NoAlerts;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((rc30) it2.next()) instanceof qc30) {
                    return GroundThreadPriority.LastTrip;
                }
            }
        }
        return GroundThreadPriority.Other;
    }

    public static final void d(g0c g0cVar, lfx lfxVar) {
        String d = g0cVar.d();
        if (d == null) {
            d = String.valueOf(g0cVar);
        }
        e(d, lfxVar);
        throw null;
    }

    public static final void e(String str, lfx lfxVar) {
        String sb;
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        g0c g0cVar = (g0c) lfxVar;
        sb2.append(g0cVar.d());
        sb2.append('\'');
        String sb3 = sb2.toString();
        if (str == null) {
            sb = unr0.l('.', "Class discriminator was missing and no default serializers were registered ", sb3);
        } else {
            StringBuilder v = b64.v("Serializer for subclass '", str, "' is not found ", sb3, ".\nCheck if class with serial name '");
            g8e.D(v, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            v.append(g0cVar.d());
            v.append("' has to be sealed and '@Serializable'.");
            sb = v.toString();
        }
        throw new SerializationException(sb);
    }
}
