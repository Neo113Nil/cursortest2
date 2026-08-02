package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.SetRepeatModeCommand;
import com.yandex.music.shared.wave.domain.commands.d;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$RepeatToggle;

/* loaded from: classes4.dex */
public final class eop implements z7q {
    public final SetRepeatModeCommand a;

    public eop(SetRepeatModeCommand setRepeatModeCommand) {
        setRepeatModeCommand.getClass();
        this.a = setRepeatModeCommand;
    }

    @Override // defpackage.z7q
    public final Object D(z1q z1qVar) {
        z1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object E(k9q k9qVar) {
        k9qVar.getClass();
        return d.a.k(this.a.getRepeatModeType());
    }

    @Override // defpackage.z7q
    public final Object G(b1q b1qVar) {
        b1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object o(a1q a1qVar) {
        a1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object r(a8q a8qVar) {
        a8qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object s(wpw wpwVar) {
        wpwVar.getClass();
        ogp ogpVar = wpwVar.k;
        nyn repeatModeType = this.a.getRepeatModeType();
        ogpVar.getClass();
        repeatModeType.getClass();
        return new YnisonOptionCommand$RepeatToggle(repeatModeType);
    }
}
