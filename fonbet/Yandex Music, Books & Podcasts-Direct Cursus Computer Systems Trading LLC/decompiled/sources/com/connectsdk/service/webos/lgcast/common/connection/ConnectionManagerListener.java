package com.connectsdk.service.webos.lgcast.common.connection;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface ConnectionManagerListener {
    void onConnectionCompleted(@NonNull JSONObject jSONObject);

    void onConnectionFailed(@NonNull String str);

    void onError(@NonNull ConnectionManagerError connectionManagerError, @NonNull String str);

    void onPairingRejected();

    void onPairingRequested();

    void onReceiveGetParameter(@NonNull JSONObject jSONObject);

    void onReceivePlayCommand(@NonNull JSONObject jSONObject);

    void onReceiveSetParameter(@NonNull JSONObject jSONObject);

    void onReceiveStopCommand(@NonNull JSONObject jSONObject);
}
