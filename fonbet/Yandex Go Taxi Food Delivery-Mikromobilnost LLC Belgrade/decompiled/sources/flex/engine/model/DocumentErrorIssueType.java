package flex.engine.model;

import defpackage.jxi;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@jxi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lflex/engine/model/DocumentErrorIssueType;", "", "UNKNOWN", "NETWORK", "PARSING", "flex-engine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DocumentErrorIssueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DocumentErrorIssueType[] $VALUES;
    public static final DocumentErrorIssueType NETWORK;
    public static final DocumentErrorIssueType PARSING;
    public static final DocumentErrorIssueType UNKNOWN;

    static {
        DocumentErrorIssueType documentErrorIssueType = new DocumentErrorIssueType("UNKNOWN", 0);
        UNKNOWN = documentErrorIssueType;
        DocumentErrorIssueType documentErrorIssueType2 = new DocumentErrorIssueType("NETWORK", 1);
        NETWORK = documentErrorIssueType2;
        DocumentErrorIssueType documentErrorIssueType3 = new DocumentErrorIssueType("PARSING", 2);
        PARSING = documentErrorIssueType3;
        DocumentErrorIssueType[] documentErrorIssueTypeArr = {documentErrorIssueType, documentErrorIssueType2, documentErrorIssueType3};
        $VALUES = documentErrorIssueTypeArr;
        $ENTRIES = a.a(documentErrorIssueTypeArr);
    }

    public static DocumentErrorIssueType valueOf(String str) {
        return (DocumentErrorIssueType) Enum.valueOf(DocumentErrorIssueType.class, str);
    }

    public static DocumentErrorIssueType[] values() {
        return (DocumentErrorIssueType[]) $VALUES.clone();
    }
}
