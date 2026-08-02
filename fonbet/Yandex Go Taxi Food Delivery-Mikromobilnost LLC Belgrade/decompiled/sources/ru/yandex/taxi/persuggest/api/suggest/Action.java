package ru.yandex.taxi.persuggest.api.suggest;

import defpackage.a1o;
import defpackage.fp;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/persuggest/api/suggest/Action;", "", "La1o;", "tag", "La1o;", "b", "()La1o;", "Companion", "fp", "SEARCH", "USER_INPUT", "USER_SELECT", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final fp Companion;
    public static final Action SEARCH;
    public static final Action USER_INPUT;
    public static final Action USER_SELECT;
    private final a1o tag;

    static {
        Action action = new Action("SEARCH", 0, new a1o("search"));
        SEARCH = action;
        Action action2 = new Action("USER_INPUT", 1, new a1o("user_input"));
        USER_INPUT = action2;
        Action action3 = new Action("USER_SELECT", 2, new a1o("user_select"));
        USER_SELECT = action3;
        Action[] actionArr = {action, action2, action3};
        $VALUES = actionArr;
        $ENTRIES = a.a(actionArr);
        Companion = new fp();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(12));
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
