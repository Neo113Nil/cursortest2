package com.squareup.cash.moneybot.presenters;

import com.squareup.cash.moneybot.backend.api.model.chat.Session;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes7.dex */
public final class MoneybotChatHistoryPresenter$content$$inlined$sortedByDescending$1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ComparisonsKt__ComparisonsKt.compareValues(((Session) obj2).updatedAtMs, ((Session) obj).updatedAtMs);
    }
}
