package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gb implements to {
    public final Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final Object wxUZMvaN;

    public gb(uo uoVar) {
        this.NCTxEWno = 2;
        this.MdtA4re8 = uoVar;
        s5 s5Var = s5.MdtA4re8;
        Class<?> cls = uoVar.getClass();
        q5 q5Var = (q5) s5Var.qoPGr6Ce.get(cls);
        this.wxUZMvaN = q5Var == null ? s5Var.qoPGr6Ce(cls, null) : q5Var;
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        int i = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        Object obj2 = this.wxUZMvaN;
        switch (i) {
            case 0:
                af afVar = (af) obj;
                switch (fb.qoPGr6Ce[ooVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        (Build.VERSION.SDK_INT >= 28 ? q7.qoPGr6Ce(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new cf(), 500L);
                        afVar.NCTxEWno.P7K7Inc8(afVar);
                        break;
                    case 7:
                        m1.sjUBp5pO("ON_ANY must not been send by anybody");
                        return;
                    default:
                        throw new d7();
                }
                to toVar = (to) obj2;
                if (toVar != null) {
                    toVar.P7K7Inc8(voVar, ooVar);
                    return;
                }
                return;
            case 1:
                if (ooVar == oo.ON_START) {
                    ((xo) obj).P7K7Inc8(this);
                    ((mcXgUFR8) obj2).pRiPUEwG();
                    return;
                }
                return;
            default:
                uo uoVar = (uo) obj;
                HashMap hashMap = ((q5) obj2).qoPGr6Ce;
                q5.qoPGr6Ce((List) hashMap.get(ooVar), voVar, ooVar, uoVar);
                q5.qoPGr6Ce((List) hashMap.get(oo.ON_ANY), voVar, ooVar, uoVar);
                return;
        }
    }

    public /* synthetic */ gb(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
    }
}
