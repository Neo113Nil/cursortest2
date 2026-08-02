package ru.yandex.taxi.preorder.suggested.selection;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/preorder/suggested/selection/SuggestViewModel$SuggestGroupId", "", "Lru/yandex/taxi/preorder/suggested/selection/SuggestViewModel$SuggestGroupId;", "", "groupId", CA20Status.STATUS_USER_I, "a", "()I", "CurrentLocation", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuggestViewModel$SuggestGroupId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestViewModel$SuggestGroupId[] $VALUES;
    public static final SuggestViewModel$SuggestGroupId CurrentLocation;
    private final int groupId = -1;

    static {
        SuggestViewModel$SuggestGroupId suggestViewModel$SuggestGroupId = new SuggestViewModel$SuggestGroupId();
        CurrentLocation = suggestViewModel$SuggestGroupId;
        SuggestViewModel$SuggestGroupId[] suggestViewModel$SuggestGroupIdArr = {suggestViewModel$SuggestGroupId};
        $VALUES = suggestViewModel$SuggestGroupIdArr;
        $ENTRIES = kotlin.enums.a.a(suggestViewModel$SuggestGroupIdArr);
    }

    public static SuggestViewModel$SuggestGroupId valueOf(String str) {
        return (SuggestViewModel$SuggestGroupId) Enum.valueOf(SuggestViewModel$SuggestGroupId.class, str);
    }

    public static SuggestViewModel$SuggestGroupId[] values() {
        return (SuggestViewModel$SuggestGroupId[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }
}
