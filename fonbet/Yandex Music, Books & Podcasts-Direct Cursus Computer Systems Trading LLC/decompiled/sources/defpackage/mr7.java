package defpackage;

import androidx.fragment.app.f0;
import androidx.fragment.app.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class mr7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ f0 c;

    public /* synthetic */ mr7(h hVar, f0 f0Var, int i) {
        this.a = i;
        this.b = hVar;
        this.c = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                h hVar = this.b;
                ArrayList arrayList = hVar.b;
                f0 f0Var = this.c;
                arrayList.remove(f0Var);
                hVar.c.remove(f0Var);
                break;
        }
    }
}
