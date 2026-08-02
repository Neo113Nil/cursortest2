package kotlinx.serialization.encoding;

import defpackage.kf5;
import defpackage.myi;
import defpackage.sjd;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public interface Decoder {
    default Object B(myi myiVar) {
        return myiVar.deserialize(this);
    }

    boolean D();

    byte F();

    kf5 a();

    sjd b(SerialDescriptor serialDescriptor);

    Void i();

    long j();

    short l();

    double m();

    char n();

    String p();

    int q(SerialDescriptor serialDescriptor);

    int u();

    Decoder w(SerialDescriptor serialDescriptor);

    float x();

    boolean z();
}
