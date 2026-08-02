package defpackage;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Collections;
import java.util.LinkedHashMap;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public final class qq61 extends AlgorithmParametersSpi {
    public static final /* synthetic */ int b = 0;
    public ECParameterSpec a;

    public static ds61 a(ECParameterSpec eCParameterSpec) {
        if ((eCParameterSpec instanceof ds61) || eCParameterSpec == null) {
            return (ds61) eCParameterSpec;
        }
        int fieldSize = eCParameterSpec.getCurve().getField().getFieldSize();
        for (ECParameterSpec eCParameterSpec2 : Collections.unmodifiableCollection(ds61.w.values())) {
            if (eCParameterSpec2.getCurve().getField().getFieldSize() == fieldSize && eCParameterSpec2.getCurve().equals(eCParameterSpec.getCurve()) && eCParameterSpec2.getGenerator().equals(eCParameterSpec.getGenerator()) && eCParameterSpec2.getOrder().equals(eCParameterSpec.getOrder()) && eCParameterSpec2.getCofactor() == eCParameterSpec.getCofactor()) {
                return (ds61) eCParameterSpec2;
            }
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded() {
        ECParameterSpec eCParameterSpec = this.a;
        ds61 a = a(eCParameterSpec);
        if (a != null) {
            return (byte[]) a.c.clone();
        }
        w511.v(eCParameterSpec, "Not a known named curve: ");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls.isAssignableFrom(ECParameterSpec.class)) {
            return this.a;
        }
        if (!cls.isAssignableFrom(ECGenParameterSpec.class)) {
            throw new InvalidParameterSpecException("Only ECParameterSpec and ECGenParameterSpec supported");
        }
        ds61 a = a(this.a);
        return new ECGenParameterSpec(a == null ? null : a.b.toString());
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ds61 a = a((ECParameterSpec) algorithmParameterSpec);
            this.a = a;
            if (a != null) {
                return;
            }
            throw new InvalidParameterSpecException("Not a supported named curve: " + algorithmParameterSpec);
        }
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (algorithmParameterSpec != null) {
                throw new InvalidParameterSpecException("Only ECParameterSpec and ECGenParameterSpec supported");
            }
            throw new InvalidParameterSpecException("paramSpec must not be null");
        }
        String name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
        ECParameterSpec a2 = ds61.a(name);
        if (a2 == null) {
            throw new InvalidParameterSpecException(g8e.o("Unknown curve: ", name));
        }
        this.a = a2;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final String engineToString() {
        return this.a.toString();
    }

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded(String str) {
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr) {
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 6) {
            ny61.v("Only named ECParameters supported");
            return;
        }
        ObjectIdentifier oid = derValue.getOID();
        LinkedHashMap linkedHashMap = ds61.w;
        ECParameterSpec a = ds61.a(oid.toString());
        if (a != null) {
            this.a = a;
        } else {
            w511.h(oid, "Unknown named curve: ");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr, String str) {
        engineInit(bArr);
    }
}
