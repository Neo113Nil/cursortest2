package flex.loader;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lflex/loader/DocumentFetchOrigin;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Network", "Cache", "Preview", "flex-loader"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentFetchOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DocumentFetchOrigin[] $VALUES;
    public static final DocumentFetchOrigin Cache;
    public static final DocumentFetchOrigin Network;
    public static final DocumentFetchOrigin Preview;
    private final String value;

    static {
        DocumentFetchOrigin documentFetchOrigin = new DocumentFetchOrigin("Network", 0, "network");
        Network = documentFetchOrigin;
        DocumentFetchOrigin documentFetchOrigin2 = new DocumentFetchOrigin("Cache", 1, "cache");
        Cache = documentFetchOrigin2;
        DocumentFetchOrigin documentFetchOrigin3 = new DocumentFetchOrigin("Preview", 2, "preview");
        Preview = documentFetchOrigin3;
        DocumentFetchOrigin[] documentFetchOriginArr = {documentFetchOrigin, documentFetchOrigin2, documentFetchOrigin3};
        $VALUES = documentFetchOriginArr;
        $ENTRIES = a.a(documentFetchOriginArr);
    }

    public DocumentFetchOrigin(String str, int i, String str2) {
        this.value = str2;
    }

    public static DocumentFetchOrigin valueOf(String str) {
        return (DocumentFetchOrigin) Enum.valueOf(DocumentFetchOrigin.class, str);
    }

    public static DocumentFetchOrigin[] values() {
        return (DocumentFetchOrigin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
