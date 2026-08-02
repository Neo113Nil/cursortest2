package defpackage;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class y67 implements gog {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y67(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // defpackage.gog
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    fogVar.d(g77.a((File) obj));
                    break;
                } catch (IOException e) {
                    Log.isLoggable("ByteBufferFileLoader", 3);
                    fogVar.e(e);
                    return;
                }
            default:
                fogVar.d(obj);
                break;
        }
    }

    @Override // defpackage.gog
    public final DataSource c() {
        switch (this.a) {
        }
        return DataSource.LOCAL;
    }

    @Override // defpackage.gog
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.gog
    public final void cleanup() {
        int i = this.a;
    }
}
