package defpackage;

import com.combinations.level.experts.core.domain.model.LevelSpec;
import com.combinations.level.experts.core.domain.model.Sector;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class h90 {
    public static final List GWasM1elztuh;
    public static final int Yi7zF1RB1;

    static {
        List rezfBrjOrqK = fb1.rezfBrjOrqK(new Sector(0, "Verdant Mire", 0, 12, 3, 5), new Sector(1, "Crystal Wastes", 12, 12, 4, 6), new Sector(2, "Magma Rift", 24, 12, 5, 7), new Sector(3, "Void Spires", 36, 12, 6, 8));
        GWasM1elztuh = rezfBrjOrqK;
        Iterator it = rezfBrjOrqK.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Sector) it.next()).getLevelCount();
        }
        Yi7zF1RB1 = i;
    }

    public static Sector GWasM1elztuh(int i) {
        Object obj;
        List list = GWasM1elztuh;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Sector) obj).contains(i)) {
                break;
            }
        }
        Sector sector = (Sector) obj;
        return sector == null ? (Sector) rb.vaTCmWUgXF(list) : sector;
    }

    public static LevelSpec Yi7zF1RB1(int i) {
        int encWxUiV2 = o50.encWxUiV2(i, 0, Yi7zF1RB1 - 1);
        Sector GWasM1elztuh2 = GWasM1elztuh(encWxUiV2);
        int encWxUiV22 = o50.encWxUiV2((((encWxUiV2 - GWasM1elztuh2.getFirstLevel()) * ((GWasM1elztuh2.getLargestGrid() - GWasM1elztuh2.getSmallestGrid()) + 1)) / GWasM1elztuh2.getLevelCount()) + GWasM1elztuh2.getSmallestGrid(), GWasM1elztuh2.getSmallestGrid(), GWasM1elztuh2.getLargestGrid());
        return new LevelSpec(encWxUiV2, GWasM1elztuh2, encWxUiV22, encWxUiV22, (encWxUiV2 * (-7046029254386353131L)) ^ 25214903917L);
    }
}
