package defpackage;

import android.content.Context;
import java.util.Arrays;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class skr {
    public final Context a;

    public skr(Context context) {
        this.a = context;
    }

    public final String a(int i, int i2) {
        String quantityString = this.a.getResources().getQuantityString(i, i2);
        quantityString.getClass();
        return quantityString;
    }

    public final String b(int i, int i2, Object... objArr) {
        String quantityString = this.a.getResources().getQuantityString(i, i2);
        quantityString.getClass();
        if (!StringsKt.N(quantityString, '%')) {
            return quantityString;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(quantityString, Arrays.copyOf(copyOf, copyOf.length));
    }

    public final String c(int i) {
        String string = this.a.getResources().getString(i);
        string.getClass();
        return string;
    }

    public final String d(int i, Object... objArr) {
        String string = this.a.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }
}
