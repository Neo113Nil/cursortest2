package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class un7 implements b731 {
    public int a;
    public boolean b;
    public boolean c;
    public final Object w;
    public final Object x;
    public Object y;
    public Object z;

    public un7(w3i w3iVar, Handler handler, ExecutorService executorService) {
        this.z = new uz(28, this);
        this.a = -1;
        this.b = false;
        this.c = false;
        this.w = w3iVar;
        this.x = handler;
        this.y = executorService;
    }

    public void a() {
        d6z.y("VendorExtender#init() must be called first", ((String) this.y) != null);
    }

    public ArrayList b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            try {
                bc bcVar = (bc) this.w;
                String str = (String) this.y;
                if (str == null) {
                    str = null;
                }
                Size[] sizeArr = (Size[]) bcVar.e(this.a, i, str).toArray(new Size[0]);
                if (sizeArr.length != 0) {
                    arrayList.add(Pair.create(Integer.valueOf(i), sizeArr));
                }
            } catch (IllegalArgumentException e) {
                Log.e("Camera2ExtExtender", "Failed to retrieve supported output sizes of format " + i, e);
            }
        }
        return arrayList;
    }

    public boolean c() {
        bc bcVar = (bc) this.w;
        String str = (String) this.y;
        if (str == null) {
            str = null;
        }
        return bcVar.f(this.a, str);
    }

    @Override // defpackage.b731
    public List e() {
        a();
        return c() ? b(new int[]{256, 35, Constants.INTENT_CONTAINER_ID}) : EmptyList.a;
    }

    @Override // defpackage.b731
    public List g() {
        Set availableCaptureResultKeys;
        a();
        if (!c() || Build.VERSION.SDK_INT < 33) {
            return EmptyList.a;
        }
        CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.z;
        if (cameraExtensionCharacteristics == null) {
            cameraExtensionCharacteristics = null;
        }
        availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(this.a);
        return a.J0(availableCaptureResultKeys);
    }

    @Override // defpackage.b731
    public boolean h(String str, LinkedHashMap linkedHashMap) {
        return ((bc) this.w).f(this.a, str);
    }

    @Override // defpackage.b731
    public boolean j() {
        boolean isCaptureProcessProgressAvailable;
        a();
        if (c() && Build.VERSION.SDK_INT >= 34 && ((eyo) this.x).b == null) {
            try {
                CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.z;
                if (cameraExtensionCharacteristics == null) {
                    cameraExtensionCharacteristics = null;
                }
                isCaptureProcessProgressAvailable = cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(this.a);
                return isCaptureProcessProgressAvailable;
            } catch (IllegalArgumentException e) {
                Log.e("Camera2ExtExtender", "Failed to retrieve capture process progress availability", e);
            }
        }
        return false;
    }

    @Override // defpackage.b731
    public void l(ar7 ar7Var) {
        boolean z;
        Set availableCaptureResultKeys;
        CaptureResult.Key key;
        Set availableCaptureRequestKeys;
        CaptureRequest.Key key2;
        int i = this.a;
        String c = ar7Var.c();
        this.y = c;
        bc bcVar = (bc) this.w;
        if (c == null) {
            c = null;
        }
        this.z = hl1.C(bcVar.d(c));
        boolean z2 = false;
        if (!c() || Build.VERSION.SDK_INT < 34) {
            z = false;
        } else {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.z;
            if (cameraExtensionCharacteristics == null) {
                cameraExtensionCharacteristics = null;
            }
            availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
            key2 = CaptureRequest.EXTENSION_STRENGTH;
            z = availableCaptureRequestKeys.contains(key2);
        }
        this.b = z;
        if (c() && Build.VERSION.SDK_INT >= 34) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = (CameraExtensionCharacteristics) this.z;
            availableCaptureResultKeys = (cameraExtensionCharacteristics2 != null ? cameraExtensionCharacteristics2 : null).getAvailableCaptureResultKeys(i);
            key = CaptureResult.EXTENSION_CURRENT_TYPE;
            z2 = availableCaptureResultKeys.contains(key);
        }
        this.c = z2;
    }

    @Override // defpackage.b731
    public Size[] n() {
        a();
        return new Size[0];
    }

    @Override // defpackage.b731
    public List o() {
        a();
        return c() ? b(new int[]{34, 35}) : EmptyList.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    @Override // defpackage.b731
    public m0r0 p(Context context) {
        Set availableCaptureRequestKeys;
        a();
        ArrayList arrayList = new ArrayList();
        boolean c = c();
        ?? r2 = EmptyList.a;
        if (c) {
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.z;
                    if (cameraExtensionCharacteristics == null) {
                        cameraExtensionCharacteristics = null;
                    }
                    availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(this.a);
                    Iterator it = availableCaptureRequestKeys.iterator();
                    while (it.hasNext()) {
                        arrayList.add((CaptureRequest.Key) it.next());
                    }
                } catch (IllegalArgumentException e) {
                    Log.e("Camera2ExtExtender", "Failed to retrieve available capture request keys", e);
                }
            }
            return new tn7(arrayList, this);
        }
        arrayList = r2;
        return new tn7(arrayList, this);
    }

    @Override // defpackage.b731
    public boolean s() {
        boolean isPostviewAvailable;
        a();
        if (c() && Build.VERSION.SDK_INT >= 34 && ((eyo) this.x).a == null) {
            try {
                CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.z;
                if (cameraExtensionCharacteristics == null) {
                    cameraExtensionCharacteristics = null;
                }
                isPostviewAvailable = cameraExtensionCharacteristics.isPostviewAvailable(this.a);
                return isPostviewAvailable;
            } catch (NoSuchMethodError e) {
                Log.e("Camera2ExtExtender", "Failed to retrieve postview availability", e);
            }
        }
        return false;
    }

    public un7(bc bcVar) {
        this.w = bcVar;
        this.x = new eyo();
        this.a = 4;
    }
}
