package ru.yandex.taxi.locationsdk.core.utils;

import defpackage.tvc;
import defpackage.vvc;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class InputSourcePriorityKt$mergeActivePriorities$1 extends FunctionReferenceImpl implements wls {
    public static final InputSourcePriorityKt$mergeActivePriorities$1 b = new InputSourcePriorityKt$mergeActivePriorities$1(2, 1, tvc.class, "maxOf", "maxOf(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return (InputSourcePriority$Active) vvc.c((InputSourcePriority$Active) obj, (InputSourcePriority$Active) obj2);
    }
}
