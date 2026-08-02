package kotlinx.serialization;

import defpackage.myi;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public interface KSerializer extends myi {
    void serialize(Encoder encoder, Object obj);
}
