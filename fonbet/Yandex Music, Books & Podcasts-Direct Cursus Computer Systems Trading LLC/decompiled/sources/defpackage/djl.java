package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class djl implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ djl(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        int i;
        Object obj3;
        float f;
        switch (this.a) {
            case 0:
                ja0 ja0Var = (ja0) this.c;
                Object b = ja0Var.f.b(hqi.c, new w90(ja0Var, new d90(this.b, (ri2) obj, (Continuation) null), (Continuation) null), continuation);
                nm6 nm6Var = nm6.a;
                if (b != nm6Var) {
                    b = Unit.a;
                }
                if (b != nm6Var) {
                    break;
                }
                break;
            default:
                Map map = (Map) obj;
                nvr nvrVar = (nvr) this.c;
                Float v = q7g.v(nvrVar.c.getValue(), map);
                v.getClass();
                float floatValue = v.floatValue();
                float floatValue2 = ((Number) nvrVar.e.getValue()).floatValue();
                Set keySet = map.keySet();
                Function2 function2 = (Function2) nvrVar.m.getValue();
                float e = nvrVar.n.e();
                Set set = keySet;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : set) {
                    if (((Number) obj4).floatValue() <= floatValue2 + 0.001d) {
                        arrayList.add(obj4);
                    }
                }
                int i2 = 1;
                if (arrayList.isEmpty()) {
                    i = 1;
                    obj2 = null;
                } else {
                    obj2 = arrayList.get(0);
                    float floatValue3 = ((Number) obj2).floatValue();
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        int i3 = 1;
                        while (true) {
                            Object obj5 = arrayList.get(i3);
                            i = i2;
                            float floatValue4 = ((Number) obj5).floatValue();
                            if (Float.compare(floatValue3, floatValue4) < 0) {
                                floatValue3 = floatValue4;
                                obj2 = obj5;
                            }
                            if (i3 != size) {
                                i3++;
                                i2 = i;
                            }
                        }
                    } else {
                        i = 1;
                    }
                }
                Float f2 = (Float) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : set) {
                    if (((Number) obj6).floatValue() >= floatValue2 - 0.001d) {
                        arrayList2.add(obj6);
                    }
                }
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    Object obj7 = arrayList2.get(0);
                    float floatValue5 = ((Number) obj7).floatValue();
                    int size2 = arrayList2.size() - 1;
                    if (i <= size2) {
                        int i4 = 1;
                        while (true) {
                            Object obj8 = arrayList2.get(i4);
                            float floatValue6 = ((Number) obj8).floatValue();
                            if (Float.compare(floatValue5, floatValue6) > 0) {
                                obj7 = obj8;
                                floatValue5 = floatValue6;
                            }
                            if (i4 != size2) {
                                i4++;
                            }
                        }
                    }
                    obj3 = obj7;
                }
                Float f3 = (Float) obj3;
                List i5 = f2 == null ? u75.i(f3) : f3 == null ? t75.c(f2) : Intrinsics.c(f2, f3) ? t75.c(f2) : u75.h(f2, f3);
                int size3 = i5.size();
                if (size3 == 0) {
                    f = floatValue;
                } else if (size3 != 1) {
                    f = ((Number) i5.get(0)).floatValue();
                    float floatValue7 = ((Number) i5.get(1)).floatValue();
                    float f4 = this.b;
                    if (floatValue > floatValue2 ? f4 > (-e) && floatValue2 > ((Number) function2.invoke(Float.valueOf(floatValue7), Float.valueOf(f))).floatValue() : f4 >= e || floatValue2 >= ((Number) function2.invoke(Float.valueOf(f), Float.valueOf(floatValue7))).floatValue()) {
                        f = floatValue7;
                    }
                } else {
                    f = ((Number) i5.get(0)).floatValue();
                }
                Object obj9 = map.get(new Float(f));
                if (obj9 != null && ((Boolean) nvrVar.b.invoke(obj9)).booleanValue()) {
                    Object b2 = nvr.b(nvrVar, obj9, continuation);
                    if (b2 != nm6.a) {
                        break;
                    }
                } else {
                    Object a = nvrVar.a(floatValue, nvrVar.a, continuation);
                    if (a != nm6.a) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
