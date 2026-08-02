package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementImageDto;
import com.ybsdk.feature.qr.payments.api.data.AgreementEntity;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class vpa1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, boolean z, ButtonSize buttonSize, sls slsVar, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-477145794);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(slsVar) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                btsVar.Y();
                z3 = z2;
            } else {
                f530 f530Var3 = i4 != 0 ? c530.a : f530Var2;
                boolean z4 = i5 == 0 ? z2 : true;
                int i6 = i3 << 6;
                d17.c(f530Var3, z4, buttonSize, ButtonStyle.Floating, ButtonForm.Circle, slsVar, zlsVar, btsVar, (i3 & 14) | 27648 | (i3 & 112) | (i3 & 896) | (458752 & i6) | (i6 & 3670016), 0);
                f530Var2 = f530Var3;
                z3 = z4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new cpr(f530Var2, z3, buttonSize, slsVar, zlsVar, i, i2, 0);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final String b(RideCardPresentationType rideCardPresentationType) {
        int i = rideCardPresentationType == null ? -1 : ylk0.a[rideCardPresentationType.ordinal()];
        if (i == -1) {
            return "none";
        }
        if (i == 1) {
            return "details";
        }
        if (i == 2) {
            return "compact";
        }
        if (i == 3) {
            return "sharing";
        }
        if (i == 4) {
            return "none";
        }
        w511.b();
        return null;
    }

    public static final AgreementEntity c(AgreementDto agreementDto) {
        String agreementId = agreementDto.getAgreementId();
        String title = agreementDto.getTitle();
        String description = agreementDto.getDescription();
        AgreementImageDto image = agreementDto.getImage();
        return new AgreementEntity(agreementId, title, description, image != null ? wpa1.c(image) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        g(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int d = wpa1.d(obj);
        int i2 = d & i;
        int e = e(i2, obj3);
        if (e != 0) {
            int i3 = ~i;
            int i4 = d & i3;
            int i5 = -1;
            while (true) {
                int i6 = e - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !xya1.g(obj, objArr[i6]) || (objArr2 != null && !xya1.g(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    e = i8;
                }
            }
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object f(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        ny61.g(oyr.i(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void g(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
