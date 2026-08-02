package bo.app;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final /* synthetic */ class c7$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ c7$$ExternalSyntheticLambda4(Http2Connection http2Connection, int i, long j) {
        this.$r8$classId = 2;
        this.f$0 = http2Connection;
        this.f$2 = i;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        int i2 = this.f$2;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return c7.a((id) obj, j, i2);
            case 1:
                return g8.a((g8) obj, j, i2);
            default:
                Http2Connection http2Connection = (Http2Connection) obj;
                try {
                    http2Connection.writer.windowUpdate(i2, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode, errorCode, e);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c7$$ExternalSyntheticLambda4(Object obj, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = i;
    }
}
