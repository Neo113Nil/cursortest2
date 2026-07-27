package y1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5229d implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41828n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f41829u;

    public /* synthetic */ C5229d(int i, Object obj) {
        this.f41828n = i;
        this.f41829u = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f41828n) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f41829u.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f41828n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        switch (this.f41828n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f41828n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        switch (this.f41828n) {
            case 0:
                try {
                    cVar.g(N1.b.a((File) this.f41829u));
                    break;
                } catch (IOException e6) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                    }
                    cVar.d(e6);
                    return;
                }
            default:
                cVar.g(this.f41829u);
                break;
        }
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
