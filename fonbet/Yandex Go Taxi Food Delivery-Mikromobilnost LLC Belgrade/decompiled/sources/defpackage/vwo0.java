package defpackage;

import com.yandex.go.scooters.subscription.api.ScootersSubscriptionPayload$SubscriptionFromScreen;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class vwo0 {
    public final sh41 a;
    public final u8w b;

    public vwo0(sh41 sh41Var, u8w u8wVar) {
        this.a = sh41Var;
        this.b = u8wVar;
    }

    public final void a(ScootersSubscriptionPayload$SubscriptionFromScreen scootersSubscriptionPayload$SubscriptionFromScreen, String str) {
        String str2;
        int i = uwo0.a[scootersSubscriptionPayload$SubscriptionFromScreen.ordinal()];
        if (i == 1) {
            str2 = "discovery";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str2 = "offer";
        }
        u8w u8wVar = this.b;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("from_screen", str2);
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        u8wVar.a.a("ScootersSubscriptionCard.Shown", hashMap, 1, new HashMap());
    }
}
