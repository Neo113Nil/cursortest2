package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.room.util.DBUtil;
import kotlin.jvm.functions.Function1;
import org.intellij.markdown.lexer.Stack;

/* loaded from: classes3.dex */
public abstract class TextContextMenuModifierKt {
    public static final TextContextMenuData collectTextContextMenuData(DelegatableNode delegatableNode) {
        TextContextMenuSeparator textContextMenuSeparator;
        TextContextMenuBuilderScope textContextMenuBuilderScope = new TextContextMenuBuilderScope();
        DepthSortedSetKt.traverseAncestors(delegatableNode, TextContextMenuDataTraverseKey.INSTANCE, new ObjectList$$ExternalSyntheticLambda0(29, new ObjectList$$ExternalSyntheticLambda0(textContextMenuBuilderScope, 28), new GraphLoop$processingQueue$1(1, textContextMenuBuilderScope, TextContextMenuBuilderScope.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 4)));
        MutableObjectList mutableObjectList = new MutableObjectList();
        MutableObjectList mutableObjectList2 = textContextMenuBuilderScope.components;
        Object[] objArr = mutableObjectList2.content;
        int i = mutableObjectList2._size;
        int i2 = 0;
        boolean z = true;
        TextContextMenuComponent textContextMenuComponent = null;
        while (true) {
            textContextMenuSeparator = TextContextMenuSeparator.INSTANCE;
            if (i2 >= i) {
                break;
            }
            TextContextMenuComponent textContextMenuComponent2 = (TextContextMenuComponent) objArr[i2];
            if (!z || textContextMenuComponent2 != textContextMenuSeparator) {
                if (textContextMenuComponent2 != textContextMenuSeparator || textContextMenuComponent != textContextMenuSeparator) {
                    if (textContextMenuComponent2 != textContextMenuSeparator) {
                        MutableObjectList mutableObjectList3 = textContextMenuBuilderScope.filters;
                        Object[] objArr2 = mutableObjectList3.content;
                        int i3 = mutableObjectList3._size;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((Function1) objArr2[i4]).invoke(textContextMenuComponent2)).booleanValue()) {
                            }
                        }
                    }
                    mutableObjectList.add(textContextMenuComponent2);
                    z = false;
                    textContextMenuComponent = textContextMenuComponent2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (((TextContextMenuComponent) (mutableObjectList.isEmpty() ? null : mutableObjectList.content[mutableObjectList._size - 1])) == textContextMenuSeparator) {
            mutableObjectList.removeAt(mutableObjectList._size - 1);
        }
        Stack stack = mutableObjectList.list;
        if (stack == null) {
            stack = new Stack(mutableObjectList);
            mutableObjectList.list = stack;
        }
        return new TextContextMenuData(stack);
    }

    public static final Modifier textContextMenuToolbarHandler(Modifier modifier, ToolbarRequesterImpl toolbarRequesterImpl, Function1 function1, TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$3, Function1 function12) {
        return modifier.then(new TextContextMenuToolbarHandlerElement(toolbarRequesterImpl, function1, textFieldSelectionManager$contextMenuAreaModifier$3, function12));
    }

    public static final Rect translateRootToDestination(Rect rect, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        if (!layoutCoordinates.isAttached() || !layoutCoordinates2.isAttached()) {
            return Rect.Zero;
        }
        return DBUtil.m1180Recttz77jQw(layoutCoordinates2.mo839localPositionOfR5De75A(ValueInsets.findRootCoordinates(layoutCoordinates), rect.m636getTopLeftF1C5BW0()), rect.m634getSizeNHjbRc());
    }
}
