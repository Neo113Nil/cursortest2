package com.bugsnag.android;

import androidx.room.Room;
import com.bugsnag.android.JsonStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class Session implements JsonStream.Streamable, Deliverable {
    public final String apiKey;

    /* renamed from: app, reason: collision with root package name */
    public App f942app;
    public volatile boolean autoCaptured;
    public Device device;
    public final File file;
    public final AtomicInteger handledCount;
    public String id;
    public final AtomicBoolean isPaused;
    public final Logger logger;
    public final Notifier notifier;
    public Date startedAt;
    public final AtomicBoolean tracked;
    public final AtomicInteger unhandledCount;
    public final User user;

    public Session(File file, Notifier notifier, Logger logger, String str) {
        this.autoCaptured = false;
        this.unhandledCount = new AtomicInteger();
        this.handledCount = new AtomicInteger();
        this.tracked = new AtomicBoolean(false);
        this.isPaused = new AtomicBoolean(false);
        this.file = file;
        this.logger = logger;
        if (file != null && StringsKt__StringsJVMKt.endsWith(file.getName(), "_v3.json", false)) {
            String substringBefore$default = StringsKt.substringBefore$default(file.getName(), '_');
            substringBefore$default = substringBefore$default.length() == 0 ? null : substringBefore$default;
            if (substringBefore$default != null) {
                str = substringBefore$default;
            }
        }
        this.apiKey = str;
        if (notifier == null) {
            this.notifier = null;
            return;
        }
        Notifier notifier2 = new Notifier(notifier.name, notifier.version, notifier.url);
        notifier2.dependencies = new ArrayList(notifier.dependencies);
        this.notifier = notifier2;
    }

    public static Session copySession(Session session) {
        Session session2 = new Session(session.id, session.startedAt, session.user, session.unhandledCount.get(), session.handledCount.get(), session.notifier, session.logger, session.apiKey);
        session2.tracked.set(session.tracked.get());
        session2.autoCaptured = session.autoCaptured;
        return session2;
    }

    public final boolean isLegacyPayload() {
        File file = this.file;
        if (file != null) {
            return (file.getName().endsWith("_v2.json") || file.getName().endsWith("_v3.json")) ? false : true;
        }
        return true;
    }

    @Override // com.bugsnag.android.Deliverable
    public final byte[] toByteArray() {
        return Room.serialize(this);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        Notifier notifier = this.notifier;
        File file = this.file;
        if (file != null) {
            if (!isLegacyPayload()) {
                jsonStream.value(file);
                return;
            }
            jsonStream.beginObject();
            jsonStream.name("notifier");
            jsonStream.value(notifier);
            jsonStream.name("app");
            jsonStream.value(this.f942app);
            jsonStream.name("device");
            jsonStream.value(this.device);
            jsonStream.name("sessions");
            jsonStream.beginArray();
            jsonStream.value(file);
            jsonStream.endArray();
            jsonStream.endObject();
            return;
        }
        jsonStream.beginObject();
        jsonStream.name("notifier");
        jsonStream.value(notifier);
        jsonStream.name("app");
        jsonStream.value(this.f942app);
        jsonStream.name("device");
        jsonStream.value(this.device);
        jsonStream.name("sessions");
        jsonStream.beginArray();
        jsonStream.beginObject();
        jsonStream.name("id");
        jsonStream.value(this.id);
        jsonStream.name("startedAt");
        jsonStream.value(this.startedAt);
        jsonStream.name("user");
        jsonStream.value(this.user);
        jsonStream.endObject();
        jsonStream.endArray();
        jsonStream.endObject();
    }

    public Session(String str, Date date, User user, int i, int i2, Notifier notifier, Logger logger, String str2) {
        this(str, date, user, false, notifier, logger, str2);
        this.unhandledCount.set(i);
        this.handledCount.set(i2);
        this.tracked.set(true);
        this.apiKey = str2;
    }

    public Session(String str, Date date, User user, boolean z, Notifier notifier, Logger logger, String str2) {
        this(null, notifier, logger, str2);
        this.id = str;
        this.startedAt = new Date(date.getTime());
        this.user = user;
        this.autoCaptured = z;
        this.apiKey = str2;
    }
}
