package kotlin.text;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishHandlerView extends CatchingFishMVIBundle implements CatchingFishServiceHandler {
    public final /* synthetic */ Object CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final /* synthetic */ int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishHandlerView(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle, int i) {
        super(1, catchingFishWebsocketGradle);
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishFragmentHandler = obj;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = (CatchingFishWebsocketGradle) obj;
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishHandlerView((CatchingFishStripeAPIGlide) this.CatchingFishFragmentHandler, catchingFishWebsocketGradle, 0).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
            default:
                return new CatchingFishHandlerView((CatchingFishIntentDataStore) this.CatchingFishFragmentHandler, catchingFishWebsocketGradle, 1).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
        }
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        Context context;
        String str;
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.CatchingFishLayout;
                CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    return catchingFishRealmContext;
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                CatchingFishStripeAPIGlide catchingFishStripeAPIGlide = (CatchingFishStripeAPIGlide) this.CatchingFishFragmentHandler;
                this.CatchingFishLayout = 1;
                SharedPreferences.Editor edit = ((SharedPreferences) catchingFishStripeAPIGlide.CatchingFishDaggerWebsocket.getValue()).edit();
                LinkedHashSet linkedHashSet = catchingFishStripeAPIGlide.CatchingFishWorkManager;
                if (linkedHashSet == null) {
                    edit.clear();
                } else {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        edit.remove((String) it.next());
                    }
                }
                if (!edit.commit()) {
                    throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                }
                if (((SharedPreferences) catchingFishStripeAPIGlide.CatchingFishDaggerWebsocket.getValue()).getAll().isEmpty() && (context = catchingFishStripeAPIGlide.CatchingFishCoroutine) != null && (str = catchingFishStripeAPIGlide.CatchingFishReduxKtor) != null) {
                    CatchingFishReduxLiveData.CatchingFishParcelableFAB(context, str);
                }
                if (linkedHashSet != null) {
                    linkedHashSet.clear();
                }
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                return catchingFishRealmContext == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : catchingFishRealmContext;
            default:
                int i2 = this.CatchingFishLayout;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    return obj;
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                CatchingFishIntentDataStore catchingFishIntentDataStore = (CatchingFishIntentDataStore) this.CatchingFishFragmentHandler;
                this.CatchingFishLayout = 1;
                Object CatchingFishFragmentHandler = catchingFishIntentDataStore.CatchingFishFragmentHandler(this);
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                return CatchingFishFragmentHandler == catchingFishXMLLayoutMockk2 ? catchingFishXMLLayoutMockk2 : CatchingFishFragmentHandler;
        }
    }
}
