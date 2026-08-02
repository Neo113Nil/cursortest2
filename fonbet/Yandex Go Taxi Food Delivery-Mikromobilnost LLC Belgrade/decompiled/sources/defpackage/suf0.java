package defpackage;

import com.yandex.quark.alice.AliceModelType;
import com.yandex.quark.dialog.DialogType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2ModeInfo;
import ru.yandex.alice.protos.data.dialog_state.platform.utils.TDialogState;
import ru.yandex.alice.protos.data.dialog_type.platform.utils.EDialogType;

/* loaded from: classes4.dex */
public final class suf0 implements odj {
    public final TDialogState a;

    public suf0(TDialogState tDialogState) {
        this.a = tDialogState;
        if (tDialogState.getDialogId() == null) {
            gej.Companion.getClass();
            DialogType dialogType = DialogType.SKILL;
        } else {
            EDialogType dialogType2 = tDialogState.getDialogType();
            int i = dialogType2 == null ? -1 : ruf0.a[dialogType2.ordinal()];
            if (i == 1) {
                gej.Companion.getClass();
                DialogType dialogType3 = DialogType.SKILL;
            } else if (i == 2) {
                gej.Companion.getClass();
                DialogType dialogType4 = DialogType.SKILL;
            } else if (i == 3) {
                gej.Companion.getClass();
                DialogType dialogType5 = DialogType.SKILL;
            } else if (i != 4) {
                DialogType dialogType6 = DialogType.SKILL;
            } else {
                gej.Companion.getClass();
                DialogType dialogType7 = DialogType.SKILL;
            }
        }
        if (tDialogState.getFolderId() == null) {
            qwr.Companion.getClass();
        }
        TAlice2ModeInfo alice2ModeInfo = tDialogState.getAlice2ModeInfo();
        TAlice2ModeInfo.EMode mode = alice2ModeInfo != null ? alice2ModeInfo.getMode() : null;
        int i2 = mode != null ? ruf0.b[mode.ordinal()] : -1;
        if (i2 == 1) {
            AliceModelType aliceModelType = AliceModelType.BASE;
        } else if (i2 != 2) {
            AliceModelType aliceModelType2 = AliceModelType.BASE;
        } else {
            AliceModelType aliceModelType3 = AliceModelType.BASE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suf0) && jl40.l(this.a, ((suf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProtoDialogContext(dialogState=" + this.a + Extension.C_BRAKE;
    }
}
