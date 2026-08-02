package D1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* renamed from: D1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301f implements u1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f541a;

    /* renamed from: b, reason: collision with root package name */
    public final p f542b;

    public /* synthetic */ C0301f(p pVar, int i) {
        this.f541a = i;
        this.f542b = pVar;
    }

    @Override // u1.j
    public final w1.w a(Object obj, int i, int i4, u1.h hVar) {
        switch (this.f541a) {
            case 0:
                p pVar = this.f542b;
                return pVar.a(new b3.e(2, (ByteBuffer) obj, pVar.f567d, pVar.f566c), i, i4, hVar, p.f562j);
            default:
                p pVar2 = this.f542b;
                return pVar2.a(new b3.e((ParcelFileDescriptor) obj, pVar2.f567d, pVar2.f566c), i, i4, hVar, p.f562j);
        }
    }

    @Override // u1.j
    public final boolean b(Object obj, u1.h hVar) {
        switch (this.f541a) {
            case 0:
                this.f542b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
