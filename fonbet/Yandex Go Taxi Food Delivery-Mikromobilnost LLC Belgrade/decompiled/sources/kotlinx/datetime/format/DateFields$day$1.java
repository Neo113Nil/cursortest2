package kotlinx.datetime.format;

import defpackage.wqg;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class DateFields$day$1 extends MutablePropertyReference1Impl {
    public static final DateFields$day$1 b = new DateFields$day$1("day", 0, "getDay()Ljava/lang/Integer;", wqg.class);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((wqg) obj).m();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
    public final void set(Object obj, Object obj2) {
        ((wqg) obj).s((Integer) obj2);
    }
}
