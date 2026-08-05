package defpackage;

import android.app.Application;
import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class CIYkyd1d implements ul {
    public final Object MdtA4re8 = new Object();
    public volatile ga NCTxEWno;
    public y30 P7K7Inc8;
    public final T8ZRPPeH VgvYg0wo;
    public final MainActivity wxUZMvaN;

    public CIYkyd1d(MainActivity mainActivity) {
        this.wxUZMvaN = mainActivity;
        this.VgvYg0wo = new T8ZRPPeH(mainActivity);
    }

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        if (this.NCTxEWno == null) {
            synchronized (this.MdtA4re8) {
                try {
                    if (this.NCTxEWno == null) {
                        this.NCTxEWno = qoPGr6Ce();
                    }
                } finally {
                }
            }
        }
        return this.NCTxEWno;
    }

    public final ga qoPGr6Ce() {
        String str;
        MainActivity mainActivity = this.wxUZMvaN;
        if (mainActivity.getApplication() instanceof ul) {
            ia iaVar = (ia) ((ZLB5OTob) fn.ow5vqvCr(this.VgvYg0wo, ZLB5OTob.class));
            return new ga(iaVar.qoPGr6Ce, iaVar.NCTxEWno);
        }
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }
}
