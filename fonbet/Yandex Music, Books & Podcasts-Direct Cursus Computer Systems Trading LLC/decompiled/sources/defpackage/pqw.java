package defpackage;

import com.yandex.media.ynison.service.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pqw extends sqw {
    public final fpw a;
    public final maq b;
    public final how c;
    public final e0 d;
    public final long e;

    public pqw(fpw fpwVar, maq maqVar, how howVar, e0 e0Var, long j) {
        howVar.getClass();
        e0Var.getClass();
        this.a = fpwVar;
        this.b = maqVar;
        this.c = howVar;
        this.d = e0Var;
        this.e = j;
    }

    @Override // defpackage.sqw
    public final how a() {
        return this.c;
    }

    @Override // defpackage.sqw
    public final e0 b() {
        return this.d;
    }

    public final fpw c(zzp zzpVar) {
        zzpVar.getClass();
        fpw fpwVar = this.a;
        if (!fpwVar.a) {
            return fpwVar;
        }
        return fpw.a(fpwVar, false, yhn.f((long) (((zzpVar.b() - this.e) * fpwVar.d.a) + fpwVar.b), 0L, fpwVar.c), 0L, null, 29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqw)) {
            return false;
        }
        pqw pqwVar = (pqw) obj;
        return this.a.equals(pqwVar.a) && this.b.equals(pqwVar.b) && Intrinsics.d(this.c, pqwVar.c) && Intrinsics.d(this.d, pqwVar.d) && this.e == pqwVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Appended(playingState=");
        sb.append(this.a);
        sb.append(", queueState=");
        sb.append(this.b);
        sb.append(", devices=");
        sb.append(this.c);
        sb.append(", raw=");
        sb.append(this.d);
        sb.append(", localReceivingTimestampMs=");
        return hrg.m(this.e, ")", sb);
    }
}
