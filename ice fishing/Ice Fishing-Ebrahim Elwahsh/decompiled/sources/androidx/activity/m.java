package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import e.C4466e;
import e.InterfaceC4463b;
import g1.C4524d;
import java.io.Serializable;
import r0.C4952a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4569n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4570u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4571v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4572w;

    public /* synthetic */ m(int i, int i4, Object obj, Object obj2) {
        this.f4569n = i4;
        this.f4570u = obj;
        this.f4571v = i;
        this.f4572w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4569n) {
            case 0:
                Object obj = ((C4524d) this.f4572w).f37858u;
                n nVar = (n) this.f4570u;
                String str = (String) nVar.f37222a.get(Integer.valueOf(this.f4571v));
                if (str != null) {
                    C4466e c4466e = (C4466e) nVar.f37226e.get(str);
                    if ((c4466e != null ? c4466e.f37215a : null) != null) {
                        InterfaceC4463b interfaceC4463b = c4466e.f37215a;
                        if (nVar.f37225d.remove(str)) {
                            interfaceC4463b.g(obj);
                            break;
                        }
                    } else {
                        nVar.f37228g.remove(str);
                        nVar.f37227f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((n) this.f4570u).a(this.f4571v, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f4572w));
                break;
            default:
                ((C4952a) this.f4570u).f40199b.e(this.f4571v, (Serializable) this.f4572w);
                break;
        }
    }
}
