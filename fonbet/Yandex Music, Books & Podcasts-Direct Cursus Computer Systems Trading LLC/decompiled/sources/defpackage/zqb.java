package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class zqb extends uif implements Function0 {
    public final /* synthetic */ crb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqb(crb crbVar) {
        super(0);
        this.r = crbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        crb crbVar = this.r;
        gsa gsaVar = crbVar.h;
        ExoPlayer exoPlayer = crbVar.a;
        exoPlayer.c();
        gsaVar.getClass();
        if (exoPlayer.c() == 1) {
            throw new PlaybackException.ErrorNoPrepare();
        }
        exoPlayer.L(true);
        return Unit.a;
    }
}
