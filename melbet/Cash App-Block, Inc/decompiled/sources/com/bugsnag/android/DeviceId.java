package com.bugsnag.android;

import com.bugsnag.android.JsonStream;

/* loaded from: classes.dex */
public final class DeviceId implements JsonStream.Streamable {
    public static final Companion Companion = new Companion();
    public final String id;

    public final class Companion {
    }

    public DeviceId(String str) {
        this.id = str;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("id");
        jsonStream.value(this.id);
        jsonStream.endObject();
    }
}
