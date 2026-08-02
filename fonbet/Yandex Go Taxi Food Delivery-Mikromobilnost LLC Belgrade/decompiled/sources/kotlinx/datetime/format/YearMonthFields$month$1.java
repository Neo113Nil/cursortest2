package kotlinx.datetime.format;

import defpackage.lb61;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class YearMonthFields$month$1 extends MutablePropertyReference1Impl {
    public static final YearMonthFields$month$1 b = new YearMonthFields$month$1("monthNumber", 0, "getMonthNumber()Ljava/lang/Integer;", lb61.class);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((lb61) obj).n();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
    public final void set(Object obj, Object obj2) {
        ((lb61) obj).w((Integer) obj2);
    }
}
