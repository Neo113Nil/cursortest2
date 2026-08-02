package androidx.emoji2.text;

import N3.C;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends A8.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4732b;

    public e(f fVar) {
        this.f4732b = fVar;
    }

    @Override // A8.b
    public final void r(Throwable th) {
        this.f4732b.f4733a.d(th);
    }

    @Override // A8.b
    public final void s(S0.n nVar) {
        f fVar = this.f4732b;
        fVar.f4735c = nVar;
        S0.n nVar2 = fVar.f4735c;
        j jVar = fVar.f4733a;
        fVar.f4734b = new b3.e(nVar2, jVar.f4747g, jVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : C.J());
        j jVar2 = fVar.f4733a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f4741a.writeLock().lock();
        try {
            jVar2.f4743c = 1;
            arrayList.addAll(jVar2.f4742b);
            jVar2.f4742b.clear();
            jVar2.f4741a.writeLock().unlock();
            jVar2.f4744d.post(new L.a(arrayList, jVar2.f4743c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f4741a.writeLock().unlock();
            throw th;
        }
    }
}
