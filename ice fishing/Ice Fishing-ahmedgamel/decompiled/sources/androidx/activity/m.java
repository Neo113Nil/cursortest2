package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import e.C4470e;
import e.InterfaceC4467b;
import i1.C4586c;
import java.io.Serializable;
import r0.C4892a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4422n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4423u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4424v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4425w;

    public /* synthetic */ m(int i, int i4, Object obj, Object obj2) {
        this.f4422n = i4;
        this.f4423u = obj;
        this.f4424v = i;
        this.f4425w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4422n) {
            case 0:
                Object obj = ((C4586c) this.f4425w).f38154u;
                n nVar = (n) this.f4423u;
                String str = (String) nVar.f37199a.get(Integer.valueOf(this.f4424v));
                if (str != null) {
                    C4470e c4470e = (C4470e) nVar.f37203e.get(str);
                    if ((c4470e != null ? c4470e.f37192a : null) != null) {
                        InterfaceC4467b interfaceC4467b = c4470e.f37192a;
                        if (nVar.f37202d.remove(str)) {
                            interfaceC4467b.f(obj);
                            break;
                        }
                    } else {
                        nVar.f37205g.remove(str);
                        nVar.f37204f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((n) this.f4423u).a(this.f4424v, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f4425w));
                break;
            default:
                ((C4892a) this.f4423u).f40108b.a(this.f4424v, (Serializable) this.f4425w);
                break;
        }
    }
}
