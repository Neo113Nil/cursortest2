package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.api.h;
import com.yandex.delivery.mapper.model.state.Align;
import com.yandex.delivery.mapper.model.state.SlotState$Size;
import defpackage.ari;
import defpackage.bri;
import defpackage.cri;
import defpackage.cvu0;
import defpackage.dqi;
import defpackage.eqs0;
import defpackage.evu0;
import defpackage.hts0;
import defpackage.i8s;
import defpackage.iqs0;
import defpackage.kez0;
import defpackage.kus0;
import defpackage.nr;
import defpackage.ny61;
import defpackage.ous0;
import defpackage.pts0;
import defpackage.pvs0;
import defpackage.q8s;
import defpackage.tcc;
import defpackage.vng;
import defpackage.w501;
import defpackage.w511;
import defpackage.wts0;
import defpackage.yqi;
import defpackage.zqi;
import defpackage.zvz0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.sdk.common.DurationFormatter;

/* loaded from: classes5.dex */
public final class b {
    public final DurationFormatter a;
    public final q8s b;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a c;

    public b(DurationFormatter durationFormatter, q8s q8sVar, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar) {
        this.a = durationFormatter;
        this.b = q8sVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r14 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r14 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cri criVar, dqi dqiVar, ContinuationImpl continuationImpl) {
        TopAccentBarMapper$map$1 topAccentBarMapper$map$1;
        int i;
        if (continuationImpl instanceof TopAccentBarMapper$map$1) {
            topAccentBarMapper$map$1 = (TopAccentBarMapper$map$1) continuationImpl;
            int i2 = topAccentBarMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topAccentBarMapper$map$1.label = i2 - Integer.MIN_VALUE;
                TopAccentBarMapper$map$1 topAccentBarMapper$map$12 = topAccentBarMapper$map$1;
                Object obj = topAccentBarMapper$map$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = topAccentBarMapper$map$12.label;
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = this.c;
                if (i == 0) {
                    if (i == 1) {
                        criVar = (cri) topAccentBarMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        yqi yqiVar = (yqi) criVar;
                        return new zvz0((wts0) obj, aVar.b.d(yqiVar.b), yqiVar.c);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    criVar = (cri) topAccentBarMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    wts0 wts0Var = (wts0) obj;
                    if (wts0Var == null) {
                        return null;
                    }
                    return new zvz0(wts0Var, aVar.b.d(((ari) criVar).b), null);
                }
                kotlin.b.b(obj);
                if (criVar instanceof yqi) {
                    kus0 kus0Var = ((yqi) criVar).a;
                    topAccentBarMapper$map$12.L$0 = criVar;
                    topAccentBarMapper$map$12.L$1 = null;
                    topAccentBarMapper$map$12.label = 1;
                    obj = aVar.e(kus0Var, topAccentBarMapper$map$12);
                } else {
                    if (!(criVar instanceof ari)) {
                        if (criVar instanceof bri) {
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    zqi zqiVar = ((ari) criVar).a;
                    kez0 kez0Var = zqiVar.c;
                    topAccentBarMapper$map$12.L$0 = criVar;
                    topAccentBarMapper$map$12.L$1 = null;
                    topAccentBarMapper$map$12.label = 2;
                    long I = vng.I();
                    long j = kez0Var.b + dqiVar.i;
                    long abs = Math.abs(j - I);
                    kus0 kus0Var2 = I < j ? zqiVar.b : zqiVar.a;
                    if (kus0Var2 != null) {
                        Object c = c(kus0Var2, kez0Var, abs, topAccentBarMapper$map$12);
                        if (c != obj2) {
                            c = (wts0) c;
                        }
                        obj = c;
                    } else {
                        obj = null;
                    }
                }
                return obj2;
            }
        }
        topAccentBarMapper$map$1 = new TopAccentBarMapper$map$1(this, continuationImpl);
        TopAccentBarMapper$map$1 topAccentBarMapper$map$122 = topAccentBarMapper$map$1;
        Object obj3 = topAccentBarMapper$map$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = topAccentBarMapper$map$122.label;
        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar2 = this.c;
        if (i == 0) {
        }
    }

    public final Object b(FormattedText formattedText, kez0 kez0Var, long j, Continuation continuation) {
        kez0 kez0Var2 = kez0Var;
        List<i8s> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (i8s i8sVar : list) {
            if (i8sVar instanceof h) {
                h hVar = (h) i8sVar;
                String str = hVar.a;
                if (evu0.y(str, kez0Var2.c, false)) {
                    String str2 = kez0Var2.a;
                    this.a.getClass();
                    i8sVar = new h(cvu0.v(str, kez0Var2.c, DurationFormatter.b(j, str2), false), hVar.b, hVar.c, hVar.d, hVar.e, hVar.f, hVar.g, hVar.h, hVar.i, hVar.j, hVar.k);
                    arrayList.add(i8sVar);
                    kez0Var2 = kez0Var;
                }
            }
            arrayList.add(i8sVar);
            kez0Var2 = kez0Var;
        }
        return this.b.a(new FormattedText(arrayList), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(kus0 kus0Var, kez0 kez0Var, long j, ContinuationImpl continuationImpl) {
        TopAccentBarMapper$mapTimerSlot$1 topAccentBarMapper$mapTimerSlot$1;
        int i;
        kez0 kez0Var2;
        long j2;
        eqs0 eqs0Var;
        iqs0 iqs0Var;
        kus0 kus0Var2;
        eqs0 eqs0Var2;
        kez0 kez0Var3;
        long j3;
        eqs0 eqs0Var3;
        iqs0 iqs0Var2;
        eqs0 eqs0Var4;
        eqs0 eqs0Var5;
        eqs0 eqs0Var6;
        eqs0 eqs0Var7;
        kus0 kus0Var3;
        eqs0 eqs0Var8;
        SlotState$Size slotState$Size;
        float f;
        b bVar = this;
        kus0 kus0Var4 = kus0Var;
        if (continuationImpl instanceof TopAccentBarMapper$mapTimerSlot$1) {
            topAccentBarMapper$mapTimerSlot$1 = (TopAccentBarMapper$mapTimerSlot$1) continuationImpl;
            int i2 = topAccentBarMapper$mapTimerSlot$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topAccentBarMapper$mapTimerSlot$1.label = i2 - Integer.MIN_VALUE;
                TopAccentBarMapper$mapTimerSlot$1 topAccentBarMapper$mapTimerSlot$12 = topAccentBarMapper$mapTimerSlot$1;
                Object obj = topAccentBarMapper$mapTimerSlot$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = topAccentBarMapper$mapTimerSlot$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    iqs0 iqs0Var3 = kus0Var4.a;
                    topAccentBarMapper$mapTimerSlot$12.L$0 = kus0Var4;
                    topAccentBarMapper$mapTimerSlot$12.L$1 = kez0Var;
                    topAccentBarMapper$mapTimerSlot$12.J$0 = j;
                    topAccentBarMapper$mapTimerSlot$12.label = 1;
                    obj = bVar.d(iqs0Var3, kez0Var, j, topAccentBarMapper$mapTimerSlot$12);
                    if (obj != coroutineSingletons) {
                        kez0Var2 = kez0Var;
                        j2 = j;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eqs0Var7 = (eqs0) topAccentBarMapper$mapTimerSlot$12.L$3;
                        eqs0Var8 = (eqs0) topAccentBarMapper$mapTimerSlot$12.L$2;
                        kus0Var3 = (kus0) topAccentBarMapper$mapTimerSlot$12.L$0;
                        kotlin.b.b(obj);
                        eqs0Var5 = (eqs0) obj;
                        eqs0Var4 = eqs0Var7;
                        eqs0Var6 = eqs0Var8;
                        kus0Var2 = kus0Var3;
                        pts0 pts0Var = kus0Var2.b;
                        slotState$Size = kus0Var2.h;
                        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = bVar.c;
                        hts0 g = pts0Var != null ? aVar.g(pts0Var) : null;
                        nr nrVar = kus0Var2.e;
                        ous0 ous0Var = new ous0(r3.a, aVar.b.d(kus0Var2.f.b), r3.c);
                        float h = ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a.h(slotState$Size);
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
                        return new wts0(eqs0Var6, g, eqs0Var4, eqs0Var5, nrVar, (pvs0) null, ous0Var, h, f, 544);
                    }
                    j3 = topAccentBarMapper$mapTimerSlot$12.J$0;
                    eqs0Var3 = (eqs0) topAccentBarMapper$mapTimerSlot$12.L$2;
                    kez0Var3 = (kez0) topAccentBarMapper$mapTimerSlot$12.L$1;
                    kus0Var2 = (kus0) topAccentBarMapper$mapTimerSlot$12.L$0;
                    kotlin.b.b(obj);
                    eqs0Var = eqs0Var3;
                    j2 = j3;
                    kez0Var2 = kez0Var3;
                    eqs0Var2 = (eqs0) obj;
                    iqs0Var2 = kus0Var2.d;
                    if (iqs0Var2 == null) {
                        bVar = this;
                        eqs0Var4 = eqs0Var2;
                        eqs0Var5 = null;
                        eqs0Var6 = eqs0Var;
                        pts0 pts0Var2 = kus0Var2.b;
                        slotState$Size = kus0Var2.h;
                        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar2 = bVar.c;
                        if (pts0Var2 != null) {
                        }
                        nr nrVar2 = kus0Var2.e;
                        ous0 ous0Var2 = new ous0(r3.a, aVar2.b.d(kus0Var2.f.b), r3.c);
                        float h2 = ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a.h(slotState$Size);
                        switch (w501.a[slotState$Size.ordinal()]) {
                        }
                        return new wts0(eqs0Var6, g, eqs0Var4, eqs0Var5, nrVar2, (pvs0) null, ous0Var2, h2, f, 544);
                    }
                    topAccentBarMapper$mapTimerSlot$12.L$0 = kus0Var2;
                    topAccentBarMapper$mapTimerSlot$12.L$1 = null;
                    topAccentBarMapper$mapTimerSlot$12.L$2 = eqs0Var;
                    topAccentBarMapper$mapTimerSlot$12.L$3 = eqs0Var2;
                    topAccentBarMapper$mapTimerSlot$12.L$4 = null;
                    topAccentBarMapper$mapTimerSlot$12.J$0 = j2;
                    topAccentBarMapper$mapTimerSlot$12.I$0 = 0;
                    topAccentBarMapper$mapTimerSlot$12.label = 3;
                    bVar = this;
                    obj = bVar.d(iqs0Var2, kez0Var2, j2, topAccentBarMapper$mapTimerSlot$12);
                    if (obj != coroutineSingletons) {
                        eqs0Var7 = eqs0Var2;
                        kus0Var3 = kus0Var2;
                        eqs0Var8 = eqs0Var;
                        eqs0Var5 = (eqs0) obj;
                        eqs0Var4 = eqs0Var7;
                        eqs0Var6 = eqs0Var8;
                        kus0Var2 = kus0Var3;
                        pts0 pts0Var22 = kus0Var2.b;
                        slotState$Size = kus0Var2.h;
                        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar22 = bVar.c;
                        if (pts0Var22 != null) {
                        }
                        nr nrVar22 = kus0Var2.e;
                        ous0 ous0Var22 = new ous0(r3.a, aVar22.b.d(kus0Var2.f.b), r3.c);
                        float h22 = ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a.h(slotState$Size);
                        switch (w501.a[slotState$Size.ordinal()]) {
                        }
                        return new wts0(eqs0Var6, g, eqs0Var4, eqs0Var5, nrVar22, (pvs0) null, ous0Var22, h22, f, 544);
                    }
                    return coroutineSingletons;
                }
                long j4 = topAccentBarMapper$mapTimerSlot$12.J$0;
                kez0 kez0Var4 = (kez0) topAccentBarMapper$mapTimerSlot$12.L$1;
                kus0Var4 = (kus0) topAccentBarMapper$mapTimerSlot$12.L$0;
                kotlin.b.b(obj);
                kez0Var2 = kez0Var4;
                j2 = j4;
                eqs0Var = (eqs0) obj;
                iqs0Var = kus0Var4.c;
                if (iqs0Var == null) {
                    topAccentBarMapper$mapTimerSlot$12.L$0 = kus0Var4;
                    topAccentBarMapper$mapTimerSlot$12.L$1 = kez0Var2;
                    topAccentBarMapper$mapTimerSlot$12.L$2 = eqs0Var;
                    topAccentBarMapper$mapTimerSlot$12.L$3 = null;
                    topAccentBarMapper$mapTimerSlot$12.J$0 = j2;
                    topAccentBarMapper$mapTimerSlot$12.I$0 = 0;
                    topAccentBarMapper$mapTimerSlot$12.label = 2;
                    obj = d(iqs0Var, kez0Var2, j2, topAccentBarMapper$mapTimerSlot$12);
                    if (obj != coroutineSingletons) {
                        kus0Var2 = kus0Var4;
                        kez0Var3 = kez0Var2;
                        j3 = j2;
                        eqs0Var3 = eqs0Var;
                        eqs0Var = eqs0Var3;
                        j2 = j3;
                        kez0Var2 = kez0Var3;
                        eqs0Var2 = (eqs0) obj;
                        iqs0Var2 = kus0Var2.d;
                        if (iqs0Var2 == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                kus0Var2 = kus0Var4;
                eqs0Var2 = null;
                iqs0Var2 = kus0Var2.d;
                if (iqs0Var2 == null) {
                }
            }
        }
        topAccentBarMapper$mapTimerSlot$1 = new TopAccentBarMapper$mapTimerSlot$1(bVar, continuationImpl);
        TopAccentBarMapper$mapTimerSlot$1 topAccentBarMapper$mapTimerSlot$122 = topAccentBarMapper$mapTimerSlot$1;
        Object obj2 = topAccentBarMapper$mapTimerSlot$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = topAccentBarMapper$mapTimerSlot$122.label;
        if (i != 0) {
        }
        eqs0Var = (eqs0) obj2;
        iqs0Var = kus0Var4.c;
        if (iqs0Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(iqs0 iqs0Var, kez0 kez0Var, long j, ContinuationImpl continuationImpl) {
        TopAccentBarMapper$mapTimerSlotBody$1 topAccentBarMapper$mapTimerSlotBody$1;
        b bVar;
        int i;
        kez0 kez0Var2;
        long j2;
        Align align;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        Align align2;
        iqs0 iqs0Var2 = iqs0Var;
        if (continuationImpl instanceof TopAccentBarMapper$mapTimerSlotBody$1) {
            topAccentBarMapper$mapTimerSlotBody$1 = (TopAccentBarMapper$mapTimerSlotBody$1) continuationImpl;
            int i2 = topAccentBarMapper$mapTimerSlotBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topAccentBarMapper$mapTimerSlotBody$1.label = i2 - Integer.MIN_VALUE;
                bVar = this;
                TopAccentBarMapper$mapTimerSlotBody$1 topAccentBarMapper$mapTimerSlotBody$12 = topAccentBarMapper$mapTimerSlotBody$1;
                Object obj = topAccentBarMapper$mapTimerSlotBody$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = topAccentBarMapper$mapTimerSlotBody$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Align align3 = iqs0Var2.a;
                    FormattedText formattedText2 = iqs0Var2.b;
                    topAccentBarMapper$mapTimerSlotBody$12.L$0 = iqs0Var2;
                    topAccentBarMapper$mapTimerSlotBody$12.L$1 = kez0Var;
                    topAccentBarMapper$mapTimerSlotBody$12.L$2 = null;
                    topAccentBarMapper$mapTimerSlotBody$12.L$3 = align3;
                    topAccentBarMapper$mapTimerSlotBody$12.J$0 = j;
                    topAccentBarMapper$mapTimerSlotBody$12.I$0 = 0;
                    topAccentBarMapper$mapTimerSlotBody$12.label = 1;
                    Object b = bVar.b(formattedText2, kez0Var, j, topAccentBarMapper$mapTimerSlotBody$12);
                    if (b != coroutineSingletons) {
                        kez0Var2 = kez0Var;
                        j2 = j;
                        align = align3;
                        obj = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) topAccentBarMapper$mapTimerSlotBody$12.L$4;
                    align2 = (Align) topAccentBarMapper$mapTimerSlotBody$12.L$3;
                    kotlin.b.b(obj);
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    align = align2;
                    return new eqs0(align, charSequence, charSequence3);
                }
                long j3 = topAccentBarMapper$mapTimerSlotBody$12.J$0;
                Align align4 = (Align) topAccentBarMapper$mapTimerSlotBody$12.L$3;
                kez0 kez0Var3 = (kez0) topAccentBarMapper$mapTimerSlotBody$12.L$1;
                iqs0 iqs0Var3 = (iqs0) topAccentBarMapper$mapTimerSlotBody$12.L$0;
                kotlin.b.b(obj);
                align = align4;
                iqs0Var2 = iqs0Var3;
                kez0Var2 = kez0Var3;
                j2 = j3;
                charSequence = (CharSequence) obj;
                formattedText = iqs0Var2.c;
                if (formattedText != null) {
                    topAccentBarMapper$mapTimerSlotBody$12.L$0 = null;
                    topAccentBarMapper$mapTimerSlotBody$12.L$1 = null;
                    topAccentBarMapper$mapTimerSlotBody$12.L$2 = null;
                    topAccentBarMapper$mapTimerSlotBody$12.L$3 = align;
                    topAccentBarMapper$mapTimerSlotBody$12.L$4 = charSequence;
                    topAccentBarMapper$mapTimerSlotBody$12.J$0 = j2;
                    topAccentBarMapper$mapTimerSlotBody$12.I$0 = 0;
                    topAccentBarMapper$mapTimerSlotBody$12.label = 2;
                    Object b2 = b(formattedText, kez0Var2, j2, topAccentBarMapper$mapTimerSlotBody$12);
                    if (b2 != coroutineSingletons) {
                        obj = b2;
                        charSequence2 = charSequence;
                        align2 = align;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        align = align2;
                    }
                    return coroutineSingletons;
                }
                return new eqs0(align, charSequence, charSequence3);
            }
        }
        bVar = this;
        topAccentBarMapper$mapTimerSlotBody$1 = new TopAccentBarMapper$mapTimerSlotBody$1(bVar, continuationImpl);
        TopAccentBarMapper$mapTimerSlotBody$1 topAccentBarMapper$mapTimerSlotBody$122 = topAccentBarMapper$mapTimerSlotBody$1;
        Object obj2 = topAccentBarMapper$mapTimerSlotBody$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = topAccentBarMapper$mapTimerSlotBody$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = iqs0Var2.c;
        if (formattedText != null) {
        }
        return new eqs0(align, charSequence, charSequence32);
    }
}
