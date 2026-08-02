package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DeeplinkParamsFilterSchema;
import com.ybsdk.rconfig.configs.DeeplinkParamsRegexFilter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class zop0 implements w42 {
    public final /* synthetic */ b a;

    public zop0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.w42
    public final Map a() {
        return ((DeeplinkParamsFilterSchema) this.a.d(z2h.a).getData()).getFilters();
    }

    @Override // defpackage.w42
    public final Map b() {
        LinkedHashMap linkedHashMap;
        List<DeeplinkParamsRegexFilter> filtersRegex = ((DeeplinkParamsFilterSchema) this.a.d(z2h.a).getData()).getFiltersRegex();
        if (filtersRegex != null) {
            linkedHashMap = new LinkedHashMap();
            for (DeeplinkParamsRegexFilter deeplinkParamsRegexFilter : filtersRegex) {
                x2h x2hVar = new x2h(deeplinkParamsRegexFilter.getRegex(), deeplinkParamsRegexFilter.getReplacement());
                String param = deeplinkParamsRegexFilter.getParam();
                Collection collection = (List) linkedHashMap.get(deeplinkParamsRegexFilter.getParam());
                if (collection == null) {
                    collection = EmptyList.a;
                }
                linkedHashMap.put(param, a.o0(collection, x2hVar));
            }
        } else {
            linkedHashMap = null;
        }
        return linkedHashMap == null ? kotlin.collections.b.f() : linkedHashMap;
    }
}
