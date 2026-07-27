package B1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* renamed from: B1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264f implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127a;

    /* renamed from: b, reason: collision with root package name */
    public final p f128b;

    public /* synthetic */ C0264f(p pVar, int i) {
        this.f127a = i;
        this.f128b = pVar;
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i6, s1.h hVar) {
        switch (this.f127a) {
            case 0:
                p pVar = this.f128b;
                return pVar.a(new Z2.e(1, (ByteBuffer) obj, pVar.f153d, pVar.f152c), i, i6, hVar, p.f148j);
            default:
                p pVar2 = this.f128b;
                return pVar2.a(new Z2.e((ParcelFileDescriptor) obj, pVar2.f153d, pVar2.f152c), i, i6, hVar, p.f148j);
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        switch (this.f127a) {
            case 0:
                this.f128b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
