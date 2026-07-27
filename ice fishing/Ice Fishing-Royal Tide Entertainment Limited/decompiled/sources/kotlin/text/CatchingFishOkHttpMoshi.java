package kotlin.text;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpMoshi extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public int CatchingFishCloudMessaging;
    public /* synthetic */ Object CatchingFishEspressoTesting;
    public Object CatchingFishFragmentHandler;
    public CatchingFishStripeAPIGlide CatchingFishLayout;
    public final /* synthetic */ List CatchingFishOkHttp;
    public final /* synthetic */ ArrayList CatchingFishUnitTesting;
    public Iterator CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishOkHttpMoshi(List list, ArrayList arrayList, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishOkHttp = list;
        this.CatchingFishUnitTesting = arrayList;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishOkHttpMoshi catchingFishOkHttpMoshi = new CatchingFishOkHttpMoshi(this.CatchingFishOkHttp, this.CatchingFishUnitTesting, catchingFishWebsocketGradle);
        catchingFishOkHttpMoshi.CatchingFishEspressoTesting = obj;
        return catchingFishOkHttpMoshi;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishOkHttpMoshi) CatchingFishCloudMessaging(obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        Iterator it;
        List list;
        CatchingFishStripeAPIGlide catchingFishStripeAPIGlide;
        Iterator it2;
        Object obj2;
        int i = this.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            obj = this.CatchingFishEspressoTesting;
            it = this.CatchingFishOkHttp.iterator();
            list = this.CatchingFishUnitTesting;
        } else if (i == 1) {
            obj2 = this.CatchingFishFragmentHandler;
            CatchingFishStripeAPIGlide catchingFishStripeAPIGlide2 = this.CatchingFishLayout;
            it2 = this.CatchingFishViewModelFAB;
            List list2 = (List) this.CatchingFishEspressoTesting;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            catchingFishStripeAPIGlide = catchingFishStripeAPIGlide2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new CatchingFishHandlerView(catchingFishStripeAPIGlide, null, 0));
                this.CatchingFishEspressoTesting = list;
                this.CatchingFishViewModelFAB = it2;
                this.CatchingFishLayout = null;
                this.CatchingFishFragmentHandler = null;
                this.CatchingFishCloudMessaging = 2;
                obj = catchingFishStripeAPIGlide.CatchingFishSnackbar.CatchingFishReduxKtor(new CatchingFishMockkFluxDagger((SharedPreferences) catchingFishStripeAPIGlide.CatchingFishDaggerWebsocket.getValue(), catchingFishStripeAPIGlide.CatchingFishWorkManager), obj2, this);
                if (obj != catchingFishXMLLayoutMockk) {
                    it = it2;
                }
                return catchingFishXMLLayoutMockk;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.CatchingFishViewModelFAB;
            list = (List) this.CatchingFishEspressoTesting;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        if (!it.hasNext()) {
            CatchingFishStripeAPIGlide catchingFishStripeAPIGlide3 = (CatchingFishStripeAPIGlide) it.next();
            this.CatchingFishEspressoTesting = list;
            this.CatchingFishViewModelFAB = it;
            this.CatchingFishLayout = catchingFishStripeAPIGlide3;
            this.CatchingFishFragmentHandler = obj;
            this.CatchingFishCloudMessaging = 1;
            Object CatchingFishParcelableFAB = catchingFishStripeAPIGlide3.CatchingFishParcelableFAB(obj, this);
            if (CatchingFishParcelableFAB != catchingFishXMLLayoutMockk) {
                Iterator it3 = it;
                obj2 = obj;
                obj = CatchingFishParcelableFAB;
                catchingFishStripeAPIGlide = catchingFishStripeAPIGlide3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return catchingFishXMLLayoutMockk;
        }
    }
}
