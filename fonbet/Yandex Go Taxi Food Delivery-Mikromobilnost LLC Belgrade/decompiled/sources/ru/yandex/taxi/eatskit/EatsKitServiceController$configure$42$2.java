package ru.yandex.taxi.eatskit;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.b8j0;
import defpackage.ck7;
import defpackage.cvu0;
import defpackage.e8j0;
import defpackage.gcn;
import defpackage.odn;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.dto.GrantResult;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsKitServiceController$configure$42$2 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ndn] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        final gcn gcnVar = (gcn) obj2;
        final odn odnVar = (odn) this.receiver;
        odnVar.getClass();
        List list = ((b8j0) obj).a;
        if (list == null) {
            list = EmptyList.a;
        }
        final List list2 = list;
        List list3 = list2;
        final ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (!cvu0.x(str, "android.permission.", false)) {
                str = "android.permission.".concat(str);
            }
            arrayList.add(str);
        }
        if (arrayList.isEmpty()) {
            gcnVar.a(new ck7(new e8j0(kotlin.collections.b.f()), null));
        } else {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (cvu0.x((String) it2.next(), "android.permission.BLUETOOTH", false)) {
                        z = true;
                        break;
                    }
                }
            }
            final boolean z2 = z;
            if (z2) {
                odnVar.a.b(BiometricsAnalytics$BiometricsFlowType.BtRequestPermission);
            }
            ((com.yandex.go.permission.b) odnVar.b).e(arrayList, new Consumer() { // from class: ndn
                @Override // java.util.function.Consumer
                public final void accept(Object obj3) {
                    List list4 = (List) obj3;
                    MapBuilder mapBuilder = new MapBuilder();
                    List<String> list5 = list2;
                    Iterator it3 = list5.iterator();
                    boolean z3 = false;
                    int i = 0;
                    while (true) {
                        boolean hasNext = it3.hasNext();
                        odn odnVar2 = odnVar;
                        if (!hasNext) {
                            MapBuilder j = mapBuilder.j();
                            gcn.this.a(new ck7(new e8j0(j), null));
                            if (z2) {
                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                    for (String str2 : list5) {
                                        if (j.get(str2) != GrantResult.GRANTED && cvu0.x(str2, "android.permission.BLUETOOTH", false)) {
                                            break;
                                        }
                                    }
                                }
                                z3 = true;
                                odnVar2.a.a(BiometricsAnalytics$BiometricsFlowType.BtRequestPermission, z3 ? BiometricsAnalytics$BiometricsFlowResult.Success : BiometricsAnalytics$BiometricsFlowResult.Failed, z3 ? null : BiometricsAnalytics$BiometricsFlowFailureReason.PermissionDenied);
                                return;
                            }
                            return;
                        }
                        Object next = it3.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        String str3 = (String) next;
                        Boolean bool = (Boolean) a.S(i, list4);
                        mapBuilder.put(str3, bool != null ? bool.booleanValue() : false ? GrantResult.GRANTED : odnVar2.a((String) arrayList.get(i)));
                        i = i2;
                    }
                }
            });
        }
        return zy11.a;
    }
}
