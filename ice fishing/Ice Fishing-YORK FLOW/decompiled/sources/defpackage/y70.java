package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y70 {
    public final java.util.LinkedHashMap ZpBGe2uQfcn8;

    public y70(int i) {
        switch (i) {
            case 1:
                this.ZpBGe2uQfcn8 = new java.util.LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.ZpBGe2uQfcn8 = new java.util.LinkedHashMap();
                break;
            default:
                this.ZpBGe2uQfcn8 = new java.util.LinkedHashMap();
                break;
        }
    }

    public void ZpBGe2uQfcn8(defpackage.ne neVar, defpackage.y10 y10Var) {
        y10Var.getClass();
        java.util.LinkedHashMap linkedHashMap = this.ZpBGe2uQfcn8;
        if (linkedHashMap.containsKey(neVar)) {
            defpackage.p81.JhCgjQRTAOCT("A `initializer` with the same `clazz` has already been added: ", neVar.giKS3J6vZuNy(), ".");
        } else {
            linkedHashMap.put(neVar, new defpackage.ku1(neVar, y10Var));
        }
    }

    public defpackage.x70 giKS3J6vZuNy() {
        java.util.Collection values = this.ZpBGe2uQfcn8.values();
        values.getClass();
        defpackage.ku1[] ku1VarArr = (defpackage.ku1[]) values.toArray(new defpackage.ku1[0]);
        return new defpackage.x70((defpackage.ku1[]) java.util.Arrays.copyOf(ku1VarArr, ku1VarArr.length));
    }
}
