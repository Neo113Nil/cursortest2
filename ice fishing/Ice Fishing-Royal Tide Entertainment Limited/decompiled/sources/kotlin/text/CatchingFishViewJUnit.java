package kotlin.text;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishViewJUnit implements InvocationHandler {
    public String CatchingFishCoroutine;
    public final ArrayList CatchingFishParcelableFAB;
    public boolean CatchingFishSnackbar;

    public CatchingFishViewJUnit(ArrayList arrayList) {
        this.CatchingFishParcelableFAB = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = CatchingFishEspressoDagger.CatchingFishSnackbar;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.CatchingFishSnackbar = true;
            return null;
        }
        boolean equals = name.equals("protocols");
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        if (equals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) list.get(i);
                    if (arrayList.contains(str)) {
                        this.CatchingFishCoroutine = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.CatchingFishCoroutine = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.CatchingFishCoroutine = (String) objArr[0];
        return null;
    }
}
