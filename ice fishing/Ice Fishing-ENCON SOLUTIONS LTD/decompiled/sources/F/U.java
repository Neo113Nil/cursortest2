package F;

import h1.C0239i;
import java.io.File;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i2, Object obj) {
        super(0);
        this.f432e = i2;
        this.f433f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.j, t1.a] */
    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        switch (this.f432e) {
            case 0:
                Object obj = V.f435d;
                File file = (File) this.f433f;
                synchronized (obj) {
                    V.f434c.remove(file.getAbsolutePath());
                }
                return C0239i.f3393a;
            case 1:
                File file2 = (File) ((H.b) this.f433f).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                if (z1.g.i0(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return (List) this.f433f;
            case 3:
                try {
                    return (List) ((kotlin.jvm.internal.j) this.f433f).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return i1.r.f3416a;
                }
            case 4:
                J1.k kVar = ((N1.k) this.f433f).f1202e;
                kotlin.jvm.internal.i.b(kVar);
                List a2 = kVar.a();
                ArrayList arrayList = new ArrayList(i1.k.E(a2));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            case 5:
                W.i iVar = (W.i) this.f433f;
                return BigInteger.valueOf(iVar.f1850a).shiftLeft(32).or(BigInteger.valueOf(iVar.f1851b)).shiftLeft(32).or(BigInteger.valueOf(iVar.f1852c));
            default:
                ((K.e) this.f433f).getClass();
                throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U(InterfaceC1046a interfaceC1046a) {
        super(0);
        this.f432e = 3;
        this.f433f = (kotlin.jvm.internal.j) interfaceC1046a;
    }
}
