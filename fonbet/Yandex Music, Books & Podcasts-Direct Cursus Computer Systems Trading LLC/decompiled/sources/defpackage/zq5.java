package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes5.dex */
public final class zq5 extends quj {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ zq5(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.quj
    public final void h0(String str) {
        switch (this.h) {
            case 0:
                ((PrintStream) this.i).println((Object) str);
                break;
            default:
                ((PrintWriter) this.i).println((Object) str);
                break;
        }
    }
}
