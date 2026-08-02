package M6;

import a7.i;
import a7.l;
import f6.C4522a;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y6.c f1874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S0.e f1875d;

    public /* synthetic */ a(b bVar, Y6.c cVar, S0.e eVar, int i) {
        this.f1872a = i;
        this.f1873b = bVar;
        this.f1874c = cVar;
        this.f1875d = eVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArr;
        String str;
        String j6;
        switch (this.f1872a) {
            case 0:
                S6.d dVar = (S6.d) obj;
                b bVar = this.f1873b;
                l lVar = bVar.f1877a;
                int i = dVar.f2977b.f38374w;
                Long valueOf = Long.valueOf(i);
                S0.e eVar = this.f1875d;
                eVar.f2909v = valueOf;
                Y6.c cVar = this.f1874c;
                O6.a aVar = (O6.a) eVar.f2908u;
                if (i >= 200 && i < 300) {
                    C4522a a9 = f6.c.a(i.f4339f, valueOf);
                    if (aVar.f2296a) {
                        throw new IllegalStateException("Recording already ended");
                    }
                    aVar.f2296a = true;
                    aVar.a(a9, null);
                    cVar.e();
                    return;
                }
                String valueOf2 = String.valueOf(i);
                Long l9 = (Long) eVar.f2909v;
                C4522a a10 = l9 != null ? f6.c.a(i.f4339f, l9) : C4522a.f37475w;
                if (aVar.f2296a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar.f2296a = true;
                if (valueOf2 == null || valueOf2.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar.a(a10, valueOf2);
                try {
                    bArr = dVar.a();
                } catch (IOException e9) {
                    lVar.a(Level.FINE, "Unable to obtain response body", e9);
                    bArr = null;
                }
                String str2 = dVar.f2977b.f38373v;
                if (bArr != null) {
                    try {
                        j6 = t8.g.j(bArr);
                    } catch (IOException unused) {
                        str = "Unable to parse response body, HTTP status message: ";
                    }
                    lVar.a(Level.WARNING, "Failed to export " + bVar.f1879c + "s. Server responded with HTTP status code " + i + ". Error message: " + j6, null);
                    cVar.a(new K6.a(null));
                    return;
                }
                str = "Response body missing, HTTP status message: ";
                j6 = AbstractC5128c.f(str, str2);
                lVar.a(Level.WARNING, "Failed to export " + bVar.f1879c + "s. Server responded with HTTP status code " + i + ". Error message: " + j6, null);
                cVar.a(new K6.a(null));
                return;
            default:
                Throwable th = (Throwable) obj;
                b bVar2 = this.f1873b;
                S0.e eVar2 = this.f1875d;
                String name = th.getClass().getName();
                Long l10 = (Long) eVar2.f2909v;
                C4522a a11 = l10 != null ? f6.c.a(i.f4339f, l10) : C4522a.f37475w;
                O6.a aVar2 = (O6.a) eVar2.f2908u;
                if (aVar2.f2296a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar2.f2296a = true;
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar2.a(a11, name);
                bVar2.f1877a.a(Level.SEVERE, "Failed to export " + bVar2.f1879c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
                this.f1874c.a(new K6.a(th));
                return;
        }
    }
}
