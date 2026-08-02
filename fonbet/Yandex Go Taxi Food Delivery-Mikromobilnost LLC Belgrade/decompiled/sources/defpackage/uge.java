package defpackage;

import androidx.compose.foundation.text.c;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.loading.b;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.impl.p;
import com.yandex.payment.sdk.passport.PassportAccountNotAuthorizedExceptionAdapter;
import com.yx360.design.compose.atoms.snackbar.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final /* synthetic */ class uge implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uge(gn90 gn90Var, boolean z, p pVar) {
        this.a = 8;
        this.b = z;
        this.c = pVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                vge vgeVar = (vge) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = f.g(2);
                        btsVar.o0(Q);
                    }
                    yx40 yx40Var = (yx40) Q;
                    k3r k3rVar = ljs0.b;
                    String str2 = vgeVar.a;
                    long E = uh6.E(16);
                    int intValue2 = yx40Var.getIntValue();
                    lzr lzrVar = z ? lzr.G : lzr.D;
                    String str3 = vgeVar.b;
                    long o = ((el51) btsVar.m(gl51.a)).o();
                    long E2 = uh6.E(13);
                    sty0 sty0Var = new sty0(E);
                    sty0 sty0Var2 = new sty0(E2);
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new dx2(yx40Var, 2);
                        btsVar.o0(Q2);
                    }
                    web1.e(k3rVar, null, null, str2, null, 0L, lzrVar, null, sty0Var, 0, false, intValue2, null, str3, null, null, null, sty0Var2, false, o, 0, false, 0, false, (tls) Q2, false, btsVar, 805306374, 805306368, 1572864, 198667638);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                acb1.b((st6) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                c.c((j) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                mrm.j((xqm) obj3, z, (fid) obj, vng.O(7));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                a.c(z, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                web1.b(z, (wls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                zob1.b((f530) obj3, z, (fid) obj, vng.O(49));
                return zy11Var;
            case 7:
                ebp0 ebp0Var = (ebp0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    uo5 uo5Var = x4c.z;
                    ebp0Var.getClass();
                    b.a(d.c(ljs0.n(cj6.a.a(c530.a, uo5Var), 40.0f, 16.0f), 0.0f, 0.0f, z ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, null, 524283), null, false, null, null, null, false, btsVar2, 0, 254);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 8:
                p pVar = (p) obj3;
                mi3 mi3Var = (mi3) obj2;
                PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(z ? h.c : h.a), ((Long) obj).longValue());
                String str4 = mi3Var.a;
                String str5 = mi3Var.b;
                ClientCredentials.Factory.getClass();
                try {
                    return pVar.c(passportUidImpl, new Credentials(str4, str5)).getValue();
                } catch (PassportAccountNotAuthorizedException e) {
                    throw new PassportAccountNotAuthorizedExceptionAdapter(e.getMessage());
                }
            default:
                int intValue4 = ((Integer) obj).intValue();
                Button button = (Button) obj2;
                List list = ((p4v0) obj3).c;
                String str6 = (list == null || (str = (String) list.get(intValue4)) == null || !z || evu0.J(str)) ? null : str;
                String str7 = str6 == null ? button.title : str6;
                String str8 = button.text;
                if (str8 == null) {
                    str8 = button.title;
                }
                String str9 = str8;
                Object obj4 = button.payload;
                Map map = obj4 instanceof Map ? (Map) obj4 : null;
                Object obj5 = map != null ? map.get("callback_data") : null;
                Map map2 = obj5 instanceof Map ? (Map) obj5 : null;
                return new o4v0(intValue4, button, str7, str9, map2 != null ? map2 : null, str6);
        }
    }

    public /* synthetic */ uge(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ uge(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ uge(boolean z, wls wlsVar, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = wlsVar;
    }
}
