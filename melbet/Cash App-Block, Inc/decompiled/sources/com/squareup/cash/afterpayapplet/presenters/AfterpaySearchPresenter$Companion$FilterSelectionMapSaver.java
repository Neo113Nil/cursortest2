package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class AfterpaySearchPresenter$Companion$FilterSelectionMapSaver implements Saver {
    public static final AfterpaySearchPresenter$Companion$FilterSelectionMapSaver INSTANCE = new AfterpaySearchPresenter$Companion$FilterSelectionMapSaver();

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public final Object mo380restore(Object obj) {
        SnapshotStateMap snapshotStateMap = new SnapshotStateMap();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            List split$default = StringsKt.split$default((String) it.next(), new char[]{','}, 6);
            if (split$default.size() >= 2) {
                Object obj2 = split$default.get(0);
                CharSequence charSequence = (CharSequence) split$default.get(1);
                if (StringsKt.isBlank(charSequence)) {
                    charSequence = null;
                }
                snapshotStateMap.put(obj2, charSequence);
            }
        }
        return snapshotStateMap;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object save(SaveableHolder saveableHolder, Object obj) {
        SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj;
        saveableHolder.getClass();
        snapshotStateMap.getClass();
        ArrayList arrayList = new ArrayList(snapshotStateMap.size());
        Iterator it = snapshotStateMap.entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(str + "," + str2);
        }
        return arrayList;
    }
}
