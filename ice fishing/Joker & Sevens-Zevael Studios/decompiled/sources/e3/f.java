package e3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2081e;

    public /* synthetic */ f(String str, Context context, Object obj, int i10, int i11) {
        this.f2077a = i11;
        this.f2078b = str;
        this.f2079c = context;
        this.f2081e = obj;
        this.f2080d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2077a) {
            case 0:
                Object[] objArr = {(e) this.f2081e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return i.b(this.f2078b, this.f2079c, Collections.unmodifiableList(arrayList), this.f2080d);
            default:
                try {
                    return i.b(this.f2078b, this.f2079c, (ArrayList) this.f2081e, this.f2080d);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
