package kotlinx.datetime.format;

import defpackage.lb61;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class YearMonthFields$year$1 extends MutablePropertyReference1Impl {
    public static final YearMonthFields$year$1 b = new YearMonthFields$year$1("year", 0, "getYear()Ljava/lang/Integer;", lb61.class);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((lb61) obj).l();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
    public final void set(Object obj, Object obj2) {
        ((lb61) obj).C((Integer) obj2);
    }
}
