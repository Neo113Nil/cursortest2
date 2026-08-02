package defpackage;

import com.yandex.messaging.input.voice.b;
import defpackage.f9g;
import defpackage.o320;
import defpackage.wy31;
import kotlin.a;

/* loaded from: classes15.dex */
public final class wy31 implements yvf0 {
    public final f9g a;
    public final i3y b = a.a(new sls() { // from class: com.yandex.messaging.input.voice.a
        @Override // defpackage.sls
        public final Object invoke() {
            b bVar = (b) o320.a.c(new VoiceMessageInputControllerProvider$pluginProbe$1(0, wy31.this.a, f9g.class, "build", "build()Lcom/yandex/messaging/input/voice/VoiceMessageInputPluginDependencies;", 0));
            return bVar == null ? new b() : bVar;
        }
    });

    public wy31(f9g f9gVar) {
        this.a = f9gVar;
    }

    @Override // defpackage.yvf0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b get() {
        return (b) this.b.getValue();
    }
}
