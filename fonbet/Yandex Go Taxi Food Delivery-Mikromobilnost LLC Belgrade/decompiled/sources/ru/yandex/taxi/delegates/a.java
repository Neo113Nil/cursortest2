package ru.yandex.taxi.delegates;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.j5j0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.ty5;
import defpackage.v7j0;
import defpackage.y50;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.eatskit.dto.BluetoothError;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final tse b;
    public final y50 c;
    public final ty5 d;
    public final g e;
    public final v7j0 f;

    public a(Context context, tse tseVar, y50 y50Var, ty5 ty5Var, g gVar, v7j0 v7j0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = y50Var;
        this.d = ty5Var;
        this.e = gVar;
        this.f = v7j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        EatsKitBluetoothDelegate$waitForBluetoothDialog$1 eatsKitBluetoothDelegate$waitForBluetoothDialog$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof EatsKitBluetoothDelegate$waitForBluetoothDialog$1) {
            eatsKitBluetoothDelegate$waitForBluetoothDialog$1 = (EatsKitBluetoothDelegate$waitForBluetoothDialog$1) continuationImpl;
            int i2 = eatsKitBluetoothDelegate$waitForBluetoothDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsKitBluetoothDelegate$waitForBluetoothDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsKitBluetoothDelegate$waitForBluetoothDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsKitBluetoothDelegate$waitForBluetoothDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = aVar.e.b;
                    eatsKitBluetoothDelegate$waitForBluetoothDialog$1.label = 1;
                    if (e.y(n0Var, eatsKitBluetoothDelegate$waitForBluetoothDialog$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        eatsKitBluetoothDelegate$waitForBluetoothDialog$1 = new EatsKitBluetoothDelegate$waitForBluetoothDialog$1(aVar, continuationImpl);
        Object obj2 = eatsKitBluetoothDelegate$waitForBluetoothDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsKitBluetoothDelegate$waitForBluetoothDialog$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void b(gcn gcnVar) {
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType = BiometricsAnalytics$BiometricsFlowType.BtRequestEnable;
        ty5 ty5Var = this.d;
        ty5Var.b(biometricsAnalytics$BiometricsFlowType);
        BluetoothAdapter r = qje.r(this.a);
        if (r == null) {
            gcnVar.a(new ck7(new j5j0(false, BluetoothError.NOT_SUPPORTED), null));
            ty5Var.a(biometricsAnalytics$BiometricsFlowType, BiometricsAnalytics$BiometricsFlowResult.Failed, BiometricsAnalytics$BiometricsFlowFailureReason.BtOff);
        } else if (r.isEnabled()) {
            gcnVar.a(new ck7(new j5j0(true, BluetoothError.ALREADY_ENABLED), null));
            ty5Var.a(biometricsAnalytics$BiometricsFlowType, BiometricsAnalytics$BiometricsFlowResult.Success, null);
        } else {
            tje.N(this.b, null, null, new EatsKitBluetoothDelegate$requestBluetoothEnable$1(this, r, gcnVar, null), 3);
        }
    }
}
