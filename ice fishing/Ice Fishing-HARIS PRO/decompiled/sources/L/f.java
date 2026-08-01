package L;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f422d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(String str, Context context, Object obj, int i, int i2) {
        this.f419a = i2;
        this.f420b = str;
        this.f421c = context;
        this.e = obj;
        this.f422d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f419a) {
            case 0:
                Object[] objArr = {(e) this.e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return i.b(this.f420b, this.f421c, Collections.unmodifiableList(arrayList), this.f422d);
            default:
                try {
                    return i.b(this.f420b, this.f421c, (List) this.e, this.f422d);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
