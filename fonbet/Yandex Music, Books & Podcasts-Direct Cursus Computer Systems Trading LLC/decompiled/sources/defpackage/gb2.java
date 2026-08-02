package defpackage;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class gb2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ css b;

    public /* synthetic */ gb2(css cssVar, int i) {
        this.a = i;
        this.b = cssVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        String str;
        String str2;
        String str3;
        String str4;
        zvs zvsVar;
        Integer valueOf;
        Boolean bool;
        switch (this.a) {
            case 0:
                css cssVar = this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("\n        SELECT auto_info.* FROM auto_tracks_cache_info AS auto_info\n        LEFT JOIN tracks_cache AS cache_info ON auto_info.track_id = cache_info.track_id\n        WHERE cache_info.cache_type = ?\n        ");
                try {
                    cssVar.getClass();
                    int ordinal = cssVar.ordinal();
                    if (ordinal == 0) {
                        str = "Temp";
                    } else if (ordinal == 1) {
                        str = "Auto";
                    } else if (ordinal == 2) {
                        str = "Smart";
                    } else if (ordinal == 3) {
                        str = "Strong";
                    } else {
                        if (ordinal != 4) {
                            throw new x7j();
                        }
                        str = "Weak";
                    }
                    D0.E(1, str);
                    int v = s7g.v(D0, "track_id");
                    int v2 = s7g.v(D0, "cache_info");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v);
                        String x02 = D0.x0(v2);
                        x02.getClass();
                        JsonObject m = JsonParser.b(x02).m();
                        if (m.v("version").a() != 1) {
                            throw new IllegalArgumentException("Unsupported auto tracks cache table version: 1");
                        }
                        arrayList.add(new ib2(x0, new x62(((JsonObject) m.a.get(Constants.KEY_VALUE)).v("lastUseTimestamp").o())));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                css cssVar2 = this.b;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("\n        SELECT auto_info.* FROM auto_tracks_cache_info AS auto_info\n        LEFT JOIN tracks_cache AS cache_info ON auto_info.track_id = cache_info.track_id\n        WHERE cache_info.cache_type = ?\n        ");
                try {
                    cssVar2.getClass();
                    int ordinal2 = cssVar2.ordinal();
                    if (ordinal2 == 0) {
                        str2 = "Temp";
                    } else if (ordinal2 == 1) {
                        str2 = "Auto";
                    } else if (ordinal2 == 2) {
                        str2 = "Smart";
                    } else if (ordinal2 == 3) {
                        str2 = "Strong";
                    } else {
                        if (ordinal2 != 4) {
                            throw new x7j();
                        }
                        str2 = "Weak";
                    }
                    D0.E(1, str2);
                    int v3 = s7g.v(D0, "track_id");
                    int v4 = s7g.v(D0, "cache_info");
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        String x03 = D0.x0(v3);
                        String x04 = D0.x0(v4);
                        x04.getClass();
                        JsonObject m2 = JsonParser.b(x04).m();
                        if (m2.v("version").a() != 1) {
                            throw new IllegalArgumentException("Unsupported auto tracks cache table version: 1");
                        }
                        arrayList2.add(new ib2(x03, new x62(((JsonObject) m2.a.get(Constants.KEY_VALUE)).v("lastUseTimestamp").o())));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                css cssVar3 = this.b;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("UPDATE tracks_cache SET cache_type = ?");
                try {
                    cssVar3.getClass();
                    int ordinal3 = cssVar3.ordinal();
                    if (ordinal3 == 0) {
                        str3 = "Temp";
                    } else if (ordinal3 == 1) {
                        str3 = "Auto";
                    } else if (ordinal3 == 2) {
                        str3 = "Smart";
                    } else if (ordinal3 == 3) {
                        str3 = "Strong";
                    } else {
                        if (ordinal3 != 4) {
                            throw new x7j();
                        }
                        str3 = "Weak";
                    }
                    D0.E(1, str3);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                    D0.close();
                }
            default:
                css cssVar4 = this.b;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("SELECT * FROM tracks_cache WHERE cache_type = ?");
                try {
                    cssVar4.getClass();
                    int ordinal4 = cssVar4.ordinal();
                    if (ordinal4 == 0) {
                        str4 = "Temp";
                    } else if (ordinal4 == 1) {
                        str4 = "Auto";
                    } else if (ordinal4 == 2) {
                        str4 = "Smart";
                    } else if (ordinal4 == 3) {
                        str4 = "Strong";
                    } else {
                        if (ordinal4 != 4) {
                            throw new x7j();
                        }
                        str4 = "Weak";
                    }
                    D0.E(1, str4);
                    int v5 = s7g.v(D0, "track_id");
                    int v6 = s7g.v(D0, "quality");
                    int v7 = s7g.v(D0, "storage");
                    int v8 = s7g.v(D0, "cache_type");
                    int v9 = s7g.v(D0, "container");
                    int v10 = s7g.v(D0, "added_timestamp");
                    int v11 = s7g.v(D0, "uri");
                    int v12 = s7g.v(D0, "gain");
                    int v13 = s7g.v(D0, "truePeakDb");
                    int v14 = s7g.v(D0, "integratedLoudnessDb");
                    int v15 = s7g.v(D0, "codec");
                    int v16 = s7g.v(D0, "bitrate");
                    int v17 = s7g.v(D0, "realQuality");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        String x05 = D0.x0(v5);
                        x05.getClass();
                        int i = v5;
                        zvs zvsVar2 = new zvs(x05);
                        o5n W = c9g.W(D0.x0(v6));
                        thr X = c9g.X(D0.x0(v7));
                        css O = c9g.O(D0.x0(v8));
                        bb6 Q = c9g.Q(D0.x0(v9));
                        long j = D0.getLong(v10);
                        String x06 = D0.x0(v11);
                        if (D0.isNull(v12)) {
                            zvsVar = zvsVar2;
                            valueOf = null;
                        } else {
                            zvsVar = zvsVar2;
                            valueOf = Integer.valueOf((int) D0.getLong(v12));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        arrayList3.add(new n3t(zvsVar, W, X, O, Q, j, x06, bool, D0.isNull(v13) ? null : Float.valueOf((float) D0.getDouble(v13)), D0.isNull(v14) ? null : Float.valueOf((float) D0.getDouble(v14)), c9g.P(D0.x0(v15)), (int) D0.getLong(v16), c9g.W(D0.x0(v17))));
                        v5 = i;
                    }
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
