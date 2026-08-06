package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qe {
    public final java.util.HashMap ZpBGe2uQfcn8 = new java.util.HashMap();
    public final java.util.HashMap giKS3J6vZuNy;

    public qe(java.util.HashMap hashMap) {
        this.giKS3J6vZuNy = hashMap;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            defpackage.og0 og0Var = (defpackage.og0) entry.getValue();
            java.util.List list = (java.util.List) this.ZpBGe2uQfcn8.get(og0Var);
            if (list == null) {
                list = new java.util.ArrayList();
                this.ZpBGe2uQfcn8.put(og0Var, list);
            }
            list.add((defpackage.re) entry.getKey());
        }
    }

    public static void ZpBGe2uQfcn8(java.util.List list, defpackage.wg0 wg0Var, defpackage.og0 og0Var, java.lang.Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                defpackage.re reVar = (defpackage.re) list.get(size);
                java.lang.reflect.Method method = reVar.giKS3J6vZuNy;
                try {
                    int i = reVar.ZpBGe2uQfcn8;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, wg0Var);
                    } else if (i == 2) {
                        method.invoke(obj, wg0Var, og0Var);
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
