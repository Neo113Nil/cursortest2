package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ajf;
import defpackage.an91;
import defpackage.at;
import defpackage.bt;
import defpackage.ct;
import defpackage.cv8;
import defpackage.dt;
import defpackage.et;
import defpackage.fqs0;
import defpackage.hka1;
import defpackage.hqs0;
import defpackage.j5s;
import defpackage.j6s;
import defpackage.k9x0;
import defpackage.l690;
import defpackage.l6s;
import defpackage.ldc;
import defpackage.n37;
import defpackage.ny61;
import defpackage.o5s;
import defpackage.p6s;
import defpackage.r9x0;
import defpackage.t4s;
import defpackage.tcc;
import defpackage.w511;
import defpackage.ws;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.xs;
import defpackage.yfa;
import defpackage.ys;
import defpackage.zs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ButtonSize;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.Style;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormClientStateDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

/* loaded from: classes5.dex */
public final class a {
    public final yfa a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;
    public final p6s c;
    public final l6s d;
    public final o5s e;
    public final cv8 f;

    public a(yfa yfaVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar, p6s p6sVar, l6s l6sVar, o5s o5sVar, cv8 cv8Var) {
        this.a = yfaVar;
        this.b = aVar;
        this.c = p6sVar;
        this.d = l6sVar;
        this.e = o5sVar;
        this.f = cv8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(et etVar, FormLoadingStateRepository$State formLoadingStateRepository$State, boolean z, ActionButtonMapper$Container actionButtonMapper$Container, ContinuationImpl continuationImpl) {
        ActionButtonMapper$map$1 actionButtonMapper$map$1;
        int i;
        n37 n37Var;
        n37 n37Var2;
        boolean z2;
        Map map;
        LinkedHashMap linkedHashMap;
        ActionButtonMapper$Container actionButtonMapper$Container2;
        int i2;
        x2s x2sVar;
        String str;
        ButtonSize buttonSize;
        j6s b;
        List list;
        boolean z3;
        ArrayList arrayList;
        ajf ajfVar;
        hka1 hka1Var;
        int i3;
        l690 b2;
        et etVar2 = etVar;
        if (continuationImpl instanceof ActionButtonMapper$map$1) {
            actionButtonMapper$map$1 = (ActionButtonMapper$map$1) continuationImpl;
            int i4 = actionButtonMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                actionButtonMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = actionButtonMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actionButtonMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i5 = (formLoadingStateRepository$State == FormLoadingStateRepository$State.LOADING || z) ? 1 : 0;
                    if (i5 == 0) {
                        n37Var = etVar2.c;
                    } else {
                        n37Var = etVar2.d;
                        if (n37Var == null) {
                            n37Var = etVar2.c;
                        }
                    }
                    n37Var2 = n37Var;
                    n37 n37Var3 = etVar2.c;
                    x2s x2sVar2 = etVar2.f;
                    z2 = n37Var3.d;
                    Object obj2 = x2sVar2.b;
                    Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                    r9x0 r9x0Var = etVar2.e;
                    boolean z4 = n37Var2.d;
                    Integer num = 1;
                    if (!(r9x0Var instanceof k9x0) || (b = this.c.b()) == null) {
                        map = map2;
                        linkedHashMap = null;
                    } else {
                        int i6 = ws.b[((k9x0) r9x0Var).a.ordinal()];
                        if (i6 == 1) {
                            j5s j5sVar = (j5s) this.e.c.a.getValue();
                            if (j5sVar != null && (list = j5sVar.b) != null) {
                                num = Integer.valueOf(list.size());
                            } else if ((j5sVar != null ? j5sVar.a : null) == null) {
                                num = null;
                            }
                        } else if (i6 != 2 && i6 != 3) {
                            w511.b();
                            return null;
                        }
                        l6s l6sVar = this.d;
                        l6sVar.getClass();
                        FormClientStateDto d = l6s.d(b);
                        List<FormStateContactDto> contacts = d.getContacts();
                        if (contacts != null) {
                            List<FormStateContactDto> list2 = contacts;
                            z3 = z4;
                            map = map2;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new FormStateContactDto(((FormStateContactDto) it.next()).getRouteIndex(), "hidden"));
                            }
                            arrayList = arrayList2;
                        } else {
                            z3 = z4;
                            map = map2;
                            arrayList = null;
                        }
                        List<FormStateRoutePointDto> route = d.getRoute();
                        ArrayList arrayList3 = new ArrayList(tcc.n(route, 10));
                        for (FormStateRoutePointDto formStateRoutePointDto : route) {
                            RoutePointContactDto contact = formStateRoutePointDto.getContact();
                            arrayList3.add(FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, null, null, null, new RoutePointContactDto("hidden", contact != null ? contact.getName() : null), null, null, null, null, null, 8063, null));
                        }
                        linkedHashMap = new LinkedHashMap(kotlin.collections.b.n(b.a, l6sVar.a(FormClientStateDto.copy$default(d, arrayList3, arrayList, null, null, null, null, null, HProv.PP_SAME_MEDIA, null))));
                        linkedHashMap.put(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z3));
                        if (num != null) {
                            linkedHashMap.put("orders_number", Integer.valueOf(num.intValue()));
                        }
                        t4s t4sVar = this.f.a;
                        if (t4sVar != null) {
                            linkedHashMap.put("input_point", t4sVar.a);
                        }
                    }
                    x2s x2sVar3 = new x2s(x2sVar2.a, linkedHashMap != null ? kotlin.collections.b.n(linkedHashMap, map == null ? kotlin.collections.b.f() : map) : map);
                    String str2 = etVar2.a;
                    ButtonSize buttonSize2 = etVar2.b;
                    hqs0 hqs0Var = n37Var2.a;
                    actionButtonMapper$map$1.L$0 = etVar2;
                    actionButtonMapper$map$1.L$1 = null;
                    actionButtonMapper$Container2 = actionButtonMapper$Container;
                    actionButtonMapper$map$1.L$2 = actionButtonMapper$Container2;
                    actionButtonMapper$map$1.L$3 = n37Var2;
                    actionButtonMapper$map$1.L$4 = null;
                    actionButtonMapper$map$1.L$5 = null;
                    actionButtonMapper$map$1.L$6 = null;
                    actionButtonMapper$map$1.L$7 = x2sVar3;
                    actionButtonMapper$map$1.L$8 = str2;
                    actionButtonMapper$map$1.L$9 = buttonSize2;
                    actionButtonMapper$map$1.Z$0 = z;
                    actionButtonMapper$map$1.I$0 = i5;
                    actionButtonMapper$map$1.Z$1 = z2;
                    actionButtonMapper$map$1.label = 1;
                    Object r = this.b.r(hqs0Var, actionButtonMapper$map$1);
                    if (r == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i7 = i5;
                    obj = r;
                    i2 = i7;
                    x2sVar = x2sVar3;
                    str = str2;
                    buttonSize = buttonSize2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = actionButtonMapper$map$1.Z$1;
                    i2 = actionButtonMapper$map$1.I$0;
                    ButtonSize buttonSize3 = (ButtonSize) actionButtonMapper$map$1.L$9;
                    String str3 = (String) actionButtonMapper$map$1.L$8;
                    x2s x2sVar4 = (x2s) actionButtonMapper$map$1.L$7;
                    n37Var2 = (n37) actionButtonMapper$map$1.L$3;
                    ActionButtonMapper$Container actionButtonMapper$Container3 = (ActionButtonMapper$Container) actionButtonMapper$map$1.L$2;
                    et etVar3 = (et) actionButtonMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    buttonSize = buttonSize3;
                    str = str3;
                    x2sVar = x2sVar4;
                    actionButtonMapper$Container2 = actionButtonMapper$Container3;
                    z2 = z5;
                    etVar2 = etVar3;
                }
                fqs0 fqs0Var = (fqs0) obj;
                ajfVar = n37Var2.c;
                Style style = n37Var2.b;
                if (ajfVar == null) {
                    ldc f = this.a.f(ajfVar.a);
                    long j = f != null ? f.a : ldc.l;
                    int i8 = ajfVar.b;
                    if (i8 < 0) {
                        i8 = 0;
                    }
                    hka1Var = new ys(j, i8);
                } else {
                    int i9 = ws.c[style.ordinal()];
                    if (i9 == 1) {
                        hka1Var = zs.b;
                    } else if (i9 == 2) {
                        hka1Var = at.b;
                    } else if (i9 == 3) {
                        hka1Var = bt.b;
                    } else if (i9 == 4) {
                        hka1Var = ct.b;
                    } else {
                        if (i9 != 5) {
                            w511.b();
                            return null;
                        }
                        hka1Var = dt.b;
                    }
                }
                hka1 hka1Var2 = hka1Var;
                boolean z6 = n37Var2.d;
                boolean z7 = i2 == 0 && n37Var2.e;
                x9x0 x9x0Var = new x9x0(etVar2.e, null, null, x2sVar, 6);
                i3 = ws.a[actionButtonMapper$Container2.ordinal()];
                if (i3 != 1) {
                    b2 = an91.b(8.0f, 0.0f, 2);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    b2 = an91.b(0.0f, 0.0f, 3);
                }
                return new xs(buttonSize, fqs0Var, hka1Var2, z6, Boolean.valueOf(z2), z7, x9x0Var, x2sVar, b2, str);
            }
        }
        actionButtonMapper$map$1 = new ActionButtonMapper$map$1(this, continuationImpl);
        Object obj3 = actionButtonMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actionButtonMapper$map$1.label;
        if (i != 0) {
        }
        fqs0 fqs0Var2 = (fqs0) obj3;
        ajfVar = n37Var2.c;
        Style style2 = n37Var2.b;
        if (ajfVar == null) {
        }
        hka1 hka1Var22 = hka1Var;
        boolean z62 = n37Var2.d;
        if (i2 == 0) {
        }
        x9x0 x9x0Var2 = new x9x0(etVar2.e, null, null, x2sVar, 6);
        i3 = ws.a[actionButtonMapper$Container2.ordinal()];
        if (i3 != 1) {
        }
        return new xs(buttonSize, fqs0Var2, hka1Var22, z62, Boolean.valueOf(z2), z7, x9x0Var2, x2sVar, b2, str);
    }
}
