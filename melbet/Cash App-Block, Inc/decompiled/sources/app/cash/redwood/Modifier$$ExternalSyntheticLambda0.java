package app.cash.redwood;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.text.TextLayoutResult;
import app.cash.redwood.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final /* synthetic */ class Modifier$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef f$0;

    public /* synthetic */ Modifier$$ExternalSyntheticLambda0(int i, Ref$ObjectRef ref$ObjectRef) {
        this.$r8$classId = i;
        this.f$0 = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.f$0;
        switch (i) {
            case 0:
                Modifier.Element element = (Modifier.Element) obj;
                element.getClass();
                ref$ObjectRef.element = new CombinedModifier((Modifier) ref$ObjectRef.element, element);
                break;
            case 1:
                TraversableNode traversableNode = (TraversableNode) obj;
                traversableNode.getClass();
                LazyLayoutPrefetchState lazyLayoutPrefetchState = ((TraversablePrefetchStateNode) traversableNode).prefetchState;
                List list = (List) ref$ObjectRef.element;
                if (list != null) {
                    list.add(lazyLayoutPrefetchState);
                } else {
                    list = CollectionsKt__CollectionsKt.mutableListOf(lazyLayoutPrefetchState);
                }
                ref$ObjectRef.element = list;
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                Object obj2 = ref$ObjectRef.element;
                break;
            case 3:
                ((Modifier.UnscopedElement) obj).getClass();
                if (ref$ObjectRef.element == null) {
                    break;
                } else {
                    break;
                }
            case 4:
                TextFieldState textFieldState = (TextFieldState) obj;
                textFieldState.getClass();
                ref$ObjectRef.element = textFieldState;
                break;
            case 5:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                ref$ObjectRef.element = textLayoutResult;
                break;
            default:
                JsonElement jsonElement = (JsonElement) obj;
                jsonElement.getClass();
                ref$ObjectRef.element = jsonElement;
                break;
        }
        return Unit.INSTANCE;
    }
}
