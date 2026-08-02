package defpackage;

import com.yandex.go.flex.common.api.actions.r;
import com.yandex.go.flex.common.api.actions.w;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes12.dex */
public final class ru implements myi {
    public final SerialDescriptor a = r.Companion.serializer().getDescriptor();

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return w.c;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
