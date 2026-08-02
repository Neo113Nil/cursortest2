package ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.mapper;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.CancelType;
import defpackage.bxh;
import defpackage.cuj0;
import defpackage.exh;
import defpackage.fxh;
import defpackage.gxh;
import defpackage.hxh;
import defpackage.l7x0;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.rn;
import defpackage.tcc;
import defpackage.tv7;
import defpackage.un;
import defpackage.vn;
import defpackage.vwa0;
import defpackage.vzg0;
import defpackage.w511;
import defpackage.zn;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;
    public final l7x0 b;

    public a(q8s q8sVar, l7x0 l7x0Var) {
        this.a = q8sVar;
        this.b = l7x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x025d, code lost:
    
        if (r3 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0138, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bxh bxhVar, vwa0 vwa0Var, ContinuationImpl continuationImpl) {
        DeliveryCancelInfoModelMapper$map$1 deliveryCancelInfoModelMapper$map$1;
        int i;
        gxh gxhVar;
        CancelType cancelType;
        gxh gxhVar2;
        CancelType cancelType2;
        CharSequence charSequence;
        Object a;
        String str;
        FormattedText formattedText;
        CharSequence charSequence2;
        gxh gxhVar3;
        CharSequence charSequence3;
        bxh bxhVar2;
        CharSequence charSequence4;
        Object a2;
        CancelType cancelType3;
        CharSequence charSequence5;
        gxh gxhVar4;
        CharSequence charSequence6;
        bxh bxhVar3;
        List list;
        fxh fxhVar;
        fxh fxhVar2;
        CharSequence charSequence7;
        FormattedText formattedText2;
        boolean z;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CancelType cancelType4;
        gxh gxhVar5;
        exh exhVar;
        bxh bxhVar4 = bxhVar;
        if (continuationImpl instanceof DeliveryCancelInfoModelMapper$map$1) {
            deliveryCancelInfoModelMapper$map$1 = (DeliveryCancelInfoModelMapper$map$1) continuationImpl;
            int i2 = deliveryCancelInfoModelMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCancelInfoModelMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCancelInfoModelMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCancelInfoModelMapper$map$1.label;
                q8s q8sVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    gxhVar = (vwa0Var == null || (str = vwa0Var.f) == null) ? null : new gxh(vwa0Var.e, new lvi0(str, null, null, null, null, 62));
                    cancelType = bxhVar4.a;
                    FormattedText formattedText3 = bxhVar4.b;
                    if (formattedText3 == null) {
                        gxhVar2 = gxhVar;
                        cancelType2 = cancelType;
                        charSequence = null;
                        formattedText = bxhVar4.c;
                        if (formattedText == null) {
                            charSequence2 = charSequence;
                            gxhVar3 = gxhVar2;
                            charSequence3 = null;
                            ArrayList<tv7> arrayList = bxhVar4.d;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            while (r7.hasNext()) {
                            }
                            FormattedText formattedText4 = bxhVar4.e.a;
                            deliveryCancelInfoModelMapper$map$1.L$0 = bxhVar4;
                            deliveryCancelInfoModelMapper$map$1.L$1 = null;
                            deliveryCancelInfoModelMapper$map$1.L$2 = gxhVar3;
                            deliveryCancelInfoModelMapper$map$1.L$3 = cancelType2;
                            deliveryCancelInfoModelMapper$map$1.L$4 = charSequence2;
                            deliveryCancelInfoModelMapper$map$1.L$5 = charSequence3;
                            deliveryCancelInfoModelMapper$map$1.L$6 = arrayList2;
                            deliveryCancelInfoModelMapper$map$1.label = 3;
                            a2 = q8sVar.a(formattedText4, deliveryCancelInfoModelMapper$map$1);
                            if (a2 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        deliveryCancelInfoModelMapper$map$1.L$0 = bxhVar4;
                        deliveryCancelInfoModelMapper$map$1.L$1 = null;
                        deliveryCancelInfoModelMapper$map$1.L$2 = null;
                        deliveryCancelInfoModelMapper$map$1.L$3 = gxhVar2;
                        deliveryCancelInfoModelMapper$map$1.L$4 = cancelType2;
                        deliveryCancelInfoModelMapper$map$1.L$5 = charSequence;
                        deliveryCancelInfoModelMapper$map$1.I$0 = 0;
                        deliveryCancelInfoModelMapper$map$1.label = 2;
                        Object a3 = q8sVar.a(formattedText, deliveryCancelInfoModelMapper$map$1);
                        if (a3 != coroutineSingletons) {
                            bxhVar2 = bxhVar4;
                            charSequence4 = charSequence;
                            gxhVar3 = gxhVar2;
                            obj = a3;
                            charSequence3 = (CharSequence) obj;
                            bxh bxhVar5 = bxhVar2;
                            charSequence2 = charSequence4;
                            bxhVar4 = bxhVar5;
                            ArrayList<tv7> arrayList3 = bxhVar4.d;
                            ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
                            while (r7.hasNext()) {
                            }
                            FormattedText formattedText42 = bxhVar4.e.a;
                            deliveryCancelInfoModelMapper$map$1.L$0 = bxhVar4;
                            deliveryCancelInfoModelMapper$map$1.L$1 = null;
                            deliveryCancelInfoModelMapper$map$1.L$2 = gxhVar3;
                            deliveryCancelInfoModelMapper$map$1.L$3 = cancelType2;
                            deliveryCancelInfoModelMapper$map$1.L$4 = charSequence2;
                            deliveryCancelInfoModelMapper$map$1.L$5 = charSequence3;
                            deliveryCancelInfoModelMapper$map$1.L$6 = arrayList22;
                            deliveryCancelInfoModelMapper$map$1.label = 3;
                            a2 = q8sVar.a(formattedText42, deliveryCancelInfoModelMapper$map$1);
                            if (a2 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    deliveryCancelInfoModelMapper$map$1.L$0 = bxhVar4;
                    deliveryCancelInfoModelMapper$map$1.L$1 = null;
                    deliveryCancelInfoModelMapper$map$1.L$2 = null;
                    deliveryCancelInfoModelMapper$map$1.L$3 = gxhVar;
                    deliveryCancelInfoModelMapper$map$1.L$4 = cancelType;
                    deliveryCancelInfoModelMapper$map$1.I$0 = 0;
                    deliveryCancelInfoModelMapper$map$1.label = 1;
                    a = q8sVar.a(formattedText3, deliveryCancelInfoModelMapper$map$1);
                } else if (i == 1) {
                    CancelType cancelType5 = (CancelType) deliveryCancelInfoModelMapper$map$1.L$4;
                    gxhVar = (gxh) deliveryCancelInfoModelMapper$map$1.L$3;
                    bxh bxhVar6 = (bxh) deliveryCancelInfoModelMapper$map$1.L$0;
                    b.b(obj);
                    cancelType = cancelType5;
                    bxhVar4 = bxhVar6;
                    a = obj;
                } else {
                    if (i == 2) {
                        charSequence4 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$5;
                        cancelType2 = (CancelType) deliveryCancelInfoModelMapper$map$1.L$4;
                        gxhVar3 = (gxh) deliveryCancelInfoModelMapper$map$1.L$3;
                        bxhVar2 = (bxh) deliveryCancelInfoModelMapper$map$1.L$0;
                        b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        bxh bxhVar52 = bxhVar2;
                        charSequence2 = charSequence4;
                        bxhVar4 = bxhVar52;
                        ArrayList<tv7> arrayList32 = bxhVar4.d;
                        ArrayList arrayList222 = new ArrayList(tcc.n(arrayList32, 10));
                        for (tv7 tv7Var : arrayList32) {
                            if (tv7Var instanceof vn) {
                                vn vnVar = (vn) tv7Var;
                                String str2 = vnVar.g;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = vnVar.j;
                                fxhVar2 = new fxh(str2, str3 != null ? b(str3) : null, tv7Var);
                            } else if (tv7Var instanceof zn) {
                                fxhVar2 = new fxh(((zn) tv7Var).a, new cuj0(vzg0.ic_tracking_call, null, null, null, 30), tv7Var);
                            } else {
                                if (tv7Var instanceof un) {
                                    un unVar = (un) tv7Var;
                                    String str4 = unVar.a;
                                    String str5 = unVar.c;
                                    fxhVar = new fxh(str4, str5 != null ? b(str5) : null, tv7Var);
                                } else {
                                    if (!(tv7Var instanceof rn)) {
                                        w511.b();
                                        return null;
                                    }
                                    rn rnVar = (rn) tv7Var;
                                    String str6 = rnVar.a;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    String str7 = rnVar.c;
                                    fxhVar = new fxh(str6, str7 != null ? b(str7) : null, tv7Var);
                                }
                                fxhVar2 = fxhVar;
                            }
                            arrayList222.add(fxhVar2);
                        }
                        FormattedText formattedText422 = bxhVar4.e.a;
                        deliveryCancelInfoModelMapper$map$1.L$0 = bxhVar4;
                        deliveryCancelInfoModelMapper$map$1.L$1 = null;
                        deliveryCancelInfoModelMapper$map$1.L$2 = gxhVar3;
                        deliveryCancelInfoModelMapper$map$1.L$3 = cancelType2;
                        deliveryCancelInfoModelMapper$map$1.L$4 = charSequence2;
                        deliveryCancelInfoModelMapper$map$1.L$5 = charSequence3;
                        deliveryCancelInfoModelMapper$map$1.L$6 = arrayList222;
                        deliveryCancelInfoModelMapper$map$1.label = 3;
                        a2 = q8sVar.a(formattedText422, deliveryCancelInfoModelMapper$map$1);
                        if (a2 != coroutineSingletons) {
                            cancelType3 = cancelType2;
                            charSequence5 = charSequence3;
                            gxhVar4 = gxhVar3;
                            charSequence6 = charSequence2;
                            obj = a2;
                            bxhVar3 = bxhVar4;
                            list = arrayList222;
                            charSequence7 = (CharSequence) obj;
                            formattedText2 = bxhVar3.e.b;
                            if (formattedText2 != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            exh exhVar2 = (exh) deliveryCancelInfoModelMapper$map$1.L$7;
                            list = (List) deliveryCancelInfoModelMapper$map$1.L$6;
                            charSequence5 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$5;
                            CharSequence charSequence10 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$4;
                            CancelType cancelType6 = (CancelType) deliveryCancelInfoModelMapper$map$1.L$3;
                            gxh gxhVar6 = (gxh) deliveryCancelInfoModelMapper$map$1.L$2;
                            b.b(obj);
                            exhVar = exhVar2;
                            charSequence9 = charSequence10;
                            cancelType4 = cancelType6;
                            gxhVar5 = gxhVar6;
                            return new hxh(gxhVar5, cancelType4, charSequence9, charSequence5, list, exhVar, new exh((CharSequence) obj, null, true));
                        }
                        charSequence7 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$8;
                        list = (List) deliveryCancelInfoModelMapper$map$1.L$7;
                        charSequence5 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$6;
                        charSequence6 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$5;
                        cancelType3 = (CancelType) deliveryCancelInfoModelMapper$map$1.L$4;
                        gxhVar4 = (gxh) deliveryCancelInfoModelMapper$map$1.L$3;
                        bxhVar3 = (bxh) deliveryCancelInfoModelMapper$map$1.L$0;
                        b.b(obj);
                        z = false;
                        charSequence8 = (CharSequence) obj;
                        exh exhVar3 = new exh(charSequence7, charSequence8, z);
                        FormattedText formattedText5 = bxhVar3.f.a;
                        deliveryCancelInfoModelMapper$map$1.L$0 = null;
                        deliveryCancelInfoModelMapper$map$1.L$1 = null;
                        deliveryCancelInfoModelMapper$map$1.L$2 = gxhVar4;
                        deliveryCancelInfoModelMapper$map$1.L$3 = cancelType3;
                        deliveryCancelInfoModelMapper$map$1.L$4 = charSequence6;
                        deliveryCancelInfoModelMapper$map$1.L$5 = charSequence5;
                        deliveryCancelInfoModelMapper$map$1.L$6 = list;
                        deliveryCancelInfoModelMapper$map$1.L$7 = exhVar3;
                        deliveryCancelInfoModelMapper$map$1.L$8 = null;
                        deliveryCancelInfoModelMapper$map$1.label = 5;
                        obj = q8sVar.a(formattedText5, deliveryCancelInfoModelMapper$map$1);
                        if (obj != coroutineSingletons) {
                            charSequence9 = charSequence6;
                            cancelType4 = cancelType3;
                            gxhVar5 = gxhVar4;
                            exhVar = exhVar3;
                            return new hxh(gxhVar5, cancelType4, charSequence9, charSequence5, list, exhVar, new exh((CharSequence) obj, null, true));
                        }
                        return coroutineSingletons;
                    }
                    List list2 = (List) deliveryCancelInfoModelMapper$map$1.L$6;
                    CharSequence charSequence11 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$5;
                    CharSequence charSequence12 = (CharSequence) deliveryCancelInfoModelMapper$map$1.L$4;
                    CancelType cancelType7 = (CancelType) deliveryCancelInfoModelMapper$map$1.L$3;
                    gxhVar4 = (gxh) deliveryCancelInfoModelMapper$map$1.L$2;
                    bxhVar3 = (bxh) deliveryCancelInfoModelMapper$map$1.L$0;
                    b.b(obj);
                    cancelType3 = cancelType7;
                    charSequence6 = charSequence12;
                    charSequence5 = charSequence11;
                    list = list2;
                    charSequence7 = (CharSequence) obj;
                    formattedText2 = bxhVar3.e.b;
                    if (formattedText2 != null) {
                        z = false;
                        charSequence8 = null;
                        exh exhVar32 = new exh(charSequence7, charSequence8, z);
                        FormattedText formattedText52 = bxhVar3.f.a;
                        deliveryCancelInfoModelMapper$map$1.L$0 = null;
                        deliveryCancelInfoModelMapper$map$1.L$1 = null;
                        deliveryCancelInfoModelMapper$map$1.L$2 = gxhVar4;
                        deliveryCancelInfoModelMapper$map$1.L$3 = cancelType3;
                        deliveryCancelInfoModelMapper$map$1.L$4 = charSequence6;
                        deliveryCancelInfoModelMapper$map$1.L$5 = charSequence5;
                        deliveryCancelInfoModelMapper$map$1.L$6 = list;
                        deliveryCancelInfoModelMapper$map$1.L$7 = exhVar32;
                        deliveryCancelInfoModelMapper$map$1.L$8 = null;
                        deliveryCancelInfoModelMapper$map$1.label = 5;
                        obj = q8sVar.a(formattedText52, deliveryCancelInfoModelMapper$map$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    deliveryCancelInfoModelMapper$map$1.L$0 = bxhVar3;
                    deliveryCancelInfoModelMapper$map$1.L$1 = null;
                    deliveryCancelInfoModelMapper$map$1.L$2 = null;
                    deliveryCancelInfoModelMapper$map$1.L$3 = gxhVar4;
                    deliveryCancelInfoModelMapper$map$1.L$4 = cancelType3;
                    deliveryCancelInfoModelMapper$map$1.L$5 = charSequence6;
                    deliveryCancelInfoModelMapper$map$1.L$6 = charSequence5;
                    deliveryCancelInfoModelMapper$map$1.L$7 = list;
                    deliveryCancelInfoModelMapper$map$1.L$8 = charSequence7;
                    z = false;
                    deliveryCancelInfoModelMapper$map$1.I$0 = 0;
                    deliveryCancelInfoModelMapper$map$1.label = 4;
                    obj = q8sVar.a(formattedText2, deliveryCancelInfoModelMapper$map$1);
                }
                charSequence = (CharSequence) a;
                CancelType cancelType8 = cancelType;
                gxhVar2 = gxhVar;
                cancelType2 = cancelType8;
                formattedText = bxhVar4.c;
                if (formattedText == null) {
                }
            }
        }
        deliveryCancelInfoModelMapper$map$1 = new DeliveryCancelInfoModelMapper$map$1(this, continuationImpl);
        Object obj2 = deliveryCancelInfoModelMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCancelInfoModelMapper$map$1.label;
        q8s q8sVar2 = this.a;
        if (i != 0) {
        }
        charSequence = (CharSequence) a;
        CancelType cancelType82 = cancelType;
        gxhVar2 = gxhVar;
        cancelType2 = cancelType82;
        formattedText = bxhVar4.c;
        if (formattedText == null) {
        }
    }

    public final lvi0 b(String str) {
        return new lvi0(this.b.a(str), null, null, null, null, 62);
    }
}
