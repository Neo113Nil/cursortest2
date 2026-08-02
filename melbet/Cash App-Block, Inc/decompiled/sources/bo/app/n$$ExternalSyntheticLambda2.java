package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* loaded from: classes3.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ n$$ExternalSyntheticLambda2(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String registerGeofences$lambda$2$0;
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        switch (i) {
            case 0:
                return n.b(arrayList);
            case 1:
                return d0.a(arrayList);
            case 2:
                return d0.b(arrayList);
            case 3:
                return g8.a(arrayList);
            case 4:
                return mg.d(arrayList);
            case 5:
                return nf.a(arrayList);
            case 6:
                registerGeofences$lambda$2$0 = BrazeGeofenceManager.registerGeofences$lambda$2$0(arrayList);
                return registerGeofences$lambda$2$0;
            case 7:
                return Integer.valueOf(arrayList.size());
            case 8:
                return Integer.valueOf(arrayList.size());
            default:
                return ((KType) arrayList.get(0)).getClassifier();
        }
    }
}
