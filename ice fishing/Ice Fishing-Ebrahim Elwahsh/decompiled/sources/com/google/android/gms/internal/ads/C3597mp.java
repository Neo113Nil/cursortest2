package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3597mp implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32758n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f32759u;

    public /* synthetic */ C3597mp(int i, Object obj) {
        this.f32758n = i;
        this.f32759u = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f32758n) {
            case 0:
                C3759pp c3759pp = (C3759pp) this.f32759u;
                InterfaceC2510Co interfaceC2510Co = c3759pp.f33514c;
                interfaceC2510Co.getClass();
                Iterator it = c3759pp.f33515d.iterator();
                while (it.hasNext()) {
                    C2765Ro c2765Ro = (C2765Ro) it.next();
                    if (!c2765Ro.f27426d && c2765Ro.f27425c) {
                        C3526lP u7 = c2765Ro.f27424b.u();
                        c2765Ro.f27424b = new M.h(5);
                        c2765Ro.f27425c = false;
                        interfaceC2510Co.C(c2765Ro.f27423a, u7);
                    }
                    C3709ot c3709ot = c3759pp.f33513b;
                    c3709ot.getClass();
                    if (c3709ot.f33230a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                C4313b c4313b = (C4313b) this.f32759u;
                c4313b.getClass();
                int i = message.what;
                if (i == 1) {
                    ((C4139ws) c4313b.f35816f).a();
                    break;
                } else if (i == 2) {
                    ((As) c4313b.f35817g).a();
                    break;
                } else if (i == 3) {
                    ((Es) c4313b.f35818h).a();
                    break;
                } else if (i == 4) {
                    ((Ms) c4313b.i).a();
                    break;
                }
                break;
        }
        return true;
    }
}
