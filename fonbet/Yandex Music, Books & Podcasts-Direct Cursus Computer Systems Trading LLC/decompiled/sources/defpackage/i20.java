package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ i20(String str, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zvs zvsVar;
        Integer valueOf;
        switch (this.a) {
            case 0:
                List list = this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0(this.b);
                try {
                    Iterator it = list.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        D0.E(i, (String) it.next());
                        i++;
                    }
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            case 1:
                List list2 = this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0(this.b);
                try {
                    Iterator it2 = list2.iterator();
                    int i2 = 1;
                    while (it2.hasNext()) {
                        D02.E(i2, (String) it2.next());
                        i2++;
                    }
                    D02.q();
                    D02.close();
                    return Unit.a;
                } catch (Throwable th2) {
                    D02.close();
                    throw th2;
                }
            case 2:
                List list3 = this.c;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                cko D03 = xjoVar3.D0(this.b);
                try {
                    Iterator it3 = list3.iterator();
                    int i3 = 1;
                    while (it3.hasNext()) {
                        D03.E(i3, (String) it3.next());
                        i3++;
                    }
                    int v = s7g.v(D03, "original_id");
                    int v2 = s7g.v(D03, "name");
                    int v3 = s7g.v(D03, "name_surrogate");
                    int v4 = s7g.v(D03, "liked");
                    int v5 = s7g.v(D03, "disliked");
                    int v6 = s7g.v(D03, "timestamp");
                    int v7 = s7g.v(D03, "various");
                    int v8 = s7g.v(D03, "cover_uri");
                    int v9 = s7g.v(D03, "albums_stale");
                    int v10 = s7g.v(D03, "tracks_stale");
                    int v11 = s7g.v(D03, "artist_for_kids");
                    int v12 = s7g.v(D03, "artist_disclaimer");
                    int v13 = s7g.v(D03, "available");
                    int v14 = s7g.v(D03, "cover_type");
                    int v15 = s7g.v(D03, "cutout_cover_uri");
                    ArrayList arrayList = new ArrayList();
                    while (D03.q()) {
                        String x0 = D03.x0(v);
                        String x02 = D03.x0(v2);
                        String x03 = D03.x0(v3);
                        int i4 = v2;
                        int i5 = v3;
                        int i6 = v4;
                        int i7 = v5;
                        int i8 = v15;
                        arrayList.add(new q51(x0, x02, x03, ((int) D03.getLong(v4)) != 0, ((int) D03.getLong(v5)) != 0, D03.x0(v6), ((int) D03.getLong(v7)) != 0, D03.isNull(v8) ? null : D03.x0(v8), (int) D03.getLong(v9), (int) D03.getLong(v10), ((int) D03.getLong(v11)) != 0, D03.isNull(v12) ? null : D03.x0(v12), ((int) D03.getLong(v13)) != 0, D03.isNull(v14) ? null : D03.x0(v14), D03.isNull(i8) ? null : D03.x0(i8)));
                        v15 = i8;
                        v4 = i6;
                        v2 = i4;
                        v3 = i5;
                        v5 = i7;
                    }
                    D03.close();
                    return arrayList;
                } catch (Throwable th3) {
                    D03.close();
                    throw th3;
                }
            case 3:
                List list4 = this.c;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                cko D04 = xjoVar4.D0(this.b);
                try {
                    Iterator it4 = list4.iterator();
                    int i9 = 1;
                    while (it4.hasNext()) {
                        D04.E(i9, (String) it4.next());
                        i9++;
                    }
                    D04.q();
                    D04.close();
                    return Unit.a;
                } catch (Throwable th4) {
                    D04.close();
                    throw th4;
                }
            case 4:
                List list5 = this.c;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                cko D05 = xjoVar5.D0(this.b);
                try {
                    Iterator it5 = list5.iterator();
                    int i10 = 1;
                    while (it5.hasNext()) {
                        D05.bindLong(i10, ((Number) it5.next()).longValue());
                        i10++;
                    }
                    D05.q();
                    D05.close();
                    return Unit.a;
                } catch (Throwable th5) {
                    D05.close();
                    throw th5;
                }
            case 5:
                List list6 = this.c;
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                cko D06 = xjoVar6.D0(this.b);
                try {
                    Iterator it6 = list6.iterator();
                    int i11 = 1;
                    while (it6.hasNext()) {
                        D06.bindLong(i11, ((Number) it6.next()).longValue());
                        i11++;
                    }
                    D06.q();
                    D06.close();
                    return Unit.a;
                } catch (Throwable th6) {
                    D06.close();
                    throw th6;
                }
            case 6:
                List list7 = this.c;
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                cko D07 = xjoVar7.D0(this.b);
                try {
                    Iterator it7 = list7.iterator();
                    int i12 = 1;
                    while (it7.hasNext()) {
                        D07.bindLong(i12, ((Number) it7.next()).longValue());
                        i12++;
                    }
                    int v16 = s7g.v(D07, "_id");
                    int v17 = s7g.v(D07, "playlist_id");
                    int v18 = s7g.v(D07, "operation");
                    int v19 = s7g.v(D07, "position");
                    int v20 = s7g.v(D07, "track_id");
                    int v21 = s7g.v(D07, "album_id");
                    int v22 = s7g.v(D07, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (D07.q()) {
                        arrayList2.add(new jys(D07.isNull(v16) ? null : Long.valueOf(D07.getLong(v16)), D07.isNull(v17) ? null : Long.valueOf(D07.getLong(v17)), D07.isNull(v18) ? null : Integer.valueOf((int) D07.getLong(v18)), D07.isNull(v19) ? null : Integer.valueOf((int) D07.getLong(v19)), D07.isNull(v20) ? null : D07.x0(v20), D07.isNull(v21) ? null : D07.x0(v21), D07.isNull(v22) ? null : Long.valueOf(D07.getLong(v22))));
                    }
                    D07.close();
                    return arrayList2;
                } catch (Throwable th7) {
                    D07.close();
                    throw th7;
                }
            case 7:
                List<zvs> list8 = this.c;
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                cko D08 = xjoVar8.D0(this.b);
                try {
                    int i13 = 1;
                    for (zvs zvsVar2 : list8) {
                        zvsVar2.getClass();
                        D08.E(i13, zvsVar2.a);
                        i13++;
                    }
                    int v23 = s7g.v(D08, "track_id");
                    int v24 = s7g.v(D08, "quality");
                    int v25 = s7g.v(D08, "storage");
                    int v26 = s7g.v(D08, "cache_type");
                    int v27 = s7g.v(D08, "container");
                    int v28 = s7g.v(D08, "added_timestamp");
                    int v29 = s7g.v(D08, "uri");
                    int v30 = s7g.v(D08, "gain");
                    int v31 = s7g.v(D08, "truePeakDb");
                    int v32 = s7g.v(D08, "integratedLoudnessDb");
                    int v33 = s7g.v(D08, "codec");
                    int v34 = s7g.v(D08, "bitrate");
                    int v35 = s7g.v(D08, "realQuality");
                    ArrayList arrayList3 = new ArrayList();
                    while (D08.q()) {
                        String x04 = D08.x0(v23);
                        x04.getClass();
                        int i14 = v23;
                        zvs zvsVar3 = new zvs(x04);
                        o5n W = c9g.W(D08.x0(v24));
                        thr X = c9g.X(D08.x0(v25));
                        css O = c9g.O(D08.x0(v26));
                        bb6 Q = c9g.Q(D08.x0(v27));
                        long j = D08.getLong(v28);
                        String x05 = D08.x0(v29);
                        if (D08.isNull(v30)) {
                            zvsVar = zvsVar3;
                            valueOf = null;
                        } else {
                            zvsVar = zvsVar3;
                            valueOf = Integer.valueOf((int) D08.getLong(v30));
                        }
                        arrayList3.add(new n3t(zvsVar, W, X, O, Q, j, x05, valueOf != null ? Boolean.valueOf(valueOf.intValue() != 0) : null, D08.isNull(v31) ? null : Float.valueOf((float) D08.getDouble(v31)), D08.isNull(v32) ? null : Float.valueOf((float) D08.getDouble(v32)), c9g.P(D08.x0(v33)), (int) D08.getLong(v34), c9g.W(D08.x0(v35))));
                        v23 = i14;
                    }
                    D08.close();
                    return arrayList3;
                } catch (Throwable th8) {
                    D08.close();
                    throw th8;
                }
            case 8:
                List<zvs> list9 = this.c;
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                cko D09 = xjoVar9.D0(this.b);
                try {
                    int i15 = 1;
                    for (zvs zvsVar4 : list9) {
                        zvsVar4.getClass();
                        D09.E(i15, zvsVar4.a);
                        i15++;
                    }
                    D09.q();
                    D09.close();
                    return Unit.a;
                } catch (Throwable th9) {
                    D09.close();
                    throw th9;
                }
            case 9:
                List list10 = this.c;
                xjo xjoVar10 = (xjo) obj;
                xjoVar10.getClass();
                cko D010 = xjoVar10.D0(this.b);
                try {
                    Iterator it8 = list10.iterator();
                    int i16 = 1;
                    while (it8.hasNext()) {
                        D010.E(i16, (String) it8.next());
                        i16++;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    while (D010.q()) {
                        arrayList4.add(D010.x0(0));
                    }
                    D010.close();
                    return arrayList4;
                } catch (Throwable th10) {
                    D010.close();
                    throw th10;
                }
            case 10:
                List list11 = this.c;
                xjo xjoVar11 = (xjo) obj;
                xjoVar11.getClass();
                cko D011 = xjoVar11.D0(this.b);
                try {
                    Iterator it9 = list11.iterator();
                    int i17 = 1;
                    while (it9.hasNext()) {
                        D011.E(i17, (String) it9.next());
                        i17++;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    while (D011.q()) {
                        arrayList5.add(new ers(D011.x0(0), D011.x0(1)));
                    }
                    D011.close();
                    return arrayList5;
                } catch (Throwable th11) {
                    D011.close();
                    throw th11;
                }
            case 11:
                List list12 = this.c;
                xjo xjoVar12 = (xjo) obj;
                xjoVar12.getClass();
                cko D012 = xjoVar12.D0(this.b);
                try {
                    Iterator it10 = list12.iterator();
                    int i18 = 1;
                    while (it10.hasNext()) {
                        D012.E(i18, (String) it10.next());
                        i18++;
                    }
                    D012.q();
                    D012.close();
                    return Unit.a;
                } catch (Throwable th12) {
                    D012.close();
                    throw th12;
                }
            case 12:
                List list13 = this.c;
                xjo xjoVar13 = (xjo) obj;
                xjoVar13.getClass();
                cko D013 = xjoVar13.D0(this.b);
                try {
                    Iterator it11 = list13.iterator();
                    int i19 = 1;
                    while (it11.hasNext()) {
                        D013.bindLong(i19, ((Number) it11.next()).longValue());
                        i19++;
                    }
                    D013.q();
                    D013.close();
                    return Unit.a;
                } catch (Throwable th13) {
                    D013.close();
                    throw th13;
                }
            case 13:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, this.b);
                wfp.l(jfpVar, this.c);
                return Unit.a;
            default:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.k(jfpVar2, this.b);
                wfp.l(jfpVar2, this.c);
                return Unit.a;
        }
    }
}
