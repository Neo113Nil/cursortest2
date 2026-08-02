package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class Notifier implements JsonStream.Streamable {
    public List dependencies = EmptyList.INSTANCE;
    public final String name;
    public final String url;
    public final String version;

    public Notifier(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.url = str3;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("name");
        jsonStream.value(this.name);
        jsonStream.name("version");
        jsonStream.value(this.version);
        jsonStream.name("url");
        jsonStream.value(this.url);
        if (!this.dependencies.isEmpty()) {
            jsonStream.name("dependencies");
            jsonStream.beginArray();
            Iterator it = this.dependencies.iterator();
            while (it.hasNext()) {
                jsonStream.value((Notifier) it.next());
            }
            jsonStream.endArray();
        }
        jsonStream.endObject();
    }
}
