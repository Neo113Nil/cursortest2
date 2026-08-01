package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3154ep implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29978n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29979u;

    public /* synthetic */ C3154ep(int i, Object obj) {
        this.f29978n = i;
        this.f29979u = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f29978n) {
            case 0:
                C3530lp c3530lp = (C3530lp) this.f29979u;
                InterfaceC3906so interfaceC3906so = c3530lp.f31853c;
                interfaceC3906so.getClass();
                Iterator it = c3530lp.f31854d.iterator();
                while (it.hasNext()) {
                    C2562Fo c2562Fo = (C2562Fo) it.next();
                    if (!c2562Fo.f24848d && c2562Fo.f24847c) {
                        XO u3 = c2562Fo.f24846b.u();
                        c2562Fo.f24846b = new L3.h(5);
                        c2562Fo.f24847c = false;
                        interfaceC3906so.a(c2562Fo.f24845a, u3);
                    }
                    C3212ft c3212ft = c3530lp.f31852b;
                    c3212ft.getClass();
                    if (c3212ft.f30468a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                C4300b c4300b = (C4300b) this.f29979u;
                c4300b.getClass();
                int i = message.what;
                if (i == 1) {
                    ((C3856rs) c4300b.f35653f).a();
                    break;
                } else if (i == 2) {
                    ((C4180xs) c4300b.f35654g).a();
                    break;
                } else if (i == 3) {
                    ((As) c4300b.f35655h).a();
                    break;
                } else if (i == 4) {
                    ((Fs) c4300b.i).a();
                    break;
                }
                break;
        }
        return true;
    }
}
