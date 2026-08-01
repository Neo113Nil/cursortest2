package K1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements J1.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f400c;

    /* renamed from: d, reason: collision with root package name */
    public final m f401d;

    public b(String str, int i, int i2, m mVar) {
        this.f398a = str;
        this.f399b = i;
        this.f400c = i2;
        this.f401d = mVar;
    }

    @Override // J1.f
    public final Iterator iterator() {
        return new a(this);
    }
}
