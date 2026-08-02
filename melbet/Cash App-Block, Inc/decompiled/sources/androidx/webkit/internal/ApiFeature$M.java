package androidx.webkit.internal;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class ApiFeature$M {
    public static final HashSet sValues = new HashSet();
    public final /* synthetic */ int $r8$classId;
    public final String mInternalFeatureValue;
    public final String mPublicFeatureValue;

    public ApiFeature$M(String str, String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    public boolean isSupportedByWebView() {
        HashSet hashSet = ApiFeature$LAZY_HOLDER.WEBVIEW_APK_FEATURES;
        String str = this.mInternalFeatureValue;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiFeature$M(String str, String str2, int i) {
        this(str, str2);
        this.$r8$classId = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiFeature$M(String str) {
        this("IMPLEMENTATION_ONLY_FEATURE", str);
        this.$r8$classId = 3;
    }
}
