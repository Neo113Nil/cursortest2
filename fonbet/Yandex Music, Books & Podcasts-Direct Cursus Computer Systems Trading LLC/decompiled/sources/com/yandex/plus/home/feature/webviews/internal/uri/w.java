package com.yandex.plus.home.feature.webviews.internal.uri;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class w implements com.yandex.plus.webview.api.request.b {
    public final com.yandex.plus.home.auth.f a;

    public w(com.yandex.plus.home.auth.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r2.f(r7) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.yandex.plus.webview.api.request.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, Continuation continuation) {
        v vVar;
        int i;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i2 = vVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vVar.k;
                nm6 nm6Var = nm6.a;
                i = vVar.m;
                com.yandex.plus.home.auth.f fVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    vVar.j = str;
                    vVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str2 = vVar.j;
                        qgg.h0(obj);
                        return str2;
                    }
                    str = vVar.j;
                    qgg.h0(obj);
                }
                vVar.j = str;
                vVar.m = 2;
                return fVar.b(str, vVar) != nm6Var ? nm6Var : str;
            }
        }
        vVar = new v(this, (cg6) continuation);
        Object obj2 = vVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vVar.m;
        com.yandex.plus.home.auth.f fVar2 = this.a;
        if (i != 0) {
        }
        vVar.j = str;
        vVar.m = 2;
        if (fVar2.b(str, vVar) != nm6Var2) {
        }
    }
}
