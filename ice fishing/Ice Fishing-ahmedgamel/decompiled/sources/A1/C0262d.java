package A1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: A1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262d implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f49n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f50u;

    public /* synthetic */ C0262d(int i, Object obj) {
        this.f49n = i;
        this.f50u = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f49n) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f50u.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f49n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f49n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f49n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        switch (this.f49n) {
            case 0:
                try {
                    cVar.f(P1.b.a((File) this.f50u));
                    break;
                } catch (IOException e9) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e9);
                    }
                    cVar.c(e9);
                    return;
                }
            default:
                cVar.f(this.f50u);
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
