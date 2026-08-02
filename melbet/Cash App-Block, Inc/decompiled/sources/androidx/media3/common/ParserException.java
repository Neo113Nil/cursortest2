package androidx.media3.common;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException createForMalformedContainer(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException createForUnsupportedContainerFeature(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dataType, "}", sb);
    }
}
