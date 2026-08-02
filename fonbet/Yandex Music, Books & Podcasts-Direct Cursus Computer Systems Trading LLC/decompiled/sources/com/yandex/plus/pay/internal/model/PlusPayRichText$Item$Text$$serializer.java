package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
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
import defpackage.vx7;
import defpackage.wq5;
import defpackage.xhp;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayRichText.Item.Text.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayRichText$Item$Text$$serializer implements p3d {

    @NotNull
    public static final PlusPayRichText$Item$Text$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayRichText$Item$Text$$serializer plusPayRichText$Item$Text$$serializer = new PlusPayRichText$Item$Text$$serializer();
        INSTANCE = plusPayRichText$Item$Text$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayRichText.Item.Text", plusPayRichText$Item$Text$$serializer, 3);
        j5mVar.k("altText", true);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    private PlusPayRichText$Item$Text$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayRichText.Item.Text deserialize(@NotNull eg7 decoder) {
        int i;
        String str;
        String str2;
        String str3;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        String str4 = null;
        if (c.m()) {
            String str5 = (String) c.n(mhpVar, 0, tkr.a, null);
            String g = c.g(mhpVar, 1);
            str = str5;
            str3 = c.g(mhpVar, 2);
            str2 = g;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str7 = c.g(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
        }
        c.b(mhpVar);
        return new PlusPayRichText.Item.Text(i, str, str2, str3, (xhp) null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayRichText.Item.Text value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayRichText.Item.Text.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
