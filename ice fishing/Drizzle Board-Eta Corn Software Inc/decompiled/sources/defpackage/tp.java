package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tp implements Runnable {
    public final /* synthetic */ xp MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ tp(xp xpVar, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = xpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.NCTxEWno;
        xp xpVar = this.MdtA4re8;
        switch (i) {
            case 0:
                fe feVar = xpVar.wxUZMvaN;
                if (feVar != null) {
                    feVar.setListSelectionHidden(true);
                    feVar.requestLayout();
                    break;
                }
                break;
            default:
                fe feVar2 = xpVar.wxUZMvaN;
                if (feVar2 != null && feVar2.isAttachedToWindow() && xpVar.wxUZMvaN.getCount() > xpVar.wxUZMvaN.getChildCount() && xpVar.wxUZMvaN.getChildCount() <= xpVar.ygLcUYwZ) {
                    xpVar.lwWCatUu.setInputMethodMode(2);
                    xpVar.wxUZMvaN();
                    break;
                }
                break;
        }
    }
}
