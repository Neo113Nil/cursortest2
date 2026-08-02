package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes3.dex */
public final class AnnotatedString$special$$inlined$sortedBy$1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AnnotatedString$special$$inlined$sortedBy$1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) obj).start), Integer.valueOf(((AnnotatedString.Range) obj2).start));
    }
}
