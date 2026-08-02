package kotlinx.serialization.encoding;

import defpackage.kf5;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public interface Encoder {
    void B(char c);

    default void C() {
    }

    kf5 a();

    yjd b(SerialDescriptor serialDescriptor);

    void encodeByte(byte b);

    void h(SerialDescriptor serialDescriptor, int i);

    Encoder i(SerialDescriptor serialDescriptor);

    default void j(Object obj, KSerializer kSerializer) {
        kSerializer.serialize(this, obj);
    }

    void k(short s);

    void l(boolean z);

    void m(float f);

    void q(int i);

    default yjd r(SerialDescriptor serialDescriptor) {
        return b(serialDescriptor);
    }

    void t(String str);

    void u(double d);

    void w(long j);

    void y();
}
