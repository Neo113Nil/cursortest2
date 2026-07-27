package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMVIFABLayout extends CatchingFishFirebaseDagger {
    public final /* synthetic */ int CatchingFishCoroutineFlow;

    public /* synthetic */ CatchingFishMVIFABLayout(int i) {
        this.CatchingFishCoroutineFlow = i;
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public CatchingFishServiceHilt CatchingFishJobScheduler(Context context, Object obj) {
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String[] strArr = (String[]) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(strArr, "input");
                if (strArr.length == 0) {
                    return new CatchingFishServiceHilt(9, CatchingFishMVPMoshiGson.CatchingFishReduxKtor);
                }
                for (String str : strArr) {
                    if (CatchingFishGsonCardView.CatchingFishCloudMessaging(context, str) != 0) {
                        return null;
                    }
                }
                int CatchingFishStateFlow = CatchingFishPicassoGlide.CatchingFishStateFlow(strArr.length);
                if (CatchingFishStateFlow < 16) {
                    CatchingFishStateFlow = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(CatchingFishStateFlow);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new CatchingFishServiceHilt(9, linkedHashMap);
            case 1:
                String str3 = (String) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(str3, "input");
                if (CatchingFishGsonCardView.CatchingFishCloudMessaging(context, str3) != 0) {
                    return null;
                }
                return new CatchingFishServiceHilt(9, Boolean.TRUE);
            default:
                return super.CatchingFishJobScheduler(context, obj);
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final Object CatchingFishPayPalLiveData(Intent intent, int i) {
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(CatchingFishLayoutToast.CatchingFishParcelable(arrayList2), CatchingFishLayoutToast.CatchingFishParcelable(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new CatchingFishGsonWorkManager(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (intArrayExtra2[i3] == 0) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new CatchingFishToolbar(intent, i);
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final Intent CatchingFishSpannableWidget(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String[] strArr = (String[]) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(putExtra, "putExtra(...)");
                return putExtra;
            case 1:
                String str = (String) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(putExtra2, "putExtra(...)");
                return putExtra2;
            case 2:
                Intent intent = (Intent) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(intent, "input");
                return intent;
            default:
                CatchingFishGlideEspresso catchingFishGlideEspresso = (CatchingFishGlideEspresso) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = catchingFishGlideEspresso.CatchingFishDaggerWebsocket;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        catchingFishGlideEspresso = new CatchingFishGlideEspresso(catchingFishGlideEspresso.CatchingFishReduxKtor, null, catchingFishGlideEspresso.CatchingFishWorkManager, catchingFishGlideEspresso.CatchingFishViewModelScope);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", catchingFishGlideEspresso);
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }
}
