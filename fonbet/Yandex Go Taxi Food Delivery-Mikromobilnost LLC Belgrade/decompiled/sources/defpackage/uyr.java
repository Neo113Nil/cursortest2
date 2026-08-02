package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class uyr implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ uyr(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.x = obj;
        this.w = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        int i2 = this.w;
        Object obj = this.x;
        Context context = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                Object[] objArr = {(pyr) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return xyr.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return xyr.b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new wyr(-3);
                }
        }
    }
}
