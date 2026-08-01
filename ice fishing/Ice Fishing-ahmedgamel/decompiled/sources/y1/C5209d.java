package y1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5209d implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41793n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f41794u;

    public /* synthetic */ C5209d(int i, Object obj) {
        this.f41793n = i;
        this.f41794u = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f41793n) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f41794u.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f41793n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f41793n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f41793n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        switch (this.f41793n) {
            case 0:
                try {
                    cVar.f(N1.b.a((File) this.f41794u));
                    break;
                } catch (IOException e9) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e9);
                    }
                    cVar.c(e9);
                    return;
                }
            default:
                cVar.f(this.f41794u);
                break;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
