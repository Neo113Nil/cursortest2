package defpackage;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/* loaded from: classes3.dex */
public final class ws1 extends viq {
    public SocketChannel h;
    public m56 i;

    @Override // defpackage.piq
    public final void d() {
        try {
            SocketChannel socketChannel = this.h;
            if (socketChannel != null) {
                socketChannel.close();
            }
        } catch (IOException unused) {
        }
    }
}
