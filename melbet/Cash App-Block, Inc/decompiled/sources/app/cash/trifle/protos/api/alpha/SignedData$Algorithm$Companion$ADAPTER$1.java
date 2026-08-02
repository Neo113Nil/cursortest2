package app.cash.trifle.protos.api.alpha;

import app.cash.trifle.protos.api.alpha.SignedData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes3.dex */
public final class SignedData$Algorithm$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SignedData$Algorithm$Companion$ADAPTER$1 signedData$Algorithm$Companion$ADAPTER$1 = SignedData.Algorithm.ADAPTER;
        if (i == 0) {
            return SignedData.Algorithm.DO_NOT_USE;
        }
        if (i == 1) {
            return SignedData.Algorithm.ECDSA_SHA256;
        }
        if (i != 2) {
            return null;
        }
        return SignedData.Algorithm.ED25519;
    }
}
