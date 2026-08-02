package defpackage;

import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.messenger.websdk.api.MessengerAnalyticsFactory;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import java.io.InputStream;

/* loaded from: classes.dex */
public class mhm implements khm, uyp, MessengerAnalyticsFactory, lci, WebMessengerNavigationInterceptor {
    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("not used in relay");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return startGenerativeQueueCommand.getQueueStartValidator();
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return startVideoClipRadioQueueCommand.getQueueStartValidator();
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalyticsFactory
    public MessengerAnalytics b() {
        return new zfm();
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return startYnisonQueueCommand.getQueueStartValidator();
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        return startFmRadioQueueCommand.e();
    }

    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        startWaveQueueCommand.getClass();
        return startWaveQueueCommand.getQueueStartValidator();
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new nkr(kkpVar.n(old.class, InputStream.class), 1);
    }

    @Override // defpackage.khm
    public void a(jhm jhmVar, int i, int i2) {
    }
}
