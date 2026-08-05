package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rg extends p40 {
    public final HashMap P7K7Inc8 = new HashMap();

    @Override // defpackage.p40
    public final Object NCTxEWno(Object obj) {
        Object NCTxEWno = super.NCTxEWno(obj);
        this.P7K7Inc8.remove(obj);
        return NCTxEWno;
    }

    @Override // defpackage.p40
    public final m40 qoPGr6Ce(Object obj) {
        return (m40) this.P7K7Inc8.get(obj);
    }
}
