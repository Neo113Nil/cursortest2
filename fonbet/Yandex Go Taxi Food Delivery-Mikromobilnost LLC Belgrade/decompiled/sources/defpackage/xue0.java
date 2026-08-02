package defpackage;

import com.yandex.payment.sdk.ui.preselect.select.PreselectFragment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class xue0 {
    public static PreselectFragment a(String str, boolean z) {
        PreselectFragment preselectFragment = new PreselectFragment();
        preselectFragment.setArguments(wwg.g(new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z)), new Pair("DEFAULT_PAYMENT_METHOD_ID", str)));
        return preselectFragment;
    }
}
