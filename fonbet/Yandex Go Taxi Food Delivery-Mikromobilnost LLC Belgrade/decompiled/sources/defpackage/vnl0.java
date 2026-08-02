package defpackage;

import android.graphics.Path;
import com.caverock.androidsvg.m;

/* loaded from: classes10.dex */
public final class vnl0 extends wnl0 {
    public final Path d;
    public final /* synthetic */ m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnl0(m mVar, Path path, float f) {
        super(mVar, f, 0.0f);
        this.e = mVar;
        this.d = path;
    }

    @Override // defpackage.wnl0, defpackage.cwa1
    public final void c(String str) {
        m mVar = this.e;
        if (mVar.V()) {
            ynl0 ynl0Var = mVar.c;
            if (ynl0Var.b) {
                mVar.a.drawTextOnPath(str, this.d, this.a, this.b, ynl0Var.d);
            }
            ynl0 ynl0Var2 = mVar.c;
            if (ynl0Var2.c) {
                mVar.a.drawTextOnPath(str, this.d, this.a, this.b, ynl0Var2.e);
            }
        }
        this.a = mVar.c.d.measureText(str) + this.a;
    }
}
