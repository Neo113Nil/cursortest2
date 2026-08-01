package V;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1206a;

    public e(f fVar) {
        this.f1206a = fVar;
    }

    @Override // R.j
    public final void W(Throwable th) {
        this.f1206a.f1207a.d(th);
    }

    @Override // R.j
    public final void Z(B.k kVar) {
        f fVar = this.f1206a;
        fVar.f1209c = kVar;
        B.k kVar2 = fVar.f1209c;
        j jVar = fVar.f1207a;
        fVar.f1208b = new M0.h(kVar2, jVar.f1219g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : R.j.x());
        j jVar2 = fVar.f1207a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f1214a.writeLock().lock();
        try {
            jVar2.f1216c = 1;
            arrayList.addAll(jVar2.f1215b);
            jVar2.f1215b.clear();
            jVar2.f1214a.writeLock().unlock();
            jVar2.f1217d.post(new L.a(arrayList, jVar2.f1216c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f1214a.writeLock().unlock();
            throw th;
        }
    }
}
