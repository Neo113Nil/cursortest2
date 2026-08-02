package com.squareup.cash.appmessages.presenters;

import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.Actions$Two;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import dev.zacsweers.metro.internal.Factory;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public final class RealAppMessageActionPresenterHelper {

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealAppMessageActionPresenterHelper();
        }
    }

    public static Action asAction(AppMessageAction appMessageAction, String str, boolean z) {
        if (appMessageAction == null) {
            return null;
        }
        String str2 = appMessageAction.text;
        if (str2 != null) {
            return new Action(str2, appMessageAction.text_color, new AppMessageViewEvent.AppMessageActionTaken(str, appMessageAction.url_to_open, z, null, 8));
        }
        Timber.Forest.w("No 'text' in app message action payload: " + appMessageAction, new Object[0]);
        return null;
    }

    public static StringUtilsKt viewModelActions(String str, boolean z, AppMessageAction appMessageAction, AppMessageAction appMessageAction2) {
        str.getClass();
        appMessageAction.getClass();
        if (appMessageAction2 == null) {
            Action asAction = asAction(appMessageAction, str, z);
            asAction.getClass();
            return new Actions$One(asAction);
        }
        Action asAction2 = asAction(appMessageAction, str, z);
        asAction2.getClass();
        Action asAction3 = asAction(appMessageAction2, str, z);
        if (asAction3 != null) {
            return new Actions$Two(asAction2, asAction3);
        }
        Action asAction4 = asAction(appMessageAction, str, z);
        asAction4.getClass();
        return new Actions$One(asAction4);
    }
}
