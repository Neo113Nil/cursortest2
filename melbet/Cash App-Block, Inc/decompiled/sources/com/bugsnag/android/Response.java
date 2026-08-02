package com.bugsnag.android;

import com.bugsnag.android.JsonStream;

/* loaded from: classes4.dex */
public final class Response extends AbstractHttpEntity implements JsonStream.Streamable {
    public int statusCode;

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("statusCode");
        jsonStream.value(this.statusCode);
        jsonStream.name("body");
        jsonStream.value(this.body);
        long j = this.bodyLength;
        if (j >= 0) {
            jsonStream.name("bodyLength");
            jsonStream.value(j);
        }
        jsonStream.name("headers");
        jsonStream.value(this.headers, true);
        jsonStream.endObject();
    }
}
