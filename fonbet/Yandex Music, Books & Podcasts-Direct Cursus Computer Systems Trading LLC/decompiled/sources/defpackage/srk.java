package defpackage;

import android.content.Context;
import android.widget.OverScroller;

/* loaded from: classes.dex */
public final class srk implements Runnable {
    public final OverScroller a;
    public int b;
    public int c;
    public final /* synthetic */ trk d;

    public srk(trk trkVar, Context context) {
        this.d = trkVar;
        this.a = new OverScroller(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller = this.a;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            trk trkVar = this.d;
            trkVar.m.postTranslate(this.b - currX, this.c - currY);
            trkVar.a();
            this.b = currX;
            this.c = currY;
            trkVar.h.postOnAnimation(this);
        }
    }
}
