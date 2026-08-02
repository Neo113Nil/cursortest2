package defpackage;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class os2 implements rzm {
    public final /* synthetic */ int a;

    public /* synthetic */ os2(int i) {
        this.a = i;
    }

    @Override // defpackage.szm
    public final Object get() {
        Object newInstance;
        Method method;
        switch (this.a) {
            case 0:
                return new wm();
            case 1:
                return new e7w();
            case 2:
                dq7 dq7Var = ca8.a;
                return gld.e(mn7.d);
            case 3:
                return y0q.b(0, 0, null, 7);
            case 4:
                return y0q.b(0, 1, null, 5);
            case 5:
                return men.g(0, 7, null);
            case 6:
                return new yuo();
            case 7:
                return y0q.b(0, 0, null, 7);
            case 8:
                return y0q.b(0, 0, null, 7);
            case 9:
                return new efs();
            case 10:
                return new rwd(20);
            case 11:
                return new qc9(new gy2(3));
            case 12:
                return new bf();
            case 13:
                ny6 ny6Var = new ny6();
                ny6Var.a = gx3.x0;
                return ny6Var;
            case 14:
                return new ahu();
            case 15:
                try {
                    Class<?> cls = Class.forName("com.yandex.payment.sdk.flex.impl.FlexAdapterFactory");
                    newInstance = cls.getConstructor(null).newInstance(null);
                    method = cls.getMethod("create", null);
                } catch (ClassNotFoundException e) {
                    LinkedHashMap linkedHashMap = sqg.a;
                    uwf.l("Error creating FlexAdapter: " + e.getMessage());
                }
                if (!nhc.class.isAssignableFrom(method.getReturnType())) {
                    return null;
                }
                method.invoke(newInstance, null).getClass();
                throw new ClassCastException();
            case 16:
                bhg bhgVar = new bhg();
                bhgVar.a = grb.Z;
                return bhgVar;
            case 17:
                return new hek();
            case 18:
                return new egk();
            case 19:
                return new bf();
            case 20:
                hpo hpoVar = new hpo();
                hpoVar.a = true;
                hpoVar.b = xuj.Z;
                return hpoVar;
            case 21:
                return new ahu();
            case 22:
                return new bxi();
            default:
                return new bxi();
        }
    }

    public /* synthetic */ os2(int i, Object obj) {
        this.a = i;
    }
}
