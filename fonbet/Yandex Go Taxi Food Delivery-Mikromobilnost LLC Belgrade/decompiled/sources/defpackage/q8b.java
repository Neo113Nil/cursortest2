package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ChatRequestJsonAdapter;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes15.dex */
public final class q8b implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if ((type instanceof Class) && ChatRequest.class.isAssignableFrom((Class) type)) {
            return new ChatRequestJsonAdapter(moshi);
        }
        return null;
    }
}
