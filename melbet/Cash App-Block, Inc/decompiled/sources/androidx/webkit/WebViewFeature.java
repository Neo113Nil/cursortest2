package androidx.webkit;

import androidx.camera.view.PreviewView;
import androidx.webkit.internal.ApiFeature$M;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class WebViewFeature {
    public static final PreviewView.AnonymousClass1 INSTANCE = new PreviewView.AnonymousClass1();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isFeatureSupported(String str) {
        boolean z;
        ApiFeature$M apiFeature$M = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        Set<ApiFeature$M> unmodifiableSet = Collections.unmodifiableSet(ApiFeature$M.sValues);
        HashSet hashSet = new HashSet();
        for (ApiFeature$M apiFeature$M2 : unmodifiableSet) {
            if (apiFeature$M2.mPublicFeatureValue.equals(str)) {
                hashSet.add(apiFeature$M2);
            }
        }
        if (hashSet.isEmpty()) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ApiFeature$M apiFeature$M3 = (ApiFeature$M) it.next();
            switch (apiFeature$M3.$r8$classId) {
                case 0:
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                    z = true;
                    break;
                case 2:
                case 3:
                    z = false;
                    break;
            }
            if (z || apiFeature$M3.isSupportedByWebView()) {
                return true;
            }
        }
        return false;
    }
}
