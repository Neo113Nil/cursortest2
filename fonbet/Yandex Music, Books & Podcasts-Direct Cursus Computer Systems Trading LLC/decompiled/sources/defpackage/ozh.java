package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ozh extends OutputStream {
    public final ArrayList a = new ArrayList();
    public dpj b;
    public final /* synthetic */ pzh c;

    public ozh(pzh pzhVar) {
        this.c = pzhVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        mvn mvnVar = this.c.g;
        dpj dpjVar = this.b;
        ArrayList arrayList = this.a;
        if (dpjVar == null) {
            mvnVar.getClass();
            dpj l = mvn.l(i2);
            this.b = l;
            arrayList.add(l);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.b);
            dpj dpjVar2 = this.b;
            if (min == 0) {
                int max = Math.max(i2, dpjVar2.c * 2);
                mvnVar.getClass();
                dpj l2 = mvn.l(max);
                this.b = l2;
                arrayList.add(l2);
            } else {
                dpjVar2.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        dpj dpjVar = this.b;
        if (dpjVar != null && dpjVar.b > 0) {
            dpjVar.a.M0((byte) i);
            dpjVar.b--;
            dpjVar.c++;
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }
}
