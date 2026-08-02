package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jl40;
import defpackage.zc30;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.utils.MtBleAdapterWrapper$bluetoothReceiver$1;

/* loaded from: classes6.dex */
public final class zc30 {
    public final Context a;
    public final i3y b;
    public final r0 c;
    public final gci0 d;
    public final MtBleAdapterWrapper$bluetoothReceiver$1 e;

    /* JADX WARN: Type inference failed for: r2v10, types: [ru.yandex.taxi.masstransit.utils.MtBleAdapterWrapper$bluetoothReceiver$1] */
    public zc30(Context context) {
        this.a = context;
        i3y b = a.b(LazyThreadSafetyMode.NONE, new m020(16, this));
        this.b = b;
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) b.getValue();
        r0 c = bvf0.c(Boolean.valueOf(bluetoothAdapter != null ? bluetoothAdapter.isEnabled() : false));
        this.c = c;
        this.d = e.d(c);
        this.e = new BroadcastReceiver() { // from class: ru.yandex.taxi.masstransit.utils.MtBleAdapterWrapper$bluetoothReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (jl40.l(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra == 10) {
                        r0 r0Var = zc30.this.c;
                        Boolean bool = Boolean.FALSE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                        return;
                    }
                    if (intExtra != 12) {
                        return;
                    }
                    r0 r0Var2 = zc30.this.c;
                    Boolean bool2 = Boolean.TRUE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                }
            }
        };
    }
}
