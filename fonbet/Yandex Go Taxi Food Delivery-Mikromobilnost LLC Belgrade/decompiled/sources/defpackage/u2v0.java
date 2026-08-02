package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final /* synthetic */ class u2v0 implements c9e, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2v0(v2v0 v2v0Var, long j, int i) {
        this.c = v2v0Var;
        this.b = j;
        this.a = i;
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        v2v0 v2v0Var = (v2v0) this.c;
        tdf tdfVar = (tdf) obj;
        d6z.z(v2v0Var.i);
        qdf qdfVar = v2v0Var.c;
        ImmutableList immutableList = tdfVar.a;
        long j = tdfVar.c;
        qdfVar.getClass();
        byte[] a = qdf.a(j, immutableList);
        ef90 ef90Var = v2v0Var.d;
        ef90Var.getClass();
        ef90Var.I(a.length, a);
        v2v0Var.a.a(ef90Var, a.length, 0);
        long j2 = tdfVar.b;
        a aVar = v2v0Var.i;
        long j3 = this.b;
        if (j2 == -9223372036854775807L) {
            d6z.x(aVar.s == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        } else {
            long j4 = aVar.s;
            j3 = j4 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? j3 + j2 : j2 + j4;
        }
        v2v0Var.a.c(j3, this.a | 1, a.length, 0, null);
    }

    @Override // defpackage.ov71
    public void invoke(Object obj) {
        String str;
        wc71 wc71Var = (wc71) this.c;
        int i = this.a;
        long j = this.b;
        b171 b171Var = (b171) obj;
        b171Var.getClass();
        v281 v281Var = wc71Var.d;
        if (v281Var != null) {
            x971 x971Var = b171Var.b;
            yn81 yn81Var = wc71Var.b;
            synchronized (x971Var) {
                str = x971Var.a(yn81Var.a(v281Var.a, x971Var.b).c, v281Var).a;
            }
            Long l = (Long) b171Var.h.get(str);
            Long l2 = (Long) b171Var.g.get(str);
            b171Var.h.put(str, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            b171Var.g.put(str, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public /* synthetic */ u2v0(wc71 wc71Var, int i, long j, long j2) {
        this.c = wc71Var;
        this.a = i;
        this.b = j;
    }
}
