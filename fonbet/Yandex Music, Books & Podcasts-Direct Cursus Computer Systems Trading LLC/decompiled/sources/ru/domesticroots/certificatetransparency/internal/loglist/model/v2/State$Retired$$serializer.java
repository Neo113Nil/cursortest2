package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/domesticroots/certificatetransparency/internal/loglist/model/v2/State.Retired.$serializer", "Lp3d;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;", "<init>", "()V", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Leg7;", "decoder", "deserialize", "(Leg7;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;)V", "Lmhp;", "getDescriptor", "()Lmhp;", "descriptor", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final class State$Retired$$serializer implements p3d {

    @NotNull
    public static final State$Retired$$serializer INSTANCE;
    private static final /* synthetic */ j5m descriptor;

    static {
        State$Retired$$serializer state$Retired$$serializer = new State$Retired$$serializer();
        INSTANCE = state$Retired$$serializer;
        j5m j5mVar = new j5m("retired", state$Retired$$serializer, 1);
        j5mVar.k("timestamp", false);
        descriptor = j5mVar;
    }

    private State$Retired$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] childSerializers() {
        t9f[] t9fVarArr;
        t9fVarArr = State.Retired.$childSerializers;
        return new t9f[]{t9fVarArr[0]};
    }

    @Override // defpackage.t9f
    @NotNull
    public State.Retired deserialize(@NotNull eg7 decoder) {
        t9f[] t9fVarArr;
        long j;
        decoder.getClass();
        mhp descriptor2 = getDescriptor();
        tq5 c = decoder.c(descriptor2);
        t9fVarArr = State.Retired.$childSerializers;
        int i = 1;
        long j2 = 0;
        if (c.m()) {
            j = ((Number) c.z(descriptor2, 0, t9fVarArr[0], 0L)).longValue();
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(descriptor2);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    j2 = ((Number) c.z(descriptor2, 0, t9fVarArr[0], Long.valueOf(j2))).longValue();
                    i2 = 1;
                }
            }
            j = j2;
            i = i2;
        }
        c.b(descriptor2);
        return new State.Retired(i, j, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public void serialize(@NotNull l6b encoder, @NotNull State.Retired value) {
        encoder.getClass();
        value.getClass();
        mhp descriptor2 = getDescriptor();
        wq5 c = encoder.c(descriptor2);
        State.Retired.write$Self$domesticroots_certificatetransparency_release(value, c, descriptor2);
        c.b(descriptor2);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
