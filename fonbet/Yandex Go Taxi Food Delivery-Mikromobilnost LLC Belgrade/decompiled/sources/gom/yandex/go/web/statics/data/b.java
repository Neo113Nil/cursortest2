package gom.yandex.go.web.statics.data;

import defpackage.d5j0;
import defpackage.dyj;
import defpackage.g7u0;
import defpackage.i3y;
import defpackage.kvj0;
import defpackage.l2z;
import defpackage.nci0;
import defpackage.qhq0;
import defpackage.rvj0;
import defpackage.rxj;
import defpackage.sa7;
import defpackage.t4j0;
import defpackage.tig0;
import defpackage.wg10;
import defpackage.wls;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Result;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class b {
    public final i3y a;
    public final i3y b = kotlin.a.a(new qhq0(14, this));

    public b(File file, Long l) {
        this.a = kotlin.a.a(new l2z(this, file, l));
    }

    public final void a() {
        sa7 sa7Var = (sa7) this.a.getValue();
        if (sa7Var != null) {
            dyj dyjVar = sa7Var.a;
            synchronized (dyjVar) {
                try {
                    dyjVar.k();
                    for (rxj rxjVar : (rxj[]) dyjVar.B.values().toArray(new rxj[0])) {
                        dyjVar.G(rxjVar);
                    }
                    dyjVar.H = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final g7u0 b(tig0 tig0Var) {
        String str;
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h((String) tig0Var.a);
        Map map = (Map) tig0Var.b;
        final StaticRemoteStorage$headers$1 staticRemoteStorage$headers$1 = new StaticRemoteStorage$headers$1(2, t4j0Var, t4j0.class, "addHeader", "addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", 0);
        map.forEach(new BiConsumer() { // from class: gom.yandex.go.web.statics.data.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((StaticRemoteStorage$headers$1) wls.this).invoke(obj, obj2);
            }
        });
        kvj0 execute = ((nci0) ((OkHttpClient) this.b.getValue()).newCall(new d5j0(t4j0Var))).execute();
        rvj0 rvj0Var = execute.z;
        try {
            wg10 contentType = rvj0Var.contentType();
            String str2 = null;
            if (contentType != null) {
                str = contentType.b + "/" + contentType.c;
            } else {
                str = null;
            }
            if (contentType != null) {
                Regex regex = wg10.e;
                Charset a = contentType.a(null);
                if (a != null) {
                    str2 = a.name();
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            kotlin.collections.b.p(linkedHashMap, execute.y);
            linkedHashMap.put("static-source", execute.C != null ? "cache" : execute.B != null ? "network" : "unknown");
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            g7u0 g7u0Var = new g7u0(str, str2, kotlin.collections.b.t(linkedHashMap), new ByteArrayInputStream(rvj0Var.bytes()));
            execute.close();
            return g7u0Var;
        } finally {
        }
    }

    public final g7u0 c(tig0 tig0Var) {
        Object failure;
        try {
            failure = b(tig0Var);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (g7u0) failure;
    }
}
