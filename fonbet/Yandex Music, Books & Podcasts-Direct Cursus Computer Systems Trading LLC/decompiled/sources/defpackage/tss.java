package defpackage;

/* loaded from: classes4.dex */
public enum tss {
    Finish("finish"),
    Skip("skip"),
    BackSkip("back_skip"),
    Like("like"),
    Dislike("dislike"),
    OtherSelected("other_track"),
    InProgress("in_progress"),
    Error("error");

    public final String a;

    tss(String str) {
        this.a = str;
    }
}
