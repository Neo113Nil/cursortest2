package ru.yandex.taxi.delegates;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.a60;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.j5j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.eatskit.dto.BluetoothError;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delegates.EatsKitBluetoothDelegate$requestBluetoothEnable$1", f = "EatsKitBluetoothDelegate.kt", l = {104, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EatsKitBluetoothDelegate$requestBluetoothEnable$1 extends SuspendLambda implements wls {
    final /* synthetic */ BluetoothAdapter $bluetoothAdapter;
    final /* synthetic */ gcn $callback;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitBluetoothDelegate$requestBluetoothEnable$1(a aVar, BluetoothAdapter bluetoothAdapter, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$bluetoothAdapter = bluetoothAdapter;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitBluetoothDelegate$requestBluetoothEnable$1(this.this$0, this.$bluetoothAdapter, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitBluetoothDelegate$requestBluetoothEnable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (ru.yandex.taxi.delegates.a.a(r8, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v7j0 v7j0Var = this.this$0.f;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) v7j0Var).d(10, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (this.$bluetoothAdapter.isEnabled()) {
                    gcn gcnVar = this.$callback;
                    this.this$0.getClass();
                    gcnVar.a(new ck7(new j5j0(true, null), null));
                    this.this$0.d.a(BiometricsAnalytics$BiometricsFlowType.BtRequestEnable, BiometricsAnalytics$BiometricsFlowResult.Success, null);
                    return zy11Var;
                }
                gcn gcnVar2 = this.$callback;
                this.this$0.getClass();
                gcnVar2.a(new ck7(new j5j0(false, BluetoothError.USER_DENIED), null));
                this.this$0.d.a(BiometricsAnalytics$BiometricsFlowType.BtRequestEnable, BiometricsAnalytics$BiometricsFlowResult.Failed, BiometricsAnalytics$BiometricsFlowFailureReason.BtEnableRefused);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            a60 a60Var = (a60) this.this$0.c;
            a60Var.getClass();
            try {
                a60Var.e(HProv.PP_DELETE_KEYSET, new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
            } catch (ActivityNotFoundException unused) {
            }
            a aVar = this.this$0;
            this.label = 2;
        }
        gcn gcnVar22 = this.$callback;
        this.this$0.getClass();
        gcnVar22.a(new ck7(new j5j0(false, BluetoothError.USER_DENIED), null));
        this.this$0.d.a(BiometricsAnalytics$BiometricsFlowType.BtRequestEnable, BiometricsAnalytics$BiometricsFlowResult.Failed, BiometricsAnalytics$BiometricsFlowFailureReason.BtEnableRefused);
        return zy11Var;
    }
}
