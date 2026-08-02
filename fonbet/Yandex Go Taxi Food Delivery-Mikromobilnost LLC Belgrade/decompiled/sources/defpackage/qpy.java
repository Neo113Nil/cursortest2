package defpackage;

import java.util.Date;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqpy;", "", "Companion", "opy", "ppy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class qpy {
    public static final ppy Companion = new ppy();
    public final zzs a;
    public final double b;
    public final Date c;

    public /* synthetic */ qpy(int i, zzs zzsVar, double d, Date date) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = new Date();
        } else {
            this.c = date;
        }
    }

    public qpy() {
        zzs zzsVar = zzs.f;
        Date date = new Date();
        this.a = zzsVar;
        this.b = 0.0d;
        this.c = date;
    }
}
