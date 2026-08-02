package defpackage;

import androidx.compose.foundation.text.selection.Direction;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class z8b1 {
    public static final void a(final ibp0 ibp0Var, final CharSequence charSequence, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(86933002);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 32 : 16;
        }
        final int i3 = 1;
        if (!btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            btsVar.Y();
        } else {
            if (charSequence == null) {
                btsVar2.e0(-44133483);
                pi6.a(ljs0.b(c530.a, 20.0f, 0.0f, 2), btsVar2, 6);
                btsVar2.t(false);
                aii0 v = btsVar2.v();
                if (v != null) {
                    v.d = new wls() { // from class: zpw
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            CharSequence charSequence2 = charSequence;
                            ibp0 ibp0Var2 = ibp0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    z8b1.a(ibp0Var2, charSequence2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    z8b1.a(ibp0Var2, charSequence2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar2.e0(-44069096);
            btsVar2.t(false);
            to5 to5Var = x4c.E;
            ibp0Var.getClass();
            btsVar = btsVar2;
            qgy.b(charSequence, null, ljs0.b(an91.m(new pa31(to5Var), 0.0f, 2.0f, 1), 20.0f, 0.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar2).h.b, null, btsVar, ((i2 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 12146);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i4 = 0;
            v2.d = new wls() { // from class: zpw
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    CharSequence charSequence2 = charSequence;
                    ibp0 ibp0Var2 = ibp0Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i42) {
                        case 0:
                            z8b1.a(ibp0Var2, charSequence2, fidVar2, vng.O(i5 | 1));
                            break;
                        default:
                            z8b1.a(ibp0Var2, charSequence2, fidVar2, vng.O(i5 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void b(q611 q611Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-592412455);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(q611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-538651342);
            d(q611Var, f530Var, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(-538590830);
            c(q611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(q611Var, f530Var, z, i, 6);
        }
    }

    public static final void c(q611 q611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(539580312);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(q611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(q611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ypw(q611Var, 1);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(c, (tls) Q), wwg.S(43614766, true, new aqw(q611Var, i4), btsVar), wwg.S(-910888599, true, new aqw(q611Var, i3), btsVar), null, wwg.S(1064647715, true, new aqw(q611Var, 3), btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(q611Var, f530Var, i);
        }
    }

    public static final void d(q611 q611Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(61493265);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(q611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.d(btsVar).f.c;
            } else {
                btsVar.Y();
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            String str = q611Var.c;
            boolean e = btsVar.e(q611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ypw(q611Var, 0);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(f530Var, (tls) Q);
            SlotSize slotSize = SlotSize.XS;
            a5l0.d(str, a, slotSize.getSize(), slotSize.getSize(), x4c.x, 0.0f, ety0Var3, new y7m(0.0f), wwg.S(-1343854121, true, new aqw(q611Var, i3), btsVar), wwg.S(-1843177471, true, new s0v(5, q611Var, ety0Var3), btsVar), btsVar, 918577152, 32);
            ety0Var2 = ety0Var3;
        } else {
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) q611Var, f530Var, (Object) ety0Var2, i, 23);
        }
    }

    public static final Direction e(Direction direction, Direction direction2) {
        int[] iArr = ukq0.a;
        int i = iArr[direction2.ordinal()];
        if (i == 1) {
            return Direction.BEFORE;
        }
        if (i != 2) {
            if (i == 3) {
                return Direction.AFTER;
            }
            w511.b();
            return null;
        }
        int i2 = iArr[direction.ordinal()];
        if (i2 == 1) {
            return Direction.BEFORE;
        }
        if (i2 == 2) {
            return Direction.ON;
        }
        if (i2 == 3) {
            return Direction.AFTER;
        }
        w511.b();
        return null;
    }

    public static final n26 f(e210 e210Var) {
        b210 b210Var = e210Var.a;
        String str = b210Var.a;
        String str2 = b210Var.b;
        boolean z = b210Var.c;
        c210 c210Var = b210Var.d;
        o26 o26Var = new o26(str, str2, z, c210Var != null ? new q26(c210Var.a, c210Var.b, false) : new q26(3));
        a210 a210Var = e210Var.b;
        String str3 = a210Var.a;
        boolean z2 = str3 == null || evu0.J(str3);
        d210 d210Var = a210Var.b;
        return new n26(new r26(o26Var, new k26(str3, z2, null, null, null, d210Var != null ? new u26(true, d210Var.a, d210Var.b, d210Var.c, d210Var.d, d210Var.e, d210Var.f) : u26.h)), 3);
    }
}
