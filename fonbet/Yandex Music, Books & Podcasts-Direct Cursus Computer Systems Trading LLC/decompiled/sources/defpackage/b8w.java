package defpackage;

import com.yandex.pulse.metrics.o;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class b8w extends uif implements Function0 {
    public static final b8w s;
    public static final b8w t;
    public static final b8w u;
    public static final b8w v;
    public static final b8w w;
    public static final b8w x;
    public static final b8w y;
    public static final b8w z;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new b8w(i, 0);
        t = new b8w(i, 1);
        u = new b8w(i, 2);
        v = new b8w(i, 3);
        w = new b8w(i, 4);
        x = new b8w(i, 5);
        y = new b8w(i, 6);
        z = new b8w(i, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8w(int i, Object obj) {
        super(0);
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object t7oVar;
        Object newInstance;
        Method method;
        switch (this.r) {
            case 0:
                e8w e8wVar = e8w.a;
                try {
                    Class<?> cls = Class.forName("com.yandex.payment.sdk.bankadapter.YandexBankAdapterFactory");
                    newInstance = cls.getConstructor(null).newInstance(null);
                    method = cls.getMethod("create", null);
                } catch (ClassNotFoundException unused) {
                }
                if (el2.class.isAssignableFrom(method.getReturnType())) {
                    method.invoke(newInstance, null).getClass();
                    throw new ClassCastException();
                }
                e8w e8wVar2 = e8w.a;
                return null;
            case 1:
                e8w e8wVar3 = e8w.a;
                e8w.c();
                return Boolean.FALSE;
            case 2:
                return new OkHttpClient();
            case 3:
                return new OkHttpClient(new joj());
            case 4:
                return rqi.a();
            case 5:
                return "pause";
            case 6:
                return "play";
            case 7:
                return "stop";
            case 8:
                return new jml();
            case 9:
                int i = tl4.a;
                return new f3b();
            case 10:
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = ovn.E();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                m77 m77Var = (m77) (t7oVar instanceof t7o ? null : t7oVar);
                return Boolean.valueOf((m77Var instanceof k77) || (m77Var instanceof j77));
            case 11:
                return new dqa(eqa.a);
            case 12:
                return Unit.a;
            case 13:
                int i2 = zae.a;
                return new h3b();
            case 14:
                return new fz0();
            case 15:
                return new gz0();
            case 16:
                return new hz0();
            case 17:
                return new lz0();
            case 18:
                return new mz0();
            case 19:
                return new nz0();
            case 20:
                return new ub3();
            case 21:
                return new vb3();
            case 22:
                return new wb3();
            case 23:
                return new zb3();
            case 24:
                return new ac3();
            case 25:
                return new bc3();
            case 26:
                return new ca5();
            case 27:
                return new da5();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ea5();
            default:
                return new ha5();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8w(int i, int i2) {
        super(i);
        this.r = i2;
    }
}
