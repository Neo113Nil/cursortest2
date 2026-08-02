package defpackage;

import android.os.Build;
import androidx.emoji2.text.b;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ysn extends etn {
    public final /* synthetic */ h32 a;

    public ysn(h32 h32Var) {
        this.a = h32Var;
    }

    @Override // defpackage.etn
    public final void a(Throwable th) {
        ((ftn) this.a.b).h(th);
    }

    @Override // defpackage.etn
    public final void b(wjm wjmVar) {
        h32 h32Var = this.a;
        h32Var.c = wjmVar;
        wjm wjmVar2 = (wjm) h32Var.c;
        ftn ftnVar = (ftn) h32Var.b;
        h32Var.a = new b(wjmVar2, ftnVar.f, ftnVar.l, ftnVar.h, ftnVar.i, Build.VERSION.SDK_INT >= 34 ? k5a1.e() : k5a1.e());
        ftn ftnVar2 = (ftn) h32Var.b;
        j63 j63Var = ftnVar2.b;
        ArrayList arrayList = new ArrayList(j63Var.c);
        ftnVar2.a.writeLock().lock();
        try {
            ftnVar2.c = 1;
            arrayList.addAll(j63Var);
            j63Var.clear();
            ftnVar2.a.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ctn ctnVar = (ctn) arrayList.get(i);
                ctnVar.b.execute(new uhm(19, ctnVar));
            }
        } catch (Throwable th) {
            ftnVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
