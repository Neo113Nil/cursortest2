package ru.yandex.taxi.net.taxi.dto.request;

import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.zrn;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/net/taxi/dto/request/EmailParam$Action", "", "Lru/yandex/taxi/net/taxi/dto/request/EmailParam$Action;", "Companion", "zrn", "SET", "UNSET", "GET", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailParam$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EmailParam$Action[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zrn Companion;
    public static final EmailParam$Action GET;
    public static final EmailParam$Action SET;
    public static final EmailParam$Action UNSET;

    static {
        EmailParam$Action emailParam$Action = new EmailParam$Action("SET", 0);
        SET = emailParam$Action;
        EmailParam$Action emailParam$Action2 = new EmailParam$Action("UNSET", 1);
        UNSET = emailParam$Action2;
        EmailParam$Action emailParam$Action3 = new EmailParam$Action("GET", 2);
        GET = emailParam$Action3;
        EmailParam$Action[] emailParam$ActionArr = {emailParam$Action, emailParam$Action2, emailParam$Action3};
        $VALUES = emailParam$ActionArr;
        $ENTRIES = kotlin.enums.a.a(emailParam$ActionArr);
        Companion = new zrn();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(18));
    }

    public static EmailParam$Action valueOf(String str) {
        return (EmailParam$Action) Enum.valueOf(EmailParam$Action.class, str);
    }

    public static EmailParam$Action[] values() {
        return (EmailParam$Action[]) $VALUES.clone();
    }
}
