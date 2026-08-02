package A1;

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
import u1.InterfaceC5063b;

/* loaded from: classes.dex */
public final class H implements y, InterfaceC5063b {

    /* renamed from: u, reason: collision with root package name */
    public static final H f33u = new H(0);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34n;

    public /* synthetic */ H(int i) {
        this.f34n = i;
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

    @Override // u1.InterfaceC5063b
    public boolean c(Object obj, File file, u1.h hVar) {
        try {
            P1.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e9) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e9);
            return false;
        }
    }

    public Class d() {
        switch (this.f34n) {
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

    @Override // A1.y
    public x j(E e9) {
        switch (this.f34n) {
            case 0:
                return I.f35b;
            case 2:
                return new C0261c(0, new H(1));
            case 4:
                return new C0261c(0, new H(3));
            case 6:
                return new I(1);
            case 11:
                return new G(e9.a(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new G(e9.a(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new G(e9.a(Uri.class, InputStream.class), 0);
            default:
                return new L(e9.a(m.class, InputStream.class));
        }
    }
}
