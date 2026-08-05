package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bk implements gm, s50, vg0 {
    public final ug0 MdtA4re8;
    public final li NCTxEWno;
    public rg0 VgvYg0wo;
    public final d3vfVszL wxUZMvaN;
    public xo P7K7Inc8 = null;
    public q50 b2ZJblxo = null;

    public bk(li liVar, ug0 ug0Var, d3vfVszL d3vfvszl) {
        this.NCTxEWno = liVar;
        this.MdtA4re8 = ug0Var;
        this.wxUZMvaN = d3vfvszl;
    }

    public final void MdtA4re8() {
        if (this.P7K7Inc8 == null) {
            this.P7K7Inc8 = new xo(this);
            q50 q50Var = new q50(new r50(this, new e7(8, this)));
            this.b2ZJblxo = q50Var;
            q50Var.Qr9iLBAD();
            this.wxUZMvaN.run();
        }
    }

    public final void NCTxEWno(oo ooVar) {
        this.P7K7Inc8.wxUZMvaN(ooVar);
    }

    @Override // defpackage.vg0
    public final ug0 P7K7Inc8() {
        MdtA4re8();
        return this.MdtA4re8;
    }

    @Override // defpackage.gm
    public final mt VgvYg0wo() {
        Application application;
        li liVar = this.NCTxEWno;
        Context applicationContext = liVar.aZz0PFXp().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        mt mtVar = new mt(0);
        LinkedHashMap linkedHashMap = mtVar.qoPGr6Ce;
        if (application != null) {
            linkedHashMap.put(qg0.wxUZMvaN, application);
        }
        linkedHashMap.put(w30.b2ZJblxo, liVar);
        linkedHashMap.put(w30.Qr9iLBAD, this);
        Bundle bundle = liVar.b2ZJblxo;
        if (bundle != null) {
            linkedHashMap.put(w30.jb9XjC4I, bundle);
        }
        return mtVar;
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        MdtA4re8();
        return this.P7K7Inc8;
    }

    @Override // defpackage.s50
    public final mcXgUFR8 qoPGr6Ce() {
        MdtA4re8();
        return (mcXgUFR8) this.b2ZJblxo.NCTxEWno;
    }

    @Override // defpackage.gm
    public final rg0 wxUZMvaN() {
        Application application;
        li liVar = this.NCTxEWno;
        rg0 wxUZMvaN = liVar.wxUZMvaN();
        if (!wxUZMvaN.equals(liVar.HdOGZAzC)) {
            this.VgvYg0wo = wxUZMvaN;
            return wxUZMvaN;
        }
        rg0 rg0Var = this.VgvYg0wo;
        if (rg0Var != null) {
            return rg0Var;
        }
        Context applicationContext = liVar.aZz0PFXp().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        t50 t50Var = new t50(application, liVar, liVar.b2ZJblxo);
        this.VgvYg0wo = t50Var;
        return t50Var;
    }
}
