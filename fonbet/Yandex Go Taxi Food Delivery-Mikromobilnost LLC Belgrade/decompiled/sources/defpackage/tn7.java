package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.b;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class tn7 implements m0r0 {
    public final un7 a;
    public final dy40 b;
    public final AtomicInteger c = new AtomicInteger(100);
    public final AtomicInteger d = new AtomicInteger(3);
    public final HashSet e;
    public ar7 f;
    public sn7 g;

    public tn7(List list, un7 un7Var) {
        this.a = un7Var;
        this.e = sia1.h(list);
        un7Var.a();
        if (un7Var.c) {
            new dy40(3);
        }
        un7Var.a();
        if (un7Var.b) {
            this.b = new dy40(100);
        }
    }

    @Override // defpackage.m0r0
    public final void a(k8j0 k8j0Var) {
        throw new UnsupportedOperationException("Camera2ExtensionsSessionProcessor#onCaptureSessionStart should not be invoked!");
    }

    @Override // defpackage.m0r0
    public final void b() {
        throw new UnsupportedOperationException("Camera2ExtensionsSessionProcessor#onCaptureSessionEnd should not be invoked!");
    }

    @Override // defpackage.m0r0
    public final void c() {
        sn7 sn7Var;
        ar7 ar7Var = this.f;
        if (ar7Var == null || (sn7Var = this.g) == null) {
            return;
        }
        ar7Var.f(sn7Var);
    }

    @Override // defpackage.m0r0
    public final Map d(Size size) {
        List postviewSupportedSizes;
        un7 un7Var = this.a;
        un7Var.a();
        if (!un7Var.c()) {
            return b.f();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = {256, 35, Constants.INTENT_CONTAINER_ID};
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                try {
                    CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) un7Var.z;
                    if (cameraExtensionCharacteristics == null) {
                        cameraExtensionCharacteristics = null;
                    }
                    postviewSupportedSizes = cameraExtensionCharacteristics.getPostviewSupportedSizes(un7Var.a, size, i2);
                    if (!postviewSupportedSizes.isEmpty()) {
                        linkedHashMap.put(Integer.valueOf(i2), postviewSupportedSizes);
                    }
                } catch (IllegalArgumentException e) {
                    Log.e("Camera2ExtExtender", "Failed to retrieve postview supported output sizes of format " + i2, e);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.m0r0
    public final int e(q6x0 q6x0Var, l0r0 l0r0Var) {
        throw new UnsupportedOperationException("Camera2ExtensionsSessionProcessor#startRepeating should not be invoked!");
    }

    @Override // defpackage.m0r0
    public final void f(wn7 wn7Var) {
        throw new UnsupportedOperationException("Camera2ExtensionsSessionProcessor#setParameters should not be invoked!");
    }

    @Override // defpackage.m0r0
    public final void g() {
        throw new UnsupportedOperationException("Camera2ExtensionsSessionProcessor#stopRepeating should not be invoked!");
    }

    @Override // defpackage.m0r0
    public final jyq0 i(ar7 ar7Var, q74 q74Var) {
        this.f = ar7Var;
        this.g = new sn7(0, this);
        this.f.e(geb1.b(), this.g);
        return null;
    }

    @Override // defpackage.m0r0
    public final HashSet j() {
        return this.e;
    }

    @Override // defpackage.m0r0
    public final int k(boolean z, q6x0 q6x0Var, o3 o3Var) {
        throw new UnsupportedOperationException("Camera2ExtensionsSessionProcessor#startCapture should not be invoked!");
    }

    @Override // defpackage.m0r0
    public final List l() {
        Set<CameraCharacteristics.Key> keys;
        Object obj;
        un7 un7Var = this.a;
        int i = un7Var.a;
        un7Var.a();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) un7Var.z;
            if (cameraExtensionCharacteristics == null) {
                cameraExtensionCharacteristics = null;
            }
            keys = cameraExtensionCharacteristics.getKeys(i);
            for (CameraCharacteristics.Key key : keys) {
                CameraExtensionCharacteristics cameraExtensionCharacteristics2 = (CameraExtensionCharacteristics) un7Var.z;
                if (cameraExtensionCharacteristics2 == null) {
                    cameraExtensionCharacteristics2 = null;
                }
                obj = cameraExtensionCharacteristics2.get(i, key);
                if (obj != null) {
                    arrayList.add(Pair.create(key, obj));
                }
            }
        }
        return arrayList;
    }
}
