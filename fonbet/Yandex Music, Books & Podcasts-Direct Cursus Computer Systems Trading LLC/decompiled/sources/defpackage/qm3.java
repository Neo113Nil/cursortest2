package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qm3 implements na7 {
    public final /* synthetic */ int a;

    public /* synthetic */ qm3(int i) {
        this.a = i;
    }

    @Override // defpackage.na7
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.na7
    public final oa7 b(Object obj) {
        switch (this.a) {
            case 0:
                return new rm3(0, (ByteBuffer) obj);
            case 1:
                return new sld(25, obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }
}
