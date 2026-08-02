package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class w8w implements b97 {
    public final j7k a;
    public final jtc b;
    public final osh c;
    public final va7 d;
    public final aw6 e;
    public final ngl f;

    public w8w(j7k j7kVar, jtc jtcVar, osh oshVar, va7 va7Var, aw6 aw6Var, ngl nglVar, boolean z) {
        va7Var.getClass();
        this.a = j7kVar;
        this.b = jtcVar;
        this.c = oshVar;
        this.d = va7Var;
        this.e = aw6Var;
        this.f = nglVar;
    }

    @Override // defpackage.b97
    public final c97 d(ogg oggVar, d97 d97Var, kkp kkpVar, int i, int[] iArr, zsb zsbVar, int i2, long j, boolean z, ArrayList arrayList, pcl pclVar, t6t t6tVar, ndl ndlVar) {
        d97 d97Var2;
        kkp kkpVar2;
        CopyOnWriteArrayList copyOnWriteArrayList;
        String str;
        int i3;
        Object obj;
        nsh nshVar;
        nsh nshVar2;
        nsh nshVar3;
        oggVar.getClass();
        d97Var.getClass();
        kkpVar.getClass();
        ndlVar.getClass();
        va7 va7Var = this.d;
        vdg vdgVar = va7Var instanceof vdg ? (vdg) va7Var : null;
        if (vdgVar != null) {
            vdgVar.b(i2 != 1 ? i2 != 2 ? i2 != 3 ? TrackType.Other : TrackType.Subtitles : TrackType.Video : TrackType.Audio);
        }
        db7 a = this.d.a();
        a.getClass();
        if (t6tVar != null) {
            a.q(t6tVar);
        }
        ngl nglVar = this.f;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.a.a;
        if (copyOnWriteArrayList2.size() < 2) {
            nglVar.H("YandexDashChunkSourceFactory", "fallbackToDefault", "For some reason it is impossible to useMultipleBaseUrlsDashChunkSource", "reason=".concat("not enough base urls"));
            d97Var2 = d97Var;
            kkpVar2 = kkpVar;
            i3 = i;
        } else {
            int length = iArr.length;
            int i4 = 0;
            String str2 = null;
            loop0: while (true) {
                if (i4 >= length) {
                    d97Var2 = d97Var;
                    kkpVar2 = kkpVar;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    str = str2;
                    i3 = i;
                    break;
                }
                d97Var2 = d97Var;
                String str3 = str2;
                i3 = i;
                List<a0o> list = ((nj) d97Var2.b(i3).c.get(iArr[i4])).c;
                list.getClass();
                for (a0o a0oVar : list) {
                    yde ydeVar = a0oVar.b;
                    kkpVar2 = kkpVar;
                    mu2 F = kkpVar2.F(ydeVar);
                    if (F == null) {
                        ydeVar.getClass();
                        Object Q = CollectionsKt.Q(ydeVar);
                        Q.getClass();
                        F = (mu2) Q;
                    }
                    mu2 mu2Var = F;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    int i5 = length;
                    Timber.INSTANCE.d("format=" + a0oVar.a + "  baseurls=" + ydeVar, new Object[0]);
                    String str4 = mu2Var.a;
                    if (str3 != null) {
                        if (!str3.equals(str4)) {
                            str = null;
                            break loop0;
                        }
                    } else {
                        str3 = str4;
                    }
                    copyOnWriteArrayList2 = copyOnWriteArrayList;
                    length = i5;
                }
                i4++;
                str2 = str3;
            }
            if (str == null || str.length() == 0) {
                nglVar.H("YandexDashChunkSourceFactory", "fallbackToDefault", "For some reason it is impossible to useMultipleBaseUrlsDashChunkSource", "reason=".concat("failed find representationInitialBaseUrl"));
            } else {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (StringsKt.M(str, (String) obj, false)) {
                        break;
                    }
                }
                String str5 = (String) obj;
                String Y = str5 != null ? StringsKt.Y(str, str5) : null;
                if (Y != null) {
                    osh oshVar = this.c;
                    int hashCode = d97Var2.hashCode();
                    CopyOnWriteArrayList copyOnWriteArrayList3 = this.a.a;
                    synchronized (oshVar) {
                        try {
                            copyOnWriteArrayList3.getClass();
                            Integer num = (Integer) oshVar.b;
                            if (num != null && num.intValue() == hashCode && (nshVar = (nsh) oshVar.c) != null) {
                                nshVar2 = nshVar;
                            }
                            nsh nshVar4 = (nsh) oshVar.c;
                            if (nshVar4 != null) {
                                nshVar4.J();
                            }
                            oshVar.c = new nsh(copyOnWriteArrayList3, (c43) oshVar.a, new mhm());
                            oshVar.b = Integer.valueOf(hashCode);
                            nshVar2 = (nsh) oshVar.c;
                            nshVar2.getClass();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    nshVar2.k(i2).c(Y);
                    jtc jtcVar = this.b;
                    synchronized (jtcVar.a) {
                        uah.o((LinkedHashMap) jtcVar.b);
                    }
                    this.f.H("YandexDashChunkSourceFactory", "createDashChunkSource", "create MultipleBaseUrlsDashChunkSource", "allBaseUrls.size=" + copyOnWriteArrayList.size(), k5r.i(i2, "type="), "baseUrlPostfix=".concat(Y));
                    nshVar3 = nshVar2;
                    u8w u8wVar = new u8w(new bz2(2), oggVar, d97Var2, kkpVar2, i3, iArr, zsbVar, i2, a, j, z, arrayList, pclVar, nshVar3, this.e, this.f, ndlVar);
                    Timber.INSTANCE.d("YandexCachedPriorityDashChunkSource created", new Object[0]);
                    return u8wVar;
                }
            }
        }
        nshVar3 = null;
        u8w u8wVar2 = new u8w(new bz2(2), oggVar, d97Var2, kkpVar2, i3, iArr, zsbVar, i2, a, j, z, arrayList, pclVar, nshVar3, this.e, this.f, ndlVar);
        Timber.INSTANCE.d("YandexCachedPriorityDashChunkSource created", new Object[0]);
        return u8wVar2;
    }
}
