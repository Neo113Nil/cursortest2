package com.anythink.core.common.m.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15336a = "HttpLoaderInterceptor";

    /* renamed from: b, reason: collision with root package name */
    private final Context f15337b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, i> f15338c;

    /* renamed from: d, reason: collision with root package name */
    private final a f15339d;

    public g(Context context) {
        context = context instanceof Activity ? context.getApplicationContext() : context;
        this.f15337b = context;
        this.f15338c = new ConcurrentHashMap();
        this.f15339d = new a(context);
    }

    @Override // com.anythink.core.common.m.c.i
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        i a9;
        if (this.f15337b != null && dVar != null) {
            try {
                a aVar = this.f15339d;
                r1 = aVar != null ? aVar.a(dVar) : null;
                return ((r1 == null || !r1.e()) && (a9 = a(this.f15337b, dVar)) != null) ? a9.a(dVar) : r1;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return r1;
    }

    @Override // com.anythink.core.common.m.c.i
    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        if (this.f15337b == null || fVar == null || dVar == null) {
            return;
        }
        try {
            a aVar = this.f15339d;
            if (aVar != null) {
                aVar.a(fVar, dVar);
            }
            i a9 = a(this.f15337b, dVar);
            if (a9 != null) {
                a9.a(fVar, dVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private i a(Context context, com.anythink.core.common.m.b.d dVar) {
        char c9;
        i iVar = null;
        if (dVar == null || this.f15338c == null) {
            return null;
        }
        String b9 = dVar.b();
        i iVar2 = this.f15338c.get(b9);
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(b9)) {
                    switch (b9.hashCode()) {
                        case 261237151:
                            if (b9.equals(com.anythink.core.common.m.b.g.f15309f)) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1584672721:
                            if (b9.equals(com.anythink.core.common.m.b.g.f15305b)) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1899111790:
                            if (b9.equals(com.anythink.core.common.m.b.g.f15306c)) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1976115158:
                            if (b9.equals(com.anythink.core.common.m.b.g.f15307d)) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    if (c9 == 0) {
                        iVar = new b(context);
                    } else if (c9 == 1) {
                        iVar = new f(context);
                    } else if (c9 == 2) {
                        iVar = new c(context);
                    } else if (c9 == 3) {
                        iVar = new e(context);
                    }
                    if (iVar != null) {
                        this.f15338c.put(b9, iVar);
                    }
                }
            } finally {
            }
        }
        return iVar;
    }

    private i a(Context context, String str) {
        i iVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "get_cdn_domain":
                iVar = new e(context);
                break;
            case "app_strategy":
                iVar = new b(context);
                break;
            case "eu_traffic":
                iVar = new f(context);
                break;
            case "get_area":
                iVar = new c(context);
                break;
        }
        if (iVar != null) {
            this.f15338c.put(str, iVar);
        }
        return iVar;
    }
}
