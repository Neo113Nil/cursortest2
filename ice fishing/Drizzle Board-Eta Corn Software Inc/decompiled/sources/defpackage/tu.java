package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
@vv("navigation")
/* loaded from: classes.dex */
public class tu extends wv {
    public final xv MdtA4re8;

    public tu(xv xvVar) {
        xvVar.getClass();
        this.MdtA4re8 = xvVar;
    }

    @Override // defpackage.wv
    public final pu qoPGr6Ce() {
        return new ru(this);
    }

    @Override // defpackage.wv
    public final void wxUZMvaN(List list, xu xuVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ut utVar = (ut) it.next();
            pu puVar = utVar.MdtA4re8;
            puVar.getClass();
            ru ruVar = (ru) puVar;
            Bundle qoPGr6Ce = utVar.jb9XjC4I.qoPGr6Ce();
            yt ytVar = ruVar.Qr9iLBAD;
            int i = ytVar.qoPGr6Ce;
            if (i == 0) {
                VM67d7Sv vM67d7Sv = ruVar.MdtA4re8;
                String str = (String) vM67d7Sv.wxUZMvaN;
                if (str == null) {
                    str = String.valueOf(vM67d7Sv.qoPGr6Ce);
                }
                str.getClass();
                if (((ru) ytVar.MdtA4re8).MdtA4re8.qoPGr6Ce == 0) {
                    str = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(str).toString());
            }
            pu puVar2 = (pu) ej0.eVhOlqcC((a80) ytVar.wxUZMvaN, i);
            if (puVar2 == null) {
                String str2 = (String) ytVar.NCTxEWno;
                if (str2 == null) {
                    str2 = String.valueOf(ytVar.qoPGr6Ce);
                    ytVar.NCTxEWno = str2;
                }
                str2.getClass();
                m1.sjUBp5pO(q70.P7K7Inc8("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            this.MdtA4re8.NCTxEWno(puVar2.NCTxEWno).wxUZMvaN(ra.FySoLYna(NCTxEWno().NCTxEWno(puVar2, puVar2.qoPGr6Ce(qoPGr6Ce))), xuVar);
        }
    }
}
