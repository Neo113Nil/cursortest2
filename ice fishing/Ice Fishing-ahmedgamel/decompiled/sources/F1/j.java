package F1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import u1.x;

/* loaded from: classes.dex */
public final class j implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f948a;

    /* renamed from: b, reason: collision with root package name */
    public final b f949b;

    /* renamed from: c, reason: collision with root package name */
    public final C2941aq f950c;

    public j(ArrayList arrayList, b bVar, C2941aq c2941aq) {
        this.f948a = arrayList;
        this.f949b = bVar;
        this.f950c = c2941aq;
    }

    @Override // s1.j
    public final x a(Object obj, int i, int i6, s1.h hVar) {
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
        return this.f949b.a(ByteBuffer.wrap(bArr), i, i6, hVar);
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        return !((Boolean) hVar.c(i.f947b)).booleanValue() && com.bumptech.glide.e.e(this.f948a, (InputStream) obj, this.f950c) == ImageHeaderParser$ImageType.GIF;
    }
}
