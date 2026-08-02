package coil3.disk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import java.io.IOException;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Timeout;

/* loaded from: classes3.dex */
public final class FaultHidingSink implements Sink {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object delegate;
    public boolean hasErrors;
    public final Object onException;

    public FaultHidingSink(Http1ExchangeCodec http1ExchangeCodec) {
        this.onException = http1ExchangeCodec;
        this.delegate = new ForwardingTimeout(((RealBufferedSink) http1ExchangeCodec.socket.launchInProgress).sink.timeout());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$r8$classId;
        Object obj = this.delegate;
        Object obj2 = this.onException;
        switch (i) {
            case 0:
                try {
                    ((Sink) obj).close();
                    break;
                } catch (IOException e) {
                    this.hasErrors = true;
                    ((xg$$ExternalSyntheticLambda9) obj2).invoke(e);
                    return;
                }
            default:
                Http1ExchangeCodec http1ExchangeCodec = (Http1ExchangeCodec) obj2;
                if (!this.hasErrors) {
                    this.hasErrors = true;
                    ForwardingTimeout forwardingTimeout = (ForwardingTimeout) obj;
                    Timeout timeout = forwardingTimeout.delegate;
                    forwardingTimeout.delegate = Timeout.NONE;
                    timeout.clearDeadline();
                    timeout.clearTimeout();
                    http1ExchangeCodec.state = 3;
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        int i = this.$r8$classId;
        Object obj = this.onException;
        switch (i) {
            case 0:
                try {
                    ((Sink) this.delegate).flush();
                    break;
                } catch (IOException e) {
                    this.hasErrors = true;
                    ((xg$$ExternalSyntheticLambda9) obj).invoke(e);
                    return;
                }
            default:
                if (!this.hasErrors) {
                    ((RealBufferedSink) ((Http1ExchangeCodec) obj).socket.launchInProgress).flush();
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        switch (this.$r8$classId) {
            case 0:
                return ((Sink) this.delegate).timeout();
            default:
                return (ForwardingTimeout) this.delegate;
        }
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        int i = this.$r8$classId;
        Object obj = this.onException;
        switch (i) {
            case 0:
                if (this.hasErrors) {
                    buffer.skip(j);
                    break;
                } else {
                    try {
                        ((Sink) this.delegate).write(buffer, j);
                        break;
                    } catch (IOException e) {
                        this.hasErrors = true;
                        ((xg$$ExternalSyntheticLambda9) obj).invoke(e);
                        return;
                    }
                }
            default:
                buffer.getClass();
                if (!this.hasErrors) {
                    _UtilCommonKt.checkOffsetAndCount(buffer.size, 0L, j);
                    ((RealBufferedSink) ((Http1ExchangeCodec) obj).socket.launchInProgress).write(buffer, j);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("closed");
                    break;
                }
        }
    }

    public FaultHidingSink(Sink sink, xg$$ExternalSyntheticLambda9 xg__externalsyntheticlambda9) {
        this.delegate = sink;
        this.onException = xg__externalsyntheticlambda9;
    }
}
