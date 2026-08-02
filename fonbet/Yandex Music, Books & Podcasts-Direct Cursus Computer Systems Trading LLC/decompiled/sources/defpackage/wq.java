package defpackage;

import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final /* synthetic */ class wq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ wq(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        r10 r10Var = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = this.b;
        switch (i) {
            case 0:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT artist_id FROM album_artist WHERE album_id = ?");
                try {
                    D0.E(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(D0.x0(0));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0("SELECT trackOrder FROM albumTrackOrder WHERE albumId = ?");
                try {
                    D02.E(1, str);
                    if (D02.q()) {
                        Integer valueOf = D02.isNull(0) ? null : Integer.valueOf((int) D02.getLong(0));
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            r10.b.getClass();
                            r10[] values = r10.values();
                            int length = values.length;
                            while (true) {
                                if (i2 < length) {
                                    r10 r10Var2 = values[i2];
                                    if (r10Var2.a == intValue) {
                                        r10Var = r10Var2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                    return r10Var;
                } finally {
                }
            case 2:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                cko D03 = xjoVar3.D0("DELETE FROM albumTrackOrder WHERE albumId = ?");
                try {
                    D03.E(1, str);
                    D03.q();
                    D03.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                cko D04 = xjoVar4.D0("SELECT * FROM artistDisclaimers WHERE artistId = ?");
                try {
                    D04.E(1, str);
                    int v = s7g.v(D04, "_id");
                    int v2 = s7g.v(D04, "artistId");
                    int v3 = s7g.v(D04, "foreignAgentText");
                    ArrayList arrayList2 = new ArrayList();
                    while (D04.q()) {
                        arrayList2.add(new s51(D04.getLong(v), D04.x0(v2), D04.x0(v3)));
                    }
                    return arrayList2;
                } finally {
                }
            case 4:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, str);
                wfp.t(jfpVar, "artist_top_listen_time");
                return Unit.a;
            case 5:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.s(jfpVar2, str);
                return Unit.a;
            case 6:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.k(jfpVar3, str);
                wfp.q(jfpVar3, 0);
                return Unit.a;
            case 7:
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                ngg.G(ifpVar, str);
                return Unit.a;
            case 8:
                ifp ifpVar2 = (ifp) obj;
                ifpVar2.getClass();
                ngg.G(ifpVar2, str);
                return Unit.a;
            case 9:
                kn0 kn0Var = (kn0) obj;
                kn0Var.getClass();
                glr.a(kn0Var, " • ", str);
                return Unit.a;
            case 10:
                kn0 kn0Var2 = (kn0) obj;
                kn0Var2.getClass();
                glr.a(kn0Var2, " • ", str);
                return Unit.a;
            case 11:
                kn0 kn0Var3 = (kn0) obj;
                kn0Var3.getClass();
                glr.a(kn0Var3, " • ", str);
                return Unit.a;
            case 12:
                kn0 kn0Var4 = (kn0) obj;
                kn0Var4.getClass();
                glr.a(kn0Var4, " • ", str);
                return Unit.a;
            case 13:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.q(jfpVar4, 0);
                wfp.k(jfpVar4, str);
                return Unit.a;
            case 14:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.k(jfpVar5, str);
                return Unit.a;
            case 15:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.k(jfpVar6, str);
                return Unit.a;
            case 16:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.u(jfpVar7, new mn0(6, str, (ArrayList) null));
                wfp.q(jfpVar7, 0);
                return Unit.a;
            case 17:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.k(jfpVar8, str);
                return Unit.a;
            case 18:
                wm6 wm6Var = (wm6) obj;
                wm6Var.getClass();
                ssg.a(7, "DataStoreProviderImpl", "Pref file " + str + " corrupted", wm6Var);
                hmm.b[] bVarArr = (hmm.b[]) Arrays.copyOf(new hmm.b[0], 0);
                lpi lpiVar = new lpi(false);
                hmm.b[] bVarArr2 = (hmm.b[]) Arrays.copyOf(bVarArr, bVarArr.length);
                lpiVar.d();
                if (bVarArr2.length <= 0) {
                    return lpiVar;
                }
                hmm.b bVar = bVarArr2[0];
                throw null;
            case 19:
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                cko D05 = xjoVar5.D0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    D05.E(1, str);
                    if (D05.q()) {
                        z2 = ((int) D05.getLong(0)) != 0;
                    }
                    D05.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 20:
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                cko D06 = xjoVar6.D0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    D06.E(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (D06.q()) {
                        arrayList3.add(D06.x0(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 21:
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                cko D07 = xjoVar7.D0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    D07.E(1, str);
                    if (D07.q()) {
                        z = ((int) D07.getLong(0)) != 0;
                    }
                    D07.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 22:
                jfp jfpVar9 = (jfp) obj;
                jfpVar9.getClass();
                wfp.k(jfpVar9, str);
                wfp.q(jfpVar9, 0);
                return Unit.a;
            case 23:
                jfp jfpVar10 = (jfp) obj;
                jfpVar10.getClass();
                wfp.k(jfpVar10, str);
                return Unit.a;
            case 24:
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                cko D08 = xjoVar8.D0("DELETE FROM downloadedAlbums WHERE albumId = ?");
                try {
                    D08.E(1, str);
                    D08.q();
                    D08.close();
                    return Unit.a;
                } finally {
                }
            case 25:
                jfp jfpVar11 = (jfp) obj;
                jfpVar11.getClass();
                wfp.k(jfpVar11, str);
                return Unit.a;
            case 26:
                jfp jfpVar12 = (jfp) obj;
                jfpVar12.getClass();
                wfp.k(jfpVar12, str);
                wfp.x(jfpVar12, -2.0f);
                return Unit.a;
            case 27:
                gh ghVar = (gh) obj;
                ghVar.getClass();
                str.getClass();
                if (!ghVar.b) {
                    r4 = ghVar.a();
                    ghVar.b = r4;
                }
                if (r4) {
                    FileOutputStream fileOutputStream = ghVar.c;
                    fileOutputStream.getClass();
                    FileChannel channel = fileOutputStream.getChannel();
                    BufferedOutputStream bufferedOutputStream = ghVar.d;
                    bufferedOutputStream.getClass();
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    try {
                        channel.getClass();
                        FileLock lock = channel.lock();
                        try {
                            bufferedOutputStream.write(bytes);
                            bufferedOutputStream.write(gh.e);
                            bufferedOutputStream.flush();
                            if (lock != null && lock.isValid()) {
                                lock.release();
                            }
                        } catch (Throwable th) {
                            if (lock != null && lock.isValid()) {
                                lock.release();
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        ghVar.b = false;
                    }
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jfp jfpVar13 = (jfp) obj;
                jfpVar13.getClass();
                wfp.k(jfpVar13, str);
                wfp.q(jfpVar13, 0);
                return Unit.a;
            default:
                jfp jfpVar14 = (jfp) obj;
                jfpVar14.getClass();
                wfp.u(jfpVar14, new mn0(str));
                return Unit.a;
        }
    }
}
