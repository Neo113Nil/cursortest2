package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class deu implements Runnable, Comparable {
    public static final /* synthetic */ s9f[] d;
    public final int a;
    public final String b;
    public final f4m c;

    static {
        yxm yxmVar = new yxm(deu.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0);
        ern.a.getClass();
        d = new s9f[]{yxmVar};
    }

    public deu(qn qnVar, int i) {
        this.a = i;
        this.b = qnVar.a;
        f4m f4mVar = new f4m(23, false);
        f4mVar.b = new WeakReference(qnVar);
        this.c = f4mVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        deu deuVar = (deu) obj;
        int i = this.a - deuVar.a;
        return i != 0 ? i : !this.b.equals(deuVar.b) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!deu.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        deu deuVar = (deu) obj;
        return this.b.equals(deuVar.b) && this.a == deuVar.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((6913 + this.a) * 31);
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn qnVar = (qn) this.c.getValue(this, d[0]);
        if (qnVar == null || qnVar.h.get()) {
            return;
        }
        try {
            qnVar.f.offer(qnVar.d.a());
        } catch (Exception unused) {
        }
    }
}
