package I6;

import W6.i;
import W6.l;
import b6.C0530a;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U6.c f1262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S0.e f1263d;

    public /* synthetic */ a(b bVar, U6.c cVar, S0.e eVar, int i) {
        this.f1260a = i;
        this.f1261b = bVar;
        this.f1262c = cVar;
        this.f1263d = eVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArr;
        String str;
        String o9;
        switch (this.f1260a) {
            case 0:
                O6.c cVar = (O6.c) obj;
                b bVar = this.f1261b;
                l lVar = bVar.f1265a;
                int i = cVar.f2530b.f37533w;
                Long valueOf = Long.valueOf(i);
                S0.e eVar = this.f1263d;
                eVar.f2892v = valueOf;
                U6.c cVar2 = this.f1262c;
                K6.a aVar = (K6.a) eVar.f2891u;
                if (i >= 200 && i < 300) {
                    C0530a b9 = b6.c.b(i.f3482f, valueOf);
                    if (aVar.f1643a) {
                        throw new IllegalStateException("Recording already ended");
                    }
                    aVar.f1643a = true;
                    aVar.a(b9, null);
                    cVar2.e();
                    return;
                }
                String valueOf2 = String.valueOf(i);
                Long l9 = (Long) eVar.f2892v;
                C0530a b10 = l9 != null ? b6.c.b(i.f3482f, l9) : C0530a.f5557w;
                if (aVar.f1643a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar.f1643a = true;
                if (valueOf2 == null || valueOf2.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar.a(b10, valueOf2);
                try {
                    bArr = cVar.a();
                } catch (IOException e6) {
                    lVar.a(Level.FINE, "Unable to obtain response body", e6);
                    bArr = null;
                }
                String str2 = cVar.f2530b.f37532v;
                if (bArr != null) {
                    try {
                        o9 = K3.b.o(bArr);
                    } catch (IOException unused) {
                        str = "Unable to parse response body, HTTP status message: ";
                    }
                    lVar.a(Level.WARNING, "Failed to export " + bVar.f1267c + "s. Server responded with HTTP status code " + i + ". Error message: " + o9, null);
                    cVar2.a(new G6.a(null));
                    return;
                }
                str = "Response body missing, HTTP status message: ";
                o9 = AbstractC5051n.f(str, str2);
                lVar.a(Level.WARNING, "Failed to export " + bVar.f1267c + "s. Server responded with HTTP status code " + i + ". Error message: " + o9, null);
                cVar2.a(new G6.a(null));
                return;
            default:
                Throwable th = (Throwable) obj;
                b bVar2 = this.f1261b;
                S0.e eVar2 = this.f1263d;
                String name = th.getClass().getName();
                Long l10 = (Long) eVar2.f2892v;
                C0530a b11 = l10 != null ? b6.c.b(i.f3482f, l10) : C0530a.f5557w;
                K6.a aVar2 = (K6.a) eVar2.f2891u;
                if (aVar2.f1643a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar2.f1643a = true;
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar2.a(b11, name);
                bVar2.f1265a.a(Level.SEVERE, "Failed to export " + bVar2.f1267c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
                this.f1262c.a(new G6.a(th));
                return;
        }
    }
}
