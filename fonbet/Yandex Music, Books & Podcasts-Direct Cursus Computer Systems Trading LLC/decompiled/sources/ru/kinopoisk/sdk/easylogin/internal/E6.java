package ru.kinopoisk.sdk.easylogin.internal;

import com.squareup.anvil.annotations.ContributesTo;
import defpackage.f9f;
import defpackage.leu;
import defpackage.q79;
import defpackage.szm;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@ContributesTo(scope = R3.class)
/* loaded from: classes5.dex */
public interface E6 {

    public static final class a {
        @NotNull
        public static D6 a(@NotNull Map map, @NotNull f9f f9fVar) {
            map.getClass();
            f9fVar.getClass();
            Object obj = ((szm) map.getOrDefault(leu.P(f9fVar), new q79(2))).get();
            obj.getClass();
            return (D6) obj;
        }

        public static final D6 a() {
            return new D6(false, false, 3, null);
        }
    }
}
