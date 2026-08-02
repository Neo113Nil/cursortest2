package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.SubscriptionWidgetView;
import com.ybsdk.widgets.common.WidgetWithSwitchView;
import com.ybsdk.widgets.common.WidgetWithToggleView;

/* loaded from: classes2.dex */
public final /* synthetic */ class vpb implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vpb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Chip) obj).lambda$new$0(compoundButton, z);
                break;
            case 1:
                NewBindFragment.bindCardView$lambda$1((NewBindFragment) obj, compoundButton, z);
                break;
            case 2:
                PreselectNewBindFragment.onViewCreated$lambda$1((PreselectNewBindFragment) obj, compoundButton, z);
                break;
            case 3:
                m9f0 m9f0Var = (m9f0) obj;
                if (compoundButton.isPressed()) {
                    m9f0Var.d.invoke(Boolean.valueOf(z));
                    break;
                }
                break;
            case 4:
                SubscriptionWidgetView._init_$lambda$0((SubscriptionWidgetView) obj, compoundButton, z);
                break;
            case 5:
                WidgetWithSwitchView._init_$lambda$0((WidgetWithSwitchView) obj, compoundButton, z);
                break;
            default:
                WidgetWithToggleView._init_$lambda$1((WidgetWithToggleView) obj, compoundButton, z);
                break;
        }
    }
}
