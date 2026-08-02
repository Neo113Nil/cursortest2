package defpackage;

import android.opengl.GLES20;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class no0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ no0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((IntConsumer) this.c).accept(this.b);
                break;
            case 1:
                sw1 sw1Var = (sw1) this.c;
                sw1Var.b.onAudioFocusChange(this.b);
                break;
            case 2:
                ((ulh) this.c).k.remove(Integer.valueOf(this.b));
                break;
            case 3:
                ((hag) this.c).t(this.b);
                break;
            case 4:
                ((SideSheetBehavior) this.c).lambda$setState$0(this.b);
                break;
            default:
                nsu nsuVar = (nsu) this.c;
                k5v k5vVar = nsuVar.c;
                int i = this.b;
                k5vVar.g = v3g.S(i);
                p4r p4rVar = nsuVar.b;
                p4rVar.r = i;
                float[] fArr = p4rVar.A;
                p4r.g(i, 15, fArr);
                p4rVar.s = i;
                p4r.g(i, 6, fArr);
                p4rVar.t = i;
                p4r.g(i, 12, fArr);
                p4rVar.u = i;
                p4r.g(i, 3, fArr);
                p4rVar.v = i;
                p4r.g(i, 9, fArr);
                p4rVar.w = i;
                p4r.g(i, 0, fArr);
                p4rVar.h();
                float[] S = v3g.S(i);
                p4rVar.d = S;
                GLES20.glUniform3f(p4rVar.L, S[0], S[1], S[2]);
                break;
        }
    }
}
