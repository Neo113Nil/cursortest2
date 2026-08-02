package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class Fr implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0376h fromModel(UserInfo userInfo) {
        C0376h c0376h = new C0376h();
        String userId = userInfo.getUserId();
        if (userId == null) {
            userId = "";
        }
        c0376h.a = userId;
        String type = userInfo.getType();
        if (type == null) {
            type = "";
        }
        c0376h.b = type;
        String c = Vc.c(userInfo.getOptions());
        c0376h.c = c != null ? c : "";
        return c0376h;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UserInfo toModel(C0376h c0376h) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(c0376h.a);
        userInfo.setType(c0376h.b);
        userInfo.setOptions(Vc.d(c0376h.c));
        return userInfo;
    }
}
