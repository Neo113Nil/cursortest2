package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishSpannableToast {
    public static final /* synthetic */ CatchingFishSpannableToast[] CatchingFishDaggerWebsocket;
    public static final CatchingFishSpannableToast CatchingFishReduxKtor;

    /* JADX INFO: Fake field, exist only in values array */
    CatchingFishSpannableToast EF0;

    static {
        CatchingFishSpannableToast catchingFishSpannableToast = new CatchingFishSpannableToast("UNKNOWN", 0);
        CatchingFishSpannableToast catchingFishSpannableToast2 = new CatchingFishSpannableToast("ANDROID_FIREBASE", 1);
        CatchingFishReduxKtor = catchingFishSpannableToast2;
        CatchingFishDaggerWebsocket = new CatchingFishSpannableToast[]{catchingFishSpannableToast, catchingFishSpannableToast2};
    }

    public static CatchingFishSpannableToast valueOf(String str) {
        return (CatchingFishSpannableToast) Enum.valueOf(CatchingFishSpannableToast.class, str);
    }

    public static CatchingFishSpannableToast[] values() {
        return (CatchingFishSpannableToast[]) CatchingFishDaggerWebsocket.clone();
    }
}
