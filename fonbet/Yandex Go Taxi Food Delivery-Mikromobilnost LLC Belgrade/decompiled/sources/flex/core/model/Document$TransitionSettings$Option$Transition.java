package flex.core.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"flex/core/model/Document$TransitionSettings$Option$Transition", "", "Lflex/core/model/Document$TransitionSettings$Option$Transition;", "CrossDissolve", "BottomSurfacing", "flex-model"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Document$TransitionSettings$Option$Transition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Document$TransitionSettings$Option$Transition[] $VALUES;
    public static final Document$TransitionSettings$Option$Transition BottomSurfacing;
    public static final Document$TransitionSettings$Option$Transition CrossDissolve;

    static {
        Document$TransitionSettings$Option$Transition document$TransitionSettings$Option$Transition = new Document$TransitionSettings$Option$Transition("CrossDissolve", 0);
        CrossDissolve = document$TransitionSettings$Option$Transition;
        Document$TransitionSettings$Option$Transition document$TransitionSettings$Option$Transition2 = new Document$TransitionSettings$Option$Transition("BottomSurfacing", 1);
        BottomSurfacing = document$TransitionSettings$Option$Transition2;
        Document$TransitionSettings$Option$Transition[] document$TransitionSettings$Option$TransitionArr = {document$TransitionSettings$Option$Transition, document$TransitionSettings$Option$Transition2};
        $VALUES = document$TransitionSettings$Option$TransitionArr;
        $ENTRIES = a.a(document$TransitionSettings$Option$TransitionArr);
    }

    public static Document$TransitionSettings$Option$Transition valueOf(String str) {
        return (Document$TransitionSettings$Option$Transition) Enum.valueOf(Document$TransitionSettings$Option$Transition.class, str);
    }

    public static Document$TransitionSettings$Option$Transition[] values() {
        return (Document$TransitionSettings$Option$Transition[]) $VALUES.clone();
    }
}
