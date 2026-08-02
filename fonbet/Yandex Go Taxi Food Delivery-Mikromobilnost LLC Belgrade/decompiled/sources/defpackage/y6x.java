package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* loaded from: classes4.dex */
public final /* synthetic */ class y6x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ y6x(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
        }
    }
}
