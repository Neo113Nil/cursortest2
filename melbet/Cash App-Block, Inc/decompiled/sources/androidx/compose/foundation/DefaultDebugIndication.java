package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class DefaultDebugIndication implements IndicationNodeFactory {
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    public final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {
        public final MutableInteractionSourceImpl interactionSource;
        public boolean isFocused;
        public boolean isHovered;
        public boolean isPressed;

        public DefaultDebugIndicationInstance(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
            this.interactionSource = mutableInteractionSourceImpl;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
            layoutNodeDrawScope.drawContent();
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
            if (this.isPressed) {
                DrawScope.m747drawRectnJ9OG0$default(layoutNodeDrawScope, Color.m675copywmQWz5c$default(0.3f, Color.Black, 14), 0L, canvasDrawScope.mo753getSizeNHjbRc(), RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            } else if (this.isHovered || this.isFocused) {
                DrawScope.m747drawRectnJ9OG0$default(layoutNodeDrawScope, Color.m675copywmQWz5c$default(0.1f, Color.Black, 14), 0L, canvasDrawScope.mo753getSizeNHjbRc(), RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            JobKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$onAttach$1(this, (Continuation) null, 16), 3);
        }
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode create(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        return new DefaultDebugIndicationInstance(mutableInteractionSourceImpl);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        return -1;
    }
}
