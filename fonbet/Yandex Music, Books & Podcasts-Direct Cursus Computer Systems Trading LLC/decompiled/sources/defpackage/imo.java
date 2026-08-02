package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public class imo extends u7g {
    public float c;
    public float d;
    public final /* synthetic */ mmo e;

    public imo(mmo mmoVar, float f, float f2) {
        this.e = mmoVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.u7g
    public void S(String str) {
        mmo mmoVar = this.e;
        Canvas canvas = (Canvas) mmoVar.b;
        if (mmoVar.d1()) {
            kmo kmoVar = (kmo) mmoVar.d;
            if (kmoVar.b) {
                canvas.drawText(str, this.c, this.d, kmoVar.d);
            }
            kmo kmoVar2 = (kmo) mmoVar.d;
            if (kmoVar2.c) {
                canvas.drawText(str, this.c, this.d, kmoVar2.e);
            }
        }
        this.c = ((kmo) mmoVar.d).d.measureText(str) + this.c;
    }
}
