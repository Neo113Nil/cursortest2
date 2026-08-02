package io.flutter.plugins.videoplayer;

import android.content.Context;
import defpackage.fe10;
import defpackage.ipg;
import defpackage.l9h;
import defpackage.och;
import defpackage.rf10;
import defpackage.td10;
import defpackage.teh;
import defpackage.ueh;
import defpackage.ye0;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class b extends ye0 {
    public final VideoAsset$StreamingFormat b;
    public final HashMap c;
    public final String w;

    public b(String str, VideoAsset$StreamingFormat videoAsset$StreamingFormat, HashMap hashMap, String str2) {
        super(str);
        this.b = videoAsset$StreamingFormat;
        this.c = hashMap;
        this.w = str2;
    }

    @Override // defpackage.ye0
    public final fe10 h() {
        td10 td10Var = new td10();
        td10Var.b(this.a);
        int i = a.a[this.b.ordinal()];
        String str = i != 1 ? i != 2 ? i != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str != null) {
            td10Var.c = str;
        }
        return td10Var.a();
    }

    @Override // defpackage.ye0
    public final rf10 i(Context context) {
        och ochVar = new och();
        ochVar.b = this.w;
        ochVar.x = true;
        HashMap hashMap = this.c;
        if (!hashMap.isEmpty()) {
            ochVar.a.b(hashMap);
        }
        l9h l9hVar = new l9h(context, ochVar);
        ueh uehVar = new ueh(context);
        uehVar.b = l9hVar;
        teh tehVar = uehVar.a;
        if (l9hVar != ((ipg) tehVar.x)) {
            tehVar.x = l9hVar;
            ((HashMap) tehVar.c).clear();
            ((HashMap) tehVar.w).clear();
        }
        return uehVar;
    }
}
