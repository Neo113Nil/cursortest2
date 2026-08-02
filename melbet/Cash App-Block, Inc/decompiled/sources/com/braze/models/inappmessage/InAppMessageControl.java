package com.braze.models.inappmessage;

import bo.app.a9;
import bo.app.e2;
import bo.app.k1;
import bo.app.y8;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger$$ExternalSyntheticLambda3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageControl;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a9;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;)V", "", "logImpression", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "controlImpressionLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class InAppMessageControl extends InAppMessageBase {
    private final AtomicBoolean controlImpressionLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageControl(JSONObject jSONObject, a9 a9Var) {
        super(jSONObject, a9Var, false, false, 12, null);
        jSONObject.getClass();
        a9Var.getClass();
        this.controlImpressionLogged = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0() {
        return "Control impression already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1() {
        return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2() {
        return "Cannot log an in-app message control impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$3() {
        return "Logging control in-app message impression event";
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.CONTROL;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        if (this.controlImpressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(28), 6, (Object) null);
            return false;
        }
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(2), 6, (Object) null);
            return false;
        }
        if (getBrazeManager() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(29), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(1), 6, (Object) null);
        String triggerId2 = getTriggerId();
        y8 k = triggerId2 != null ? k1.g.k(triggerId2, getMessageExtras()) : null;
        if (k != null) {
            a9 brazeManager = getBrazeManager();
            if (brazeManager != null) {
                ((e2) brazeManager).a(k);
            }
            this.controlImpressionLogged.set(true);
        }
        return true;
    }
}
