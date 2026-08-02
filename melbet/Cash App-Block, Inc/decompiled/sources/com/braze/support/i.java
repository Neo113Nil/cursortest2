package com.braze.support;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a9;
import bo.app.ka;
import bo.app.l$$ExternalSyntheticLambda2;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class i {
    public static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final InAppMessageBase a(JSONObject jSONObject, a9 a9Var) {
        InAppMessageBase inAppMessageFull;
        String upperCase;
        jSONObject.getClass();
        a9Var.getClass();
        try {
            if (jSONObject.optBoolean("is_control", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(6), 12, (Object) null);
                return new InAppMessageControl(jSONObject, a9Var);
            }
            try {
                String string2 = jSONObject.getString("type");
                string2.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = string2.toUpperCase(locale);
                upperCase.getClass();
            } catch (Exception unused) {
                r5 = null;
            }
            for (MessageType messageType : MessageType.values()) {
                if (Intrinsics.areEqual(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 20), 12, (Object) null);
                        return null;
                    }
                    int i = ka.a[messageType.ordinal()];
                    if (i == 1) {
                        inAppMessageFull = new InAppMessageFull(jSONObject, a9Var);
                    } else if (i == 2) {
                        inAppMessageFull = new InAppMessageModal(jSONObject, a9Var);
                    } else if (i == 3) {
                        inAppMessageFull = new InAppMessageSlideup(jSONObject, a9Var);
                    } else if (i == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(jSONObject, a9Var);
                    } else {
                        if (i != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 21), 12, (Object) null);
                            return null;
                        }
                        inAppMessageFull = new InAppMessageHtml(jSONObject, a9Var);
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 22), 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return Recorder$$ExternalSyntheticOutline2.m("Unknown in-app message type. Returning null: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    public static final String c(JSONObject jSONObject) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to deserialize the in-app message: ", JsonUtils.getPrettyPrintedString(jSONObject), ". Returning null.");
    }

    public static final String a() {
        return "Deserializing control in-app message.";
    }

    public static final String a(JSONObject jSONObject) {
        return Recorder$$ExternalSyntheticOutline2.m("In-app message type was unknown for in-app message: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
