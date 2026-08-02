package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.go.design.compose.radio.RadioSize;
import com.yandex.messaging.auth.AuthAccountNotAuthorizedException;
import com.yandex.messaging.auth.AuthAccountNotFoundException;
import com.yandex.messaging.auth.AuthException;
import com.yandex.messaging.auth.AuthFailedResponseException;
import com.yandex.messaging.auth.AuthInvalidUrlException;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportInvalidUrlException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wfa1 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z, f530 f530Var, RadioSize radioSize, tls tlsVar, boolean z2, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        tls tlsVar2;
        int i4;
        int i5;
        RadioSize radioSize2;
        tls tlsVar3;
        boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-435391243);
        int i6 = (btsVar.a(z) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i6 | (btsVar.k(f530Var2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(radioSize == null ? -1 : radioSize.ordinal()) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            tlsVar2 = tlsVar;
            i3 |= btsVar.e(tlsVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i5 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            } else {
                i5 = i3 | (btsVar.a(z2) ? 16384 : 8192);
            }
            if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
                btsVar.Y();
                radioSize2 = radioSize;
                tlsVar3 = tlsVar2;
                z3 = z2;
            } else {
                f530 f530Var3 = i7 != 0 ? c530.a : f530Var2;
                RadioSize radioSize3 = i8 != 0 ? RadioSize.M : radioSize;
                tls tlsVar4 = i9 != 0 ? null : tlsVar2;
                boolean z4 = i4 == 0 ? z2 : true;
                boolean k = btsVar.k(sy2.a(btsVar));
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = oih.a;
                    btsVar.o0(Q);
                }
                ((oih) Q).a(z, f530Var3, radioSize3, tlsVar4, z4, btsVar, i5 & 65534);
                f530Var2 = f530Var3;
                radioSize2 = radioSize3;
                tlsVar3 = tlsVar4;
                z3 = z4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new o360(z, f530Var2, radioSize2, tlsVar3, z3, i, i2);
                return;
            }
            return;
        }
        tlsVar2 = tlsVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final ge71 b(Context context, m771 m771Var) {
        if (pk71.b == null) {
            synchronized (ge71.e) {
                if (pk71.b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    pk71.b = pk71.a(context, pk71.a.a(context), m771Var);
                }
            }
        }
        ge71 ge71Var = pk71.b;
        if (ge71Var != null) {
            return ge71Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    public static boolean c(bb71 bb71Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        long a2 = bb71Var.a();
        long j = -1;
        int i3 = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i3 != 0 && a2 <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = a2;
        }
        int i4 = (int) j2;
        dl81 dl81Var = new dl81(64);
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        while (i6 < i4) {
            dl81Var.i(8);
            if (!bb71Var.I(dl81Var.a, i5, 8, true)) {
                break;
            }
            long t = dl81Var.t();
            int a3 = dl81Var.a();
            if (t == 1) {
                bb71Var.s(8, 8, dl81Var.a);
                dl81Var.k(16);
                i = i6;
                i2 = 16;
                t = dl81Var.o();
            } else {
                if (t == 0) {
                    long a4 = bb71Var.a();
                    if (a4 != j) {
                        t = (a4 - bb71Var.e()) + 8;
                    }
                }
                i = i6;
                i2 = 8;
            }
            long j3 = i2;
            if (t < j3) {
                return false;
            }
            int i7 = i + i2;
            if (a3 == 1836019574) {
                i4 += (int) t;
                if (i3 != 0 && i4 > a2) {
                    i4 = (int) a2;
                }
                i6 = i7;
            } else {
                if (a3 == 1836019558 || a3 == 1836475768) {
                    z2 = true;
                    break;
                }
                int i8 = i3;
                if ((i7 + t) - j3 >= i4) {
                    break;
                }
                int i9 = (int) (t - j3);
                i6 = i7 + i9;
                if (a3 == 1718909296) {
                    if (i9 < 8) {
                        return false;
                    }
                    dl81Var.i(i9);
                    bb71Var.s(0, i9, dl81Var.a);
                    int i10 = i9 / 4;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (i11 != 1) {
                            int a5 = dl81Var.a();
                            if ((a5 >>> 8) != 3368816) {
                                for (int i12 = 0; i12 < 29; i12++) {
                                    if (a[i12] != a5) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                        dl81Var.m(dl81Var.b + 4);
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i9 != 0) {
                    bb71Var.e(i9);
                }
                i3 = i8;
            }
            j = -1;
            i5 = 0;
        }
        z2 = false;
        return z3 && z == z2;
    }

    public static final AuthException d(PassportException passportException) {
        return passportException instanceof PassportAccountNotAuthorizedException ? new AuthAccountNotAuthorizedException(passportException) : passportException instanceof PassportAccountNotFoundException ? new AuthAccountNotFoundException(passportException) : passportException instanceof PassportInvalidUrlException ? new AuthInvalidUrlException(passportException) : passportException instanceof PassportFailedResponseException ? new AuthFailedResponseException(passportException) : new AuthException(passportException);
    }
}
