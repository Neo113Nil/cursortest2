package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.arf;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayRichText.Item.TextColor.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayRichText$Item$TextColor$$serializer implements p3d {

    @NotNull
    public static final PlusPayRichText$Item$TextColor$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayRichText$Item$TextColor$$serializer plusPayRichText$Item$TextColor$$serializer = new PlusPayRichText$Item$TextColor$$serializer();
        INSTANCE = plusPayRichText$Item$TextColor$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayRichText.Item.TextColor", plusPayRichText$Item$TextColor$$serializer, 4);
        j5mVar.k("altText", false);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("data", false);
        j5mVar.k("color", false);
        descriptor = j5mVar;
    }

    private PlusPayRichText$Item$TextColor$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayRichText.Item.TextColor.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayRichText.Item.TextColor deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        String str;
        String str2;
        String str3;
        v vVar;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayRichText.Item.TextColor.$childSerializers;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            vVar = (v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            str3 = g3;
            i = 15;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            v vVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    vVar2 = (v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), vVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
            vVar = vVar2;
        }
        c.b(mhpVar);
        return new PlusPayRichText.Item.TextColor(i, str, str2, str3, vVar, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayRichText.Item.TextColor value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayRichText.Item.TextColor.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
