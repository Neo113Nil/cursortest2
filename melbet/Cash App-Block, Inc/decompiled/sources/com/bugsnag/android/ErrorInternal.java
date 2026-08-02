package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.List;

/* loaded from: classes.dex */
public final class ErrorInternal implements JsonStream.Streamable {
    public String errorClass;
    public String errorMessage;
    public final List stacktrace;

    /* renamed from: type, reason: collision with root package name */
    public ErrorType f939type;

    public ErrorInternal(String str, String str2, Stacktrace stacktrace, ErrorType errorType) {
        this.errorClass = str;
        this.errorMessage = str2;
        this.f939type = errorType;
        this.stacktrace = stacktrace.trace;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("errorClass");
        jsonStream.value(this.errorClass);
        jsonStream.name("message");
        jsonStream.value(this.errorMessage);
        jsonStream.name("type");
        jsonStream.value(this.f939type.getDesc());
        jsonStream.name("stacktrace");
        jsonStream.value(this.stacktrace);
        jsonStream.endObject();
    }
}
