package defpackage;

import java.util.Collections;
import kotlin.Pair;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.logistics.sdk.delivery.edit.DeliveryEditApi;

/* loaded from: classes12.dex */
public abstract class r991 {
    public static final z3k a = new z3k(7);
    public static String b;
    public static Pair c;

    public static ValidationException a(String str) {
        return new ValidationException(Collections.singletonList(new jz21("name", str)));
    }

    public static DeliveryEditApi b(t0k0 t0k0Var) {
        return (DeliveryEditApi) t0k0Var.b(DeliveryEditApi.class);
    }
}
