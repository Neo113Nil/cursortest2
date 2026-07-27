package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskBundle {
    public static String CatchingFishParcelableFAB(CatchingFishDaggerStateFlow catchingFishDaggerStateFlow) {
        String obj = catchingFishDaggerStateFlow.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
