package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import android.util.Log;
import defpackage.c5p;
import defpackage.dnm;
import defpackage.f4m;
import defpackage.inm;
import defpackage.jnm;
import defpackage.jzi;
import defpackage.nnm;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.str;
import defpackage.su4;
import defpackage.t7o;
import defpackage.uif;
import defpackage.z7o;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public final class i extends uif implements Function0 {
    public final /* synthetic */ inm r;
    public final /* synthetic */ VideoData s;
    public final /* synthetic */ dnm t;
    public final /* synthetic */ jnm u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(inm inmVar, VideoData videoData, dnm dnmVar, jnm jnmVar, String str) {
        super(0);
        this.r = inmVar;
        this.s = videoData;
        this.t = dnmVar;
        this.u = jnmVar;
        this.v = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object t7oVar;
        String str;
        String lastPathSegment;
        Integer s;
        inm inmVar = this.r;
        str strVar = inmVar.h;
        d dVar = inmVar.m;
        f4m f4mVar = inmVar.f;
        if (f4mVar != null && (s = f4mVar.s()) != null) {
            strVar.b(s);
        }
        jzi jziVar = inmVar.g;
        if (jziVar != null) {
            strVar.f = jziVar.t();
            strVar.c();
        }
        dnm dnmVar = this.t;
        int intValue = dnmVar.e.intValue();
        c5p c5pVar = dnmVar.g;
        String str2 = dnmVar.d;
        nnm nnmVar = new nnm(this.s, dnmVar, this.u, this.v, intValue, c5pVar, inmVar.c, inmVar.d, inmVar.e, dnmVar.f);
        if (inmVar.o.e(str2)) {
            String manifestUrl = this.s.getManifestUrl();
            manifestUrl.getClass();
            try {
                r7o r7oVar = z7o.b;
                t7oVar = Uri.parse(manifestUrl);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Log.e("UriUtils", "Error while parsing to Uri for string '" + manifestUrl + '\'', a);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            Uri uri = (Uri) t7oVar;
            if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
                String l0 = StringsKt.l0('.', lastPathSegment, "");
                if (l0.length() == 0) {
                    l0 = null;
                }
                if (l0 != null) {
                    str = l0.toLowerCase(Locale.ROOT);
                    str.getClass();
                    if (CollectionsKt.I(inm.p, str)) {
                        dVar.d(nnmVar, new PreloadException.CanceledOperationException.UnsupportedMediaType(ouj.n(str, " format is not supported for preload."), null, 2, null));
                    } else {
                        try {
                            inmVar.j.a(nnmVar, false);
                            dVar.e(nnmVar);
                        } catch (Throwable th2) {
                            dVar.b(nnmVar, new PreloadException.ApiCallError(su4.p(th2, new StringBuilder("Error in startPreload: ")), th2, 0L, 4, null));
                        }
                    }
                }
            }
            str = null;
            if (CollectionsKt.I(inm.p, str)) {
            }
        } else {
            dVar.b(nnmVar, new PreloadException.ApiCallError("Incorrect vsid in PreloadConfig: ".concat(str2), null, 0L, 6, null));
        }
        return Unit.a;
    }
}
