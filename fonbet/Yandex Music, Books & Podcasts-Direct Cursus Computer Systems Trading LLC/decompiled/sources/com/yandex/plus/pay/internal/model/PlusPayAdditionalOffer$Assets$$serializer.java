package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import defpackage.arf;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayAdditionalOffer.Assets.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer$Assets;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer$Assets;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer$Assets;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayAdditionalOffer$Assets$$serializer implements p3d {

    @NotNull
    public static final PlusPayAdditionalOffer$Assets$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayAdditionalOffer$Assets$$serializer plusPayAdditionalOffer$Assets$$serializer = new PlusPayAdditionalOffer$Assets$$serializer();
        INSTANCE = plusPayAdditionalOffer$Assets$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer.Assets", plusPayAdditionalOffer$Assets$$serializer, 6);
        j5mVar.k("title", false);
        j5mVar.k("text", false);
        j5mVar.k("additionalText", false);
        j5mVar.k("benefits", false);
        j5mVar.k("disclaimer", false);
        j5mVar.k("iconImages", false);
        descriptor = j5mVar;
    }

    private PlusPayAdditionalOffer$Assets$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayAdditionalOffer.Assets.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, arfVarArr[3].getValue(), ff7.C(tkrVar), arfVarArr[5].getValue()};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayAdditionalOffer.Assets deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        Map map;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayAdditionalOffer.Assets.$childSerializers;
        int i2 = 0;
        String str5 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            List list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            String str6 = (String) c.n(mhpVar, 4, tkr.a, null);
            map = (Map) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            str = g;
            str4 = str6;
            str3 = g3;
            i = 63;
            list = list2;
            str2 = g2;
        } else {
            int i3 = 1;
            int i4 = 0;
            String str7 = null;
            String str8 = null;
            List list3 = null;
            String str9 = null;
            Map map2 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i3 = i2;
                        continue;
                    case 0:
                        str5 = c.g(mhpVar, i2);
                        i4 |= 1;
                        continue;
                    case 1:
                        str7 = c.g(mhpVar, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        str8 = c.g(mhpVar, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        list3 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list3);
                        i4 |= 8;
                        break;
                    case 4:
                        str9 = (String) c.n(mhpVar, 4, tkr.a, str9);
                        i4 |= 16;
                        break;
                    case 5:
                        map2 = (Map) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), map2);
                        i4 |= 32;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 0;
            }
            i = i4;
            str = str5;
            str2 = str7;
            str3 = str8;
            list = list3;
            str4 = str9;
            map = map2;
        }
        c.b(mhpVar);
        return new PlusPayAdditionalOffer.Assets(i, str, str2, str3, list, str4, map, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayAdditionalOffer.Assets value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayAdditionalOffer.Assets.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
