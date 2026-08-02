package androidx.core.provider;

import android.util.Base64;
import androidx.room.TransactorKt;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes.dex */
public final class FontRequest {
    public final List mCertificates;
    public final int mCertificatesArray;
    public final String mIdentifier;
    public final String mProviderAuthority;
    public final String mProviderPackage;
    public final String mQuery;
    public final String mSystemFont;
    public final String mVariationSettings;

    public FontRequest() {
        this.mProviderAuthority = "com.google.android.gms.fonts";
        this.mProviderPackage = "com.google.android.gms";
        this.mQuery = "Noto Color Emoji Compat";
        this.mCertificates = null;
        TransactorKt.checkArgument(true);
        this.mCertificatesArray = R.array.com_google_android_gms_fonts_certs;
        this.mSystemFont = null;
        this.mVariationSettings = null;
        this.mIdentifier = createIdentifier("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", null, null);
    }

    public static String createIdentifier(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mSystemFont: " + this.mSystemFont + ", mVariationSettings: " + this.mVariationSettings + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.mCertificates;
            if (i >= list.size()) {
                sb.append("}");
                sb.append("mCertificatesArray: " + this.mCertificatesArray);
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }

    public FontRequest(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        this.mProviderAuthority = str;
        str2.getClass();
        this.mProviderPackage = str2;
        this.mQuery = str3;
        list.getClass();
        this.mCertificates = list;
        this.mCertificatesArray = 0;
        this.mSystemFont = str4;
        this.mVariationSettings = str5;
        this.mIdentifier = createIdentifier(str, str2, str3, str4, str5);
    }
}
