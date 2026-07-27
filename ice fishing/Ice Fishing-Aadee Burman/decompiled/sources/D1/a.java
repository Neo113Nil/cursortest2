package D1;

import S0.l;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.e;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s1.h;
import s1.j;
import u1.x;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f621a;

    /* renamed from: b, reason: collision with root package name */
    public final l f622b;

    public /* synthetic */ a(l lVar, int i) {
        this.f621a = i;
        this.f622b = lVar;
    }

    @Override // s1.j
    public final x a(Object obj, int i, int i6, h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f621a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return l.B(createSource, i, i6, hVar);
            default:
                createSource2 = ImageDecoder.createSource(N1.b.b((InputStream) obj));
                return l.B(createSource2, i, i6, hVar);
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, h hVar) {
        switch (this.f621a) {
            case 0:
                ImageHeaderParser$ImageType f3 = e.f((ArrayList) this.f622b.f2797u, (ByteBuffer) obj);
                if (f3 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && f3 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                l lVar = this.f622b;
                ImageHeaderParser$ImageType e9 = e.e((ArrayList) lVar.f2797u, (InputStream) obj, (C2941aq) lVar.f2798v);
                if (e9 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && e9 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }
}
