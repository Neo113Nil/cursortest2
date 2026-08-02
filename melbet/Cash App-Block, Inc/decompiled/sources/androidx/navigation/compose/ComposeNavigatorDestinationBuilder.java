package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import org.commonmark.node.Node;

/* loaded from: classes3.dex */
public final class ComposeNavigatorDestinationBuilder extends Node {
    public final ComposeNavigator composeNavigator;
    public final ComposableLambdaImpl content;

    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, String str, ComposableLambdaImpl composableLambdaImpl) {
        super(composeNavigator, str);
        this.composeNavigator = composeNavigator;
        this.content = composableLambdaImpl;
    }

    @Override // org.commonmark.node.Node
    public final NavDestination build() {
        return (ComposeNavigator.Destination) super.build();
    }

    @Override // org.commonmark.node.Node
    public final NavDestination instantiateDestination() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }
}
