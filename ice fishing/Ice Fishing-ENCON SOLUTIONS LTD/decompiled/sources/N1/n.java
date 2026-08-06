package N1;

import java.util.ArrayList;
import p0.AbstractC1021r;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1224b;

    public /* synthetic */ n(int i2, Object[] objArr) {
        this.f1223a = i2;
        this.f1224b = objArr;
    }

    public boolean a() {
        return this.f1223a < ((ArrayList) this.f1224b).size();
    }

    public n(m0.b bVar, int i2) {
        AbstractC1021r.c(bVar);
        this.f1224b = bVar;
        this.f1223a = i2;
    }

    public n(int i2) {
        if (i2 > 0) {
            this.f1224b = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public n(ArrayList arrayList) {
        this.f1224b = arrayList;
    }
}
