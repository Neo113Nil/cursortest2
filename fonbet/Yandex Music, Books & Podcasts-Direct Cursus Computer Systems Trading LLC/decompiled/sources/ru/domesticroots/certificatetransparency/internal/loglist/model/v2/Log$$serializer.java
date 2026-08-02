package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.u7e;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log.$serializer", "Lp3d;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "<init>", "()V", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Leg7;", "decoder", "deserialize", "(Leg7;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;)V", "Lmhp;", "getDescriptor", "()Lmhp;", "descriptor", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final class Log$$serializer implements p3d {

    @NotNull
    public static final Log$$serializer INSTANCE;
    private static final /* synthetic */ j5m descriptor;

    static {
        Log$$serializer log$$serializer = new Log$$serializer();
        INSTANCE = log$$serializer;
        j5m j5mVar = new j5m("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Log", log$$serializer, 9);
        j5mVar.k(DeviceService.KEY_DESC, true);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("log_id", false);
        j5mVar.k("mmd", false);
        j5mVar.k("url", false);
        j5mVar.k("dns", true);
        j5mVar.k("temporal_interval", true);
        j5mVar.k("log_type", true);
        j5mVar.k("state", true);
        descriptor = j5mVar;
    }

    private Log$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] childSerializers() {
        t9f[] t9fVarArr;
        t9fVarArr = Log.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, tkrVar, cqe.a, t9fVarArr[4], ff7.C(t9fVarArr[5]), ff7.C(TemporalInterval$$serializer.INSTANCE), ff7.C(t9fVarArr[7]), ff7.C(t9fVarArr[8])};
    }

    @Override // defpackage.t9f
    @NotNull
    public Log deserialize(@NotNull eg7 decoder) {
        t9f[] t9fVarArr;
        int i;
        LogType logType;
        TemporalInterval temporalInterval;
        State state;
        Hostname hostname;
        u7e u7eVar;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        decoder.getClass();
        mhp descriptor2 = getDescriptor();
        tq5 c = decoder.c(descriptor2);
        t9fVarArr = Log.$childSerializers;
        int i4 = 6;
        int i5 = 7;
        int i6 = 5;
        if (c.m()) {
            String str4 = (String) c.n(descriptor2, 0, tkr.a, null);
            String g = c.g(descriptor2, 1);
            String g2 = c.g(descriptor2, 2);
            int k = c.k(descriptor2, 3);
            u7e u7eVar2 = (u7e) c.z(descriptor2, 4, t9fVarArr[4], null);
            Hostname hostname2 = (Hostname) c.n(descriptor2, 5, t9fVarArr[5], null);
            TemporalInterval temporalInterval2 = (TemporalInterval) c.n(descriptor2, 6, TemporalInterval$$serializer.INSTANCE, null);
            LogType logType2 = (LogType) c.n(descriptor2, 7, t9fVarArr[7], null);
            state = (State) c.n(descriptor2, 8, t9fVarArr[8], null);
            str = str4;
            temporalInterval = temporalInterval2;
            i = k;
            str3 = g2;
            logType = logType2;
            hostname = hostname2;
            i2 = 511;
            u7eVar = u7eVar2;
            str2 = g;
        } else {
            int i7 = 4;
            boolean z = true;
            int i8 = 0;
            LogType logType3 = null;
            TemporalInterval temporalInterval3 = null;
            State state2 = null;
            Hostname hostname3 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i9 = 0;
            u7e u7eVar3 = null;
            while (z) {
                int w = c.w(descriptor2);
                switch (w) {
                    case -1:
                        z = false;
                        i5 = 7;
                        i6 = 5;
                        i7 = 4;
                    case 0:
                        str5 = (String) c.n(descriptor2, 0, tkr.a, str5);
                        i9 |= 1;
                        i4 = 6;
                        i5 = 7;
                        i6 = 5;
                        i7 = 4;
                    case 1:
                        i9 |= 2;
                        str6 = c.g(descriptor2, 1);
                        i4 = 6;
                        i6 = 5;
                        i7 = 4;
                    case 2:
                        str7 = c.g(descriptor2, 2);
                        i9 |= 4;
                        i4 = 6;
                        i6 = 5;
                        i7 = 4;
                    case 3:
                        i8 = c.k(descriptor2, 3);
                        i9 |= 8;
                        i4 = 6;
                        i6 = 5;
                    case 4:
                        u7eVar3 = (u7e) c.z(descriptor2, i7, t9fVarArr[i7], u7eVar3);
                        i9 |= 16;
                        i4 = 6;
                        i6 = 5;
                    case 5:
                        int i10 = i6;
                        hostname3 = (Hostname) c.n(descriptor2, i10, t9fVarArr[i10], hostname3);
                        i9 |= 32;
                        i6 = i10;
                        i4 = 6;
                    case 6:
                        i3 = i6;
                        temporalInterval3 = (TemporalInterval) c.n(descriptor2, i4, TemporalInterval$$serializer.INSTANCE, temporalInterval3);
                        i9 |= 64;
                        i6 = i3;
                    case 7:
                        i3 = i6;
                        logType3 = (LogType) c.n(descriptor2, i5, t9fVarArr[i5], logType3);
                        i9 |= 128;
                        i6 = i3;
                    case 8:
                        i3 = i6;
                        state2 = (State) c.n(descriptor2, 8, t9fVarArr[8], state2);
                        i9 |= 256;
                        i6 = i3;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i8;
            logType = logType3;
            temporalInterval = temporalInterval3;
            state = state2;
            hostname = hostname3;
            u7eVar = u7eVar3;
            i2 = i9;
            str = str5;
            str2 = str6;
            str3 = str7;
        }
        c.b(descriptor2);
        return new Log(i2, str, str2, str3, i, u7eVar, hostname, temporalInterval, logType, state, (xhp) null);
    }

    @Override // defpackage.t9f
    @NotNull
    public mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public void serialize(@NotNull l6b encoder, @NotNull Log value) {
        encoder.getClass();
        value.getClass();
        mhp descriptor2 = getDescriptor();
        wq5 c = encoder.c(descriptor2);
        Log.write$Self$domesticroots_certificatetransparency_release(value, c, descriptor2);
        c.b(descriptor2);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
