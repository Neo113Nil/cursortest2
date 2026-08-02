package defpackage;

import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.concurrent.futures.b;
import com.squareup.moshi.Moshi;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.payment.divkit.sbp.DKSbpFragment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes15.dex */
public final /* synthetic */ class uf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;

    public /* synthetic */ uf4(boolean z, ViewGroup viewGroup, SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView) {
        this.a = 7;
        this.c = z;
        this.b = viewGroup;
        this.w = superAppDiscoveryMapV2ModalView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [im7, jur] */
    @Override // java.lang.Runnable
    public final void run() {
        FileInputStream fileInputStream;
        char[] cArr;
        BufferedReader bufferedReader;
        StringBuilder sb;
        boolean z;
        int i = 1;
        BackendConfig backendConfig = null;
        switch (this.a) {
            case 0:
                wf4 wf4Var = (wf4) this.b;
                File file = (File) this.w;
                boolean z2 = this.c;
                file.exists();
                z83.i();
                file.isFile();
                z83.i();
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        cArr = new char[2048];
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                        sb = new StringBuilder(fileInputStream.available());
                    } finally {
                    }
                } catch (Throwable th) {
                    wf4Var.a.reportError("backend config error", th);
                }
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read == -1) {
                        BackendConfig backendConfig2 = (BackendConfig) ((Moshi) wf4Var.b.get()).adapter(BackendConfig.class).fromJson(sb.toString());
                        fileInputStream.close();
                        backendConfig = backendConfig2;
                        if (backendConfig == null) {
                            return;
                        }
                        wf4Var.B.post(new uf4(wf4Var, backendConfig, z2, i));
                        return;
                    }
                    sb.append(cArr, 0, read);
                }
            case 1:
                wf4 wf4Var2 = (wf4) this.b;
                BackendConfig backendConfig3 = (BackendConfig) this.w;
                boolean z3 = this.c;
                Looper looper = wf4Var2.c;
                z83.g(null, looper, Looper.myLooper());
                if (wf4Var2.y.d.get()) {
                    return;
                }
                if (z3) {
                    SharedPreferences.Editor edit = wf4Var2.A.edit();
                    wf4Var2.x.getClass();
                    edit.putLong("last_config_request_time", System.currentTimeMillis()).apply();
                }
                z83.g(null, looper, Looper.myLooper());
                wf4Var2.C = backendConfig3;
                zq60 zq60Var = wf4Var2.z;
                zq60Var.getClass();
                ArrayList arrayList = zq60Var.a;
                zq60Var.b++;
                int size = arrayList.size();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    int i3 = i2;
                    while (i3 < size && arrayList.get(i3) == null) {
                        i3++;
                    }
                    if (i3 < size) {
                        z = true;
                    } else {
                        if (!z4) {
                            zq60.a(zq60Var);
                            z4 = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                    while (i2 < size && arrayList.get(i2) == null) {
                        i2++;
                    }
                    if (i2 >= size) {
                        if (!z4) {
                            zq60.a(zq60Var);
                        }
                        ny61.p();
                        return;
                    } else {
                        int i4 = i2 + 1;
                        vf4 vf4Var = (vf4) arrayList.get(i2);
                        z83.g(null, vf4Var.c.c, Looper.myLooper());
                        uzd uzdVar = vf4Var.a;
                        if (uzdVar != null) {
                            uzdVar.b(backendConfig3);
                        }
                        i2 = i4;
                    }
                }
            case 2:
                BaseAddressSearchView.setActiveInputListeners$lambda$4((AddressInputComponent) this.b, (BaseAddressSearchView) this.w, this.c);
                return;
            case 3:
                DKSbpFragment.setupContainersViews$lambda$0$4((duf) this.b, (DKSbpFragment) this.w, this.c);
                return;
            case 4:
                final mur murVar = (mur) this.b;
                boolean z5 = this.c;
                final b bVar = (b) this.w;
                murVar.a.B(murVar.w);
                murVar.v = z5;
                if (!murVar.d) {
                    bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                final long F = murVar.a.F();
                ?? r3 = new im7() { // from class: jur
                    @Override // defpackage.im7
                    public final boolean b(TotalCaptureResult totalCaptureResult) {
                        boolean z6 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                        sgb1.g(3, "FocusMeteringControl");
                        if (z6 != mur.this.v || !androidx.camera.camera2.internal.b.A(totalCaptureResult, F)) {
                            return false;
                        }
                        sgb1.g(3, "FocusMeteringControl");
                        bVar.b(null);
                        return true;
                    }
                };
                murVar.w = r3;
                murVar.a.r(r3);
                return;
            case 5:
                hsf0 hsf0Var = (hsf0) this.b;
                boolean z6 = this.c;
                Runnable runnable = (Runnable) this.w;
                if (hsf0Var.b.d()) {
                    hsf0Var.f = null;
                    if (z6) {
                        hsf0Var.f();
                    }
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((ShortcutsView) this.b).onShortcutItemsCommitted((f1z) this.w, this.c);
                return;
            default:
                boolean z7 = this.c;
                ViewGroup viewGroup = (ViewGroup) this.b;
                SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView = (SuperAppDiscoveryMapV2ModalView) this.w;
                if (!z7) {
                    viewGroup.setVisibility(8);
                }
                superAppDiscoveryMapV2ModalView.updateMapViewportInsets();
                return;
        }
    }

    public /* synthetic */ uf4(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.w = obj2;
    }

    public /* synthetic */ uf4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = z;
    }
}
