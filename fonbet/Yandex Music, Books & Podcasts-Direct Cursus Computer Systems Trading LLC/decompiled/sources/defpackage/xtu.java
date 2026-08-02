package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class xtu implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mm6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xtu(mm6 mm6Var, z6v z6vVar, boolean z, String str) {
        this.b = mm6Var;
        this.d = z6vVar;
        this.c = z;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        fhv fhvVar;
        List list;
        Object obj;
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        mm6 mm6Var = this.b;
        switch (i) {
            case 0:
                u3v u3vVar = (u3v) obj3;
                kxi kxiVar = u3vVar.b;
                Function1 function1 = (Function1) obj2;
                jyr jyrVar = u3vVar.m;
                vtp vtpVar = (vtp) jyrVar.getValue();
                nmb nmbVar = vtpVar.c;
                sjb sjbVar = sjb.Ok;
                kmb kmbVar = kmb.Tap;
                String G = vtpVar.b.a.G();
                vdr vdrVar = vtpVar.a;
                wjb wjbVar = ((cvo) vdrVar.getValue()).a;
                ilb ilbVar = ((cvo) vdrVar.getValue()).g;
                glb glbVar = ((cvo) vdrVar.getValue()).c;
                String str = ((cvo) vdrVar.getValue()).d.a;
                pkb pkbVar = ((cvo) vdrVar.getValue()).e.a;
                String str2 = ((cvo) vdrVar.getValue()).e.b;
                qkb qkbVar = qkb.Carousel;
                nmbVar.getClass();
                G.getClass();
                wjbVar.getClass();
                ilbVar.getClass();
                glbVar.getClass();
                str.getClass();
                pkbVar.getClass();
                str2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("action_type", "shake_wave");
                linkedHashMap.put("user_interaction_type", "shake");
                linkedHashMap.put("entity_type", "wheel");
                linkedHashMap.put("entity_id", "wheel");
                linkedHashMap.put("hash", G);
                linkedHashMap.put("page_id", wjbVar.a);
                linkedHashMap.put("page_style", ilbVar.a);
                linkedHashMap.put("page_placement", glbVar.a);
                linkedHashMap.put("skeleton_id", str);
                linkedHashMap.put("main_object_type", pkbVar.a);
                linkedHashMap.put("main_object_id", str2);
                int i2 = 0;
                eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
                linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
                linkedHashMap.put("_meta", nmb.u(4));
                nmbVar.C("Screen.ActionPerformed", linkedHashMap);
                boolean z = u3vVar.e;
                thv thvVar = u3vVar.c;
                Continuation continuation = null;
                if (z) {
                    Object value = thvVar.j.getValue();
                    dkv dkvVar = value instanceof dkv ? (dkv) value : null;
                    if (dkvVar != null) {
                        fhv fhvVar2 = dkvVar.a;
                        Iterator it = fhvVar2.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                bjv bjvVar = (bjv) it.next();
                                ajv ajvVar = bjvVar instanceof ajv ? (ajv) bjvVar : null;
                                if (ajvVar != null && o8g.z(ajvVar.d.a.b)) {
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        Integer valueOf = Integer.valueOf(i2);
                        if (i2 == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            Object obj4 = fhvVar2.b.get(intValue);
                            ajv ajvVar2 = obj4 instanceof ajv ? (ajv) obj4 : null;
                            if (ajvVar2 != null) {
                                thvVar.b(new iiv(fhvVar2.a, intValue, ajvVar2));
                                g0l g0lVar = u3vVar.f;
                                s9p s9pVar = ajvVar2.d.a.b;
                                vtp vtpVar2 = (vtp) jyrVar.getValue();
                                g0l.s(g0lVar, s9pVar, kxiVar, new u5l((cvo) vtpVar2.a.getValue(), vtpVar2.d, vtpVar2.e, null), hiv.a, null, null, null, null, 496);
                            }
                        }
                    }
                } else {
                    Object value2 = thvVar.j.getValue();
                    dkv dkvVar2 = value2 instanceof dkv ? (dkv) value2 : null;
                    if (dkvVar2 != null && (fhvVar = dkvVar2.a) != null && (list = fhvVar.b) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof ajv) {
                                arrayList.add(obj5);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (o8g.z(((ajv) obj).d.a.b)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        ajv ajvVar3 = (ajv) obj;
                        if (ajvVar3 != null) {
                            s9p s9pVar2 = ajvVar3.d.a.b;
                            dxr dxrVar = u3vVar.d;
                            vtp vtpVar3 = (vtp) jyrVar.getValue();
                            dxrVar.e(s9pVar2, kxiVar, new u5l((cvo) vtpVar3.a.getValue(), vtpVar3.d, vtpVar3.e, null), hiv.a);
                        }
                    }
                }
                x97.y(mm6Var, null, null, new cg1(this.c, function1, u3vVar, continuation, 23), 3);
                break;
            default:
                x4a.k(mm6Var, (z6v) obj3, this.c, (String) obj2, true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xtu(u3v u3vVar, mm6 mm6Var, boolean z, Function1 function1) {
        this.d = u3vVar;
        this.b = mm6Var;
        this.c = z;
        this.e = function1;
    }
}
