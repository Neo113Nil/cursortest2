package defpackage;

import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import java.util.Iterator;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public abstract class zf91 {
    public static final byte[] a = {-91, 48, -1, 61, -5, 79, 65, -111};
    public static final byte[] b = {-60, 69, -117, 82, -92, 59, Alerts.alert_certificate_unknown, -31, -48, DerValue.TAG_APPLICATION, -96, 95, -102, BlobHeaderStructure.KEXP15_BLOB_VERSION, Alerts.alert_bad_certificate, -50, -52, 84};

    public static final void a(f530 f530Var, m3u0 m3u0Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(76581636);
        int i2 = i | 6 | (btsVar.k(m3u0Var) ? 32 : 16);
        int i3 = 28;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            long n = tje.n(AppColor$Palette.Background, btsVar);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new xo1(m3u0Var, i3);
                btsVar.o0(Q);
            }
            f530Var2 = c530.a;
            pi6.a(m4m0.a(ljs0.c(ljs0.e(d.a(f530Var2, (tls) Q), 28.0f), 1.0f), zoy0.G(scc.g(new ldc(ldc.b(n, 1.0f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.b(n, 0.0f, 0.0f, 0.0f, 0.0f, 14))), 0.0f, 0.0f, 14), null, 6), btsVar, 0);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(i, i3, f530Var2, m3u0Var);
        }
    }

    public static final PaymentMethod b(AvailableMethods availableMethods, String str) {
        Object obj;
        Iterator<T> it = availableMethods.getPaymentMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (jl40.l(paymentMethod.getIdentifier(), str) || paymentMethod.getAliases().contains(str)) {
                break;
            }
        }
        return (PaymentMethod) obj;
    }

    public static final void c(ListItemComponent listItemComponent) {
        listItemComponent.setMinHeight(c.h(40, listItemComponent));
        listItemComponent.setMaxTrailRatio(0.5f);
        listItemComponent.setLeadImageSize(tje.u(52, listItemComponent.getContext()), tje.u(40, listItemComponent.getContext()));
        int r = tje.r(mrg0.component_safe_image_padding, listItemComponent.getContext());
        int u = tje.u(14, listItemComponent.getContext());
        int i = xw31.n(listItemComponent.getContext()) ? r : u;
        if (!xw31.n(listItemComponent.getContext())) {
            u = r;
        }
        listItemComponent.setLeadImagePadding(i, r, u, r);
    }
}
