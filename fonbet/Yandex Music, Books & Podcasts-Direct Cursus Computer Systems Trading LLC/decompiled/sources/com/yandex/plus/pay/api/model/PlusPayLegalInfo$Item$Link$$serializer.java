package com.yandex.plus.pay.api.model;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/api/model/PlusPayLegalInfo.Item.Link.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayLegalInfo$Item$Link$$serializer implements p3d {

    @NotNull
    public static final PlusPayLegalInfo$Item$Link$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayLegalInfo$Item$Link$$serializer plusPayLegalInfo$Item$Link$$serializer = new PlusPayLegalInfo$Item$Link$$serializer();
        INSTANCE = plusPayLegalInfo$Item$Link$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item.Link", plusPayLegalInfo$Item$Link$$serializer, 3);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("text", false);
        j5mVar.k("link", false);
        descriptor = j5mVar;
    }

    private PlusPayLegalInfo$Item$Link$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayLegalInfo.Item.Link deserialize(@NotNull eg7 decoder) {
        String str;
        String str2;
        String str3;
        int i;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            str2 = c.g(mhpVar, 2);
            str3 = g;
            i = 7;
        } else {
            str = null;
            String str4 = null;
            String str5 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 2);
                    i2 |= 4;
                }
            }
            str2 = str4;
            str3 = str5;
            i = i2;
        }
        String str6 = str;
        c.b(mhpVar);
        return new PlusPayLegalInfo.Item.Link(i, str6, str3, str2, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayLegalInfo.Item.Link value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayLegalInfo.Item.Link.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
