package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavHostController;
import androidx.savedstate.SavedStateRegistry;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.ui.androidx.KeyedSavedStateRegistryOwner;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class NavHostFragment$$ExternalSyntheticLambda1 implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NavHostFragment$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Pair[] pairArr;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Bundle saveState = ((NavHostController) obj).saveState();
                if (saveState != null) {
                    return saveState;
                }
                Bundle bundle = Bundle.EMPTY;
                bundle.getClass();
                return bundle;
            case 1:
                JWECryptoParts jWECryptoParts = (JWECryptoParts) obj;
                for (Map.Entry entry : MapsKt__MapsKt.toMap((LinkedHashMap) jWECryptoParts.cipherText).entrySet()) {
                    jWECryptoParts.set(((StateFlowImpl) ((MutableStateFlow) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : MapsKt__MapsKt.toMap((LinkedHashMap) jWECryptoParts.encryptedKey).entrySet()) {
                    jWECryptoParts.set(((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) jWECryptoParts.header;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            case 2:
                int i2 = ((NavHostFragment) obj).graphId;
                if (i2 != 0) {
                    return BundleKt.bundleOf(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i2)));
                }
                Bundle bundle2 = Bundle.EMPTY;
                bundle2.getClass();
                return bundle2;
            case 3:
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj;
                markwonConfiguration.getClass();
                Bundle bundle3 = new Bundle();
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) markwonConfiguration.theme;
                if (linkedHashMap2 != null) {
                    for (KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwner : ((LinkedHashMap) markwonConfiguration.imageDestinationProcessor).values()) {
                        LinkedHashMap linkedHashMap3 = (LinkedHashMap) markwonConfiguration.theme;
                        if (linkedHashMap3 != null) {
                            Bundle bundle4 = new Bundle();
                            keyedSavedStateRegistryOwner.controller.performSave(bundle4);
                            linkedHashMap3.put(keyedSavedStateRegistryOwner.key, bundle4);
                        }
                    }
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        bundle3.putBundle((String) entry4.getKey(), (Bundle) entry4.getValue());
                    }
                }
                return bundle3;
            case 4:
                FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) ((FinancialConnectionsSheetViewModel) obj).stateFlow.$$delegate_0.getValue();
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("financial_connections_sheet_manifest", financialConnectionsSheetState.manifest);
                bundle5.putSerializable("financial_connections_sheet_web_auth_flow_status", financialConnectionsSheetState.webAuthFlowStatus);
                return bundle5;
            default:
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) ((FinancialConnectionsSheetNativeViewModel) obj).stateFlow.$$delegate_0.getValue();
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("webAuthFlow", financialConnectionsSheetNativeState.webAuthFlow);
                bundle6.putBoolean("firstInit", financialConnectionsSheetNativeState.firstInit);
                return bundle6;
        }
    }
}
