package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public abstract class qti {
    public static final el51 a = gl51.b();
    public static final el51 b = gl51.a();
    public static final zm51 c = new zm51();
    public static final YandexShapes d = new YandexShapes(0, 0, 15);
    public static final qwd e = new qwd(new dii(13));

    public static final void a(hwy0 hwy0Var, a aVar, fid fidVar, int i) {
        a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-777257499);
        int i2 = (btsVar.e(hwy0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            aVar2 = aVar;
            c(hwy0Var.c(btsVar), hwy0Var.a, false, aVar2, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
        } else {
            aVar2 = aVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(hwy0Var, aVar2, i, 12);
        }
    }

    public static final void b(hwy0 hwy0Var, ThemeStyle themeStyle, a aVar, fid fidVar, int i) {
        el51 el51Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-964165053);
        int i2 = (btsVar.e(hwy0Var) ? 4 : 2) | i | (btsVar.c(themeStyle.ordinal()) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = pti.a[themeStyle.ordinal()];
            if (i3 == 1) {
                btsVar.e0(1150326863);
                el51Var = (el51) f.a(hwy0Var.d, hwy0Var.b(btsVar), null, btsVar, 0, 2).getValue();
                btsVar.t(false);
            } else {
                if (i3 != 2) {
                    throw unr0.y(1150325013, btsVar, false);
                }
                btsVar.e0(1150328816);
                el51Var = hwy0Var.c(btsVar);
                btsVar.t(false);
            }
            c(el51Var, hwy0Var.a, false, aVar, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(hwy0Var, themeStyle, aVar, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(el51 el51Var, YandexShapes yandexShapes, boolean z, a aVar, fid fidVar, int i, int i2) {
        el51 el51Var2;
        int i3;
        YandexShapes yandexShapes2;
        boolean z2;
        el51 el51Var3;
        YandexShapes yandexShapes3;
        boolean z3;
        aii0 v;
        el51 el51Var4;
        YandexShapes yandexShapes4;
        boolean booleanValue;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(996036725);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            el51Var2 = el51Var;
        } else if ((i & 6) == 0) {
            el51Var2 = el51Var;
            i3 = (btsVar.k(el51Var2) ? 4 : 2) | i;
        } else {
            el51Var2 = el51Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yandexShapes2 = yandexShapes;
            i3 |= btsVar.k(yandexShapes2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    z2 = z;
                    if (btsVar.a(z2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    z2 = z;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                z2 = z;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(aVar) ? 2048 : 1024;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                el51Var3 = el51Var2;
                yandexShapes3 = yandexShapes2;
                z3 = z2;
            } else {
                btsVar.a0();
                int i7 = i & 1;
                qwd qwdVar = e;
                if (i7 == 0 || btsVar.C()) {
                    el51 el51Var5 = i5 != 0 ? null : el51Var2;
                    YandexShapes yandexShapes5 = i6 != 0 ? d : yandexShapes2;
                    if ((i2 & 4) != 0) {
                        el51Var4 = el51Var5;
                        yandexShapes4 = yandexShapes5;
                        booleanValue = ((Boolean) btsVar.m(qwdVar)).booleanValue();
                        btsVar.u();
                        sb2.b(qwdVar.a(Boolean.valueOf(booleanValue)), wwg.S(702653365, true, new r2z0(el51Var4, booleanValue, yandexShapes4, aVar, 6), btsVar), btsVar, 56);
                        el51Var3 = el51Var4;
                        z3 = booleanValue;
                        yandexShapes3 = yandexShapes4;
                    } else {
                        el51Var4 = el51Var5;
                        yandexShapes4 = yandexShapes5;
                    }
                } else {
                    btsVar.Y();
                    el51Var4 = el51Var2;
                    yandexShapes4 = yandexShapes2;
                }
                booleanValue = z2;
                btsVar.u();
                sb2.b(qwdVar.a(Boolean.valueOf(booleanValue)), wwg.S(702653365, true, new r2z0(el51Var4, booleanValue, yandexShapes4, aVar, 6), btsVar), btsVar, 56);
                el51Var3 = el51Var4;
                z3 = booleanValue;
                yandexShapes3 = yandexShapes4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new fo1(el51Var3, yandexShapes3, z3, aVar, i, i2, 3);
                return;
            }
            return;
        }
        yandexShapes2 = yandexShapes;
        if ((i & 384) != 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
