package kotlinx.datetime.format;

import defpackage.g6z0;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class TimeFields$amPm$1 extends MutablePropertyReference1Impl {
    public static final TimeFields$amPm$1 b = new TimeFields$amPm$1("amPm", 0, "getAmPm()Lkotlinx/datetime/format/AmPmMarker;", g6z0.class);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((g6z0) obj).h();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
    public final void set(Object obj, Object obj2) {
        ((g6z0) obj).p((AmPmMarker) obj2);
    }
}
