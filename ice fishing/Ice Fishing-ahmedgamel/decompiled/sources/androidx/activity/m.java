package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import e.C4459e;
import e.InterfaceC4456b;
import java.io.Serializable;
import r0.C4943a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4454n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4455u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4456v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4457w;

    public /* synthetic */ m(int i, int i6, Object obj, Object obj2) {
        this.f4454n = i6;
        this.f4455u = obj;
        this.f4456v = i;
        this.f4457w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4454n) {
            case 0:
                Object obj = ((I0.j) this.f4457w).f1264u;
                n nVar = (n) this.f4455u;
                String str = (String) nVar.f37091a.get(Integer.valueOf(this.f4456v));
                if (str != null) {
                    C4459e c4459e = (C4459e) nVar.f37095e.get(str);
                    if ((c4459e != null ? c4459e.f37084a : null) != null) {
                        InterfaceC4456b interfaceC4456b = c4459e.f37084a;
                        if (nVar.f37094d.remove(str)) {
                            interfaceC4456b.g(obj);
                            break;
                        }
                    } else {
                        nVar.f37097g.remove(str);
                        nVar.f37096f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((n) this.f4455u).a(this.f4456v, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f4457w));
                break;
            default:
                ((C4943a) this.f4455u).f40297b.a(this.f4456v, (Serializable) this.f4457w);
                break;
        }
    }
}
