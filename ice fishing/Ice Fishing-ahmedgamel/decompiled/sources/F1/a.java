package F1;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.C3067cm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import t8.g;
import u1.h;
import u1.j;
import w1.w;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f965a;

    /* renamed from: b, reason: collision with root package name */
    public final C3067cm f966b;

    public /* synthetic */ a(C3067cm c3067cm, int i) {
        this.f965a = i;
        this.f966b = c3067cm;
    }

    @Override // u1.j
    public final w a(Object obj, int i, int i4, h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f965a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return C3067cm.D(createSource, i, i4, hVar);
            default:
                createSource2 = ImageDecoder.createSource(P1.b.b((InputStream) obj));
                return C3067cm.D(createSource2, i, i4, hVar);
        }
    }

    @Override // u1.j
    public final boolean b(Object obj, h hVar) {
        switch (this.f965a) {
            case 0:
                ImageHeaderParser$ImageType l9 = g.l((ArrayList) this.f966b.f30365u, (ByteBuffer) obj);
                if (l9 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && l9 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                C3067cm c3067cm = this.f966b;
                ImageHeaderParser$ImageType k9 = g.k((ArrayList) c3067cm.f30365u, (InputStream) obj, (C2964aq) c3067cm.f30366v);
                if (k9 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && k9 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }
}
