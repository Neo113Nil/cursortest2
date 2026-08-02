package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jjr implements o2o {
    public final ArrayList a;
    public final nm3 b;
    public final z98 c;

    public jjr(ArrayList arrayList, nm3 nm3Var, z98 z98Var) {
        this.a = arrayList;
        this.b = nm3Var;
        this.c = z98Var;
    }

    @Override // defpackage.o2o
    public final boolean a(Object obj, pwj pwjVar) {
        return !((Boolean) pwjVar.c(ycd.b)).booleanValue() && lxe.t(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.o2o
    public final k2o b(Object obj, int i, int i2, pwj pwjVar) {
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
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, pwjVar);
    }
}
