package androidx.graphics.shapes;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.glance.session.TimerScopeKt;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Recorded;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Sending;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes3.dex */
public abstract class CubicKt {
    public static final Cubic Cubic(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new Cubic(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ChatContentViewModel.EntryViewModel.ContentDescription createContentDescription(Message message, AndroidStringManager androidStringManager, AssetPublicSuffixList assetPublicSuffixList) {
        Message.Sender sender;
        String str;
        int ordinal;
        String str2;
        int ordinal2;
        String str3;
        TimerScopeKt status;
        String str4;
        Resources resources = androidStringManager.resources;
        message.getClass();
        assetPublicSuffixList.getClass();
        if (message instanceof PendingMessage) {
            sender = Message.Sender.CUSTOMER;
        } else {
            if (!(message instanceof RecordedMessage)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            sender = ((RecordedMessage) message).sender;
        }
        int ordinal3 = sender.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 != 1) {
                if (ordinal3 != 2) {
                    if (ordinal3 != 3) {
                        if (ordinal3 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                }
                str = androidStringManager.get(R.string.support_chat_message_sender_cash_app_bot);
            } else {
                str = androidStringManager.get(R.string.support_chat_message_sender_cash_app_advocate);
            }
            ordinal = sender.ordinal();
            if (ordinal != 0) {
                str2 = androidStringManager.get(R.string.support_chat_message_content_description_you_said);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str5 = str == null ? "null" : str;
                resources.getClass();
                str2 = new MessageFormat(resources.getString(R.string.support_chat_message_content_description_they_said)).format(new Object[]{str5});
                str2.getClass();
            }
            ordinal2 = sender.ordinal();
            if (ordinal2 != 0) {
                str3 = androidStringManager.get(R.string.support_chat_message_content_description_yours);
            } else {
                if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (str == null) {
                    str = "null";
                }
                resources.getClass();
                str3 = new MessageFormat(resources.getString(R.string.support_chat_message_content_description_from)).format(new Object[]{str});
                str3.getClass();
            }
            status = message.getStatus();
            if (!(status instanceof MessageStatus$Failed)) {
                str4 = androidStringManager.get(R.string.support_chat_message_content_description_status_failed);
            } else if (Intrinsics.areEqual(status, MessageStatus$Recorded.INSTANCE)) {
                String formatDate$default = AssetPublicSuffixList.formatDate$default(assetPublicSuffixList, message.getTimestamp(), 12);
                String formatTime = assetPublicSuffixList.formatTime(message.getTimestamp());
                formatDate$default.getClass();
                formatTime.getClass();
                resources.getClass();
                str4 = new MessageFormat(resources.getString(R.string.support_chat_message_content_description_status_delivered)).format(new Object[]{formatDate$default, formatTime});
                str4.getClass();
            } else {
                if (!Intrinsics.areEqual(status, MessageStatus$Sending.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str4 = androidStringManager.get(R.string.support_chat_message_content_description_status_sending);
            }
            return new ChatContentViewModel.EntryViewModel.ContentDescription(str2, str3, str4);
        }
        str = null;
        ordinal = sender.ordinal();
        if (ordinal != 0) {
        }
        ordinal2 = sender.ordinal();
        if (ordinal2 != 0) {
        }
        status = message.getStatus();
        if (!(status instanceof MessageStatus$Failed)) {
        }
        return new ChatContentViewModel.EntryViewModel.ContentDescription(str2, str3, str4);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewActivityReceiptOnRequest.deepLinkSpecs;
    }
}
