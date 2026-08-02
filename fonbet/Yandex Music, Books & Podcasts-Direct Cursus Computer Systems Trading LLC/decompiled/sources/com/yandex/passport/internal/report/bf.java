package com.yandex.passport.internal.report;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import defpackage.su4;
import defpackage.z7o;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class bf implements ze {
    public final Function1 a;
    public final String b;
    public final String c;

    public bf(Function1 function1, Object obj) {
        this.a = function1;
        this.b = CameraService.RESULT;
        Throwable a = z7o.a(obj);
        this.c = a == null ? (String) function1.invoke(obj) : su4.p(a, new StringBuilder("error:"));
    }

    @Override // com.yandex.passport.internal.report.ze
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getName() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        return this.c;
    }

    public /* synthetic */ bf(Object obj) {
        this(new com.yandex.passport.common.network.r(23), obj);
    }
}
