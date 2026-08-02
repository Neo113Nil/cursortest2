package ru.yandex.taxi.fragment.order;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b6e0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.wnb0;
import defpackage.zkh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/fragment/order/PoolRulesReminderModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "", "title", "body", "", "maxWaitingTime", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Companion", "b6e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PoolRulesReminderModalView extends ModalView {
    public static final int $stable = 8;
    public static final b6e0 Companion = new b6e0();
    private static final String MAX_WAITING_TIME_PLACEHOLDER = "$MAX_WAITING_TIME$";
    private final ViewGroup content;

    public PoolRulesReminderModalView(Context context, String str, String str2, int i) {
        super(context);
        c.q(this, zkh0.pool_rules_reminder_popup, true);
        int i2 = p8h0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i2));
        str = (str == null || evu0.J(str)) ? context.getString(kyh0.pool_waiting_time_limit_reminder_title) : str;
        String v = cvu0.v((str2 == null || evu0.J(str2)) ? context.getString(kyh0.pool_waiting_time_limit_reminder) : str2, "$MAX_WAITING_TIME$", String.valueOf(i), false);
        TextView textView = (TextView) findViewById(p8h0.reminder_title);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) findViewById(p8h0.waiting_time_limit);
        if (textView2 != null) {
            textView2.setText(v);
        }
        c.t(this, p8h0.confirm, new wnb0(20, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return this.content;
    }
}
