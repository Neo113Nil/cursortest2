package defpackage;

/* loaded from: classes.dex */
public final class yc {
    public final java.util.HashMap IHQe1A4L2xu = new java.util.HashMap();
    public final java.util.HashMap oh6vYeIP;

    public yc(java.util.HashMap hashMap) {
        this.oh6vYeIP = hashMap;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            defpackage.md0 md0Var = (defpackage.md0) entry.getValue();
            java.util.List list = (java.util.List) this.IHQe1A4L2xu.get(md0Var);
            if (list == null) {
                list = new java.util.ArrayList();
                this.IHQe1A4L2xu.put(md0Var, list);
            }
            list.add((defpackage.zc) entry.getKey());
        }
    }

    public static void IHQe1A4L2xu(java.util.List list, defpackage.ud0 ud0Var, defpackage.md0 md0Var, java.lang.Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                defpackage.zc zcVar = (defpackage.zc) list.get(size);
                java.lang.reflect.Method method = zcVar.oh6vYeIP;
                try {
                    int i = zcVar.IHQe1A4L2xu;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, ud0Var);
                    } else if (i == 2) {
                        method.invoke(obj, ud0Var, md0Var);
                    }
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.RuntimeException(e);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
