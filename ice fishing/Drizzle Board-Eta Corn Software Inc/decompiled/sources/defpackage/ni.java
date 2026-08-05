package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ni extends w30 implements vg0, vo, s50, rj {
    public final /* synthetic */ f4UNdked Ey6iv0m0;
    public final ej KlHjfFWx;
    public final f4UNdked OxcuoDLp;
    public final Handler amk52bBQ;
    public final f4UNdked sjUBp5pO;

    public ni(f4UNdked f4undked) {
        this.Ey6iv0m0 = f4undked;
        Handler handler = new Handler();
        this.KlHjfFWx = new ej();
        this.sjUBp5pO = f4undked;
        this.OxcuoDLp = f4undked;
        this.amk52bBQ = handler;
    }

    @Override // defpackage.vg0
    public final ug0 P7K7Inc8() {
        return this.Ey6iv0m0.P7K7Inc8();
    }

    @Override // defpackage.w30
    public final View VhgXwMj9(int i) {
        return this.Ey6iv0m0.findViewById(i);
    }

    @Override // defpackage.w30
    public final boolean aZz0PFXp() {
        Window window = this.Ey6iv0m0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        return this.Ey6iv0m0.I5GHvsYW;
    }

    @Override // defpackage.s50
    public final mcXgUFR8 qoPGr6Ce() {
        return (mcXgUFR8) this.Ey6iv0m0.P7K7Inc8.NCTxEWno;
    }

    @Override // defpackage.rj
    public final void NCTxEWno(ej ejVar, li liVar) {
    }
}
