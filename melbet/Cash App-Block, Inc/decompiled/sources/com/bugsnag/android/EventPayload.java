package com.bugsnag.android;

import androidx.room.Room;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import java.io.File;
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class EventPayload implements JsonStream.Streamable, Deliverable {
    public final String apiKey;
    public byte[] cachedBytes;
    public final ImmutableConfig config;
    public Event event;
    public final File eventFile;
    public final Notifier notifier;

    public EventPayload(String str, Event event, File file, Notifier notifier, ImmutableConfig immutableConfig) {
        this.apiKey = str;
        this.config = immutableConfig;
        this.event = event;
        this.eventFile = file;
        Notifier notifier2 = new Notifier(notifier.name, notifier.version, notifier.url);
        notifier2.dependencies = CollectionsKt.toMutableList((Collection) notifier.dependencies);
        this.notifier = notifier2;
    }

    @Override // com.bugsnag.android.Deliverable
    public final byte[] toByteArray() {
        byte[] bArr = this.cachedBytes;
        if (bArr != null) {
            return bArr;
        }
        byte[] serialize = Room.serialize(this);
        this.cachedBytes = serialize;
        return serialize;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("apiKey");
        jsonStream.value(this.apiKey);
        jsonStream.name("payloadVersion");
        jsonStream.value("4.0");
        jsonStream.name("notifier");
        jsonStream.value(this.notifier);
        jsonStream.name("events");
        jsonStream.beginArray();
        Event event = this.event;
        if (event != null) {
            jsonStream.value(event);
        } else {
            File file = this.eventFile;
            if (file != null) {
                jsonStream.value(file);
            }
        }
        jsonStream.endArray();
        jsonStream.endObject();
    }
}
