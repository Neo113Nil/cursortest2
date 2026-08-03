package cc;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends f implements Iterator, qc.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1307k;

    public d(g gVar, int i10) {
        this.f1307k = i10;
        pc.j.e(gVar, "map");
        this.f1313j = gVar;
        this.f1311h = -1;
        this.f1312i = gVar.f1322n;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1307k) {
            case 0:
                b();
                int i10 = this.f1310g;
                g gVar = (g) this.f1313j;
                if (i10 >= gVar.f1320l) {
                    throw new NoSuchElementException();
                }
                this.f1310g = i10 + 1;
                this.f1311h = i10;
                e eVar = new e(gVar, i10);
                c();
                return eVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                b();
                int i11 = this.f1310g;
                g gVar2 = (g) this.f1313j;
                if (i11 >= gVar2.f1320l) {
                    throw new NoSuchElementException();
                }
                this.f1310g = i11 + 1;
                this.f1311h = i11;
                Object obj = gVar2.f1315g[i11];
                c();
                return obj;
            default:
                b();
                int i12 = this.f1310g;
                g gVar3 = (g) this.f1313j;
                if (i12 >= gVar3.f1320l) {
                    throw new NoSuchElementException();
                }
                this.f1310g = i12 + 1;
                this.f1311h = i12;
                Object[] objArr = gVar3.f1316h;
                pc.j.b(objArr);
                Object obj2 = objArr[this.f1311h];
                c();
                return obj2;
        }
    }
}
