package defpackage;

import java.util.HashMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class x6c {
    public static final x6c b = new x6c();
    public static final HashMap a = new HashMap();

    public static final void a(u6c u6cVar, v6c v6cVar) {
        v6cVar.getClass();
        u6cVar.getClass();
        m8c.c(new w6c(u6cVar, v6cVar));
    }

    public static final boolean b(v6c v6cVar) {
        boolean z;
        v6cVar.getClass();
        boolean z2 = false;
        if (v6c.Unknown != v6cVar) {
            if (v6c.Core != v6cVar) {
                String string = j3c.b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + v6cVar, null);
                if (string == null || !string.equals("12.2.0")) {
                    int i = v6cVar.a;
                    v6c B = (i & KotlinVersion.MAX_COMPONENT_VALUE) > 0 ? qld.B(i & (-256)) : (65280 & i) > 0 ? qld.B(i & (-65536)) : (16711680 & i) > 0 ? qld.B(i & (-16777216)) : qld.B(0);
                    if (B == v6cVar) {
                        switch (v6cVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 24:
                            case 25:
                            case 26:
                                break;
                            case 22:
                            case 23:
                            default:
                                z2 = true;
                                break;
                        }
                        return m8c.b("FBSDKFeature" + v6cVar, j3c.c(), z2);
                    }
                    if (b(B)) {
                        switch (v6cVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 24:
                            case 25:
                            case 26:
                                z = false;
                                break;
                            case 22:
                            case 23:
                            default:
                                z = true;
                                break;
                        }
                        if (m8c.b("FBSDKFeature" + v6cVar, j3c.c(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
