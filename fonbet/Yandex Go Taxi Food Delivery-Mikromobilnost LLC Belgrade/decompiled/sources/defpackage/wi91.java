package defpackage;

import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.j;
import androidx.fragment.app.Fragment;
import com.google.ar.core.ImageMetadata;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.yandex.div.core.view2.divs.a;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wi91 {
    public static final void a(final pa90 pa90Var, float f, final float f2, float f3, final float f4, nhe nheVar, fid fidVar, final int i, final int i2) {
        float f5;
        int i3;
        float f6;
        int i4;
        nhe nheVar2;
        int i5;
        bts btsVar;
        final nhe nheVar3;
        final float f7;
        final float f8;
        k3r k3rVar;
        float f9;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1735418539);
        int i6 = (btsVar2.e(pa90Var) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            f5 = f;
        } else {
            f5 = f;
            i3 = i6 | (btsVar2.b(f5) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.b(f2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
            f6 = f3;
        } else {
            f6 = f3;
            i4 = i3 | (btsVar2.b(f6) ? 2048 : 1024);
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.b(f4) ? 16384 : 8192;
        }
        int i9 = 196608 | i4;
        int i10 = i2 & 64;
        if (i10 != 0) {
            i5 = i4 | 1769472;
            nheVar2 = nheVar;
        } else {
            nheVar2 = nheVar;
            i5 = i9 | (btsVar2.k(nheVar2) ? 1048576 : 524288);
        }
        if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
            float f10 = i7 != 0 ? 1.0f : f5;
            float f11 = i8 != 0 ? 0.0f : f6;
            if (i10 != 0) {
                nheVar2 = mhe.b;
            }
            nhe nheVar4 = nheVar2;
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            Pair pair = new Pair(Float.valueOf(fwiVar.w0(f11)), Float.valueOf(fwiVar.w0(f4)));
            float floatValue = ((Number) pair.getFirst()).floatValue();
            float floatValue2 = ((Number) pair.getSecond()).floatValue();
            boolean z = (f2 == 1.0f && y7m.b(f11, 0.0f) && y7m.b(f4, 0.0f)) ? false : true;
            k3r k3rVar2 = ljs0.c;
            f530 f530Var = c530.a;
            if (z) {
                f9 = f11;
                k3rVar = k3rVar2;
                f530Var = d.c(f530Var, f2, f2, 0.0f, floatValue, floatValue2, 0.0f, null, 524260);
            } else {
                k3rVar = k3rVar2;
                f9 = f11;
            }
            btsVar = btsVar2;
            o4b1.b(pa90Var, null, k3rVar.k(f530Var), null, nheVar4, f10, null, btsVar, (i5 & 14) | 48 | (57344 & (i5 >> 6)) | ((i5 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | 1572864, 8);
            nheVar3 = nheVar4;
            f7 = f10;
            f8 = f9;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            nheVar3 = nheVar2;
            f7 = f5;
            f8 = f6;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: o8v
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wi91.a(pa90.this, f7, f2, f8, f4, nheVar3, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    public static final float b(Long l, DisplayMetrics displayMetrics) {
        if (l == null) {
            return 0.0f;
        }
        long longValue = l.longValue();
        long j = longValue >> 31;
        return a.q(Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics);
    }

    public static jfb0 c(String str) {
        Object failure;
        if (!kfb0.c(str)) {
            return null;
        }
        String d = kfb0.d(str);
        try {
            failure = jfb0.h.p(d, "RU");
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            i5z0.a.a("Failed to parse phone number ".concat(str), new Object[0]);
        }
        if (!(failure instanceof Result.Failure)) {
            failure = new jfb0((Phonenumber$PhoneNumber) failure, d);
        }
        return (jfb0) (failure instanceof Result.Failure ? null : failure);
    }

    public static final zr31 d(Fragment fragment, u1m u1mVar) {
        String str;
        try {
            Fragment requireParentFragment = fragment.requireParentFragment();
            if (u1mVar != null) {
                str = "engine_".concat(cvu0.v(u1mVar.a, "/", "_", false));
            } else {
                str = "engine_" + UUID.randomUUID().toString();
            }
            return new zr31(requireParentFragment, str);
        } catch (IllegalStateException unused) {
            return new zr31(fragment, null);
        }
    }
}
