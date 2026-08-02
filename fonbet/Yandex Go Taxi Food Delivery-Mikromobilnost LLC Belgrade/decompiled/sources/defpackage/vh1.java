package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes11.dex */
public final class vh1 extends k implements yt10 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh1(int i) {
        super(r1);
        wh1 wh1Var;
        wh1Var = wh1.DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0031a
    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final void g(ByteString byteString) {
        e();
        wh1.y((wh1) this.b, byteString);
    }

    @Override // defpackage.yt10
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return this.a;
    }

    public final void h() {
        e();
        wh1.x((wh1) this.b);
    }
}
