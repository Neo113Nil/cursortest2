package Z5;

import b6.InterfaceC0519a;
import b6.InterfaceC0520b;
import com.onesignal.common.j;
import com.onesignal.user.internal.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c {
    private final InterfaceC0520b _fallbackPushSub;
    private final List<b6.e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends b6.e> collection, InterfaceC0520b _fallbackPushSub) {
        h.e(collection, "collection");
        h.e(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    public final InterfaceC0519a getByEmail(String email) {
        Object obj;
        h.e(email, "email");
        String hash = j.INSTANCE.hash(email);
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b6.e eVar = (InterfaceC0519a) obj;
            h.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((i) eVar).getModel().getAddress();
            if (h.a(address, email) || h.a(address, hash)) {
                break;
            }
        }
        return (InterfaceC0519a) obj;
    }

    public final b6.d getBySMS(String sms) {
        Object obj;
        h.e(sms, "sms");
        String hash = j.INSTANCE.hash(sms);
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b6.e eVar = (b6.d) obj;
            h.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((i) eVar).getModel().getAddress();
            if (h.a(address, sms) || h.a(address, hash)) {
                break;
            }
        }
        return (b6.d) obj;
    }

    public final List<b6.e> getCollection() {
        return this.collection;
    }

    public final List<InterfaceC0519a> getEmails() {
        List<b6.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC0519a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final InterfaceC0520b getPush() {
        List<b6.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC0520b) {
                arrayList.add(obj);
            }
        }
        InterfaceC0520b interfaceC0520b = (InterfaceC0520b) (arrayList.isEmpty() ? null : arrayList.get(0));
        return interfaceC0520b == null ? this._fallbackPushSub : interfaceC0520b;
    }

    public final List<b6.d> getSmss() {
        List<b6.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b6.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
