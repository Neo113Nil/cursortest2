package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.SetShuffleCommand;
import com.yandex.music.shared.wave.domain.commands.d;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleToggle;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleWithIndices;
import java.util.List;

/* loaded from: classes4.dex */
public final class kop implements z7q {
    public final SetShuffleCommand a;

    public kop(SetShuffleCommand setShuffleCommand) {
        setShuffleCommand.getClass();
        this.a = setShuffleCommand;
    }

    @Override // defpackage.z7q
    public final Object D(z1q z1qVar) {
        z1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object E(k9q k9qVar) {
        k9qVar.getClass();
        SetShuffleCommand setShuffleCommand = this.a;
        return d.a.m(setShuffleCommand.getShuffle(), setShuffleCommand.getNewOriginalPosition(), setShuffleCommand.getShufflePositions());
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
        SetShuffleCommand setShuffleCommand = this.a;
        gxj newOriginalPosition = setShuffleCommand.getNewOriginalPosition();
        ogp ogpVar = wpwVar.k;
        if (newOriginalPosition == null) {
            boolean shuffle = setShuffleCommand.getShuffle();
            ogpVar.getClass();
            return new YnisonOptionCommand$ShuffleToggle(shuffle);
        }
        List shufflePositions = setShuffleCommand.getShufflePositions();
        if (shufflePositions == null || !setShuffleCommand.getShuffle()) {
            shufflePositions = null;
        }
        int i = newOriginalPosition.a;
        ogpVar.getClass();
        return new YnisonOptionCommand$ShuffleWithIndices(shufflePositions, i);
    }
}
