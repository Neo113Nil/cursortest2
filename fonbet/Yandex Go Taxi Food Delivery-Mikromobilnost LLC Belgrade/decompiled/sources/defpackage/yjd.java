package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public interface yjd {
    void A(int i, int i2, SerialDescriptor serialDescriptor);

    void D(c2f0 c2f0Var, int i, char c);

    void E(SerialDescriptor serialDescriptor, int i, double d);

    default boolean F() {
        return true;
    }

    void c(SerialDescriptor serialDescriptor);

    void e(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void f(c2f0 c2f0Var, int i, byte b);

    void g(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void n(SerialDescriptor serialDescriptor, int i, boolean z);

    void o(SerialDescriptor serialDescriptor, int i, String str);

    void s(SerialDescriptor serialDescriptor, int i, long j);

    void v(c2f0 c2f0Var, int i, short s);

    Encoder x(c2f0 c2f0Var, int i);

    void z(SerialDescriptor serialDescriptor, int i, float f);
}
