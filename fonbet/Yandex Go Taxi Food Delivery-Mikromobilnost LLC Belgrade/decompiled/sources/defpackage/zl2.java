package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.network.AnyJsonAdapter;

/* loaded from: classes9.dex */
public final class zl2 implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if (type.equals(Object.class)) {
            return new AnyJsonAdapter(moshi);
        }
        return null;
    }
}
