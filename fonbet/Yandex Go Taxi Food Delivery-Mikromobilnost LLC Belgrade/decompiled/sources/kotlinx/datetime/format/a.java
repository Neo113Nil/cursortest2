package kotlinx.datetime.format;

import defpackage.e421;
import defpackage.ntf0;

/* loaded from: classes9.dex */
public abstract class a {
    public static final e421 a;
    public static final e421 b;

    static {
        DateFields$day$1 dateFields$day$1 = DateFields$day$1.b;
        a = new e421(new ntf0(dateFields$day$1, dateFields$day$1.getName()), 1, 31, null, 56);
        DateFields$isoDayOfWeek$1 dateFields$isoDayOfWeek$1 = DateFields$isoDayOfWeek$1.b;
        b = new e421(new ntf0(dateFields$isoDayOfWeek$1, dateFields$isoDayOfWeek$1.getName()), 1, 7, null, 56);
        DateFields$dayOfYear$1 dateFields$dayOfYear$1 = DateFields$dayOfYear$1.b;
        new e421(new ntf0(dateFields$dayOfYear$1, dateFields$dayOfYear$1.getName()), 1, 366, null, 56);
    }
}
