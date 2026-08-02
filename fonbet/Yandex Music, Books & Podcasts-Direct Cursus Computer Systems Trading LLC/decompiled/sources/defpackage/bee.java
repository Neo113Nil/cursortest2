package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class bee implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;
    public final Object[] b;

    public bee(cee ceeVar) {
        Object[] objArr = new Object[ceeVar.size()];
        Object[] objArr2 = new Object[ceeVar.size()];
        hee heeVar = ceeVar.a;
        if (heeVar == null) {
            heeVar = ceeVar.b();
            ceeVar.a = heeVar;
        }
        xkt it = heeVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public x0 a(int i) {
        return new x0(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.a;
        boolean z = objArr instanceof hee;
        Object[] objArr2 = this.b;
        if (!z) {
            x0 a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.V(objArr[i], objArr2[i]);
            }
            return a.r();
        }
        hee heeVar = (hee) objArr;
        x0 a2 = a(heeVar.size());
        xkt it = heeVar.iterator();
        xkt it2 = ((qde) objArr2).iterator();
        while (it.hasNext()) {
            a2.V(it.next(), it2.next());
        }
        return a2.r();
    }
}
