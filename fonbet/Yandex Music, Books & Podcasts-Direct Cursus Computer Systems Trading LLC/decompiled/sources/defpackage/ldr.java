package defpackage;

import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ldr {
    public static final oct a;

    static {
        g5r g5rVar = new g5r(18);
        g5r g5rVar2 = new g5r(19);
        oct octVar = azt.a;
        a = new oct(g5rVar, g5rVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final Locale locale, yci yciVar, String str, um0 um0Var, final d85 d85Var, int i, int i2, final ges gesVar, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        yci yciVar2;
        int i6;
        String str2;
        int i7;
        int i8;
        String str3;
        yci yciVar3;
        int i9;
        Object K;
        Object obj;
        int i10;
        fk0 fk0Var;
        boolean h;
        Object K2;
        fk0 fk0Var2;
        int i11;
        int i12;
        long j2;
        oq5 oq5Var;
        final yci yciVar4;
        final int i13;
        final int i14;
        final String str4;
        xmn r;
        final um0 um0Var2 = um0Var;
        locale.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(92631409);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var2.e(j) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var2.h(locale) ? 32 : 16;
        }
        int i15 = i4 & 4;
        if (i15 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var2.f(yciVar2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                str2 = str;
                i5 |= oq5Var2.f(str2) ? 2048 : 1024;
                if ((i3 & 24576) == 0) {
                    i5 |= oq5Var2.d(um0Var2 == null ? -1 : um0Var2.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if ((196608 & i3) == 0) {
                    i5 |= oq5Var2.f(d85Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                int i16 = i5 | 14155776;
                if ((100663296 & i3) == 0) {
                    i16 |= oq5Var2.f(gesVar) ? 67108864 : 33554432;
                }
                i7 = i16;
                if ((38347923 & i7) == 38347922 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i3 & 1) != 0 || oq5Var2.y()) {
                        if (i15 != 0) {
                            yciVar2 = vci.a;
                        }
                        if (i6 != 0) {
                            str2 = null;
                        }
                        i8 = 1500;
                        str3 = str2;
                        yciVar3 = yciVar2;
                        i9 = 100;
                    } else {
                        oq5Var2.S();
                        i8 = i2;
                        str3 = str2;
                        yciVar3 = yciVar2;
                        i9 = i;
                    }
                    oq5Var2.q();
                    K = oq5Var2.K();
                    obj = gq5.a;
                    if (K == obj) {
                        i10 = i8;
                        K = new fk0(Long.valueOf(um0Var2 == um0.a ? j : 0L), a, null, 12);
                        oq5Var2.k0(K);
                    } else {
                        i10 = i8;
                    }
                    fk0Var = (fk0) K;
                    h = ((57344 & i7) == 16384) | oq5Var2.h(fk0Var) | ((i7 & 14) == 4) | ((i7 & 3670016) == 1048576) | ((29360128 & i7) == 8388608);
                    K2 = oq5Var2.K();
                    if (!h || K2 == obj) {
                        int i17 = i10;
                        Object kdrVar = new kdr(um0Var2, fk0Var, j, i9, i17, null);
                        um0Var2 = um0Var2;
                        fk0Var2 = fk0Var;
                        i11 = i17;
                        oq5Var2.k0(kdrVar);
                        K2 = kdrVar;
                    } else {
                        fk0Var2 = fk0Var;
                        i11 = i10;
                    }
                    gld.w(oq5Var2, um0Var2, (Function2) K2);
                    int i18 = i7 >> 6;
                    nho a2 = lho.a(qx0.e, b2c.k, oq5Var2, 6);
                    i12 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, yciVar3);
                    xp5.T.getClass();
                    Function0 function0 = wp5.b;
                    oq5Var2.d0();
                    fk0 fk0Var3 = fk0Var2;
                    if (oq5Var2.O) {
                        oq5Var2.k(function0);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a2, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i12))) {
                        ouj.x(i12, oq5Var2, i12, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    String format = NumberFormat.getNumberInstance(locale).format(((Number) fk0Var3.e()).longValue());
                    format.getClass();
                    String concat = format.concat(str3 == null ? "" : str3);
                    if (d85Var == null) {
                        oq5Var2.Z(-111997580);
                        j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(-111998603);
                        oq5Var2.p(false);
                        j2 = d85Var.a;
                    }
                    xcs.b(concat, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar, oq5Var2, 0, i18 & 3670016, 65530);
                    oq5Var = oq5Var2;
                    oq5Var.p(true);
                    yciVar4 = yciVar3;
                    i13 = i11;
                    i14 = i9;
                    str4 = str3;
                } else {
                    oq5Var2.S();
                    i14 = i;
                    yciVar4 = yciVar2;
                    oq5Var = oq5Var2;
                    str4 = str2;
                    i13 = i2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Function2() { // from class: jdr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ldr.a(j, locale, yciVar4, str4, um0Var2, d85Var, i14, i13, gesVar, (hq5) obj2, rvf.R(i3 | 1), i4);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            str2 = str;
            if ((i3 & 24576) == 0) {
            }
            if ((196608 & i3) == 0) {
            }
            int i162 = i5 | 14155776;
            if ((100663296 & i3) == 0) {
            }
            i7 = i162;
            if ((38347923 & i7) == 38347922) {
            }
            oq5Var2.U();
            if ((i3 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            i8 = 1500;
            str3 = str2;
            yciVar3 = yciVar2;
            i9 = 100;
            oq5Var2.q();
            K = oq5Var2.K();
            obj = gq5.a;
            if (K == obj) {
            }
            fk0Var = (fk0) K;
            h = ((57344 & i7) == 16384) | oq5Var2.h(fk0Var) | ((i7 & 14) == 4) | ((i7 & 3670016) == 1048576) | ((29360128 & i7) == 8388608);
            K2 = oq5Var2.K();
            if (h) {
            }
            int i172 = i10;
            Object kdrVar2 = new kdr(um0Var2, fk0Var, j, i9, i172, null);
            um0Var2 = um0Var2;
            fk0Var2 = fk0Var;
            i11 = i172;
            oq5Var2.k0(kdrVar2);
            K2 = kdrVar2;
            gld.w(oq5Var2, um0Var2, (Function2) K2);
            int i182 = i7 >> 6;
            nho a22 = lho.a(qx0.e, b2c.k, oq5Var2, 6);
            i12 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, yciVar3);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var2.d0();
            fk0 fk0Var32 = fk0Var2;
            if (oq5Var2.O) {
            }
            g0g.U(oq5Var2, a22, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var2.O) {
            }
            ouj.x(i12, oq5Var2, i12, kb5Var2);
            g0g.U(oq5Var2, H2, wp5.d);
            String format2 = NumberFormat.getNumberInstance(locale).format(((Number) fk0Var32.e()).longValue());
            format2.getClass();
            String concat2 = format2.concat(str3 == null ? "" : str3);
            if (d85Var == null) {
            }
            xcs.b(concat2, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar, oq5Var2, 0, i182 & 3670016, 65530);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            yciVar4 = yciVar3;
            i13 = i11;
            i14 = i9;
            str4 = str3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i3 & 24576) == 0) {
        }
        if ((196608 & i3) == 0) {
        }
        int i1622 = i5 | 14155776;
        if ((100663296 & i3) == 0) {
        }
        i7 = i1622;
        if ((38347923 & i7) == 38347922) {
        }
        oq5Var2.U();
        if ((i3 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        i8 = 1500;
        str3 = str2;
        yciVar3 = yciVar2;
        i9 = 100;
        oq5Var2.q();
        K = oq5Var2.K();
        obj = gq5.a;
        if (K == obj) {
        }
        fk0Var = (fk0) K;
        h = ((57344 & i7) == 16384) | oq5Var2.h(fk0Var) | ((i7 & 14) == 4) | ((i7 & 3670016) == 1048576) | ((29360128 & i7) == 8388608);
        K2 = oq5Var2.K();
        if (h) {
        }
        int i1722 = i10;
        Object kdrVar22 = new kdr(um0Var2, fk0Var, j, i9, i1722, null);
        um0Var2 = um0Var2;
        fk0Var2 = fk0Var;
        i11 = i1722;
        oq5Var2.k0(kdrVar22);
        K2 = kdrVar22;
        gld.w(oq5Var2, um0Var2, (Function2) K2);
        int i1822 = i7 >> 6;
        nho a222 = lho.a(qx0.e, b2c.k, oq5Var2, 6);
        i12 = oq5Var2.P;
        a l22 = oq5Var2.l();
        yci H22 = vnj.H(oq5Var2, yciVar3);
        xp5.T.getClass();
        Function0 function022 = wp5.b;
        oq5Var2.d0();
        fk0 fk0Var322 = fk0Var2;
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, a222, wp5.f);
        g0g.U(oq5Var2, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var2.O) {
        }
        ouj.x(i12, oq5Var2, i12, kb5Var22);
        g0g.U(oq5Var2, H22, wp5.d);
        String format22 = NumberFormat.getNumberInstance(locale).format(((Number) fk0Var322.e()).longValue());
        format22.getClass();
        String concat22 = format22.concat(str3 == null ? "" : str3);
        if (d85Var == null) {
        }
        xcs.b(concat22, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar, oq5Var2, 0, i1822 & 3670016, 65530);
        oq5Var = oq5Var2;
        oq5Var.p(true);
        yciVar4 = yciVar3;
        i13 = i11;
        i14 = i9;
        str4 = str3;
        r = oq5Var.r();
        if (r != null) {
        }
    }
}
