package F;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends E0.j implements D0.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f315g = i2;
        this.f316h = obj;
        this.f317i = obj2;
    }

    @Override // D0.a
    public final Object a() {
        switch (this.f315g) {
            case 0:
                Context context = (Context) this.f316h;
                ((c) this.f317i).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                E0.i.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((V.a) ((U.b) this.f316h).f1014g).a((U.i) this.f317i);
                return t0.g.f2989a;
        }
    }
}
