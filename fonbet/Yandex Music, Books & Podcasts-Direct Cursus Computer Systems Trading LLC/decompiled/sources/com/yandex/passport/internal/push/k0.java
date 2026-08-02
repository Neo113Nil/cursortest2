package com.yandex.passport.internal.push;

import defpackage.i5f;
import defpackage.mvg;
import defpackage.oc3;
import defpackage.tkr;
import defpackage.wsd;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class k0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                i5f i5fVar = com.yandex.passport.data.network.core.q.a;
                i5fVar.getClass();
                tkr tkrVar = tkr.a;
                byte[] bytes = i5fVar.c(new wsd(tkrVar, tkrVar, 1), map).getBytes(Charsets.UTF_8);
                bytes.getClass();
                return bytes;
            case 1:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                i5f i5fVar2 = com.yandex.passport.data.network.core.q.a;
                i5fVar2.getClass();
                tkr tkrVar2 = tkr.a;
                return (Map) i5fVar2.b(new wsd(tkrVar2, tkrVar2, 1), new String(bArr, Charsets.UTF_8));
            case 2:
                Map map2 = (Map) obj;
                map2.getClass();
                i5f i5fVar3 = com.yandex.passport.data.network.core.q.a;
                i5fVar3.getClass();
                byte[] bytes2 = i5fVar3.c(new wsd(tkr.a, mvg.a, 1), map2).getBytes(Charsets.UTF_8);
                bytes2.getClass();
                return bytes2;
            case 3:
                byte[] bArr2 = (byte[]) obj;
                bArr2.getClass();
                i5f i5fVar4 = com.yandex.passport.data.network.core.q.a;
                i5fVar4.getClass();
                return (Map) i5fVar4.b(new wsd(tkr.a, mvg.a, 1), new String(bArr2, Charsets.UTF_8));
            case 4:
                Map map3 = (Map) obj;
                map3.getClass();
                i5f i5fVar5 = com.yandex.passport.data.network.core.q.a;
                i5fVar5.getClass();
                byte[] bytes3 = i5fVar5.c(new wsd(tkr.a, oc3.a, 1), map3).getBytes(Charsets.UTF_8);
                bytes3.getClass();
                return bytes3;
            case 5:
                byte[] bArr3 = (byte[]) obj;
                bArr3.getClass();
                i5f i5fVar6 = com.yandex.passport.data.network.core.q.a;
                i5fVar6.getClass();
                return (Map) i5fVar6.b(new wsd(tkr.a, oc3.a, 1), new String(bArr3, Charsets.UTF_8));
            case 6:
                Map map4 = (Map) obj;
                map4.getClass();
                i5f i5fVar7 = com.yandex.passport.data.network.core.q.a;
                i5fVar7.getClass();
                byte[] bytes4 = i5fVar7.c(new wsd(tkr.a, mvg.a, 1), map4).getBytes(Charsets.UTF_8);
                bytes4.getClass();
                return bytes4;
            default:
                byte[] bArr4 = (byte[]) obj;
                bArr4.getClass();
                i5f i5fVar8 = com.yandex.passport.data.network.core.q.a;
                i5fVar8.getClass();
                return (Map) i5fVar8.b(new wsd(tkr.a, mvg.a, 1), new String(bArr4, Charsets.UTF_8));
        }
    }
}
