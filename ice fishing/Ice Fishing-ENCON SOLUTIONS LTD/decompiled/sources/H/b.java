package H;

import P0.q;
import a0.InterfaceC0084a;
import android.content.Context;
import h1.C0239i;
import java.io.File;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(0);
        this.f644e = i2;
        this.f645f = obj;
        this.f646g = obj2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        switch (this.f644e) {
            case 0:
                Context context = (Context) this.f645f;
                ((c) this.f646g).getClass();
                String fileName = "FlutterSharedPreferences".concat(".preferences_pb");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            default:
                ((InterfaceC0084a) ((Z.b) this.f645f).f1929b).a((q) this.f646g);
                return C0239i.f3393a;
        }
    }
}
