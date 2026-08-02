package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.payments.cards.nfc.enums.SwEnum;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.common_models.net.map_object.z;

/* loaded from: classes13.dex */
public abstract class xna1 {
    public static au2 a;

    public static final au2 a() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Finish", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(4.8f, 4.92f);
        e.b(6.0f, 6.0f, false, true, 3.86f, -1.91f);
        e.o(3.0f);
        e.g(0.02f);
        e.i(7.68f, 16.42f);
        e.i(-1.81f, 0.85f);
        e.h(12.0f, 14.84f);
        e.i(-2.54f, 5.43f);
        e.i(-1.81f, -0.85f);
        e.i(3.25f, -6.95f);
        e.i(-1.18f, -2.51f);
        e.e(-0.6f, 0.3f, -1.26f, 0.73f, -1.93f, 1.4f);
        e.e(-1.99f, 1.96f, -3.83f, 2.01f, -4.73f, 1.87f);
        e.i(-0.26f, -0.07f);
        e.e(-0.12f, -0.05f, -0.31f, -0.2f, -0.4f, -0.3f);
        e.e(-0.07f, -0.1f, -0.11f, -0.18f, -0.18f, -0.33f);
        e.h(0.5f, 8.84f);
        e.i(-0.08f, -0.18f);
        e.a(4.0f, 4.0f, false, true, 0.0f, 7.63f);
        e.e(0.0f, -0.27f, 0.03f, -0.34f, 0.22f, -0.5f);
        e.e(0.11f, -0.09f, 0.57f, -0.2f, 1.5f, -0.41f);
        e.e(0.89f, -0.2f, 1.96f, -0.69f, 3.07f, -1.8f);
        e.k(17.63f, 1.85f);
        e.e(0.84f, 0.2f, 1.26f, 0.28f, 1.36f, 0.37f);
        e.e(0.19f, 0.17f, 0.21f, 0.24f, 0.21f, 0.51f);
        e.e(0.0f, 0.15f, -0.17f, 0.52f, -0.51f, 1.24f);
        e.i(-1.77f, 3.77f);
        e.e(-0.07f, 0.16f, -0.1f, 0.24f, -0.19f, 0.34f);
        e.n(-0.27f, 0.26f, -0.39f, 0.31f);
        e.i(-0.2f, 0.06f);
        e.i(-0.06f, 0.01f);
        e.e(-0.9f, 0.15f, -2.75f, 0.12f, -4.73f, -1.87f);
        e.b(7.0f, 7.0f, false, false, -1.94f, -1.41f);
        e.i(-1.09f, -2.3f);
        e.i(2.23f, -4.79f);
        e.e(1.0f, 0.05f, 2.4f, 0.44f, 3.87f, 1.92f);
        e.b(6.4f, 6.4f, false, false, 3.21f, 1.84f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final boolean b(Address address) {
        List conditionalActions = address.getConditionalActions();
        if (conditionalActions == null) {
            return false;
        }
        List list = conditionalActions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((hyd) it.next()).b;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((z) it2.next()).a() == Type.POSITION_CONFIRMATION) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(byte[] bArr, SwEnum swEnum) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        SwEnum.Companion.getClass();
        SwEnum swEnum2 = null;
        if (bArr != null && bArr.length >= 2) {
            for (SwEnum swEnum3 : SwEnum.b()) {
                bArr2 = swEnum3.status;
                if (bArr2.length == 1) {
                    byte b = bArr[bArr.length - 2];
                    bArr5 = swEnum3.status;
                    if (b == bArr5[0]) {
                        swEnum2 = swEnum3;
                        break;
                    }
                }
                byte b2 = bArr[bArr.length - 2];
                bArr3 = swEnum3.status;
                if (b2 == bArr3[0]) {
                    byte b3 = bArr[bArr.length - 1];
                    bArr4 = swEnum3.status;
                    if (b3 == bArr4[1]) {
                        swEnum2 = swEnum3;
                        break;
                    }
                }
            }
        }
        return swEnum2 == swEnum;
    }

    public static final boolean d(Address address) {
        return jl40.l(address != null ? address.getPickAction() : null, "addressCorrection");
    }
}
