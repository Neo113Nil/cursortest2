package l7;

import g6.d;
import g6.e;
import java.util.Objects;
import java.util.function.BiConsumer;

/* renamed from: l7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4708b implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e eVar = (e) obj;
        boolean z8 = false;
        if (!eVar.f37932b.isEmpty()) {
            String str = eVar.f37932b;
            if (str.length() <= 255) {
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z8 = true;
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
        d.a("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z8);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
