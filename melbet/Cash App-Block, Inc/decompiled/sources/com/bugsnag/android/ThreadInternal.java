package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ThreadInternal implements JsonStream.Streamable {
    public String id;
    public final boolean isErrorReportingThread;
    public String name;
    public ArrayList stacktrace;
    public String state;

    /* renamed from: type, reason: collision with root package name */
    public final ErrorType f945type;

    public ThreadInternal(String str, String str2, ErrorType errorType, boolean z, String str3, Stacktrace stacktrace) {
        this.id = str;
        this.name = str2;
        this.f945type = errorType;
        this.isErrorReportingThread = z;
        this.state = str3;
        this.stacktrace = CollectionsKt.toMutableList((Collection) stacktrace.trace);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("id");
        jsonStream.value(this.id);
        jsonStream.name("name");
        jsonStream.value(this.name);
        jsonStream.name("type");
        jsonStream.value(this.f945type.getDesc());
        jsonStream.name("state");
        jsonStream.value(this.state);
        jsonStream.name("stacktrace");
        jsonStream.beginArray();
        Iterator it = this.stacktrace.iterator();
        while (it.hasNext()) {
            jsonStream.value((Stackframe) it.next());
        }
        jsonStream.endArray();
        if (this.isErrorReportingThread) {
            jsonStream.name("errorReportingThread");
            jsonStream.value(true);
        }
        jsonStream.endObject();
    }
}
