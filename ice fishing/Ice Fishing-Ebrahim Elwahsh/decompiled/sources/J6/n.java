package J6;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final class n implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public b f1443a;

    /* renamed from: b, reason: collision with root package name */
    public o f1444b;

    /* renamed from: c, reason: collision with root package name */
    public p f1445c;

    /* renamed from: d, reason: collision with root package name */
    public j f1446d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        try {
            this.f1444b.W(this.f1443a, this.f1446d.e());
            this.f1445c.d(this.f1444b, obj, obj2, this.f1446d);
            this.f1444b.C();
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }
}
