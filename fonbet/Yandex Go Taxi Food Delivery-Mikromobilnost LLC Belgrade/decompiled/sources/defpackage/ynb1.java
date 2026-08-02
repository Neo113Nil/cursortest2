package defpackage;

import android.widget.TextView;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.ModeContext$Delivery;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public abstract class ynb1 {
    public static int a(TextView textView) {
        return textView.getAutoSizeTextType();
    }

    public static final Map b(Pair... pairArr) {
        ArrayList arrayList = new ArrayList();
        for (Pair pair : pairArr) {
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            Pair pair2 = second != null ? new Pair(first, second) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return b.s(arrayList);
    }

    public static void c(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static void d(TextView textView) {
        textView.setAutoSizeTextTypeWithDefaults(0);
    }

    public static final ModeContext$Delivery e(ij80 ij80Var) {
        if (ij80Var instanceof gj80) {
            return new ModeContext$Delivery(Integer.valueOf(((gj80) ij80Var).a));
        }
        if (ij80Var instanceof hj80) {
            return null;
        }
        w511.b();
        return null;
    }
}
