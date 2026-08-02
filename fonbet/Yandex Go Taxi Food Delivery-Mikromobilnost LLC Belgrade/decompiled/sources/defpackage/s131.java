package defpackage;

import java.util.Locale;

/* loaded from: classes6.dex */
public interface s131 {
    String getName();

    default String getValue() {
        return getName().toLowerCase(Locale.ROOT);
    }
}
