package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data;

import com.yandex.delivery.mapper.model.OrderDetailsFormFieldType;
import defpackage.a5v;
import defpackage.bce;
import defpackage.bfe0;
import defpackage.bgc;
import defpackage.bxl;
import defpackage.cfe0;
import defpackage.cyq;
import defpackage.d41;
import defpackage.dfe0;
import defpackage.dlb0;
import defpackage.dyq;
import defpackage.e0l0;
import defpackage.efe0;
import defpackage.ems;
import defpackage.erv;
import defpackage.eyq;
import defpackage.ffe0;
import defpackage.fyq;
import defpackage.gts0;
import defpackage.gyq;
import defpackage.hj0;
import defpackage.j17;
import defpackage.lvi0;
import defpackage.mkb0;
import defpackage.mvg;
import defpackage.nae;
import defpackage.ny61;
import defpackage.oiz0;
import defpackage.oo0;
import defpackage.ot0;
import defpackage.ow91;
import defpackage.qv0;
import defpackage.rgb0;
import defpackage.s9e;
import defpackage.scc;
import defpackage.sls;
import defpackage.t8j;
import defpackage.tcc;
import defpackage.tj51;
import defpackage.txq;
import defpackage.uj51;
import defpackage.v4v;
import defpackage.vee0;
import defpackage.wa31;
import defpackage.wee0;
import defpackage.x7l0;
import defpackage.xee0;
import defpackage.xun;
import defpackage.y4v;
import defpackage.zee0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;
import ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\u0002H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Le0l0;", "routePoints", "", "isEditing", "imageUploading", "", "", "", "editOptions", "<unused var>", "Lot0;", "<anonymous>", "(Le0l0;ZZLjava/util/Map;Z)Lot0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.EditOrderScreenStateRepositoryImpl$screenStateFlow$2", f = "EditOrderScreenStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditOrderScreenStateRepositoryImpl$screenStateFlow$2 extends SuspendLambda implements ems {
    final /* synthetic */ efe0 $detailsLayout;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderScreenStateRepositoryImpl$screenStateFlow$2(c cVar, efe0 efe0Var, Continuation continuation) {
        super(6, continuation);
        this.this$0 = cVar;
        this.$detailsLayout = efe0Var;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        ((Boolean) obj5).booleanValue();
        EditOrderScreenStateRepositoryImpl$screenStateFlow$2 editOrderScreenStateRepositoryImpl$screenStateFlow$2 = new EditOrderScreenStateRepositoryImpl$screenStateFlow$2(this.this$0, this.$detailsLayout, (Continuation) obj6);
        editOrderScreenStateRepositoryImpl$screenStateFlow$2.L$0 = (e0l0) obj;
        editOrderScreenStateRepositoryImpl$screenStateFlow$2.Z$0 = booleanValue;
        editOrderScreenStateRepositoryImpl$screenStateFlow$2.Z$1 = booleanValue2;
        editOrderScreenStateRepositoryImpl$screenStateFlow$2.L$1 = (Map) obj4;
        return editOrderScreenStateRepositoryImpl$screenStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b0  */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bfe0 bfe0Var;
        bfe0 bfe0Var2;
        bfe0 bfe0Var3;
        bfe0 bfe0Var4;
        bfe0 bfe0Var5;
        bfe0 bfe0Var6;
        bfe0 bfe0Var7;
        String str;
        boolean z;
        boolean z2;
        x7l0 x7l0Var;
        boolean z3;
        bfe0 bfe0Var8;
        bfe0 bfe0Var9;
        bfe0 bfe0Var10;
        bfe0 bfe0Var11;
        bfe0 bfe0Var12;
        bfe0 bfe0Var13;
        bfe0 bfe0Var14;
        ArrayList arrayList;
        cfe0 cfe0Var;
        cfe0 cfe0Var2;
        bfe0 bfe0Var15;
        e0l0 e0l0Var;
        dfe0 dfe0Var;
        String str2;
        oiz0 oiz0Var;
        String str3;
        v4v lvi0Var;
        rgb0 rgb0Var;
        boolean z4;
        e0l0 e0l0Var2;
        wa31 wa31Var;
        wee0 wee0Var;
        bfe0 bfe0Var16;
        e0l0 e0l0Var3 = (e0l0) this.L$0;
        boolean z5 = this.Z$0;
        boolean z6 = this.Z$1;
        Map map = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final c cVar = this.this$0;
        efe0 efe0Var = this.$detailsLayout;
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        dfe0 dfe0Var2 = efe0Var.g;
        cfe0 cfe0Var3 = efe0Var.c;
        cfe0 cfe0Var4 = efe0Var.b;
        List list = e0l0Var3.a;
        ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            dyq dyqVar = dyq.a;
            cyq cyqVar = cyq.a;
            fyq fyqVar = fyq.a;
            eyq eyqVar = eyq.a;
            gyq gyqVar = gyq.a;
            ow91 ow91Var = uj51.b;
            if (!hasNext) {
                boolean z7 = z5;
                boolean z8 = z6;
                Map map2 = map;
                arrayList2.addAll(arrayList3);
                List list2 = efe0Var.d;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            bfe0Var14 = 0;
                            break;
                        }
                        bfe0Var14 = it2.next();
                        if (((bfe0) bfe0Var14).getType() == OrderDetailsFormFieldType.ADDRESS) {
                            break;
                        }
                    }
                    bfe0Var = bfe0Var14;
                } else {
                    bfe0Var = null;
                }
                xee0 xee0Var = bfe0Var instanceof xee0 ? (xee0) bfe0Var : null;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            bfe0Var13 = 0;
                            break;
                        }
                        bfe0Var13 = it3.next();
                        if (((bfe0) bfe0Var13).getType() == OrderDetailsFormFieldType.ENTRANCE) {
                            break;
                        }
                    }
                    bfe0Var2 = bfe0Var13;
                } else {
                    bfe0Var2 = null;
                }
                xee0 xee0Var2 = bfe0Var2 instanceof xee0 ? (xee0) bfe0Var2 : null;
                if (list2 != null) {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            bfe0Var12 = 0;
                            break;
                        }
                        bfe0Var12 = it4.next();
                        if (((bfe0) bfe0Var12).getType() == OrderDetailsFormFieldType.DOOR_PHONE) {
                            break;
                        }
                    }
                    bfe0Var3 = bfe0Var12;
                } else {
                    bfe0Var3 = null;
                }
                xee0 xee0Var3 = bfe0Var3 instanceof xee0 ? (xee0) bfe0Var3 : null;
                if (list2 != null) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            bfe0Var11 = 0;
                            break;
                        }
                        bfe0Var11 = it5.next();
                        if (((bfe0) bfe0Var11).getType() == OrderDetailsFormFieldType.FLOOR) {
                            break;
                        }
                    }
                    bfe0Var4 = bfe0Var11;
                } else {
                    bfe0Var4 = null;
                }
                xee0 xee0Var4 = bfe0Var4 instanceof xee0 ? (xee0) bfe0Var4 : null;
                if (list2 != null) {
                    Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            bfe0Var10 = 0;
                            break;
                        }
                        bfe0Var10 = it6.next();
                        if (((bfe0) bfe0Var10).getType() == OrderDetailsFormFieldType.APARTMENT) {
                            break;
                        }
                    }
                    bfe0Var5 = bfe0Var10;
                } else {
                    bfe0Var5 = null;
                }
                xee0 xee0Var5 = bfe0Var5 instanceof xee0 ? (xee0) bfe0Var5 : null;
                if (list2 != null) {
                    Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            bfe0Var9 = 0;
                            break;
                        }
                        bfe0Var9 = it7.next();
                        if (((bfe0) bfe0Var9).getType() == OrderDetailsFormFieldType.COMMENT) {
                            break;
                        }
                    }
                    bfe0Var6 = bfe0Var9;
                } else {
                    bfe0Var6 = null;
                }
                xee0 xee0Var6 = bfe0Var6 instanceof xee0 ? (xee0) bfe0Var6 : null;
                if (list2 != null) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            bfe0Var8 = 0;
                            break;
                        }
                        bfe0Var8 = it8.next();
                        if (((bfe0) bfe0Var8).getType() == OrderDetailsFormFieldType.CONTACT) {
                            break;
                        }
                    }
                    bfe0Var7 = bfe0Var8;
                } else {
                    bfe0Var7 = null;
                }
                zee0 zee0Var = bfe0Var7 instanceof zee0 ? (zee0) bfe0Var7 : null;
                Object obj2 = map2.get(zee0Var != null ? zee0Var.f : null);
                if (obj2 == null || (str = obj2.toString()) == null) {
                    str = zee0Var != null ? zee0Var.e : null;
                    if (str == null) {
                        str = "";
                    }
                }
                if (list2 != null) {
                    String str4 = xee0Var != null ? xee0Var.c : null;
                    z2 = false;
                    d41 d41Var = new d41(str4 == null ? "" : str4, c.d(xee0Var, map2), ow91Var, new gts0(new y4v(new xun(0), null, null)), false, xee0Var != null && xee0Var.b, c.e(xee0Var), false, 128);
                    String str5 = xee0Var2 != null ? xee0Var2.c : null;
                    txq txqVar = new txq(gyqVar, str5 == null ? "" : str5, c.d(xee0Var2, map2), null, null, c.e(xee0Var2), xee0Var2 != null && xee0Var2.b, null, xee0Var2 != null ? xee0Var2.e : null, 152);
                    String str6 = xee0Var3 != null ? xee0Var3.c : null;
                    txq txqVar2 = new txq(eyqVar, str6 == null ? "" : str6, c.d(xee0Var3, map2), null, null, c.e(xee0Var3), xee0Var3 != null && xee0Var3.b, null, xee0Var3 != null ? xee0Var3.e : null, 152);
                    String str7 = xee0Var4 != null ? xee0Var4.c : null;
                    txq txqVar3 = new txq(fyqVar, str7 == null ? "" : str7, c.d(xee0Var4, map2), null, null, c.e(xee0Var4), xee0Var4 != null && xee0Var4.b, null, xee0Var4 != null ? xee0Var4.e : null, 152);
                    String str8 = xee0Var5 != null ? xee0Var5.c : null;
                    txq txqVar4 = new txq(cyqVar, str8 == null ? "" : str8, c.d(xee0Var5, map2), null, null, c.e(xee0Var5), xee0Var5 != null && xee0Var5.b, null, xee0Var5 != null ? xee0Var5.e : null, 152);
                    String str9 = xee0Var6 != null ? xee0Var6.c : null;
                    txq txqVar5 = new txq(dyqVar, str9 == null ? "" : str9, c.d(xee0Var6, map2), null, null, c.e(xee0Var6), xee0Var6 != null && xee0Var6.b, null, xee0Var6 != null ? xee0Var6.e : null, 152);
                    String str10 = zee0Var != null ? zee0Var.b : null;
                    String str11 = str10 == null ? "" : str10;
                    FieldVisibility e = c.e(zee0Var);
                    String str12 = zee0Var != null ? zee0Var.f : null;
                    bce c = c.c(zee0Var, str);
                    if (zee0Var != null) {
                        z = true;
                        if (zee0Var.c) {
                            z3 = true;
                            x7l0Var = new x7l0(Integer.MAX_VALUE, null, d41Var, null, txqVar, txqVar2, txqVar4, txqVar5, txqVar3, new nae(str11, str, e, str12, c, !z3), null, !z7, null, null, false, null, null, 114696);
                        }
                    } else {
                        z = true;
                    }
                    z3 = false;
                    x7l0Var = new x7l0(Integer.MAX_VALUE, null, d41Var, null, txqVar, txqVar2, txqVar4, txqVar5, txqVar3, new nae(str11, str, e, str12, c, !z3), null, !z7, null, null, false, null, null, 114696);
                } else {
                    z = true;
                    z2 = false;
                    x7l0Var = null;
                }
                if (x7l0Var != null) {
                    arrayList2.add(x7l0Var);
                }
                c cVar2 = this.this$0;
                efe0 efe0Var2 = this.$detailsLayout;
                cVar2.getClass();
                vee0 vee0Var = efe0Var2.e;
                String str13 = vee0Var != null ? vee0Var.a : null;
                if (str13 == null) {
                    str13 = "";
                }
                boolean z9 = (z7 || z8) ? z : z2;
                if (!z7 && !z8) {
                    z2 = z;
                }
                return new ot0(null, null, null, arrayList2, new j17(str13, z9, z2), null, AddressDetailsState.READY, null, kotlin.collections.b.f(), null, null, null);
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            final int i3 = 1;
            qv0 qv0Var = (qv0) next;
            boolean z10 = i == 0;
            boolean z11 = z5;
            xee0 b = c.b(efe0Var, OrderDetailsFormFieldType.ADDRESS, z10);
            boolean z12 = z6;
            xee0 b2 = c.b(efe0Var, OrderDetailsFormFieldType.ENTRANCE, z10);
            Iterator it9 = it;
            xee0 b3 = c.b(efe0Var, OrderDetailsFormFieldType.APARTMENT, z10);
            xee0 b4 = c.b(efe0Var, OrderDetailsFormFieldType.FLOOR, z10);
            Map map3 = map;
            xee0 b5 = c.b(efe0Var, OrderDetailsFormFieldType.DOOR_PHONE, z10);
            ArrayList arrayList4 = arrayList2;
            xee0 b6 = c.b(efe0Var, OrderDetailsFormFieldType.COMMENT, z10);
            boolean z13 = z10;
            if (z10) {
                if (cfe0Var4 != null) {
                    arrayList = cfe0Var4.b;
                }
                arrayList = null;
            } else {
                if (cfe0Var3 != null) {
                    arrayList = cfe0Var3.b;
                }
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        cfe0Var = cfe0Var3;
                        cfe0Var2 = cfe0Var4;
                        bfe0Var16 = 0;
                        break;
                    }
                    bfe0Var16 = it10.next();
                    cfe0Var = cfe0Var3;
                    cfe0Var2 = cfe0Var4;
                    if (((bfe0) bfe0Var16).getType() == OrderDetailsFormFieldType.CONTACT) {
                        break;
                    }
                    cfe0Var3 = cfe0Var;
                    cfe0Var4 = cfe0Var2;
                }
                bfe0Var15 = bfe0Var16;
            } else {
                cfe0Var = cfe0Var3;
                cfe0Var2 = cfe0Var4;
                bfe0Var15 = null;
            }
            zee0 zee0Var2 = bfe0Var15 instanceof zee0 ? (zee0) bfe0Var15 : null;
            String str14 = b != null ? b.c : null;
            if (str14 == null) {
                str14 = "";
            }
            oo0 oo0Var = qv0Var.a;
            String str15 = str14;
            List list3 = qv0Var.h;
            ArrayList arrayList5 = arrayList3;
            s9e s9eVar = qv0Var.g;
            String str16 = oo0Var != null ? oo0Var.a : null;
            String str17 = str16 == null ? "" : str16;
            String str18 = s9eVar.a;
            if (str18.length() == 0) {
                str18 = s9eVar.b;
            }
            if (i != 0 || (wee0Var = efe0Var.a) == null) {
                e0l0Var = e0l0Var3;
                dfe0Var = dfe0Var2;
                str2 = "";
                oiz0Var = null;
            } else {
                dfe0Var = dfe0Var2;
                e0l0Var = e0l0Var3;
                str2 = "";
                oiz0Var = new oiz0(wee0Var.a, wee0Var.b);
            }
            String str19 = str17.length() == 0 ? str15 : str17;
            String str20 = str15.length() == 0 ? null : str15;
            if (str17.length() != 0) {
                ow91Var = tj51.b;
            }
            ow91 ow91Var2 = ow91Var;
            String str21 = str2;
            cfe0 cfe0Var5 = z13 ? cfe0Var2 : cfe0Var;
            if (cfe0Var5 == null) {
                str3 = str18;
                lvi0Var = new xun(0);
            } else {
                str3 = str18;
                lvi0Var = new lvi0(cVar.c.a(cfe0Var5.a), null, null, null, null, 62);
            }
            zee0 zee0Var3 = zee0Var2;
            d41 d41Var2 = new d41(str19, str20, ow91Var2, new gts0(new y4v(lvi0Var, new a5v(), null)), false, b != null ? b.b : false, c.e(b), false, 128);
            String str22 = b2 != null ? b2.c : null;
            txq txqVar6 = new txq(gyqVar, str22 == null ? str21 : str22, qv0Var.b, null, null, c.e(b2), b2 != null ? b2.b : false, null, b2 != null ? b2.e : null, 152);
            String str23 = b5 != null ? b5.c : null;
            txq txqVar7 = new txq(eyqVar, str23 == null ? str21 : str23, qv0Var.f, null, null, c.e(b5), b5 != null ? b5.b : false, null, b5 != null ? b5.e : null, 152);
            String str24 = b4 != null ? b4.c : null;
            txq txqVar8 = new txq(fyqVar, str24 == null ? str21 : str24, qv0Var.d, null, null, c.e(b4), b4 != null ? b4.b : false, null, b4 != null ? b4.e : null, 152);
            String str25 = b3 != null ? b3.c : null;
            txq txqVar9 = new txq(cyqVar, str25 == null ? str21 : str25, qv0Var.c, null, null, c.e(b3), b3 != null ? b3.b : false, null, b3 != null ? b3.e : null, 152);
            String str26 = b6 != null ? b6.c : null;
            txq txqVar10 = new txq(dyqVar, str26 == null ? str21 : str26, qv0Var.e, null, null, c.e(b6), b6 != null ? b6.b : false, null, b6 != null ? b6.e : null, 152);
            final ffe0 ffe0Var = efe0Var.f;
            if (ffe0Var != null) {
                final erv ervVar = new erv(i);
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list3) {
                    if (hashSet.add(((mkb0) obj3).getId())) {
                        arrayList6.add(obj3);
                    }
                }
                final int i4 = 0;
                rgb0Var = new rgb0(new dlb0(list3, !(arrayList6.size() != list3.size())), new hj0(ffe0Var.c > list3.size(), new sls() { // from class: inn
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        ffe0 ffe0Var2 = ffe0Var;
                        erv ervVar2 = ervVar;
                        c cVar3 = cVar;
                        switch (i5) {
                            case 0:
                                cVar3.f.f(ervVar2, ffe0Var2.b, ffe0Var2.a);
                                break;
                            default:
                                cVar3.f.g(ervVar2, ffe0Var2.b, ffe0Var2.a);
                                break;
                        }
                        return zy11Var;
                    }
                }, new sls() { // from class: inn
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        ffe0 ffe0Var2 = ffe0Var;
                        erv ervVar2 = ervVar;
                        c cVar3 = cVar;
                        switch (i5) {
                            case 0:
                                cVar3.f.f(ervVar2, ffe0Var2.b, ffe0Var2.a);
                                break;
                            default:
                                cVar3.f.g(ervVar2, ffe0Var2.b, ffe0Var2.a);
                                break;
                        }
                        return zy11Var;
                    }
                }, new bxl(26, cVar), new bgc(12)), new t8j(23, cVar, ervVar));
            } else {
                rgb0Var = null;
            }
            String str27 = zee0Var3 != null ? zee0Var3.b : null;
            String str28 = str27 == null ? str21 : str27;
            FieldVisibility e2 = c.e(zee0Var3);
            String str29 = zee0Var3 != null ? zee0Var3.f : null;
            String str30 = str3;
            bce c2 = c.c(zee0Var3, str30);
            if (zee0Var3 != null && zee0Var3.c) {
                z4 = true;
                nae naeVar = new nae(str28, str30, e2, str29, c2, !z4);
                boolean z14 = !z11;
                e0l0Var2 = e0l0Var;
                if (i < scc.f(e0l0Var2.a) || dfe0Var == null) {
                    dfe0Var2 = dfe0Var;
                    wa31Var = null;
                } else {
                    dfe0Var2 = dfe0Var;
                    wa31Var = new wa31(cVar.h.b.d(dfe0Var2.a), dfe0Var2.b);
                }
                cfe0 cfe0Var6 = !z13 ? cfe0Var2 : cfe0Var;
                arrayList5.add(new x7l0(i, oiz0Var, d41Var2, null, txqVar6, txqVar7, txqVar9, txqVar10, txqVar8, naeVar, rgb0Var, z14, null, null, false, wa31Var, cfe0Var6 == null ? cfe0Var6.c : null, 16392));
                arrayList3 = arrayList5;
                e0l0Var3 = e0l0Var2;
                i = i2;
                z5 = z11;
                z6 = z12;
                it = it9;
                map = map3;
                arrayList2 = arrayList4;
                cfe0Var3 = cfe0Var;
                cfe0Var4 = cfe0Var2;
            }
            z4 = false;
            nae naeVar2 = new nae(str28, str30, e2, str29, c2, !z4);
            boolean z142 = !z11;
            e0l0Var2 = e0l0Var;
            if (i < scc.f(e0l0Var2.a)) {
            }
            dfe0Var2 = dfe0Var;
            wa31Var = null;
            if (!z13) {
            }
            arrayList5.add(new x7l0(i, oiz0Var, d41Var2, null, txqVar6, txqVar7, txqVar9, txqVar10, txqVar8, naeVar2, rgb0Var, z142, null, null, false, wa31Var, cfe0Var6 == null ? cfe0Var6.c : null, 16392));
            arrayList3 = arrayList5;
            e0l0Var3 = e0l0Var2;
            i = i2;
            z5 = z11;
            z6 = z12;
            it = it9;
            map = map3;
            arrayList2 = arrayList4;
            cfe0Var3 = cfe0Var;
            cfe0Var4 = cfe0Var2;
        }
    }
}
