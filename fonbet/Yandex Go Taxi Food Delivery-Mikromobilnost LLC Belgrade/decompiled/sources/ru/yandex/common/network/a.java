package ru.yandex.common.network;

import java.io.ObjectInput;
import ru.yandex.common.cache.Cacheable;

/* loaded from: classes4.dex */
public final class a extends Cacheable.Reader {
    @Override // ru.yandex.common.cache.Cacheable.Reader
    public final Object readExternal(ObjectInput objectInput) {
        if (objectInput.readInt() != 1) {
            return null;
        }
        ErrorResponse errorResponse = new ErrorResponse(objectInput.readUTF());
        errorResponse.text = objectInput.readUTF();
        return errorResponse;
    }
}
