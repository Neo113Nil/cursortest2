package defpackage;

/* loaded from: classes3.dex */
public enum mtk {
    PHONE("touch"),
    TABLET("pad"),
    /* JADX INFO: Fake field, exist only in values array */
    APP("app"),
    TV("tv"),
    /* JADX INFO: Fake field, exist only in values array */
    TVAPP("tvapp"),
    /* JADX INFO: Fake field, exist only in values array */
    STATION("station"),
    UNSUPPORTED("unsupported");

    public final String a;

    mtk(String str) {
        this.a = str;
    }
}
