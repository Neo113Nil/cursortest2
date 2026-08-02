package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1;
import androidx.glance.ImageKt$Image$finalModifier$1$1;
import coil3.svg.internal.ParseSvg_androidKt;
import io.noties.markwon.LinkResolverDef;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes3.dex */
public final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements Function1 {
    public final /* synthetic */ Object $activeNodeBeforeSearch;
    public final /* synthetic */ int $direction;
    public final /* synthetic */ Object $focusedItem;
    public final /* synthetic */ Lambda $onFound;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_generateAndSearchChildren;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDimensionalFocusSearchKt$generateAndSearchChildren$1(Ref$IntRef ref$IntRef, int i, String str, CommonMarkdownConstraints commonMarkdownConstraints, ImageKt$Image$finalModifier$1$1 imageKt$Image$finalModifier$1$1) {
        super(1);
        this.$r8$classId = 2;
        this.$activeNodeBeforeSearch = ref$IntRef;
        this.$direction = i;
        this.$this_generateAndSearchChildren = str;
        this.$focusedItem = commonMarkdownConstraints;
        this.$onFound = imageKt$Image$finalModifier$1$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Integer num = null;
        Lambda lambda = this.$onFound;
        int i2 = this.$direction;
        Object obj2 = this.$activeNodeBeforeSearch;
        Object obj3 = this.$focusedItem;
        Object obj4 = this.$this_generateAndSearchChildren;
        switch (i) {
            case 0:
                BeyondBoundsLayout$BeyondBoundsScope beyondBoundsLayout$BeyondBoundsScope = (BeyondBoundsLayout$BeyondBoundsScope) obj;
                FocusTargetNode focusTargetNode = (FocusTargetNode) obj4;
                if (((FocusTargetNode) obj2) != ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.getActiveFocusTargetNode()) {
                    return Boolean.TRUE;
                }
                boolean m604searchChildren4C6V_qg = FocusOwnerImplKt.m604searchChildren4C6V_qg(focusTargetNode, (FocusTargetNode) obj3, i2, (FocusOwnerImpl$focusSearch$1) lambda);
                Boolean valueOf = Boolean.valueOf(m604searchChildren4C6V_qg);
                if (m604searchChildren4C6V_qg || !beyondBoundsLayout$BeyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            case 1:
                BeyondBoundsLayout$BeyondBoundsScope beyondBoundsLayout$BeyondBoundsScope2 = (BeyondBoundsLayout$BeyondBoundsScope) obj;
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj4;
                if (((FocusTargetNode) obj2) != ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode2)).focusOwner.getActiveFocusTargetNode()) {
                    return Boolean.TRUE;
                }
                boolean m617searchChildren4C6V_qg = FocusTraversalKt.m617searchChildren4C6V_qg(i2, (FocusOwnerImpl$focusSearch$1) lambda, focusTargetNode2, (Rect) obj3);
                Boolean valueOf2 = Boolean.valueOf(m617searchChildren4C6V_qg);
                if (m617searchChildren4C6V_qg || !beyondBoundsLayout$BeyondBoundsScope2.getHasMoreContent()) {
                    return valueOf2;
                }
                return null;
            default:
                CommonMarkdownConstraints commonMarkdownConstraints = (CommonMarkdownConstraints) obj;
                String str = (String) obj4;
                CommonMarkdownConstraints commonMarkdownConstraints2 = (CommonMarkdownConstraints) obj3;
                commonMarkdownConstraints.getClass();
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                if (ref$IntRef.element < i2) {
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    int charsEaten = ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, str);
                    ref$IntRef2.element = charsEaten;
                    AndroidPopup_androidKt$Popup$2$1 androidPopup_androidKt$Popup$2$1 = new AndroidPopup_androidKt$Popup$2$1(new Ref$IntRef(), ref$IntRef2, str, new Ref$IntRef(), 2);
                    char[] cArr = commonMarkdownConstraints2.types;
                    int[] iArr = commonMarkdownConstraints2.indents;
                    if (cArr[ref$IntRef.element] == '>') {
                        num = (Integer) ((ImageKt$Image$finalModifier$1$1) lambda).invoke(Integer.valueOf(charsEaten));
                        if (num != null) {
                            ref$IntRef2.element = num.intValue() + ref$IntRef2.element;
                            ref$IntRef.element++;
                        }
                    }
                    int i3 = ref$IntRef.element;
                    while (true) {
                        int i4 = ref$IntRef.element;
                        if (i4 < i2 && cArr[i4] != '>') {
                            if (((Boolean) androidPopup_androidKt$Popup$2$1.invoke(Integer.valueOf(iArr[i4] - (i4 == 0 ? 0 : iArr[i4 - 1])))).booleanValue()) {
                                ref$IntRef.element++;
                            }
                        }
                    }
                    if (num != null) {
                        boolean booleanValue = ((Boolean) androidPopup_androidKt$Popup$2$1.invoke(1)).booleanValue();
                        CommonMarkdownConstraints commonMarkdownConstraints3 = CommonMarkdownConstraints.BASE;
                        commonMarkdownConstraints = LinkResolverDef.access$create(commonMarkdownConstraints, num.intValue() + (booleanValue ? 1 : 0), '>', true, ref$IntRef2.element);
                    }
                    int i5 = ref$IntRef.element;
                    while (i3 < i5) {
                        int i6 = iArr[i3] - (i3 == 0 ? 0 : iArr[i3 - 1]);
                        CommonMarkdownConstraints commonMarkdownConstraints4 = CommonMarkdownConstraints.BASE;
                        commonMarkdownConstraints = LinkResolverDef.access$create(commonMarkdownConstraints, i6, cArr[i3], false, ref$IntRef2.element);
                        i3++;
                    }
                }
                return commonMarkdownConstraints;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, Object obj, int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.$activeNodeBeforeSearch = focusTargetNode;
        this.$this_generateAndSearchChildren = focusTargetNode2;
        this.$focusedItem = obj;
        this.$direction = i;
        this.$onFound = focusOwnerImpl$focusSearch$1;
    }
}
