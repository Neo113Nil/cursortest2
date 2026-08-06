package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q10 {
    public final LinkedHashMap GWasM1elztuh;

    public q10(int i) {
        switch (i) {
            case 1:
                this.GWasM1elztuh = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.GWasM1elztuh = new LinkedHashMap();
                break;
        }
    }

    public void GWasM1elztuh(va vaVar, hv hvVar) {
        hvVar.getClass();
        LinkedHashMap linkedHashMap = this.GWasM1elztuh;
        if (linkedHashMap.containsKey(vaVar)) {
            o4.iwATDS1i01k("A `initializer` with the same `clazz` has already been added: ", vaVar.GWasM1elztuh(), ".");
        } else {
            linkedHashMap.put(vaVar, new ye1(vaVar, hvVar));
        }
    }

    public p10 Yi7zF1RB1() {
        Collection values = this.GWasM1elztuh.values();
        values.getClass();
        ye1[] ye1VarArr = (ye1[]) values.toArray(new ye1[0]);
        return new p10((ye1[]) Arrays.copyOf(ye1VarArr, ye1VarArr.length));
    }
}
