package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class jxm implements rnq {
    public final vjg a;
    public final rmb b;
    public final kwm c;

    public jxm(vjg vjgVar, rmb rmbVar) {
        String str;
        vjgVar.getClass();
        this.a = vjgVar;
        this.b = rmbVar;
        rmb.h(rmbVar, 1, 2);
        String str2 = vjgVar.c;
        str2 = str2 == null ? "" : str2;
        String str3 = vjgVar.d;
        String str4 = str3 == null ? "" : str3;
        String str5 = vjgVar.e;
        if (str5 != null) {
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            webPath$Storage.getClass();
            str = etn.B(str5, webPath$Storage).getPathForSize(wct.s());
        } else {
            str = null;
        }
        this.c = new kwm(str2, str4, str, new thj(pkb.Link, "yandexmusic://easyloginsetup", 1, 1, ""));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }
}
