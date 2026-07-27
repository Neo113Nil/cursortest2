package kotlin.text;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class CatchingFishWidgetFABLayout extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ Context CatchingFishAnimationMockk;
    public final /* synthetic */ ContentResolver CatchingFishCloudMessaging;
    public final /* synthetic */ Uri CatchingFishEspressoTesting;
    public /* synthetic */ Object CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final /* synthetic */ CatchingFishCustomViewGson CatchingFishOkHttp;
    public final /* synthetic */ CatchingFishPicassoCameraX CatchingFishUnitTesting;
    public CatchingFishMVVMCardView CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishWidgetFABLayout(ContentResolver contentResolver, Uri uri, CatchingFishCustomViewGson catchingFishCustomViewGson, CatchingFishPicassoCameraX catchingFishPicassoCameraX, Context context, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = contentResolver;
        this.CatchingFishEspressoTesting = uri;
        this.CatchingFishOkHttp = catchingFishCustomViewGson;
        this.CatchingFishUnitTesting = catchingFishPicassoCameraX;
        this.CatchingFishAnimationMockk = context;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishWidgetFABLayout catchingFishWidgetFABLayout = new CatchingFishWidgetFABLayout(this.CatchingFishCloudMessaging, this.CatchingFishEspressoTesting, this.CatchingFishOkHttp, this.CatchingFishUnitTesting, this.CatchingFishAnimationMockk, catchingFishWebsocketGradle);
        catchingFishWidgetFABLayout.CatchingFishFragmentHandler = obj;
        return catchingFishWidgetFABLayout;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishWidgetFABLayout) CatchingFishCloudMessaging((CatchingFishIntentManifest) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r6.CatchingFishLayout(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:15:0x0055, B:17:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishIntentManifest catchingFishIntentManifest;
        CatchingFishMVVMCardView catchingFishMVVMCardView;
        CatchingFishIntentManifest catchingFishIntentManifest2;
        CatchingFishMVVMCardView catchingFishMVVMCardView2;
        Object CatchingFishSnackbar;
        int i = this.CatchingFishLayout;
        CatchingFishCustomViewGson catchingFishCustomViewGson = this.CatchingFishOkHttp;
        ContentResolver contentResolver = this.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        try {
            if (i == 0) {
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                catchingFishIntentManifest = (CatchingFishIntentManifest) this.CatchingFishFragmentHandler;
                contentResolver.registerContentObserver(this.CatchingFishEspressoTesting, false, catchingFishCustomViewGson);
                catchingFishMVVMCardView = new CatchingFishMVVMCardView(this.CatchingFishUnitTesting);
                this.CatchingFishFragmentHandler = catchingFishIntentManifest;
                this.CatchingFishViewModelFAB = catchingFishMVVMCardView;
                this.CatchingFishLayout = 1;
                CatchingFishSnackbar = catchingFishMVVMCardView.CatchingFishSnackbar(this);
                if (CatchingFishSnackbar != catchingFishXMLLayoutMockk) {
                }
            } else if (i == 1) {
                catchingFishMVVMCardView2 = this.CatchingFishViewModelFAB;
                catchingFishIntentManifest2 = (CatchingFishIntentManifest) this.CatchingFishFragmentHandler;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catchingFishMVVMCardView2 = this.CatchingFishViewModelFAB;
                catchingFishIntentManifest2 = (CatchingFishIntentManifest) this.CatchingFishFragmentHandler;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                catchingFishIntentManifest = catchingFishIntentManifest2;
                catchingFishMVVMCardView = catchingFishMVVMCardView2;
                this.CatchingFishFragmentHandler = catchingFishIntentManifest;
                this.CatchingFishViewModelFAB = catchingFishMVVMCardView;
                this.CatchingFishLayout = 1;
                CatchingFishSnackbar = catchingFishMVVMCardView.CatchingFishSnackbar(this);
                if (CatchingFishSnackbar != catchingFishXMLLayoutMockk) {
                    return catchingFishXMLLayoutMockk;
                }
                CatchingFishMVVMCardView catchingFishMVVMCardView3 = catchingFishMVVMCardView;
                catchingFishIntentManifest2 = catchingFishIntentManifest;
                obj = CatchingFishSnackbar;
                catchingFishMVVMCardView2 = catchingFishMVVMCardView3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(catchingFishCustomViewGson);
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                }
                catchingFishMVVMCardView2.CatchingFishCoroutine();
                Float f = new Float(Settings.Global.getFloat(this.CatchingFishAnimationMockk.getContentResolver(), "animator_duration_scale", 1.0f));
                this.CatchingFishFragmentHandler = catchingFishIntentManifest2;
                this.CatchingFishViewModelFAB = catchingFishMVVMCardView2;
                this.CatchingFishLayout = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(catchingFishCustomViewGson);
            throw th;
        }
    }
}
