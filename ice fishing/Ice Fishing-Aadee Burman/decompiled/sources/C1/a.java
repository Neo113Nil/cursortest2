package C1;

import B1.j;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244a;

    public /* synthetic */ a(int i) {
        this.f244a = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f244a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        switch (this.f244a) {
            case 0:
                return new j(1, (ByteBuffer) obj);
            case 1:
                return new g(obj);
            default:
                return new g((ParcelFileDescriptor) obj);
        }
    }
}
