package androidx.compose.ui.autofill;

import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.datastore.core.SimpleActor;
import androidx.work.impl.StartStopTokensImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.integration.analytics.Action;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.protos.common.CurrencyCode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NotImplementedError;

/* loaded from: classes3.dex */
public abstract class AndroidAutofill_androidKt {
    public static final void access$attachCommonFields(Intent intent, CashNotification cashNotification) {
        intent.putExtra("is-push-notification", true);
        intent.putExtra("analytics-key", cashNotification.analyticsKey);
        intent.putExtra("event-type", cashNotification.getNotificationType());
        intent.putExtra("event-action", Action.OPENED);
        intent.putExtra("engagement-reporting-id", cashNotification.engagementReportingId);
        intent.putExtra("url-notification", cashNotification.getUrl());
    }

    public static final void performAutofill(SimpleActor simpleActor, SparseArray sparseArray) {
        if (((StartStopTokensImpl) simpleActor.consumeMessage).runs.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            if (autofillValue.isText()) {
                StartStopTokensImpl startStopTokensImpl = (StartStopTokensImpl) simpleActor.consumeMessage;
                autofillValue.getTextValue().toString();
                if (startStopTokensImpl.runs.get(Integer.valueOf(keyAt)) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
            } else {
                if (autofillValue.isDate()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValue.isList()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValue.isToggle()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void populateViewStructure(SimpleActor simpleActor, ViewStructure viewStructure) {
        StartStopTokensImpl startStopTokensImpl = (StartStopTokensImpl) simpleActor.consumeMessage;
        LinkedHashMap linkedHashMap = startStopTokensImpl.runs;
        if (startStopTokensImpl.runs.isEmpty()) {
            return;
        }
        int addChildCount = viewStructure.addChildCount(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            ViewStructure newChild = viewStructure.newChild(addChildCount);
            newChild.setAutofillId((AutofillId) simpleActor.remainingMessages, intValue);
            newChild.setId(intValue, ((AndroidComposeView) simpleActor.scope).getContext().getPackageName(), null, null);
            newChild.setAutofillType(1);
            throw null;
        }
    }

    public String getAmount() {
        return null;
    }

    public abstract CurrencyCode getCurrencyCode();

    public String getSubAmount() {
        return null;
    }
}
