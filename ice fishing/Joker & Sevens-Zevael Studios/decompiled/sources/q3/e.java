package q3;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f5753c;

    public e(f fVar) {
        this.f5753c = fVar;
    }

    @Override // a.a
    public final void E(Throwable th) {
        this.f5753c.f5754a.d(th);
    }

    @Override // a.a
    public final void F(x4.n nVar) {
        f fVar = this.f5753c;
        fVar.f5756c = nVar;
        x4.n nVar2 = fVar.f5756c;
        i iVar = fVar.f5754a;
        m6.i iVar2 = iVar.f5765g;
        d dVar = iVar.f5767i;
        Set<int[]> a6 = Build.VERSION.SDK_INT >= 34 ? n.a() : i7.b.w();
        a5.c cVar = new a5.c();
        cVar.f262h = iVar2;
        cVar.f261g = nVar2;
        cVar.f263i = dVar;
        if (!a6.isEmpty()) {
            for (int[] iArr : a6) {
                String str = new String(iArr, 0, iArr.length);
                cVar.E(str, 0, str.length(), 1, true, new dd.w(str, 2));
            }
        }
        fVar.f5755b = cVar;
        i iVar3 = fVar.f5754a;
        iVar3.getClass();
        ArrayList arrayList = new ArrayList();
        iVar3.f5759a.writeLock().lock();
        try {
            iVar3.f5761c = 1;
            arrayList.addAll(iVar3.f5760b);
            iVar3.f5760b.clear();
            iVar3.f5759a.writeLock().unlock();
            iVar3.f5762d.post(new e3.a(arrayList, iVar3.f5761c, (Throwable) null));
        } catch (Throwable th) {
            iVar3.f5759a.writeLock().unlock();
            throw th;
        }
    }
}
