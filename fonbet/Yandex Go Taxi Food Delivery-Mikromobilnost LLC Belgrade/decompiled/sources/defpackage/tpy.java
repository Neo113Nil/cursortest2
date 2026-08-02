package defpackage;

import java.util.Date;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltpy;", "", "Companion", "rpy", "spy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class tpy {
    public static final spy Companion = new spy();
    public final String a;
    public final zzs b;
    public final Date c;

    public /* synthetic */ tpy(int i, String str, zzs zzsVar, Date date) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = date;
        }
    }

    public tpy(zzs zzsVar, String str, Date date) {
        this.a = str;
        this.b = zzsVar;
        this.c = date;
    }

    public tpy() {
        this(null, "", null);
    }
}
