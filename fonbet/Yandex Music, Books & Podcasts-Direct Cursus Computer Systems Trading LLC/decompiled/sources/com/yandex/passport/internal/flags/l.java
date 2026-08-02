package com.yandex.passport.internal.flags;

import ru.yandex.quasar.glagol.impl.ConversationImpl;

/* loaded from: classes4.dex */
public abstract class l {
    public static final j a;
    public static final j b;

    static {
        f[] fVarArr = f.a;
        a = new j(200, "link_auth_timeout");
        b = new j(Integer.valueOf(ConversationImpl.INCORRECT_TOKEN), "link_auth_day_limit");
    }
}
