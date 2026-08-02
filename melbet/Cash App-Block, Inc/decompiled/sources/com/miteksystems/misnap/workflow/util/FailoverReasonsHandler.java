package com.miteksystems.misnap.workflow.util;

import com.miteksystems.misnap.core.UserAction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes4.dex */
public final class FailoverReasonsHandler {
    public LinkedHashMap a;
    public int b;

    public static LinkedHashMap a() {
        return MapsKt__MapsKt.mutableMapOf(new Pair(UserAction.Document.NOT_FOUND.INSTANCE, 0), new Pair(UserAction.Document.STRAIGHTEN.INSTANCE, 0), new Pair(UserAction.Document.USE_DARK_BACKGROUND.INSTANCE, 0), new Pair(UserAction.Document.TOO_FAR.INSTANCE, 0), new Pair(UserAction.Document.TOO_CLOSE.INSTANCE, 0), new Pair(UserAction.Document.TOO_DARK.INSTANCE, 0), new Pair(UserAction.Document.TOO_BRIGHT.INSTANCE, 0), new Pair(UserAction.Document.REDUCE_GLARE.INSTANCE, 0), new Pair(UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE, 0), new Pair(UserAction.Document.WRONG_DOCUMENT.INSTANCE, 0), new Pair(UserAction.Document.MRZ_NOT_FOUND.INSTANCE, 0), new Pair(UserAction.Face.NOT_FOUND.INSTANCE, 0), new Pair(UserAction.Face.STRAIGHTEN.INSTANCE, 0), new Pair(UserAction.Face.MULTIPLE_FACES.INSTANCE, 0), new Pair(UserAction.Face.TOO_FAR.INSTANCE, 0), new Pair(UserAction.Face.TOO_CLOSE.INSTANCE, 0), new Pair(UserAction.Face.OPEN_EYES.INSTANCE, 0), new Pair(UserAction.Barcode.NOT_FOUND.INSTANCE, 0));
    }

    public final void handleFrameWarnings(List list) {
        this.b++;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserAction userAction = (UserAction) it.next();
            if (this.a.containsKey(userAction)) {
                LinkedHashMap linkedHashMap = this.a;
                linkedHashMap.put(userAction, Integer.valueOf(((Number) MapsKt__MapsKt.getValue(linkedHashMap, userAction)).intValue() + 1));
            }
        }
    }
}
