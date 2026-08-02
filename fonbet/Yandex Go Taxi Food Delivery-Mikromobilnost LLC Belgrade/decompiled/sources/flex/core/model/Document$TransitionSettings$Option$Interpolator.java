package flex.core.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"flex/core/model/Document$TransitionSettings$Option$Interpolator", "", "Lflex/core/model/Document$TransitionSettings$Option$Interpolator;", "Linear", "EaseIn", "EaseOut", "EaseInOut", "flex-model"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Document$TransitionSettings$Option$Interpolator {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Document$TransitionSettings$Option$Interpolator[] $VALUES;
    public static final Document$TransitionSettings$Option$Interpolator EaseIn;
    public static final Document$TransitionSettings$Option$Interpolator EaseInOut;
    public static final Document$TransitionSettings$Option$Interpolator EaseOut;
    public static final Document$TransitionSettings$Option$Interpolator Linear;

    static {
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator = new Document$TransitionSettings$Option$Interpolator("Linear", 0);
        Linear = document$TransitionSettings$Option$Interpolator;
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator2 = new Document$TransitionSettings$Option$Interpolator("EaseIn", 1);
        EaseIn = document$TransitionSettings$Option$Interpolator2;
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator3 = new Document$TransitionSettings$Option$Interpolator("EaseOut", 2);
        EaseOut = document$TransitionSettings$Option$Interpolator3;
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator4 = new Document$TransitionSettings$Option$Interpolator("EaseInOut", 3);
        EaseInOut = document$TransitionSettings$Option$Interpolator4;
        Document$TransitionSettings$Option$Interpolator[] document$TransitionSettings$Option$InterpolatorArr = {document$TransitionSettings$Option$Interpolator, document$TransitionSettings$Option$Interpolator2, document$TransitionSettings$Option$Interpolator3, document$TransitionSettings$Option$Interpolator4};
        $VALUES = document$TransitionSettings$Option$InterpolatorArr;
        $ENTRIES = a.a(document$TransitionSettings$Option$InterpolatorArr);
    }

    public static Document$TransitionSettings$Option$Interpolator valueOf(String str) {
        return (Document$TransitionSettings$Option$Interpolator) Enum.valueOf(Document$TransitionSettings$Option$Interpolator.class, str);
    }

    public static Document$TransitionSettings$Option$Interpolator[] values() {
        return (Document$TransitionSettings$Option$Interpolator[]) $VALUES.clone();
    }
}
