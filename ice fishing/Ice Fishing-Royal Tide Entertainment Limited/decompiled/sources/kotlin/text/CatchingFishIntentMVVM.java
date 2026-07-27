package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishIntentMVVM extends RuntimeException {
    public final List CatchingFishReduxKtor;

    public CatchingFishIntentMVVM(List list) {
        this.CatchingFishReduxKtor = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        CatchingFishCameraXGson catchingFishCameraXGson = new CatchingFishCameraXGson(10);
        List list = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(list, "<this>");
        CatchingFishGsonToolbar catchingFishGsonToolbar = new CatchingFishGsonToolbar(list);
        if (catchingFishGsonToolbar.CatchingFishParcelableFAB() > 0) {
            ((CatchingFishMockkEspresso) catchingFishGsonToolbar.get(0)).getClass();
            throw null;
        }
        CatchingFishCameraXGson CatchingFishWorkManager = CatchingFishGsonCardView.CatchingFishWorkManager(catchingFishCameraXGson);
        CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishWorkManager, "<this>");
        CatchingFishGsonToolbar catchingFishGsonToolbar2 = new CatchingFishGsonToolbar(CatchingFishWorkManager);
        int CatchingFishParcelableFAB = catchingFishGsonToolbar2.CatchingFishParcelableFAB();
        for (int i = 0; i < CatchingFishParcelableFAB; i++) {
            sb.append("\tat " + ((String) catchingFishGsonToolbar2.get(i)));
            sb.append('\n');
        }
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }
}
