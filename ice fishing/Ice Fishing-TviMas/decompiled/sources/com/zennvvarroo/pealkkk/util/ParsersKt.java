package com.zennvvarroo.pealkkk.util;

import com.zennvvarroo.pealkkk.data.model.AreaColor;
import com.zennvvarroo.pealkkk.data.model.ItemCategory;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Parsers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\b"}, d2 = {"areaColorOf", "Lcom/zennvvarroo/pealkkk/data/model/AreaColor;", "name", "", "categoryOf", "Lcom/zennvvarroo/pealkkk/data/model/ItemCategory;", "sanitize", "s", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParsersKt {
    public static final AreaColor areaColorOf(String name) {
        Object m6239constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(AreaColor.valueOf(name));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
        }
        AreaColor areaColor = AreaColor.CYAN;
        if (Result.m6245isFailureimpl(m6239constructorimpl)) {
            m6239constructorimpl = areaColor;
        }
        return (AreaColor) m6239constructorimpl;
    }

    public static final ItemCategory categoryOf(String name) {
        Object m6239constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(ItemCategory.valueOf(name));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
        }
        ItemCategory itemCategory = ItemCategory.OTHER;
        if (Result.m6245isFailureimpl(m6239constructorimpl)) {
            m6239constructorimpl = itemCategory;
        }
        return (ItemCategory) m6239constructorimpl;
    }

    public static final String sanitize(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return StringsKt.replace$default(StringsKt.replace$default(s, "§", " ", false, 4, (Object) null), "¶", " ", false, 4, (Object) null);
    }
}
