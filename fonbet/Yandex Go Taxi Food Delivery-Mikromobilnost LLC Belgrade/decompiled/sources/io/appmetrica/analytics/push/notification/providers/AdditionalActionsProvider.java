package io.appmetrica.analytics.push.notification.providers;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.q;
import androidx.core.app.z0;
import defpackage.zf0;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.impl.AbstractC1035h;
import io.appmetrica.analytics.push.internal.IntentHelper;
import io.appmetrica.analytics.push.model.AdditionalAction;
import io.appmetrica.analytics.push.model.AdditionalActionType;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public class AdditionalActionsProvider implements NotificationValueProvider<List<q>> {
    private final Context a;

    public AdditionalActionsProvider(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public List<q> get(PushMessage pushMessage) {
        AdditionalAction[] additionalActions;
        PushNotification notification = pushMessage.getNotification();
        if (notification == null || (additionalActions = notification.getAdditionalActions()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AdditionalAction additionalAction : additionalActions) {
            if (CoreUtils.isNotEmpty(additionalAction.getTitle())) {
                zf0 zf0Var = new zf0(additionalAction.getIconResId() == null ? 0 : additionalAction.getIconResId().intValue(), additionalAction.getTitle(), IntentHelper.getPendingIntentForAdditionalAction(this.a, additionalAction, IntentHelper.createNotificationActionInfo(pushMessage, additionalAction)));
                if (additionalAction.getType() == AdditionalActionType.INLINE) {
                    if (AbstractC1035h.a(24) && CoreUtils.isNotEmpty(additionalAction.getLabel())) {
                        z0 z0Var = new z0(additionalAction.getLabel(), new Bundle(), new HashSet());
                        if (((ArrayList) zf0Var.g) == null) {
                            zf0Var.g = new ArrayList();
                        }
                        ((ArrayList) zf0Var.g).add(z0Var);
                    }
                }
                arrayList.add(zf0Var.a());
            }
        }
        return arrayList;
    }
}
