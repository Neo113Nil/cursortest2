package X;

import android.content.Context;
import androidx.lifecycle.L;
import androidx.lifecycle.Y;
import e8.C4490w;
import e8.I;
import java.io.File;
import java.util.LinkedHashSet;
import t0.C4986A;
import z0.C5250f;
import z0.C5251g;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3528n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3529u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Object obj) {
        super(0);
        this.f3528n = i;
        this.f3529u = obj;
    }

    @Override // I7.a
    public final Object invoke() {
        C5250f c5250f;
        switch (this.f3528n) {
            case 0:
                File file = (File) ((D) this.f3529u).f3481a.invoke();
                String it = file.getAbsolutePath();
                synchronized (D.i) {
                    LinkedHashSet linkedHashSet = D.f3480h;
                    if (linkedHashSet.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.h.d(it, "it");
                    linkedHashSet.add(it);
                }
                return file;
            case 1:
                return L.f((Y) this.f3529u);
            case 2:
                c8.f fVar = (c8.f) this.f3529u;
                return Integer.valueOf(I.c(fVar, fVar.i));
            case 3:
                return d6.c.c("kotlin.Unit", c8.i.f5654e, new c8.e[0], new J0.l(5, (C4490w) this.f3529u));
            case 4:
                return ((s.j) this.f3529u).k();
            default:
                C5251g c5251g = (C5251g) this.f3529u;
                String str = c5251g.f42242u;
                Context context = c5251g.f42241n;
                if (str == null || !c5251g.f42244w) {
                    c5250f = new C5250f(context, c5251g.f42242u, new C4986A(6), c5251g.f42243v, c5251g.f42245x);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.h.d(noBackupFilesDir, "context.noBackupFilesDir");
                    c5250f = new C5250f(context, new File(noBackupFilesDir, c5251g.f42242u).getAbsolutePath(), new C4986A(6), c5251g.f42243v, c5251g.f42245x);
                }
                c5250f.setWriteAheadLoggingEnabled(c5251g.f42247z);
                return c5250f;
        }
    }
}
