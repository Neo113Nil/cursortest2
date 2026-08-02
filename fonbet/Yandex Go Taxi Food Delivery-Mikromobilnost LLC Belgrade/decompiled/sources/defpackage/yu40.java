package defpackage;

import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderPartDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class yu40 {
    public final wnt a;
    public final i3y b;
    public final i3y c = a.a(new d540(15));
    public final i3y d = a.a(new csz(11, this));
    public final LinkedHashSet e = new LinkedHashSet();
    public final r0 f;
    public final gci0 g;

    public yu40(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = a.a(new km(dne0Var, 3));
        r0 c = bvf0.c(h(d()));
        this.f = c;
        this.g = e.d(c);
    }

    public static ArrayList h(Set set) {
        Set<MultimodalRoutesOrderDto> set2 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
        for (MultimodalRoutesOrderDto multimodalRoutesOrderDto : set2) {
            arrayList.add(new xu40(multimodalRoutesOrderDto.getA(), multimodalRoutesOrderDto.getB().getB(), multimodalRoutesOrderDto.getB().getA()));
        }
        return arrayList;
    }

    public final void a(MultimodalRoutesOrderDto multimodalRoutesOrderDto) {
        d().removeIf(new sdc(10, new x240(18, multimodalRoutesOrderDto)));
        d().add(multimodalRoutesOrderDto);
        i();
        f();
    }

    public final String b(String str, String str2) {
        Object obj;
        String b;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MultimodalRoutesOrderDto multimodalRoutesOrderDto = (MultimodalRoutesOrderDto) obj;
            if (jl40.l(multimodalRoutesOrderDto.getB().getB(), str) || (multimodalRoutesOrderDto.getB().getC() != null && jl40.l(multimodalRoutesOrderDto.getB().getC(), str2))) {
                break;
            }
        }
        MultimodalRoutesOrderDto multimodalRoutesOrderDto2 = (MultimodalRoutesOrderDto) obj;
        if (multimodalRoutesOrderDto2 != null && ((b = multimodalRoutesOrderDto2.getB().getB()) == null || b.length() == 0)) {
            a(MultimodalRoutesOrderDto.a(multimodalRoutesOrderDto2, MultimodalRoutesOrderPartDto.a(multimodalRoutesOrderDto2.getB(), str)));
        }
        if (multimodalRoutesOrderDto2 != null) {
            return multimodalRoutesOrderDto2.getA();
        }
        return null;
    }

    public final MultimodalRoutesOrderDto c(String str) {
        Object obj;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((MultimodalRoutesOrderDto) obj).getA(), str)) {
                break;
            }
        }
        return (MultimodalRoutesOrderDto) obj;
    }

    public final Set d() {
        return (Set) this.d.getValue();
    }

    public final void e(String str) {
        if (d().removeIf(new sdc(9, new my30(str, 4)))) {
            this.e.add(str);
        }
        i();
        f();
    }

    public final void f() {
        ((cne0) this.b.getValue()).r("orders", ((xnt) this.a).e(d(), (KSerializer) this.c.getValue()));
    }

    public final void g(List list) {
        d().clear();
        Set d = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.e.contains(((MultimodalRoutesOrderDto) obj).getA())) {
                arrayList.add(obj);
            }
        }
        d.addAll(arrayList);
        i();
        f();
    }

    public final void i() {
        ArrayList h = h(d());
        r0 r0Var = this.f;
        r0Var.getClass();
        r0Var.m(null, h);
    }
}
