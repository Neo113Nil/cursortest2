package M6;

import S0.l;
import a7.i;
import f6.C4512a;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import u1.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y6.c f1872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f1873d;

    public /* synthetic */ a(b bVar, Y6.c cVar, l lVar, int i) {
        this.f1870a = i;
        this.f1871b = bVar;
        this.f1872c = cVar;
        this.f1873d = lVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArr;
        String str;
        String k9;
        switch (this.f1870a) {
            case 0:
                S6.c cVar = (S6.c) obj;
                b bVar = this.f1871b;
                a7.l lVar = bVar.f1875a;
                int i = cVar.f2894b.f38255w;
                Long valueOf = Long.valueOf(i);
                l lVar2 = this.f1873d;
                lVar2.f2798v = valueOf;
                Y6.c cVar2 = this.f1872c;
                O6.a aVar = (O6.a) lVar2.f2797u;
                if (i >= 200 && i < 300) {
                    C4512a a9 = f6.c.a(i.f4371f, valueOf);
                    if (aVar.f2365a) {
                        throw new IllegalStateException("Recording already ended");
                    }
                    aVar.f2365a = true;
                    aVar.a(a9, null);
                    cVar2.e();
                    return;
                }
                String valueOf2 = String.valueOf(i);
                Long l9 = (Long) lVar2.f2798v;
                C4512a a10 = l9 != null ? f6.c.a(i.f4371f, l9) : C4512a.f37513w;
                if (aVar.f2365a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar.f2365a = true;
                if (valueOf2 == null || valueOf2.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar.a(a10, valueOf2);
                try {
                    bArr = cVar.a();
                } catch (IOException e9) {
                    lVar.a(Level.FINE, "Unable to obtain response body", e9);
                    bArr = null;
                }
                String str2 = cVar.f2894b.f38254v;
                if (bArr != null) {
                    try {
                        k9 = A8.b.k(bArr);
                    } catch (IOException unused) {
                        str = "Unable to parse response body, HTTP status message: ";
                    }
                    lVar.a(Level.WARNING, "Failed to export " + bVar.f1877c + "s. Server responded with HTTP status code " + i + ". Error message: " + k9, null);
                    cVar2.a(new K6.a(null));
                    return;
                }
                str = "Response body missing, HTTP status message: ";
                k9 = h.f(str, str2);
                lVar.a(Level.WARNING, "Failed to export " + bVar.f1877c + "s. Server responded with HTTP status code " + i + ". Error message: " + k9, null);
                cVar2.a(new K6.a(null));
                return;
            default:
                Throwable th = (Throwable) obj;
                b bVar2 = this.f1871b;
                l lVar3 = this.f1873d;
                String name = th.getClass().getName();
                Long l10 = (Long) lVar3.f2798v;
                C4512a a11 = l10 != null ? f6.c.a(i.f4371f, l10) : C4512a.f37513w;
                O6.a aVar2 = (O6.a) lVar3.f2797u;
                if (aVar2.f2365a) {
                    throw new IllegalStateException("Recording already ended");
                }
                aVar2.f2365a = true;
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                aVar2.a(a11, name);
                bVar2.f1875a.a(Level.SEVERE, "Failed to export " + bVar2.f1877c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
                this.f1872c.a(new K6.a(th));
                return;
        }
    }
}
