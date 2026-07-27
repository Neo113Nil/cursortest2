package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends t8.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4764b;

    public e(f fVar) {
        super(6);
        this.f4764b = fVar;
    }

    @Override // t8.g
    public final void s(Throwable th) {
        this.f4764b.f4765a.d(th);
    }

    @Override // t8.g
    public final void t(S0.i iVar) {
        f fVar = this.f4764b;
        fVar.f4767c = iVar;
        S0.i iVar2 = fVar.f4767c;
        j jVar = fVar.f4765a;
        fVar.f4766b = new Z2.e(iVar2, jVar.f4779g, jVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : A8.b.i());
        j jVar2 = fVar.f4765a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f4773a.writeLock().lock();
        try {
            jVar2.f4775c = 1;
            arrayList.addAll(jVar2.f4774b);
            jVar2.f4774b.clear();
            jVar2.f4773a.writeLock().unlock();
            jVar2.f4776d.post(new L.a(arrayList, jVar2.f4775c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f4773a.writeLock().unlock();
            throw th;
        }
    }
}
