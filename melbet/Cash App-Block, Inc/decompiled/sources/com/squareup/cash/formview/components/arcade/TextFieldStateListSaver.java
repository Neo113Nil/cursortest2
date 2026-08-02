package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes6.dex */
public final class TextFieldStateListSaver implements Saver {
    public static final TextFieldStateListSaver INSTANCE = new TextFieldStateListSaver();

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public final Object mo380restore(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            TextFieldState restore = next != null ? TextFieldState.Saver.restore(next) : null;
            if (restore != null) {
                arrayList.add(restore);
            }
        }
        return arrayList;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object save(SaveableHolder saveableHolder, Object obj) {
        List list = (List) obj;
        saveableHolder.getClass();
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(TextFieldState.Saver.save(saveableHolder, (TextFieldState) it.next()));
        }
        return arrayList;
    }
}
