package defpackage;

import com.google.android.material.button.MaterialButton;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.internal.autologin.c;
import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ze0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ze0(Function2 function2) {
        this.a = 6;
        this.b = (uif) function2;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2, uif] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
            case 1:
                for (Function1 function1 : (Function1[]) obj3) {
                    int b = gl5.b((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (b != 0) {
                        return b;
                    }
                }
                return 0;
            case 2:
                uch uchVar = (uch) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i2 = uch.k;
                int compareTo = Boolean.valueOf(materialButton.o).compareTo(Boolean.valueOf(materialButton2.o));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.compare(uchVar.indexOfChild(materialButton), uchVar.indexOfChild(materialButton2));
            case 3:
                yjh yjhVar = (yjh) obj3;
                return yjhVar.g(obj2) - yjhVar.g(obj);
            case 4:
                return ((Number) ((d6h) obj3).invoke(obj, obj2)).intValue();
            case 5:
                return ((Number) ((y5) obj3).invoke(obj, obj2)).intValue();
            case 6:
                return ((Number) ((uif) obj3).invoke(obj, obj2)).intValue();
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                c cVar = (c) obj2;
                try {
                    boolean[] zArr = (boolean[]) uah.c(((c) obj).a, linkedHashMap);
                    boolean[] zArr2 = (boolean[]) uah.c(cVar.a, linkedHashMap);
                    int length = zArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        boolean z = zArr[i3];
                        if (z != zArr2[i3]) {
                            return z ? -1 : 1;
                        }
                    }
                    return 0;
                } catch (Exception e) {
                    d dVar = a.a;
                    if (!a.a.isEnabled()) {
                        return 0;
                    }
                    a.b(b.e, null, "Comparator error for ordered accounts", e);
                    return 0;
                }
        }
    }

    public /* synthetic */ ze0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
