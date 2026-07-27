package F;

import android.content.Context;
import java.io.File;
import t0.C0252g;

/* loaded from: classes.dex */
public final class b extends E0.j implements D0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f318h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f316f = i2;
        this.f317g = obj;
        this.f318h = obj2;
    }

    @Override // D0.a
    public final Object a() {
        switch (this.f316f) {
            case 0:
                Context context = (Context) this.f317g;
                ((c) this.f318h).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                E0.i.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((V.a) ((U.b) this.f317g).f1022f).a((U.i) this.f318h);
                return C0252g.f2994a;
        }
    }
}
