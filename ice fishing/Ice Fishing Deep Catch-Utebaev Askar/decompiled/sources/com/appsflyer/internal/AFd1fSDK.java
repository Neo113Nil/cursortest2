package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFd1fSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    public String AFAdRevenueData;
    int getCurrencyIso4217Code;
    final String getMediationNetwork;
    public String getRevenue;

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static AFd1fSDK getMediationNetwork(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String monetizationNetwork = null;
            String monetizationNetwork2 = null;
            String monetizationNetwork3 = null;
            Integer numValueOf = null;
            for (String str2 : listSplit$default) {
                if (kotlin.text.o.d(str2, "label=")) {
                    monetizationNetwork = getMonetizationNetwork(str2, "label=");
                } else if (kotlin.text.o.d(str2, "hashName=")) {
                    monetizationNetwork2 = getMonetizationNetwork(str2, "hashName=");
                } else if (!kotlin.text.o.d(str2, "stackTrace=")) {
                    if (!kotlin.text.o.d(str2, "c=")) {
                        break;
                    }
                    String strSubstring = str2.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(kotlin.text.q.l(strSubstring).toString()));
                } else {
                    monetizationNetwork3 = getMonetizationNetwork(str2, "stackTrace=");
                }
            }
            if (getMediationNetwork(numValueOf, monetizationNetwork, monetizationNetwork2, monetizationNetwork3)) {
                return null;
            }
            Intrinsics.b(monetizationNetwork);
            Intrinsics.b(monetizationNetwork2);
            Intrinsics.b(monetizationNetwork3);
            Intrinsics.b(numValueOf);
            return new AFd1fSDK(monetizationNetwork, monetizationNetwork2, monetizationNetwork3, numValueOf.intValue());
        }

        private static String getMonetizationNetwork(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = kotlin.text.q.l(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0021  */
        private static boolean getMediationNetwork(Integer num, String... strArr) {
            boolean z = num == null;
            int length = strArr.length;
            for (int i2 = 0; i2 < 3; i2++) {
                String str = strArr[i2];
                if (z) {
                    z = true;
                } else if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
    }

    public AFd1fSDK(String str, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
        this.getRevenue = str3;
        this.getCurrencyIso4217Code = i2;
    }

    public final JSONObject AFAdRevenueData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFAdRevenueData);
        jSONObject.put("hash_name", this.getMediationNetwork);
        jSONObject.put("st", this.getRevenue);
        jSONObject.put("c", String.valueOf(this.getCurrencyIso4217Code));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1fSDK)) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) obj;
        return Intrinsics.a(this.AFAdRevenueData, aFd1fSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFd1fSDK.getMediationNetwork) && Intrinsics.a(this.getRevenue, aFd1fSDK.getRevenue) && this.getCurrencyIso4217Code == aFd1fSDK.getCurrencyIso4217Code;
    }

    public final String getMonetizationNetwork() {
        String str = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMediationNetwork;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getRevenue;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.getCurrencyIso4217Code;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getCurrencyIso4217Code) + ((this.getRevenue.hashCode() + ((this.getMediationNetwork.hashCode() + (this.AFAdRevenueData.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.AFAdRevenueData + ", hashName=" + this.getMediationNetwork + ", stackTrace=" + this.getRevenue + ", counter=" + this.getCurrencyIso4217Code + ")";
    }

    public /* synthetic */ AFd1fSDK(String str, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? 1 : i2);
    }
}
