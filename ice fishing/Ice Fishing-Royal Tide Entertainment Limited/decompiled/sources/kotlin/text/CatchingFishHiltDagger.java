package kotlin.text;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class CatchingFishHiltDagger implements CatchingFishStateFlowToast {
    public final File CatchingFishParcelableFAB;
    public final AtomicBoolean CatchingFishSnackbar = new AtomicBoolean(false);

    public CatchingFishHiltDagger(File file) {
        this.CatchingFishParcelableFAB = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|46|47|(1:49)|50)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.text.CatchingFishHiltDagger] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object CatchingFishParcelableFAB(CatchingFishHiltDagger catchingFishHiltDagger, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishGradlePicasso catchingFishGradlePicasso;
        ?? r2;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGradleMVVM.CatchingFish;
        if (catchingFishStateFlowGson instanceof CatchingFishGradlePicasso) {
            catchingFishGradlePicasso = (CatchingFishGradlePicasso) catchingFishStateFlowGson;
            int i = catchingFishGradlePicasso.CatchingFishCloudMessaging;
            if ((i & Integer.MIN_VALUE) != 0) {
                catchingFishGradlePicasso.CatchingFishCloudMessaging = i - Integer.MIN_VALUE;
                Object obj = catchingFishGradlePicasso.CatchingFishLayout;
                r2 = catchingFishGradlePicasso.CatchingFishCloudMessaging;
                boolean z = true;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (r2 != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    if (catchingFishHiltDagger.CatchingFishSnackbar.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(catchingFishHiltDagger.CatchingFishParcelableFAB);
                        try {
                            catchingFishGradlePicasso.CatchingFishViewModelScope = catchingFishHiltDagger;
                            catchingFishGradlePicasso.CatchingFishViewModelFAB = fileInputStream2;
                            catchingFishGradlePicasso.CatchingFishCloudMessaging = 1;
                            CatchingFishDaggerHiltMVI CatchingFishViewModelFAB = catchingFishGradleMVVM.CatchingFishViewModelFAB(fileInputStream2);
                            if (CatchingFishViewModelFAB != catchingFishXMLLayoutMockk) {
                                fileInputStream = fileInputStream2;
                                obj = CatchingFishViewModelFAB;
                            }
                        } catch (Throwable th3) {
                            r2 = catchingFishHiltDagger;
                            fileInputStream = fileInputStream2;
                            th2 = th3;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!catchingFishHiltDagger.CatchingFishParcelableFAB.exists()) {
                            return new CatchingFishDaggerHiltMVI(z);
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(catchingFishHiltDagger.CatchingFishParcelableFAB);
                        try {
                            catchingFishGradlePicasso.CatchingFishViewModelScope = fileInputStream3;
                            catchingFishGradlePicasso.CatchingFishViewModelFAB = null;
                            catchingFishGradlePicasso.CatchingFishCloudMessaging = 2;
                            CatchingFishDaggerHiltMVI CatchingFishViewModelFAB2 = catchingFishGradleMVVM.CatchingFishViewModelFAB(fileInputStream3);
                            if (CatchingFishViewModelFAB2 != catchingFishXMLLayoutMockk) {
                                obj = CatchingFishViewModelFAB2;
                                closeable = fileInputStream3;
                                CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(closeable, null);
                                return obj;
                            }
                            return catchingFishXMLLayoutMockk;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = fileInputStream3;
                            throw th;
                        }
                    }
                    return catchingFishXMLLayoutMockk;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) catchingFishGradlePicasso.CatchingFishViewModelScope;
                    try {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(closeable, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream = catchingFishGradlePicasso.CatchingFishViewModelFAB;
                r2 = (CatchingFishHiltDagger) catchingFishGradlePicasso.CatchingFishViewModelScope;
                try {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(fileInputStream, null);
                return obj;
            }
        }
        catchingFishGradlePicasso = new CatchingFishGradlePicasso(catchingFishHiltDagger, catchingFishStateFlowGson);
        Object obj2 = catchingFishGradlePicasso.CatchingFishLayout;
        r2 = catchingFishGradlePicasso.CatchingFishCloudMessaging;
        boolean z2 = true;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (r2 != 0) {
        }
        CatchingFishXMLLayoutGlide.CatchingFishStateLiveData(fileInputStream, null);
        return obj2;
    }

    @Override // kotlin.text.CatchingFishStateFlowToast
    public final void close() {
        this.CatchingFishSnackbar.set(true);
    }
}
