package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0436gh implements InterfaceC0462hh {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f6081a;

    public AbstractC0436gh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f6081a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0462hh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
