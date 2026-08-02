package defpackage;

import just.adapter.snapping.IntervalType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lruw;", "", "Companion", "puw", "quw", "just-adapter-snapping_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ruw {
    public static final quw Companion = new quw();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(17)), null, null, null};
    public final IntervalType a;
    public final String b;
    public final Integer c;
    public final Float d;

    public /* synthetic */ ruw(int i, IntervalType intervalType, String str, Integer num, Float f) {
        this.a = (i & 1) == 0 ? IntervalType.RELATIVE : intervalType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ruw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ruw ruwVar = (ruw) obj;
        return this.a == ruwVar.a && jl40.l(this.b, ruwVar.b) && jl40.l(this.c, ruwVar.c) && jl40.k(this.d, ruwVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.c;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        Float f = this.d;
        return intValue + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Interval(offsetType=" + this.a + ", anchor='" + this.b + "', absoluteOffset=" + this.c + ", relativeOffset=" + this.d + Extension.C_BRAKE;
    }

    public ruw() {
        this(15, null);
    }

    public ruw(int i, Float f) {
        IntervalType intervalType = IntervalType.RELATIVE;
        f = (i & 8) != 0 ? null : f;
        this.a = intervalType;
        this.b = null;
        this.c = null;
        this.d = f;
    }
}
