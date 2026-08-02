package ru.yandex.taxi.masstransit.geopayment.repository;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import defpackage.dm30;
import defpackage.fm30;
import defpackage.hm30;
import defpackage.j26;
import defpackage.mr30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rj40;
import defpackage.tj40;
import defpackage.tse;
import defpackage.u26;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.domain.ResponseLoadingState;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.repository.MtGeoVehiclesRepository$refreshScan$1", f = "MtGeoVehiclesRepository.kt", l = {HProv.PP_HASHOID, 114}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtGeoVehiclesRepository$refreshScan$1 extends SuspendLambda implements wls {
    final /* synthetic */ u26 $bleScanSettings;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoVehiclesRepository$refreshScan$1(d dVar, u26 u26Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$bleScanSettings = u26Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoVehiclesRepository$refreshScan$1(this.this$0, this.$bleScanSettings, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoVehiclesRepository$refreshScan$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0044, code lost:
    
        if (r15 == r1) goto L72;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Object value;
        Object value2;
        BluetoothAdapter bluetoothAdapter;
        boolean z;
        Object value3;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            j26 j26Var = dVar.e;
            zzs a = j26Var.a();
            if (a == null) {
                a = zzs.f;
            }
            mr30 mr30Var = new mr30(a, j26Var.b());
            this.label = 1;
            obj = d.b(dVar, mr30Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        hm30 hm30Var = (hm30) obj;
        u26 u26Var = this.$bleScanSettings;
        if (u26Var == null || !(z = u26Var.a)) {
            this.this$0.k = false;
            fm30 fm30Var = hm30Var instanceof fm30 ? (fm30) hm30Var : null;
            if (fm30Var == null || (list = fm30Var.a) == null) {
                list = EmptyList.a;
            }
            com.yandex.go.masstransit.sdk.ble.impl.ble.c cVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            r0 r0Var = cVar.e;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, null));
            if (((BluetoothAdapter) cVar.a.a.b.getValue()) == null || (bluetoothAdapter = (BluetoothAdapter) cVar.a.a.b.getValue()) == null || !bluetoothAdapter.isEnabled() || !((com.yandex.go.permission.b) cVar.b.a.a).a(11) || list.isEmpty()) {
                r0 r0Var2 = cVar.e;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, EmptySet.a));
                cVar.a();
            } else {
                cVar.g = list;
                cVar.h.clear();
                cVar.i = cVar.b();
                if (cVar.d == null) {
                    BluetoothAdapter bluetoothAdapter2 = (BluetoothAdapter) cVar.a.a.b.getValue();
                    cVar.d = bluetoothAdapter2 != null ? bluetoothAdapter2.getBluetoothLeScanner() : null;
                }
                try {
                    BluetoothLeScanner bluetoothLeScanner = cVar.d;
                    if (bluetoothLeScanner != null) {
                        bluetoothLeScanner.stopScan(cVar.j);
                    }
                } catch (Throwable unused) {
                }
                BluetoothLeScanner bluetoothLeScanner2 = cVar.d;
                if (bluetoothLeScanner2 != null) {
                    bluetoothLeScanner2.startScan((List<ScanFilter>) null, cVar.b.b, cVar.j);
                }
            }
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (!(hm30Var instanceof dm30)) {
                if (hm30Var instanceof fm30) {
                    this.this$0.c.b(((fm30) hm30Var).a, new u26(z, u26Var.b, u26Var.c, u26Var.d, u26Var.e, u26Var.f, false));
                    return zy11Var;
                }
                w511.b();
                return null;
            }
            this.this$0.c.a();
            r0 r0Var3 = this.this$0.p;
            do {
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, new tj40(MtVehiclesResponse.c, ResponseLoadingState.ERROR, new rj40(((dm30) hm30Var).a))));
        }
        return zy11Var;
    }
}
