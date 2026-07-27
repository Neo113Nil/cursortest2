package kotlin.text;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIGlide {
    public final Context CatchingFishCoroutine;
    public final CatchingFishKtorHiltIntent CatchingFishDaggerWebsocket;
    public final CatchingFishPayPalAsyncTask CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final CatchingFishToastFABView CatchingFishSnackbar;
    public final LinkedHashSet CatchingFishWorkManager;

    public CatchingFishStripeAPIGlide(Context context, String str, Set set, CatchingFishPayPalAsyncTask catchingFishPayPalAsyncTask, CatchingFishToastFABView catchingFishToastFABView) {
        LinkedHashSet linkedHashSet;
        CatchingFishFirebaseDagger.CatchingFishNavigation(context, "context");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "sharedPreferencesName");
        CatchingFishFirebaseDagger.CatchingFishNavigation(set, "keysToMigrate");
        CatchingFishAppCompatJUnit catchingFishAppCompatJUnit = new CatchingFishAppCompatJUnit(6, context, str);
        this.CatchingFishParcelableFAB = catchingFishPayPalAsyncTask;
        this.CatchingFishSnackbar = catchingFishToastFABView;
        this.CatchingFishCoroutine = context;
        this.CatchingFishReduxKtor = str;
        this.CatchingFishDaggerWebsocket = CatchingFishXMLLayoutGlide.CatchingFishPayPal(catchingFishAppCompatJUnit);
        if (set == CatchingFishPayPalBundle.CatchingFishParcelableFAB) {
            linkedHashSet = null;
        } else {
            Set set2 = set;
            if (set2 instanceof Collection) {
                linkedHashSet = new LinkedHashSet(set2);
            } else {
                linkedHashSet = new LinkedHashSet();
                CatchingFishCameraXCameraX.CatchingFishNavigationGson(set2, linkedHashSet);
            }
        }
        this.CatchingFishWorkManager = linkedHashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r5.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishParcelableFAB(Object obj, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishContextMoshiMVI catchingFishContextMoshiMVI;
        Object obj2;
        int i;
        CatchingFishStripeAPIGlide catchingFishStripeAPIGlide;
        if (catchingFishStateFlowGson instanceof CatchingFishContextMoshiMVI) {
            catchingFishContextMoshiMVI = (CatchingFishContextMoshiMVI) catchingFishStateFlowGson;
            int i2 = catchingFishContextMoshiMVI.CatchingFishFragmentHandler;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishContextMoshiMVI.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                obj2 = catchingFishContextMoshiMVI.CatchingFishViewModelFAB;
                i = catchingFishContextMoshiMVI.CatchingFishFragmentHandler;
                boolean z = true;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                    catchingFishContextMoshiMVI.CatchingFishViewModelScope = this;
                    catchingFishContextMoshiMVI.CatchingFishFragmentHandler = 1;
                    obj2 = this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(obj, catchingFishContextMoshiMVI);
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (obj2 == catchingFishXMLLayoutMockk) {
                        return catchingFishXMLLayoutMockk;
                    }
                    catchingFishStripeAPIGlide = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catchingFishStripeAPIGlide = catchingFishContextMoshiMVI.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = catchingFishStripeAPIGlide.CatchingFishWorkManager;
                CatchingFishKtorHiltIntent catchingFishKtorHiltIntent = catchingFishStripeAPIGlide.CatchingFishDaggerWebsocket;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) catchingFishKtorHiltIntent.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) catchingFishKtorHiltIntent.getValue()).getAll();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(all, "sharedPrefs.all");
            }
        }
        catchingFishContextMoshiMVI = new CatchingFishContextMoshiMVI(this, catchingFishStateFlowGson);
        obj2 = catchingFishContextMoshiMVI.CatchingFishViewModelFAB;
        i = catchingFishContextMoshiMVI.CatchingFishFragmentHandler;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
