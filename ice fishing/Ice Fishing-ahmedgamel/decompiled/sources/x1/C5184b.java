package x1;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.C3451jv;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import y0.InterfaceC5196a;
import y0.InterfaceC5197b;
import y1.C5204e;
import z0.C5218g;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5184b implements InterfaceC5183a, Q1.a, InterfaceC5196a {
    @Override // x1.InterfaceC5183a
    public Bitmap a(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // x1.InterfaceC5183a
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // y0.InterfaceC5196a
    public InterfaceC5197b c(C3451jv c3451jv) {
        return new C5218g((Context) c3451jv.f32126v, (String) c3451jv.f32127w, (F.d) c3451jv.f32128x, c3451jv.f32124n, c3451jv.f32125u);
    }

    @Override // x1.InterfaceC5183a
    public Bitmap d(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // Q1.a
    public Object e() {
        try {
            return new C5204e(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // x1.InterfaceC5183a
    public void g() {
    }

    @Override // x1.InterfaceC5183a
    public void f(int i) {
    }
}
