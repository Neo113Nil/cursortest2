package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class rxj {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public lxj g;
    public int h;
    public long i;
    public final /* synthetic */ dyj j;

    public rxj(dyj dyjVar, String str) {
        this.j = dyjVar;
        this.a = str;
        dyjVar.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final vxj a() {
        TimeZone timeZone = bg61.a;
        if (!this.e) {
            return null;
        }
        dyj dyjVar = this.j;
        if (!dyjVar.E && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            try {
                y9t0 G = dyjVar.b.c.G((oq90) this.c.get(i));
                if (!dyjVar.E) {
                    this.h++;
                    G = new nxj(G, dyjVar, this);
                }
                arrayList.add(G);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yf61.b((y9t0) it.next());
                }
                try {
                    dyjVar.G(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new vxj(this.j, this.a, this.i, arrayList);
    }
}
