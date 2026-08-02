package X;

import android.content.Context;
import androidx.lifecycle.L;
import androidx.lifecycle.Y;
import e8.C4507w;
import e8.I;
import java.io.File;
import java.util.LinkedHashSet;
import l.C4659e;
import z0.C5217f;
import z0.C5218g;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3690n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3691u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Object obj) {
        super(0);
        this.f3690n = i;
        this.f3691u = obj;
    }

    @Override // I7.a
    public final Object invoke() {
        C5217f c5217f;
        switch (this.f3690n) {
            case 0:
                File file = (File) ((D) this.f3691u).f3643a.invoke();
                String it = file.getAbsolutePath();
                synchronized (D.i) {
                    LinkedHashSet linkedHashSet = D.f3642h;
                    if (linkedHashSet.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.h.d(it, "it");
                    linkedHashSet.add(it);
                }
                return file;
            case 1:
                return L.f((Y) this.f3691u);
            case 2:
                c8.f fVar = (c8.f) this.f3691u;
                return Integer.valueOf(I.c(fVar, fVar.i));
            case 3:
                return com.bumptech.glide.g.d("kotlin.Unit", c8.i.f5830e, new c8.e[0], new J0.k(5, (C4507w) this.f3691u));
            case 4:
                return ((s.j) this.f3691u).k();
            default:
                C5218g c5218g = (C5218g) this.f3691u;
                String str = c5218g.f42213u;
                Context context = c5218g.f42212n;
                if (str == null || !c5218g.f42215w) {
                    c5217f = new C5217f(context, c5218g.f42213u, new C4659e(), c5218g.f42214v, c5218g.f42216x);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.h.d(noBackupFilesDir, "context.noBackupFilesDir");
                    c5217f = new C5217f(context, new File(noBackupFilesDir, c5218g.f42213u).getAbsolutePath(), new C4659e(), c5218g.f42214v, c5218g.f42216x);
                }
                c5217f.setWriteAheadLoggingEnabled(c5218g.f42218z);
                return c5217f;
        }
    }
}
