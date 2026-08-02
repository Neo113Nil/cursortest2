package com.yandex.passport.internal.flags;

import com.yandex.passport.data.network.core.q;
import defpackage.ff7;
import defpackage.i5f;
import defpackage.tkr;
import defpackage.wsd;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class c implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                i5f i5fVar = q.a;
                i5fVar.getClass();
                tkr tkrVar = tkr.a;
                byte[] bytes = i5fVar.c(new wsd(tkrVar, ff7.C(tkrVar), 1), map).getBytes(Charsets.UTF_8);
                bytes.getClass();
                return bytes;
            default:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                i5f i5fVar2 = q.a;
                i5fVar2.getClass();
                tkr tkrVar2 = tkr.a;
                return (Map) i5fVar2.b(new wsd(tkrVar2, ff7.C(tkrVar2), 1), new String(bArr, Charsets.UTF_8));
        }
    }
}
