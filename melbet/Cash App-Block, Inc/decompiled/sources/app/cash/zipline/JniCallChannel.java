package app.cash.zipline;

import app.cash.zipline.internal.bridge.CallChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/cash/zipline/JniCallChannel;", "Lapp/cash/zipline/internal/bridge/CallChannel;", "", "context", "instance", "", "callJson", "call", "(JJLjava/lang/String;)Ljava/lang/String;", "instanceName", "", "disconnect", "(JJLjava/lang/String;)Z", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JniCallChannel implements CallChannel {
    public final long instance;
    public final QuickJs quickJs;

    public JniCallChannel(QuickJs quickJs, long j) {
        this.quickJs = quickJs;
        this.instance = j;
    }

    private final native String call(long context, long instance, String callJson);

    private final native boolean disconnect(long context, long instance, String instanceName);

    @Override // app.cash.zipline.internal.bridge.CallChannel
    public final String call(String str) {
        str.getClass();
        return call(this.quickJs.context, this.instance, str);
    }

    @Override // app.cash.zipline.internal.bridge.CallChannel
    public final boolean disconnect(String str) {
        str.getClass();
        return disconnect(this.quickJs.context, this.instance, str);
    }
}
