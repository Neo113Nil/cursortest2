package com.yandex.plus.core.network.okhttp.call;

import android.net.Uri;
import com.yandex.passport.data.network.l;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class h implements com.yandex.plus.core.network.interceptor.a {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    @Override // com.yandex.plus.core.network.interceptor.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        com.yandex.plus.core.network.uri.b bVar;
        Object obj;
        nm6 nm6Var;
        int i;
        com.yandex.plus.core.network.interceptor.e eVar2;
        com.yandex.plus.core.network.request.b bVar2;
        switch (this.a) {
            case 0:
                return ((pyc) this.b).invoke(eVar.a, eVar.b, cg6Var);
            default:
                if (cg6Var instanceof com.yandex.plus.core.network.uri.b) {
                    bVar = (com.yandex.plus.core.network.uri.b) cg6Var;
                    int i2 = bVar.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bVar.n = i2 - Integer.MIN_VALUE;
                        obj = bVar.l;
                        nm6Var = nm6.a;
                        i = bVar.n;
                        if (i != 0) {
                            qgg.h0(obj);
                            com.yandex.plus.core.network.request.b bVar3 = (com.yandex.plus.core.network.request.b) eVar.b;
                            l lVar = (l) this.b;
                            Uri uri = bVar3.a;
                            bVar.j = eVar;
                            bVar.k = bVar3;
                            bVar.n = 1;
                            Object M = l.M(lVar, uri, bVar);
                            if (M == nm6Var) {
                                return nm6Var;
                            }
                            eVar2 = eVar;
                            bVar2 = bVar3;
                            obj = M;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj);
                                    return (com.yandex.plus.core.network.call.c) obj;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bVar2 = bVar.k;
                            eVar2 = bVar.j;
                            qgg.h0(obj);
                        }
                        Uri build = ((Uri.Builder) obj).build();
                        build.getClass();
                        com.yandex.plus.core.insets.d dVar = bVar2.b;
                        com.yandex.plus.core.network.request.a aVar = bVar2.c;
                        com.yandex.plus.core.network.content.a aVar2 = bVar2.d;
                        Object obj2 = bVar2.e;
                        aVar2.getClass();
                        com.yandex.plus.core.network.request.b bVar4 = new com.yandex.plus.core.network.request.b(build, dVar, aVar, aVar2, obj2);
                        bVar.j = null;
                        bVar.k = null;
                        bVar.n = 2;
                        obj = eVar2.b(bVar4, bVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        return (com.yandex.plus.core.network.call.c) obj;
                    }
                }
                bVar = new com.yandex.plus.core.network.uri.b(this, cg6Var);
                obj = bVar.l;
                nm6Var = nm6.a;
                i = bVar.n;
                if (i != 0) {
                }
                Uri build2 = ((Uri.Builder) obj).build();
                build2.getClass();
                com.yandex.plus.core.insets.d dVar2 = bVar2.b;
                com.yandex.plus.core.network.request.a aVar3 = bVar2.c;
                com.yandex.plus.core.network.content.a aVar22 = bVar2.d;
                Object obj22 = bVar2.e;
                aVar22.getClass();
                com.yandex.plus.core.network.request.b bVar42 = new com.yandex.plus.core.network.request.b(build2, dVar2, aVar3, aVar22, obj22);
                bVar.j = null;
                bVar.k = null;
                bVar.n = 2;
                obj = eVar2.b(bVar42, bVar);
                if (obj == nm6Var) {
                }
                return (com.yandex.plus.core.network.call.c) obj;
        }
    }
}
