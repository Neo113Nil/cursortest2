package io.appmetrica.analytics.push.impl;

import android.text.TextUtils;
import defpackage.unr0;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PassportUidProvider;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes9.dex */
public final class E1 implements PushFilter {
    public final r a;

    public E1(r rVar) {
        this.a = rVar;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        Filters filters = pushMessage.getFilters();
        String passportUid = filters == null ? null : filters.getPassportUid();
        if (TextUtils.isEmpty(passportUid)) {
            return PushFilter.FilterResult.show();
        }
        PassportUidProvider passportUidProvider = this.a.f.o;
        if (passportUidProvider == null) {
            return PushFilter.FilterResult.silence("Not found passport uid provider", null);
        }
        String uid = passportUidProvider.getUid();
        return TextUtils.isEmpty(uid) ? PushFilter.FilterResult.silence("No current account", null) : !TextUtils.equals(passportUid, uid) ? PushFilter.FilterResult.silence("Wrong account", unr0.p("Got account uid [", uid, "], allowed [", passportUid, "]")) : PushFilter.FilterResult.show();
    }
}
