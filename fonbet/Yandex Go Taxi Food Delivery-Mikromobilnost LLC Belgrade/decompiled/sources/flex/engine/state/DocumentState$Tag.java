package flex.engine.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"flex/engine/state/DocumentState$Tag", "", "Lflex/engine/state/DocumentState$Tag;", "IDLE", "LOADING", "REFRESHING", "RENDERED", "FAILED", "flex-engine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DocumentState$Tag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DocumentState$Tag[] $VALUES;
    public static final DocumentState$Tag FAILED;
    public static final DocumentState$Tag IDLE;
    public static final DocumentState$Tag LOADING;
    public static final DocumentState$Tag REFRESHING;
    public static final DocumentState$Tag RENDERED;

    static {
        DocumentState$Tag documentState$Tag = new DocumentState$Tag("IDLE", 0);
        IDLE = documentState$Tag;
        DocumentState$Tag documentState$Tag2 = new DocumentState$Tag("LOADING", 1);
        LOADING = documentState$Tag2;
        DocumentState$Tag documentState$Tag3 = new DocumentState$Tag("REFRESHING", 2);
        REFRESHING = documentState$Tag3;
        DocumentState$Tag documentState$Tag4 = new DocumentState$Tag("RENDERED", 3);
        RENDERED = documentState$Tag4;
        DocumentState$Tag documentState$Tag5 = new DocumentState$Tag("FAILED", 4);
        FAILED = documentState$Tag5;
        DocumentState$Tag[] documentState$TagArr = {documentState$Tag, documentState$Tag2, documentState$Tag3, documentState$Tag4, documentState$Tag5};
        $VALUES = documentState$TagArr;
        $ENTRIES = a.a(documentState$TagArr);
    }

    public static DocumentState$Tag valueOf(String str) {
        return (DocumentState$Tag) Enum.valueOf(DocumentState$Tag.class, str);
    }

    public static DocumentState$Tag[] values() {
        return (DocumentState$Tag[]) $VALUES.clone();
    }
}
