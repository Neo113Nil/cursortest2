package defpackage;

import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class xi6 {
    public boolean a;
    public boolean b;
    public boolean c;

    public boolean a() {
        return (this.c || this.b) && this.a;
    }

    public void b(ArrayList arrayList) {
        if ((this.a || this.b || this.c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DeferrableSurface) it.next()).a();
            }
            sgb1.g(3, "ForceCloseDeferrableSurface");
        }
    }
}
