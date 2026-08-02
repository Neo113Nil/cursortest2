package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jt0 implements lod {
    public final /* synthetic */ la a;
    public final /* synthetic */ tlp b;
    public final /* synthetic */ j4x c;

    public jt0(la laVar, ood oodVar, tlp tlpVar, j4x j4xVar) {
        this.a = laVar;
        this.b = tlpVar;
        this.c = j4xVar;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        xnc xncVar;
        rodVar.getClass();
        la laVar = this.a;
        tlp tlpVar = this.b;
        j4x j4xVar = this.c;
        if (bp6.a.contains(lt0.class)) {
            return;
        }
        try {
            g3c g3cVar = rodVar.d;
            xnc xncVar2 = xnc.a;
            if (g3cVar == null) {
                xncVar = xncVar2;
            } else if (g3cVar.d == -1) {
                xncVar = xnc.c;
            } else {
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{rodVar.toString(), g3cVar.toString()}, 2));
                xncVar = xnc.b;
            }
            synchronized (j3c.a) {
            }
            tlpVar.b(g3cVar != null);
            xnc xncVar3 = xnc.c;
            if (xncVar == xncVar3) {
                j3c.d().execute(new x8x(6, laVar, tlpVar));
            }
            if (xncVar == xncVar2 || ((xnc) j4xVar.c) == xncVar3) {
                return;
            }
            j4xVar.c = xncVar;
        } catch (Throwable th) {
            bp6.a(lt0.class, th);
        }
    }
}
