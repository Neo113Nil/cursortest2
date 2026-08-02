package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import defpackage.q7y;
import defpackage.v551;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.location.WifiScanner$receiver$1;

/* loaded from: classes9.dex */
public final class v551 {
    public final Context a;
    public final WifiManager b;
    public final q7y c;
    public r0 d;
    public final WifiScanner$receiver$1 e = new BroadcastReceiver() { // from class: ru.yandex.taxi.location.WifiScanner$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            v551 v551Var = v551.this;
            r0 r0Var = v551Var.d;
            if (r0Var == null) {
                v551Var.c.getClass();
                return;
            }
            try {
                List<ScanResult> scanResults = v551Var.b.getScanResults();
                if (scanResults == null) {
                    scanResults = EmptyList.a;
                }
                r0Var.m(null, scanResults);
            } catch (Exception e) {
                v551.this.c.getClass();
                q7y.a(e, "Wifi: Failed to get scan results");
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [ru.yandex.taxi.location.WifiScanner$receiver$1] */
    public v551(Context context, WifiManager wifiManager, q7y q7yVar) {
        this.a = context;
        this.b = wifiManager;
        this.c = q7yVar;
    }
}
