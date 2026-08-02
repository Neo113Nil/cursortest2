package app.cash.zipline;

import app.cash.zipline.internal.LogAndroidKt;
import app.cash.zipline.internal.bridge.CallChannel;
import app.cash.zipline.internal.bridge.Endpoint$inboundChannel$1;
import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001e\u0010\u001cJ \u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lapp/cash/zipline/QuickJs;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ljava/io/Closeable;", "", "context", "", "destroyContext", "(J)V", "", "name", "getInboundCallChannel", "(JLjava/lang/String;)J", "Lapp/cash/zipline/internal/bridge/CallChannel;", "callChannel", "setOutboundCallChannel", "(JLjava/lang/String;Lapp/cash/zipline/internal/bridge/CallChannel;)V", "", "bytecode", "", "execute", "(J[B)Ljava/lang/Object;", "sourceCode", "fileName", "compile", "(JLjava/lang/String;Ljava/lang/String;)[B", "limit", "setMemoryLimit", "(JJ)V", "gcThreshold", "setGcThreshold", "stackSize", "setMaxStackSize", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickJs implements AutoCloseable, Closeable {
    public long context;

    static {
        System.loadLibrary("quickjs");
    }

    private final native byte[] compile(long context, String sourceCode, String fileName);

    public static final native long createContext();

    private final native void destroyContext(long context);

    private final native Object execute(long context, byte[] bytecode);

    private final native long getInboundCallChannel(long context, String name);

    private final native void setGcThreshold(long context, long gcThreshold);

    private final native void setMaxStackSize(long context, long stackSize);

    private final native void setMemoryLimit(long context, long limit);

    private final native void setOutboundCallChannel(long context, String name, CallChannel callChannel);

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        long j = this.context;
        if (j != 0) {
            this.context = 0L;
            destroyContext(j);
        }
    }

    public final Object evaluate(String str, String str2) {
        return execute(compile(this.context, str, str2));
    }

    public final Object execute(byte[] bArr) {
        bArr.getClass();
        return execute(this.context, bArr);
    }

    public final void finalize() {
        if (this.context != 0) {
            LogAndroidKt.log("warn", "QuickJs instance leaked!", null);
        }
    }

    public final JniCallChannel getInboundChannel$zipline_release() {
        long inboundCallChannel = getInboundCallChannel(this.context, "app_cash_zipline_inboundChannel");
        if (inboundCallChannel != 0) {
            return new JniCallChannel(this, inboundCallChannel);
        }
        throw new OutOfMemoryError("Cannot create QuickJs proxy to inbound channel");
    }

    public final void initOutboundChannel$zipline_release(Endpoint$inboundChannel$1 endpoint$inboundChannel$1) {
        endpoint$inboundChannel$1.getClass();
        setOutboundCallChannel(this.context, "app_cash_zipline_outboundChannel", endpoint$inboundChannel$1);
    }

    public final void setGcThreshold() {
        setGcThreshold(this.context, 262144L);
    }

    public final void setMaxStackSize(long j) {
        setMaxStackSize(this.context, j);
    }

    public final void setMemoryLimit() {
        setMemoryLimit(this.context, -1L);
    }
}
