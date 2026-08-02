package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3177ep implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30767n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f30768u;

    public /* synthetic */ C3177ep(int i, Object obj) {
        this.f30767n = i;
        this.f30768u = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f30767n) {
            case 0:
                C3553lp c3553lp = (C3553lp) this.f30768u;
                InterfaceC3983to interfaceC3983to = c3553lp.f32633c;
                interfaceC3983to.getClass();
                Iterator it = c3553lp.f32634d.iterator();
                while (it.hasNext()) {
                    C2599Go c2599Go = (C2599Go) it.next();
                    if (!c2599Go.f25894d && c2599Go.f25893c) {
                        XO u6 = c2599Go.f25892b.u();
                        c2599Go.f25892b = new M.h(5);
                        c2599Go.f25893c = false;
                        interfaceC3983to.a(c2599Go.f25891a, u6);
                    }
                    C3235ft c3235ft = c3553lp.f32632b;
                    c3235ft.getClass();
                    if (c3235ft.f31231a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                C4323b c4323b = (C4323b) this.f30768u;
                c4323b.getClass();
                int i = message.what;
                if (i == 1) {
                    ((C3879rs) c4323b.f36422f).a();
                    break;
                } else if (i == 2) {
                    ((C4203xs) c4323b.f36423g).a();
                    break;
                } else if (i == 3) {
                    ((As) c4323b.f36424h).a();
                    break;
                } else if (i == 4) {
                    ((Fs) c4323b.i).a();
                    break;
                }
                break;
        }
        return true;
    }
}
