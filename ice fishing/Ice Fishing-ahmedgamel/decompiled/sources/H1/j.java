package H1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import w1.w;

/* loaded from: classes.dex */
public final class j implements u1.j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1233a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1234b;

    /* renamed from: c, reason: collision with root package name */
    public final C2964aq f1235c;

    public j(ArrayList arrayList, b bVar, C2964aq c2964aq) {
        this.f1233a = arrayList;
        this.f1234b = bVar;
        this.f1235c = c2964aq;
    }

    @Override // u1.j
    public final w a(Object obj, int i, int i4, u1.h hVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e9) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e9);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f1234b.a(ByteBuffer.wrap(bArr), i, i4, hVar);
    }

    @Override // u1.j
    public final boolean b(Object obj, u1.h hVar) {
        return !((Boolean) hVar.c(i.f1232b)).booleanValue() && t8.g.k(this.f1233a, (InputStream) obj, this.f1235c) == ImageHeaderParser$ImageType.GIF;
    }
}
