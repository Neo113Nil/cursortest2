package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.mr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0474mr implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0302h fromModel(@NotNull UserInfo userInfo) {
        C0302h c0302h = new C0302h();
        String userId = userInfo.getUserId();
        if (userId == null) {
            userId = "";
        }
        c0302h.a = userId;
        String type = userInfo.getType();
        if (type == null) {
            type = "";
        }
        c0302h.b = type;
        String c = Fc.c(userInfo.getOptions());
        c0302h.c = c != null ? c : "";
        return c0302h;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UserInfo toModel(@NotNull C0302h c0302h) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(c0302h.a);
        userInfo.setType(c0302h.b);
        userInfo.setOptions(Fc.d(c0302h.c));
        return userInfo;
    }
}
