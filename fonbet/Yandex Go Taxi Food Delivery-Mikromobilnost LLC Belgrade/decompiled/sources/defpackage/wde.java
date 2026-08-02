package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsActionBar$Variant;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.DsHeading$Align;
import com.yx360.design.compose.atoms.DsHeading$Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public final class wde implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wde(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj2).getClass();
                fid fidVar = (fid) obj3;
                tls tlsVar = (tls) obj5;
                if ((((Number) obj4).intValue() & HProv.PP_SECURITY_LEVEL) == 128) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                hq91.a(ohb1.e(fidVar, oyh0.messaging_profile_settings_contacts_delete_title), null, null, DsHeading$Size.Xs, DsHeading$Align.Center, 0L, 0, 0L, 0, 0, null, fidVar, 27648, 0, 2022);
                DsActionBar$Variant dsActionBar$Variant = DsActionBar$Variant.Vertical;
                kk2 kk2Var = new kk2(ohb1.e(fidVar, oyh0.purge_contacts_confirmation_positive));
                DsButton$Style dsButton$Style = DsButton$Style.Danger;
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(1790222357);
                boolean k = btsVar2.k(tlsVar);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new azd(1, tlsVar);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                DsButton$Size dsButton$Size = DsButton$Size.Lg;
                snm snmVar = new snm(kk2Var, dsButton$Style, (sls) Q, dsButton$Size, false, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                kk2 kk2Var2 = new kk2(ohb1.e(btsVar2, oyh0.purge_contacts_confirmation_negative));
                DsButton$Style dsButton$Style2 = DsButton$Style.Neutral;
                btsVar2.e0(1790233430);
                boolean k2 = btsVar2.k(tlsVar);
                Object Q2 = btsVar2.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new azd(2, tlsVar);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                unm.b(dsActionBar$Variant, snmVar, null, new snm(kk2Var2, dsButton$Style2, (sls) Q2, dsButton$Size, false, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND), btsVar2, 6, 20);
                return zy11Var;
            default:
                j690 j690Var = (j690) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                    c530 c530Var = c530.a;
                    f530 n = an91.n(an91.j(ljs0.c(c530Var, 1.0f), j690Var), 16.0f, 16.0f, 16.0f, 8.0f);
                    he40 he40Var = (he40) obj5;
                    sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = b.d(btsVar3, n);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a);
                    qje.W(btsVar3, d.e, o);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d);
                    CharSequence charSequence = he40Var.a;
                    if (charSequence == null) {
                        btsVar3.e0(-57294347);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-57294346);
                        spb1.f(charSequence, btsVar3, 0);
                        btsVar3.t(false);
                    }
                    oeb1.c(btsVar3, ljs0.e(c530Var, 16.0f));
                    spb1.c(he40Var.b, btsVar3, 0);
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }
}
