package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends S0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f4879d;

    public e(f fVar) {
        this.f4879d = fVar;
    }

    @Override // S0.f
    public final void o(Throwable th) {
        this.f4879d.f4880a.d(th);
    }

    @Override // S0.f
    public final void p(f4.p pVar) {
        f fVar = this.f4879d;
        fVar.f4882c = pVar;
        f4.p pVar2 = fVar.f4882c;
        j jVar = fVar.f4880a;
        fVar.f4881b = new Y2.e(pVar2, jVar.f4894g, jVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : U2.a.i());
        j jVar2 = fVar.f4880a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f4888a.writeLock().lock();
        try {
            jVar2.f4890c = 1;
            arrayList.addAll(jVar2.f4889b);
            jVar2.f4889b.clear();
            jVar2.f4888a.writeLock().unlock();
            jVar2.f4891d.post(new L.a(arrayList, jVar2.f4890c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f4888a.writeLock().unlock();
            throw th;
        }
    }
}
