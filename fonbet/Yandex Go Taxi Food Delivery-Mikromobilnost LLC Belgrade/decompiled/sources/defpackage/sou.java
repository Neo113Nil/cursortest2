package defpackage;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.ByteString;

/* loaded from: classes.dex */
public final class sou extends hjv {
    public static final e2f0 d = new e2f0(nou.class, new kbs(10));

    public sou() {
        super(mou.class, new jf1(7, m200.class));
    }

    public static ujx m(int i, int i2, HashType hashType, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        pou C = qou.C();
        vou C2 = wou.C();
        C2.e();
        wou.x((wou) C2.b, hashType);
        C2.e();
        wou.y((wou) C2.b, i2);
        wou wouVar = (wou) C2.b();
        C.e();
        qou.x((qou) C.b, wouVar);
        C.e();
        qou.y((qou) C.b, i);
        return new ujx((qou) C.b(), keyTemplate$OutputPrefixType);
    }

    public static void n(mou mouVar) {
        d131.c(mouVar.D());
        if (mouVar.B().size() >= 16) {
            o(mouVar.C());
        } else {
            kbs.v("key too short");
        }
    }

    public static void o(wou wouVar) {
        if (wouVar.B() < 10) {
            kbs.v("tag size too small");
            return;
        }
        int i = rou.a[wouVar.A().ordinal()];
        if (i == 1) {
            if (wouVar.B() <= 20) {
                return;
            }
            kbs.v("tag size too big");
            return;
        }
        if (i == 2) {
            if (wouVar.B() <= 28) {
                return;
            }
            kbs.v("tag size too big");
            return;
        }
        if (i == 3) {
            if (wouVar.B() <= 32) {
                return;
            }
            kbs.v("tag size too big");
        } else if (i == 4) {
            if (wouVar.B() <= 48) {
                return;
            }
            kbs.v("tag size too big");
        } else if (i != 5) {
            kbs.v("unknown hash type");
        } else {
            if (wouVar.B() <= 64) {
                return;
            }
            kbs.v("tag size too big");
        }
    }

    @Override // defpackage.hjv
    public final TinkFipsUtil$AlgorithmFipsCompatibility e() {
        return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // defpackage.hjv
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.hjv
    public final w3 h() {
        return new kf1(this);
    }

    @Override // defpackage.hjv
    public final KeyData$KeyMaterialType i() {
        return KeyData$KeyMaterialType.SYMMETRIC;
    }

    @Override // defpackage.hjv
    public final vt10 j(ByteString byteString) {
        return mou.F(byteString, oyo.b());
    }

    @Override // defpackage.hjv
    public final /* bridge */ /* synthetic */ void l(vt10 vt10Var) {
        n((mou) vt10Var);
    }
}
