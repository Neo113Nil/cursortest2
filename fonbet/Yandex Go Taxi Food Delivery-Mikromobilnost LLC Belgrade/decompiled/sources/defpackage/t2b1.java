package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.scooters.newbie.e;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoFundSettings;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupAgreement;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentInfo;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentParty;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentPartyType;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentSettings;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentSettingsType;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentStatus;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSbpParty;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.UpToBalanceSettings;
import java.math.BigDecimal;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class t2b1 {
    public static final void a(f2o0 f2o0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-345748606);
        int i2 = (btsVar.k(f2o0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(i9a1.d(ljs0.c(c530Var, 1.0f)), 8.0f);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i4 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            c(f2o0Var, tlsVar, btsVar, i4);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            b(f2o0Var, tlsVar, btsVar, i4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b2o0(f2o0Var, tlsVar, i, i3);
        }
    }

    public static final void b(f2o0 f2o0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(88912254);
        int i2 = 2;
        int i3 = (btsVar.k(f2o0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new wzl0(26, tlsVar);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(-788094851, true, new c2o0(f2o0Var, i2), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b2o0(f2o0Var, tlsVar, i, i4);
        }
    }

    public static final void c(f2o0 f2o0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1408848071);
        int i2 = 2;
        int i3 = (btsVar.k(f2o0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new wzl0(25, tlsVar);
                btsVar.o0(Q);
            }
            xlb1.a((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(-1300146488, true, new c2o0(f2o0Var, i4), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b2o0(f2o0Var, tlsVar, i, i2);
        }
    }

    public static final void d(f2o0 f2o0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1585850572);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f2o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new e(tlsVar, f2o0Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(f2o0Var, tlsVar, i, 5);
        }
    }

    public static final void e(f2o0 f2o0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1670124243);
        int i3 = (btsVar.k(f2o0Var) ? 4 : 2) | i;
        if (!btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            i2 = 0;
            btsVar.Y();
        } else if (f2o0Var.c.length() > 0) {
            btsVar.e0(1770259661);
            i2 = 0;
            qgy.b(f2o0Var.c, null, an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(false);
        } else {
            i2 = 0;
            btsVar.e0(1770388559);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a2o0(f2o0Var, i, i2);
        }
    }

    public static final void f(f2o0 f2o0Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(159056247);
        int i2 = (btsVar2.k(f2o0Var) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            qgy.b(f2o0Var.b, null, an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.b(btsVar).d, null, btsVar, 384, 0, 12154);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a2o0(f2o0Var, i, 1);
        }
    }

    public static final void g(f2o0 f2o0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-951816639);
        int i2 = 2;
        int i3 = (btsVar.k(f2o0Var) ? 4 : 2) | i;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            x2b1.a(wwg.S(937704199, true, new c2o0(f2o0Var, i4), btsVar), btsVar, 54);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a2o0(f2o0Var, i, i2);
        }
    }

    public static void h(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        int i6;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = iArr2[i8];
            iArr4[i9] = iArr4[i9] + 1;
        }
        iArr5[1] = 0;
        int i10 = 1;
        while (i10 < 15) {
            int i11 = i10 + 1;
            iArr5[i11] = iArr5[i10] + iArr4[i10];
            i10 = i11;
        }
        for (int i12 = 0; i12 < i3; i12++) {
            int i13 = iArr2[i12];
            if (i13 != 0) {
                int i14 = iArr5[i13];
                iArr5[i13] = i14 + 1;
                iArr3[i14] = i12;
            }
        }
        int i15 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i + i16] = iArr3[0];
            }
            return;
        }
        int i17 = 2;
        int i18 = 2;
        int i19 = 0;
        int i20 = 1;
        while (i20 <= i2) {
            while (iArr4[i20] > 0) {
                int i21 = i + i7;
                int i22 = i19 + 1;
                int i23 = (i20 << 16) | iArr3[i19];
                int i24 = i15;
                do {
                    i24 -= i18;
                    iArr[i21 + i24] = i23;
                } while (i24 > 0);
                int i25 = 1 << (i20 - 1);
                while ((i7 & i25) != 0) {
                    i25 >>= 1;
                }
                i7 = (i7 & (i25 - 1)) + i25;
                iArr4[i20] = iArr4[i20] - 1;
                i19 = i22;
            }
            i20++;
            i18 <<= 1;
        }
        int i26 = i15 - 1;
        int i27 = i2 + 1;
        int i28 = -1;
        int i29 = i;
        while (i27 <= 15) {
            while (iArr4[i27] > 0) {
                int i30 = i7 & i26;
                if (i30 != i28) {
                    int i31 = i29 + i15;
                    int i32 = 1 << (i27 - i2);
                    int i33 = i27;
                    while (i33 < 15) {
                        int i34 = i32 - iArr4[i33];
                        if (i34 <= 0) {
                            break;
                        }
                        i33++;
                        i32 = i34 << 1;
                    }
                    int i35 = i33 - i2;
                    iArr[i + i30] = ((i35 + i2) << 16) | ((i31 - i) - i30);
                    i4 = i30;
                    i6 = i31;
                    i5 = 1 << i35;
                } else {
                    i4 = i28;
                    i5 = i15;
                    i6 = i29;
                }
                int i36 = i6 + (i7 >> i2);
                int i37 = i19 + 1;
                int i38 = ((i27 - i2) << 16) | iArr3[i19];
                int i39 = i5;
                do {
                    i39 -= i17;
                    iArr[i36 + i39] = i38;
                } while (i39 > 0);
                int i40 = 1 << (i27 - 1);
                while ((i7 & i40) != 0) {
                    i40 >>= 1;
                }
                i7 = (i7 & (i40 - 1)) + i40;
                iArr4[i27] = iArr4[i27] - 1;
                i15 = i5;
                i29 = i6;
                i28 = i4;
                i19 = i37;
            }
            i27++;
            i17 <<= 1;
        }
    }

    public static final AutoTopupPaymentInfo i(r24 r24Var) {
        MoneyEntity moneyEntity;
        AutoTopupPaymentStatus k = k(r24Var != null ? r24Var.a : null);
        AutoTopupPaymentSettingsType autoTopupPaymentSettingsType = AutoTopupPaymentSettingsType.AUTOFUND;
        BigDecimal amount = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getAmount();
        if (amount == null) {
            amount = BigDecimal.ZERO;
        }
        return new AutoTopupPaymentInfo(k, new AutoTopupPaymentSettings(autoTopupPaymentSettingsType, null, new AutoFundSettings(new Money(amount, null, 2, null))));
    }

    public static final AutoTopupPaymentInfo j(s24 s24Var) {
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        AutoTopupPaymentStatus k = k(s24Var != null ? s24Var.a : null);
        AutoTopupPaymentSettingsType autoTopupPaymentSettingsType = AutoTopupPaymentSettingsType.UP_TO_BALANCE;
        BigDecimal amount = (s24Var == null || (moneyEntity2 = s24Var.c) == null) ? null : moneyEntity2.getAmount();
        if (amount == null) {
            amount = BigDecimal.ZERO;
        }
        Money money = new Money(amount, null, 2, null);
        BigDecimal amount2 = (s24Var == null || (moneyEntity = s24Var.d) == null) ? null : moneyEntity.getAmount();
        if (amount2 == null) {
            amount2 = BigDecimal.ZERO;
        }
        return new AutoTopupPaymentInfo(k, new AutoTopupPaymentSettings(autoTopupPaymentSettingsType, new UpToBalanceSettings(money, new Money(amount2, null, 2, null)), null));
    }

    public static final AutoTopupPaymentStatus k(SettingStatus settingStatus) {
        int i = settingStatus == null ? -1 : q24.a[settingStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return AutoTopupPaymentStatus.ENABLED;
            }
            if (i != 2) {
                w511.b();
                return null;
            }
        }
        return AutoTopupPaymentStatus.DISABLED;
    }

    public static final AutoTopupPaymentParty l(n1a0 n1a0Var) {
        AutoTopupPaymentPartyType autoTopupPaymentPartyType;
        AutoTopupSbpParty autoTopupSbpParty;
        boolean z = n1a0Var instanceof i1a0;
        AutoTopupAgreement autoTopupAgreement = null;
        if (z) {
            autoTopupPaymentPartyType = AutoTopupPaymentPartyType.AGREEMENT;
        } else {
            if (!(n1a0Var instanceof l1a0)) {
                w511.b();
                return null;
            }
            autoTopupPaymentPartyType = AutoTopupPaymentPartyType.SBP_PARTY;
        }
        boolean z2 = n1a0Var instanceof l1a0;
        if (z2) {
            autoTopupSbpParty = new AutoTopupSbpParty(((l1a0) n1a0Var).a, null);
        } else {
            if (!z) {
                w511.b();
                return null;
            }
            autoTopupSbpParty = null;
        }
        if (z) {
            autoTopupAgreement = new AutoTopupAgreement(((i1a0) n1a0Var).a);
        } else if (!z2) {
            w511.b();
            return null;
        }
        return new AutoTopupPaymentParty(autoTopupPaymentPartyType, autoTopupSbpParty, autoTopupAgreement);
    }
}
