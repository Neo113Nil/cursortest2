package ru.yandex.taxi.persuggest.api.finalsuggest;

import defpackage.a1o;
import defpackage.ep;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/persuggest/api/finalsuggest/Action;", "", "La1o;", "tag", "La1o;", "b", "()La1o;", "Companion", "ep", "PIN_DROP", "FINALIZE", "REDIRECT", "GEOMAGNET", "COORD_PROVIDERS_POLL", "PHOTO_FLOW", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Action COORD_PROVIDERS_POLL;
    public static final ep Companion;
    public static final Action FINALIZE;
    public static final Action GEOMAGNET;
    public static final Action PHOTO_FLOW;
    public static final Action PIN_DROP;
    public static final Action REDIRECT;
    private final a1o tag;

    static {
        Action action = new Action("PIN_DROP", 0, new a1o("pin_drop"));
        PIN_DROP = action;
        Action action2 = new Action("FINALIZE", 1, new a1o("finalize"));
        FINALIZE = action2;
        Action action3 = new Action("REDIRECT", 2, new a1o("redirect"));
        REDIRECT = action3;
        Action action4 = new Action("GEOMAGNET", 3, new a1o("geomagnet"));
        GEOMAGNET = action4;
        Action action5 = new Action("COORD_PROVIDERS_POLL", 4, new a1o("coord_providers_poll"));
        COORD_PROVIDERS_POLL = action5;
        Action action6 = new Action("PHOTO_FLOW", 5, new a1o("photo_flow"));
        PHOTO_FLOW = action6;
        Action[] actionArr = {action, action2, action3, action4, action5, action6};
        $VALUES = actionArr;
        $ENTRIES = a.a(actionArr);
        Companion = new ep();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(0));
    }

    public Action(String str, int i, a1o a1oVar) {
        this.tag = a1oVar;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final a1o getTag() {
        return this.tag;
    }
}
