package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class iv1 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public Object d;

    public iv1(boolean z) {
        xdr a = ydr.a(Boolean.valueOf(z));
        this.b = a;
        this.c = a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qyf qyfVar;
        switch (this.a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((hzr) this.c).e(new he0(6, this));
                    break;
                }
                break;
            default:
                intent.getClass();
                if (c.o(intent.getAction(), "android.nfc.action.ADAPTER_STATE_CHANGED", false)) {
                    int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
                    Continuation continuation = null;
                    if (intExtra == 1) {
                        qyf qyfVar2 = (qyf) this.d;
                        if (qyfVar2 != null) {
                            x97.y(qyfVar2, null, null, new c6j(this, continuation, 1), 3);
                            break;
                        }
                    } else if (intExtra == 2) {
                        qyf qyfVar3 = (qyf) this.d;
                        if (qyfVar3 != null) {
                            x97.y(qyfVar3, null, null, new c6j(this, continuation, 2), 3);
                            break;
                        }
                    } else if (intExtra == 3) {
                        qyf qyfVar4 = (qyf) this.d;
                        if (qyfVar4 != null) {
                            x97.y(qyfVar4, null, null, new c6j(this, continuation, 0), 3);
                            break;
                        }
                    } else if (intExtra == 4 && (qyfVar = (qyf) this.d) != null) {
                        x97.y(qyfVar, null, null, new c6j(this, continuation, 3), 3);
                        break;
                    }
                }
                break;
        }
    }

    public iv1(z0j z0jVar, hzr hzrVar, urb urbVar) {
        this.d = z0jVar;
        this.c = hzrVar;
        this.b = urbVar;
    }
}
