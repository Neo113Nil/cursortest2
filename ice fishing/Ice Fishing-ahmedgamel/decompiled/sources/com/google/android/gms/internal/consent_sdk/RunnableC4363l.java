package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4363l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36478n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f36479u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f36480v;

    public /* synthetic */ RunnableC4363l(int i, Object obj, Object obj2) {
        this.f36478n = i;
        this.f36479u = obj;
        this.f36480v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        switch (this.f36478n) {
            case 0:
                AtomicReference atomicReference = ((C4371n) this.f36479u).f36494c;
                Objects.requireNonNull(atomicReference);
                ((C4359k) this.f36480v).b(new C4409w2(2, atomicReference), new J1(22));
                return;
            default:
                C4383q c4383q = (C4383q) this.f36479u;
                String str = (String) this.f36480v;
                synchronized (E.class) {
                    if (E.f36273a == null) {
                        try {
                            c4383q.evaluateJavascript("(function(){})()", null);
                            E.f36273a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            E.f36273a = Boolean.FALSE;
                        }
                    }
                    booleanValue = E.f36273a.booleanValue();
                }
                if (booleanValue) {
                    c4383q.evaluateJavascript(str, null);
                    return;
                } else {
                    c4383q.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
