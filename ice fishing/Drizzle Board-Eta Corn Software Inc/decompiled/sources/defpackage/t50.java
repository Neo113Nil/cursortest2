package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t50 implements rg0 {
    public final Bundle MdtA4re8;
    public final qg0 NCTxEWno;
    public final mcXgUFR8 VgvYg0wo;
    public final Application qoPGr6Ce;
    public final xo wxUZMvaN;

    public t50(Application application, s50 s50Var, Bundle bundle) {
        qg0 qg0Var;
        this.VgvYg0wo = s50Var.qoPGr6Ce();
        this.wxUZMvaN = s50Var.b2ZJblxo();
        this.MdtA4re8 = bundle;
        this.qoPGr6Ce = application;
        if (application != null) {
            qg0Var = qg0.MdtA4re8;
            if (qg0Var == null) {
                qg0Var = new qg0(application);
                qg0.MdtA4re8 = qg0Var;
            }
        } else {
            qg0Var = new qg0(null);
        }
        this.NCTxEWno = qg0Var;
    }

    @Override // defpackage.rg0
    public final ng0 MdtA4re8(p5 p5Var, mt mtVar) {
        Class cls = p5Var.qoPGr6Ce;
        cls.getClass();
        return NCTxEWno(cls, mtVar);
    }

    @Override // defpackage.rg0
    public final ng0 NCTxEWno(Class cls, mt mtVar) {
        LinkedHashMap linkedHashMap = mtVar.qoPGr6Ce;
        String str = (String) linkedHashMap.get(tg0.wxUZMvaN);
        if (str == null) {
            m1.Ey6iv0m0("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(w30.b2ZJblxo) == null || linkedHashMap.get(w30.Qr9iLBAD) == null) {
            if (this.wxUZMvaN != null) {
                return wxUZMvaN(str, cls);
            }
            m1.Ey6iv0m0("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(qg0.wxUZMvaN);
        boolean isAssignableFrom = Hfv28Fap.class.isAssignableFrom(cls);
        Constructor qoPGr6Ce = (!isAssignableFrom || application == null) ? u50.qoPGr6Ce(cls, u50.NCTxEWno) : u50.qoPGr6Ce(cls, u50.qoPGr6Ce);
        return qoPGr6Ce == null ? this.NCTxEWno.NCTxEWno(cls, mtVar) : (!isAssignableFrom || application == null) ? u50.NCTxEWno(cls, qoPGr6Ce, w30.sjUBp5pO(mtVar)) : u50.NCTxEWno(cls, qoPGr6Ce, application, w30.sjUBp5pO(mtVar));
    }

    @Override // defpackage.rg0
    public final ng0 qoPGr6Ce(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return wxUZMvaN(canonicalName, cls);
        }
        m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final ng0 wxUZMvaN(String str, Class cls) {
        xo xoVar = this.wxUZMvaN;
        if (xoVar == null) {
            m1.b2ZJblxo("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = Hfv28Fap.class.isAssignableFrom(cls);
        Application application = this.qoPGr6Ce;
        Constructor qoPGr6Ce = (!isAssignableFrom || application == null) ? u50.qoPGr6Ce(cls, u50.NCTxEWno) : u50.qoPGr6Ce(cls, u50.qoPGr6Ce);
        if (qoPGr6Ce == null) {
            if (application != null) {
                return this.NCTxEWno.qoPGr6Ce(cls);
            }
            sg0 sg0Var = sg0.qoPGr6Ce;
            if (sg0Var == null) {
                sg0Var = new sg0();
                sg0.qoPGr6Ce = sg0Var;
            }
            return sg0Var.qoPGr6Ce(cls);
        }
        mcXgUFR8 mcxgufr8 = this.VgvYg0wo;
        mcxgufr8.getClass();
        h50 NCTxEWno = g50.NCTxEWno(mcxgufr8.b2ZJblxo(str), this.MdtA4re8);
        i50 i50Var = new i50(str, NCTxEWno);
        i50Var.VgvYg0wo(mcxgufr8, xoVar);
        po poVar = xoVar.MdtA4re8;
        if (poVar == po.MdtA4re8 || poVar.compareTo(po.VgvYg0wo) >= 0) {
            mcxgufr8.pRiPUEwG();
        } else {
            xoVar.qoPGr6Ce(new gb(xoVar, 1, mcxgufr8));
        }
        ng0 NCTxEWno2 = (!isAssignableFrom || application == null) ? u50.NCTxEWno(cls, qoPGr6Ce, NCTxEWno) : u50.NCTxEWno(cls, qoPGr6Ce, application, NCTxEWno);
        NCTxEWno2.qoPGr6Ce("androidx.lifecycle.savedstate.vm.tag", i50Var);
        return NCTxEWno2;
    }

    public t50() {
        this.NCTxEWno = new qg0(null);
    }
}
