package com.datadog.android.okhttp.trace;

import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.trace.DatadogTracing;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.Headers;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class TracingInterceptor$extractParentContext$headerContext$1 extends Lambda implements Function2 {
    public static final TracingInterceptor$extractParentContext$headerContext$1 INSTANCE;
    public static final TracingInterceptor$extractParentContext$headerContext$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE$1 = new TracingInterceptor$extractParentContext$headerContext$1(i, 1);
        INSTANCE = new TracingInterceptor$extractParentContext$headerContext$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TracingInterceptor$extractParentContext$headerContext$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Request request = (Request) obj;
                Function2 function2 = (Function2) obj2;
                request.getClass();
                function2.getClass();
                Headers headers = request.headers;
                headers.getClass();
                StringCompanionObject.INSTANCE.getClass();
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                comparator.getClass();
                TreeMap treeMap = new TreeMap(comparator);
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    Locale locale = Locale.US;
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, name, locale);
                    List list = (List) treeMap.get(m);
                    if (list == null) {
                        list = new ArrayList(2);
                        treeMap.put(m, list);
                    }
                    list.add(headers.value(i));
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                for (Map.Entry entry : treeMap.entrySet()) {
                    arrayList.add(new Pair(entry.getKey(), CollectionsKt.joinToString$default((Iterable) entry.getValue(), ";", null, null, 0, null, null, 62)));
                }
                for (Map.Entry entry2 : MapsKt__MapsKt.toMap(arrayList).entrySet()) {
                    function2.invoke((String) entry2.getKey(), (String) entry2.getValue());
                }
                return Unit.INSTANCE;
            default:
                InternalSdkCore internalSdkCore = (InternalSdkCore) obj;
                Set set = (Set) obj2;
                internalSdkCore.getClass();
                set.getClass();
                return DatadogTracing.newTracerBuilder(internalSdkCore).withTracingHeadersTypes(set).withSampleRate(100.0d).build();
        }
    }
}
