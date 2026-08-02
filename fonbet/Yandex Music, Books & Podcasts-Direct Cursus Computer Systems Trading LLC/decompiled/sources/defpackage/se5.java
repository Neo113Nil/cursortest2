package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class se5 extends v8n {
    public final ubn c;
    public final sfm d;
    public final hyn e;
    public final int f;
    public final mqs g;
    public final int h;
    public final long i;
    public final pe5 j;
    public final tb k;
    public final boolean l;
    public final String m;
    public final t0q n;
    public final List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(ubn ubnVar, c cVar, sfm sfmVar, hyn hynVar, int i, List list, mqs mqsVar, int i2, long j, pe5 pe5Var, tb tbVar, boolean z, String str, t0q t0qVar) {
        super(cVar);
        cVar.getClass();
        this.c = ubnVar;
        this.d = sfmVar;
        this.e = hynVar;
        this.f = i;
        this.g = mqsVar;
        this.h = i2;
        this.i = j;
        this.j = pe5Var;
        this.k = tbVar;
        this.l = z;
        this.m = str;
        this.n = t0qVar;
        this.o = i != 1 ? null : list;
    }

    @Override // defpackage.v8n
    public final Object a(w8n w8nVar) {
        return w8nVar.Q(this);
    }

    @Override // defpackage.v8n
    public final String b() {
        pe5 pe5Var = this.j;
        v80 v80Var = pe5Var.a;
        List list = pe5Var.b;
        Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
        StringBuilder sb = new StringBuilder("CommonQueueDescriptor{playbackContext=");
        sb.append(this.a);
        sb.append(", repeatMode=");
        sb.append(this.e);
        sb.append(", shuffle=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? "null" : "OFF" : "ON");
        sb.append(", startFromTrackPositionInQueue=");
        sb.append(this.h);
        sb.append(", startFromTrack=");
        sb.append(this.g);
        sb.append(", analyticsValues(forQueue=");
        sb.append(v80Var);
        sb.append(", forPlayables?.size=");
        sb.append(valueOf);
        sb.append(")}");
        return sb.toString();
    }

    @Override // defpackage.v8n
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof se5) || !super.equals(obj)) {
                return false;
            }
            se5 se5Var = (se5) obj;
            if (this.h != se5Var.h || !Intrinsics.d(this.g, se5Var.g)) {
                return false;
            }
            oq a = this.k.a();
            boolean z = a != null ? a.d : true;
            oq a2 = se5Var.k.a();
            if (z != (a2 != null ? a2.d : true) || !Intrinsics.d(this.j, se5Var.j)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.v8n
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b.hashCode());
        Integer valueOf2 = Integer.valueOf(this.h);
        oq a = this.k.a();
        return Objects.hash(valueOf, valueOf2, this.g, Boolean.valueOf(a != null ? a.d : true), this.j);
    }
}
