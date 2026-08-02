package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class vrm implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fwi b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ wls w;
    public final /* synthetic */ wls x;
    public final /* synthetic */ a y;

    public /* synthetic */ vrm(fwi fwiVar, tls tlsVar, wls wlsVar, wls wlsVar2, a aVar, int i) {
        this.b = fwiVar;
        this.c = tlsVar;
        this.w = wlsVar;
        this.x = wlsVar2;
        this.y = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                tyu0 tyu0Var = (tyu0) obj;
                n8e n8eVar = (n8e) obj2;
                List h0 = tyu0Var.h0(zy11Var, new a(1736878560, new w4f(2, this.w, this.x, this.y), true));
                ArrayList arrayList = new ArrayList(tcc.n(h0, 10));
                Iterator it = h0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x910) it.next()).l0(n8eVar.a));
                }
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((o) it2.next()).b;
                }
                this.c.invoke(new y7m(this.b.H(i2)));
                return tyu0Var.w(0, 0, b.f(), new urm(0));
            default:
                ((Integer) obj2).getClass();
                yrm.d(this.b, this.c, this.w, this.x, this.y, (fid) obj, vng.O(28081));
                return zy11Var;
        }
    }

    public /* synthetic */ vrm(tls tlsVar, fwi fwiVar, wls wlsVar, wls wlsVar2, a aVar) {
        this.c = tlsVar;
        this.b = fwiVar;
        this.w = wlsVar;
        this.x = wlsVar2;
        this.y = aVar;
    }
}
