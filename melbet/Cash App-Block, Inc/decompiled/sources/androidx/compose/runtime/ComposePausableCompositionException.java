package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.text.StringsKt__IndentKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ComposePausableCompositionException extends RuntimeException {
    public final MutableObjectList instances;
    public final int lastOperation;

    /* renamed from: operations, reason: collision with root package name */
    public final MutableIntList f852operations;
    public final MutableObjectList reused;

    public ComposePausableCompositionException(MutableObjectList mutableObjectList, MutableObjectList mutableObjectList2, MutableIntList mutableIntList, int i, Exception exc) {
        super(exc);
        this.instances = mutableObjectList;
        this.reused = mutableObjectList2;
        this.f852operations = mutableIntList;
        this.lastOperation = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.lastOperation);
        sb.append(":\n            |");
        SequenceBuilderIterator it = SequencesKt__SequenceBuilderKt.iterator(new ComposePausableCompositionException$operationsSequence$1(this, null));
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                list = arrayList;
            } else {
                list = CollectionsKt__CollectionsJVMKt.listOf(next);
            }
        } else {
            list = EmptyList.INSTANCE;
        }
        sb.append(CollectionsKt.joinToString$default(CollectionsKt.takeLast(50, list), "\n", null, null, 0, null, null, 62));
        sb.append("\n            ");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }
}
