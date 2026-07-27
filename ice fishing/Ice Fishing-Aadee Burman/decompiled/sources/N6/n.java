package N6;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final class n implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public b f1996a;

    /* renamed from: b, reason: collision with root package name */
    public o f1997b;

    /* renamed from: c, reason: collision with root package name */
    public p f1998c;

    /* renamed from: d, reason: collision with root package name */
    public j f1999d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        try {
            this.f1997b.W(this.f1996a, this.f1999d.e());
            this.f1998c.b(this.f1997b, obj, obj2, this.f1999d);
            this.f1997b.C();
        } catch (IOException e9) {
            throw new UncheckedIOException(e9);
        }
    }
}
