package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes5.dex */
public final class cmp {
    public final jyr a = btf.b(new qkp(1));

    /* JADX WARN: Removed duplicated region for block: B:14:0x0121 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0032, B:12:0x011b, B:14:0x0121, B:17:0x0128, B:18:0x013c, B:37:0x00d9, B:39:0x00e3, B:40:0x00e7, B:42:0x00eb, B:45:0x00f4, B:46:0x010f, B:50:0x010b, B:52:0x00fd, B:55:0x0106), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0128 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0032, B:12:0x011b, B:14:0x0121, B:17:0x0128, B:18:0x013c, B:37:0x00d9, B:39:0x00e3, B:40:0x00e7, B:42:0x00eb, B:45:0x00f4, B:46:0x010f, B:50:0x010b, B:52:0x00fd, B:55:0x0106), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Bundle bundle, cg6 cg6Var) {
        bmp bmpVar;
        int i;
        vmd vmdVar;
        String str2;
        v8n v8nVar;
        String str3 = str;
        try {
            if (cg6Var instanceof bmp) {
                bmpVar = (bmp) cg6Var;
                int i2 = bmpVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bmpVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = bmpVar.k;
                    nm6 nm6Var = nm6.a;
                    i = bmpVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        String string = bundle != null ? bundle.getString("android.intent.extra.artist") : null;
                        String string2 = bundle != null ? bundle.getString("android.intent.extra.album") : null;
                        String string3 = bundle != null ? bundle.getString("android.intent.extra.title") : null;
                        String string4 = bundle != null ? bundle.getString("android.intent.extra.focus") : null;
                        StringBuilder m = f1d.m("searchQuery=", str3, ", artist=", string, ", album=");
                        su4.v(m, string2, ", track=", string3, ", mediaFocus=");
                        m.append(string4);
                        ssg.a(3, "SessionGoogleAssistantSearchQueryHandler", m.toString(), null);
                        wmd wmdVar = new wmd(str3, string, string2, string3);
                        zgh zghVar = zgh.b;
                        String a = wmdVar.a();
                        zghVar.getClass();
                        y60 e = zghVar.e();
                        String str4 = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                        arf g = tlm.g(bwf.c);
                        Map map = (Map) g.getValue();
                        ub ubVar = new ub();
                        ubVar.c(new String[]{"search", "query"}, a);
                        map.put("MediaSession", ubVar.b());
                        tlm.o(e, str4, g.isInitialized() ? (Map) g.getValue() : null);
                        and andVar = (and) this.a.getValue();
                        if (string4 != null) {
                            switch (string4.hashCode()) {
                                case -451210025:
                                    str2 = "vnd.android.cursor.item/playlist";
                                    string4.equals(str2);
                                    break;
                                case 892096906:
                                    if (!string4.equals("vnd.android.cursor.item/album")) {
                                        break;
                                    } else {
                                        vmdVar = vmd.b;
                                        break;
                                    }
                                case 897440926:
                                    str2 = "vnd.android.cursor.item/genre";
                                    string4.equals(str2);
                                    break;
                                case 907470614:
                                    str2 = "vnd.android.cursor.item/radio";
                                    string4.equals(str2);
                                    break;
                                case 1891266444:
                                    if (!string4.equals("vnd.android.cursor.item/artist")) {
                                        break;
                                    } else {
                                        vmdVar = vmd.a;
                                        break;
                                    }
                            }
                            bmpVar.j = str3;
                            bmpVar.m = 1;
                            obj = andVar.a(wmdVar, vmdVar, bmpVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        }
                        vmdVar = null;
                        bmpVar.j = str3;
                        bmpVar.m = 1;
                        obj = andVar.a(wmdVar, vmdVar, bmpVar);
                        if (obj == nm6Var) {
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str3 = bmpVar.j;
                        qgg.h0(obj);
                    }
                    v8nVar = ((xmd) obj).a;
                    if (v8nVar == null) {
                        zgh.b.k(true);
                        return v8nVar;
                    }
                    throw new hzk("nothing found by " + str3, null, 1000);
                }
            }
            if (i != 0) {
            }
            v8nVar = ((xmd) obj).a;
            if (v8nVar == null) {
            }
        } catch (Exception e2) {
            if (!(e2 instanceof CancellationException)) {
                zgh.b.k(false);
                ssg.a(6, "SessionGoogleAssistantSearchQueryHandler", "Error in Google Assistant search request", e2);
            }
            throw e2;
        }
        bmpVar = new bmp(this, cg6Var);
        Object obj2 = bmpVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bmpVar.m;
    }
}
