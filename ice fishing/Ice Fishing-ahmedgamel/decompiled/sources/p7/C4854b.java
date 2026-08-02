package p7;

import java.util.Objects;
import java.util.function.BiConsumer;
import k6.d;
import k6.e;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4854b implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e eVar = (e) obj;
        boolean z6 = false;
        if (!eVar.f38613b.isEmpty()) {
            String str = eVar.f38613b;
            if (str.length() <= 255) {
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z6 = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        d.a("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z6);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
