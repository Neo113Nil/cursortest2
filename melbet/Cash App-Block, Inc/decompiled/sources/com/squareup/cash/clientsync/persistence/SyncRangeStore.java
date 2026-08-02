package com.squareup.cash.clientsync.persistence;

import java.util.List;

/* loaded from: classes.dex */
public interface SyncRangeStore {
    long deleteAllRanges();

    List getAllRanges();

    void replaceRanges(List list, List list2);
}
