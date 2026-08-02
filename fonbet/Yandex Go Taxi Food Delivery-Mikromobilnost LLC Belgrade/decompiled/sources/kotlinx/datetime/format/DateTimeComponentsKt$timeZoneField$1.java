package kotlinx.datetime.format;

import defpackage.hrg;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class DateTimeComponentsKt$timeZoneField$1 extends MutablePropertyReference1Impl {
    public static final DateTimeComponentsKt$timeZoneField$1 b = new DateTimeComponentsKt$timeZoneField$1("timeZoneId", 0, "getTimeZoneId()Ljava/lang/String;", hrg.class);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((hrg) obj).d;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
    public final void set(Object obj, Object obj2) {
        ((hrg) obj).d = (String) obj2;
    }
}
