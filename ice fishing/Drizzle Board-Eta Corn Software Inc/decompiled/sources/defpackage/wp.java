package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wp implements View.OnTouchListener {
    public final /* synthetic */ xp NCTxEWno;

    public wp(xp xpVar) {
        this.NCTxEWno = xpVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        xp xpVar = this.NCTxEWno;
        tp tpVar = xpVar.KlHjfFWx;
        Handler handler = xpVar.FySoLYna;
        E3Msy4Bi e3Msy4Bi = xpVar.lwWCatUu;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && e3Msy4Bi != null && e3Msy4Bi.isShowing() && x >= 0 && x < e3Msy4Bi.getWidth() && y >= 0 && y < e3Msy4Bi.getHeight()) {
            handler.postDelayed(tpVar, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(tpVar);
        return false;
    }
}
