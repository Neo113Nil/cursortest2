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
    private static final String f15466a = "n";

    /* renamed from: c, reason: collision with root package name */
    private final q f15468c;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f15472g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f15473h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15467b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f15469d = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private final List<a> f15470e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final int f15471f = 2;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f15474a;

        /* renamed from: b, reason: collision with root package name */
        String f15475b;

        /* renamed from: c, reason: collision with root package name */
        AdError f15476c;

        public a(int i, String str, AdError adError) {
            this.f15474a = i;
            this.f15475b = str;
            this.f15476c = adError;
        }
    }

    public n(q qVar) {
        this.f15468c = qVar;
    }

    private void a(int i, Object obj) {
        this.f15473h = true;
        if (this.f15468c == null || this.f15472g) {
            return;
        }
        this.f15472g = true;
        this.f15468c.onLoadFinish(i, obj);
    }

    private void b() {
        if (this.f15468c == null || this.f15472g) {
            return;
        }
        this.f15472g = true;
        StringBuilder sb = new StringBuilder();
        Iterator it = new ArrayList(this.f15470e).iterator();
        AdError adError = null;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(aVar.f15475b);
                } else {
                    sb.append(",");
                    sb.append(aVar.f15475b);
                }
                adError = aVar.f15476c;
            }
        }
        this.f15470e.clear();
        if (adError == null) {
            adError = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
        }
        this.f15468c.onLoadError(0, sb.toString(), adError);
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadError(int i, String str, AdError adError) {
        synchronized (this.f15467b) {
            try {
                this.f15470e.add(new a(i, str, adError));
                if (this.f15469d.incrementAndGet() == this.f15471f && this.f15468c != null && !this.f15472g) {
                    this.f15472g = true;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = new ArrayList(this.f15470e).iterator();
                    AdError adError2 = null;
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            if (TextUtils.isEmpty(sb.toString())) {
                                sb.append(aVar.f15475b);
                            } else {
                                sb.append(",");
                                sb.append(aVar.f15475b);
                            }
                            adError2 = aVar.f15476c;
                        }
                    }
                    this.f15470e.clear();
                    if (adError2 == null) {
                        adError2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
                    }
                    this.f15468c.onLoadError(0, sb.toString(), adError2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        synchronized (this.f15467b) {
            try {
                this.f15473h = true;
                if (this.f15468c != null && !this.f15472g) {
                    this.f15472g = true;
                    this.f15468c.onLoadFinish(i, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f15467b) {
            z6 = this.f15473h;
        }
        return z6;
    }
}
