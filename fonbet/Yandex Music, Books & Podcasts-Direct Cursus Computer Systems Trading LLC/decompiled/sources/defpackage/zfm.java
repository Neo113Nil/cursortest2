package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import java.util.Map;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes5.dex */
public final class zfm implements bgm, uyp, MessengerAnalytics, hyi {
    public static Intent a(Context context, ypt yptVar, PlaybackScope playbackScope, Bundle bundle, boolean z) {
        context.getClass();
        playbackScope.getClass();
        Intent putExtra = new Intent(context, (Class<?>) UrlActivity.class).setData(yptVar.m()).putExtra("extra.playbackScope", playbackScope).putExtra("need_permission", yptVar.O()).putExtra("extra.use.browser", z).putExtra("extra.bundle.params", bundle);
        putExtra.getClass();
        putExtra.putExtra("extraFromUrlScheme", true);
        return putExtra;
    }

    public static final vdx d(Object obj, Object obj2) {
        vdx vdxVar = (vdx) obj;
        vdx vdxVar2 = (vdx) obj2;
        if (!vdxVar2.isEmpty()) {
            if (!vdxVar.a) {
                if (vdxVar.isEmpty()) {
                    vdxVar = new vdx();
                } else {
                    vdx vdxVar3 = new vdx(vdxVar);
                    vdxVar3.a = true;
                    vdxVar = vdxVar3;
                }
            }
            vdxVar.c();
            if (!vdxVar2.isEmpty()) {
                vdxVar.putAll(vdxVar2);
            }
        }
        return vdxVar;
    }

    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("not used in relay");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.bgm
    public long b(int i) {
        return 1000L;
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return Boolean.FALSE;
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalytics
    public void sendEvent(String str, Map map) {
        map.getClass();
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        startWaveQueueCommand.getClass();
        return Boolean.valueOf(startWaveQueueCommand.getStartRequest().d);
    }

    @Override // defpackage.hyi
    public void c(NestedScrollView nestedScrollView, int i) {
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalytics
    public void l(String str, Throwable th) {
    }
}
