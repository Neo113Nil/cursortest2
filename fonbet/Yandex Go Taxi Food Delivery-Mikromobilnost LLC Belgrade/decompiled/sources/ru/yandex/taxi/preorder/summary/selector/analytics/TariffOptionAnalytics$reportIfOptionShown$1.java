package ru.yandex.taxi.preorder.summary.selector.analytics;

import defpackage.pex0;
import defpackage.pl2;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class TariffOptionAnalytics$reportIfOptionShown$1 extends PropertyReference1Impl {
    public static final TariffOptionAnalytics$reportIfOptionShown$1 b = new TariffOptionAnalytics$reportIfOptionShown$1("isAntisurgeOption", 0, "isAntisurgeOption()Z", pex0.class);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return Boolean.valueOf(((pex0) obj).O instanceof pl2);
    }
}
