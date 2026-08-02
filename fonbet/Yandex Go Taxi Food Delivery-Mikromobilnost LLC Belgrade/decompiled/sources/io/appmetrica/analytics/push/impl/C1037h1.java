package io.appmetrica.analytics.push.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PassportUidProvider;
import io.appmetrica.analytics.push.settings.PushFilter;

/* renamed from: io.appmetrica.analytics.push.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1037h1 implements PushFilter {
    public final r a;

    public C1037h1(r rVar) {
        this.a = rVar;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        Filters filters = pushMessage.getFilters();
        Integer loginFilterType = filters == null ? null : filters.getLoginFilterType();
        int intValue = loginFilterType != null ? loginFilterType.intValue() : 3;
        int i = intValue & 1;
        if (i != 0 && (intValue & 2) != 0) {
            return PushFilter.FilterResult.show();
        }
        PassportUidProvider passportUidProvider = this.a.f.o;
        if (passportUidProvider == null) {
            return PushFilter.FilterResult.silence("Not found passport uid provider", null);
        }
        String uid = passportUidProvider.getUid();
        return i != 0 ? TextUtils.isEmpty(uid) ? PushFilter.FilterResult.silence("No current account", null) : PushFilter.FilterResult.show() : (intValue & 2) != 0 ? TextUtils.isEmpty(uid) ? PushFilter.FilterResult.show() : PushFilter.FilterResult.silence("Has current account", null) : PushFilter.FilterResult.silence("Filter type is set to 'do not show to anyone'", null);
    }
}
