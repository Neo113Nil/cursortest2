package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4340l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35709n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f35710u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f35711v;

    public /* synthetic */ RunnableC4340l(int i, Object obj, Object obj2) {
        this.f35709n = i;
        this.f35710u = obj;
        this.f35711v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        switch (this.f35709n) {
            case 0:
                AtomicReference atomicReference = ((C4348n) this.f35710u).f35725c;
                Objects.requireNonNull(atomicReference);
                ((C4336k) this.f35711v).b(new C4386w2(2, atomicReference), new J1(22));
                return;
            default:
                C4360q c4360q = (C4360q) this.f35710u;
                String str = (String) this.f35711v;
                synchronized (E.class) {
                    if (E.f35504a == null) {
                        try {
                            c4360q.evaluateJavascript("(function(){})()", null);
                            E.f35504a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            E.f35504a = Boolean.FALSE;
                        }
                    }
                    booleanValue = E.f35504a.booleanValue();
                }
                if (booleanValue) {
                    c4360q.evaluateJavascript(str, null);
                    return;
                } else {
                    c4360q.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
