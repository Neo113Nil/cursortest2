package com.yandex.plus.pay.api.model;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/api/model/PlusPayCompositeOffers.Offer.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOffers$Offer$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOffers$Offer$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOffers$Offer$$serializer plusPayCompositeOffers$Offer$$serializer = new PlusPayCompositeOffers$Offer$$serializer();
        INSTANCE = plusPayCompositeOffers$Offer$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer", plusPayCompositeOffers$Offer$$serializer, 11);
        j5mVar.k("positionId", false);
        j5mVar.k("structureType", false);
        j5mVar.k("activeTariffId", false);
        j5mVar.k("tariffOffer", false);
        j5mVar.k("optionOffers", false);
        j5mVar.k("legalInfo", false);
        j5mVar.k("invoices", false);
        j5mVar.k("isUpsale", false);
        j5mVar.k("assets", false);
        j5mVar.k("canAttemptSilentPurchase", false);
        j5mVar.k("meta", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOffers$Offer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCompositeOffers.Offer.$childSerializers;
        tkr tkrVar = tkr.a;
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkrVar, arfVarArr[1].getValue(), ff7.C(tkrVar), ff7.C(PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE), arfVarArr[4].getValue(), ff7.C(PlusPayLegalInfo$$serializer.INSTANCE), arfVarArr[6].getValue(), oc3Var, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, oc3Var, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOffers.Offer deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        boolean z;
        PlusPayCompositeOffers.Offer.StructureType structureType;
        PlusPayCompositeOffers.Offer.Meta meta;
        List list;
        List list2;
        PlusPayCompositeOffers.Offer.Tariff tariff;
        PlusPayCompositeOffers.Offer.Assets assets;
        PlusPayLegalInfo plusPayLegalInfo;
        String str;
        int i;
        boolean z2;
        String str2;
        char c;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c2 = decoder.c(mhpVar);
        arfVarArr = PlusPayCompositeOffers.Offer.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        char c3 = '\b';
        int i4 = 0;
        if (c2.m()) {
            String g = c2.g(mhpVar, 0);
            PlusPayCompositeOffers.Offer.StructureType structureType2 = (PlusPayCompositeOffers.Offer.StructureType) c2.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String str3 = (String) c2.n(mhpVar, 2, tkr.a, null);
            PlusPayCompositeOffers.Offer.Tariff tariff2 = (PlusPayCompositeOffers.Offer.Tariff) c2.n(mhpVar, 3, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, null);
            List list3 = (List) c2.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            PlusPayLegalInfo plusPayLegalInfo2 = (PlusPayLegalInfo) c2.n(mhpVar, 5, PlusPayLegalInfo$$serializer.INSTANCE, null);
            List list4 = (List) c2.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            boolean D = c2.D(mhpVar, 7);
            PlusPayCompositeOffers.Offer.Assets assets2 = (PlusPayCompositeOffers.Offer.Assets) c2.z(mhpVar, 8, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, null);
            boolean D2 = c2.D(mhpVar, 9);
            list = list4;
            str2 = g;
            meta = (PlusPayCompositeOffers.Offer.Meta) c2.z(mhpVar, 10, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE, null);
            z = D2;
            z2 = D;
            plusPayLegalInfo = plusPayLegalInfo2;
            tariff = tariff2;
            assets = assets2;
            str = str3;
            i = 2047;
            list2 = list3;
            structureType = structureType2;
        } else {
            int i5 = 6;
            int i6 = 4;
            boolean z3 = true;
            boolean z4 = false;
            PlusPayCompositeOffers.Offer.Meta meta2 = null;
            List list5 = null;
            List list6 = null;
            PlusPayCompositeOffers.Offer.Tariff tariff3 = null;
            PlusPayCompositeOffers.Offer.Assets assets3 = null;
            PlusPayLegalInfo plusPayLegalInfo3 = null;
            String str4 = null;
            String str5 = null;
            PlusPayCompositeOffers.Offer.StructureType structureType3 = null;
            boolean z5 = false;
            while (z3) {
                int w = c2.w(mhpVar);
                switch (w) {
                    case -1:
                        z3 = false;
                        i2 = 10;
                        i3 = 9;
                        i6 = 4;
                        i5 = 6;
                    case 0:
                        str5 = c2.g(mhpVar, 0);
                        i4 |= 1;
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                        i6 = 4;
                        i5 = 6;
                    case 1:
                        i4 |= 2;
                        structureType3 = (PlusPayCompositeOffers.Offer.StructureType) c2.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), structureType3);
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                        i6 = 4;
                        i5 = 6;
                    case 2:
                        str4 = (String) c2.n(mhpVar, 2, tkr.a, str4);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                        i6 = 4;
                        i5 = 6;
                    case 3:
                        tariff3 = (PlusPayCompositeOffers.Offer.Tariff) c2.n(mhpVar, 3, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, tariff3);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                        i6 = 4;
                        i5 = 6;
                    case 4:
                        list6 = (List) c2.z(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), list6);
                        i4 |= 16;
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                        i5 = 6;
                    case 5:
                        plusPayLegalInfo3 = (PlusPayLegalInfo) c2.n(mhpVar, 5, PlusPayLegalInfo$$serializer.INSTANCE, plusPayLegalInfo3);
                        i4 |= 32;
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                        i5 = 6;
                    case 6:
                        list5 = (List) c2.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list5);
                        i4 |= 64;
                        i2 = 10;
                        i3 = 9;
                        c3 = '\b';
                    case 7:
                        c = c3;
                        z5 = c2.D(mhpVar, 7);
                        i4 |= 128;
                        c3 = c;
                        i2 = 10;
                    case 8:
                        c = '\b';
                        assets3 = (PlusPayCompositeOffers.Offer.Assets) c2.z(mhpVar, 8, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, assets3);
                        i4 |= 256;
                        c3 = c;
                        i2 = 10;
                    case 9:
                        z4 = c2.D(mhpVar, i3);
                        i4 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c3 = '\b';
                    case 10:
                        meta2 = (PlusPayCompositeOffers.Offer.Meta) c2.z(mhpVar, i2, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE, meta2);
                        i4 |= 1024;
                        c3 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z4;
            structureType = structureType3;
            meta = meta2;
            list = list5;
            list2 = list6;
            tariff = tariff3;
            assets = assets3;
            plusPayLegalInfo = plusPayLegalInfo3;
            str = str4;
            i = i4;
            z2 = z5;
            str2 = str5;
        }
        c2.b(mhpVar);
        return new PlusPayCompositeOffers.Offer(i, str2, structureType, str, tariff, list2, plusPayLegalInfo, list, z2, assets, z, meta, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOffers.Offer value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOffers.Offer.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
