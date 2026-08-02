package ru.yandex.taxi.controller;

import defpackage.d5j0;
import defpackage.h7u0;
import defpackage.hit;
import defpackage.hst;
import defpackage.j5z;
import defpackage.jst;
import defpackage.kvj0;
import defpackage.mdh;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rvj0;
import defpackage.sjh;
import defpackage.t4j0;
import defpackage.tj21;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.za7;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes5.dex */
public final class b {
    public final hit a;
    public final tt2 b;
    public final OkHttpClient c;
    public final j5z d;
    public final h7u0 e;
    public final String f;
    public qoh g;

    public b(hit hitVar, tt2 tt2Var, OkHttpClient okHttpClient, j5z j5zVar, h7u0 h7u0Var, String str) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = okHttpClient;
        this.d = j5zVar;
        this.e = h7u0Var;
        this.f = str;
    }

    public static final String a(b bVar, String str, boolean z) {
        bVar.getClass();
        hst hstVar = jst.e;
        String str2 = bVar.f;
        String.format("downloadPage: %s", Arrays.copyOf(new Object[]{str2}, 1));
        hstVar.getClass();
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(str2);
        tj21 tj21Var = (tj21) bVar.e.a.get();
        tj21Var.b.getClass();
        t4j0Var.c.g(ExtFunctionsKt.HEADER_USER_AGENT, tj21Var.b());
        t4j0Var.c.g("Accept-Language", bVar.d.d());
        if (str != null && str.length() != 0) {
            t4j0Var.d("Authorization", "Bearer ".concat(str));
        }
        if (z) {
            t4j0Var.b(za7.o);
        }
        kvj0 execute = ((nci0) bVar.c.newCall(new d5j0(t4j0Var))).execute();
        try {
            rvj0 rvj0Var = execute.z;
            if (rvj0Var == null) {
                throw new IllegalStateException("Contract violation, null body after Call#execute()");
            }
            if (!execute.J) {
                throw new HttpException(Response.a(rvj0Var, execute));
            }
            String string = rvj0Var.string();
            execute.close();
            return string;
        } finally {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|26))|19|20))|32|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        defpackage.jst.e.getClass();
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        r8 = ru.yandex.taxi.utils.g.a(3, 2000, new ru.yandex.taxi.controller.WebViewCacheLoader$newNoCacheRequest$2(r6, r7, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, String str, ContinuationImpl continuationImpl) {
        WebViewCacheLoader$newCacheRequest$1 webViewCacheLoader$newCacheRequest$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof WebViewCacheLoader$newCacheRequest$1) {
            webViewCacheLoader$newCacheRequest$1 = (WebViewCacheLoader$newCacheRequest$1) continuationImpl;
            int i2 = webViewCacheLoader$newCacheRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewCacheLoader$newCacheRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewCacheLoader$newCacheRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewCacheLoader$newCacheRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    WebViewCacheLoader$newCacheRequest$2$1 webViewCacheLoader$newCacheRequest$2$1 = new WebViewCacheLoader$newCacheRequest$2$1(bVar, str, null);
                    webViewCacheLoader$newCacheRequest$1.L$0 = str;
                    webViewCacheLoader$newCacheRequest$1.label = 1;
                    obj = tje.k0(mdhVar, webViewCacheLoader$newCacheRequest$2$1, webViewCacheLoader$newCacheRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (String) obj;
                    }
                    str = (String) webViewCacheLoader$newCacheRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return (String) obj;
            }
        }
        webViewCacheLoader$newCacheRequest$1 = new WebViewCacheLoader$newCacheRequest$1(bVar, continuationImpl);
        Object obj2 = webViewCacheLoader$newCacheRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewCacheLoader$newCacheRequest$1.label;
        if (i != 0) {
        }
        return (String) obj2;
    }

    public final Object c(String str, SuspendLambda suspendLambda) {
        qoh qohVar = this.g;
        if (qohVar == null || !qohVar.isActive()) {
            this.g = tje.h(this.a.a, null, null, new WebViewCacheLoader$preload$3(false, this, str, null), 3);
        }
        qoh qohVar2 = this.g;
        if (qohVar2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        Object s = qohVar2.s(suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
