package com.yandex.passport.api.exception;

import defpackage.hrg;
import java.util.List;

/* loaded from: classes4.dex */
public final class t extends j {
    public t(String str) {
        super(hrg.q("Action ", str, " is not supported on deprecated api"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, List list) {
        super(str);
        str.getClass();
        list.getClass();
    }
}
