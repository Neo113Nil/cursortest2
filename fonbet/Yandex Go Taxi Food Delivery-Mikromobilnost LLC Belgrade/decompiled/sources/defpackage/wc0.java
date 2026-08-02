package defpackage;

import com.yx360.design.compose.atoms.DsAvatar$Form;
import com.yx360.design.compose.atoms.DsAvatar$Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class wc0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5f b;

    public /* synthetic */ wc0(o5f o5fVar, int i) {
        this.a = i;
        this.b = o5fVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o5f o5fVar = this.b;
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
                iom.b(null, new aom(kbm.a(o5fVar.c, fidVar)), com.a, DsAvatar$Size.M24, o5fVar.d ? DsAvatar$Form.Square : DsAvatar$Form.Circle, null, null, null, null, fidVar, 3456, 481);
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
                iom.b(null, new aom(kbm.a(o5fVar.c, fidVar2)), null, DsAvatar$Size.M24, o5fVar.d ? DsAvatar$Form.Square : DsAvatar$Form.Circle, null, null, o5fVar.b, null, fidVar2, HProv.ALG_TYPE_SECURECHANNEL, 357);
                break;
            default:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                iom.b(null, new aom(kbm.a(o5fVar.c, fidVar3)), com.a, DsAvatar$Size.M24, o5fVar.d ? DsAvatar$Form.Square : DsAvatar$Form.Circle, null, null, null, null, fidVar3, 3456, 481);
                break;
        }
        return zy11Var;
    }
}
