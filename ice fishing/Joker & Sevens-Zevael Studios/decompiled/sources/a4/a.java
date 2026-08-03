package a4;

import android.content.Intent;
import android.content.IntentSender;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f214g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f215h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f216i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f217j;

    public /* synthetic */ a(int i10, int i11, Object obj, Object obj2) {
        this.f214g = i11;
        this.f216i = obj;
        this.f215h = i10;
        this.f217j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f214g) {
            case 0:
                ((b) this.f216i).f219b.i(this.f215h, this.f217j);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                n nVar = (n) this.f216i;
                Object obj = ((h.a) this.f217j).f2590a;
                String str = (String) nVar.f1502a.get(Integer.valueOf(this.f215h));
                if (str != null) {
                    g.b bVar = (g.b) nVar.f1506e.get(str);
                    if ((bVar != null ? bVar.f2402a : null) != null) {
                        c6.f fVar = bVar.f2402a;
                        if (nVar.f1505d.remove(str)) {
                            fVar.g(obj);
                            break;
                        }
                    } else {
                        nVar.f1508g.remove(str);
                        nVar.f1507f.put(str, obj);
                        break;
                    }
                }
                break;
            default:
                ((n) this.f216i).a(this.f215h, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f217j));
                break;
        }
    }
}
