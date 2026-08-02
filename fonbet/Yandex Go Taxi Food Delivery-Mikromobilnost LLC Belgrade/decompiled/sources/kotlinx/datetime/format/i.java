package kotlinx.datetime.format;

import defpackage.e421;
import defpackage.ntf0;
import defpackage.nys;

/* loaded from: classes9.dex */
public abstract class i {
    public static final nys a;
    public static final e421 b;

    static {
        YearMonthFields$year$1 yearMonthFields$year$1 = YearMonthFields$year$1.b;
        a = new nys(new ntf0(yearMonthFields$year$1, yearMonthFields$year$1.getName()), null, 14);
        YearMonthFields$month$1 yearMonthFields$month$1 = YearMonthFields$month$1.b;
        b = new e421(new ntf0(yearMonthFields$month$1, yearMonthFields$month$1.getName()), 1, 12, null, 56);
    }
}
