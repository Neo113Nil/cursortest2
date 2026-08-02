package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class km3 implements o2o {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ km3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o2o
    public final boolean a(Object obj, pwj pwjVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.o2o
    public final k2o b(Object obj, int i, int i2, pwj pwjVar) {
        switch (this.a) {
            case 0:
                zla zlaVar = (zla) this.b;
                return zlaVar.a(new vx6(25, (ByteBuffer) obj, zlaVar.d, zlaVar.c), i, i2, pwjVar, zla.j);
            case 1:
                zla zlaVar2 = (zla) this.b;
                return zlaVar2.a(new vx6((ParcelFileDescriptor) obj, zlaVar2.d, zlaVar2.c), i, i2, pwjVar, zla.j);
            default:
                return s33.b((r33) this.b, ((abr) obj).b());
        }
    }
}
