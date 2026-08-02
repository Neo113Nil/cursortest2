package ru.yandex.taxi.locationsdk.core.utils;

import defpackage.k7z;
import defpackage.vez0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class LocationMonotonicityKt$ensureStrictTimestampMonotonicity$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(vez0.P((TimestampSelector) this.receiver, (k7z) obj, (k7z) obj2));
    }
}
