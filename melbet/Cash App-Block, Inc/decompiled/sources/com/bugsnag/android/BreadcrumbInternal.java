package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
public final class BreadcrumbInternal implements JsonStream.Streamable {
    public String message;
    public Map metadata;
    public final Date timestamp;

    /* renamed from: type, reason: collision with root package name */
    public BreadcrumbType f937type;

    public BreadcrumbInternal(String str, BreadcrumbType breadcrumbType, Map map, Date date) {
        this.message = str;
        this.f937type = breadcrumbType;
        this.metadata = map;
        this.timestamp = date;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("timestamp");
        jsonStream.value(this.timestamp);
        jsonStream.name("name");
        jsonStream.value(this.message);
        jsonStream.name("type");
        jsonStream.value(this.f937type.getType());
        jsonStream.name("metaData");
        jsonStream.value(this.metadata, true);
        jsonStream.endObject();
    }
}
