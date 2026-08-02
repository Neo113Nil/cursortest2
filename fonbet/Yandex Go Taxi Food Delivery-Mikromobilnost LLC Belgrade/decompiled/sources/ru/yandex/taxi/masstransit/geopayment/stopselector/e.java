package ru.yandex.taxi.masstransit.geopayment.stopselector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import defpackage.ahu0;
import defpackage.aiy;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.bhu0;
import defpackage.ciy;
import defpackage.dwh0;
import defpackage.e0h0;
import defpackage.edc;
import defpackage.eiy;
import defpackage.frn;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.req0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tog0;
import defpackage.uiu0;
import defpackage.vng;
import defpackage.wfu0;
import defpackage.xfu0;
import defpackage.xng0;
import defpackage.ygu0;
import defpackage.zgu0;
import defpackage.zuj0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.adapter.Ellipse$Size;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes6.dex */
public final class e {
    public final Context a;
    public final ru.yandex.taxi.widget.c b;
    public final zuj0 c;

    public e(Context context, ru.yandex.taxi.widget.c cVar, zuj0 zuj0Var) {
        this.a = context;
        this.b = cVar;
        this.c = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(List list, boolean z, ciy ciyVar, ciy ciyVar2, ContinuationImpl continuationImpl) {
        StopsSelectorUIMapper$mapToGroup$1 stopsSelectorUIMapper$mapToGroup$1;
        int i;
        wfu0 wfu0Var;
        wfu0 wfu0Var2;
        Collection collection;
        if (continuationImpl instanceof StopsSelectorUIMapper$mapToGroup$1) {
            stopsSelectorUIMapper$mapToGroup$1 = (StopsSelectorUIMapper$mapToGroup$1) continuationImpl;
            int i2 = stopsSelectorUIMapper$mapToGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopsSelectorUIMapper$mapToGroup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stopsSelectorUIMapper$mapToGroup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorUIMapper$mapToGroup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CheckoutResponse.StopsSelector.a aVar = (CheckoutResponse.StopsSelector.a) kotlin.collections.a.R(list);
                    EmptyList emptyList = EmptyList.a;
                    if (aVar == null) {
                        return emptyList;
                    }
                    int i3 = dwh0.mass_transit_route_stops;
                    int size = list.size();
                    Object[] objArr = {new Integer(list.size())};
                    Context context = this.a;
                    String T = tje.T(context, i3, size, objArr);
                    int i4 = z ? e0h0.ic_chevron_up : e0h0.ic_chevron_down;
                    int i5 = z ? kyh0.mt_route_details_collapse_stops_description : kyh0.mt_route_details_expand_stops_description;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) T);
                    Drawable t = vng.t(i4, context);
                    if (t != null) {
                        spannableStringBuilder.append(" ", new CustomImageSpan(t, 2, false, false, null, 28, null), 33);
                    }
                    wfu0Var = new wfu0(aVar.a, spannableStringBuilder, ((avj0) this.c).h(i5), ciyVar, ciyVar2, T);
                    collection = emptyList;
                    if (z) {
                        stopsSelectorUIMapper$mapToGroup$1.L$0 = null;
                        stopsSelectorUIMapper$mapToGroup$1.L$1 = null;
                        stopsSelectorUIMapper$mapToGroup$1.L$2 = null;
                        stopsSelectorUIMapper$mapToGroup$1.L$3 = null;
                        stopsSelectorUIMapper$mapToGroup$1.L$4 = null;
                        stopsSelectorUIMapper$mapToGroup$1.L$5 = null;
                        stopsSelectorUIMapper$mapToGroup$1.L$6 = wfu0Var;
                        stopsSelectorUIMapper$mapToGroup$1.Z$0 = z;
                        stopsSelectorUIMapper$mapToGroup$1.I$0 = i4;
                        stopsSelectorUIMapper$mapToGroup$1.I$1 = i5;
                        stopsSelectorUIMapper$mapToGroup$1.label = 1;
                        obj = b(list, ciyVar, ciyVar2, stopsSelectorUIMapper$mapToGroup$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        wfu0Var2 = wfu0Var;
                    }
                    return kotlin.collections.a.m0(collection, Collections.singletonList(wfu0Var));
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wfu0Var2 = (wfu0) stopsSelectorUIMapper$mapToGroup$1.L$6;
                kotlin.b.b(obj);
                wfu0Var = wfu0Var2;
                collection = (List) obj;
                return kotlin.collections.a.m0(collection, Collections.singletonList(wfu0Var));
            }
        }
        stopsSelectorUIMapper$mapToGroup$1 = new StopsSelectorUIMapper$mapToGroup$1(this, continuationImpl);
        Object obj2 = stopsSelectorUIMapper$mapToGroup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorUIMapper$mapToGroup$1.label;
        if (i != 0) {
        }
        wfu0Var = wfu0Var2;
        collection = (List) obj2;
        return kotlin.collections.a.m0(collection, Collections.singletonList(wfu0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0138 -> B:11:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0150 -> B:12:0x015f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, eiy eiyVar, eiy eiyVar2, ContinuationImpl continuationImpl) {
        StopsSelectorUIMapper$mapToGroupItem$1 stopsSelectorUIMapper$mapToGroupItem$1;
        int i;
        StopsSelectorUIMapper$mapToGroupItem$1 stopsSelectorUIMapper$mapToGroupItem$12;
        ArrayList arrayList;
        eiy eiyVar3;
        Iterator it;
        eiy eiyVar4;
        ArrayList arrayList2;
        Iterator it2;
        eiy eiyVar5;
        CheckoutResponse.StopsSelector.a aVar;
        eiy eiyVar6;
        Collection collection;
        String str;
        FormattedText formattedText;
        if (continuationImpl instanceof StopsSelectorUIMapper$mapToGroupItem$1) {
            stopsSelectorUIMapper$mapToGroupItem$1 = (StopsSelectorUIMapper$mapToGroupItem$1) continuationImpl;
            int i2 = stopsSelectorUIMapper$mapToGroupItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopsSelectorUIMapper$mapToGroupItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stopsSelectorUIMapper$mapToGroupItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorUIMapper$mapToGroupItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    stopsSelectorUIMapper$mapToGroupItem$12 = stopsSelectorUIMapper$mapToGroupItem$1;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    eiyVar3 = eiyVar2;
                    it = list2.iterator();
                    eiyVar4 = eiyVar;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    collection = (Collection) stopsSelectorUIMapper$mapToGroupItem$1.L$11;
                    String str2 = (String) stopsSelectorUIMapper$mapToGroupItem$1.L$10;
                    aVar = (CheckoutResponse.StopsSelector.a) stopsSelectorUIMapper$mapToGroupItem$1.L$8;
                    Iterator it3 = (Iterator) stopsSelectorUIMapper$mapToGroupItem$1.L$6;
                    ?? r11 = (Collection) stopsSelectorUIMapper$mapToGroupItem$1.L$5;
                    eiy eiyVar7 = (eiy) stopsSelectorUIMapper$mapToGroupItem$1.L$2;
                    eiy eiyVar8 = (eiy) stopsSelectorUIMapper$mapToGroupItem$1.L$1;
                    kotlin.b.b(obj);
                    stopsSelectorUIMapper$mapToGroupItem$12 = stopsSelectorUIMapper$mapToGroupItem$1;
                    str = str2;
                    eiyVar6 = eiyVar7;
                    it2 = it3;
                    arrayList2 = r11;
                    eiyVar5 = eiyVar8;
                    CharSequence charSequence = (CharSequence) obj;
                    formattedText = aVar.e;
                    if (formattedText == null) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) stopsSelectorUIMapper$mapToGroupItem$1.L$12;
                    CharSequence charSequence2 = (CharSequence) stopsSelectorUIMapper$mapToGroupItem$1.L$11;
                    String str3 = (String) stopsSelectorUIMapper$mapToGroupItem$1.L$9;
                    Iterator it4 = (Iterator) stopsSelectorUIMapper$mapToGroupItem$1.L$6;
                    ?? r112 = (Collection) stopsSelectorUIMapper$mapToGroupItem$1.L$5;
                    eiy eiyVar9 = (eiy) stopsSelectorUIMapper$mapToGroupItem$1.L$2;
                    eiy eiyVar10 = (eiy) stopsSelectorUIMapper$mapToGroupItem$1.L$1;
                    kotlin.b.b(obj);
                    ArrayList arrayList3 = r112;
                    CharSequence charSequence3 = (CharSequence) obj;
                    CharSequence charSequence4 = charSequence2;
                    String str4 = str3;
                    eiy eiyVar11 = eiyVar9;
                    eiy eiyVar12 = eiyVar10;
                    stopsSelectorUIMapper$mapToGroupItem$12 = stopsSelectorUIMapper$mapToGroupItem$1;
                    ArrayList arrayList4 = arrayList3;
                    collection.add(new xfu0(str4, charSequence4, charSequence3, eiyVar12, eiyVar11));
                    it = it4;
                    arrayList = arrayList4;
                    eiyVar4 = eiyVar12;
                    eiyVar3 = eiyVar11;
                    if (!it.hasNext()) {
                        CheckoutResponse.StopsSelector.a aVar2 = (CheckoutResponse.StopsSelector.a) it.next();
                        String str5 = aVar2.a;
                        FormattedText formattedText2 = aVar2.d;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$0 = null;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$1 = eiyVar4;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$2 = eiyVar3;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$3 = null;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$4 = null;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$5 = arrayList;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$6 = it;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$7 = null;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$8 = aVar2;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$9 = null;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$10 = str5;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$11 = arrayList;
                        stopsSelectorUIMapper$mapToGroupItem$12.L$12 = null;
                        stopsSelectorUIMapper$mapToGroupItem$12.label = 1;
                        Object e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, stopsSelectorUIMapper$mapToGroupItem$12, 30);
                        if (e != coroutineSingletons) {
                            eiyVar5 = eiyVar4;
                            obj = e;
                            aVar = aVar2;
                            eiyVar6 = eiyVar3;
                            arrayList2 = arrayList;
                            str = str5;
                            it2 = it;
                            collection = arrayList2;
                            CharSequence charSequence5 = (CharSequence) obj;
                            formattedText = aVar.e;
                            if (formattedText == null) {
                                stopsSelectorUIMapper$mapToGroupItem$12.L$0 = null;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$1 = eiyVar5;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$2 = eiyVar6;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$3 = null;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$4 = null;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$5 = arrayList2;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$6 = it2;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$7 = null;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$8 = null;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$9 = str;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$10 = null;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$11 = charSequence5;
                                stopsSelectorUIMapper$mapToGroupItem$12.L$12 = collection;
                                stopsSelectorUIMapper$mapToGroupItem$12.label = 2;
                                eiy eiyVar13 = eiyVar6;
                                eiy eiyVar14 = eiyVar5;
                                Object e2 = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, stopsSelectorUIMapper$mapToGroupItem$12, 30);
                                if (e2 != coroutineSingletons) {
                                    charSequence2 = charSequence5;
                                    obj = e2;
                                    str3 = str;
                                    stopsSelectorUIMapper$mapToGroupItem$1 = stopsSelectorUIMapper$mapToGroupItem$12;
                                    it4 = it2;
                                    arrayList3 = arrayList2;
                                    eiyVar9 = eiyVar13;
                                    eiyVar10 = eiyVar14;
                                    CharSequence charSequence32 = (CharSequence) obj;
                                    CharSequence charSequence42 = charSequence2;
                                    String str42 = str3;
                                    eiy eiyVar112 = eiyVar9;
                                    eiy eiyVar122 = eiyVar10;
                                    stopsSelectorUIMapper$mapToGroupItem$12 = stopsSelectorUIMapper$mapToGroupItem$1;
                                    ArrayList arrayList42 = arrayList3;
                                    collection.add(new xfu0(str42, charSequence42, charSequence32, eiyVar122, eiyVar112));
                                    it = it4;
                                    arrayList = arrayList42;
                                    eiyVar4 = eiyVar122;
                                    eiyVar3 = eiyVar112;
                                    if (!it.hasNext()) {
                                        return arrayList;
                                    }
                                }
                            } else {
                                eiy eiyVar15 = eiyVar5;
                                it4 = it2;
                                arrayList42 = arrayList2;
                                eiyVar112 = eiyVar6;
                                eiyVar122 = eiyVar15;
                                charSequence42 = charSequence5;
                                str42 = str;
                                charSequence32 = null;
                                collection.add(new xfu0(str42, charSequence42, charSequence32, eiyVar122, eiyVar112));
                                it = it4;
                                arrayList = arrayList42;
                                eiyVar4 = eiyVar122;
                                eiyVar3 = eiyVar112;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        stopsSelectorUIMapper$mapToGroupItem$1 = new StopsSelectorUIMapper$mapToGroupItem$1(this, continuationImpl);
        Object obj2 = stopsSelectorUIMapper$mapToGroupItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorUIMapper$mapToGroupItem$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v7, types: [eiy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [eiy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CheckoutResponse.StopsSelector.a aVar, ciy ciyVar, frn frnVar, ContinuationImpl continuationImpl) {
        StopsSelectorUIMapper$mapToStopBeginSection$1 stopsSelectorUIMapper$mapToStopBeginSection$1;
        int i;
        Object e;
        ciy ciyVar2;
        String str;
        frn frnVar2;
        CheckoutResponse.StopsSelector.a aVar2;
        boolean z;
        FormattedText formattedText;
        boolean z2;
        ciy ciyVar3;
        frn frnVar3;
        CharSequence charSequence;
        ciy ciyVar4;
        frn frnVar4;
        boolean z3;
        CharSequence charSequence2;
        if (continuationImpl instanceof StopsSelectorUIMapper$mapToStopBeginSection$1) {
            stopsSelectorUIMapper$mapToStopBeginSection$1 = (StopsSelectorUIMapper$mapToStopBeginSection$1) continuationImpl;
            int i2 = stopsSelectorUIMapper$mapToStopBeginSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopsSelectorUIMapper$mapToStopBeginSection$1.label = i2 - Integer.MIN_VALUE;
                StopsSelectorUIMapper$mapToStopBeginSection$1 stopsSelectorUIMapper$mapToStopBeginSection$12 = stopsSelectorUIMapper$mapToStopBeginSection$1;
                Object obj = stopsSelectorUIMapper$mapToStopBeginSection$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorUIMapper$mapToStopBeginSection$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = aVar.a;
                    FormattedText formattedText2 = aVar.d;
                    stopsSelectorUIMapper$mapToStopBeginSection$12.L$0 = aVar;
                    stopsSelectorUIMapper$mapToStopBeginSection$12.L$1 = ciyVar;
                    stopsSelectorUIMapper$mapToStopBeginSection$12.L$2 = frnVar;
                    stopsSelectorUIMapper$mapToStopBeginSection$12.L$3 = str2;
                    stopsSelectorUIMapper$mapToStopBeginSection$12.Z$0 = false;
                    stopsSelectorUIMapper$mapToStopBeginSection$12.label = 1;
                    e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, stopsSelectorUIMapper$mapToStopBeginSection$12, 30);
                    if (e != coroutineSingletons) {
                        ciyVar2 = ciyVar;
                        str = str2;
                        frnVar2 = frnVar;
                        aVar2 = aVar;
                        z = false;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = stopsSelectorUIMapper$mapToStopBeginSection$12.Z$0;
                    charSequence2 = (CharSequence) stopsSelectorUIMapper$mapToStopBeginSection$12.L$5;
                    str = (String) stopsSelectorUIMapper$mapToStopBeginSection$12.L$4;
                    frnVar4 = (frn) stopsSelectorUIMapper$mapToStopBeginSection$12.L$2;
                    ?? r0 = (eiy) stopsSelectorUIMapper$mapToStopBeginSection$12.L$1;
                    kotlin.b.b(obj);
                    ciyVar4 = r0;
                    charSequence3 = (CharSequence) obj;
                    z2 = z3;
                    charSequence = charSequence2;
                    frnVar3 = frnVar4;
                    ciyVar3 = ciyVar4;
                    return new zgu0(str, charSequence, charSequence3, ciyVar3, frnVar3, z2);
                }
                z = stopsSelectorUIMapper$mapToStopBeginSection$12.Z$0;
                str = (String) stopsSelectorUIMapper$mapToStopBeginSection$12.L$3;
                frn frnVar5 = (frn) stopsSelectorUIMapper$mapToStopBeginSection$12.L$2;
                ?? r1 = (eiy) stopsSelectorUIMapper$mapToStopBeginSection$12.L$1;
                aVar2 = (CheckoutResponse.StopsSelector.a) stopsSelectorUIMapper$mapToStopBeginSection$12.L$0;
                kotlin.b.b(obj);
                frnVar2 = frnVar5;
                ciyVar2 = r1;
                e = obj;
                CharSequence charSequence4 = (CharSequence) e;
                formattedText = aVar2.e;
                if (formattedText != null) {
                    z2 = z;
                    ciyVar3 = ciyVar2;
                    frnVar3 = frnVar2;
                    charSequence = charSequence4;
                    return new zgu0(str, charSequence, charSequence3, ciyVar3, frnVar3, z2);
                }
                stopsSelectorUIMapper$mapToStopBeginSection$12.L$0 = null;
                stopsSelectorUIMapper$mapToStopBeginSection$12.L$1 = ciyVar2;
                stopsSelectorUIMapper$mapToStopBeginSection$12.L$2 = frnVar2;
                stopsSelectorUIMapper$mapToStopBeginSection$12.L$3 = null;
                stopsSelectorUIMapper$mapToStopBeginSection$12.L$4 = str;
                stopsSelectorUIMapper$mapToStopBeginSection$12.L$5 = charSequence4;
                stopsSelectorUIMapper$mapToStopBeginSection$12.Z$0 = z;
                stopsSelectorUIMapper$mapToStopBeginSection$12.label = 2;
                Object e2 = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, stopsSelectorUIMapper$mapToStopBeginSection$12, 30);
                if (e2 != coroutineSingletons) {
                    ciyVar4 = ciyVar2;
                    frnVar4 = frnVar2;
                    obj = e2;
                    z3 = z;
                    charSequence2 = charSequence4;
                    charSequence3 = (CharSequence) obj;
                    z2 = z3;
                    charSequence = charSequence2;
                    frnVar3 = frnVar4;
                    ciyVar3 = ciyVar4;
                    return new zgu0(str, charSequence, charSequence3, ciyVar3, frnVar3, z2);
                }
                return coroutineSingletons;
            }
        }
        stopsSelectorUIMapper$mapToStopBeginSection$1 = new StopsSelectorUIMapper$mapToStopBeginSection$1(this, continuationImpl);
        StopsSelectorUIMapper$mapToStopBeginSection$1 stopsSelectorUIMapper$mapToStopBeginSection$122 = stopsSelectorUIMapper$mapToStopBeginSection$1;
        Object obj2 = stopsSelectorUIMapper$mapToStopBeginSection$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorUIMapper$mapToStopBeginSection$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) e;
        formattedText = aVar2.e;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(CheckoutResponse.StopsSelector.a aVar, eiy eiyVar, eiy eiyVar2, frn frnVar, boolean z, ContinuationImpl continuationImpl) {
        StopsSelectorUIMapper$mapToStopSection$1 stopsSelectorUIMapper$mapToStopSection$1;
        int i;
        String str;
        Object obj;
        FormattedText formattedText;
        eiy eiyVar3;
        boolean z2;
        CharSequence charSequence;
        eiy eiyVar4;
        frn frnVar2;
        String str2;
        String str3;
        eiy eiyVar5;
        eiy eiyVar6;
        frn frnVar3;
        CharSequence charSequence2;
        boolean z3;
        if (continuationImpl instanceof StopsSelectorUIMapper$mapToStopSection$1) {
            stopsSelectorUIMapper$mapToStopSection$1 = (StopsSelectorUIMapper$mapToStopSection$1) continuationImpl;
            int i2 = stopsSelectorUIMapper$mapToStopSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopsSelectorUIMapper$mapToStopSection$1.label = i2 - Integer.MIN_VALUE;
                StopsSelectorUIMapper$mapToStopSection$1 stopsSelectorUIMapper$mapToStopSection$12 = stopsSelectorUIMapper$mapToStopSection$1;
                Object obj2 = stopsSelectorUIMapper$mapToStopSection$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorUIMapper$mapToStopSection$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str = aVar.a;
                    FormattedText formattedText2 = aVar.d;
                    stopsSelectorUIMapper$mapToStopSection$12.L$0 = aVar;
                    stopsSelectorUIMapper$mapToStopSection$12.L$1 = eiyVar;
                    stopsSelectorUIMapper$mapToStopSection$12.L$2 = eiyVar2;
                    stopsSelectorUIMapper$mapToStopSection$12.L$3 = frnVar;
                    stopsSelectorUIMapper$mapToStopSection$12.L$4 = str;
                    stopsSelectorUIMapper$mapToStopSection$12.Z$0 = z;
                    stopsSelectorUIMapper$mapToStopSection$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, stopsSelectorUIMapper$mapToStopSection$12, 30);
                    if (e != coroutineSingletons) {
                        obj = e;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = stopsSelectorUIMapper$mapToStopSection$12.Z$0;
                    charSequence2 = (CharSequence) stopsSelectorUIMapper$mapToStopSection$12.L$6;
                    str3 = (String) stopsSelectorUIMapper$mapToStopSection$12.L$5;
                    frnVar3 = (frn) stopsSelectorUIMapper$mapToStopSection$12.L$3;
                    eiyVar6 = (eiy) stopsSelectorUIMapper$mapToStopSection$12.L$2;
                    eiyVar5 = (eiy) stopsSelectorUIMapper$mapToStopSection$12.L$1;
                    kotlin.b.b(obj2);
                    charSequence3 = (CharSequence) obj2;
                    z2 = z3;
                    charSequence = charSequence2;
                    str2 = str3;
                    frnVar2 = frnVar3;
                    eiyVar3 = eiyVar6;
                    eiyVar4 = eiyVar5;
                    return new ahu0(str2, charSequence, charSequence3, eiyVar4, eiyVar3, frnVar2, z2);
                }
                z = stopsSelectorUIMapper$mapToStopSection$12.Z$0;
                String str4 = (String) stopsSelectorUIMapper$mapToStopSection$12.L$4;
                frnVar = (frn) stopsSelectorUIMapper$mapToStopSection$12.L$3;
                eiyVar2 = (eiy) stopsSelectorUIMapper$mapToStopSection$12.L$2;
                eiyVar = (eiy) stopsSelectorUIMapper$mapToStopSection$12.L$1;
                CheckoutResponse.StopsSelector.a aVar2 = (CheckoutResponse.StopsSelector.a) stopsSelectorUIMapper$mapToStopSection$12.L$0;
                kotlin.b.b(obj2);
                obj = obj2;
                str = str4;
                aVar = aVar2;
                eiy eiyVar7 = eiyVar;
                Object obj3 = obj;
                eiy eiyVar8 = eiyVar2;
                frn frnVar4 = frnVar;
                boolean z4 = z;
                CharSequence charSequence4 = (CharSequence) obj3;
                formattedText = aVar.e;
                if (formattedText != null) {
                    eiyVar3 = eiyVar8;
                    z2 = z4;
                    charSequence = charSequence4;
                    eiyVar4 = eiyVar7;
                    frnVar2 = frnVar4;
                    str2 = str;
                    return new ahu0(str2, charSequence, charSequence3, eiyVar4, eiyVar3, frnVar2, z2);
                }
                stopsSelectorUIMapper$mapToStopSection$12.L$0 = null;
                stopsSelectorUIMapper$mapToStopSection$12.L$1 = eiyVar7;
                stopsSelectorUIMapper$mapToStopSection$12.L$2 = eiyVar8;
                stopsSelectorUIMapper$mapToStopSection$12.L$3 = frnVar4;
                stopsSelectorUIMapper$mapToStopSection$12.L$4 = null;
                stopsSelectorUIMapper$mapToStopSection$12.L$5 = str;
                stopsSelectorUIMapper$mapToStopSection$12.L$6 = charSequence4;
                stopsSelectorUIMapper$mapToStopSection$12.Z$0 = z4;
                stopsSelectorUIMapper$mapToStopSection$12.label = 2;
                Object e2 = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, stopsSelectorUIMapper$mapToStopSection$12, 30);
                if (e2 != coroutineSingletons) {
                    str3 = str;
                    eiyVar5 = eiyVar7;
                    eiyVar6 = eiyVar8;
                    frnVar3 = frnVar4;
                    charSequence2 = charSequence4;
                    obj2 = e2;
                    z3 = z4;
                    charSequence3 = (CharSequence) obj2;
                    z2 = z3;
                    charSequence = charSequence2;
                    str2 = str3;
                    frnVar2 = frnVar3;
                    eiyVar3 = eiyVar6;
                    eiyVar4 = eiyVar5;
                    return new ahu0(str2, charSequence, charSequence3, eiyVar4, eiyVar3, frnVar2, z2);
                }
                return coroutineSingletons;
            }
        }
        stopsSelectorUIMapper$mapToStopSection$1 = new StopsSelectorUIMapper$mapToStopSection$1(this, continuationImpl);
        StopsSelectorUIMapper$mapToStopSection$1 stopsSelectorUIMapper$mapToStopSection$122 = stopsSelectorUIMapper$mapToStopSection$1;
        Object obj22 = stopsSelectorUIMapper$mapToStopSection$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorUIMapper$mapToStopSection$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        eiy eiyVar72 = eiyVar;
        Object obj32 = obj;
        eiy eiyVar82 = eiyVar2;
        frn frnVar42 = frnVar;
        boolean z42 = z;
        CharSequence charSequence42 = (CharSequence) obj32;
        formattedText = aVar.e;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [eiy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [eiy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(CheckoutResponse.StopsSelector.a aVar, eiy eiyVar, ciy ciyVar, frn frnVar, ContinuationImpl continuationImpl) {
        StopsSelectorUIMapper$mapToStopSelectedSection$1 stopsSelectorUIMapper$mapToStopSelectedSection$1;
        int i;
        String str;
        ciy ciyVar2;
        FormattedText formattedText;
        eiy eiyVar2;
        CharSequence charSequence;
        frn frnVar2;
        ciy ciyVar3;
        String str2;
        eiy eiyVar3;
        ?? r12;
        frn frnVar3;
        CharSequence charSequence2;
        if (continuationImpl instanceof StopsSelectorUIMapper$mapToStopSelectedSection$1) {
            stopsSelectorUIMapper$mapToStopSelectedSection$1 = (StopsSelectorUIMapper$mapToStopSelectedSection$1) continuationImpl;
            int i2 = stopsSelectorUIMapper$mapToStopSelectedSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopsSelectorUIMapper$mapToStopSelectedSection$1.label = i2 - Integer.MIN_VALUE;
                StopsSelectorUIMapper$mapToStopSelectedSection$1 stopsSelectorUIMapper$mapToStopSelectedSection$12 = stopsSelectorUIMapper$mapToStopSelectedSection$1;
                Object obj = stopsSelectorUIMapper$mapToStopSelectedSection$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorUIMapper$mapToStopSelectedSection$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = aVar.a;
                    FormattedText formattedText2 = aVar.d;
                    stopsSelectorUIMapper$mapToStopSelectedSection$12.L$0 = aVar;
                    stopsSelectorUIMapper$mapToStopSelectedSection$12.L$1 = eiyVar;
                    stopsSelectorUIMapper$mapToStopSelectedSection$12.L$2 = ciyVar;
                    stopsSelectorUIMapper$mapToStopSelectedSection$12.L$3 = frnVar;
                    stopsSelectorUIMapper$mapToStopSelectedSection$12.L$4 = str3;
                    stopsSelectorUIMapper$mapToStopSelectedSection$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, stopsSelectorUIMapper$mapToStopSelectedSection$12, 30);
                    if (e != coroutineSingletons) {
                        str = str3;
                        obj = e;
                        ciyVar2 = ciyVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$6;
                    str2 = (String) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$5;
                    frnVar3 = (frn) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$3;
                    r12 = (eiy) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$2;
                    eiyVar3 = (eiy) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$1;
                    kotlin.b.b(obj);
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    str = str2;
                    frnVar2 = frnVar3;
                    ciyVar3 = r12;
                    eiyVar2 = eiyVar3;
                    return new bhu0(str, charSequence, charSequence3, eiyVar2, ciyVar3, frnVar2);
                }
                String str4 = (String) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$4;
                frnVar = (frn) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$3;
                ?? r122 = (eiy) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$2;
                eiyVar = (eiy) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$1;
                CheckoutResponse.StopsSelector.a aVar2 = (CheckoutResponse.StopsSelector.a) stopsSelectorUIMapper$mapToStopSelectedSection$12.L$0;
                kotlin.b.b(obj);
                str = str4;
                aVar = aVar2;
                ciyVar2 = r122;
                eiy eiyVar4 = eiyVar;
                ciy ciyVar4 = ciyVar2;
                frn frnVar4 = frnVar;
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = aVar.e;
                if (formattedText != null) {
                    eiyVar2 = eiyVar4;
                    charSequence = charSequence4;
                    frnVar2 = frnVar4;
                    ciyVar3 = ciyVar4;
                    return new bhu0(str, charSequence, charSequence3, eiyVar2, ciyVar3, frnVar2);
                }
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$0 = null;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$1 = eiyVar4;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$2 = ciyVar4;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$3 = frnVar4;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$4 = null;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$5 = str;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.L$6 = charSequence4;
                stopsSelectorUIMapper$mapToStopSelectedSection$12.label = 2;
                obj = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, stopsSelectorUIMapper$mapToStopSelectedSection$12, 30);
                if (obj != coroutineSingletons) {
                    str2 = str;
                    eiyVar3 = eiyVar4;
                    r12 = ciyVar4;
                    frnVar3 = frnVar4;
                    charSequence2 = charSequence4;
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    str = str2;
                    frnVar2 = frnVar3;
                    ciyVar3 = r12;
                    eiyVar2 = eiyVar3;
                    return new bhu0(str, charSequence, charSequence3, eiyVar2, ciyVar3, frnVar2);
                }
                return coroutineSingletons;
            }
        }
        stopsSelectorUIMapper$mapToStopSelectedSection$1 = new StopsSelectorUIMapper$mapToStopSelectedSection$1(this, continuationImpl);
        StopsSelectorUIMapper$mapToStopSelectedSection$1 stopsSelectorUIMapper$mapToStopSelectedSection$122 = stopsSelectorUIMapper$mapToStopSelectedSection$1;
        Object obj2 = stopsSelectorUIMapper$mapToStopSelectedSection$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorUIMapper$mapToStopSelectedSection$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        eiy eiyVar42 = eiyVar;
        ciy ciyVar42 = ciyVar2;
        frn frnVar42 = frnVar;
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = aVar.e;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r25v0, types: [ru.yandex.taxi.masstransit.geopayment.stopselector.e] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x06bd -> B:15:0x06d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x042e -> B:69:0x0442). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(CheckoutResponse.StopsSelector stopsSelector, String str, String str2, String str3, boolean z, ContinuationImpl continuationImpl) {
        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$1;
        int i;
        ciy ciyVar;
        frn frnVar;
        frn frnVar2;
        frn frnVar3;
        List list;
        int i2;
        eiy eiyVar;
        String str4;
        String str5;
        boolean z2;
        CheckoutResponse.StopsSelector stopsSelector2;
        EmptyList emptyList;
        zgu0 zgu0Var;
        String str6;
        frn frnVar4;
        String str7;
        List list2;
        String str8;
        List list3;
        frn frnVar5;
        CheckoutResponse.StopsSelector stopsSelector3;
        Iterator it;
        ArrayList arrayList;
        ciy ciyVar2;
        int i3;
        int i4;
        String str9;
        boolean z3;
        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$12;
        frn frnVar6;
        String str10;
        List list4;
        eiy eiyVar2;
        int i5;
        Iterator it2;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList2;
        String str11;
        int i6;
        frn frnVar7;
        boolean z4;
        String str12;
        String str13;
        CheckoutResponse.StopsSelector stopsSelector4;
        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$13;
        Collection collection;
        Serializable a;
        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$14;
        zgu0 zgu0Var2;
        CheckoutResponse.StopsSelector stopsSelector5;
        int i7;
        ciy ciyVar3;
        frn frnVar8;
        frn frnVar9;
        List list5;
        frn frnVar10;
        CheckoutResponse.StopsSelector stopsSelector6;
        Object e;
        zgu0 zgu0Var3;
        List list6;
        String str14;
        ciy ciyVar4;
        frn frnVar11;
        zgu0 zgu0Var4;
        List list7;
        String str15;
        String str16;
        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$15;
        int i8;
        CoroutineSingletons coroutineSingletons2;
        frn frnVar12;
        ciy ciyVar5;
        int i9;
        zgu0 zgu0Var5;
        List list8;
        List list9;
        Iterator it3;
        Object obj;
        ygu0 ygu0Var;
        String str17;
        CheckoutResponse.StopsSelector stopsSelector7;
        String str18;
        List list10;
        String str19;
        ygu0 ygu0Var2;
        zgu0 zgu0Var6;
        List list11;
        req0 req0Var;
        String str20;
        zgu0 zgu0Var7;
        String str21;
        String str22;
        CoroutineSingletons coroutineSingletons3;
        ciy ciyVar6;
        CheckoutResponse.StopsSelector stopsSelector8;
        List list12;
        List list13;
        int i10;
        boolean z5;
        int i11;
        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$16;
        ?? r6;
        frn frnVar13;
        Object obj2;
        String str23 = str;
        if (continuationImpl instanceof StopsSelectorUIMapper$mapUiState$1) {
            stopsSelectorUIMapper$mapUiState$1 = (StopsSelectorUIMapper$mapUiState$1) continuationImpl;
            int i12 = stopsSelectorUIMapper$mapUiState$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                stopsSelectorUIMapper$mapUiState$1.label = i12 - Integer.MIN_VALUE;
                Object obj3 = stopsSelectorUIMapper$mapUiState$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorUIMapper$mapUiState$1.label;
                EmptyList emptyList2 = EmptyList.a;
                eiy eiyVar3 = aiy.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj3);
                        int i13 = tog0.mt_outline_color_gray;
                        avj0 avj0Var = (avj0) this.c;
                        edc edcVar = new edc(avj0Var.a(i13), avj0Var.a(tog0.mt_outline_color_dark_gray));
                        edc edcVar2 = new edc(avj0Var.a(tog0.mt_outline_big_ellipse_color_light), avj0Var.a(tog0.mt_outline_big_ellipse_color_dark));
                        bdc bdcVar = new bdc(xng0.textMain);
                        ciyVar = new ciy(edcVar);
                        frnVar = new frn(Ellipse$Size.SMALL, new bdc(xng0.bgMain));
                        Ellipse$Size ellipse$Size = Ellipse$Size.BIG;
                        frnVar2 = new frn(ellipse$Size, edcVar2);
                        frnVar3 = new frn(ellipse$Size, bdcVar);
                        list = stopsSelector.c;
                        Iterator it4 = list.iterator();
                        i2 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i2 = -1;
                            } else if (!jl40.l(((CheckoutResponse.StopsSelector.a) it4.next()).a, str23)) {
                                i2++;
                            }
                        }
                        if (i2 != -1) {
                            eiyVar = eiyVar3;
                            CheckoutResponse.StopsSelector.a aVar = (CheckoutResponse.StopsSelector.a) kotlin.collections.a.R(list);
                            if (i2 != 0 && aVar != null) {
                                stopsSelectorUIMapper$mapUiState$1.L$0 = stopsSelector;
                                stopsSelectorUIMapper$mapUiState$1.L$1 = str23;
                                str4 = str2;
                                stopsSelectorUIMapper$mapUiState$1.L$2 = str4;
                                str5 = str3;
                                stopsSelectorUIMapper$mapUiState$1.L$3 = str5;
                                stopsSelectorUIMapper$mapUiState$1.L$4 = null;
                                stopsSelectorUIMapper$mapUiState$1.L$5 = null;
                                stopsSelectorUIMapper$mapUiState$1.L$6 = null;
                                stopsSelectorUIMapper$mapUiState$1.L$7 = null;
                                stopsSelectorUIMapper$mapUiState$1.L$8 = ciyVar;
                                stopsSelectorUIMapper$mapUiState$1.L$9 = frnVar;
                                stopsSelectorUIMapper$mapUiState$1.L$10 = frnVar2;
                                stopsSelectorUIMapper$mapUiState$1.L$11 = frnVar3;
                                stopsSelectorUIMapper$mapUiState$1.L$12 = list;
                                stopsSelectorUIMapper$mapUiState$1.L$13 = null;
                                z2 = z;
                                stopsSelectorUIMapper$mapUiState$1.Z$0 = z2;
                                stopsSelectorUIMapper$mapUiState$1.I$0 = i2;
                                stopsSelectorUIMapper$mapUiState$1.label = 3;
                                Object c = c(aVar, ciyVar, frnVar2, stopsSelectorUIMapper$mapUiState$1);
                                if (c != coroutineSingletons4) {
                                    frnVar4 = frnVar3;
                                    str7 = null;
                                    list2 = list;
                                    obj3 = c;
                                    stopsSelector2 = stopsSelector;
                                    zgu0Var = (zgu0) obj3;
                                    list = list2;
                                    emptyList = emptyList2;
                                    frnVar3 = frnVar4;
                                    str6 = str7;
                                    if (i2 > 1) {
                                    }
                                    stopsSelectorUIMapper$mapUiState$1.L$0 = stopsSelector2;
                                    stopsSelectorUIMapper$mapUiState$1.L$1 = str23;
                                    stopsSelectorUIMapper$mapUiState$1.L$2 = str4;
                                    stopsSelectorUIMapper$mapUiState$1.L$3 = str5;
                                    stopsSelectorUIMapper$mapUiState$1.L$4 = str6;
                                    stopsSelectorUIMapper$mapUiState$1.L$5 = null;
                                    stopsSelectorUIMapper$mapUiState$1.L$6 = null;
                                    stopsSelectorUIMapper$mapUiState$1.L$7 = null;
                                    stopsSelectorUIMapper$mapUiState$1.L$8 = ciyVar;
                                    stopsSelectorUIMapper$mapUiState$1.L$9 = frnVar;
                                    stopsSelectorUIMapper$mapUiState$1.L$10 = frnVar2;
                                    stopsSelectorUIMapper$mapUiState$1.L$11 = frnVar3;
                                    stopsSelectorUIMapper$mapUiState$1.L$12 = list;
                                    stopsSelectorUIMapper$mapUiState$1.L$13 = null;
                                    stopsSelectorUIMapper$mapUiState$1.L$14 = zgu0Var;
                                    stopsSelectorUIMapper$mapUiState$1.L$15 = null;
                                    stopsSelectorUIMapper$mapUiState$1.Z$0 = z2;
                                    stopsSelectorUIMapper$mapUiState$1.I$0 = i2;
                                    stopsSelectorUIMapper$mapUiState$1.label = 4;
                                    StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$17 = stopsSelectorUIMapper$mapUiState$1;
                                    a = a(r19, z2, ciyVar, ciyVar, stopsSelectorUIMapper$mapUiState$17);
                                    stopsSelectorUIMapper$mapUiState$14 = stopsSelectorUIMapper$mapUiState$17;
                                    if (a != coroutineSingletons4) {
                                    }
                                }
                                return coroutineSingletons4;
                            }
                            str4 = str2;
                            str5 = str3;
                            z2 = z;
                            stopsSelector2 = stopsSelector;
                            emptyList = emptyList2;
                            zgu0Var = null;
                            str6 = null;
                            List subList = i2 > 1 ? list.subList(1, i2) : emptyList;
                            stopsSelectorUIMapper$mapUiState$1.L$0 = stopsSelector2;
                            stopsSelectorUIMapper$mapUiState$1.L$1 = str23;
                            stopsSelectorUIMapper$mapUiState$1.L$2 = str4;
                            stopsSelectorUIMapper$mapUiState$1.L$3 = str5;
                            stopsSelectorUIMapper$mapUiState$1.L$4 = str6;
                            stopsSelectorUIMapper$mapUiState$1.L$5 = null;
                            stopsSelectorUIMapper$mapUiState$1.L$6 = null;
                            stopsSelectorUIMapper$mapUiState$1.L$7 = null;
                            stopsSelectorUIMapper$mapUiState$1.L$8 = ciyVar;
                            stopsSelectorUIMapper$mapUiState$1.L$9 = frnVar;
                            stopsSelectorUIMapper$mapUiState$1.L$10 = frnVar2;
                            stopsSelectorUIMapper$mapUiState$1.L$11 = frnVar3;
                            stopsSelectorUIMapper$mapUiState$1.L$12 = list;
                            stopsSelectorUIMapper$mapUiState$1.L$13 = null;
                            stopsSelectorUIMapper$mapUiState$1.L$14 = zgu0Var;
                            stopsSelectorUIMapper$mapUiState$1.L$15 = null;
                            stopsSelectorUIMapper$mapUiState$1.Z$0 = z2;
                            stopsSelectorUIMapper$mapUiState$1.I$0 = i2;
                            stopsSelectorUIMapper$mapUiState$1.label = 4;
                            StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$172 = stopsSelectorUIMapper$mapUiState$1;
                            a = a(subList, z2, ciyVar, ciyVar, stopsSelectorUIMapper$mapUiState$172);
                            stopsSelectorUIMapper$mapUiState$14 = stopsSelectorUIMapper$mapUiState$172;
                            if (a != coroutineSingletons4) {
                                frn frnVar14 = frnVar3;
                                zgu0Var2 = zgu0Var;
                                stopsSelector5 = stopsSelector2;
                                i7 = i2;
                                ciyVar3 = ciyVar;
                                frnVar8 = frnVar2;
                                frnVar9 = frnVar14;
                                frn frnVar15 = frnVar;
                                list5 = list;
                                obj3 = a;
                                frnVar10 = frnVar15;
                                List list14 = (List) obj3;
                                CheckoutResponse.StopsSelector.a aVar2 = (CheckoutResponse.StopsSelector.a) list5.get(i7);
                                eiy eiyVar4 = i7 != 0 ? eiyVar : ciyVar3;
                                stopsSelectorUIMapper$mapUiState$14.L$0 = stopsSelector5;
                                stopsSelectorUIMapper$mapUiState$14.L$1 = str23;
                                stopsSelectorUIMapper$mapUiState$14.L$2 = str4;
                                stopsSelectorUIMapper$mapUiState$14.L$3 = str5;
                                stopsSelectorUIMapper$mapUiState$14.L$4 = str6;
                                stopsSelector6 = stopsSelector5;
                                stopsSelectorUIMapper$mapUiState$14.L$5 = null;
                                stopsSelectorUIMapper$mapUiState$14.L$6 = null;
                                stopsSelectorUIMapper$mapUiState$14.L$7 = null;
                                stopsSelectorUIMapper$mapUiState$14.L$8 = ciyVar3;
                                stopsSelectorUIMapper$mapUiState$14.L$9 = frnVar10;
                                stopsSelectorUIMapper$mapUiState$14.L$10 = frnVar8;
                                stopsSelectorUIMapper$mapUiState$14.L$11 = null;
                                stopsSelectorUIMapper$mapUiState$14.L$12 = list5;
                                stopsSelectorUIMapper$mapUiState$14.L$13 = null;
                                stopsSelectorUIMapper$mapUiState$14.L$14 = zgu0Var2;
                                stopsSelectorUIMapper$mapUiState$14.L$15 = null;
                                stopsSelectorUIMapper$mapUiState$14.L$16 = list14;
                                stopsSelectorUIMapper$mapUiState$14.L$17 = null;
                                stopsSelectorUIMapper$mapUiState$14.Z$0 = z2;
                                stopsSelectorUIMapper$mapUiState$14.I$0 = i7;
                                stopsSelectorUIMapper$mapUiState$14.label = 5;
                                e = e(aVar2, eiyVar4, ciyVar3, frnVar9, stopsSelectorUIMapper$mapUiState$14);
                                if (e != coroutineSingletons4) {
                                    obj3 = e;
                                    zgu0Var3 = zgu0Var2;
                                    list6 = list14;
                                    str14 = str5;
                                    ciyVar4 = ciyVar3;
                                    frnVar11 = frnVar10;
                                    ygu0 ygu0Var3 = (ygu0) obj3;
                                    if (i7 >= scc.f(list5)) {
                                        zgu0Var4 = zgu0Var3;
                                        list7 = list5.subList(i7 + 1, list5.size());
                                    } else {
                                        zgu0Var4 = zgu0Var3;
                                        list7 = emptyList;
                                    }
                                    List list15 = list7;
                                    List list16 = list7;
                                    Object arrayList3 = new ArrayList(tcc.n(list15, 10));
                                    Iterator it5 = list15.iterator();
                                    StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$18 = stopsSelectorUIMapper$mapUiState$14;
                                    str15 = str23;
                                    str16 = str6;
                                    stopsSelectorUIMapper$mapUiState$15 = stopsSelectorUIMapper$mapUiState$18;
                                    i8 = i7;
                                    coroutineSingletons2 = coroutineSingletons4;
                                    frnVar12 = frnVar8;
                                    ciyVar5 = ciyVar4;
                                    i9 = 0;
                                    zgu0Var5 = zgu0Var4;
                                    list8 = list16;
                                    list9 = list6;
                                    it3 = it5;
                                    obj = arrayList3;
                                    ygu0Var = ygu0Var3;
                                    str17 = str14;
                                    stopsSelector7 = stopsSelector6;
                                    if (!it3.hasNext()) {
                                        Object next = it3.next();
                                        boolean z6 = z2;
                                        int i14 = i9 + 1;
                                        if (i9 < 0) {
                                            scc.m();
                                            throw null;
                                        }
                                        CheckoutResponse.StopsSelector.a aVar3 = (CheckoutResponse.StopsSelector.a) next;
                                        Iterator it6 = it3;
                                        eiy eiyVar5 = i9 == scc.f(list8) ? eiyVar : ciyVar5;
                                        frn frnVar16 = i9 == scc.f(list8) ? frnVar12 : frnVar11;
                                        boolean z7 = aVar3.c == CheckoutResponse.StopsSelector.StopState.UPCOMING;
                                        stopsSelectorUIMapper$mapUiState$15.L$0 = stopsSelector7;
                                        stopsSelectorUIMapper$mapUiState$15.L$1 = str15;
                                        stopsSelectorUIMapper$mapUiState$15.L$2 = str4;
                                        stopsSelectorUIMapper$mapUiState$15.L$3 = str17;
                                        stopsSelectorUIMapper$mapUiState$15.L$4 = str16;
                                        stopsSelectorUIMapper$mapUiState$15.L$5 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$6 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$7 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$8 = ciyVar5;
                                        stopsSelectorUIMapper$mapUiState$15.L$9 = frnVar11;
                                        stopsSelectorUIMapper$mapUiState$15.L$10 = frnVar12;
                                        stopsSelectorUIMapper$mapUiState$15.L$11 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$12 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$13 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$14 = zgu0Var5;
                                        stopsSelectorUIMapper$mapUiState$15.L$15 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$16 = list9;
                                        stopsSelectorUIMapper$mapUiState$15.L$17 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$18 = ygu0Var;
                                        ciy ciyVar7 = ciyVar5;
                                        List list17 = list8;
                                        stopsSelectorUIMapper$mapUiState$15.L$19 = list17;
                                        stopsSelectorUIMapper$mapUiState$15.L$20 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$21 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$22 = obj;
                                        stopsSelectorUIMapper$mapUiState$15.L$23 = it6;
                                        stopsSelectorUIMapper$mapUiState$15.L$24 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$25 = null;
                                        stopsSelectorUIMapper$mapUiState$15.L$26 = obj;
                                        stopsSelectorUIMapper$mapUiState$15.Z$0 = z6;
                                        int i15 = i8;
                                        stopsSelectorUIMapper$mapUiState$15.I$0 = i15;
                                        str20 = str15;
                                        stopsSelectorUIMapper$mapUiState$15.I$1 = i14;
                                        stopsSelectorUIMapper$mapUiState$15.I$2 = i9;
                                        stopsSelectorUIMapper$mapUiState$15.label = 6;
                                        frn frnVar17 = frnVar12;
                                        zgu0Var7 = zgu0Var5;
                                        str21 = str17;
                                        str22 = str4;
                                        String str24 = str16;
                                        Object obj4 = obj;
                                        obj3 = d(aVar3, ciyVar7, eiyVar5, frnVar16, z7, stopsSelectorUIMapper$mapUiState$15);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (obj3 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        CheckoutResponse.StopsSelector stopsSelector9 = stopsSelector7;
                                        ciyVar6 = ciyVar7;
                                        str16 = str24;
                                        stopsSelector8 = stopsSelector9;
                                        it3 = it6;
                                        list12 = list9;
                                        list13 = list17;
                                        frnVar12 = frnVar17;
                                        i10 = i15;
                                        z5 = z6;
                                        i11 = i14;
                                        stopsSelectorUIMapper$mapUiState$16 = stopsSelectorUIMapper$mapUiState$15;
                                        r6 = obj4;
                                        frnVar13 = frnVar11;
                                        obj2 = r6;
                                        r6.add((ygu0) obj3);
                                        stopsSelectorUIMapper$mapUiState$15 = stopsSelectorUIMapper$mapUiState$16;
                                        str17 = str21;
                                        ciyVar5 = ciyVar6;
                                        stopsSelector7 = stopsSelector8;
                                        obj = obj2;
                                        list8 = list13;
                                        str15 = str20;
                                        frnVar11 = frnVar13;
                                        list9 = list12;
                                        str4 = str22;
                                        i8 = i10;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        zgu0Var5 = zgu0Var7;
                                        i9 = i11;
                                        z2 = z5;
                                        if (!it3.hasNext()) {
                                            zgu0 zgu0Var8 = zgu0Var5;
                                            String str25 = str16;
                                            str18 = str17;
                                            CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                                            ArrayList arrayList4 = (List) obj;
                                            req0 req0Var2 = new req0();
                                            FormattedText formattedText = stopsSelector7.b.c;
                                            stopsSelectorUIMapper$mapUiState$15.L$0 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$1 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$2 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$3 = str18;
                                            stopsSelectorUIMapper$mapUiState$15.L$4 = str25;
                                            stopsSelectorUIMapper$mapUiState$15.L$5 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$6 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$7 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$8 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$9 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$10 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$11 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$12 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$13 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$14 = zgu0Var8;
                                            stopsSelectorUIMapper$mapUiState$15.L$15 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$16 = list9;
                                            stopsSelectorUIMapper$mapUiState$15.L$17 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$18 = ygu0Var;
                                            stopsSelectorUIMapper$mapUiState$15.L$19 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$20 = arrayList4;
                                            stopsSelectorUIMapper$mapUiState$15.L$21 = req0Var2;
                                            stopsSelectorUIMapper$mapUiState$15.L$22 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$23 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$24 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$25 = null;
                                            stopsSelectorUIMapper$mapUiState$15.L$26 = null;
                                            stopsSelectorUIMapper$mapUiState$15.Z$0 = z2;
                                            stopsSelectorUIMapper$mapUiState$15.I$0 = i8;
                                            stopsSelectorUIMapper$mapUiState$15.label = 7;
                                            Object e2 = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, stopsSelectorUIMapper$mapUiState$15, 30);
                                            if (e2 == coroutineSingletons5) {
                                                return coroutineSingletons5;
                                            }
                                            list10 = arrayList4;
                                            str19 = str25;
                                            ygu0Var2 = ygu0Var;
                                            zgu0Var6 = zgu0Var8;
                                            list11 = list9;
                                            obj3 = e2;
                                            req0Var = req0Var2;
                                            return new uiu0((CharSequence) obj3, kotlin.collections.a.m0(list10, kotlin.collections.a.m0(scc.h(ygu0Var2), kotlin.collections.a.m0(list11, scc.h(zgu0Var6)))), req0Var, str18, str19);
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons4;
                        }
                        List list18 = list;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list18, 10));
                        str8 = str23;
                        list3 = list;
                        frnVar5 = frnVar2;
                        stopsSelector3 = stopsSelector;
                        it = list18.iterator();
                        arrayList = arrayList5;
                        ciyVar2 = ciyVar;
                        i3 = i2;
                        i4 = 0;
                        str9 = str3;
                        z3 = z;
                        stopsSelectorUIMapper$mapUiState$12 = stopsSelectorUIMapper$mapUiState$1;
                        frnVar6 = frnVar;
                        str10 = str2;
                        if (it.hasNext()) {
                            Object next2 = it.next();
                            eiyVar2 = eiyVar3;
                            int i16 = i4 + 1;
                            if (i4 < 0) {
                                scc.m();
                                throw null;
                            }
                            CoroutineSingletons coroutineSingletons6 = coroutineSingletons4;
                            CheckoutResponse.StopsSelector.a aVar4 = (CheckoutResponse.StopsSelector.a) next2;
                            eiy eiyVar6 = i4 == 0 ? eiyVar2 : ciyVar2;
                            eiy eiyVar7 = i4 == scc.f(list3) ? eiyVar2 : ciyVar2;
                            frn frnVar18 = (i4 == 0 || i4 == scc.f(list3)) ? frnVar5 : frnVar6;
                            boolean z8 = aVar4.c == CheckoutResponse.StopsSelector.StopState.UPCOMING;
                            stopsSelectorUIMapper$mapUiState$12.L$0 = stopsSelector3;
                            stopsSelectorUIMapper$mapUiState$12.L$1 = str8;
                            stopsSelectorUIMapper$mapUiState$12.L$2 = str10;
                            stopsSelectorUIMapper$mapUiState$12.L$3 = str9;
                            stopsSelectorUIMapper$mapUiState$12.L$4 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$5 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$6 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$7 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$8 = ciyVar2;
                            stopsSelectorUIMapper$mapUiState$12.L$9 = frnVar6;
                            stopsSelectorUIMapper$mapUiState$12.L$10 = frnVar5;
                            stopsSelectorUIMapper$mapUiState$12.L$11 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$12 = list3;
                            stopsSelectorUIMapper$mapUiState$12.L$13 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$14 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$15 = arrayList;
                            stopsSelectorUIMapper$mapUiState$12.L$16 = it;
                            stopsSelectorUIMapper$mapUiState$12.L$17 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$18 = null;
                            stopsSelectorUIMapper$mapUiState$12.L$19 = arrayList;
                            stopsSelectorUIMapper$mapUiState$12.Z$0 = z3;
                            stopsSelectorUIMapper$mapUiState$12.I$0 = i3;
                            i5 = i16;
                            stopsSelectorUIMapper$mapUiState$12.I$1 = i5;
                            stopsSelectorUIMapper$mapUiState$12.I$2 = i4;
                            stopsSelectorUIMapper$mapUiState$12.label = 1;
                            List list19 = list3;
                            frn frnVar19 = frnVar5;
                            frn frnVar20 = frnVar6;
                            ciy ciyVar8 = ciyVar2;
                            boolean z9 = z8;
                            it2 = it;
                            obj3 = d(aVar4, eiyVar6, eiyVar7, frnVar18, z9, stopsSelectorUIMapper$mapUiState$12);
                            coroutineSingletons = coroutineSingletons6;
                            if (obj3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            arrayList2 = arrayList;
                            ciyVar2 = ciyVar8;
                            frnVar6 = frnVar20;
                            list3 = list19;
                            str11 = str9;
                            i6 = i3;
                            frnVar7 = frnVar19;
                            z4 = z3;
                            str12 = str10;
                            str13 = str8;
                            stopsSelector4 = stopsSelector3;
                            stopsSelectorUIMapper$mapUiState$13 = stopsSelectorUIMapper$mapUiState$12;
                            collection = arrayList2;
                            collection.add((ygu0) obj3);
                            Iterator it7 = it2;
                            coroutineSingletons4 = coroutineSingletons;
                            it = it7;
                            stopsSelectorUIMapper$mapUiState$12 = stopsSelectorUIMapper$mapUiState$13;
                            stopsSelector3 = stopsSelector4;
                            i4 = i5;
                            str8 = str13;
                            frnVar5 = frnVar7;
                            str10 = str12;
                            z3 = z4;
                            str9 = str11;
                            i3 = i6;
                            eiyVar3 = eiyVar2;
                            arrayList = arrayList2;
                            if (it.hasNext()) {
                                CoroutineSingletons coroutineSingletons7 = coroutineSingletons4;
                                ArrayList arrayList6 = arrayList;
                                FormattedText formattedText2 = stopsSelector3.b.c;
                                stopsSelectorUIMapper$mapUiState$12.L$0 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$1 = str8;
                                stopsSelectorUIMapper$mapUiState$12.L$2 = str10;
                                stopsSelectorUIMapper$mapUiState$12.L$3 = str9;
                                stopsSelectorUIMapper$mapUiState$12.L$4 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$5 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$6 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$7 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$8 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$9 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$10 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$11 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$12 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$13 = arrayList6;
                                stopsSelectorUIMapper$mapUiState$12.L$14 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$15 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$16 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$17 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$18 = null;
                                stopsSelectorUIMapper$mapUiState$12.L$19 = null;
                                stopsSelectorUIMapper$mapUiState$12.Z$0 = z3;
                                stopsSelectorUIMapper$mapUiState$12.I$0 = i3;
                                stopsSelectorUIMapper$mapUiState$12.label = 2;
                                obj3 = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, stopsSelectorUIMapper$mapUiState$12, 30);
                                if (obj3 == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                                list4 = arrayList6;
                                return new uiu0((CharSequence) obj3, list4, new req0(), 24);
                            }
                        }
                        break;
                    case 1:
                        int i17 = stopsSelectorUIMapper$mapUiState$1.I$1;
                        int i18 = stopsSelectorUIMapper$mapUiState$1.I$0;
                        boolean z10 = stopsSelectorUIMapper$mapUiState$1.Z$0;
                        collection = (Collection) stopsSelectorUIMapper$mapUiState$1.L$19;
                        Iterator it8 = (Iterator) stopsSelectorUIMapper$mapUiState$1.L$16;
                        ?? r9 = (Collection) stopsSelectorUIMapper$mapUiState$1.L$15;
                        List list20 = (List) stopsSelectorUIMapper$mapUiState$1.L$12;
                        frnVar7 = (frn) stopsSelectorUIMapper$mapUiState$1.L$10;
                        frn frnVar21 = (frn) stopsSelectorUIMapper$mapUiState$1.L$9;
                        ciy ciyVar9 = (ciy) stopsSelectorUIMapper$mapUiState$1.L$8;
                        str11 = (String) stopsSelectorUIMapper$mapUiState$1.L$3;
                        String str26 = (String) stopsSelectorUIMapper$mapUiState$1.L$2;
                        String str27 = (String) stopsSelectorUIMapper$mapUiState$1.L$1;
                        CheckoutResponse.StopsSelector stopsSelector10 = (CheckoutResponse.StopsSelector) stopsSelectorUIMapper$mapUiState$1.L$0;
                        kotlin.b.b(obj3);
                        z4 = z10;
                        ciyVar2 = ciyVar9;
                        arrayList2 = r9;
                        eiyVar2 = eiyVar3;
                        i5 = i17;
                        stopsSelector4 = stopsSelector10;
                        i6 = i18;
                        coroutineSingletons = coroutineSingletons4;
                        it2 = it8;
                        list3 = list20;
                        str13 = str27;
                        stopsSelectorUIMapper$mapUiState$13 = stopsSelectorUIMapper$mapUiState$1;
                        frnVar6 = frnVar21;
                        str12 = str26;
                        collection.add((ygu0) obj3);
                        Iterator it72 = it2;
                        coroutineSingletons4 = coroutineSingletons;
                        it = it72;
                        stopsSelectorUIMapper$mapUiState$12 = stopsSelectorUIMapper$mapUiState$13;
                        stopsSelector3 = stopsSelector4;
                        i4 = i5;
                        str8 = str13;
                        frnVar5 = frnVar7;
                        str10 = str12;
                        z3 = z4;
                        str9 = str11;
                        i3 = i6;
                        eiyVar3 = eiyVar2;
                        arrayList = arrayList2;
                        if (it.hasNext()) {
                        }
                        break;
                    case 2:
                        list4 = (List) stopsSelectorUIMapper$mapUiState$1.L$13;
                        kotlin.b.b(obj3);
                        return new uiu0((CharSequence) obj3, list4, new req0(), 24);
                    case 3:
                        int i19 = stopsSelectorUIMapper$mapUiState$1.I$0;
                        boolean z11 = stopsSelectorUIMapper$mapUiState$1.Z$0;
                        list2 = (List) stopsSelectorUIMapper$mapUiState$1.L$12;
                        frnVar4 = (frn) stopsSelectorUIMapper$mapUiState$1.L$11;
                        frnVar2 = (frn) stopsSelectorUIMapper$mapUiState$1.L$10;
                        frnVar = (frn) stopsSelectorUIMapper$mapUiState$1.L$9;
                        ciyVar = (ciy) stopsSelectorUIMapper$mapUiState$1.L$8;
                        String str28 = (String) stopsSelectorUIMapper$mapUiState$1.L$4;
                        str5 = (String) stopsSelectorUIMapper$mapUiState$1.L$3;
                        String str29 = (String) stopsSelectorUIMapper$mapUiState$1.L$2;
                        String str30 = (String) stopsSelectorUIMapper$mapUiState$1.L$1;
                        stopsSelector2 = (CheckoutResponse.StopsSelector) stopsSelectorUIMapper$mapUiState$1.L$0;
                        kotlin.b.b(obj3);
                        eiyVar = eiyVar3;
                        str7 = str28;
                        str4 = str29;
                        i2 = i19;
                        z2 = z11;
                        str23 = str30;
                        zgu0Var = (zgu0) obj3;
                        list = list2;
                        emptyList = emptyList2;
                        frnVar3 = frnVar4;
                        str6 = str7;
                        if (i2 > 1) {
                        }
                        stopsSelectorUIMapper$mapUiState$1.L$0 = stopsSelector2;
                        stopsSelectorUIMapper$mapUiState$1.L$1 = str23;
                        stopsSelectorUIMapper$mapUiState$1.L$2 = str4;
                        stopsSelectorUIMapper$mapUiState$1.L$3 = str5;
                        stopsSelectorUIMapper$mapUiState$1.L$4 = str6;
                        stopsSelectorUIMapper$mapUiState$1.L$5 = null;
                        stopsSelectorUIMapper$mapUiState$1.L$6 = null;
                        stopsSelectorUIMapper$mapUiState$1.L$7 = null;
                        stopsSelectorUIMapper$mapUiState$1.L$8 = ciyVar;
                        stopsSelectorUIMapper$mapUiState$1.L$9 = frnVar;
                        stopsSelectorUIMapper$mapUiState$1.L$10 = frnVar2;
                        stopsSelectorUIMapper$mapUiState$1.L$11 = frnVar3;
                        stopsSelectorUIMapper$mapUiState$1.L$12 = list;
                        stopsSelectorUIMapper$mapUiState$1.L$13 = null;
                        stopsSelectorUIMapper$mapUiState$1.L$14 = zgu0Var;
                        stopsSelectorUIMapper$mapUiState$1.L$15 = null;
                        stopsSelectorUIMapper$mapUiState$1.Z$0 = z2;
                        stopsSelectorUIMapper$mapUiState$1.I$0 = i2;
                        stopsSelectorUIMapper$mapUiState$1.label = 4;
                        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$1722 = stopsSelectorUIMapper$mapUiState$1;
                        a = a(subList, z2, ciyVar, ciyVar, stopsSelectorUIMapper$mapUiState$1722);
                        stopsSelectorUIMapper$mapUiState$14 = stopsSelectorUIMapper$mapUiState$1722;
                        if (a != coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    case 4:
                        int i20 = stopsSelectorUIMapper$mapUiState$1.I$0;
                        boolean z12 = stopsSelectorUIMapper$mapUiState$1.Z$0;
                        zgu0Var2 = (zgu0) stopsSelectorUIMapper$mapUiState$1.L$14;
                        List list21 = (List) stopsSelectorUIMapper$mapUiState$1.L$12;
                        frnVar9 = (frn) stopsSelectorUIMapper$mapUiState$1.L$11;
                        frn frnVar22 = (frn) stopsSelectorUIMapper$mapUiState$1.L$10;
                        frn frnVar23 = (frn) stopsSelectorUIMapper$mapUiState$1.L$9;
                        ciyVar3 = (ciy) stopsSelectorUIMapper$mapUiState$1.L$8;
                        String str31 = (String) stopsSelectorUIMapper$mapUiState$1.L$4;
                        String str32 = (String) stopsSelectorUIMapper$mapUiState$1.L$3;
                        String str33 = (String) stopsSelectorUIMapper$mapUiState$1.L$2;
                        String str34 = (String) stopsSelectorUIMapper$mapUiState$1.L$1;
                        CheckoutResponse.StopsSelector stopsSelector11 = (CheckoutResponse.StopsSelector) stopsSelectorUIMapper$mapUiState$1.L$0;
                        kotlin.b.b(obj3);
                        stopsSelectorUIMapper$mapUiState$14 = stopsSelectorUIMapper$mapUiState$1;
                        frnVar10 = frnVar23;
                        frnVar8 = frnVar22;
                        list5 = list21;
                        stopsSelector5 = stopsSelector11;
                        emptyList = emptyList2;
                        eiyVar = eiyVar3;
                        str6 = str31;
                        str5 = str32;
                        i7 = i20;
                        str4 = str33;
                        z2 = z12;
                        str23 = str34;
                        List list142 = (List) obj3;
                        CheckoutResponse.StopsSelector.a aVar22 = (CheckoutResponse.StopsSelector.a) list5.get(i7);
                        if (i7 != 0) {
                        }
                        stopsSelectorUIMapper$mapUiState$14.L$0 = stopsSelector5;
                        stopsSelectorUIMapper$mapUiState$14.L$1 = str23;
                        stopsSelectorUIMapper$mapUiState$14.L$2 = str4;
                        stopsSelectorUIMapper$mapUiState$14.L$3 = str5;
                        stopsSelectorUIMapper$mapUiState$14.L$4 = str6;
                        stopsSelector6 = stopsSelector5;
                        stopsSelectorUIMapper$mapUiState$14.L$5 = null;
                        stopsSelectorUIMapper$mapUiState$14.L$6 = null;
                        stopsSelectorUIMapper$mapUiState$14.L$7 = null;
                        stopsSelectorUIMapper$mapUiState$14.L$8 = ciyVar3;
                        stopsSelectorUIMapper$mapUiState$14.L$9 = frnVar10;
                        stopsSelectorUIMapper$mapUiState$14.L$10 = frnVar8;
                        stopsSelectorUIMapper$mapUiState$14.L$11 = null;
                        stopsSelectorUIMapper$mapUiState$14.L$12 = list5;
                        stopsSelectorUIMapper$mapUiState$14.L$13 = null;
                        stopsSelectorUIMapper$mapUiState$14.L$14 = zgu0Var2;
                        stopsSelectorUIMapper$mapUiState$14.L$15 = null;
                        stopsSelectorUIMapper$mapUiState$14.L$16 = list142;
                        stopsSelectorUIMapper$mapUiState$14.L$17 = null;
                        stopsSelectorUIMapper$mapUiState$14.Z$0 = z2;
                        stopsSelectorUIMapper$mapUiState$14.I$0 = i7;
                        stopsSelectorUIMapper$mapUiState$14.label = 5;
                        e = e(aVar22, eiyVar4, ciyVar3, frnVar9, stopsSelectorUIMapper$mapUiState$14);
                        if (e != coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    case 5:
                        int i21 = stopsSelectorUIMapper$mapUiState$1.I$0;
                        boolean z13 = stopsSelectorUIMapper$mapUiState$1.Z$0;
                        list6 = (List) stopsSelectorUIMapper$mapUiState$1.L$16;
                        zgu0 zgu0Var9 = (zgu0) stopsSelectorUIMapper$mapUiState$1.L$14;
                        list5 = (List) stopsSelectorUIMapper$mapUiState$1.L$12;
                        frnVar8 = (frn) stopsSelectorUIMapper$mapUiState$1.L$10;
                        frnVar11 = (frn) stopsSelectorUIMapper$mapUiState$1.L$9;
                        ciyVar4 = (ciy) stopsSelectorUIMapper$mapUiState$1.L$8;
                        String str35 = (String) stopsSelectorUIMapper$mapUiState$1.L$4;
                        str14 = (String) stopsSelectorUIMapper$mapUiState$1.L$3;
                        String str36 = (String) stopsSelectorUIMapper$mapUiState$1.L$2;
                        String str37 = (String) stopsSelectorUIMapper$mapUiState$1.L$1;
                        CheckoutResponse.StopsSelector stopsSelector12 = (CheckoutResponse.StopsSelector) stopsSelectorUIMapper$mapUiState$1.L$0;
                        kotlin.b.b(obj3);
                        stopsSelector6 = stopsSelector12;
                        emptyList = emptyList2;
                        zgu0Var3 = zgu0Var9;
                        eiyVar = eiyVar3;
                        str6 = str35;
                        i7 = i21;
                        str4 = str36;
                        z2 = z13;
                        stopsSelectorUIMapper$mapUiState$14 = stopsSelectorUIMapper$mapUiState$1;
                        str23 = str37;
                        ygu0 ygu0Var32 = (ygu0) obj3;
                        if (i7 >= scc.f(list5)) {
                        }
                        List list152 = list7;
                        List list162 = list7;
                        Object arrayList32 = new ArrayList(tcc.n(list152, 10));
                        Iterator it52 = list152.iterator();
                        StopsSelectorUIMapper$mapUiState$1 stopsSelectorUIMapper$mapUiState$182 = stopsSelectorUIMapper$mapUiState$14;
                        str15 = str23;
                        str16 = str6;
                        stopsSelectorUIMapper$mapUiState$15 = stopsSelectorUIMapper$mapUiState$182;
                        i8 = i7;
                        coroutineSingletons2 = coroutineSingletons4;
                        frnVar12 = frnVar8;
                        ciyVar5 = ciyVar4;
                        i9 = 0;
                        zgu0Var5 = zgu0Var4;
                        list8 = list162;
                        list9 = list6;
                        it3 = it52;
                        obj = arrayList32;
                        ygu0Var = ygu0Var32;
                        str17 = str14;
                        stopsSelector7 = stopsSelector6;
                        if (!it3.hasNext()) {
                        }
                        break;
                    case 6:
                        int i22 = stopsSelectorUIMapper$mapUiState$1.I$1;
                        int i23 = stopsSelectorUIMapper$mapUiState$1.I$0;
                        boolean z14 = stopsSelectorUIMapper$mapUiState$1.Z$0;
                        r6 = (Collection) stopsSelectorUIMapper$mapUiState$1.L$26;
                        Iterator it9 = (Iterator) stopsSelectorUIMapper$mapUiState$1.L$23;
                        Object obj5 = (Collection) stopsSelectorUIMapper$mapUiState$1.L$22;
                        list13 = (List) stopsSelectorUIMapper$mapUiState$1.L$19;
                        ygu0 ygu0Var4 = (ygu0) stopsSelectorUIMapper$mapUiState$1.L$18;
                        List list22 = (List) stopsSelectorUIMapper$mapUiState$1.L$16;
                        zgu0Var7 = (zgu0) stopsSelectorUIMapper$mapUiState$1.L$14;
                        frn frnVar24 = (frn) stopsSelectorUIMapper$mapUiState$1.L$10;
                        frn frnVar25 = (frn) stopsSelectorUIMapper$mapUiState$1.L$9;
                        ciy ciyVar10 = (ciy) stopsSelectorUIMapper$mapUiState$1.L$8;
                        String str38 = (String) stopsSelectorUIMapper$mapUiState$1.L$4;
                        String str39 = (String) stopsSelectorUIMapper$mapUiState$1.L$3;
                        String str40 = (String) stopsSelectorUIMapper$mapUiState$1.L$2;
                        String str41 = (String) stopsSelectorUIMapper$mapUiState$1.L$1;
                        CheckoutResponse.StopsSelector stopsSelector13 = (CheckoutResponse.StopsSelector) stopsSelectorUIMapper$mapUiState$1.L$0;
                        kotlin.b.b(obj3);
                        str22 = str40;
                        i10 = i23;
                        z5 = z14;
                        it3 = it9;
                        eiyVar = eiyVar3;
                        list12 = list22;
                        ygu0Var = ygu0Var4;
                        str20 = str41;
                        i11 = i22;
                        frnVar13 = frnVar25;
                        ciyVar6 = ciyVar10;
                        str16 = str38;
                        stopsSelector8 = stopsSelector13;
                        coroutineSingletons3 = coroutineSingletons4;
                        stopsSelectorUIMapper$mapUiState$16 = stopsSelectorUIMapper$mapUiState$1;
                        frnVar12 = frnVar24;
                        str21 = str39;
                        obj2 = obj5;
                        r6.add((ygu0) obj3);
                        stopsSelectorUIMapper$mapUiState$15 = stopsSelectorUIMapper$mapUiState$16;
                        str17 = str21;
                        ciyVar5 = ciyVar6;
                        stopsSelector7 = stopsSelector8;
                        obj = obj2;
                        list8 = list13;
                        str15 = str20;
                        frnVar11 = frnVar13;
                        list9 = list12;
                        str4 = str22;
                        i8 = i10;
                        coroutineSingletons2 = coroutineSingletons3;
                        zgu0Var5 = zgu0Var7;
                        i9 = i11;
                        z2 = z5;
                        if (!it3.hasNext()) {
                        }
                        break;
                    case 7:
                        req0Var = (req0) stopsSelectorUIMapper$mapUiState$1.L$21;
                        list10 = (List) stopsSelectorUIMapper$mapUiState$1.L$20;
                        ygu0Var2 = (ygu0) stopsSelectorUIMapper$mapUiState$1.L$18;
                        list11 = (List) stopsSelectorUIMapper$mapUiState$1.L$16;
                        zgu0Var6 = (zgu0) stopsSelectorUIMapper$mapUiState$1.L$14;
                        str19 = (String) stopsSelectorUIMapper$mapUiState$1.L$4;
                        str18 = (String) stopsSelectorUIMapper$mapUiState$1.L$3;
                        kotlin.b.b(obj3);
                        return new uiu0((CharSequence) obj3, kotlin.collections.a.m0(list10, kotlin.collections.a.m0(scc.h(ygu0Var2), kotlin.collections.a.m0(list11, scc.h(zgu0Var6)))), req0Var, str18, str19);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        stopsSelectorUIMapper$mapUiState$1 = new StopsSelectorUIMapper$mapUiState$1(this, continuationImpl);
        Object obj32 = stopsSelectorUIMapper$mapUiState$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorUIMapper$mapUiState$1.label;
        EmptyList emptyList22 = EmptyList.a;
        eiy eiyVar32 = aiy.a;
        switch (i) {
        }
    }
}
