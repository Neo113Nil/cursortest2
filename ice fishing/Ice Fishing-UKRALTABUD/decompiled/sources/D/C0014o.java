package D;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o extends E0.j implements D0.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f248h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0014o(S s2, int i2) {
        super(0);
        this.f247g = i2;
        this.f248h = s2;
    }

    @Override // D0.a
    public final Object a() {
        switch (this.f247g) {
            case 0:
                return ((a0) this.f248h.f134o.a()).f165b;
            default:
                X x2 = this.f248h.f125f;
                File canonicalFile = ((File) x2.f150b.a()).getCanonicalFile();
                synchronized (X.f148d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = X.f147c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    E0.i.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new a0(canonicalFile, (l0) x2.f149a.i(canonicalFile), new W(0, canonicalFile));
        }
    }
}
