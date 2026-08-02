package K1;

import a7.h;
import android.graphics.Matrix;
import android.graphics.Path;
import b1.t;
import java.util.ArrayList;
import l1.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1670a;

    public b(int i) {
        switch (i) {
            case 1:
                this.f1670a = new ArrayList();
                break;
            case 2:
                this.f1670a = new ArrayList();
                break;
            default:
                this.f1670a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f1670a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            Matrix matrix = i.f38862a;
            if (tVar != null && !tVar.f5505a) {
                i.a(path, tVar.f5508d.l() / 100.0f, tVar.f5509e.l() / 100.0f, tVar.f5510f.l() / 360.0f);
            }
        }
    }

    public h b() {
        return new h(this.f1670a);
    }
}
