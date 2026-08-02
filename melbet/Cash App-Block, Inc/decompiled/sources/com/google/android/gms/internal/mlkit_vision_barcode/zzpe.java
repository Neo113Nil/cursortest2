package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class zzpe {
    public static boolean doesDisplaySupportDolbyVision(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAddToDigitalWallet.deepLinkSpecs;
    }

    public static final SerializableActivityItem serializable(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        formattedPaymentHistoryActivityItem.getClass();
        String itemId = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
        String itemId2 = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
        ByteString encodeByteString = UiPayment.ADAPTER.encodeByteString(formattedPaymentHistoryActivityItem.getUiPayment());
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        ByteString encodeByteString2 = protoAdapter.encodeByteString(formattedPaymentHistoryActivityItem.getUiSender());
        ByteString encodeByteString3 = protoAdapter.encodeByteString(formattedPaymentHistoryActivityItem.getUiRecipient());
        ActivityItemType itemType = ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem);
        ByteString encodeByteString4 = itemType != null ? ActivityItemType.ADAPTER.encodeByteString(itemType) : null;
        ActivityRowSection section = formattedPaymentHistoryActivityItem.getSection();
        return new SerializableActivityItem(itemId, itemId2, encodeByteString, encodeByteString2, encodeByteString3, encodeByteString4, section != null ? ActivityRowSection.ADAPTER.encodeByteString(section) : null, formattedPaymentHistoryActivityItem.isBadged(), formattedPaymentHistoryActivityItem.isOffline(), formattedPaymentHistoryActivityItem.getVersion(), null);
    }
}
