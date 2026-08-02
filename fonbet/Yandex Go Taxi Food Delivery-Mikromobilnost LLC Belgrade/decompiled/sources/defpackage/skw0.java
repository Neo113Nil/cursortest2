package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.dashboard.api.model.SupportState;

/* loaded from: classes3.dex */
public abstract class skw0 {
    public static final nbv a(SupportState supportState) {
        int i = rkw0.a[supportState.ordinal()];
        if (i == 1) {
            return new nbv(txg0.ybsdk_ic_support_v2, null);
        }
        if (i == 2) {
            return new nbv(txg0.ybsdk_ic_support_with_badge_v2, null);
        }
        w511.b();
        return null;
    }

    public static final nbv b(SupportState supportState) {
        int i = rkw0.a[supportState.ordinal()];
        if (i == 1) {
            return new nbv(byg0.ybsdk_dashboard_ic_faq, null);
        }
        if (i == 2) {
            return new nbv(byg0.ybsdk_dashboard_ic_faq_unread_messages, null);
        }
        w511.b();
        return null;
    }

    public static final Text.Resource c(SupportState supportState) {
        int i = rkw0.a[supportState.ordinal()];
        if (i == 1) {
            return unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_contact_support_title);
        }
        if (i == 2) {
            return unr0.h(Text.Companion, dzh0.ybsdk_dashboard_content_description_support_button_has_messages);
        }
        w511.b();
        return null;
    }
}
