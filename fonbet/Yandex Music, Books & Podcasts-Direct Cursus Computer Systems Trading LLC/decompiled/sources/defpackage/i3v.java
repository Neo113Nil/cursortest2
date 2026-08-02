package defpackage;

import com.yandex.plus.bdui.plus.analytics.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class i3v implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ i3v(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.c;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                function02.invoke();
                function0.invoke();
                return Unit.a;
            default:
                LinkedHashMap linkedHashMap = f.e;
                function02.getClass();
                function0.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("_meta", f.e);
                linkedHashMap2.putAll((Map) function02.invoke());
                linkedHashMap2.putAll((Map) function0.invoke());
                return linkedHashMap2;
        }
    }
}
