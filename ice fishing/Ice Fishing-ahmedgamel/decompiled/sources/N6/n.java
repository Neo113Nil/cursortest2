package N6;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final class n implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public b f2084a;

    /* renamed from: b, reason: collision with root package name */
    public o f2085b;

    /* renamed from: c, reason: collision with root package name */
    public p f2086c;

    /* renamed from: d, reason: collision with root package name */
    public j f2087d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        try {
            this.f2085b.W(this.f2084a, this.f2087d.e());
            this.f2086c.b(this.f2085b, obj, obj2, this.f2087d);
            this.f2085b.C();
        } catch (IOException e9) {
            throw new UncheckedIOException(e9);
        }
    }
}
