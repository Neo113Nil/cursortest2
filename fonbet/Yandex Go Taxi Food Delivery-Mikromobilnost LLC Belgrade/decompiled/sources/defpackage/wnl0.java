package defpackage;

import android.graphics.Canvas;
import com.caverock.androidsvg.m;

/* loaded from: classes10.dex */
public class wnl0 extends cwa1 {
    public float a;
    public float b;
    public final /* synthetic */ m c;

    public wnl0(m mVar, float f, float f2) {
        this.c = mVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cwa1
    public void c(String str) {
        m mVar = this.c;
        Canvas canvas = mVar.a;
        if (mVar.V()) {
            ynl0 ynl0Var = mVar.c;
            if (ynl0Var.b) {
                canvas.drawText(str, this.a, this.b, ynl0Var.d);
            }
            ynl0 ynl0Var2 = mVar.c;
            if (ynl0Var2.c) {
                canvas.drawText(str, this.a, this.b, ynl0Var2.e);
            }
        }
        this.a = mVar.c.d.measureText(str) + this.a;
    }
}
