package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class wo7 implements ps3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wo7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        if (r9 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [uif, vyc] */
    @Override // defpackage.ps3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(es3 es3Var, l3o l3oVar) {
        Charset a;
        List split$default;
        List split$default2;
        String str;
        List split$default3;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                xo7 xo7Var = (xo7) obj2;
                ju7 ju7Var = (ju7) obj3;
                e1j e1jVar = (e1j) obj;
                es3Var.getClass();
                l3oVar.getClass();
                o3o o3oVar = l3oVar.g;
                int i2 = l3oVar.d;
                if (o3oVar != null) {
                    try {
                        twh o = o3oVar.o();
                        if (o != null) {
                            a = o.a(Charsets.UTF_8);
                            break;
                        }
                    } catch (IOException unused) {
                        ju7Var.a(new mac("Error obtaining response body string", (Throwable) null));
                        return;
                    }
                }
                a = Charsets.UTF_8;
                byte[] a2 = o3oVar != null ? o3oVar.a() : null;
                TreeMap o2 = l3oVar.f.o();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(o2.size()));
                for (Map.Entry entry : o2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), CollectionsKt.X((Iterable) entry.getValue(), ", ", null, null, null, 62));
                }
                ju7Var.b(new yo7(i2, new LinkedHashMap(linkedHashMap), l3oVar.b(), a2 != null ? new xiu(a, new qxp(a2)) : null));
                ?? r12 = xo7Var.e;
                String b = e1jVar.b();
                Boolean valueOf = Boolean.valueOf(l3oVar.b());
                String g = e1jVar.c().g("X-Request-ID");
                String str2 = g == null ? "" : g;
                String g2 = e1jVar.c().g("traceparent");
                r12.f(b, valueOf, str2, g2 == null ? "" : g2, xo7Var.a(e1jVar).a.d, Long.valueOf(l3oVar.l - l3oVar.k), Integer.valueOf(i2));
                break;
            default:
                rdk rdkVar = (rdk) obj3;
                es3Var.getClass();
                l3oVar.getClass();
                if (l3oVar.b()) {
                    String a3 = l3oVar.f.a("Content-Disposition");
                    if (a3 == null) {
                        a3 = null;
                    }
                    String str3 = a3 != null ? a3 : "";
                    rdkVar.getClass();
                    split$default = StringsKt__StringsKt.split$default(str3, new String[]{"; "}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
                        if (split$default2.size() == 2) {
                            String str4 = (String) CollectionsKt.Q(split$default2);
                            if (Intrinsics.d(str4, "filename")) {
                                str = (String) CollectionsKt.Y(split$default2);
                            } else if (Intrinsics.d(str4, "filename*")) {
                                split$default3 = StringsKt__StringsKt.split$default((String) CollectionsKt.Y(split$default2), new String[]{"''"}, false, 0, 6, null);
                                str = (String) CollectionsKt.Z(split$default3);
                            }
                            if (str == null) {
                                arrayList.add(str);
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                    }
                    String str5 = (String) CollectionsKt.firstOrNull(arrayList);
                    String b0 = str5 != null ? StringsKt.b0(str5) : null;
                    if (b0 == null) {
                        ((qdc) rdkVar.e).sendEvent("wm_download_file_error", uah.e(new Pair(Constants.KEY_MESSAGE, "no filename in Content-Disposition header"), new Pair("header", str3), new Pair("url", l3oVar.a.a.i)));
                        break;
                    } else {
                        DownloadManager.Request request = new DownloadManager.Request((Uri) obj2);
                        request.setTitle(b0);
                        request.setDescription(((Activity) rdkVar.b).getString(R.string.download_descr));
                        request.allowScanningByMediaScanner();
                        String c = ((xz1) rdkVar.f).c();
                        if (c != null) {
                            request.addRequestHeader("Authorization", c);
                        }
                        request.setNotificationVisibility(1);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, b0);
                        ((DownloadManager) obj).enqueue(request);
                        break;
                    }
                } else {
                    ((qdc) rdkVar.e).sendEvent("wm_download_file_error", uah.e(new Pair("code", Integer.valueOf(l3oVar.d)), new Pair(Constants.KEY_MESSAGE, l3oVar.c)));
                    break;
                }
        }
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        int i = this.a;
        es3Var.getClass();
        switch (i) {
            case 0:
                ((ju7) this.b).a(new mac("Error communicating with the server: " + iOException, (Throwable) null));
                break;
            default:
                qdc qdcVar = (qdc) ((rdk) this.b).e;
                String message = iOException.getMessage();
                if (message == null) {
                    message = "";
                }
                qdcVar.sendEvent("wm_download_file_error", tah.b(new Pair(Constants.KEY_MESSAGE, message)));
                break;
        }
    }
}
