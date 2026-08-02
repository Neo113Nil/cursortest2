package defpackage;

/* loaded from: classes.dex */
public final class vk7 extends gs2 {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk7(m9r m9rVar, int i) {
        super(i, m9rVar.k - 1);
        this.d = 1;
        this.e = m9rVar;
    }

    @Override // defpackage.eih
    public final long b() {
        switch (this.d) {
            case 0:
                a();
                return ((uk7) this.e).h(this.c);
            case 1:
                a();
                m9r m9rVar = (m9r) this.e;
                return m9rVar.o[(int) this.c];
            default:
                a();
                return ((uk7) this.e).h(this.c);
        }
    }

    @Override // defpackage.eih
    public final long c() {
        switch (this.d) {
            case 0:
                a();
                return ((uk7) this.e).g(this.c);
            case 1:
                return ((m9r) this.e).c((int) this.c) + b();
            default:
                a();
                return ((uk7) this.e).g(this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk7(Object obj, long j, long j2, int i) {
        super(j, j2);
        this.d = i;
        this.e = obj;
    }
}
