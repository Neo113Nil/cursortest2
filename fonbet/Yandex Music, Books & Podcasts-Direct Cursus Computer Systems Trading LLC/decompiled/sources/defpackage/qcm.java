package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import ru.yandex.music.chat.SupportChatActivity;

/* loaded from: classes6.dex */
public final class qcm implements uyp, kwo, up4, z7q, ydx {
    public static final int c(int i, long j) {
        int i2 = vps.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static Intent d(Context context, esr esrVar) {
        int i = SupportChatActivity.w;
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) SupportChatActivity.class);
        intent.putExtra("extra.entrypoint", esrVar);
        intent.putExtra("extra.initialtext", (String) null);
        return intent;
    }

    public static long e(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("not used in relay");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return Boolean.valueOf(startGenerativeQueueCommand.getPlayWhenReady());
    }

    @Override // defpackage.z7q
    public Object D(z1q z1qVar) {
        z1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public Object E(k9q k9qVar) {
        k9qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public Object G(b1q b1qVar) {
        b1qVar.getClass();
        return null;
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return Boolean.valueOf(startVideoClipRadioQueueCommand.getPlayWhenReady());
    }

    @Override // defpackage.up4
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ydx
    public hex b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.ydx
    public boolean l(Class cls) {
        return false;
    }

    @Override // defpackage.z7q
    public Object o(a1q a1qVar) {
        a1qVar.getClass();
        return null;
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return Boolean.valueOf(startYnisonQueueCommand.getPlayWhenReady());
    }

    @Override // defpackage.z7q
    public Object r(a8q a8qVar) {
        a8qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public Object s(wpw wpwVar) {
        wpwVar.getClass();
        return wpwVar.f;
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        return Boolean.valueOf(startFmRadioQueueCommand.c());
    }

    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        startWaveQueueCommand.getClass();
        return Boolean.valueOf(startWaveQueueCommand.getPlayWhenReady());
    }

    @Override // defpackage.kwo
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.kwo
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
