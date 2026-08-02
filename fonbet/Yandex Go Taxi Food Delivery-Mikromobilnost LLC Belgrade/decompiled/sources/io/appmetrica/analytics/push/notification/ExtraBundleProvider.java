package io.appmetrica.analytics.push.notification;

import android.os.Bundle;
import io.appmetrica.analytics.push.model.PushMessage;

/* loaded from: classes9.dex */
public interface ExtraBundleProvider {
    Bundle getExtraBundle(PushMessage pushMessage);
}
