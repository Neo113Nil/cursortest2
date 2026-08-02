package defpackage;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class yuj0 {
    public final Context a;

    public yuj0(Context context) {
        this.a = context;
    }

    public final String a(int i, Object... objArr) {
        int length = objArr.length;
        Context context = this.a;
        return length == 0 ? context.getString(i) : context.getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
