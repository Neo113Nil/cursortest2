package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCardViewCameraX extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCardViewCameraX(String str) {
        super(str);
        CatchingFishToastHiltBundle.CatchingFishOkHttp(str, "Detail message must not be empty");
    }
}
