package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.g;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class s67 implements rtj0 {
    public final /* synthetic */ int a;
    public final g b;

    public /* synthetic */ s67(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                return gVar.a(new r1s(12, (ByteBuffer) obj, gVar.d, gVar.c), i, i2, mg70Var, g.j);
            default:
                g gVar2 = this.b;
                return gVar2.a(new r1s((ParcelFileDescriptor) obj, gVar2.d, gVar2.c), i, i2, mg70Var, g.j);
        }
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
