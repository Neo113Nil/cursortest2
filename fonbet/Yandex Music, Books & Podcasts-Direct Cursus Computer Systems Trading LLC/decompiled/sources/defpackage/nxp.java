package defpackage;

import android.net.Uri;
import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes4.dex */
public final class nxp {
    public static String a(zwp zwpVar, String str, String str2) {
        String str3;
        String a;
        String o;
        zwpVar.getClass();
        jxp jxpVar = zwpVar.a;
        String str4 = "/album/";
        if (jxpVar instanceof hxp) {
            hxp hxpVar = (hxp) jxpVar;
            String str5 = hxpVar.a;
            String str6 = hxpVar.b;
            jyr jyrVar = loi.a;
            str5.getClass();
            if (str6 != null) {
                o = loi.a().a() + "/album/" + str6 + "/track/" + str5;
            } else {
                o = ouj.o(loi.a().a(), "/track/", str5);
            }
        } else if (jxpVar instanceof gxp) {
            gxp gxpVar = (gxp) jxpVar;
            boolean z = gxpVar.f;
            String str7 = gxpVar.g;
            if (gxpVar.e) {
                o = loi.a().a().concat("/chart");
            } else if (str7 != null) {
                o = ouj.o(loi.a().a(), "/playlists/", str7);
                if (z) {
                    o = Uri.parse(o).buildUpon().appendQueryParameter("openTrailer", PListParser.TAG_TRUE).build().toString();
                    o.getClass();
                }
            } else {
                String str8 = gxpVar.b;
                String str9 = gxpVar.d;
                jyr jyrVar2 = loi.a;
                str8.getClass();
                str9.getClass();
                o = loi.a().a() + "/users/" + str8 + "/playlists/" + str9;
                if (z) {
                    o = Uri.parse(o).buildUpon().appendQueryParameter("openTrailer", PListParser.TAG_TRUE).build().toString();
                    o.getClass();
                }
            }
        } else {
            if (jxpVar instanceof dxp) {
                str3 = ((dxp) jxpVar).a;
                jyr jyrVar3 = loi.a;
                str3.getClass();
                a = loi.a().a();
            } else if (jxpVar instanceof exp) {
                str3 = ((exp) jxpVar).a;
                jyr jyrVar4 = loi.a;
                str3.getClass();
                a = loi.a().a();
                str4 = "/artist/";
            } else if (jxpVar instanceof ixp) {
                str3 = ((ixp) jxpVar).a;
                jyr jyrVar5 = loi.a;
                str3.getClass();
                a = loi.a().a();
                str4 = "/video/?ids=";
            } else {
                if (!(jxpVar instanceof fxp)) {
                    b6e.s();
                    return null;
                }
                str3 = ((fxp) jxpVar).a;
                jyr jyrVar6 = loi.a;
                str3.getClass();
                a = loi.a().a();
                str4 = "/concert/";
            }
            o = ouj.o(a, str4, str3);
        }
        Uri.Builder appendQueryParameter = Uri.parse(o).buildUpon().appendQueryParameter("utm_medium", "copy_link");
        if (str != null) {
            appendQueryParameter.appendQueryParameter("invite_id", str);
        }
        appendQueryParameter.appendQueryParameter("ref_id", str2);
        String uri = appendQueryParameter.build().toString();
        uri.getClass();
        return uri;
    }
}
