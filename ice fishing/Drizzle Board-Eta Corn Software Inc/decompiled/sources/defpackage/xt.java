package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xt {
    public final yt qoPGr6Ce;

    public xt(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(xt.class.getClassLoader());
        bundle.getClass();
        yt ytVar = new yt();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            n50.P7K7Inc8("nav-entry-state:id");
            throw null;
        }
        ytVar.NCTxEWno = string;
        ytVar.qoPGr6Ce = m50.wxUZMvaN("nav-entry-state:destination-id", bundle);
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            n50.P7K7Inc8("nav-entry-state:args");
            throw null;
        }
        ytVar.MdtA4re8 = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 == null) {
            n50.P7K7Inc8("nav-entry-state:saved-state");
            throw null;
        }
        ytVar.wxUZMvaN = bundle3;
        this.qoPGr6Ce = ytVar;
    }

    public xt(ut utVar) {
        utVar.getClass();
        this.qoPGr6Ce = new yt(utVar, utVar.MdtA4re8.MdtA4re8.qoPGr6Ce);
    }
}
