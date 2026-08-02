package com.miteksystems.misnap.controller;

import android.graphics.Point;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class MiSnapController$formatDocumentIqaResultsForMiBi$1$1 extends Lambda implements Function1 {
    public static final MiSnapController$formatDocumentIqaResultsForMiBi$1$1 INSTANCE = new MiSnapController$formatDocumentIqaResultsForMiBi$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Point point = (Point) obj;
        point.getClass();
        StringBuilder sb = new StringBuilder("(");
        sb.append(point.x);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, point.y, ')');
    }
}
