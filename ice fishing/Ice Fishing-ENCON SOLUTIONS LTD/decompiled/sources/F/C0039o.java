package F;

import java.io.File;
import java.util.LinkedHashSet;
import t1.InterfaceC1046a;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039o(P p2, int i2) {
        super(0);
        this.f537e = i2;
        this.f538f = p2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        switch (this.f537e) {
            case 0:
                return ((Y) this.f538f.f421j.a()).f452b;
            default:
                V v2 = this.f538f.f412a;
                File canonicalFile = ((File) v2.f437b.invoke()).getCanonicalFile();
                synchronized (V.f435d) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = V.f434c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.i.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new Y(canonicalFile, (j0) v2.f436a.invoke(canonicalFile), new U(0, canonicalFile));
        }
    }
}
