package kotlin.text;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLHandler extends CatchingFishHiltDagger {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishSnackbar(Object obj, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishDaggerHiltView catchingFishDaggerHiltView;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (catchingFishStateFlowGson instanceof CatchingFishDaggerHiltView) {
            catchingFishDaggerHiltView = (CatchingFishDaggerHiltView) catchingFishStateFlowGson;
            int i2 = catchingFishDaggerHiltView.CatchingFishCloudMessaging;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishDaggerHiltView.CatchingFishCloudMessaging = i2 - Integer.MIN_VALUE;
                Object obj2 = catchingFishDaggerHiltView.CatchingFishLayout;
                i = catchingFishDaggerHiltView.CatchingFishCloudMessaging;
                CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                    if (this.CatchingFishSnackbar.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.CatchingFishParcelableFAB);
                    try {
                        CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGradleMVVM.CatchingFish;
                        CatchingFishMoshiJUnitKtor catchingFishMoshiJUnitKtor = new CatchingFishMoshiJUnitKtor(fileOutputStream3);
                        catchingFishDaggerHiltView.CatchingFishViewModelScope = fileOutputStream3;
                        catchingFishDaggerHiltView.CatchingFishViewModelFAB = fileOutputStream3;
                        catchingFishDaggerHiltView.CatchingFishCloudMessaging = 1;
                        catchingFishGradleMVVM.CatchingFishLayout(obj, catchingFishMoshiJUnitKtor);
                        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (catchingFishRealmContext == catchingFishXMLLayoutMockk) {
                            return catchingFishXMLLayoutMockk;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = catchingFishDaggerHiltView.CatchingFishViewModelFAB;
                    fileOutputStream = catchingFishDaggerHiltView.CatchingFishViewModelScope;
                    try {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(fileOutputStream, null);
                return catchingFishRealmContext;
            }
        }
        catchingFishDaggerHiltView = new CatchingFishDaggerHiltView(this, catchingFishStateFlowGson);
        Object obj22 = catchingFishDaggerHiltView.CatchingFishLayout;
        i = catchingFishDaggerHiltView.CatchingFishCloudMessaging;
        CatchingFishRealmContext catchingFishRealmContext2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(fileOutputStream, null);
        return catchingFishRealmContext2;
    }
}
