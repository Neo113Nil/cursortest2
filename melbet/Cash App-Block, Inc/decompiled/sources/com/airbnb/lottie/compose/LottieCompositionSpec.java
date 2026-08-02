package com.airbnb.lottie.compose;

import android.net.Uri;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LottieCompositionSpec {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Asset implements LottieCompositionSpec {
        private final String assetName;

        private /* synthetic */ Asset(String str) {
            this.assetName = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Asset m1496boximpl(String str) {
            return new Asset(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1497constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1498equalsimpl(String str, Object obj) {
            return (obj instanceof Asset) && Intrinsics.areEqual(str, ((Asset) obj).m1502unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1499equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1500hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1501toStringimpl(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Asset(assetName=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1498equalsimpl(this.assetName, obj);
        }

        public final String getAssetName() {
            return this.assetName;
        }

        public int hashCode() {
            return m1500hashCodeimpl(this.assetName);
        }

        public String toString() {
            return m1501toStringimpl(this.assetName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1502unboximpl() {
            return this.assetName;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "equals", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/net/Uri;)I", "toString", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class ContentProvider implements LottieCompositionSpec {
        private final Uri uri;

        private /* synthetic */ ContentProvider(Uri uri) {
            this.uri = uri;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ContentProvider m1503boximpl(Uri uri) {
            return new ContentProvider(uri);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Uri m1504constructorimpl(Uri uri) {
            uri.getClass();
            return uri;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1505equalsimpl(Uri uri, Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.areEqual(uri, ((ContentProvider) obj).m1509unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1506equalsimpl0(Uri uri, Uri uri2) {
            return Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1507hashCodeimpl(Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1508toStringimpl(Uri uri) {
            return "ContentProvider(uri=" + uri + ")";
        }

        public boolean equals(Object obj) {
            return m1505equalsimpl(this.uri, obj);
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return m1507hashCodeimpl(this.uri);
        }

        public String toString() {
            return m1508toStringimpl(this.uri);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Uri m1509unboximpl() {
            return this.uri;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "fileName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class File implements LottieCompositionSpec {
        private final String fileName;

        private /* synthetic */ File(String str) {
            this.fileName = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ File m1510boximpl(String str) {
            return new File(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1511constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1512equalsimpl(String str, Object obj) {
            return (obj instanceof File) && Intrinsics.areEqual(str, ((File) obj).m1516unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1513equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1514hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1515toStringimpl(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("File(fileName=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1512equalsimpl(this.fileName, obj);
        }

        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            return m1514hashCodeimpl(this.fileName);
        }

        public String toString() {
            return m1515toStringimpl(this.fileName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1516unboximpl() {
            return this.fileName;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class JsonString implements LottieCompositionSpec {
        private final String jsonString;

        private /* synthetic */ JsonString(String str) {
            this.jsonString = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ JsonString m1517boximpl(String str) {
            return new JsonString(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1518constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1519equalsimpl(String str, Object obj) {
            return (obj instanceof JsonString) && Intrinsics.areEqual(str, ((JsonString) obj).m1523unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1520equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1521hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1522toStringimpl(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JsonString(jsonString=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1519equalsimpl(this.jsonString, obj);
        }

        public final String getJsonString() {
            return this.jsonString;
        }

        public int hashCode() {
            return m1521hashCodeimpl(this.jsonString);
        }

        public String toString() {
            return m1522toStringimpl(this.jsonString);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1523unboximpl() {
            return this.jsonString;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "constructor-impl", "(I)I", "getResId", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class RawRes implements LottieCompositionSpec {
        private final int resId;

        private /* synthetic */ RawRes(int i) {
            this.resId = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RawRes m1524boximpl(int i) {
            return new RawRes(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1525constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1526equalsimpl(int i, Object obj) {
            return (obj instanceof RawRes) && i == ((RawRes) obj).m1530unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1527equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1528hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1529toStringimpl(int i) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "RawRes(resId=", ")");
        }

        public boolean equals(Object obj) {
            return m1526equalsimpl(this.resId, obj);
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return m1528hashCodeimpl(this.resId);
        }

        public String toString() {
            return m1529toStringimpl(this.resId);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m1530unboximpl() {
            return this.resId;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "url", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Url implements LottieCompositionSpec {
        private final String url;

        private /* synthetic */ Url(String str) {
            this.url = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Url m1531boximpl(String str) {
            return new Url(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1532constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1533equalsimpl(String str, Object obj) {
            return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m1537unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1534equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1535hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1536toStringimpl(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(url=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1533equalsimpl(this.url, obj);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return m1535hashCodeimpl(this.url);
        }

        public String toString() {
            return m1536toStringimpl(this.url);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1537unboximpl() {
            return this.url;
        }
    }
}
