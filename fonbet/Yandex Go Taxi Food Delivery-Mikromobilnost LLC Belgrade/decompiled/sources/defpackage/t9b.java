package defpackage;

import android.widget.CompoundButton;
import com.yandex.messaging.ui.chatinfo.editchat.ChatSettingsSwitch;

/* loaded from: classes15.dex */
public final /* synthetic */ class t9b implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatSettingsSwitch b;

    public /* synthetic */ t9b(ChatSettingsSwitch chatSettingsSwitch, int i) {
        this.a = i;
        this.b = chatSettingsSwitch;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        ChatSettingsSwitch chatSettingsSwitch = this.b;
        switch (i) {
            case 0:
                ChatSettingsSwitch._set_isChecked_$lambda$0(chatSettingsSwitch, compoundButton, z);
                break;
            default:
                ChatSettingsSwitch.lambda$3$lambda$2(chatSettingsSwitch, compoundButton, z);
                break;
        }
    }
}
