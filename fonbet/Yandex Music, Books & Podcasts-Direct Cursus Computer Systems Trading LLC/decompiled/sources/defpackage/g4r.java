package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class g4r implements Comparator {
    public final /* synthetic */ z9s a;
    public final /* synthetic */ xzb b;

    public g4r(lum lumVar, z9s z9sVar, xzb xzbVar) {
        this.a = z9sVar;
        this.b = xzbVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a.j;
        xzb xzbVar = this.b;
        return gl5.b(Integer.valueOf(lum.R(i, (tq9) obj, xzbVar)), Integer.valueOf(lum.R(i, (tq9) obj2, xzbVar)));
    }
}
