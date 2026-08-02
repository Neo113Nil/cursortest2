package defpackage;

import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class k0j implements Closeable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                o0j o0jVar = (o0j) this.b;
                l0j l0jVar = (l0j) this.c;
                o0jVar.e.getClass();
                o0jVar.b.remove(l0jVar);
                break;
            case 1:
                dzd dzdVar = (dzd) this.b;
                ((ArrayList) dzdVar.f).remove((wh4) this.c);
                break;
            default:
                ndv ndvVar = (ndv) this.b;
                ndvVar.b.remove((ldv) this.c);
                break;
        }
    }
}
