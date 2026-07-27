package y1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import s1.InterfaceC4967b;

/* loaded from: classes.dex */
public final class z implements InterfaceC5224s, InterfaceC4967b {

    /* renamed from: u, reason: collision with root package name */
    public static final z f41841u = new z(0);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41842n;

    public /* synthetic */ z(int i) {
        this.f41842n = i;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class b() {
        switch (this.f41842n) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // s1.InterfaceC4967b
    public boolean d(Object obj, File file, s1.h hVar) {
        try {
            N1.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e9) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e9);
            return false;
        }
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(x xVar) {
        switch (this.f41842n) {
            case 0:
                return C5202A.f41776b;
            case 2:
                return new C5208c(0, new z(1));
            case 4:
                return new C5208c(0, new z(3));
            case 6:
                return new C5202A(1);
            case 11:
                return new y(xVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new y(xVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new y(xVar.b(Uri.class, InputStream.class), 0);
            default:
                return new C5205D(xVar.b(C5213h.class, InputStream.class));
        }
    }
}
