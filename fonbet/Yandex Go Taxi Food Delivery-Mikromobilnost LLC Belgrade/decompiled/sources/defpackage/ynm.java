package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yx360.design.compose.atoms.DsAvatar$Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class ynm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ynm(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                qnm qnmVar = qnm.a;
                ety0 o = ltm.b(fidVar).o(fidVar);
                vqy0.c(this.b, null, qnm.c(fidVar).g0(), 0L, null, 0L, null, 0L, 0, false, 0, 0, o, fidVar, 0, 0, 131066);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                qnm qnmVar2 = qnm.a;
                ety0 c = ltm.b(fidVar2).c(fidVar2);
                vqy0.c(this.b, null, qnm.c(fidVar2).g0(), 0L, null, 0L, null, 0L, 0, false, 0, 0, c, fidVar2, 0, 0, 131066);
                break;
            case 2:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                qnm qnmVar3 = qnm.a;
                qnm.d.getClass();
                f530 m = an91.m(c530.a, 8.0f, 0.0f, 2);
                ety0 f = ltm.b(fidVar3).f(fidVar3);
                vqy0.c(this.b, m, qnm.c(fidVar3).g0(), 0L, null, 0L, null, 0L, 0, false, 0, 0, f, fidVar3, 0, 0, 131064);
                break;
            case 3:
                fid fidVar4 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar4;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                bts btsVar5 = (bts) fidVar4;
                iom.b(null, new aom(kbm.a(vqb1.e(wwg0.msg_ic_saved_messages, (Context) btsVar5.m(AndroidCompositionLocals_androidKt.b)), btsVar5)), null, DsAvatar$Size.M24, null, null, null, this.b, null, btsVar5, HProv.ALG_TYPE_SECURECHANNEL, 373);
                break;
            default:
                fid fidVar5 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar6 = (bts) fidVar5;
                    if (btsVar6.E()) {
                        btsVar6.Y();
                        break;
                    }
                }
                iom.b(null, g1b1.a(fidVar5), null, DsAvatar$Size.M24, null, null, null, this.b, null, fidVar5, HProv.ALG_TYPE_SECURECHANNEL, 373);
                break;
        }
        return zy11Var;
    }
}
