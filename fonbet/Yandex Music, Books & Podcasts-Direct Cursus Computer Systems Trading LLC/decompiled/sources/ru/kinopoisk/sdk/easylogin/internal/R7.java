package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.ern;
import defpackage.ouj;
import defpackage.uif;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class R7 extends uif implements Function1<Z0, CharSequence> {
    public static final R7 a = new R7();

    public R7() {
        super(1);
    }

    public static String a(Z0 z0) {
        z0.getClass();
        String h = ern.a(z0.getClass()).h();
        InterfaceC1274w8 a2 = C0976b1.a(z0);
        String b = a2 != null ? a2.b() : null;
        if (b == null) {
            b = "";
        }
        return ouj.o(h, StringUtil.SPACE, b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Z0) obj);
    }
}
