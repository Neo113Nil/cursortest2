package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class TopicOperation {
    public static final Pattern TOPIC_NAME_REGEXP = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: operation, reason: collision with root package name */
    public final String f1011operation;
    public final String serializedString;
    public final String topic;

    public TopicOperation(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !TOPIC_NAME_REGEXP.matcher(str3).matches()) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.topic = str3;
        this.f1011operation = str;
        this.serializedString = Recorder$$ExternalSyntheticOutline2.m(str, "!", str2);
    }

    public static TopicOperation from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new TopicOperation(split[0], split[1]);
    }

    public static TopicOperation subscribe(String str) {
        return new TopicOperation("S", str);
    }

    public static TopicOperation unsubscribe(String str) {
        return new TopicOperation("U", str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.topic.equals(topicOperation.topic) && this.f1011operation.equals(topicOperation.f1011operation);
    }

    public final String getOperation() {
        return this.f1011operation;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1011operation, this.topic});
    }

    public final String serialize() {
        return this.serializedString;
    }
}
