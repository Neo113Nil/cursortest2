package defpackage;

import com.google.android.play.core.review.b;
import com.google.android.play.core.review.internal.c;

/* loaded from: classes11.dex */
public final class wxa1 extends zfa1 {
    public final /* synthetic */ atx0 b;
    public final /* synthetic */ b c;
    public final /* synthetic */ c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxa1(c cVar, atx0 atx0Var, atx0 atx0Var2, b bVar) {
        super(atx0Var);
        this.b = atx0Var2;
        this.c = bVar;
        this.w = cVar;
    }

    @Override // defpackage.zfa1
    public final void a() {
        synchronized (this.w.f) {
            try {
                c cVar = this.w;
                atx0 atx0Var = this.b;
                cVar.e.add(atx0Var);
                atx0Var.a.b(new gr81(11, cVar, atx0Var));
                if (this.w.k.getAndIncrement() > 0) {
                    this.w.b.a("Already connected to the service.", new Object[0]);
                }
                c.b(this.w, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
