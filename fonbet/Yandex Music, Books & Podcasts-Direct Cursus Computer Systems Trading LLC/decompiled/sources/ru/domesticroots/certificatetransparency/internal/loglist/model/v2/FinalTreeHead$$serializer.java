package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead.$serializer", "Lp3d;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "<init>", "()V", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Leg7;", "decoder", "deserialize", "(Leg7;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;)V", "Lmhp;", "getDescriptor", "()Lmhp;", "descriptor", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final class FinalTreeHead$$serializer implements p3d {

    @NotNull
    public static final FinalTreeHead$$serializer INSTANCE;
    private static final /* synthetic */ j5m descriptor;

    static {
        FinalTreeHead$$serializer finalTreeHead$$serializer = new FinalTreeHead$$serializer();
        INSTANCE = finalTreeHead$$serializer;
        j5m j5mVar = new j5m("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.FinalTreeHead", finalTreeHead$$serializer, 2);
        j5mVar.k("tree_size", false);
        j5mVar.k("sha256_root_hash", false);
        descriptor = j5mVar;
    }

    private FinalTreeHead$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] childSerializers() {
        return new t9f[]{cqe.a, tkr.a};
    }

    @Override // defpackage.t9f
    @NotNull
    public FinalTreeHead deserialize(@NotNull eg7 decoder) {
        int i;
        String str;
        int i2;
        decoder.getClass();
        mhp descriptor2 = getDescriptor();
        tq5 c = decoder.c(descriptor2);
        xhp xhpVar = null;
        if (c.m()) {
            i = c.k(descriptor2, 0);
            str = c.g(descriptor2, 1);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            int i3 = 0;
            String str2 = null;
            while (z) {
                int w = c.w(descriptor2);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i = c.k(descriptor2, 0);
                    i3 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = c.g(descriptor2, 1);
                    i3 |= 2;
                }
            }
            str = str2;
            i2 = i3;
        }
        c.b(descriptor2);
        return new FinalTreeHead(i2, i, str, xhpVar);
    }

    @Override // defpackage.t9f
    @NotNull
    public mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public void serialize(@NotNull l6b encoder, @NotNull FinalTreeHead value) {
        encoder.getClass();
        value.getClass();
        mhp descriptor2 = getDescriptor();
        wq5 c = encoder.c(descriptor2);
        FinalTreeHead.write$Self$domesticroots_certificatetransparency_release(value, c, descriptor2);
        c.b(descriptor2);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
