package Z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    public final String f1416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1418c;

    public K(M m2, String str, int i) {
        this.f1418c = m2;
        this.f1416a = str;
        this.f1417b = i;
    }

    @Override // Z.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1418c.f1455x;
        if (abstractComponentCallbacksC0070s == null || this.f1417b >= 0 || this.f1416a != null || !abstractComponentCallbacksC0070s.g().O(-1, 0)) {
            return this.f1418c.P(arrayList, arrayList2, this.f1416a, this.f1417b, 1);
        }
        return false;
    }
}
