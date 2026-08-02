package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.state.Align;
import com.yandex.delivery.mapper.model.state.IconStyleState;
import com.yandex.delivery.mapper.model.state.SlotState$Size;
import defpackage.cyu0;
import defpackage.eqs0;
import defpackage.fts0;
import defpackage.g5v;
import defpackage.gts0;
import defpackage.gws0;
import defpackage.hts0;
import defpackage.iqs0;
import defpackage.j7v;
import defpackage.jk51;
import defpackage.kus0;
import defpackage.l7x0;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.mts0;
import defpackage.nr;
import defpackage.nts0;
import defpackage.ny61;
import defpackage.ots0;
import defpackage.ous0;
import defpackage.pts0;
import defpackage.pvs0;
import defpackage.q8s;
import defpackage.qfc;
import defpackage.w501;
import defpackage.w511;
import defpackage.wpy0;
import defpackage.wts0;
import defpackage.y4v;
import defpackage.z4v;
import defpackage.zez0;
import defpackage.zp1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaFontWeight;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextOverflow;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;
import ru.yandex.taxi.logistics.sdk.ui_models.form.slot.SlotLead$LeadIcon$IconStyle;

/* loaded from: classes5.dex */
public final class a {
    public final l7x0 a;
    public final wpy0 b;
    public final q8s c;

    public a(l7x0 l7x0Var, wpy0 wpy0Var, q8s q8sVar) {
        this.a = l7x0Var;
        this.b = wpy0Var;
        this.c = q8sVar;
    }

    public static float h(SlotState$Size slotState$Size) {
        switch (w501.a[slotState$Size.ordinal()]) {
            case 1:
                return 32.0f;
            case 2:
                return 40.0f;
            case 3:
                return 48.0f;
            case 4:
                return 56.0f;
            case 5:
                return 60.0f;
            case 6:
                return 64.0f;
            default:
                w511.b();
                return 0.0f;
        }
    }

    public final ldc a(qfc qfcVar, boolean z) {
        wpy0 wpy0Var = this.b;
        wpy0Var.getClass();
        String str = qfcVar.c;
        if (str != null) {
            return wpy0Var.d(str);
        }
        String str2 = z ? qfcVar.b : qfcVar.a;
        Float f = z ? qfcVar.e : qfcVar.d;
        ldc d = wpy0Var.d(str2);
        if (d != null) {
            return new ldc(ldc.b(d.a, f != null ? f.floatValue() : 1.0f, 0.0f, 0.0f, 0.0f, 14));
        }
        return null;
    }

    public final lvi0 b(jk51 jk51Var) {
        ldc d;
        zez0 zez0Var = null;
        if (!(jk51Var instanceof jk51)) {
            w511.b();
            return null;
        }
        String str = jk51Var.a;
        String str2 = jk51Var.b;
        if (str2 != null && (d = this.b.d(str2)) != null) {
            zez0Var = new zez0(d.a);
        }
        return new lvi0(str, null, null, null, zez0Var, 46);
    }

    public final lvi0 c(j7v j7vVar) {
        String str;
        String str2 = j7vVar.a;
        if (str2 == null || (str = this.a.a(str2)) == null) {
            str = j7vVar.b;
        }
        String str3 = str;
        ldc d = this.b.d(j7vVar.c);
        return new lvi0(str3, null, null, null, d != null ? new zez0(d.a) : null, 46);
    }

    public final long d(String str) {
        wpy0 wpy0Var = this.b;
        ldc d = wpy0Var.d(str);
        if (d != null) {
            return d.a;
        }
        ldc d2 = wpy0Var.d("textMain");
        if (d2 != null) {
            return d2.a;
        }
        int i = ldc.n;
        return ldc.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kus0 kus0Var, ContinuationImpl continuationImpl) {
        TrackingCommonModelMapper$mapSlot$1 trackingCommonModelMapper$mapSlot$1;
        int i;
        hts0 hts0Var;
        eqs0 eqs0Var;
        iqs0 iqs0Var;
        kus0 kus0Var2;
        eqs0 eqs0Var2;
        eqs0 eqs0Var3;
        iqs0 iqs0Var2;
        eqs0 eqs0Var4;
        eqs0 eqs0Var5;
        eqs0 eqs0Var6;
        kus0 kus0Var3;
        SlotState$Size slotState$Size;
        float f;
        kus0 kus0Var4 = kus0Var;
        if (continuationImpl instanceof TrackingCommonModelMapper$mapSlot$1) {
            trackingCommonModelMapper$mapSlot$1 = (TrackingCommonModelMapper$mapSlot$1) continuationImpl;
            int i2 = trackingCommonModelMapper$mapSlot$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCommonModelMapper$mapSlot$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCommonModelMapper$mapSlot$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCommonModelMapper$mapSlot$1.label;
                if (i != 0) {
                    b.b(obj);
                    pts0 pts0Var = kus0Var4.b;
                    hts0 g = pts0Var != null ? g(pts0Var) : null;
                    iqs0 iqs0Var3 = kus0Var4.a;
                    trackingCommonModelMapper$mapSlot$1.L$0 = kus0Var4;
                    trackingCommonModelMapper$mapSlot$1.L$1 = g;
                    trackingCommonModelMapper$mapSlot$1.label = 1;
                    Object f2 = f(iqs0Var3, trackingCommonModelMapper$mapSlot$1);
                    if (f2 != obj2) {
                        hts0Var = g;
                        obj = f2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eqs0Var2 = (eqs0) trackingCommonModelMapper$mapSlot$1.L$3;
                        eqs0Var6 = (eqs0) trackingCommonModelMapper$mapSlot$1.L$2;
                        hts0Var = (hts0) trackingCommonModelMapper$mapSlot$1.L$1;
                        kus0Var3 = (kus0) trackingCommonModelMapper$mapSlot$1.L$0;
                        b.b(obj);
                        eqs0Var5 = (eqs0) obj;
                        kus0Var2 = kus0Var3;
                        eqs0Var4 = eqs0Var6;
                        eqs0 eqs0Var7 = eqs0Var2;
                        hts0 hts0Var2 = hts0Var;
                        nr nrVar = kus0Var2.e;
                        slotState$Size = kus0Var2.h;
                        gws0 gws0Var = kus0Var2.g;
                        pvs0 pvs0Var = gws0Var != null ? new pvs0(gws0Var.c, gws0Var.a, gws0Var.b, gws0Var.d, gws0Var.e) : null;
                        ous0 ous0Var = new ous0(r3.a, this.b.d(kus0Var2.f.b), r3.c);
                        float h = h(slotState$Size);
                        switch (w501.a[slotState$Size.ordinal()]) {
                            case 1:
                                f = 0.0f;
                                break;
                            case 2:
                                f = 4.0f;
                                break;
                            case 3:
                                f = 8.0f;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                f = 12.0f;
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                        return new wts0(eqs0Var4, hts0Var2, eqs0Var7, eqs0Var5, nrVar, pvs0Var, ous0Var, h, f, 512);
                    }
                    eqs0Var3 = (eqs0) trackingCommonModelMapper$mapSlot$1.L$2;
                    hts0Var = (hts0) trackingCommonModelMapper$mapSlot$1.L$1;
                    kus0Var2 = (kus0) trackingCommonModelMapper$mapSlot$1.L$0;
                    b.b(obj);
                    eqs0 eqs0Var8 = (eqs0) obj;
                    eqs0Var = eqs0Var3;
                    eqs0Var2 = eqs0Var8;
                    iqs0Var2 = kus0Var2.d;
                    if (iqs0Var2 == null) {
                        eqs0Var4 = eqs0Var;
                        eqs0Var5 = null;
                        eqs0 eqs0Var72 = eqs0Var2;
                        hts0 hts0Var22 = hts0Var;
                        nr nrVar2 = kus0Var2.e;
                        slotState$Size = kus0Var2.h;
                        gws0 gws0Var2 = kus0Var2.g;
                        if (gws0Var2 != null) {
                        }
                        ous0 ous0Var2 = new ous0(r3.a, this.b.d(kus0Var2.f.b), r3.c);
                        float h2 = h(slotState$Size);
                        switch (w501.a[slotState$Size.ordinal()]) {
                        }
                        return new wts0(eqs0Var4, hts0Var22, eqs0Var72, eqs0Var5, nrVar2, pvs0Var, ous0Var2, h2, f, 512);
                    }
                    trackingCommonModelMapper$mapSlot$1.L$0 = kus0Var2;
                    trackingCommonModelMapper$mapSlot$1.L$1 = hts0Var;
                    trackingCommonModelMapper$mapSlot$1.L$2 = eqs0Var;
                    trackingCommonModelMapper$mapSlot$1.L$3 = eqs0Var2;
                    trackingCommonModelMapper$mapSlot$1.L$4 = null;
                    trackingCommonModelMapper$mapSlot$1.I$0 = 0;
                    trackingCommonModelMapper$mapSlot$1.label = 3;
                    Object f3 = f(iqs0Var2, trackingCommonModelMapper$mapSlot$1);
                    if (f3 != obj2) {
                        eqs0Var6 = eqs0Var;
                        obj = f3;
                        kus0Var3 = kus0Var2;
                        eqs0Var5 = (eqs0) obj;
                        kus0Var2 = kus0Var3;
                        eqs0Var4 = eqs0Var6;
                        eqs0 eqs0Var722 = eqs0Var2;
                        hts0 hts0Var222 = hts0Var;
                        nr nrVar22 = kus0Var2.e;
                        slotState$Size = kus0Var2.h;
                        gws0 gws0Var22 = kus0Var2.g;
                        if (gws0Var22 != null) {
                        }
                        ous0 ous0Var22 = new ous0(r3.a, this.b.d(kus0Var2.f.b), r3.c);
                        float h22 = h(slotState$Size);
                        switch (w501.a[slotState$Size.ordinal()]) {
                        }
                        return new wts0(eqs0Var4, hts0Var222, eqs0Var722, eqs0Var5, nrVar22, pvs0Var, ous0Var22, h22, f, 512);
                    }
                    return obj2;
                }
                hts0 hts0Var3 = (hts0) trackingCommonModelMapper$mapSlot$1.L$1;
                kus0 kus0Var5 = (kus0) trackingCommonModelMapper$mapSlot$1.L$0;
                b.b(obj);
                hts0Var = hts0Var3;
                kus0Var4 = kus0Var5;
                eqs0Var = (eqs0) obj;
                iqs0Var = kus0Var4.c;
                if (iqs0Var == null) {
                    trackingCommonModelMapper$mapSlot$1.L$0 = kus0Var4;
                    trackingCommonModelMapper$mapSlot$1.L$1 = hts0Var;
                    trackingCommonModelMapper$mapSlot$1.L$2 = eqs0Var;
                    trackingCommonModelMapper$mapSlot$1.L$3 = null;
                    trackingCommonModelMapper$mapSlot$1.I$0 = 0;
                    trackingCommonModelMapper$mapSlot$1.label = 2;
                    Object f4 = f(iqs0Var, trackingCommonModelMapper$mapSlot$1);
                    if (f4 != obj2) {
                        kus0Var2 = kus0Var4;
                        eqs0Var3 = eqs0Var;
                        obj = f4;
                        eqs0 eqs0Var82 = (eqs0) obj;
                        eqs0Var = eqs0Var3;
                        eqs0Var2 = eqs0Var82;
                        iqs0Var2 = kus0Var2.d;
                        if (iqs0Var2 == null) {
                        }
                    }
                    return obj2;
                }
                kus0Var2 = kus0Var4;
                eqs0Var2 = null;
                iqs0Var2 = kus0Var2.d;
                if (iqs0Var2 == null) {
                }
            }
        }
        trackingCommonModelMapper$mapSlot$1 = new TrackingCommonModelMapper$mapSlot$1(this, continuationImpl);
        Object obj3 = trackingCommonModelMapper$mapSlot$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCommonModelMapper$mapSlot$1.label;
        if (i != 0) {
        }
        eqs0Var = (eqs0) obj3;
        iqs0Var = kus0Var4.c;
        if (iqs0Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(iqs0 iqs0Var, ContinuationImpl continuationImpl) {
        TrackingCommonModelMapper$mapSlotBody$1 trackingCommonModelMapper$mapSlotBody$1;
        int i;
        iqs0 iqs0Var2;
        Align align;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        if (continuationImpl instanceof TrackingCommonModelMapper$mapSlotBody$1) {
            trackingCommonModelMapper$mapSlotBody$1 = (TrackingCommonModelMapper$mapSlotBody$1) continuationImpl;
            int i2 = trackingCommonModelMapper$mapSlotBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCommonModelMapper$mapSlotBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCommonModelMapper$mapSlotBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCommonModelMapper$mapSlotBody$1.label;
                q8s q8sVar = this.c;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    b.b(obj);
                    Align align2 = iqs0Var.a;
                    FormattedText formattedText2 = iqs0Var.b;
                    trackingCommonModelMapper$mapSlotBody$1.L$0 = iqs0Var;
                    trackingCommonModelMapper$mapSlotBody$1.L$1 = null;
                    trackingCommonModelMapper$mapSlotBody$1.L$2 = align2;
                    trackingCommonModelMapper$mapSlotBody$1.I$0 = 0;
                    trackingCommonModelMapper$mapSlotBody$1.label = 1;
                    Object a = q8sVar.a(formattedText2, trackingCommonModelMapper$mapSlotBody$1);
                    if (a != coroutineSingletons) {
                        iqs0Var2 = iqs0Var;
                        align = align2;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) trackingCommonModelMapper$mapSlotBody$1.L$3;
                    align = (Align) trackingCommonModelMapper$mapSlotBody$1.L$2;
                    b.b(obj);
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    return new eqs0(align, charSequence, charSequence3);
                }
                align = (Align) trackingCommonModelMapper$mapSlotBody$1.L$2;
                iqs0Var2 = (iqs0) trackingCommonModelMapper$mapSlotBody$1.L$0;
                b.b(obj);
                charSequence = (CharSequence) obj;
                formattedText = iqs0Var2.c;
                if (formattedText != null) {
                    trackingCommonModelMapper$mapSlotBody$1.L$0 = null;
                    trackingCommonModelMapper$mapSlotBody$1.L$1 = null;
                    trackingCommonModelMapper$mapSlotBody$1.L$2 = align;
                    trackingCommonModelMapper$mapSlotBody$1.L$3 = charSequence;
                    trackingCommonModelMapper$mapSlotBody$1.I$0 = 0;
                    trackingCommonModelMapper$mapSlotBody$1.label = 2;
                    Object a2 = q8sVar.a(formattedText, trackingCommonModelMapper$mapSlotBody$1);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                    }
                    return coroutineSingletons;
                }
                return new eqs0(align, charSequence, charSequence3);
            }
        }
        trackingCommonModelMapper$mapSlotBody$1 = new TrackingCommonModelMapper$mapSlotBody$1(this, continuationImpl);
        Object obj2 = trackingCommonModelMapper$mapSlotBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCommonModelMapper$mapSlotBody$1.label;
        q8s q8sVar2 = this.c;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = iqs0Var2.c;
        if (formattedText != null) {
        }
        return new eqs0(align, charSequence, charSequence32);
    }

    public final hts0 g(pts0 pts0Var) {
        ldc d;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle2 = null;
        if (!(pts0Var instanceof mts0)) {
            if (pts0Var instanceof nts0) {
                g5v g5vVar = ((nts0) pts0Var).a;
                lvi0 c = c(g5vVar.a);
                String str = g5vVar.b;
                return new gts0(new y4v(c, (str == null || (d = this.b.d(str)) == null) ? null : new z4v(d.a), null));
            }
            if (pts0Var instanceof ots0) {
                return null;
            }
            w511.b();
            return null;
        }
        mts0 mts0Var = (mts0) pts0Var;
        lvi0 c2 = c(mts0Var.a);
        IconStyleState iconStyleState = mts0Var.b;
        if (iconStyleState != null) {
            switch (w501.b[iconStyleState.ordinal()]) {
                case 1:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.ICON;
                    break;
                case 2:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.IMAGE;
                    break;
                case 3:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.BRAND;
                    break;
                case 4:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.PAYMENT;
                    break;
                case 5:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.BRANDXS;
                    break;
                case 6:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.USERPIC;
                    break;
                case 7:
                    slotLead$LeadIcon$IconStyle = SlotLead$LeadIcon$IconStyle.SERVICE;
                    break;
                default:
                    w511.b();
                    return null;
            }
            slotLead$LeadIcon$IconStyle2 = slotLead$LeadIcon$IconStyle;
        }
        return new fts0(c2, slotLead$LeadIcon$IconStyle2);
    }

    public final cyu0 i(zp1 zp1Var) {
        return new cyu0((String) zp1Var.b, (YaTextStyle) zp1Var.c, (YaFontWeight) zp1Var.w, d((String) zp1Var.x), zp1Var.a, (YaTextOverflow) zp1Var.y);
    }
}
