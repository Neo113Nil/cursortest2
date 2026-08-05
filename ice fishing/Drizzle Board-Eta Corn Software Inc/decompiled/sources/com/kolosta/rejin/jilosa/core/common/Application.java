package com.kolosta.rejin.jilosa.core.common;

import defpackage.DQL61DDk;
import defpackage.SJ7tYVsF;
import defpackage.j0;
import defpackage.l0;
import defpackage.t0;
import defpackage.tg0;
import defpackage.vl;
import defpackage.z0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class Application extends android.app.Application implements vl {
    public boolean NCTxEWno = false;
    public final j0 MdtA4re8 = new j0(new tg0(17, this));

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        return this.MdtA4re8.NCTxEWno();
    }

    @Override // android.app.Application
    public final void onCreate() {
        qoPGr6Ce();
        if (DQL61DDk.MdtA4re8 != 1) {
            DQL61DDk.MdtA4re8 = 1;
            synchronized (DQL61DDk.jb9XjC4I) {
                try {
                    z0 z0Var = DQL61DDk.Qr9iLBAD;
                    z0Var.getClass();
                    t0 t0Var = new t0(z0Var);
                    while (t0Var.hasNext()) {
                        DQL61DDk dQL61DDk = (DQL61DDk) ((WeakReference) t0Var.next()).get();
                        if (dQL61DDk != null) {
                            ((SJ7tYVsF) dQL61DDk).ow5vqvCr(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void qoPGr6Ce() {
        if (!this.NCTxEWno) {
            this.NCTxEWno = true;
            ((l0) this.MdtA4re8.NCTxEWno()).getClass();
        }
        super.onCreate();
    }
}
