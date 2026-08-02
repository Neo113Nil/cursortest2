package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.player.content.remote.fileinfo.FileInfoApi;
import com.yandex.music.shared.player.content.remote.fileinfo.FileInfoDto;
import com.yandex.music.shared.player.content.remote.fileinfo.GetFileInfoDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class s8d {
    public final i0j a;
    public final j1o b;
    public final zzp c;
    public final jyr d;
    public final jyr e;
    public final ArrayList f;

    public s8d(b7q b7qVar, i0j i0jVar, j1o j1oVar, zzp zzpVar) {
        this.a = i0jVar;
        this.b = j1oVar;
        this.c = zzpVar;
        b7qVar.b(hag.I(tcl.class), true);
        this.d = b7qVar.b(hag.I(h92.class), true);
        this.e = btf.b(new ita(26, this));
        oq4.b.getClass();
        List list = oq4.c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oq4) it.next()).a);
        }
        this.f = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01aa, code lost:
    
        if (r1 == r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0219, code lost:
    
        if (r2.equals("preview") == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String, zvs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zvs zvsVar, o5n o5nVar, gy1 gy1Var, cg6 cg6Var) {
        r8d r8dVar;
        int i;
        String str;
        Integer num;
        int i2;
        String str2;
        zvs zvsVar2;
        String str3;
        long j;
        e92 e92Var;
        Object a;
        String str4;
        long j2;
        Integer num2;
        Integer num3;
        String str5;
        String str6;
        Object N;
        qx1 qx1Var;
        String str7;
        yzi yziVar;
        x9c x9cVar;
        String quality;
        o5n o5nVar2;
        o5n o5nVar3;
        String codec;
        Object obj;
        Integer bitrate;
        String url;
        Boolean gain;
        if (cg6Var instanceof r8d) {
            r8dVar = (r8d) cg6Var;
            int i3 = r8dVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r8dVar.p = i3 - Integer.MIN_VALUE;
                Object obj2 = r8dVar.n;
                nm6 nm6Var = nm6.a;
                i = r8dVar.p;
                ArrayList arrayList = this.f;
                if (i != 0) {
                    qgg.h0(obj2);
                    long b = this.c.b() / 1000;
                    o5nVar.getClass();
                    gy1Var.getClass();
                    String T = gy1Var != gy1.c ? gy1Var.a : vnj.T(o5nVar);
                    arrayList.getClass();
                    zvsVar.getClass();
                    str = "";
                    num = null;
                    i2 = 1;
                    String str8 = b + zvsVar + T + CollectionsKt.X(arrayList, "", null, null, null, 62) + "encraw";
                    pn3 pn3Var = pn3.d;
                    String a2 = ovn.C(str8).f(ovn.C("p93jhgh689SBReK6ghtw62")).a();
                    int Q = StringsKt.Q(a2);
                    while (true) {
                        if (-1 >= Q) {
                            str2 = str;
                            break;
                        }
                        if (a2.charAt(Q) != '=') {
                            str2 = a2.substring(0, Q + 1);
                            break;
                        }
                        Q--;
                    }
                    if (o5nVar == o5n.a) {
                        h92 h92Var = (h92) this.d.getValue();
                        r8dVar.j = zvsVar;
                        r8dVar.k = T;
                        r8dVar.l = str2;
                        r8dVar.m = b;
                        r8dVar.p = 1;
                        a = h92Var.a(r8dVar);
                        if (a != nm6Var) {
                            zvsVar2 = zvsVar;
                            str4 = T;
                            j2 = b;
                        }
                        return nm6Var;
                    }
                    zvsVar2 = zvsVar;
                    str3 = T;
                    j = b;
                    e92Var = null;
                    String str9 = str2;
                    FileInfoApi fileInfoApi = (FileInfoApi) this.e.getValue();
                    String str10 = zvsVar2.a;
                    String X = CollectionsKt.X(arrayList, StringUtils.COMMA, null, null, null, 62);
                    if (e92Var != null) {
                        int i4 = e92Var.a;
                        num2 = i4 == -1 ? num : Integer.valueOf(i4);
                    } else {
                        num2 = num;
                    }
                    if (e92Var != null) {
                        int i5 = e92Var.b;
                        num3 = i5 == -1 ? num : Integer.valueOf(i5);
                    } else {
                        num3 = num;
                    }
                    if (e92Var != null || (yziVar = e92Var.c) == null) {
                        str5 = num;
                    } else {
                        int ordinal = yziVar.ordinal();
                        String str11 = "wifi";
                        if (ordinal != 0) {
                            if (ordinal == i2) {
                                str11 = "mobile";
                            } else if (ordinal != 2) {
                                if (ordinal != 3) {
                                    b6e.s();
                                    return num;
                                }
                                str11 = num;
                            }
                        }
                        str5 = str11;
                    }
                    if (e92Var != null || (qx1Var = e92Var.d) == null) {
                        str6 = num;
                    } else {
                        int ordinal2 = qx1Var.ordinal();
                        if (ordinal2 == 0) {
                            str7 = "bluetooth";
                        } else if (ordinal2 == i2) {
                            str7 = "wired";
                        } else {
                            if (ordinal2 != 2) {
                                b6e.s();
                                return num;
                            }
                            str7 = "speaker";
                        }
                        str6 = str7;
                    }
                    Call<MusicBackendResponse<GetFileInfoDto>> a3 = fileInfoApi.a(str10, X, "encraw", str3, j, str9, num2, num3, str5, str6);
                    ?? r2 = num;
                    r8dVar.j = r2;
                    r8dVar.k = r2;
                    r8dVar.l = r2;
                    r8dVar.m = j;
                    r8dVar.p = 2;
                    N = swf.N(a3, r8dVar);
                } else if (i == 1) {
                    j2 = r8dVar.m;
                    String str12 = r8dVar.l;
                    str4 = r8dVar.k;
                    zvsVar2 = r8dVar.j;
                    qgg.h0(obj2);
                    str2 = str12;
                    i2 = 1;
                    num = null;
                    a = obj2;
                    str = "";
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    N = obj2;
                    str = "";
                    bii biiVar = (bii) N;
                    if (!(biiVar instanceof aii)) {
                        if (biiVar instanceof xhi) {
                            xhi xhiVar = (xhi) biiVar;
                            MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                            int i6 = xhiVar.b;
                            String name = musicBackendInvocationError.getName();
                            String str13 = name == null ? str : name;
                            String message = musicBackendInvocationError.getMessage();
                            return new kj6(i6, musicBackendInvocationError.getDetails(), str13, message == null ? str : message, xhiVar.a);
                        }
                        if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        }
                        if (biiVar instanceof zhi) {
                            return uwf.J((zhi) biiVar);
                        }
                        b6e.s();
                        return null;
                    }
                    GetFileInfoDto getFileInfoDto = (GetFileInfoDto) ((aii) biiVar).a;
                    getFileInfoDto.getClass();
                    FileInfoDto downloadInfo = getFileInfoDto.getDownloadInfo();
                    if (downloadInfo != null && (quality = downloadInfo.getQuality()) != null) {
                        int hashCode = quality.hashCode();
                        if (hashCode != -1919475908) {
                            if (hashCode != -318184504) {
                                if (hashCode != 3337) {
                                    if (hashCode != 3461) {
                                        if (hashCode == 3523) {
                                            o5nVar2 = o5n.c;
                                            o5nVar3 = o5nVar2;
                                        } else {
                                            o5nVar2 = o5n.c;
                                            o5nVar3 = o5nVar2;
                                        }
                                    } else if (quality.equals("lq")) {
                                        o5nVar2 = o5n.b;
                                        o5nVar3 = o5nVar2;
                                    }
                                    o5nVar3 = null;
                                } else {
                                    if (quality.equals("hq")) {
                                        o5nVar2 = o5n.d;
                                        o5nVar3 = o5nVar2;
                                    }
                                    o5nVar3 = null;
                                }
                            }
                            return x9cVar == null ? new nj6(null) : new qj6(x9cVar);
                        }
                        if (quality.equals("lossless")) {
                            o5nVar2 = o5n.e;
                            o5nVar3 = o5nVar2;
                        }
                        o5nVar3 = null;
                        if (o5nVar3 != null && (codec = downloadInfo.getCodec()) != null) {
                            oq4.b.getClass();
                            Iterator it = oq4.m.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((oq4) obj).a.equalsIgnoreCase(codec)) {
                                    break;
                                }
                            }
                            oq4 oq4Var = (oq4) obj;
                            if (oq4Var != null && (bitrate = downloadInfo.getBitrate()) != null) {
                                int intValue = bitrate.intValue();
                                String key = downloadInfo.getKey();
                                if (key != null) {
                                    String str14 = key.length() == 32 ? key : null;
                                    if (str14 != null && (url = downloadInfo.getUrl()) != null && (gain = downloadInfo.getGain()) != null) {
                                        boolean booleanValue = gain.booleanValue();
                                        List urls = downloadInfo.getUrls();
                                        x9cVar = new x9c(o5nVar3, oq4Var, intValue, str14, url, booleanValue, urls != null ? CollectionsKt.O(urls) : c5b.a);
                                        if (x9cVar == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    x9cVar = null;
                    if (x9cVar == null) {
                    }
                }
                j = j2;
                e92Var = (e92) a;
                str3 = str4;
                String str92 = str2;
                FileInfoApi fileInfoApi2 = (FileInfoApi) this.e.getValue();
                String str102 = zvsVar2.a;
                String X2 = CollectionsKt.X(arrayList, StringUtils.COMMA, null, null, null, 62);
                if (e92Var != null) {
                }
                if (e92Var != null) {
                }
                if (e92Var != null) {
                }
                str5 = num;
                if (e92Var != null) {
                }
                str6 = num;
                Call<MusicBackendResponse<GetFileInfoDto>> a32 = fileInfoApi2.a(str102, X2, "encraw", str3, j, str92, num2, num3, str5, str6);
                ?? r22 = num;
                r8dVar.j = r22;
                r8dVar.k = r22;
                r8dVar.l = r22;
                r8dVar.m = j;
                r8dVar.p = 2;
                N = swf.N(a32, r8dVar);
            }
        }
        r8dVar = new r8d(this, cg6Var);
        Object obj22 = r8dVar.n;
        nm6 nm6Var2 = nm6.a;
        i = r8dVar.p;
        ArrayList arrayList2 = this.f;
        if (i != 0) {
        }
        j = j2;
        e92Var = (e92) a;
        str3 = str4;
        String str922 = str2;
        FileInfoApi fileInfoApi22 = (FileInfoApi) this.e.getValue();
        String str1022 = zvsVar2.a;
        String X22 = CollectionsKt.X(arrayList2, StringUtils.COMMA, null, null, null, 62);
        if (e92Var != null) {
        }
        if (e92Var != null) {
        }
        if (e92Var != null) {
        }
        str5 = num;
        if (e92Var != null) {
        }
        str6 = num;
        Call<MusicBackendResponse<GetFileInfoDto>> a322 = fileInfoApi22.a(str1022, X22, "encraw", str3, j, str922, num2, num3, str5, str6);
        ?? r222 = num;
        r8dVar.j = r222;
        r8dVar.k = r222;
        r8dVar.l = r222;
        r8dVar.m = j;
        r8dVar.p = 2;
        N = swf.N(a322, r8dVar);
    }
}
