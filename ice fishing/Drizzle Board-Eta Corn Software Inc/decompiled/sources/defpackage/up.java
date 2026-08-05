package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class up extends DataSetObserver {
    public final /* synthetic */ xp qoPGr6Ce;

    public up(xp xpVar) {
        this.qoPGr6Ce = xpVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        xp xpVar = this.qoPGr6Ce;
        if (xpVar.lwWCatUu.isShowing()) {
            xpVar.wxUZMvaN();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.qoPGr6Ce.dismiss();
    }
}
