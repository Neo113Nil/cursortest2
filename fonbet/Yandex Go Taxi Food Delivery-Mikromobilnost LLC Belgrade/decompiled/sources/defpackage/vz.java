package defpackage;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.mlkit.common.MlKitException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptContent;
import com.ybsdk.feature.pin.internal.domain.biometric.a;
import defpackage.cw5;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import kotlin.Pair;
import org.altbeacon.beacon.service.scanner.b;

/* loaded from: classes11.dex */
public final class vz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ vz(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.a = i;
        this.y = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean dataInternal;
        AtomicReference atomicReference;
        j5b1 j5b1Var;
        zzgb zzgbVar;
        ieb1 ieb1Var;
        zzgb zzgbVar2;
        switch (this.a) {
            case 0:
                b00.a((b00) this.b).a(new tw00((ChatRequest) this.c, (WeakReference) this.w, (ServerMessageRef) this.x, (g720) this.y));
                return;
            case 1:
                View view = (View) this.b;
                if (view.isAttachedToWindow()) {
                    ey5 ey5Var = (ey5) this.c;
                    a aVar = (a) this.w;
                    Context context = view.getContext();
                    BiometricHelper$PromptContent biometricHelper$PromptContent = (BiometricHelper$PromptContent) this.x;
                    aVar.getClass();
                    by5 by5Var = new by5();
                    by5Var.a = d.a(context, biometricHelper$PromptContent.getTitle());
                    by5Var.b = d.a(context, biometricHelper$PromptContent.getNegativeButtonText());
                    by5Var.d = 15;
                    by5Var.c = false;
                    ey5Var.a(by5Var.a(), new ay5((Cipher) this.y));
                    return;
                }
                return;
            case 2:
                ScanCallback scanCallback = (ScanCallback) this.c;
                BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) this.b;
                b bVar = (b) this.y;
                try {
                    if (bVar.F) {
                        bluetoothLeScanner.stopScan(scanCallback);
                        bVar.F = false;
                    }
                    bluetoothLeScanner.startScan((ArrayList) this.w, (ScanSettings) this.x, scanCallback);
                    bVar.F = true;
                    return;
                } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                    return;
                }
            case 3:
                final com.yandex.div.core.util.binding.a aVar2 = (com.yandex.div.core.util.binding.a) this.b;
                final bw5 a = aVar2.b.a();
                try {
                    try {
                        aVar2.d = true;
                        ArrayList arrayList = aVar2.e;
                        Div2View div2View = (Div2View) this.w;
                        dataInternal = div2View.setDataInternal((omk) this.x, div2View.get_divData(), (zmk) this.y);
                        Boolean valueOf = Boolean.valueOf(dataInternal);
                        List J0 = kotlin.collections.a.J0(arrayList);
                        arrayList.clear();
                        Pair pair = new Pair(valueOf, J0);
                        aVar2.d = false;
                        final Object first = pair.getFirst();
                        final List list = (List) pair.getSecond();
                        if (list.isEmpty() && ((tls) this.c) == null) {
                            cw5.b(a);
                            return;
                        }
                        ngd0 ngd0Var = ngd0.G;
                        final tls tlsVar = (tls) this.c;
                        ngd0Var.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$setDataAsync$$inlined$runOnBindingThread$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                com.yandex.div.core.util.binding.a.this.b.d();
                                try {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ((sls) it.next()).invoke();
                                    }
                                    tls tlsVar2 = tlsVar;
                                    if (tlsVar2 != null) {
                                        tlsVar2.invoke(first);
                                    }
                                    cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                                    cw5.b(a);
                                    return zy11.a;
                                } catch (Throwable th) {
                                    cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                    cw5.b(a);
                                    throw th;
                                }
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        cw5.b(a);
                        throw th;
                    }
                } catch (Throwable th2) {
                    aVar2.d = false;
                    throw th2;
                }
            case 4:
                ((OrderStackViewsController) this.b).c((View) this.c, (OrderStackMvpView.AnimationType) this.w, (Runnable) this.x, (OrderStackViewsController.TranslationDirection) this.y);
                return;
            case 5:
                ((zzjd) this.b).zzH((zzr) this.c, (Bundle) this.w, (zzge) this.x, (String) this.y);
                return;
            case 6:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            j5b1Var = (j5b1) this.y;
                            zzgbVar = j5b1Var.x;
                        } catch (Throwable th3) {
                            ((AtomicReference) this.b).notify();
                            throw th3;
                        }
                    } catch (RemoteException e) {
                        y1a1 y1a1Var = ((g) ((j5b1) this.y).b).y;
                        g.g(y1a1Var);
                        y1a1Var.z.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.c, e);
                        ((AtomicReference) this.b).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.b;
                    }
                    if (zzgbVar == null) {
                        y1a1 y1a1Var2 = ((g) j5b1Var.b).y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.c, (String) this.w);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(zzgbVar.zzr((String) this.c, (String) this.w, (zzr) this.x));
                    } else {
                        atomicReference2.set(zzgbVar.zzs(null, (String) this.c, (String) this.w));
                    }
                    j5b1Var.Tg();
                    atomicReference = (AtomicReference) this.b;
                    atomicReference.notify();
                    return;
                }
            case 7:
                zzcu zzcuVar = (zzcu) this.x;
                String str = (String) this.c;
                String str2 = (String) this.b;
                j5b1 j5b1Var2 = (j5b1) this.y;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        zzgbVar2 = j5b1Var2.x;
                    } catch (Throwable th4) {
                        ieb1 ieb1Var2 = ((g) j5b1Var2.b).B;
                        g.e(ieb1Var2);
                        ieb1Var2.th(zzcuVar, arrayList2);
                        throw th4;
                    }
                } catch (RemoteException e2) {
                    y1a1 y1a1Var3 = ((g) j5b1Var2.b).y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.d("Failed to get conditional properties; remote exception", str2, str, e2);
                }
                if (zzgbVar2 != null) {
                    arrayList2 = ieb1.uh(zzgbVar2.zzr(str2, str, (zzr) this.w));
                    j5b1Var2.Tg();
                    ieb1Var = ((g) j5b1Var2.b).B;
                    g.e(ieb1Var);
                    ieb1Var.th(zzcuVar, arrayList2);
                    return;
                }
                g gVar = (g) j5b1Var2.b;
                y1a1 y1a1Var4 = gVar.y;
                g.g(y1a1Var4);
                y1a1Var4.z.c("Failed to get conditional properties; not connected to service", str2, str);
                ieb1Var = gVar.B;
                g.e(ieb1Var);
                ieb1Var.th(zzcuVar, arrayList2);
                return;
            default:
                u430 u430Var = (u430) this.b;
                CancellationToken cancellationToken = (CancellationToken) this.c;
                x18 x18Var = (x18) this.w;
                Callable callable = (Callable) this.x;
                atx0 atx0Var = (atx0) this.y;
                AtomicBoolean atomicBoolean = u430Var.c;
                try {
                    if (cancellationToken.a()) {
                        x18Var.a();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            u430Var.b();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken.a()) {
                            x18Var.a();
                            return;
                        }
                        Object call = callable.call();
                        if (cancellationToken.a()) {
                            x18Var.a();
                            return;
                        } else {
                            atx0Var.a(call);
                            return;
                        }
                    } catch (RuntimeException e3) {
                        throw new MlKitException(13, e3, "Internal error has occurred when executing ML Kit tasks");
                    }
                } catch (Exception e4) {
                    if (cancellationToken.a()) {
                        x18Var.a();
                        return;
                    } else {
                        atx0Var.a.r(e4);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ vz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }
}
