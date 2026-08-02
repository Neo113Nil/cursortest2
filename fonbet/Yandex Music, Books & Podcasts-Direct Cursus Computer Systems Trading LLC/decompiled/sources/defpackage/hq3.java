package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class hq3 implements pwg {
    public final long a;
    public boolean b;
    public long c;
    public Object d;
    public Object e;
    public final Object f;

    public hq3(ikn iknVar) {
        bwf bwfVar = bwf.c;
        this.d = btf.a(bwfVar, new gq3(this, 0));
        this.e = btf.a(bwfVar, new gq3(this, 1 == true ? 1 : 0));
        this.a = Long.parseLong(iknVar.G(Long.MAX_VALUE));
        this.c = Long.parseLong(iknVar.G(Long.MAX_VALUE));
        this.b = Integer.parseInt(iknVar.G(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(iknVar.G(Long.MAX_VALUE));
        pv9 pv9Var = new pv9(9);
        for (int i = 0; i < parseInt; i++) {
            String G = iknVar.G(Long.MAX_VALUE);
            Bitmap.Config[] configArr = k.a;
            int S = StringsKt.S(G, ':', 0, 6);
            if (S == -1) {
                xq0.o("Unexpected header: ".concat(G));
                throw null;
            }
            pv9Var.n(StringsKt.t0(G.substring(0, S)).toString(), G.substring(S + 1));
        }
        this.f = pv9Var.r();
    }

    @Override // defpackage.pwg
    public void a(h5n h5nVar) {
        if (h5nVar != null && ((ArrayList) this.d).size() > 0) {
            h5nVar.c((ArrayList) this.d);
            this.d = new ArrayList();
        }
        this.e = h5nVar;
    }

    public void b(hkn hknVar) {
        zvd zvdVar = (zvd) this.f;
        hknVar.c0(this.a);
        hknVar.writeByte(10);
        hknVar.c0(this.c);
        hknVar.writeByte(10);
        hknVar.c0(this.b ? 1L : 0L);
        hknVar.writeByte(10);
        hknVar.c0(zvdVar.size());
        hknVar.writeByte(10);
        int size = zvdVar.size();
        for (int i = 0; i < size; i++) {
            hknVar.M(zvdVar.g(i));
            hknVar.M(": ");
            hknVar.M(zvdVar.q(i));
            hknVar.writeByte(10);
        }
    }

    @Override // defpackage.pwg
    public void start() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c = SystemClock.uptimeMillis();
        this.d = new ArrayList();
        zj4.a.postFrameCallback((yj4) this.f);
    }

    @Override // defpackage.pwg
    public void stop() {
        if (this.b) {
            this.b = false;
            zj4.a.removeFrameCallback((yj4) this.f);
        }
    }

    public hq3(long j) {
        this.d = new ArrayList();
        this.f = new yj4(0, this);
        this.a = j;
    }

    public hq3(l3o l3oVar) {
        bwf bwfVar = bwf.c;
        this.d = btf.a(bwfVar, new gq3(this, 0));
        this.e = btf.a(bwfVar, new gq3(this, 1));
        this.a = l3oVar.k;
        this.c = l3oVar.l;
        this.b = l3oVar.e != null;
        this.f = l3oVar.f;
    }
}
