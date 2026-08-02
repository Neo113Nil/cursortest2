package io.appmetrica.analytics.push.coreutils.internal.model;

import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/model/BasePushMessage;", "", "", "a", "Ljava/lang/String;", "getRootString", "()Ljava/lang/String;", "rootString", "Lorg/json/JSONObject;", "b", "Lorg/json/JSONObject;", "getRoot", "()Lorg/json/JSONObject;", "root", "", "c", "Z", "isOwnPush", "()Z", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes9.dex */
public class BasePushMessage {

    /* renamed from: a, reason: from kotlin metadata */
    private final String rootString;

    /* renamed from: b, reason: from kotlin metadata */
    private final JSONObject root;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean isOwnPush;

    public BasePushMessage(Bundle bundle) {
        String string = bundle.getString(CoreConstants.PushMessage.ROOT_ELEMENT);
        this.rootString = string;
        JSONObject jSONObject = null;
        if (string != null) {
            try {
                jSONObject = new JSONObject(string);
            } catch (Throwable unused) {
                PublicLogger.INSTANCE.warning("Ignore parse push message exception", new Object[0]);
            }
        }
        this.root = jSONObject;
        this.isOwnPush = jSONObject != null;
    }

    public final JSONObject getRoot() {
        return this.root;
    }

    public final String getRootString() {
        return this.rootString;
    }

    /* renamed from: isOwnPush, reason: from getter */
    public final boolean getIsOwnPush() {
        return this.isOwnPush;
    }
}
