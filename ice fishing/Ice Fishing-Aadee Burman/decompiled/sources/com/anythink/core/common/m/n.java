package com.anythink.core.common.m;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class n extends b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14680a = "n";

    /* renamed from: c, reason: collision with root package name */
    private final q f14682c;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f14686g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f14687h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14681b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f14683d = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private final List<a> f14684e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final int f14685f = 2;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f14688a;

        /* renamed from: b, reason: collision with root package name */
        String f14689b;

        /* renamed from: c, reason: collision with root package name */
        AdError f14690c;

        public a(int i, String str, AdError adError) {
            this.f14688a = i;
            this.f14689b = str;
            this.f14690c = adError;
        }
    }

    public n(q qVar) {
        this.f14682c = qVar;
    }

    private void a(int i, Object obj) {
        this.f14687h = true;
        if (this.f14682c == null || this.f14686g) {
            return;
        }
        this.f14686g = true;
        this.f14682c.onLoadFinish(i, obj);
    }

    private void b() {
        if (this.f14682c == null || this.f14686g) {
            return;
        }
        this.f14686g = true;
        StringBuilder sb = new StringBuilder();
        Iterator it = new ArrayList(this.f14684e).iterator();
        AdError adError = null;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(aVar.f14689b);
                } else {
                    sb.append(",");
                    sb.append(aVar.f14689b);
                }
                adError = aVar.f14690c;
            }
        }
        this.f14684e.clear();
        if (adError == null) {
            adError = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
        }
        this.f14682c.onLoadError(0, sb.toString(), adError);
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadError(int i, String str, AdError adError) {
        synchronized (this.f14681b) {
            try {
                this.f14684e.add(new a(i, str, adError));
                if (this.f14683d.incrementAndGet() == this.f14685f && this.f14682c != null && !this.f14686g) {
                    this.f14686g = true;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = new ArrayList(this.f14684e).iterator();
                    AdError adError2 = null;
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            if (TextUtils.isEmpty(sb.toString())) {
                                sb.append(aVar.f14689b);
                            } else {
                                sb.append(",");
                                sb.append(aVar.f14689b);
                            }
                            adError2 = aVar.f14690c;
                        }
                    }
                    this.f14684e.clear();
                    if (adError2 == null) {
                        adError2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
                    }
                    this.f14682c.onLoadError(0, sb.toString(), adError2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        synchronized (this.f14681b) {
            try {
                this.f14687h = true;
                if (this.f14682c != null && !this.f14686g) {
                    this.f14686g = true;
                    this.f14682c.onLoadFinish(i, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f14681b) {
            z3 = this.f14687h;
        }
        return z3;
    }
}
