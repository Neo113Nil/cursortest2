package defpackage;

import com.google.common.cache.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class iig {
    public static final fig a;
    public static final gig b;
    public static final hig c;
    public static final /* synthetic */ iig[] d;

    static {
        fig figVar = new fig();
        a = figVar;
        gig gigVar = new gig();
        b = gigVar;
        hig higVar = new hig();
        c = higVar;
        d = new iig[]{figVar, gigVar, higVar};
    }

    public static iig valueOf(String str) {
        return (iig) Enum.valueOf(iig.class, str);
    }

    public static iig[] values() {
        return (iig[]) d.clone();
    }

    public abstract qeb a();

    public abstract nig b(a aVar, crn crnVar, Object obj);
}
