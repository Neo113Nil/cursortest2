package defpackage;

import androidx.media3.exoplayer.trackselection.a;

/* loaded from: classes.dex */
public final /* synthetic */ class qs7 implements olm {
    public final /* synthetic */ ct7 a;
    public final /* synthetic */ a b;

    public /* synthetic */ qs7(ct7 ct7Var, a aVar) {
        this.a = ct7Var;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r1.b != false) goto L38;
     */
    @Override // defpackage.olm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        xs7 xs7Var;
        dsc dscVar = (dsc) obj;
        ct7 ct7Var = this.a;
        ct7Var.getClass();
        if (this.b.t0) {
            int i = dscVar.D;
            if (i != -1 && i > 2) {
                String str = dscVar.n;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (dvt.a >= 32) {
                                xs7 xs7Var2 = ct7Var.h;
                                if (xs7Var2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (dvt.a >= 32 || (xs7Var = ct7Var.h) == null || !xs7Var.b || !xs7Var.b() || !ct7Var.h.c() || !ct7Var.h.a(ct7Var.i, dscVar)) {
                                return false;
                            }
                            break;
                    }
                }
                if (dvt.a >= 32) {
                }
                return false;
            }
        }
        return true;
    }
}
