package com.yandex.plus.core.openapi;

import com.yandex.plus.core.openapi.a;
import defpackage.b6e;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class c {
    public static final Object a(a aVar) {
        if (aVar instanceof a.b) {
            Object obj = ((a.b) aVar).a;
            r7o r7oVar = z7o.b;
            return obj;
        }
        if (aVar instanceof a.AbstractC0017a) {
            r7o r7oVar2 = z7o.b;
            return new t7o(new IOException(String.valueOf((a.AbstractC0017a) aVar)));
        }
        b6e.s();
        return null;
    }
}
