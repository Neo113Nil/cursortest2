package com.google.firebase;

import android.content.Context;
import android.os.Build;
import androidx.tracing.Trace;
import app.cash.trifle.Trifle;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessagingRegistrar$$ExternalSyntheticLambda0;
import com.google.firebase.platforminfo.AutoValue_LibraryVersion;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        Component.Builder builder = Component.builder(DefaultUserAgentPublisher.class);
        builder.add(new Dependency(2, 0, AutoValue_LibraryVersion.class));
        builder.factory = new OptionalProvider$$ExternalSyntheticLambda0(11);
        arrayList.add(builder.build());
        Qualified qualified = new Qualified(Background.class, Executor.class);
        Component.Builder builder2 = new Component.Builder(DefaultHeartBeatController.class, new Class[]{HeartBeatController.class, HeartBeatInfo.class});
        builder2.add(Dependency.required(Context.class));
        builder2.add(Dependency.required(FirebaseApp.class));
        builder2.add(new Dependency(2, 0, Trifle.class));
        builder2.add(new Dependency(1, 1, DefaultUserAgentPublisher.class));
        builder2.add(new Dependency(qualified, 1, 0));
        builder2.factory = new FirebaseMessagingRegistrar$$ExternalSyntheticLambda0(qualified, 1);
        arrayList.add(builder2.build());
        arrayList.add(Trace.create("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(Trace.create("fire-core", "22.0.1"));
        arrayList.add(Trace.create("device-name", safeValue(Build.PRODUCT)));
        arrayList.add(Trace.create("device-model", safeValue(Build.DEVICE)));
        arrayList.add(Trace.create("device-brand", safeValue(Build.BRAND)));
        arrayList.add(Trace.fromContext("android-target-sdk", new MacWrapper$$ExternalSyntheticLambda0(26)));
        arrayList.add(Trace.fromContext("android-min-sdk", new MacWrapper$$ExternalSyntheticLambda0(27)));
        arrayList.add(Trace.fromContext("android-platform", new MacWrapper$$ExternalSyntheticLambda0(28)));
        arrayList.add(Trace.fromContext("android-installer", new MacWrapper$$ExternalSyntheticLambda0(29)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(Trace.create("kotlin", str));
        }
        return arrayList;
    }
}
