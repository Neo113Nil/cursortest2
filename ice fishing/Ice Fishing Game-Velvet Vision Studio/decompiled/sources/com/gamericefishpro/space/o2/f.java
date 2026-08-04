package com.gamericefishpro.space.o2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public static final f d = new f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.n1.c cVarH = ((o) obj).h();
                com.gamericefishpro.space.n1.c cVarH2 = ((o) obj2).h();
                int iCompare = Float.compare(cVarH.a, cVarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.b, cVarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.d, cVarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.c, cVarH2.c);
            case 1:
                com.gamericefishpro.space.n1.c cVarH3 = ((o) obj).h();
                com.gamericefishpro.space.n1.c cVarH4 = ((o) obj2).h();
                int iCompare4 = Float.compare(cVarH4.c, cVarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.b, cVarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.d, cVarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.a, cVarH3.a);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((com.gamericefishpro.space.n1.c) pair.d).b, ((com.gamericefishpro.space.n1.c) pair2.d).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((com.gamericefishpro.space.n1.c) pair.d).d, ((com.gamericefishpro.space.n1.c) pair2.d).d);
        }
    }
}
