package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class T8ZRPPeH implements ul {
    public final MainActivity MdtA4re8;
    public final MainActivity NCTxEWno;
    public final Object VgvYg0wo = new Object();
    public volatile ia wxUZMvaN;

    public T8ZRPPeH(MainActivity mainActivity) {
        this.NCTxEWno = mainActivity;
        this.MdtA4re8 = mainActivity;
    }

    public static tg0 qoPGr6Ce(MainActivity mainActivity, MainActivity mainActivity2) {
        return new tg0(mainActivity.P7K7Inc8(), new wkPeYiwH(0, mainActivity2), mainActivity.VgvYg0wo());
    }

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        if (this.wxUZMvaN == null) {
            synchronized (this.VgvYg0wo) {
                try {
                    if (this.wxUZMvaN == null) {
                        this.wxUZMvaN = ((rAaHqhFJ) qoPGr6Ce(this.NCTxEWno, this.MdtA4re8).lwWCatUu(m20.qoPGr6Ce(rAaHqhFJ.class))).NCTxEWno;
                    }
                } finally {
                }
            }
        }
        return this.wxUZMvaN;
    }
}
