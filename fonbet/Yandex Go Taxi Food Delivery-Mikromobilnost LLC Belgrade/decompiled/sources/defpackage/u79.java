package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes11.dex */
public final class u79 extends k implements yt10 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u79(int i) {
        super(r1);
        v79 v79Var;
        v79Var = v79.DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0031a
    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final void g(ByteString byteString) {
        e();
        v79.y((v79) this.b, byteString);
    }

    @Override // defpackage.yt10
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return this.a;
    }

    public final void h() {
        e();
        v79.x((v79) this.b);
    }
}
