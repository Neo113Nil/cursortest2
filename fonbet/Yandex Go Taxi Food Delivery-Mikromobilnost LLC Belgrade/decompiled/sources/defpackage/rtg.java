package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.DebtStatus;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrtg;", "", "Companion", "ptg", "qtg", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class rtg {
    public static final qtg Companion = new qtg();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(11)), null, null};
    public final DebtStatus a;
    public final Integer b;
    public final ief c;

    public /* synthetic */ rtg(int i, DebtStatus debtStatus, Integer num, ief iefVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = debtStatus;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iefVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final ief getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final DebtStatus getA() {
        return this.a;
    }

    public rtg() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
